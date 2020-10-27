package com.arcreane;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class Jungle {
    public static Random s_Random = new Random();
    public static JungleObject[] s_JungleObject = new JungleObject[2];

    public static void main(String[] args) throws UnsupportedEncodingException {
        createNewTerrain();
        s_JungleObject[1] = new Weather(getTerrain());

        // while(terrain.hasLivingCreatures()){
        for (JungleObject obj : s_JungleObject) {
            obj.step();
        }
        getTerrain().draw();

        //try {
        //    Thread.sleep(250);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //}
    }

    private static void createNewTerrain() {
        Terrain terrain = new Terrain();
        s_JungleObject[0] = terrain;
        terrain.init();
    }

    public static Terrain getTerrain() {
        return (Terrain) s_JungleObject[0];

    }
}
