package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider
import net.minecraft.client.util.InputUtil
import net.minecraft.client.util.InputUtil.Key

fun LunaConfig.keyCodeField(
    default: Key = InputUtil.UNKNOWN_KEY,
    key: String? = null,
    hasTooltip: Boolean = false
) = provider(default, key) { entryBuilder, value ->
    entryBuilder.startKeyCodeField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}