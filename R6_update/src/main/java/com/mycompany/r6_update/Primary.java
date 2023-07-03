package com.mycompany.r6_update;

public class Primary extends Weapon{
    
    private  String[] sights;
    private  String[] barrels;
    private  String[] grips;
    private  boolean underbarrel;

    public Primary(WeaponTypes weaponType, String name, int id) {
        super(weaponType, name, id);
    }
    
    
}
