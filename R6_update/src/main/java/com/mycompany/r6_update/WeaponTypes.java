package com.mycompany.r6_update;

public enum WeaponTypes {
    SHOTGUN("shotgun"),
    HANDGUN("handgun"),
    ASSALUT_RIFLE("assalut rifle"),
    SUBMACHINE_GUN("submachine gun"),
    MARKSMAN_RIFLE("marksman rifle"),
    HAND_CANNON("hand cannon"),
    MACHINE_PISTOL("machine pistol");

    private final String name;

    private WeaponTypes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
