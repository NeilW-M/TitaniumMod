package com.eppingforesters.titaniummod.util.handlers;

import com.eppingforesters.titaniummod.init.BlockInit;
import com.eppingforesters.titaniummod.init.BlockOres;
import com.eppingforesters.titaniummod.init.ItemInit;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	
	public static void registerCrafting()
	{
		
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, EnumHandler.EnumType.TITANIUM.getMeta()), new ItemStack(ItemInit.INGOT_TITANIUM), 10);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_NETHER, 1, EnumHandler.EnumType.TITANIUM.getMeta()), new ItemStack(ItemInit.INGOT_TITANIUM), 10);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_END, 1, EnumHandler.EnumType.TITANIUM.getMeta()), new ItemStack(ItemInit.INGOT_TITANIUM), 10);
		//GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD, new ItemStack(ItemInit.INGOT_OSMIUM), 10);
	}

}
