package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.intField(key: String, default: Int = 0, hasTooltip: Boolean = false) = BasicField(Int::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startIntField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }