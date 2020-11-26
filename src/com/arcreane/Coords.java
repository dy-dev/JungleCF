package com.arcreane;

public class Coords {
    private int m_iX;
    private int m_iY;

    public int getX() {
        return m_iX;
    }

    public void setX(int m_iX) {
        this.m_iX = m_iX;
    }

    public int getY() {
        return m_iY;
    }

    public void setY(int m_iY) {
        this.m_iY = m_iY;
    }

    public Coords() {
    }

    public Coords(int p_iX, int p_iY) {
        m_iX = p_iX;
        m_iY = p_iY;
    }

}
