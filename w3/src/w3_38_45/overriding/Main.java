package w3_38_45.overriding;

public class Main {

	public static void main(String[] args) {

//		TeachersCreditManager teachersCreditManager = new Teac

		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new TeachersCreditManager(), new FarmersCreditManager(), new StudentCreditManager()};

		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(1000));

		}

	}

}
