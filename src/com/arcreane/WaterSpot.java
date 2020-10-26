package com.arcreane;

public class WaterSpot {
    Coords m_Coords;

    float m_fArea;
    float m_fQuantity;
    float m_fEvaporationSpeed;

    WaterSpot(){
        m_fQuantity = 500.0f;
        m_Coords = new Coords();
    }
    void draw() {

    }

    void step() {

    }

    public void addWater(float p_fQuantity) {
        m_fQuantity += p_fQuantity;
    }
}
