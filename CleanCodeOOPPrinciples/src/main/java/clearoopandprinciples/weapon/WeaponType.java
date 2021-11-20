package clearoopandprinciples.weapon;

//weapon name enum üzerinden alınacak şekilde düzenlenmiştir.
public enum WeaponType {
    knife("knife"),
    sword("sword"),
    riffle("riffle");

    private String name;

    WeaponType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
