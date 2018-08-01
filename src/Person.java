public class Person {

    private String name;

    // returns the person's name
    public String getName() {
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public Person(String name) {
        setName(name);
    }


}
