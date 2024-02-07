package poo;

public class ClienteTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Alexa", 249.99);
		Produto produto2 = new Produto("Lápis", 2.5);
		Produto produto3 = new Produto("Livro", 26.7);
		Produto produto4 = new Produto("Smartwatch", 220);
		Produto produto5 = new Produto("Mouse", 45.9);
		
		Compra compra1 = new Compra();
		compra1.addCompra(produto1, 1);
		compra1.addCompra(produto4, 1);
		compra1.addCompra(produto5, 2);
		compra1.addCompra(produto3, 1);
		
		System.out.println("Total da compra 1: " + compra1.getTotalValue());
		
		Compra compra2 = new Compra();
		compra2.addCompra(produto2, 5);
		compra2.addCompra(produto3, 3);
		System.out.println("Total da compra 2: " + compra2.getTotalValue());
		
		Cliente cliente = new Cliente("Jonathan");
		cliente.addCompra(compra1);
		cliente.addCompra(compra2);

		System.out.printf("Meu nome é %s\nO total das minhas compras foi de R$%.2f", cliente.name, cliente.getTotalValue());
	}
}
