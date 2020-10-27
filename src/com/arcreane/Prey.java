package com.arcreane;

public class Prey {
    public static final int BORN_VIGOR = 30;
    public static final int BORN_LIFE_POINT = 30;


    Coords m_Coords;

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

    public Prey() {
        m_iAgeMax = s_iMaxPreyAge /2 + Jungle.s_Random.nextInt(s_iMaxPreyAge/2);
        m_iLifePointMax = s_iMaxPreyLifePoint/2 + Jungle.s_Random.nextInt(s_iMaxPreyLifePoint/2);
        m_iVigorMax = s_iMaxPreyVigor/2 + Jungle.s_Random.nextInt(s_iMaxPreyVigor/2);

        m_fMovingSpeed = (Jungle.s_Random.nextFloat() +0.01f)* s_fMaxPreyMovingSpeed;

        m_Vision = new Vision();
        m_Hearing = new Hearing();

        m_fOrientation = (float) (Jungle.s_Random.nextFloat() * Math.PI * 2.0f);
        pop();
    }

    void draw(){

    }

    void step(){

    }

    public void pop(Coords p_Coords){
        m_Coords = p_Coords;
        m_iAge = 0;
        m_iLifePoint = BORN_LIFE_POINT;
        m_iVigor = BORN_VIGOR;
    }

    void pop() {
            m_Coords = new Coords();
            m_iAge = Jungle.s_Random.nextInt(m_iAgeMax);
            m_iLifePoint = Jungle.s_Random.nextInt(m_iLifePointMax);
            m_iVigor = Jungle.s_Random.nextInt(m_iVigorMax);
    }

    void move(){
    }

    void mating(){

    }

    void eat()  {

    }

    void drink(){

    }

    void rest(){

    }

    void flee()  {

    }



}
