package com.arcreane;

public class Coords {
    private int m_iX;
    private int m_iY;

    public Coords(int p_iX, int p_iY) {
        m_iX = p_iX;
        m_iY = p_iY;
    }

    public Coords(){
        int maxWidth = Jungle.getTerrain().getWidth()-2;
        int maxHeight = Jungle.getTerrain().getHeight()-2;
        do {
            m_iX = 1 + Jungle.s_Random.nextInt(maxWidth);
            m_iY = 1 + Jungle.s_Random.nextInt(maxHeight);
        }while (Jungle.getTerrain().isSpotOccupied(this));

    }

    public int getX() {
        return m_iX;
    }

    public int getY() {
        return m_iY;
    }

    public boolean isSame(Coords p_Coords) {
        return Math.abs(p_Coords.m_iX - m_iX)<=1 && p_Coords.m_iY == m_iY;
    }
}
