package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean job1 = false;
		boolean job2 = true;
		System.out.println("Compraremos uma TV de 50'? " + (job1 && job2));
		System.out.println("Compraremos uma TV de 32'? " + (job1 ^ job2));
		System.out.println("Tomaremos sorvete? " + (job1 || job2));
		System.out.println("Somos saudáveis? " + !(job1 || job2));
	}
}
