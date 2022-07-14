package me.lunaluna.clothaddons.views.slider

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider

fun LunaConfig.intSlider(
    range: IntRange,
    default: Int = 0,
    key: String? = null,
    hasTooltip: Boolean = false
) = provider(default, key) { entryBuilder, value ->
    entryBuilder.startIntSlider(name, value, range.first, range.last).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}