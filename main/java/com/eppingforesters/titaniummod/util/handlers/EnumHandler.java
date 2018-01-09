package com.eppingforesters.titaniummod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler 
{
	public static enum EnumType implements IStringSerializable
	{
		TITANIUM(0, "titanium"),
		TUNGSTEN(1, "tungsten"),
		OSMIUM(2, "osmium");
		
		
		private static final EnumType[] META_LOOKUP = new EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name)
		{
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName)
		{
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() 
		{
			return this.name;
		}
		
		public int getMeta() 
		{
			return this.meta;
		}
		
		public String getUnlocalizedName() 
		{
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() 
		{
			return this.name;
		}
		
		public static EnumType byMetaData(int meta)
		{
			return META_LOOKUP[meta];
		}
		
		static
		{
			for(EnumType enumtype : values())
			{
				META_LOOKUP[enumtype.getMeta()] = enumtype;
			}
		}
	}
}

