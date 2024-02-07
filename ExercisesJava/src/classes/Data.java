package classes;

public class Data {
	int day; 
	int month;
	int year;
	
	Data(){
		day = 1;
		month = 1;
		year = 1970;
	}
	
	Data(int dayAlt, int monthAlt, int yearAlt){
		day = dayAlt;
		month = monthAlt;
		year = yearAlt;
	}
	
	String obterDataFormatada() {
		return String.valueOf(day)+"/"+String.valueOf(month)
		+ "/" + String.valueOf(year)  ;
	}
}
