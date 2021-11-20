package clearoopandprinciples.weapon;

public class Weapon {

    String weaponName;
    WeaponType type;

    public Weapon(String weaponName, WeaponType type) {
        this.weaponName = weaponName;
        this.type = type;
    }

    /**
     *
     * @return weapon type object
     */
    public WeaponType getType() {
        return type;
    }

    /**
     *
     * @return name of weapon
     */
    public String getWeaponName() {
        return weaponName;
    }
}
