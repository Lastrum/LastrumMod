package com.lastrum.lastrumprivatemod.Keybinds;

import com.lastrum.lastrumprivatemod.LastrumCore;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;


public class OpenConfigGui {
    @SubscribeEvent
    public void onConfigKey(InputEvent.KeyInputEvent e) {
        if (LastrumCore.openConfigKey.isPressed()) {
            LastrumCore.config.openGui();
        }
    }
}

