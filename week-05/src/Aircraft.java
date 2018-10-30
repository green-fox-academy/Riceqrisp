public class Aircraft extends AircraftCarrier{
    int baseDamage;
    int ammo;
    String type;

    public Aircraft(){
        this.baseDamage = 0;
        ammo = 0;


    }
    public int fight() {
        int damage = 0;
        damage = ammo*baseDamage;
        return damage;
    }
    public void getStatus(){
        lincolnBoard.get() = type;
        System.out.println("type: "  + " , " + ammo + " , " + baseDamage + " , " + "Damage " + fight());
    }

}
