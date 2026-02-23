package com.mmodding.ds;

import com.mmodding.library.core.api.AdvancedContainer;
import com.mmodding.library.core.api.ExtendedModInitializer;
import com.mmodding.library.core.api.management.ElementsManager;

public class DelicateSip implements ExtendedModInitializer {

	@Override
	public void setupManager(ElementsManager.Builder builder) {}

	@Override
	public void onInitialize(AdvancedContainer mod) {
		mod.logger().info("Shaping the world with a Delicate Sip of your imagination!");
	}
}
