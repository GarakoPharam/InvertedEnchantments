package plus.misterplus.ivrench.common.enchantment;

import net.minecraft.enchantment.*;
import net.minecraft.inventory.EquipmentSlotType;

public class NoPiercingEnchantment extends InvertedEnchantmentBase {

    public NoPiercingEnchantment(Rarity rarityIn, EquipmentSlotType[] slots) {
        super(rarityIn, EnchantmentType.CROSSBOW, slots);
    }

    /**
     * Returns the minimal value of enchantability needed on the enchantment level passed.
     */
    public int getMinEnchantability(int enchantmentLevel) {
        return 1 + enchantmentLevel * 10;
    }

    /**
     * Returns the maximum value of enchantability nedded on the enchantment level passed.
     */
    public int getMaxEnchantability(int enchantmentLevel) {
        return 50;
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    public int getMaxLevel() {
        return 4;
    }

    public boolean canApplyTogether(Enchantment ench) {
        return !(ench instanceof PiercingEnchantment || ench instanceof MultishotEnchantment  || ench instanceof UnishotEnchantment ) && super.canApplyTogether(ench);
    }
}
