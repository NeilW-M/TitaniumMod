package com.eppingforesters.titaniummod;

import com.eppingforesters.titaniummod.proxy.CommonProxy;
import com.eppingforesters.titaniummod.tabs.TitaniumTab;
import com.eppingforesters.titaniummod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static final CreativeTabs TITANIUM_TAB = new TitaniumTab("titaniumtab");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
}
