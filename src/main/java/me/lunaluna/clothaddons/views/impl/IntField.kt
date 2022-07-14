package me.lunaluna.clothaddons.views.impl

import me.lunaluna.clothaddons.views.BasicField

class IntField(config: String, key: String, default: Int = 0, hasTooltip: Boolean = false) : BasicField<Int>(Int::class, config, default, key, { entryBuilder, value ->
    entryBuilder.startIntField(name, value).apply {
        setDefaultValue(default)
        if (hasTooltip) setTooltip(tooltip)
        setSaveConsumer(save)
    }.build()
})