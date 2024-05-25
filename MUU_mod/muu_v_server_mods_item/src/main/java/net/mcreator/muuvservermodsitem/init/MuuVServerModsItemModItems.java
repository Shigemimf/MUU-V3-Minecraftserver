
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muuvservermodsitem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.muuvservermodsitem.item.HisuisSwordItem;
import net.mcreator.muuvservermodsitem.item.HisuisShovelItem;
import net.mcreator.muuvservermodsitem.item.HisuisPickaxeItem;
import net.mcreator.muuvservermodsitem.item.HisuisItem;
import net.mcreator.muuvservermodsitem.item.HisuisHoeItem;
import net.mcreator.muuvservermodsitem.item.HisuisAxeItem;
import net.mcreator.muuvservermodsitem.item.HisuisArmorItem;
import net.mcreator.muuvservermodsitem.item.HisuihelmetItem;
import net.mcreator.muuvservermodsitem.item.HisuiItem;
import net.mcreator.muuvservermodsitem.MuuVServerModsItemMod;

public class MuuVServerModsItemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MuuVServerModsItemMod.MODID);
	public static final RegistryObject<Item> HISUI = REGISTRY.register("hisui", () -> new HisuiItem());
	public static final RegistryObject<Item> HISUIHELMET_HELMET = REGISTRY.register("hisuihelmet_helmet", () -> new HisuihelmetItem.Helmet());
	public static final RegistryObject<Item> HISUIHELMET_CHESTPLATE = REGISTRY.register("hisuihelmet_chestplate", () -> new HisuihelmetItem.Chestplate());
	public static final RegistryObject<Item> HISUIHELMET_LEGGINGS = REGISTRY.register("hisuihelmet_leggings", () -> new HisuihelmetItem.Leggings());
	public static final RegistryObject<Item> HISUIHELMET_BOOTS = REGISTRY.register("hisuihelmet_boots", () -> new HisuihelmetItem.Boots());
	public static final RegistryObject<Item> HISUIS = REGISTRY.register("hisuis", () -> new HisuisItem());
	public static final RegistryObject<Item> HISUIS_ORE = block(MuuVServerModsItemModBlocks.HISUIS_ORE);
	public static final RegistryObject<Item> HISUIS_BLOCK = block(MuuVServerModsItemModBlocks.HISUIS_BLOCK);
	public static final RegistryObject<Item> HISUIS_PICKAXE = REGISTRY.register("hisuis_pickaxe", () -> new HisuisPickaxeItem());
	public static final RegistryObject<Item> HISUIS_AXE = REGISTRY.register("hisuis_axe", () -> new HisuisAxeItem());
	public static final RegistryObject<Item> HISUIS_SWORD = REGISTRY.register("hisuis_sword", () -> new HisuisSwordItem());
	public static final RegistryObject<Item> HISUIS_SHOVEL = REGISTRY.register("hisuis_shovel", () -> new HisuisShovelItem());
	public static final RegistryObject<Item> HISUIS_HOE = REGISTRY.register("hisuis_hoe", () -> new HisuisHoeItem());
	public static final RegistryObject<Item> HISUIS_ARMOR_HELMET = REGISTRY.register("hisuis_armor_helmet", () -> new HisuisArmorItem.Helmet());
	public static final RegistryObject<Item> HISUIS_ARMOR_CHESTPLATE = REGISTRY.register("hisuis_armor_chestplate", () -> new HisuisArmorItem.Chestplate());
	public static final RegistryObject<Item> HISUIS_ARMOR_LEGGINGS = REGISTRY.register("hisuis_armor_leggings", () -> new HisuisArmorItem.Leggings());
	public static final RegistryObject<Item> HISUIS_ARMOR_BOOTS = REGISTRY.register("hisuis_armor_boots", () -> new HisuisArmorItem.Boots());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
