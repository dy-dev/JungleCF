package com.arcreane.animal;

import com.arcreane.*;
import com.arcreane.animal.sens.Hearing;
import com.arcreane.animal.sens.Vision;
import com.arcreane.resources.WaterSpot;

public class Prey  extends Animal {
    public static final int MAX_WATER_DRUNK = 5;

    static int s_iMaxPreyAge;
    static int s_iMaxPreyLifePoint;
    static int s_iMaxPreyVigor;
    static float s_fMaxPreyMovingSpeed;
    static float s_fPreyAcceleration;
    Hearing m_Hearing;


    public Prey(WaterSpot p_WaterSpot) {
        super(null);
        m_WaterSpot = p_WaterSpot;
    }


    @Override
    public void draw() {
        super.draw();
        System.out.println("Ouh j'ai peur je vais me faire becter");
    }

    @Override
    public void step() {
        drink();
    }

    void pop() {

    }

    void move() {
    }

    void mating() {

    }

    void eat() {

    }



    void rest() {

    }

    void flee() {

    }


}
