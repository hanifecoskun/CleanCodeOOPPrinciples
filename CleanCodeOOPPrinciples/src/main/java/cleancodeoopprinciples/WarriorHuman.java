package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public class WarriorHuman extends Human {

    public WarriorHuman(String humanName, Weapon weapon) {
        super(humanName, weapon);
    }

    private void printWeapon(Weapon weapon){
        System.out.println(weapon.getWeaponName());
    }

    @Override
    public void useWeapon() {

        WeaponType type = getWeapon().getType();

        // Gereksiz if blokları kaldırılmıştır.
        if (type != null) {
            System.out.println(getWeapon().getWeaponName() + " is used by " + humanName);
        } else {
            System.out.println("Unknown weapon!");
        }
    }

    @Override
    public void craftWeapon(WeaponType type) {

    }
}
