package w03_task_1;

public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        num1 = num2; //num1 points num2/num1 become 20
        num2 = 80;
        System.out.println(num1 + "\n");

        

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{10,20,30};
        numbers1 = numbers2;
        numbers2[0] = 9000;
        System.out.println(numbers1[0] + "\n");

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        System.out.println("");
        
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Izmir");
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.save();
        customerManager.delete();

        System.out.println("");
        
        Company company = new Company();
        company.setTaxId("3246783246733243" + "\n");
        company.setCompanyName("SpaceMAX" + "\n");
        company.setId(2);

        System.out.println("");
        
        CustomerManager customerManager2 = new CustomerManager(new Person(), new TeacherCreditManager());
        Person person = new Person();
        person.setPersonNationalId("2343242" + "\n");
        customerManager2.grantCredit();


    }
}
