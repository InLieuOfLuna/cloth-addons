package me.lunaluna.clothaddons.views

import me.shedaniel.clothconfig2.api.AbstractConfigListEntry
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder
import net.minecraft.text.Text
import kotlin.reflect.KClass

open class BasicField<T: Any>(type: KClass<T>, config: String, default: T, key: String, private val addEntry: BasicField<T>.(ConfigEntryBuilder, T) -> AbstractConfigListEntry<*>) : MutableState<T>(type, default), EntryView {
    val tooltip: Text = Text.translatable("text.config.$config.$key.tooltip")
    val name: Text = Text.translatable("text.config.$config.$key")
    val save: (T) -> Unit =  { this.value = it }

    override fun addEntry(entryBuilder: ConfigEntryBuilder): AbstractConfigListEntry<*> {
        return addEntry(entryBuilder, value)
    }
}

