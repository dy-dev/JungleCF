package com.arcreane;

public class Plant {
    Coords m_Coords;

    private static int s_iMaxPlantNRJPoints;

    private float m_fGrowingSpeed;
    private float m_fArea;
    private int m_iLiveSpan;
    private int m_iAge;
    private int m_iMaxNbNRJ;
    private int m_iCurrentNRJ;

    public static int getMaxPlantNRJPoints() {
        return s_iMaxPlantNRJPoints;
    }

    public static void setMaxPlantNRJPoints(int s_iMaxPlantNRJPoints) {
        Plant.s_iMaxPlantNRJPoints = s_iMaxPlantNRJPoints;
    }

    public float getGrowingSpeed() {
        return m_fGrowingSpeed;
    }

    public void setGrowingSpeed(float m_fGrowingSpeed) {
        this.m_fGrowingSpeed = m_fGrowingSpeed;
    }

    public float getArea() {
        return m_fArea;
    }

    public void setArea(float m_fArea) {
        this.m_fArea = m_fArea;
    }

    public int getLiveSpan() {
        return m_iLiveSpan;
    }

    public void setLiveSpan(int m_iLiveSpan) {
        this.m_iLiveSpan = m_iLiveSpan;
    }

    public int getAge() {
        return m_iAge;
    }

    public void setAge(int m_iAge) {
        this.m_iAge = m_iAge;
    }

    public int getMaxNbNRJ() {
        return m_iMaxNbNRJ;
    }

    public void setMaxNbNRJ(int m_iMaxNbNRJ) {
        this.m_iMaxNbNRJ = m_iMaxNbNRJ;
    }

    public int getCurrentNRJ() {
        return m_iCurrentNRJ;
    }

    public void setCurrentNRJ(int m_iCurrentNRJ) {
        this.m_iCurrentNRJ = m_iCurrentNRJ;
    }

    void draw(){

    }

    void step(){

    }

    void pop(){
    }

    void grow(){
    }

    void die(){
    }

}
