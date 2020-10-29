package com.arcreane;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Terrain extends Drawable {
    private int m_iWidth;
    private int m_iHeight;

    private String[][] m_Board;

    public int getWidth() {
        return m_iWidth;
    }

    public int getHeight() {
        return m_iHeight;
    }

    Drawable[] m_Drawable = new Drawable[300];
    PrintStream outStream;

    public Terrain() {
        try {
            outStream = new PrintStream(System.out, true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        m_iWidth = 120;
        m_iHeight = 20;

        initBoard();
        m_Drawable[0] = new WaterSpot(this);
    }

    public WaterSpot getWaterSpot() {
        return (WaterSpot) m_Drawable[0];
    }

    public void init() {
        for (int i = 1; i < 25; i++) {
            m_Drawable[i] = new Predator(null);
        }
        for (int i = 50; i < 75; i++) {
            m_Drawable[i] = new Prey(null);
        }

        for (int i = 100; i < 125; i++) {
            m_Drawable[i] = new Plant();
        }
    }

    private void initBoard() {
        m_Board = new String[m_iHeight][];
        for (int i = 0; i < m_iHeight; i++) {
            m_Board[i] = new String[m_iWidth];
        }

        for (int i = 0; i < m_iHeight; i++) {
            for (int k = 0; k < m_iWidth; k++) {
                if ((k == 0 || k == m_iWidth - 1) && i != 0)
                    m_Board[i][k] = "|";
                else if (i == 0 || i == m_iHeight - 1)
                    m_Board[i][k] = "_";
                else
                    m_Board[i][k] = " ";
            }
        }
    }

    public void step() {
        for (Drawable drawable : m_Drawable) {
            if (drawable != null)
                drawable.step();
        }
    }

    public void draw() {
        for (Drawable drawable : m_Drawable) {
            if (drawable != null)
                drawable.draw(m_Board);
        }
        var start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            String board = "";

            for (int k = 0; k < m_iHeight; k++) {
                board += String.join("", m_Board[k]);
//            for (int i = 0; i < m_iWidth; i++) {
//                outStream.print(m_Board[k][i]);
//            }
                //outStream.println("");
                board += "\n";
            }
            outStream.print(board);
        }
        var end1 = System.nanoTime() - start;
        start = System.nanoTime();
        for (int j = 0; j < 1000; j++) {

            for (int k = 0; k < m_iHeight; k++) {
                for (int i = 0; i < m_iWidth; i++) {
                    outStream.print(m_Board[k][i]);
                }
                outStream.println("");
            }
        }
        var end2 = System.nanoTime() - start;
        start = System.nanoTime();
        for (int j = 0; j < 1000; j++) {
            StringBuilder board = new StringBuilder();

            for (int k = 0; k < m_iHeight; k++) {
                board.append(String.join("", m_Board[k])).append("\n");
            }
            outStream.print(board);
        }
        var end3 = System.nanoTime() - start;

        System.out.println(end1/Math.pow(10,9));
        System.out.println(end2/Math.pow(10,9));
        System.out.println(end3/Math.pow(10,9));

    }

    boolean hasLivingCreatures() {
        return true;
    }

    public void spray(float p_fQuantity) {
        getWaterSpot().addWater(p_fQuantity);

    }

    public boolean isSpotOccupied(Coords p_Coords) {
        if (getWaterSpot().isInWater(p_Coords))
            return true;

        for (var drawable : m_Drawable) {
            if (drawable != null && drawable.getCoords().equals(p_Coords))
                return true;
        }
        return false;
    }

    public Coords findClosestFreeSpot(Coords p_coords) {
        //Write an algorithm to find free coords closest
        // to the coordinates passed as parameter
        return null;
    }

    public int getFreePredatorIndex() {
        //Write an algorithm to find the first free indew
        //where the predator passed in parameter can be
        //stored
        return 0;
    }

    public void insertPredator(int p_iIndex, Predator p_Predator) {
       /* if (p_iIndex < m_PredatorsArray.length &&
                p_iIndex >= 0)
            m_PredatorsArray[p_iIndex] = p_Predator;*/
    }

}
