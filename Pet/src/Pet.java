import java.util.Objects;

public abstract class Pet {
    private String name;
    private int age;
    private boolean isAdopted;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdopted = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " по имени " + name + ", возраст " + age + " года, усыновлен: " + (isAdopted ? "Да" : "Нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && Objects.equals(getType(), pet.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getType());
    }
}
