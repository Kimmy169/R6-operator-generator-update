package com.mycompany.r6_update;

public class Primary extends Weapon{
    
    private  String[] sights = {"3.0X","2.5X","1.5X","1.0X","none"};
    private  String[] barrels = {"muzzle break","extended barrel", "compensator", "","none"};
    private  String[] grips = {"angled grip", "vertical grip","none"};
    private  boolean underbarrel = true;
    
    public Primary(WeaponTypes weaponType, String name, int id,String[] sights,String[] barrels,String[] grips, boolean underbarrel) {
        super(weaponType, name, id);
        this.sights = sights;
        this.barrels = barrels;
        this.grips = grips;
        this.underbarrel = underbarrel;
    }
    
}
