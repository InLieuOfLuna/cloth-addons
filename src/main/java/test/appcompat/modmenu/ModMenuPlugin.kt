package test.appcompat.modmenu

import com.terraformersmc.modmenu.api.ModMenuApi

class ModMenuPlugin: ModMenuApi {
    override fun getModConfigScreenFactory() = TestConfig.screenFactory
}