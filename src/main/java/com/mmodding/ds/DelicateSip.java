package com.mmodding.ds;

import com.mmodding.ds.init.DelicateSipBlocks;
import com.mmodding.library.core.api.AdvancedContainer;
import com.mmodding.library.core.api.ExtendedModInitializer;
import com.mmodding.library.core.api.management.ElementsManager;

import java.util.Set;

public class DelicateSip implements ExtendedModInitializer {

	public static final Set<String> WOOD_SETS = Set.of("acacia", "bamboo", "birch", "cherry", "dark_oak", "mangrove", "oak", "pale_oak", "spruce");

	@Override
	public void setupManager(ElementsManager manager) {
		manager.content(DelicateSipBlocks::register);
	}

	@Override
	public void onInitialize(AdvancedContainer mod) {
		mod.logger().info("Shaping the world with a Delicate Sip of your imagination!");
	}
}
