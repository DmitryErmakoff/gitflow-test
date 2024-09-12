public class Person {
    // Attributes (data members)
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters (accessor methods)
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Setters (mutator methods)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Other methods
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + getFullName());
        System.out.println("Age: " + age);
    }
}