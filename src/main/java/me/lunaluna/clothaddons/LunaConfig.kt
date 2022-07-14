package me.lunaluna.clothaddons

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import me.lunaluna.clothaddons.views.EntryView
import me.shedaniel.clothconfig2.api.ConfigBuilder
import net.minecraft.text.Text
import java.nio.file.Path

abstract class LunaConfig(protected val name: String, path: Path = Path.of("config", "$name.json"), val prefix: String = "text.config.$name", val title: Text = Text.translatable("$prefix.title")) {

    protected val entryViews = mutableListOf<EntryView>()

    val screenFactory get() = ConfigScreenFactory {
        ConfigBuilder.create().apply {

            parentScreen = it
            title = this@LunaConfig.title

            val entryBuilder = entryBuilder()
            getOrCreateCategory(Text.empty()).apply {
                for (entry in entryViews) addEntry(entry.addEntry(entryBuilder))
            }

            setSavingRunnable { save() }

        }.build()
    }

    open fun load() { /* TODO: Complete loading from Json file */ }
    open fun save() { /* TODO: Complete saving to Json file */ }
}