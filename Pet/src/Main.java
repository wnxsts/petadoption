import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем приют
        Shelter shelter = new Shelter("Happy Paws Shelter", "123 Main Street");

        // Создаем питомцев
        Pet dog1 = new Dog("Buddy", 3);
        Pet cat1 = new Cat("Mittens", 2);
        Pet dog2 = new Dog("Charlie", 5);

        // Добавляем питомцев в приют
        shelter.addPet(dog1);
        shelter.addPet(cat1);
        shelter.addPet(dog2);

        // Отображаем всех питомцев
        System.out.println("\nВсе питомцы в приюте:");
        shelter.displayAllPets();

        // Фильтрация: только собаки
        System.out.println("\nФильтрация: только собаки");
        List<Pet> dogs = shelter.filterByType("Dog");
        for (Pet dog : dogs) {
            System.out.println(dog);
        }

        // Сортировка питомцев по возрасту
        System.out.println("\nСортировка по возрасту:");
        shelter.sortPetsByAge();
        shelter.displayAllPets();

        // Создаем усыновителя
        Adopter adopter = new Adopter("John Doe", 30, "johndoe@example.com");

        // Усыновляем питомца
        shelter.adoptPet(dog1, adopter);

        // Повторная попытка усыновить того же питомца
        shelter.adoptPet(dog1, adopter);

        // Отображаем оставшихся питомцев
        System.out.println("\nПосле усыновления:");
        shelter.displayAllPets();
    }
}
