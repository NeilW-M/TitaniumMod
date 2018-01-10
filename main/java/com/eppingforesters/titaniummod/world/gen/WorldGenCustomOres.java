package com.eppingforesters.titaniummod.world.gen;

import java.util.Random;

import com.eppingforesters.titaniummod.init.BlockInit;
import com.eppingforesters.titaniummod.init.BlockOres;
import com.eppingforesters.titaniummod.util.handlers.EnumHandler;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_end_titanium, ore_end_tungsten, ore_end_osmium, ore_nether_titanium, ore_nether_tungsten, ore_nether_osmium,
	ore_overworld_titanium, ore_overworld_tungsten, ore_overworld_osmium;
	
	public WorldGenCustomOres()
	{
		// titanium
		ore_end_titanium = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TITANIUM), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_nether_titanium = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TITANIUM), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_titanium = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TITANIUM), 9, BlockMatcher.forBlock(Blocks.STONE));
		// tungsten
		ore_end_tungsten = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TUNGSTEN), 3, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_nether_tungsten = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TUNGSTEN), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_tungsten = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TUNGSTEN), 3, BlockMatcher.forBlock(Blocks.STONE));
		// osmium
		ore_end_osmium = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.OSMIUM), 9, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_nether_osmium = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.OSMIUM), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_osmium = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.OSMIUM), 9, BlockMatcher.forBlock(Blocks.STONE));	
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_nether_titanium, world, random, chunkX, chunkZ, 30, 0, 100);
			runGenerator(ore_nether_tungsten, world, random, chunkX, chunkZ, 10, 0, 15);
			runGenerator(ore_nether_osmium, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
		
		case 0:
			
			runGenerator(ore_overworld_titanium, world, random, chunkX, chunkZ, 30, 0, 100);
			runGenerator(ore_overworld_tungsten, world, random, chunkX, chunkZ, 10, 0, 15);
			runGenerator(ore_overworld_osmium, world, random, chunkX, chunkZ, 50, 0, 100);
			
			break;
			
		case 1:
			
			runGenerator(ore_end_titanium, world, random, chunkX, chunkZ, 30, 0, 256);
			runGenerator(ore_end_tungsten, world, random, chunkX, chunkZ, 70, 0, 256);
			runGenerator(ore_end_osmium, world, random, chunkX, chunkZ, 50, 0, 256);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
