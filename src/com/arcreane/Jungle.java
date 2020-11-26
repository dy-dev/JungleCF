package com.arcreane;

import java.util.Random;

public class Jungle {
    public static Random s_Random = new Random();

    public static void main(String[] args) {
        Terrain terrain = new Terrain();
        Weather weather = new Weather(terrain);

        while(terrain.getWaterSpot().getQuantity() != 0){
            weather.step();
            terrain.step();
            //terrain.draw();
            System.out.println("**********************************************             Fin de cycle        **********************************************************");
           try {
               Thread.sleep(250);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
        System.out.println("Now it is a desert every one dies");
    }
}
