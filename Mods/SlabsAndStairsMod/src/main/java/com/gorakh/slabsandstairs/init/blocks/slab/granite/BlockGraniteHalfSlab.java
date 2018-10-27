package com.gorakh.slabsandstairs.init.blocks.slab.granite;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGraniteHalfSlab extends BlockGraniteSlab
{
	public BlockGraniteHalfSlab(String name, Material material, boolean unbreakable, float slip, float hardness, String toolClass, int toolLevel,
			float lightLevel, int lightOpacityLevel, float resistance, SoundType sound, boolean shouldTick)
	{
		super(name, material, unbreakable, slip, hardness, toolClass, toolLevel, lightLevel, lightOpacityLevel, resistance, sound, shouldTick);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
