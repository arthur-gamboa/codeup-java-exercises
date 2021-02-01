class Person {
    private String name;

    public String getName() {
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("Hello, my name is " + this.name);
    }

//TODO: The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.
    Person(String name){
        this.name = name;
    }

//TODO: Create a `main` method on the class that creates a new `Person` object and tests the above methods.
    public static void main(String[] args) {
        Person bob = new Person("Bob");
        System.out.println(bob.getName());
        bob.setName("Bobby");
        bob.sayHello();


//TODO: The following code blocks make use of the Person class from the previous exercise. For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}

