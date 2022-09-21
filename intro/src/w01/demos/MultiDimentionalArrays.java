package w01.demos;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
		String[][] cities = new String[3][3];

		cities[0][0] = "NY";
		cities[0][1] = "Washington, DC";
		cities[0][2] = "Miami";
		cities[1][0] = "Chicago";
		cities[1][1] = "Colorado";
		cities[1][2] = "Kentucky";
		cities[2][0] = "Seattle";
		cities[2][1] = "Portland";
		cities[2][2] = "LA";

//        print cities based on their region East coast, Central and West coast
		for (int i = 0; i <= 2; i++) {
			System.out.println("----------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}