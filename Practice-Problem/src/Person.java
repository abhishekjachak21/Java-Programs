import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // equals() implementation
//    Check if both references are same
//    Check null
//    Check class type
//    Compare fields

    @Override
    public boolean equals(Object obj) {
        // 1. same reference
        if (this == obj) return true;

        // 2. null or different class
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. cast
        Person person = (Person) obj;

        // 4. compare fields
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    // hashCode() implementation
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // main() method
    public static void main(String[] args) {

        Person p1 = new Person("Abhi", 23);
        Person p2 = new Person("Abhi", 23);
        Person p3 = new Person("Danny", 25);

        System.out.println("p1 == p2: " + (p1 == p2));             // false
        System.out.println("p1.equals(p2): " + p1.equals(p2));     // true
        System.out.println("p1.equals(p3): " + p1.equals(p3));     // false
    }
}
