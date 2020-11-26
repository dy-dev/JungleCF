package com.arcreane;

public class Prey {
    Coords m_Coords;
    public static final int MAX_WATER_DRUNK = 5;

    static int s_iMaxPreyAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPreyLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPreyVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fMaxPreyMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPreyAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    Vision m_Vision;
    Hearing m_Hearing;

    //Variable d'instance qui permet à la proie de savoir
    //ou se trouve le plan d'eau et de s'y diriger
    WaterSpot m_WaterSpot;

    public Prey(WaterSpot p_WaterSpot) {
        m_WaterSpot = p_WaterSpot;
    }

    void draw() {

    }

    void step() {
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

    void drink() {
        if(Terrain.s_RandGenerator.nextInt(101) < 10 ) {
            int waterThirst =  1 + Terrain.s_RandGenerator.nextInt(MAX_WATER_DRUNK);
            System.out.println("Prey want to drink " + waterThirst);
            int waterAvailable = m_WaterSpot.requestDrinkingQuantity(waterThirst);
            System.out.println("Water drunk : " + waterAvailable);
        }
    }

    void rest() {

    }

    void flee() {

    }


}
