public class Person
{
    private String firstName;
    private String lastName;
	 private String middleName;

    public void Person()
    {
    	firstName = "";
		middleName = "";
      lastName = "";
    }//end method Person

    public void Person(String first, String middle, String last)
    {
    	setName(first, middle, last);
    }//end method Person
	 
	 public void PersonLastName(String last)
    {
    	setLastName(last);
    }//end method PersonLastName
	 
	 public void PersonFirstName(String first)
    {
    	setFirstName(first);
    }//end method PersonFirstName
	 
	 public void PersonMiddleName(String middle)
    {
    	setMiddleName(middle);
    }//end method PersonMiddleName
	 
    public String toString()
    {
    	return (firstName + " " + lastName);
    }//end method toString

    public void setName(String first, String middle, String last)
    {
    	firstName = first;
		middleName = middle;
      lastName = last;
    }//end method setName
	 
	 public void setLastName(String last)
    {
      lastName = last;
    }//end method setLastName
	 
	 public void setFirstName(String first)
    {
      firstName = first;
    }//end method setFirstName
	 
	 public void setMiddleName(String middle)
    {
      middleName = middle;
    }//end method setMiddleName

    public String getFirstName()
    {
    	return firstName;
    }//end method getFirstName

    public String getLastName()
    {
    	return lastName;
    }//end method getLastName
	 
	 public String getMiddleName()
	 {
	 	return middleName;
	 }//end method getMiddleName
	 
	 public boolean checkLastName(String last)
	 {
	 	return (lastName == last);
	 }//end method checkLastName
	 
	 public boolean checkFirstName(String first)
	 {
	 	return (firstName == first);
	 }//end method checkFirstName
	 
	 public boolean checkMiddleName(String middle)
	 {
	 	return (middleName == middle);
	 }//end method checkMiddleName
	 
	 public boolean equals(Person object1, Person object2)
	 {
		return (object1.getFirstName() == object2.getFirstName() && object1.getMiddleName() == object2.getMiddleName() && object1.getLastName() == object2.getLastName());
	 }//end method equals

	 public void getCopy(Person object1, Person object2)
	 {
		object2.setFirstName(object1.getFirstName());
		object2.setMiddleName(object1.getMiddleName());
		object2.setLastName(object1.getLastName());
	 }//end method getCopy

	 public void makeCopy(Person object)
	 {
		Chap8_4 copy = new Chap8_4();
		copy.setFirstName(object.getFirstName());
		copy.setMiddleName(object.getMiddleName());
		copy.setLastName(object.getLastName());
	 }//end method makeCopy
}//end class Chap8_4