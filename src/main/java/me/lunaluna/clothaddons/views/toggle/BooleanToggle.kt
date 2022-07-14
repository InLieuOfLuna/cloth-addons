package me.lunaluna.clothaddons.views.toggle

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider

fun LunaConfig.booleanToggle(
    default: Boolean = false,
    key: String? = null,
    hasTooltip: Boolean = false
) = provider(default, key) { entryBuilder, value ->
    entryBuilder.startBooleanToggle(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}