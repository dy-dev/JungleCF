package com.arcreane;

public class Drawable extends JungleObject {
    protected Coords m_Coords;

    public void pop(Coords p_Coords) {
        m_Coords = p_Coords;
    }

    protected void pop() {
        m_Coords = new Coords();
    }

    public void draw(String[][] p_Board) {
    }

    protected Coords getCoords() {
        return m_Coords;
    }
}
