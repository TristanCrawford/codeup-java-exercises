public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s!\n", getName());
    }

    public Person(String name) {
        this.setName(name);
    }

    public static void main(String[] args) {
        Person allie = new Person("Allie");
        allie.sayHello();
    }
}
