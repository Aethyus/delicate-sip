package com.mmodding.ds.init;

import com.mmodding.ds.DelicateSip;
import com.mmodding.library.block.api.wrapper.BlockHeap;
import com.mmodding.library.block.api.wrapper.BlockRelatives;
import com.mmodding.library.core.api.AdvancedContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.DyeColor;

public class DelicateSipBlocks {

	public static final BlockHeap<Block> PARQUETS = BlockHeap.create(Block::new, FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> wood_set + "_parquet").toList()).withItem(new FabricItemSettings());
	public static final BlockHeap<Block> CUT_BLOCK = BlockHeap.create(Block::new, FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> "cut_" + wood_set + "_block").toList()).withItem(new FabricItemSettings());
	public static final BlockHeap<Block> LATTICE = BlockHeap.create(Block::new, FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> wood_set + "_lattice").toList()).withItem(new FabricItemSettings());

	public static final BlockRelatives BLACK_MARBLE = BlockRelatives.createStone(DelicateSip.createId("black_marble"), settings -> settings.mapColor(DyeColor.BLACK), true);
	public static final BlockRelatives WHITE_MARBLE = BlockRelatives.createStone(DelicateSip.createId("white_marble"), settings -> settings.mapColor(DyeColor.WHITE), true);
	public static final BlockRelatives VERDANT_MARBLE = BlockRelatives.createStone(DelicateSip.createId("verdant_marble"), settings -> settings.mapColor(DyeColor.GREEN), true);

	public static void register(AdvancedContainer mod) {
		PARQUETS.register(mod::createId);
		CUT_BLOCK.register(mod::createId);
		LATTICE.register(mod::createId);
		BLACK_MARBLE.register(mod.createId("black_marble"));
		WHITE_MARBLE.register(mod.createId("white_marble"));
		VERDANT_MARBLE.register(mod.createId("verdant_marble"));
	}
}
