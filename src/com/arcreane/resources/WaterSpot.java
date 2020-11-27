package com.arcreane.resources;

import com.arcreane.Coords;
import com.arcreane.animal.Animal;

public class WaterSpot extends Resource{
    private float m_fArea;
    private float m_fEvaporationSpeed;
    private int m_iQuantity;

    public WaterSpot() {
        m_iQuantity = 5000;
        m_Coords = new Coords();
    }

    public void setQuantity(int p_iQuantity) {
        m_iQuantity = p_iQuantity;
    }

    public int getQuantity() {
        return m_iQuantity;
    }


    @Override
    public void draw(String[][] m_Board) {
        super.draw(m_Board);
        System.out.println("Glouglou");
    }


    @Override
    public void step() {
        System.out.println("Water quantity : " + m_iQuantity);
    }

    public int requestDrinkingQuantity(Animal p_Animal, int waterDrunk) {
        if (m_iQuantity == 0)
            return 0;

        int tmp = m_iQuantity;
        if (tmp > waterDrunk) {
            tmp = waterDrunk;
            m_iQuantity -= tmp;
        } else {
            m_iQuantity = 0;
        }
        return tmp;
    }

    @Override
    public int consume() {
        return 5;
    }
}
