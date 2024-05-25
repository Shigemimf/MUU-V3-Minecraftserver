
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muuvservermodsitem.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.muuvservermodsitem.MuuVServerModsItemMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MuuVServerModsItemModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MuuVServerModsItemMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MuuVServerModsItemModBlocks.HISUIS_ORE.get().asItem());
			tabData.accept(MuuVServerModsItemModBlocks.HISUIS_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MuuVServerModsItemModItems.HISUIHELMET_HELMET.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIHELMET_CHESTPLATE.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIHELMET_LEGGINGS.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIHELMET_BOOTS.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_SWORD.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_ARMOR_HELMET.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_ARMOR_CHESTPLATE.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_ARMOR_LEGGINGS.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MuuVServerModsItemModItems.HISUIS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MuuVServerModsItemModItems.HISUIS_PICKAXE.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_AXE.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_SHOVEL.get());
			tabData.accept(MuuVServerModsItemModItems.HISUIS_HOE.get());
		}
	}
}
