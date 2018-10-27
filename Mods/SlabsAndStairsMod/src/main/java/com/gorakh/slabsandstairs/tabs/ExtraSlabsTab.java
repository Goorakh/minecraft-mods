package com.gorakh.slabsandstairs.tabs;

import com.gorakh.slabsandstairs.init.BlockInit;
import com.gorakh.slabsandstairs.init.blocks.slab.granite.BlockGraniteSlab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExtraSlabsTab extends CreativeTabs
{
	public ExtraSlabsTab(String label) { super("slabstab"); 
	this.setBackgroundImageName("tutorial.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(BlockInit.granite_slab_half);}
}
