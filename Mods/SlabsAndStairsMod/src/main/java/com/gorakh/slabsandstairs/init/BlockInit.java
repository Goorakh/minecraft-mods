package com.gorakh.slabsandstairs.init;

import com.gorakh.slabsandstairs.init.blocks.CustomBlockStairs;
import com.gorakh.slabsandstairs.init.blocks.CustomIngotBlock;
import com.gorakh.slabsandstairs.init.blocks.CustomOre;
import com.gorakh.slabsandstairs.init.blocks.slab.granite.BlockGraniteDoubleSlab;
import com.gorakh.slabsandstairs.init.blocks.slab.granite.BlockGraniteHalfSlab;
import com.gorakh.slabsandstairs.init.blocks.slab.granite_polished.BlockGraniteSmoothDoubleSlab;
import com.gorakh.slabsandstairs.init.blocks.slab.granite_polished.BlockGraniteSmoothHalfSlab;
import com.gorakh.slabsandstairs.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block granite_stairs;
	public static BlockGraniteHalfSlab granite_slab_half;
	public static BlockGraniteDoubleSlab granite_slab_double;
	
	public static Block polished_granite_stairs;
	public static BlockGraniteSmoothHalfSlab polished_granite_slab_half;
	public static BlockGraniteSmoothDoubleSlab polished_granite_slab_double;
	
	public static void init()
	{
		granite_stairs = new CustomBlockStairs("granite_stairs", Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE));
		granite_slab_half = new BlockGraniteHalfSlab("granite_slab", Material.ROCK, false, 0, 2, "pickaxe", 0, 0, 0, 30, SoundType.STONE, false);
		granite_slab_double = new BlockGraniteDoubleSlab("granite_slab_double", Material.ROCK, false, 0, 2, "pickaxe", 0, 0, 0, 30, SoundType.STONE, false);
		
		/*polished_granite_stairs = new CustomBlockStairs("polished_granite_stairs", Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH));
		polished_granite_slab_half = new BlockGraniteSmoothHalfSlab("polished_granite_slab", Material.ROCK, false, 0, 2, "pickaxe", 0, 0, 0, 30, SoundType.STONE, false);
		polished_granite_slab_double = new BlockGraniteSmoothDoubleSlab("polished_granite_slab_double", Material.ROCK, false, 0, 2, "pickaxe", 0, 0, 0, 30, SoundType.STONE, false);*/
	}
	
	public static void register()
	{
		registerBlock(granite_stairs);
		registerBlock(granite_slab_half, new ItemSlab(granite_slab_half, granite_slab_half, granite_slab_double));
		ForgeRegistries.BLOCKS.register(granite_slab_double);
		
		/*registerBlock(polished_granite_stairs);
		registerBlock(polished_granite_slab_half, new ItemSlab(polished_granite_slab_half, polished_granite_slab_half, polished_granite_slab_double));
		ForgeRegistries.BLOCKS.register(polished_granite_slab_double);*/
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Main.slabstab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Main.slabstab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
