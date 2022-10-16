public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isAdult() {
        return getAge() > 18;
    }

    public void increaceAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException(" Возраст не может быть отрицательным");
        }
        this.age = age + increment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}
