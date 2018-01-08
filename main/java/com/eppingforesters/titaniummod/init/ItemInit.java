package com.eppingforesters.titaniummod.init;

import java.util.ArrayList;
import java.util.List;

import com.eppingforesters.titaniummod.objects.armour.ArmourBase;
import com.eppingforesters.titaniummod.objects.items.ItemBase;
import com.eppingforesters.titaniummod.objects.tools.ToolAxe;
import com.eppingforesters.titaniummod.objects.tools.ToolHoe;
import com.eppingforesters.titaniummod.objects.tools.ToolPickaxe;
import com.eppingforesters.titaniummod.objects.tools.ToolShovel;
import com.eppingforesters.titaniummod.objects.tools.ToolSword;
import com.eppingforesters.titaniummod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_TITANIUM = EnumHelper.addToolMaterial("tool_titanium", 4, 1950, 10.0F, 3.5F, 10);
	public static final ArmorMaterial ARMOUR_TITANIUM = EnumHelper.addArmorMaterial("armour_titanium", Reference.MODID + ":titanium", 37, new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//Items
	public static final Item INGOT_TITANIUM = new ItemBase("ingot_titanium");
	
	//Tools
	public static final Item AXE_TITANIUM = new ToolAxe("axe_titanium", TOOL_TITANIUM);
	public static final Item HOE_TITANIUM = new ToolHoe("hoe_titanium", TOOL_TITANIUM);
	public static final Item PICKAXE_TITANIUM = new ToolPickaxe("pickaxe_titanium", TOOL_TITANIUM);
	public static final Item SHOVEL_TITANIUM = new ToolShovel("shovel_titanium", TOOL_TITANIUM);
	public static final Item SWORD_TITANIUM = new ToolSword("sword_titanium", TOOL_TITANIUM);
	
	//Armour
	public static final Item HELMET_TITANIUM = new ArmourBase("helmet_titanium", ARMOUR_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_TITANIUM = new ArmourBase("chestplate_titanium", ARMOUR_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_TITANIUM = new ArmourBase("leggings_titanium", ARMOUR_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_TITANIUM = new ArmourBase("boots_titanium", ARMOUR_TITANIUM, 1, EntityEquipmentSlot.FEET);
	
}
