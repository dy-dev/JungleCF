package com.arcreane.animal;

import com.arcreane.Consumable;
import com.arcreane.Coords;
import com.arcreane.SpatialItem;
import com.arcreane.Terrain;
import com.arcreane.animal.sens.Vision;
import com.arcreane.resources.WaterSpot;

public abstract class Animal extends SpatialItem {

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

    String m_sDrawAnimal;
    Animal(Coords p_Coords){
        m_Coords = p_Coords;
    }

    Animal (int p_nBLifePoint){
        m_iLifePoint = p_nBLifePoint;
    }

    protected abstract  void eat(Consumable p_Consumable);

    protected void drink() {
        if(Terrain.s_RandGenerator.nextInt(101) < 10 ) {
            int waterThirst =  1 + Terrain.s_RandGenerator.nextInt(MAX_WATER_DRUNK);
            int waterAvailable = m_WaterSpot.requestDrinkingQuantity(this, waterThirst);
        }
    }

    @Override
    public void draw(String[][] p_Board) {
        p_Board[m_Coords.getY()][m_Coords.getX()] = m_sDrawAnimal;
    }
}
