package cleancodeoopprinciples;

import clearoopandprinciples.weapon.Weapon;
import clearoopandprinciples.weapon.WeaponType;

public abstract class Human {

    public String humanName;
    public Weapon weapon;

    public Human(String humanName, Weapon weapon) {
        this.humanName = humanName;
        this.weapon = weapon;
    }

    /**
     *
     * @return human name
     */
    public String getHumanName() {
        return humanName;
    }

    /**
     *
     * @return weapon
     */
    public Weapon getWeapon() {
        return weapon;
    }

    public abstract void useWeapon();

    public abstract void craftWeapon(WeaponType type);
}
