package Task2;

public class Pet {
    private String name;
    private int age;

    public Pet() {
        name = "Unnamed";
        age = 0;
    }

    public Pet(String petName, int petAge) {
        name = petName;
        age = petAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
