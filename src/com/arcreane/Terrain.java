package com.arcreane;

public class Terrain {
    int m_iwidth;
    int m_iHeight;

    Prey[] m_PreysArray;
    Predator[] m_PredatorsArray;
    Plant[] m_PlantsArray;
    WaterSpot m_WaterSpot;

    public Terrain() {
        m_PreysArray = new Prey[100];
        for (int i = 0; i < m_PreysArray.length; i++) {
            m_PreysArray[i] = new Prey();
        }


        m_PredatorsArray = new Predator[100];
        for (int i = 0; i < m_PredatorsArray.length; i++) {
            m_PredatorsArray[i] = new Predator();
        }

        m_PlantsArray = new Plant[50];
        for (int i = 0; i < m_PlantsArray.length; i++) {
            m_PlantsArray[i] = new Plant();
        }
        m_WaterSpot = new WaterSpot();
        m_iwidth = 80;
        m_iHeight = 30;
    }

    void step() {
        for (Predator pred : m_PredatorsArray) {
            pred.step();
        }
        for (Plant plant : m_PlantsArray) {
            plant.step();
        }
        for (Prey prey : m_PreysArray) {
            prey.step();
        }
        m_WaterSpot.step();
    }

    void draw() {
        for (int i = 0; i <m_iHeight; i++) {

            for (int k = 0; k <  m_iwidth; k++) {
                if (i == 0 || i == m_iHeight - 1)
                    System.out.print("_");
                else if (k == 0 || k == m_iwidth - 1)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }

    boolean hasLivingCreatures() {
        return true;
    }

    public void spray(float p_fQuantity) {
        m_WaterSpot.addWater(p_fQuantity);

    }
}
