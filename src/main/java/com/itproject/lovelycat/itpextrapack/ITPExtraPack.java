package com.itproject.lovelycat.itpextrapack;

import com.itproject.lovelycat.itpextrapack.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/* ITP Extra Pack  */
/* Author lOveLycaT_ */
/* Copyright © 2017 IT-Project ZOO All rights reserved. */
/* Copyright © 2017 RADITECH All rights reserved. */

@Mod(modid = ITPExtraPack.MODID, name = ITPExtraPack.NAME, version = ITPExtraPack.VERSION, acceptedMinecraftVersions = "1.8.9")
public class ITPExtraPack {
	public static final String MODID = "itpextrapack";
    public static final String NAME = "ITP Extra Pack";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide = "com.itproject.lovelycat.itpextrapack.client.ClientProxy", 
            serverSide = "com.itproject.lovelycat.itpextrapack.common.CommonProxy")
    public static CommonProxy proxy;
    
    @Instance(ITPExtraPack.MODID)
    public static ITPExtraPack instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
