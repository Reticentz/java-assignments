public class TestProgPerson
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
		  Person person3 = new Person();
		  Person person4 = new Person("Donald", "Lee", "Jackson");

        person1.setName("Ashley", "Smith", "Blair");
		  person2.setName(person4.getFirstName(), person4.getMiddleName(), person4.getLastName());
		  
		  person2.makeCopy(person3);
		  
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
    }//end main
}