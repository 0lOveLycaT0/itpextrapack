package com.itproject.lovelycat.itpextrapack.client;

import com.itproject.lovelycat.itpextrapack.block.BlockLoader;
import com.itproject.lovelycat.itpextrapack.item.ItemLoader;

public class ItemRenderLoader {
	public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}
