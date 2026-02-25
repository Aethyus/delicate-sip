package com.mmodding.ds;

import com.mmodding.ds.init.DelicateSipBlocks;
import com.mmodding.library.core.api.AdvancedContainer;
import com.mmodding.library.datagen.api.ExtendedDataGeneratorEntrypoint;
import com.mmodding.library.datagen.api.lang.DefaultLangProcessors;
import com.mmodding.library.datagen.api.management.DataManager;
import com.mmodding.library.datagen.api.management.handler.DefaultContentTypes;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;

public class DelicateSipDataGenerator implements ExtendedDataGeneratorEntrypoint {

	@Override
	public void setupManager(DataManager manager) {
		manager.data(DelicateSipBlocks.class, Block.class, DefaultContentTypes.getTranslationHandler(RegistryKeys.BLOCK), DefaultLangProcessors.getClassic());
	}

	@Override
	public void onInitializeDataGenerator(AdvancedContainer advancedContainer, FabricDataGenerator fabricDataGenerator) {}
}
