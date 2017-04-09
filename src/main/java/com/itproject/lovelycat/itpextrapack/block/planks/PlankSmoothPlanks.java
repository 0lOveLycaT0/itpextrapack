package com.itproject.lovelycat.itpextrapack.block.planks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PlankSmoothPlanks extends Block
{
	public PlankSmoothPlanks()
	{
		super(Material.wood);
        this.setHardness(1.0F);
        this.setStepSound(soundTypeWood);
		this.setUnlocalizedName("smoothplanks");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, PlankSmoothPlanks.EnumType.OAK));
	}
}
