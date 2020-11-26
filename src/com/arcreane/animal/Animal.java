package com.arcreane.animal;

import com.arcreane.Coords;
import com.arcreane.SpatialItem;
import com.arcreane.Terrain;
import com.arcreane.animal.sens.Vision;
import com.arcreane.resources.WaterSpot;

public class Animal extends SpatialItem {

    public static final int MAX_WATER_DRUNK = 5;

    int m_iAgeMax;
    int m_iAge;
    int m_iLifePointMax;
    int m_iLifePoint;
    int m_iVigorMax;
    int m_iVigor;
    float m_fMovingSpeed;
    float m_fOrientation; //Angle varying between 0 and 2Pi
    Vision m_Vision;

    //Variable d'instance qui permet à la proie de savoir
    //ou se trouve le plan d'eau et de s'y diriger
    WaterSpot m_WaterSpot;

    Animal(Coords p_Coords){
        m_Coords = p_Coords;
    }

    Animal (int p_nBLifePoint){
        m_iLifePoint = p_nBLifePoint;
    }

    protected void drink() {
        if(Terrain.s_RandGenerator.nextInt(101) < 10 ) {
            int waterThirst =  1 + Terrain.s_RandGenerator.nextInt(MAX_WATER_DRUNK);
            System.out.println("Prey want to drink " + waterThirst);
            int waterAvailable = m_WaterSpot.requestDrinkingQuantity(this, waterThirst);
            System.out.println("Water drunk : " + waterAvailable);
        }
    }

}
