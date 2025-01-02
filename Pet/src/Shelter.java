import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shelter {
    private String name;
    private String address;
    private List<Pet> pets;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " добавлен в приют.");
    }

    public void displayAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }

    public void adoptPet(Pet pet, Adopter adopter) {
        if (pet.isAdopted()) {
            System.out.println("Питомец " + pet.getName() + " уже усыновлен.");
        } else {
            pet.setAdopted(true);
            System.out.println(adopter.getName() + " усыновил питомца " + pet.getName() + ".");
        }
    }

    public List<Pet> filterByType(String type) {
        return pets.stream().filter(pet -> pet.getType().equalsIgnoreCase(type)).collect(Collectors.toList());
    }

    public void sortPetsByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }
}
