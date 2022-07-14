package me.lunaluna.clothaddons.views.slider

import me.lunaluna.clothaddons.LunaConfig
import me.lunaluna.clothaddons.views.BasicField

fun LunaConfig.longSlider(key: String, default: Long = 0, range: LongRange, hasTooltip: Boolean = false) = BasicField(Long::class, prefix, default, key) { entryBuilder, value ->
    entryBuilder.startLongSlider(name, value, range.first, range.last).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
}.apply { entryViews.add(this) }