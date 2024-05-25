
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muuvservermodsitem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.muuvservermodsitem.block.HisuisOreBlock;
import net.mcreator.muuvservermodsitem.block.HisuisBlockBlock;
import net.mcreator.muuvservermodsitem.MuuVServerModsItemMod;

public class MuuVServerModsItemModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MuuVServerModsItemMod.MODID);
	public static final RegistryObject<Block> HISUIS_ORE = REGISTRY.register("hisuis_ore", () -> new HisuisOreBlock());
	public static final RegistryObject<Block> HISUIS_BLOCK = REGISTRY.register("hisuis_block", () -> new HisuisBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
