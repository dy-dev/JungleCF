package com.arcreane;

public class Prey extends Animal {
    public static final int BORN_VIGOR = 30;
    public static final int BORN_LIFE_POINT = 30;

    static int s_iMaxPreyAge;
    static int s_iMaxPreyLifePoint;
    static int s_iMaxPreyVigor;
    static float s_fMaxPreyMovingSpeed;
    static float s_fPreyAcceleration;

    Hearing m_Hearing;

    public Prey() {
        super(s_iMaxPreyAge, s_iMaxPreyLifePoint, s_iMaxPreyVigor, s_fMaxPreyMovingSpeed);
        m_Hearing = new Hearing(this);

        m_fOrientation = (float) (Jungle.s_Random.nextFloat() * Math.PI * 2.0f);
        pop();
    }

    void draw() {

    }

    void step() {

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

    void flee() {

    }


}
