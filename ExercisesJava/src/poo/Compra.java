package poo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> items = new ArrayList<Item>();
	
	void addCompra(Produto p, int qntd){
		this.items.add(new Item(p, qntd));
	}
	
	double getTotalValue() {
		double total = 0;
		for(Item item: items) {
			total += item.qnt * item.produto.preco;
		}
		return total;
	}
}
