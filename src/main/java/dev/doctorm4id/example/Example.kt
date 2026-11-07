package dev.doctorm4id.example

import dev.doctorm4id.m4id.M4id
import dev.doctorm4id.m4id.ext.ResourceLocation
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object Example {
    const val MOD_ID: String = /*$ mod_id*/"example";
    const val MOD_VERSION: String =  /*$ mod_version*/"0.1.0";
    const val MOD_FRIENDLY_NAME: String =  /*$ mod_name*/"Example";

    val Logger: Logger = LogManager.getLogger(MOD_FRIENDLY_NAME)

    fun idOf(unique: String) = ResourceLocation(MOD_ID, unique)

    fun onInitialize() {
        Logger.info( "Initializing {} on {}", MOD_ID, M4id.SharedApi.platform )
        Logger.debug( "{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME )
    }

    fun onInitializeClient() {
        Logger.info( "Initializing {} Client on {}", MOD_ID, M4id.SharedApi.platform )
        Logger.debug( "{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME )
    }
}