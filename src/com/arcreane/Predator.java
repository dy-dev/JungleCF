package com.arcreane;

public class Predator extends Animal {
    public static final int BORN_VIGOR = 50;
    public static final int BORN_LIFE_POINT = 40;

    public static final int MAX_PREDATOR_AGE = 30;
    public static final int MAX_PREDATOR_LIFE_POINT = 30;
    public static final int MAX_PREDATOR_VIGOR = 30;
    public static final float MAX_PREDATOR_MOVING_SPEED = 30;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;

    static float s_fPredatorMovingNoise = 2.0f;
    static float s_fPredatorAcceleration;

    Smelling m_Smelling;

    public Predator(Coords p_Coords) {
        super(MAX_PREDATOR_AGE, MAX_PREDATOR_LIFE_POINT,
                MAX_PREDATOR_VIGOR, MAX_PREDATOR_MOVING_SPEED,
                p_Coords, BORN_LIFE_POINT, BORN_VIGOR);

        m_Smelling = new Smelling(this);
    }

    @Override
    public void draw(String[][] p_Board) {
        p_Board[m_Coords.getX() ][m_Coords.getY()] = "\uD83E\uDD81";
        p_Board[m_Coords.getX()+1 ][m_Coords.getY()] = "";
    }

    @Override
    public int drinkWater() {
        return m_iLifePoint / 2;
    }

    void move() {
    }

    void mating() {
        //Check with terrain if there is place left in the array to accept
        //a new predator
        int i = Jungle.getTerrain().getFreePredatorIndex();
        if (i != -1) {
            Coords coords = Jungle.getTerrain().findClosestFreeSpot(m_Coords);
            Jungle.getTerrain().insertPredator(i, new Predator(coords));
        }
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
