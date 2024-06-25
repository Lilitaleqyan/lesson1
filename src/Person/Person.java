package Person;

class Person
{

    private final String name;

    private final int age;

    Person (String name, int age)
    {

        this.name = name;

        this.age = age;

    }

    public String getName ()
    {

        return name;

    }



    public int getAge ()
    {

        return age;

    }




}
class Persons

{

    public static void main (String[] args)
    {

        Person person1 = new Person ("Jon", 15);

        Person person2 = new Person ("jeni", 13);

        System.out.println (person1.getName () + " " + person1.getAge ());

        System.out.println (person2.getName () + " " + person2.getAge ());


    }

}