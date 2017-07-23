package com.globbypotato.rockhounding_rocks.world;

import java.util.Random;

import com.globbypotato.rockhounding_rocks.ModBlocks;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RocksGenerator implements IWorldGenerator {
	public static int TOTAL_ROCKS = 112;
	public static int TOTAL_ENUMS = 7;

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

	Block[] ROCK_LIST = new Block[] {ModBlocks.rocksA, ModBlocks.rocksB, ModBlocks.rocksC, ModBlocks.rocksD, ModBlocks.rocksE, ModBlocks.rocksF, ModBlocks.rocksG};

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.getDimension() == 0) {
			if(!isFlat(world)){
				generateOverworld(world, random, new BlockPos(chunkX * 16, 64, chunkZ * 16));
			}
		}else{
			for(int X = 0; X < ModConfig.dimensions.length; X++ ){
				if(world.provider.getDimension() == ModConfig.dimensions[X]){
					generateCustom(world, random, new BlockPos(chunkX * 16, 64, chunkZ * 16));
				}
			}
		}
	}

	private boolean isFlat(World world) {
		return world.getWorldInfo().getTerrainType() == WorldType.FLAT;
	}

	private void generateCustom(World world, Random random, BlockPos pos) {
		for(int e = 0; e < TOTAL_ENUMS; e++){
			for(int x = 0; x < 16; x++){
				int ROCK = x + (e * 16);
				if(calculateFrequency(ROCKS_FREQUENCY[ROCK]) > 0){
					if(random.nextInt(100) + 1 <= CLOUDS_CHANCE){
						addNewRock(ROCK_LIST[e], x,  world, random, pos, calculateMinSize(ROCKS_MIN_SIZE[ROCK]), calculateMaxSize(ROCKS_MAX_SIZE[ROCK]), calculateFrequency(ROCKS_FREQUENCY[ROCK]), 15, 250, Blocks.STONE);
					}
				}
			}
		}
	}

	private void generateOverworld(World world, Random random, BlockPos pos) {
		Biome biome = world.getBiome(pos);
		for(int e = 0; e < TOTAL_ENUMS; e++){
			for(int x = 0; x < 16; x++){
				int ROCK = x + (e * 16);
				if(isBiome(biome, ROCKS_BIOME[ROCK])){
					if(calculateFrequency(ROCKS_FREQUENCY[ROCK]) > 0){
						if(random.nextInt(100) + 1 <= CLOUDS_CHANCE){
							addNewRock(ROCK_LIST[e], x,  world, random, pos, calculateMinSize(ROCKS_MIN_SIZE[ROCK]), calculateMaxSize(ROCKS_MAX_SIZE[ROCK]), calculateFrequency(ROCKS_FREQUENCY[ROCK]), ROCKS_MIN_VEIN[ROCK], ROCKS_MAX_VEIN[ROCK], getBlockReplaced(ROCK_LIST[e], x));
						}
					}
				}
			}
		}
	}

	private boolean isBiome(Biome biome, String type) {
		return !BIOMES_ENABLER ? true : BiomeDictionary.isBiomeOfType(biome, Type.valueOf(type.toUpperCase()));
	}

	private Block getBlockReplaced(Block rock, int x) {
		if(isDirtSpawn(rock, x)){
			return Blocks.DIRT;
		}else if(isSandstoneSpawn(rock, x)){
			return Blocks.SANDSTONE;
		}else if(isGravelSpawn(rock, x)){
			return Blocks.GRAVEL;
		}else{
			return Blocks.STONE;
		}
	}
			private boolean isDirtSpawn(Block rock, int x) {return isLaterite(rock, x) || isJet(rock, x);}
			private boolean isSandstoneSpawn(Block rock, int x) {return isArkose(rock, x) || isRosered(rock, x);}
			private boolean isGravelSpawn(Block rock, int x) {return isGlauconite(rock, x);}
			private boolean isJet(Block rock, int x) {return rock == ModBlocks.rocksA && x == 3;}
			private boolean isLaterite(Block rock, int x) {return rock == ModBlocks.rocksB && x == 7;}
			private boolean isArkose(Block rock, int x) {return rock == ModBlocks.rocksB && x == 14;}
			private boolean isRosered(Block rock, int x) {return rock == ModBlocks.rocksF && x == 3;}
			private boolean isGlauconite(Block rock, int x) {return rock == ModBlocks.rocksD && x == 12;}

	private int calculateFrequency(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_FREQUENCY : specific;
	}

	private int calculateMinSize(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_MIN_SIZE : specific;
	}

	private int calculateMaxSize(int specific) {
		return CLOUDS_ENABLER ? CLOUDS_MAX_SIZE : specific;
	}

	private void addNewRock(Block block, int metadata, World world, Random random, BlockPos pos, int minVeinSize, int maxVeinSize, int chanceToSpawn, int minY, int maxY, Block generateIn) {
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