package com.arcreane.animal;

import com.arcreane.*;
import com.arcreane.animal.sens.Smelling;
import com.arcreane.animal.sens.Vision;
import com.arcreane.resources.WaterSpot;

public class Predator extends Animal {
    public static final int MAX_AGE = 30;
    public static final int MAX_LIFE_POINT = 30;
    public static final int MAX_VIGOR = 30;

    static int s_iMaxPredatorAge = MAX_AGE;
    static int s_iMaxPredatorLifePoint = MAX_LIFE_POINT;
    static int s_iMaxPredatorVigor = MAX_VIGOR;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;
    static float s_fPredatorMovingNoise;
    static float s_fPredatorAcceleration;

    Smelling m_Smelling;

    //Constructeur qui prend un Waterspot en parametre
    public Predator(WaterSpot p_WaterSpot) {
        super(null);
        m_WaterSpot = p_WaterSpot;
        m_iAgeMax = 1 + Jungle.s_Random.nextInt(s_iMaxPredatorAge);
        m_iLifePointMax = 1 + Jungle.s_Random.nextInt(s_iMaxPredatorLifePoint);
        m_iVigorMax = 1 + Jungle.s_Random.nextInt(s_iMaxPredatorVigor);

        m_fMovingSpeed = (Jungle.s_Random.nextFloat() + 0.01f) * s_fMaxPredatorMovingSpeed;

        m_Vision = new Vision();
        m_Smelling = new Smelling();

        pop(false);
    }

    @Override
    protected void drink() {
        super.drink();
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void step() {
        drink();
    }

    void pop(boolean p_Born) {
        if (!p_Born) {
            m_Coords = new Coords();
            m_fOrientation = (float) (Jungle.s_Random.nextFloat() * Math.PI * 2.0f);
            m_iAge = Jungle.s_Random.nextInt(m_iAgeMax);
            m_iLifePoint = Jungle.s_Random.nextInt(m_iLifePointMax);
            m_iVigor = Jungle.s_Random.nextInt(m_iVigorMax);
        }
    }

    void move() {
    }

    void mating() {

    }



    void rest() {

    }

    void spot(Prey p_Prey) {
        if (m_Smelling.canSmell(p_Prey, m_Coords)) {
            hunt(p_Prey);
        }
    }

    void hunt(Prey p_Prey) {

    }

    @Override
    protected void eat(Consumable p_Consumable) {
        //Gérer la manière dont ca récupère les points de vie
        //Fait la sieste pour digérer
    }
}
