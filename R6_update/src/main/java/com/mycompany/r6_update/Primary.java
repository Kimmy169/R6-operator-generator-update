package com.mycompany.r6_update;

public class Primary extends Weapon{
    
    private final String[] sights = {"3.0X","2.5X","1.5X","1.0X","none"};
    private final String[] barrels = {"muzzle break","extended barrel", "compensator", "","none"};
    private final String[] grips = {"angled grip", "vertical grip","none"};
    private final boolean underbarrel = true;
    
    public Primary(WeaponTypes weaponType, String name, int id) {
        super(weaponType, name, id);
    }
    
}
