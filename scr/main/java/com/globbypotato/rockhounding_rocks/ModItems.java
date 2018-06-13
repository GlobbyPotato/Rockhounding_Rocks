package com.globbypotato.rockhounding_rocks;

import com.globbypotato.rockhounding_core.handlers.RegistryHandler;
import com.globbypotato.rockhounding_rocks.enums.EnumCards;
import com.globbypotato.rockhounding_rocks.enums.EnumCuts;
import com.globbypotato.rockhounding_rocks.enums.EnumMiscItems;
import com.globbypotato.rockhounding_rocks.enums.EnumSculpts;
import com.globbypotato.rockhounding_rocks.handler.ModConfig;
import com.globbypotato.rockhounding_rocks.handler.Reference;
import com.globbypotato.rockhounding_rocks.items.CuttingBlade;
import com.globbypotato.rockhounding_rocks.items.DummyHammer;
import com.globbypotato.rockhounding_rocks.items.PatternCards;
import com.globbypotato.rockhounding_rocks.items.PatternItems;
import com.globbypotato.rockhounding_rocks.items.RockFinder;
import com.globbypotato.rockhounding_rocks.items.Sandpaper;
import com.globbypotato.rockhounding_rocks.items.SculptingCards;
import com.globbypotato.rockhounding_rocks.items.io.ArrayIO;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MODID)
public class ModItems {

	public static final Item ROCK_FINDER = new RockFinder("rock_finder");
	public static final Item CUTTING_BLADE = new CuttingBlade("cutting_blade", ModConfig.bladeUses);
	public static final Item DUMMY_HAMMER = new DummyHammer("dummy_hammer", ModConfig.dummyUses);
	public static final Item PATTERN_ITEMS = new PatternItems("pattern_items", EnumCuts.getNames());
	public static final Item SANDPAPER = new Sandpaper("sandpaper", ModConfig.sandpaperUses);
	public static final Item MISC_ITEMS = new ArrayIO("misc_items", EnumMiscItems.getNames());
	public static final Item PATTERN_CARDS = new PatternCards("pattern_cards", EnumCards.getNames());
	public static final Item SCULPTING_CARDS = new SculptingCards("sculpting_cards", EnumSculpts.getNames());

	@Mod.EventBusSubscriber(modid = Reference.MODID)
	public static class RegistrationHandler {

		// register the item
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			final IForgeRegistry<Item> registry = event.getRegistry();
			registry.register(ROCK_FINDER);
			registry.register(SANDPAPER);
			registry.register(CUTTING_BLADE);
			registry.register(DUMMY_HAMMER);
			registry.register(PATTERN_ITEMS);
			registry.register(PATTERN_CARDS);
			registry.register(SCULPTING_CARDS);
			registry.register(MISC_ITEMS);
		}

		// register the model
		/**
		 * @param event  
		 */
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event){
			RegistryHandler.registerSingleModel(ROCK_FINDER);
			RegistryHandler.registerSingleModel(SANDPAPER);
			RegistryHandler.registerSingleModel(CUTTING_BLADE);
			RegistryHandler.registerSingleModel(DUMMY_HAMMER);
			RegistryHandler.registerMetaModel(PATTERN_ITEMS, EnumCuts.getNames());
			RegistryHandler.registerMetaModel(PATTERN_CARDS, EnumCards.getNames());
			RegistryHandler.registerMetaModel(SCULPTING_CARDS, EnumSculpts.getNames());
			RegistryHandler.registerMetaModel(MISC_ITEMS, EnumMiscItems.getNames());
		}

	}

}