package com.arcreane.animal;

import com.arcreane.Consumable;
import com.arcreane.animal.sens.Hearing;
import com.arcreane.resources.WaterSpot;

public class Prey extends Animal implements Consumable {
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

    @Override
    protected void eat(Consumable p_Consumable) {
        int consumablePoints = p_Consumable.consume();
        if(m_iLifePoint + consumablePoints  < s_iMaxPreyLifePoint){
            m_iLifePoint += consumablePoints;
        }
        else
            m_iLifePoint = s_iMaxPreyLifePoint;

        //Gérer la manière dont ca récupère les points de vie
        //Elle peut chercher une autre proie pour s'accoupler

    }

    void rest() {

    }

    void flee() {

    }

    @Override
    public int consume() {
        return m_iLifePoint;
    }
}
