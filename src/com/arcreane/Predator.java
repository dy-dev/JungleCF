package com.arcreane;

public class Predator {
    Coords m_Coords;

    static int s_iMaxPredatorAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPredatorLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPredatorVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorMovingNoise;

    static float s_fPredatorAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    Vision m_Vision;
    Smelling m_Smelling;

    void draw() {

    }

    void step() {

    }

    void pop() {

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
