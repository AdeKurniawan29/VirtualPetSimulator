import java.util.Scanner;

public class Main {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("      VIRTUAL PET SIMULATOR     ");
        System.out.println("================================");

        Pet pet = choosePet();

        if (pet == null) {
            System.out.println("Permainan selesai.");
            INPUT.close();
            return;
        }

        pet.introduce();
        pet.makeSound();

        boolean running = true;
        while (running) {
            showMenu();
            int choice = readInt("Pilih aktivitas: ");

            switch (choice) {
                case 1:
                    // Polimorfisme melalui variabel referensi bertipe interface.
                    Feedable feeder = (Feedable) pet;
                    feeder.feed();
                    break;
                case 2:
                    Playable player = (Playable) pet;
                    player.play();
                    break;
                case 3:
                    pet.checkCondition();
                    break;
                case 4:
                    pet.showStatus();
                    break;
                case 5:
                    pet.makeSound();
                    break;
                case 0:
                    running = false;
                    System.out.println("Terima kasih sudah merawat " + pet.getName() + "!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
            }
        }

        INPUT.close();
    }

    private static Pet choosePet() {
        System.out.println("\nPilih hewan peliharaan:");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        System.out.println("0. Keluar");

        int choice = readInt("Pilihan: ");
        System.out.print("Masukkan nama hewan: ");
        String name = INPUT.nextLine().trim();

        if (name.isEmpty()) {
            name = (choice == 1) ? "Mimi" : "Buddy";
        }

        if (choice == 1) {
            return new Cat("CAT-001", name);
        } else if (choice == 2) {
            return new Dog("DOG-001", name);
        } else {
            return null;
        }
    }

    private static void showMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Beri makan");
        System.out.println("2. Ajak bermain");
        System.out.println("3. Periksa kondisi");
        System.out.println("4. Lihat status");
        System.out.println("5. Dengarkan suara");
        System.out.println("0. Keluar");
    }

    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String value = INPUT.nextLine();
            try {
                return Integer.parseInt(value.trim());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
            }
        }
    }
}
