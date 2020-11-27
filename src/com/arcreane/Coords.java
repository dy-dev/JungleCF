package com.arcreane;

import com.arcreane.animal.Predator;

public class Coords {

    class Pair{
        private int m_iX;
        private int m_iY;

        @Override
        public boolean equals(Object obj) {
            return ((Pair)obj).m_iX == m_iX && ((Pair)obj).m_iY == m_iY;
        }
    }

    private Pair m_InnerCoords;

    public int getX() {
        return m_InnerCoords.m_iX;
    }

    public void setX(int m_iX) {
        m_InnerCoords.m_iX = m_iX;
    }

    public int getY() {
        return m_InnerCoords.m_iY;
    }

    public void setY(int m_iY) {
        m_InnerCoords.m_iY = m_iY;
    }

    public Coords() {
        m_InnerCoords = new Pair();
        m_InnerCoords.m_iX = (int)(Math.random()*80);
        m_InnerCoords.m_iY = (int) (Math.random()*30);
    }

    public Coords(int p_iX, int p_iY) {
        m_InnerCoords.m_iX = p_iX;
        m_InnerCoords.m_iY = p_iY;
    }

    @Override
    public boolean equals(Object obj) {
        return this.m_InnerCoords.equals(obj);
    }
}
