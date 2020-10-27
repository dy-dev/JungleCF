package com.arcreane;

public class Weather extends JungleObject{
    private final Terrain m_Terrain;

    public Weather(Terrain p_Terrain) {
        m_Terrain = p_Terrain;
    }

    public void step() {

    }

    private void rain(){
        float quantity = 10.0f;
        m_Terrain.spray(quantity);
    }
}
