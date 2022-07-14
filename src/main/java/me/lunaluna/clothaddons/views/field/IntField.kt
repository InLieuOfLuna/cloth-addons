package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider

fun LunaConfig.intField(
    default: Int = 0,
    key: String? = null,
    hasTooltip: Boolean = false
) = provider(default, key) { entryBuilder, value ->
    entryBuilder.startIntField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}