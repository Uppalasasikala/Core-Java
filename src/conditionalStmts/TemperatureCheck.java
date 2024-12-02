package conditionalStmts;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int temperature = scr.nextInt();
		String weather;
		if (temperature < 0) {
            weather = "Freezing cold";
        } else if (temperature >= 0 && temperature < 10) {
            weather = "Very cold";
        } else if (temperature >= 10 && temperature < 20) {
            weather = "Chilly";
        } else if (temperature >= 20 && temperature < 30) {
            weather = "Mild and pleasant";
        } else if (temperature >= 30 && temperature < 40) {
            weather = "Hot";
        } else {
            weather = "Extremely hot";
        }
        System.out.println(weather);
        scr.close();

	}

}
