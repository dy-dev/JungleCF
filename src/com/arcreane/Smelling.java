package com.arcreane;

public class Smelling extends Sense {

    public Smelling(Animal p_Owner) {
        super(p_Owner);
    }

    boolean canSmell(Prey p_Prey, Coords p_Coord){
        return false;
    }

}
