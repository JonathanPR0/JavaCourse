package poo;

import java.util.ArrayList;

public class Cliente {
	final String name;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String name){
		this.name = name;
	}
	
	void addCompra(Compra compra){
		compras.add(compra);
	}
	
	double getTotalValue() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.getTotalValue();
		}
		return total;
	}
}
