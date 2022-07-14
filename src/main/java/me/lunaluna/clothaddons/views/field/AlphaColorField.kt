package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider

fun LunaConfig.colorField(
    default: Int = 0,
    key: String? = null,
    hasTooltip: Boolean = false,
    hasAlpha: Boolean = false,
) = provider(default, key) {entryBuilder, value ->
    if (hasAlpha) entryBuilder.startAlphaColorField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
    else entryBuilder.startColorField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}