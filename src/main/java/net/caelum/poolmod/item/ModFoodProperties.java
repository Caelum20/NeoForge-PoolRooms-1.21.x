package net.caelum.poolmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties POOLFISH = new FoodProperties.Builder().nutrition(20).saturationModifier(20f)
            .effect(() -> new MobEffectInstance(MobEffects.CONDUIT_POWER, 4000), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f)
            .build();

    public static final FoodProperties LIMINALGAE = new FoodProperties.Builder().nutrition(2).saturationModifier(.25f)
            .build();
}