package com.gorakh.slabsandstairs.init.blocks;

public class CustomOre extends CustomBlock 
{
	public CustomOre(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}

}
