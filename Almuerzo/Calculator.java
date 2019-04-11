package calcu;

import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

public class Calculator {
	public static int addString(String numberString) {

		int suma = 0;
		String newgativeNumbers = "";
		if (numberString != null) {
			int entero;
			String[] number = numberString.split(",");

			for (int i = 0; i < number.length; i++) {
				try {					
					entero = Integer.parseInt(number[i]);
					if (entero <= 100 && entero > 0) {
						suma = suma + entero;
					}				
					
				} catch (Exception e) {
					// nothing;
					
				}
			}			
			
		}
		return suma;
	}
}
