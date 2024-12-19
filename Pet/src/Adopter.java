// Class representing an Adopter
public class Adopter {
    private String name;
    private int age;
    private String contactInfo;

    // Constructor
    public Adopter(String name, int age, String contactInfo) {
        this.name = name;
        this.age = age;
        this.contactInfo = contactInfo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Method to display Adopter information
    public void displayInfo() {
        System.out.println("Adopter Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contactInfo);
    }

    // Overriding the toString() method for clean output
    @Override
    public String toString() {
        return "Adopter{name='" + name + "', age=" + age + ", contactInfo='" + contactInfo + "'}";
    }
}
