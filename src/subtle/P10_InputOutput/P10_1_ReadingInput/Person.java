package subtle.P10_InputOutput.P10_1_ReadingInput;

public class Person {
    
    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Person created. Name: "
            + name + ", Age: " + age + ", Phone Number: " + phoneNumber);
    }
}
