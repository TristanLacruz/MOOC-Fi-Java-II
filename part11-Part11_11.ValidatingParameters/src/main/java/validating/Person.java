package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name not valid");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age should be between 0 to 120!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
