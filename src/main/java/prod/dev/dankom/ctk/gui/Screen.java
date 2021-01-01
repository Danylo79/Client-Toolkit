package prod.dev.dankom.ctk.gui;

import net.minecraft.client.gui.GuiScreen;
import prod.dev.dankom.ctk.gui.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Screen extends GuiScreen {

    private List<Component> components = new ArrayList<>();

    public Screen() {
        onSetup();
        onOpen();
    }

    @Override
    public void onGuiClosed() {
        onClose();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        for (Component c : getComponents()) {
            c.onRender();
        }
    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    //Event
    public void onSetup() {
        for (Component c : getComponents()) {
            c.onSetup();
        }
    }

    public void onOpen() {}
    public void onClose() {}
}
