package prod.dev.dankom.ctk.gui.type;

import org.lwjgl.input.Mouse;

public class BoundingBox {
    private int originX;
    private int originY;
    private int height;
    private int width;

    public BoundingBox(int originX, int originY, int height, int width) {
        this.originX = originX;
        this.originY = originY;
        this.height = height;
        this.width = width;
    }

    public boolean hovered() {
        int mouseX = Mouse.getX();
        int mouseY = Mouse.getY();
        boolean isInBoundsX = (mouseX > calcMinX()) && (mouseX < calcMaxX());
        boolean isInBoundsY = (mouseY > calcMinY()) && (mouseY < calcMaxY());
        return isInBoundsX && isInBoundsY;
    }

    public int calcMinX() {
        return originX;
    }

    public int calcMaxX() {
        return originX + width;
    }

    public int calcMinY() {
        return originY;
    }

    public int calcMaxY() {
        return originY - height;
    }

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
