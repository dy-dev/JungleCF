package com.arcreane;

public class Weather {
    private final Terrain m_Terrain;
    private static final int MAX_QUANTITY_RAIN = 150;

    public Weather(Terrain p_Terrain) {
        m_Terrain = p_Terrain;
    }

    public void step() {
        if(Terrain.s_RandGenerator.nextInt(100) < 30 ) {
           rain();
        }
    }

    private void rain(){
        int quantity = 5 + Terrain.s_RandGenerator.nextInt(MAX_QUANTITY_RAIN);
        System.out.println("############################################    It is raining : " + quantity + "############################################################");
        m_Terrain.spray(quantity);
    }
}
