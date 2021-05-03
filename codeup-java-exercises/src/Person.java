public class Person {

    public static void main(String[] args){
        Person alex = new Person("aleksander");
        alex.sayHello();
        System.out.println(alex.getName());
        alex.setName("alexander");


        // exercise block from java.codeup.com
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); // true
        System.out.println(person1 == person2); //false

        Person person3 = new Person("John");
        Person person4 = person3; // same memory reference
        System.out.println(person3 == person4); //true

        Person person5 = new Person("John");
        Person person6 = person5; // same memory location both names john
        System.out.println(person5.getName()); //john
        System.out.println(person6.getName()); // john
        person6.setName("Jane"); // now name Jane
        System.out.println(person5.getName()); // john, incorrect should be jane
        System.out.println(person6.getName()); //jane

    }
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        System.out.print(this.name + "\n");
    }

    public void sayHello(){
        System.out.printf("%s is in the house y'all give it up!!!\n", this.name);
    }
}
