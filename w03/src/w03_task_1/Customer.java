package w03_task_1;

public class Customer {
    
	private int id;
    private String city;

    public Customer() {
        System.out.println("Customer object started");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}