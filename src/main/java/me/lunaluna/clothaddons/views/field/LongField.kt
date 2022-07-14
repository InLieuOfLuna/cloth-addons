package me.lunaluna.clothaddons.views.field

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.longField(key: String, default: Long = 0, hasTooltip: Boolean = false) = BasicField(Long::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startLongField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }