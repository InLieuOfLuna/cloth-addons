package me.lunaluna.clothaddons.views

import me.shedaniel.clothconfig2.api.AbstractConfigListEntry
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder
import net.minecraft.text.Text
import kotlin.reflect.KClass

class BasicField<T: Any>(type: KClass<T>, prefix: String, default: T, key: String, private val addEntry: BasicField<T>.(ConfigEntryBuilder, T) -> AbstractConfigListEntry<*>) : MutableState<T>(type, default), EntryView {
    val tooltip: Text = Text.translatable("$prefix.$key.tooltip")
    val name: Text = Text.translatable("$prefix.$key")
    val save: (T) -> Unit =  { this.value = it }

    override fun addEntry(entryBuilder: ConfigEntryBuilder): AbstractConfigListEntry<*> {
        return addEntry(entryBuilder, value)
    }
}