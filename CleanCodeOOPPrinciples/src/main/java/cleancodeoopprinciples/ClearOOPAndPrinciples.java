package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public class ClearOOPAndPrinciples {

    public static void main(String[] args) {

        // Constant değerler için bir class oluşturuldu.
        CraftsmanHuman craftsmanHuman = new CraftsmanHuman(CommonConstants.CRAFTSMAN);

        craftsmanHuman.craftWeapon(WeaponType.riffle);

        Weapon weapon = craftsmanHuman.getWeapon();

        WarriorHuman warriorHuman = new WarriorHuman(CommonConstants.WARRIOR, weapon);

        warriorHuman.useWeapon();
    }

}
