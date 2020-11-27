package com.arcreane;

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

    private String[][] m_Board;

    /***
     *  -------------------
     *  |   p              |
     *  |                  |
     *  | X     ~~~~~~     |
     *  |       ~~~~~~     |
     *  |       ~~~~~~     |
     *  | m               m|
     *  ---------------------
     */
    /*private Prey[] m_PreysArray;
    private Predator[] m_PredatorsArray;
    private Plant[] m_PlantsArray;*/

   /* public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }

    private WaterSpot m_WaterSpot;*/

    SpatialItem[] m_SpatialItemArray;
    Consumable[] m_ConsumableArray;

    public Terrain() {

        m_SpatialItemArray = new SpatialItem[301];
        m_ConsumableArray = new Consumable[201];
        //Creation de la variable de type WaterSpot
        //Elle doit être instanciée en premier car elle est passée en paramètre
        //au predateurs et aux proies
        m_SpatialItemArray[0] = new WaterSpot();
        m_ConsumableArray[0] = getWaterSpot();

        for (int i = 1; i < s_iArrayLength + 1; i++) {
            m_SpatialItemArray[i] = new Prey(getWaterSpot());
            m_ConsumableArray[i] = (Consumable) m_SpatialItemArray[i];
            m_SpatialItemArray[i + s_iArrayLength] = new Predator(getWaterSpot());
            m_SpatialItemArray[i + 2 * s_iArrayLength] = new Plant();
            m_ConsumableArray[i + s_iArrayLength] = (Consumable) m_SpatialItemArray[i+ 2 * s_iArrayLength];
        }

        m_iwidth = 80;
        m_iHeight = 30;

        m_Board = new String[m_iHeight][m_iwidth];
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < m_iHeight; i++) {
            for (int k = 0; k < m_iwidth; k++) {
                if (i == 0 || i == m_iHeight - 1)
                    m_Board[i][k] = "_";
                else if (k == 0 || k == m_iwidth - 1)
                    m_Board[i][k] = "|";
                else
                    m_Board[i][k] = " ";
            }
        }
    }

    void step() {
        for (SpatialItem item : m_SpatialItemArray) {
            item.step();
        }

        for(var consomable : m_ConsumableArray){
            consomable.consume();
        }
    }

    void draw() {
        for (var item : m_SpatialItemArray) {
            item.draw(m_Board);
        }
        StringBuilder board = new StringBuilder();

        for (int i = 0; i < m_iHeight; i++) {
            board.append(String.join("", m_Board[i]));
            board.append("\n");
        }
        System.out.println(board);

    }

    boolean hasLivingCreatures() {
        return true;
    }

    public void spray(int p_iQuantity) {
        getWaterSpot().setQuantity(getWaterSpot().getQuantity() + p_iQuantity);
    }

    public WaterSpot getWaterSpot() {
        return (WaterSpot) m_SpatialItemArray[0];
    }
}
