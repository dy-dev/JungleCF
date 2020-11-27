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

    String drawingString;

    public Animal(int p_iMaxAge, int p_iMaxLifePoint, int p_iMaxVigor,
                  float p_fMaxMovingSpeed, Coords p_Coords, int p_iBornLifePoint,
                  int p_iBornVigor) {
        m_iAgeMax = p_iMaxAge / 2 + Jungle.s_Random.nextInt(p_iMaxAge / 2);
        m_iLifePointMax = p_iMaxLifePoint / 2 + Jungle.s_Random.nextInt(p_iMaxLifePoint / 2);
        m_iVigorMax = p_iMaxVigor / 2 + Jungle.s_Random.nextInt(p_iMaxVigor / 2);
        m_fMovingSpeed = (Jungle.s_Random.nextFloat() + 0.01f) * p_fMaxMovingSpeed;
        m_fOrientation = (float) (Jungle.s_Random.nextFloat() * Math.PI * 2.0f);

        m_Vision = new Vision(this);

        if (p_Coords == null)
            pop();
        else
            pop(p_Coords, p_iBornLifePoint, p_iBornVigor);
    }

    protected void pop() {
        super.pop();
        m_iAge = Jungle.s_Random.nextInt(m_iAgeMax);
        m_iLifePoint = Jungle.s_Random.nextInt(m_iLifePointMax);
        m_iVigor = Jungle.s_Random.nextInt(m_iVigorMax);
    }

    public void pop(Coords p_Coords, int p_iLifePoint, int p_iVigor) {
        super.pop(p_Coords);
        m_iAge = 0;
        m_iLifePoint = p_iLifePoint;
        m_iVigor = p_iVigor;
    }


    public void refillLifePoints(Resource resource) {
    }

    public int drinkWater() {
        return 0;
    }

    @Override
    public void draw(String[][] p_Board) {
        p_Board[m_Coords.getY()][m_Coords.getX() ] = drawingString;
        p_Board[m_Coords.getY()][m_Coords.getX() +1]= "";
    }
}
