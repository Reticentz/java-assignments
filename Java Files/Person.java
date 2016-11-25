public class Person
{
    private String firstName;
    private String lastName;
	 private String middleName;

    public Person()
    {
    	firstName = "";
		middleName = "";
      lastName = "";
    }//end method Person

    public Person(String first, String middle, String last)
    {
    	setName(first, middle, last);
    }//end method Person

    public void setName(String first, String middle, String last)
    {
    	firstName = first;
		middleName = middle;
      lastName = last;
    }//end method setName
	 
	 public void setFirstName(String first)
    {
      firstName = first;
    }//end method setFirstName
	 
	 public void setMiddleName(String middle)
    {
      middleName = middle;
    }//end method setMiddleName
	 
	 public void setLastName(String last)
    {
      lastName = last;
    }//end method setLastName

    public String getFirstName()
    {
    	return firstName;
    }//end method getFirstName
	 
	 public String getMiddleName()
	 {
	 	return middleName;
	 }//end method getMiddleName

    public String getLastName()
    {
    	return lastName;
    }//end method getLastName
	 
	 public boolean checkFirstName(String first)
	 {
	 	return (firstName == first);
	 }//end method checkFirstName
	 
	 public boolean checkMiddleName(String middle)
	 {
	 	return (middleName == middle);
	 }//end method checkMiddleName
	 
	 public boolean checkLastName(String last)
	 {
	 	return (lastName == last);
	 }//end method checkLastName
	 
    public String toString()
    {
    	return (firstName + " " + middleName + " " + lastName);
    }//end method toString
	 
	 public boolean equals(Person object1, Person object2)
	 {
		return (object1.getFirstName() == object2.getFirstName() && object1.getMiddleName() == object2.getMiddleName() && object1.getLastName() == object2.getLastName());
	 }//end method equals

	 public getCopy(Person object1, Person object2)
	 {
		return copy;
	 }//end method getCopy

	 public void makeCopy(Person object)
	 {
		Person copy = new Person();
		copy.setFirstName(object.getFirstName());
		copy.setMiddleName(object.getMiddleName());
		copy.setLastName(object.getLastName());
	 }//end method makeCopy
}//end class Chap8_4