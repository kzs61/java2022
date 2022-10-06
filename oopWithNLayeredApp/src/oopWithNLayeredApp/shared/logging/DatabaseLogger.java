package oopWithNLayeredApp.shared.logging;

import java.security.PublicKey;

public class DatabaseLogger implements Logger {

	public void log(String data) {
		System.out.println("Logged to DB : " + data);
	}

}
