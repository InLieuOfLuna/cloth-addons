package me.lunaluna.clothaddons.views.list

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.provider

fun LunaConfig.stringList(
    default: List<String> = emptyList(),
    key: String? = null,
    hasTooltip: Boolean = false
) = provider(default, key,) { entryBuilder, value ->
    entryBuilder.startStrList(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}