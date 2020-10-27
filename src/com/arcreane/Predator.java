package com.arcreane;

import java.util.Random;

public class Predator {
    public static final int MAX_AGE = 30;
    public static final int MAX_LIFE_POINT = 30;
    public static final int MAX_VIGOR = 30;

    Coords m_Coords;

    static int s_iMaxPredatorAge = MAX_AGE;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPredatorLifePoint = MAX_LIFE_POINT;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPredatorVigor = MAX_VIGOR;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorMovingNoise;

    static float s_fPredatorAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    Vision m_Vision;
    Smelling m_Smelling;

    public Predator() {
        m_iAgeMax = s_iMaxPredatorAge/2 + Jungle.s_Random.nextInt(s_iMaxPredatorAge/2);
        m_iLifePointMax =s_iMaxPredatorLifePoint/2 + Jungle.s_Random.nextInt(s_iMaxPredatorLifePoint/2);
        m_iVigorMax = s_iMaxPredatorVigor/2 + Jungle.s_Random.nextInt(s_iMaxPredatorVigor/2);

        m_fMovingSpeed = (Jungle.s_Random.nextFloat() +0.01f)* s_fMaxPredatorMovingSpeed;

        m_Vision = new Vision();
        m_Smelling = new Smelling();

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
