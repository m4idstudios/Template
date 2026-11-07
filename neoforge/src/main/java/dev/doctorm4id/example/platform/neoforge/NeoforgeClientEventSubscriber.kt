package dev.doctorm4id.example.platform.neoforge

import dev.doctorm4id.example.Example
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent

object NeoforgeClientEventSubscriber {

	@SubscribeEvent
	@JvmStatic
	fun onClientSetup(event: FMLClientSetupEvent) {
		Example.onInitializeClient()
	}
}

