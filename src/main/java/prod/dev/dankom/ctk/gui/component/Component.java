package prod.dev.dankom.ctk.gui.component;

import prod.dev.dankom.ctk.gui.type.BoundingBox;

public class Component implements IComponent {

    private int x;
    private int y;
    private int width;
    private int height;
    private BoundingBox bb;

    public Component(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.bb = new BoundingBox(x, y, height, width);
    }

    @Override
    public BoundingBox getBoundingBox() {
        return bb;
    }

    @Override
    public void setBoundingBox(BoundingBox bb) {
        this.bb = bb;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int x) {
        this.y = y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void onClick() {}

    @Override
    public void onSetup() {}

    public boolean isHovered() {
        return getBoundingBox().hovered();
    }
}
