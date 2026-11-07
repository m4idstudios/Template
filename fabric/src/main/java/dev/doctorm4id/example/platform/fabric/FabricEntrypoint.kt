package dev.doctorm4id.example.platform.fabric

//? fabric {

import dev.doctorm4id.example.Example
import net.fabricmc.api.ModInitializer

class FabricEntrypoint : ModInitializer {

	override fun onInitialize() {
		Example.onInitialize()
		FabricEventSubscriber().registerEvents()
	}
}

//? }
