package com.arcreane;

public class Animal extends Drawable {
    int m_iAgeMax;
    int m_iAge;

    int m_iLifePointMax;
    int m_iLifePoint;

    int m_iVigorMax;
    int m_iVigor;

    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    float m_fOrientation; //Angle varying between 0 and 2Pi
    Vision m_Vision;

    public Animal(int p_iMaxAge, int p_iMaxLifePoint, int p_iMaxVigor, float p_fMaxMovingSpeed) {
        m_iAgeMax = p_iMaxAge / 2 + Jungle.s_Random.nextInt(p_iMaxAge / 2);
        m_iLifePointMax = p_iMaxLifePoint / 2 + Jungle.s_Random.nextInt(p_iMaxLifePoint / 2);
        m_iVigorMax = p_iMaxVigor / 2 + Jungle.s_Random.nextInt(p_iMaxVigor / 2);
        m_fMovingSpeed = (Jungle.s_Random.nextFloat() + 0.01f) * p_fMaxMovingSpeed;

        m_Vision = new Vision(this);
    }

    public void pop(Coords p_Coords) {
        m_Coords = p_Coords;
        m_iAge = 0;
        m_iLifePoint = BORN_LIFE_POINT;
        m_iVigor = BORN_VIGOR;
    }

    protected void pop() {
        m_Coords = new Coords();
        m_iAge = Jungle.s_Random.nextInt(m_iAgeMax);
        m_iLifePoint = Jungle.s_Random.nextInt(m_iLifePointMax);
        m_iVigor = Jungle.s_Random.nextInt(m_iVigorMax);
    }
}
