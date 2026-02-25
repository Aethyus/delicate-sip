package com.mmodding.ds.init;

import com.mmodding.ds.DelicateSip;
import com.mmodding.library.block.api.BlockWithItem;
import com.mmodding.library.block.api.util.BlockHeap;
import com.mmodding.library.core.api.AdvancedContainer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class DelicateSipBlocks {

	public static final BlockHeap<Block> PARQUETS = BlockHeap.create(settings -> new Block(settings).withItem(new FabricItemSettings()), FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> wood_set + "_parquet").toList());
	public static final BlockHeap<Block> CUT_BLOCK = BlockHeap.create(settings -> new Block(settings).withItem(new FabricItemSettings()), FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> "cut_" + wood_set + "_block").toList());
	public static final BlockHeap<Block> LATTICE = BlockHeap.create(settings -> new Block(settings).withItem(new FabricItemSettings()), FabricBlockSettings.copyOf(Blocks.OAK_WOOD), DelicateSip.WOOD_SETS.stream().map(wood_set -> wood_set + "_lattice").toList());

	public static final Block BLACK_MARBLE = new Block(FabricBlockSettings.copyOf(Blocks.STONE)).withItem(new FabricItemSettings());

	public static void register(AdvancedContainer mod) {
		PARQUETS.register(mod::createId);
		CUT_BLOCK.register(mod::createId);
		LATTICE.register(mod::createId);
		PARQUETS.forEach(block -> Registry.register(Registries.ITEM, Registries.BLOCK.getId(block), BlockWithItem.getItem(block)));
		CUT_BLOCK.forEach(block -> Registry.register(Registries.ITEM, Registries.BLOCK.getId(block), BlockWithItem.getItem(block)));
		LATTICE.forEach(block -> Registry.register(Registries.ITEM, Registries.BLOCK.getId(block), BlockWithItem.getItem(block)));
		mod.register(Registries.BLOCK, "black_marble", BLACK_MARBLE);
		mod.register(Registries.ITEM, "black_marble", BlockWithItem.getItem(BLACK_MARBLE));
	}
}
