package com.mycompany.r6_update;

import static com.mycompany.r6_update.WeaponTypes.*;

public class Secondary extends Weapon{
    
    private String[] sights = {"3.0X","2.5X","1.5X","1.0X","none"};
    private String[] barrels = {"muzzle break","extended barrel", "compensator", "","none"};
    private String[] grips = {"angled grip", "vertical grip","none"};
    private boolean underbarrel = true;
    
    public Secondary(WeaponTypes weaponType, String name, int id,String[] barrels,String[] sights, String[] grips, boolean underbarrel) {
        super(weaponType, name, id);
        this.barrels = barrels;
        this.sights = sights;
        this.grips = grips;
        this.underbarrel = underbarrel;
    }
}

