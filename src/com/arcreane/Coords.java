package com.arcreane;

public class Coords {
    private int m_iX;
    private int m_iY;

    public Coords(int p_iX, int p_iY) {
        m_iX = p_iX;
        m_iY = p_iY;
    }

    public Coords(){
        int maxWidth = Jungle.getTerrain().getWidth();
        int maxHeight = Jungle.getTerrain().getHeight();
        do {
            m_iX = Jungle.s_Random.nextInt(maxWidth);
            m_iY = Jungle.s_Random.nextInt(maxHeight);
        }while (Jungle.getTerrain().isSpotOccupied(this));

    }

    public int getX() {
        return m_iX;
    }

    public int getY() {
        return m_iY;
    }

    public boolean isSame(Coords p_Coords) {
        return p_Coords.m_iX == m_iX && p_Coords.m_iY == m_iY;
    }
}
