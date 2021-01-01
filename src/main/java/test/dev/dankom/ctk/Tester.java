package test.dev.dankom.ctk;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;
import prod.dev.dankom.ctk.ClientToolkit;

@Mod(modid = ClientToolkit.MOD_ID)
public class Tester {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onKey(TickEvent.ClientTickEvent e) {
        if (Minecraft.getMinecraft().currentScreen == null && Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {

        }
    }
}
