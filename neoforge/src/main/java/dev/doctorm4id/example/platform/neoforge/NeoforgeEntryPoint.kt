package dev.doctorm4id.example.platform.neoforge

import dev.doctorm4id.example.Example
import dev.doctorm4id.m4id.M4id
import net.neoforged.fml.common.Mod
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_CONTEXT
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

@Mod(M4id.MOD_ID)
class NeoforgeEntryPoint {

	init {
		Example.onInitialize()

		runForDist(
			clientTarget = {
				MOD_CONTEXT.getKEventBus().register(NeoforgeClientEventSubscriber::class.java)
			},
			serverTarget = { }
		)
	}
}
