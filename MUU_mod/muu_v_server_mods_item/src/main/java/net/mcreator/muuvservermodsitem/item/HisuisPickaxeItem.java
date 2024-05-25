
package net.mcreator.muuvservermodsitem.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.muuvservermodsitem.init.MuuVServerModsItemModItems;

public class HisuisPickaxeItem extends PickaxeItem {
	public HisuisPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MuuVServerModsItemModItems.HISUIS.get()));
			}
		}, 1, -1f, new Item.Properties());
	}
}
