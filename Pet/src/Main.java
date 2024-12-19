public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Happy Paws Shelter", "123 Main Street");

        Pet pet1 = new Pet("Buddy", "Dog", 3, false);
        Pet pet2 = new Pet("Mittens", "Cat", 2, false);

        shelter.addPet(pet1);
        shelter.addPet(pet2);

        shelter.displayAllPets();

        Adopter adopter1 = new Adopter("John Doe", 30, "johndoe@example.com");

        shelter.adoptPet(pet1, adopter1);

        shelter.adoptPet(pet1, adopter1);

        shelter.displayAllPets();
    }
}
