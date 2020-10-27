package com.arcreane;

import java.util.Random;

public class Jungle {
    public static Random s_Random = new Random();
    private static Terrain s_Terrain = new Terrain();

    public static void main(String[] args) {
        Weather weather = new Weather(s_Terrain);

        // while(terrain.hasLivingCreatures()){
        weather.step();
        s_Terrain.step();
        s_Terrain.draw();

        //try {
        //    Thread.sleep(250);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //}
    }

    public static Terrain getTerrain(){
        return s_Terrain;
    }
}
