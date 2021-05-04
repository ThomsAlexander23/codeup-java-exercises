import java.util.Arrays;

public class ArraysExercises {
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person olesia = new Person("Olesia");
        Person rhaegar = new Person("Rheagar");
        Person vasya = new Person("Vasya");
        Person[] people = {olesia, rhaegar, vasya};
        printArray(people);
        printArray(addPerson(people, new Person("Alex")));
        printArray(addPerson(people, new Person("Brett")));
        printArray(addPerson(people, new Person("Alex"), new Person("Alex"), new Person("Brett"), new Person("Kelsey"), new Person("Katie")));

    }

    public static Person[] addPerson(Person[] people, Person person){
        int arrayLength = people.length;
        Person[] newArray = Arrays.copyOf(people, arrayLength + 1);
        newArray[arrayLength] = new Person(person.getName());
        return newArray;
    }

    public static Person[] addPerson(Person[] people, Person...args){
        int count = 0;
        for (int i = 0; i < args.length; i++){
            count += 1;
        }
        int arrayLength = people.length;
        Person[] newArray = Arrays.copyOf(people, arrayLength + count);
        for (int i = people.length; i < newArray.length; i++){
            newArray[i] = new Person(args[i-3].getName());
        }
        return newArray;
    }

    public static Person[] printArray(Person[] people){
        for (int i = 0; i < people.length; i++){
            System.out.print(people[i].getName() + ", ");
        }
        return people;
    }
}
