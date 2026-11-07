public class Cat extends Pet implements Feedable, Playable {

    public Cat(String petId, String name) {
        super(petId, name);
    }

    public Cat(String petId, String name, int hunger, int health, int happiness) {
        super(petId, name, hunger, health, happiness);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " berkata: Meow!");
    }

    @Override
    public void feed() {
        setHunger(getHunger() - 25);
        setHealth(getHealth() + 5);
        System.out.println(getName() + " sudah diberi makan.");
    }

    @Override
    public void play() {
        setHappiness(getHappiness() + 15);
        setHunger(getHunger() + 10);
        System.out.println("Kamu bermain dengan " + getName() + ".");
    }

    @Override
    public void checkCondition() {
        System.out.println("\nMemeriksa kondisi kucing...");
        if (getHunger() >= 80) {
            setHealth(getHealth() - 10);
            setHappiness(getHappiness() - 5);
            System.out.println(getName() + " terlalu lapar. Kesehatan dan kebahagiaannya menurun.");
        } else if (getHappiness() < 30) {
            setHealth(getHealth() - 5);
            System.out.println(getName() + " kurang bahagia. Kesehatannya sedikit menurun.");
        } else {
            setHealth(getHealth() + 2);
            System.out.println(getName() + " dalam kondisi baik.");
        }
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Suara      : Meow");
    }
}
