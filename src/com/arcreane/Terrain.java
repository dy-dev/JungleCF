package com.arcreane;

import com.arcreane.animal.Animal;
import com.arcreane.animal.Predator;
import com.arcreane.animal.Prey;
import com.arcreane.resources.Plant;
import com.arcreane.resources.WaterSpot;

import java.util.Random;

public class Terrain {
    static private final int s_iArrayLength = 100;
    static public Random s_RandGenerator = new Random();

    private int m_iwidth;
    private int m_iHeight;

    /*private Prey[] m_PreysArray;
    private Predator[] m_PredatorsArray;
    private Plant[] m_PlantsArray;*/

   /* public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }

    private WaterSpot m_WaterSpot;*/

    SpatialItem[] m_SpatialItemArray;

    public Terrain() {

        m_SpatialItemArray = new SpatialItem[301];

        //Creation de la variable de type WaterSpot
        //Elle doit être instanciée en premier car elle est passée en paramètre
        //au predateurs et aux proies
        m_SpatialItemArray[0] = new WaterSpot();

        for (int i = 1; i < s_iArrayLength + 1; i++) {
            m_SpatialItemArray[i] = new Prey( getWaterSpot());
            m_SpatialItemArray[i + s_iArrayLength] = new Predator(getWaterSpot());
            m_SpatialItemArray[i + 2* s_iArrayLength] = new Plant();
        }

        m_iwidth = 80;
        m_iHeight = 30;
    }

    void step() {
        for (SpatialItem item : m_SpatialItemArray) {
            item.step();
        }
    }

    void draw() {
        for (SpatialItem item : m_SpatialItemArray) {
            item.draw();
        }
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
        getWaterSpot().setQuantity(getWaterSpot().getQuantity() + p_iQuantity);
    }

    public WaterSpot getWaterSpot(){
        return (WaterSpot) m_SpatialItemArray[0];
    }
}
