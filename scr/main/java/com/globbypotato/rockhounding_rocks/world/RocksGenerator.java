package com.globbypotato.rockhounding_rocks.world;

import java.util.Random;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRockList;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksA;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksB;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksD;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksF;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksG;
import com.globbypotato.rockhounding_rocks.enums.rocks.EnumRocksH;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RocksGenerator implements IWorldGenerator {
	public static int TOTAL_ROCKS = EnumRockList.size();

	public static boolean GENERAL_ENABLER;
	public static boolean CLOUDS_ENABLER;
	public static boolean BIOMES_ENABLER;
	public static int CLOUDS_CHANCE; 
	public static int CLOUDS_FREQUENCY; 
	public static int CLOUDS_MIN_SIZE; 
	public static int CLOUDS_MAX_SIZE; 
	
	public static int[] 	ROCKS_FREQUENCY = new int[TOTAL_ROCKS];
	public static String[] 	ROCKS_BIOME = new String[TOTAL_ROCKS];
	public static int[] 	ROCKS_MIN_SIZE = new int[TOTAL_ROCKS];
	public static int[] 	ROCKS_MAX_SIZE = new int[TOTAL_ROCKS];
	public static int[] 	ROCKS_MIN_VEIN = new int[TOTAL_ROCKS];
	public static int[] 	ROCKS_MAX_VEIN = new int[TOTAL_ROCKS];

//	public static int TOTAL_ENUMS = 8;
	Block[] ROCK_LIST = new Block[] {ModBlocks.ROCKS_A, ModBlocks.ROCKS_B, ModBlocks.ROCKS_C, ModBlocks.ROCKS_D, ModBlocks.ROCKS_E, ModBlocks.ROCKS_F, ModBlocks.ROCKS_G, ModBlocks.ROCKS_H};

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() >= -1 && world.provider.getDimension() <= 1) {
			if(!isFlat(world)){
				if(RocksGenerator.GENERAL_ENABLER){
					generateOverworld(world, random, new BlockPos(chunkX * 16, 64, chunkZ * 16));
				}
			}
		}else{
			for(int X = 0; X < ModConfig.dimensions.length; X++ ){
				if(world.provider.getDimension() == ModConfig.dimensions[X]){
					generateCustom(world, random, new BlockPos(chunkX * 16, 64, chunkZ * 16));
				}
			}
		}
	}

	private static boolean isFlat(World world) {
		return world.getWorldInfo().getTerrainType() == WorldType.FLAT;
	}

	private void generateCustom(World world, Random random, BlockPos pos) {
		int TOTAL_ENUMS = ROCK_LIST.length;
		for(int e = 0; e < TOTAL_ENUMS; e++){
			for(int x = 0; x < 16; x++){
				int ROCK = x + (e * 16);
				if(calculateFrequency(ROCKS_FREQUENCY[ROCK]) > 0){
					if(random.nextInt(100) + 1 <= CLOUDS_CHANCE){
						addNewRock(this.ROCK_LIST[e], x,  world, random, pos, calculateMinSize(ROCKS_MIN_SIZE[ROCK]), calculateMaxSize(ROCKS_MAX_SIZE[ROCK]), calculateFrequency(ROCKS_FREQUENCY[ROCK]), 15, 250, Blocks.STONE);
					}
				}
			}
		}
	}

	private void generateOverworld(World world, Random random, BlockPos pos) {
		Biome biome = world.getBiome(pos);
		int TOTAL_ENUMS = ROCK_LIST.length;
		for(int e = 0; e < TOTAL_ENUMS; e++){
			for(int x = 0; x < 16; x++){
				int ROCK = x + (e * 16);
				if(world.provider.getDimension() == 0){
					if(isBiome(biome, ROCKS_BIOME[ROCK])){
						handleGeneration(world, biome, pos, x, e, ROCK, random);
					}
				}else if(world.provider.getDimension() == -1){
					if(isHell(biome, ROCKS_BIOME[ROCK])){
						handleGeneration(world, biome, pos, x, e, ROCK, random);
					}
				}else if(world.provider.getDimension() == 1){
					if(isEnd(biome, ROCKS_BIOME[ROCK])){
						handleGeneration(world, biome, pos, x, e, ROCK, random);
					}
				}
			}
		}
	}

	private void handleGeneration(World world, Biome biome, BlockPos pos, int x, int e, int ROCK, Random random) {
		if(calculateFrequency(ROCKS_FREQUENCY[ROCK]) > 0){
			if(random.nextInt(100) + 1 <= CLOUDS_CHANCE){
				addNewRock(this.ROCK_LIST[e], x,  world, random, pos, calculateMinSize(ROCKS_MIN_SIZE[ROCK]), calculateMaxSize(ROCKS_MAX_SIZE[ROCK]), calculateFrequency(ROCKS_FREQUENCY[ROCK]), ROCKS_MIN_VEIN[ROCK], ROCKS_MAX_VEIN[ROCK], getBlockReplaced(world, biome, this.ROCK_LIST[e], x));
			}
		}
	}

	private static boolean isBiome(Biome biome, String type) {
		return !BIOMES_ENABLER ? true : BiomeDictionary.hasType(biome, Type.getType(type.toUpperCase()));
	}

	private static boolean isBiomeType(Biome biome, Type type) {
		return BiomeDictionary.hasType(biome, type);
	}

	private static Block getBlockReplaced(World world, Biome biome, Block rock, int x) {
		if(isDirtSpawn(rock, x)){
			return Blocks.DIRT;
		}else if(isSandstoneSpawn(rock, x)){
			return Blocks.SANDSTONE;
		}else if(isSandSpawn(rock, x)){
			return Blocks.SAND;
		}else if(isGravelSpawn(rock, x)){
			return Blocks.GRAVEL;
		}else if(world.provider.getDimension() == -1){
			return Blocks.NETHERRACK;
		}else if(world.provider.getDimension() == 1){
			return Blocks.END_STONE;
		}else{
			return Blocks.STONE;
		}
	}

	private static boolean isHell(Biome biome, String type) {
		return isBiomeType(biome, Type.NETHER) && Type.getType(type.toUpperCase()) == Type.NETHER;
	}

	private static boolean isEnd(Biome biome, String type) {
		return isBiomeType(biome, Type.END) && Type.getType(type.toUpperCase()) == Type.END;
	}

			private static boolean isDirtSpawn(Block rock, int x) {return isLaterite(rock, x) || isJet(rock, x) || isAmmolite(rock, x);}
			private static boolean isSandSpawn(Block rock, int x) {return isDiatomite(rock, x);}
			private static boolean isSandstoneSpawn(Block rock, int x) {return isArkose(rock, x) || isRosered(rock, x);}
			private static boolean isGravelSpawn(Block rock, int x) {return isGlauconite(rock, x) || isOolite(rock, x);}
			private static boolean isDiatomite(Block rock, int x) {return rock == ModBlocks.ROCKS_G && x == EnumRocksG.DIATOMITE.ordinal();}
			private static boolean isJet(Block rock, int x) {return rock == ModBlocks.ROCKS_A && x == EnumRocksA.JET.ordinal();}
			private static boolean isLaterite(Block rock, int x) {return rock == ModBlocks.ROCKS_B && x == EnumRocksB.LATERITE.ordinal();}
			private static boolean isArkose(Block rock, int x) {return rock == ModBlocks.ROCKS_B && x == EnumRocksB.ARKOSE.ordinal();}
			private static boolean isRosered(Block rock, int x) {return rock == ModBlocks.ROCKS_F && x == EnumRocksF.ROSE_RED.ordinal();}
			private static boolean isGlauconite(Block rock, int x) {return rock == ModBlocks.ROCKS_D && x == EnumRocksD.GLAUCONITE.ordinal();}
			private static boolean isAmmolite(Block rock, int x) {return rock == ModBlocks.ROCKS_H && x == EnumRocksH.AMMOLITE.ordinal();}
			private static boolean isOolite(Block rock, int x) {return rock == ModBlocks.ROCKS_H && x == EnumRocksH.OOLITE.ordinal();}

	private static int calculateFrequency(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_FREQUENCY : specific;
	}

	private static int calculateMinSize(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_MIN_SIZE : specific;
	}

	private static int calculateMaxSize(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_MAX_SIZE : specific;
	}

	private static void addNewRock(Block block, int metadata, World world, Random random, BlockPos pos, int minVeinSize, int maxVeinSize, int chanceToSpawn, int minY, int maxY, Block generateIn) {
		if (minY < 0 || maxY > 256 || minY > maxY) throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		int oreVeinSize = minVeinSize + random.nextInt(1 + (maxVeinSize - minVeinSize));
		for (int i = 0; i < chanceToSpawn; i++) {
			int x = pos.getX() + random.nextInt(16);
			int y = minY + random.nextInt(1 + (maxY - minY));
			int z = pos.getZ() + random.nextInt(16);
			BlockPos blockpos = new BlockPos(x, y, z);
            IBlockState state = block.getStateFromMeta(metadata);
			WorldGenMinable mine = new WorldGenMinable(state, oreVeinSize, BlockMatcher.forBlock(generateIn));
			mine.generate(world, random, blockpos);
		}
	}

}