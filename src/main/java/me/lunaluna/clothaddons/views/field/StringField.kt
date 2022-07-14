package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.stringField(key: String, default: String = "", hasTooltip: Boolean = false) = BasicField(String::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startStrField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }