public class Dog extends Pet implements Feedable, Playable {

    public Dog(String petId, String name) {
        super(petId, name);
    }

    public Dog(String petId, String name, int hunger, int health, int happiness) {
        super(petId, name, hunger, health, happiness);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " berkata: Guk!");
    }

    @Override
    public void feed() {
        setHunger(getHunger() - 30);
        setHealth(getHealth() + 7);
        System.out.println(getName() + " sudah diberi makan.");
    }

    @Override
    public void play() {
        setHappiness(getHappiness() + 20);
        setHunger(getHunger() + 15);
        System.out.println("Kamu bermain lempar bola dengan " + getName() + ".");
    }

    @Override
    public void checkCondition() {
        System.out.println("\nMemeriksa kondisi anjing...");
        if (getHunger() >= 80) {
            setHealth(getHealth() - 12);
            setHappiness(getHappiness() - 5);
            System.out.println(getName() + " sangat lapar. Kesehatannya menurun.");
        } else if (getHappiness() < 30) {
            setHealth(getHealth() - 5);
            System.out.println(getName() + " perlu diajak bermain.");
        } else {
            setHealth(getHealth() + 2);
            System.out.println(getName() + " dalam kondisi baik.");
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Suara      : Woof");
    }
}
