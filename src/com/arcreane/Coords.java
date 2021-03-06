package com.arcreane;

public class Coords {
    private int m_iX;
    private int m_iY;

    public Coords(int p_iX, int p_iY) {
        m_iX = p_iX;
        m_iY = p_iY;
    }

    public Coords(){
        int maxWidth = Jungle.getTerrain().getWidth()-4;
        int maxHeight = Jungle.getTerrain().getHeight()-4;
        do {
            m_iX = 2 + Jungle.s_Random.nextInt(maxWidth);
            m_iY = 2 + Jungle.s_Random.nextInt(maxHeight);
        }while (Jungle.getTerrain().isSpotOccupied(this));

    }

    public int getX() {
        return m_iX;
    }

    public int getY() {
        return m_iY;
    }

    @Override
    public boolean equals(Object obj) {
        //if(obj.getClass() != this.getClass())
        if(obj instanceof Coords)
            return false;
        Coords p_Coords = (Coords) obj;
        return Math.abs(p_Coords.m_iX - m_iX)<=2 && p_Coords.m_iY == m_iY;
    }
}
