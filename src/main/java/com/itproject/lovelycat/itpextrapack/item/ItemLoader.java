package com.itproject.lovelycat.itpextrapack.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	//public static Item goldenEgg = new ItemGoldenEgg();
	
	public ItemLoader(FMLPreInitializationEvent event)
    {
        
    }
	
	@SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
		
    }

    private static void register(Item item, String name)
    {
        
    }
	
	@SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}
