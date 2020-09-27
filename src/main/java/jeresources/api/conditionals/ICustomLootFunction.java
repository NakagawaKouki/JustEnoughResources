package jeresources.api.conditionals;

import jeresources.api.drop.LootDrop;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootFunction;

import java.util.Random;

/**
 * Should be implemented on a {@link }
 * when a table has use that {@link LootFunction}
 * you'll be granted access to the {@link LootDrop}
 * <p>
 * It is advised to add {@link Conditional}s,
 * but you can also change stack sizes or other data.
 */
public interface ICustomLootFunction {
    /**
     * Similar to {@link LootFunction#apply(ItemStack, LootContext)}}
     * but with out all the {@link Random} and {@link LootContext}
     * <p>
     * You only need to implement this if the the {@link LootFunction#apply(ItemStack, LootContext)}
     * can't be called with null random and context or if you want to do a more advanced interaction with the {@link LootDrop}
     *
     * @param drop the {@link LootDrop} to apply the {@link LootFunction} on
     */
    void apply(LootDrop drop);
}
