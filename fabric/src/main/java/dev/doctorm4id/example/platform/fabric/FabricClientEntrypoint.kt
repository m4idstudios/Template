package dev.doctorm4id.example.platform.fabric

//? fabric {

import dev.doctorm4id.example.Example
import net.fabricmc.api.ClientModInitializer

class FabricClientEntrypoint : ClientModInitializer {

	override fun onInitializeClient() {
		Example.onInitializeClient()
	}
}

//? }
