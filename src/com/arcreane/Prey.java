package com.arcreane;

public class Prey extends Animal {
    public static final int BORN_VIGOR = 30;
    public static final int BORN_LIFE_POINT = 30;

    public static final int MAX_PREY_AGE = 30;
    public static final int MAX_PREY_LIFE_POINT = 30;
    public static final int MAX_PREY_VIGOR = 30;
    public static final float MAX_PREY_MOVING_SPEED = 30;
    static float s_fPreyAcceleration;


    Hearing m_Hearing;

    public Prey(Coords p_Coords) {
        super(MAX_PREY_AGE, MAX_PREY_LIFE_POINT, MAX_PREY_VIGOR,
                MAX_PREY_MOVING_SPEED,
                p_Coords, BORN_LIFE_POINT, BORN_VIGOR);
        m_Hearing = new Hearing(this);

        drawingString = "\uD83D\uDC03";
    }



    @Override
    public int drinkWater() {
        return m_iLifePoint  /10;
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
