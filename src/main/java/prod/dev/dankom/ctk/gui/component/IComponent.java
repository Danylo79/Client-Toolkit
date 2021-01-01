package prod.dev.dankom.ctk.gui.component;

import prod.dev.dankom.ctk.gui.type.BoundingBox;

public interface IComponent {
    //BoundingBox
    BoundingBox getBoundingBox();
    void setBoundingBox(BoundingBox bb);
    //Coords
    int getX();
    void setX(int x);
    int getY();
    void setY(int x);
    //Size
    int getWidth();
    void setWidth(int width);
    int getHeight();
    void setHeight(int height);
    //Event
    void onClick();
    void onSetup();
}
