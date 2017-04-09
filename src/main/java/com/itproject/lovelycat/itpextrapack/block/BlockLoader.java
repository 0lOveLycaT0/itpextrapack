package com.itproject.lovelycat.itpextrapack.block;

import com.itproject.lovelycat.itpextrapack.block.planks.PlankSmoothPlanks;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block smoothPlanks = new PlankSmoothPlanks();

    public BlockLoader(FMLPreInitializationEvent event)
    {
        register(smoothPlanks, "smooth_planks");
    }
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(smoothPlanks);
    }
    

    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
    
    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        String name = GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}
