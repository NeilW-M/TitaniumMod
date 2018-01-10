package com.eppingforesters.titaniummod.init;

import java.util.ArrayList;
import java.util.List;

import com.eppingforesters.titaniummod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCK_TITANIUM = new BlockBase("block_titanium", Material.IRON);
	public static final Block BLOCK_TUNGSTEN = new BlockBase("block_tungsten", Material.IRON);
	public static final Block BLOCK_OSMIUM = new BlockBase("block_osmium", Material.IRON);
	
	public static final Block ORE_END = new BlockOres("ore_end", "end", 2.0F, 4);
	public static final Block ORE_OVERWORLD = new BlockOres("ore_end", "end", 2.0F, 4);
	public static final Block ORE_NETHER = new BlockOres("ore_end", "end", 2.0F, 4);
	
	public static Block oreEnd(String oreName) {
		int miningLevel = 0;
		
		switch (oreName) {
			case "titanium":
				miningLevel = 3;
				break;
			case "tungsten":
				miningLevel = 4;
				break;
			case "osmium":
				miningLevel = 2;
				break;
			default: 
				miningLevel = 1;
		}
		
		final Block ORE_END = new BlockOres("ore_end", "end", 2.0F, miningLevel);
		return ORE_END;
	}
	
	public static Block oreOverworld(String oreName) {
		int miningLevel = 0;
		switch (oreName) {
			case "titanium":
				miningLevel = 3;
				break;
			case "tungsten":
				miningLevel = 4;
				break;
			case "osmium":
				miningLevel = 2;
				break;
			default: 
				miningLevel = 1;
		}
		final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld", 2.0F, miningLevel);
		return ORE_OVERWORLD;
	}
	
	public static Block oreNether(String oreName) {
		int miningLevel = 0;
		switch (oreName) {
			case "titanium":
				miningLevel = 3;
				break;
			case "tungsten":
				miningLevel = 4;
				break;
			case "osmium":
				miningLevel = 2;
				break;
			default: 
				miningLevel = 1;
		}
		final Block ORE_NETHER = new BlockOres("ore_nether", "nether", 2.0F, miningLevel);
		return ORE_NETHER;
	}
	

//	public static final Block TUNGSTEN_END = new BlockOres("tungsten_end", "end");
//	public static final Block TUNGSTEN_OVERWORLD = new BlockOres("tungsten_overworld", "overworld");
//	public static final Block TUNGSTEN_NETHER = new BlockOres("tungsten_nether", "nether");
//		
//	public static final Block OSMIUM_END = new BlockOres("osmium_end", "end");
//	public static final Block OSMIUM_OVERWORLD = new BlockOres("osmium_overworld", "overworld");
//	public static final Block OSMIUM_NETHER = new BlockOres("osmium_nether", "nether");
	
}
