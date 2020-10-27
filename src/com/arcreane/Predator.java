package com.arcreane;

import java.util.Random;

public class Predator extends Animal{
    public static final int MAX_PREDATOR_AGE = 30;
    public static final int MAX_PREDATOR_LIFE_POINT = 30;
    public static final int MAX_PREDATOR_VIGOR = 30;
    public static final float MAX_PREDATOR_MOVING_SPEED = 30;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;

    static float s_fPredatorMovingNoise = 2.0f;
    static float s_fPredatorAcceleration;

    Smelling m_Smelling ;

    public Predator() {
        super(MAX_PREDATOR_AGE, MAX_PREDATOR_LIFE_POINT,
                MAX_PREDATOR_VIGOR, MAX_PREDATOR_MOVING_SPEED);

        m_Smelling = new Smelling(this);

        pop();
    }

    void draw() {

    }

    void step() {

    }

    void pop() {
           m_Coords = new Coords();
           m_fOrientation = (float) (Jungle.s_Random.nextFloat() * Math.PI * 2.0f);
           m_iAge = Jungle.s_Random.nextInt(m_iAgeMax);
           m_iLifePoint = Jungle.s_Random.nextInt(m_iLifePointMax);
           m_iVigor = Jungle.s_Random.nextInt(m_iVigorMax);
    }

    void move() {
    }

    void mating() {

    }

    void eat() {

    }

    void drink() {

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
}
