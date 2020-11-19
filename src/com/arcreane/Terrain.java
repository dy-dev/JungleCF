package com.arcreane;

import java.util.Random;

public class Terrain {
    static public Random s_RandGenerator = new Random();

    private int m_iwidth;
    private int m_iHeight;

    private Prey[] m_PreysArray;
    private Predator[] m_PredatorsArray;
    private Plant[] m_PlantsArray;

    public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }

    private WaterSpot m_WaterSpot;

    public Terrain() {
        //Creation de la variable de type WaterSpot
        //Elle doit être instanciée en premier car elle est passée en paramètre
        //au predateurs et aux proies
        m_WaterSpot = new WaterSpot();

        m_PreysArray = new Prey[100];
        for (int i = 0; i < m_PreysArray.length; i++) {
            m_PreysArray[i] = new Prey(m_WaterSpot);
        }


        m_PredatorsArray = new Predator[100];
        for (int i = 0; i < m_PredatorsArray.length; i++) {
            m_PredatorsArray[i] = new Predator(m_WaterSpot);
        }

        m_PlantsArray = new Plant[50];
        for (int i = 0; i < m_PlantsArray.length; i++) {
            m_PlantsArray[i] = new Plant();
        }
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

    public void spray(int p_iQuantity) {
        m_WaterSpot.setQuantity(m_WaterSpot.getQuantity() + p_iQuantity);
    }
}
