import java.util.ArrayList;

public class Shelter {
    private String name;
    private String address;
    private ArrayList<Pet> pets; // Список питомцев

    // Конструктор
    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>(); // Инициализация списка
    }

    // Метод для добавления питомца
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    // Метод для отображения всех питомцев
    public void displayAllPets() {
        System.out.println("Pets in Shelter " + name + ":");
        for (Pet pet : pets) {
            pet.displayInfo();
        }
    }

    // Метод для усыновления питомца
    public void adoptPet(Pet pet, Adopter adopter) {
        if (!pet.isAdopted()) {
            pet.setAdopted(true);
            System.out.println(adopter.getName() + " adopted " + pet.getName());
        } else {
            System.out.println(pet.getName() + " is already adopted.");
        }
    }
}
