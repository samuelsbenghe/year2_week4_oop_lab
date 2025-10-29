//Pet Project
package Task2;

public class Main {
    public static void main(String[] args) {
        var pet1 = new Pet("Mike", 13);

        var pet2 = new Pet();
        pet2.setName("Eliza");
        pet2.setAge(32);

        var pet3 = new Pet();
        System.out.println("Pet 1: " + pet1.getName() + " is " + pet1.getAge() + " years old. Hashcode: "
                + pet1.hashCode());
        System.out.println("Pet 2: " + pet2.getName() + " is " + pet2.getAge() + " years old. Hashcode: "
                + pet2.hashCode());
        System.out.println("Pet 3: " + pet3.getName() + " is " + pet3.getAge() + " years old. Hashcode: "
                + pet3.hashCode());
    }
}
