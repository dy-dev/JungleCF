package com.arcreane;

public class WaterSpot extends Resource {
    int m_iWidth;
    int m_iHeight;
    float m_fQuantity;
    float m_fEvaporationSpeed;

    WaterSpot(Terrain p_Terrain) {
        m_fQuantity = 500.0f;
        m_Coords = new Coords(p_Terrain.getWidth() / 2,
                p_Terrain.getHeight() / 2);

        m_iHeight = p_Terrain.getHeight() / 5;
        m_iWidth = p_Terrain.getWidth() / 5;
    }

    @Override
    public void draw(String[][] p_Board) {
        for (int i = -m_iWidth/2; i < m_iWidth/2; i+=2) {
            for (int k = -m_iHeight/2; k < m_iHeight/2; k++) {
                p_Board[m_Coords.getY()+k][m_Coords.getX() + i ] = "\uD83C\uDF0A";
                p_Board[m_Coords.getY()+k][m_Coords.getX() + i +1] = "";
            }
        }
    }

    public void step() {

    }

    public void addWater(float p_fQuantity) {
        m_fQuantity += p_fQuantity;
    }

    public boolean isInWater(Coords p_Coords) {
        return (Math.abs(p_Coords.getX() - m_Coords.getX()) < m_iWidth / 2 + 1 &&
                Math.abs(p_Coords.getY() - m_Coords.getY()) < m_iHeight / 2 + 1);

    }

    @Override
    void isDrinked(Animal p_Animal) {
        m_fQuantity -= p_Animal.drinkWater();
    }
}
