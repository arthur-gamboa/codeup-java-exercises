import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

//TODO: Create a class inside of src named ArraysExercises. Create a main method for this class to do your work. What happens when you run the following code? Why is Arrays.toString necessary?
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        // Need to import Arrays to call

//TODO: Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        Person person1 = new Person("Albert");
        Person person2 = new Person("Bernard");
        Person person3 = new Person("Charlie");

        Person person4 = new Person("Denise");

        Person[] people = {person1, person2, person3};
//        System.out.println(Arrays.toString(people));
        // or
        for(Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println();
        Person[] editPeople = addPerson(people, person4);
//        System.out.println(Arrays.toString(editPeople));

        for (Person finalPeople : editPeople) {
            System.out.println(finalPeople.getName());
        }
    }

//TODO: Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    public static Person[] addPerson(Person[] people, Person newPerson) {
        Person[] editPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            editPeople[i] = people[i];
        }
        editPeople[editPeople.length - 1] = newPerson;
        return editPeople;
    }
//        Person[] morePeople = Arrays.copyOf(people, people.length + 1) {
//            morePeople[morePeople.length - 1] = newPerson;
//            return morePeople;
//        }
}
