// Class representing a Pet
public class Pet {
    private String name;
    private String type; // e.g., Dog, Cat, Rabbit
    private int age; // Age of the pet
    private boolean isAdopted; // Adoption status

    // Constructor
    public Pet(String name, String type, int age, boolean isAdopted) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.isAdopted = isAdopted;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAdopted(boolean adopted) {
        this.isAdopted = adopted;
    }

    // Method to display Pet information
    public void displayInfo() {
        System.out.println("Pet Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age + " years");
        System.out.println("Adopted: " + (isAdopted ? "Yes" : "No"));
    }

    // Overriding the toString() method for clean output
    @Override
    public String toString() {
        return "Pet{name='" + name + "', type='" + type + "', age=" + age + ", adopted=" + isAdopted + "}";
    }
}
