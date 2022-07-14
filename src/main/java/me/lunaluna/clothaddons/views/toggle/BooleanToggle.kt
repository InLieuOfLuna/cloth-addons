package me.lunaluna.clothaddons.views.toggle

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.booleanToggle(key: String, default: Boolean = false, hasTooltip: Boolean = false) = BasicField(Boolean::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startBooleanToggle(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }