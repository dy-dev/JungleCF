package com.arcreane;

public class WaterSpot {
    Coords m_CenterCoords;

    int m_iWidth;
    int m_iHeight;
    float m_fQuantity;
    float m_fEvaporationSpeed;

    WaterSpot(){
        m_fQuantity = 500.0f;
        m_CenterCoords = new Coords(Jungle.getTerrain().getWidth() / 2,
                Jungle.getTerrain().getHeight() / 2);
        m_iHeight = Jungle.getTerrain().getHeight() / 5;
        m_iWidth = Jungle.getTerrain().getWidth() / 5;
    }
    void draw() {

    }

    void step() {

    }

    public void addWater(float p_fQuantity) {
        m_fQuantity += p_fQuantity;
    }

    public boolean isInWater(Coords p_Coords) {
return ( Math.abs(p_Coords.getX() - m_CenterCoords.getX()) < m_iWidth/2 &&
        Math.abs(p_Coords.getY() - m_CenterCoords.getY()) < m_iHeight/2 );

    }

}
