package w03_task_1;

public class Person extends Customer {
	
    private String firstName;
    private String lastName;
    private String personNationalId;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonNationalId() {
        return personNationalId;
    }

    public void setPersonNationalId(String clientIdNum) {
        this.personNationalId = clientIdNum;
    }
}