public abstract class Pet {
    public static final int MAX_STAT = 100;
    public static final int MIN_STAT = 0;

    private final String petId;
    private String name;
    private int hunger;
    private int health;
    private int happiness;

    // Constructor pertama: menggunakan nilai kondisi awal.
    public Pet(String petId, String name) {
        this(petId, name, 30, 100, 70);
    }

    // Constructor kedua: memungkinkan kondisi awal ditentukan.
    public Pet(String petId, String name, int hunger, int health, int happiness) {
        this.petId = petId;
        this.name = name;
        this.hunger = limitStat(hunger);
        this.health = limitStat(health);
        this.happiness = limitStat(happiness);
    }

    private int limitStat(int value) {
        return Math.max(MIN_STAT, Math.min(MAX_STAT, value));
    }

    public String getPetId() {
        return petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = limitStat(hunger);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = limitStat(health);
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = limitStat(happiness);
    }

    public void showStatus() {
        System.out.println("\n===== STATUS HEWAN =====");
        System.out.println("ID         : " + petId);
        System.out.println("Nama       : " + name);
        System.out.println("Jenis      : " + getClass().getSimpleName());
        System.out.println("Kelaparan  : " + hunger + "/100 (semakin tinggi semakin lapar)");
        System.out.println("Kesehatan  : " + health + "/100");
        System.out.println("Kebahagiaan: " + happiness + "/100");
    }

    public void introduce() {
        System.out.println(name + " adalah hewan peliharaan virtualmu.");
    }

    public abstract void makeSound();

    // Subclass wajib memeriksa sekaligus memperbarui state hewan.
    public abstract void checkCondition();
}
