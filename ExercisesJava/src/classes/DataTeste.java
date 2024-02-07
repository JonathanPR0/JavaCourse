package classes;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
//		d1.day = 11;
//		d1.month = 5;
//		d1.year = 2005;
		Data d2 = new Data(11,5,2005);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
