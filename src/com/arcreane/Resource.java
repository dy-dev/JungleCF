package com.arcreane;

public class Resource extends Drawable {

    void isDrinked(Animal p_Animal){
        p_Animal.refillLifePoints(this);
    }
}
