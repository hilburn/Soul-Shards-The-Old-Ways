package sstow.gameObjs.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import sstow.gameObjs.ObjHandler;

public class Soulium_Block_Item extends ItemBlock {
	
	public Soulium_Block_Item(Block block) {
		super(ObjHandler.SOULIUM_BLOCK);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "tile.sstow.soulium_block";
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}
}
