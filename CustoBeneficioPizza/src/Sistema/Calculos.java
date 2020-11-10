package Sistema;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculos {
	private Pizza pizzas[] = new Pizza[1];
	double arrayCB[];
	private double menor = 999999999;
	
	
	public double getMenor() {
		return menor;
	}

	public void setMenor(double menor) {
		this.menor = menor;
	}

	public double getArrayCB(int i) {
		return arrayCB [i];
	}

	public void setArrayCB(double[] arrayCB) {
		this.arrayCB = arrayCB;
	}

	public Pizza[] getPizzas() {
		return pizzas;
	}
	
	public Pizza getPizza (int i) {
		return pizzas[i];
	}

	public void setPizzas(Pizza[] pizzas) {
		this.pizzas = pizzas;
	}

	public void adicionaPizza (Pizza pizza) {
		int i;
		for (i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = pizza;
				break;
			}
		}

		if (i == pizzas.length) {
			pizzas=novaPizza(pizzas);
			pizzas[i]=pizza;

		}
	}

	public Pizza[] novaPizza (Pizza[] pizzas) {
		Pizza novaPizza [] = new Pizza[1+pizzas.length];

		for (int i = 0; i < pizzas.length; i++) {
			novaPizza[i] = pizzas[i];
		}
		return novaPizza;
	}

	public String calcularCB () {
		arrayCB = new double [1+pizzas.length];
		String melhorPizza = null;

		for (int i = 0; i < pizzas.length; i++) {
			double area = (Math.PI*pizzas[i].getTamanho());
			double cB = (pizzas[i].getValor()/area);

			arrayCB[i] = cB;

			if (cB<menor) {
				menor = cB;
				melhorPizza = pizzas[i].getDescricao();
			}

		}
		return melhorPizza;
	}

	public void calculoComparacaoMelhor() {
		for (int i = 0; i < pizzas.length; i++) {
			if (arrayCB[i] != menor) {
				double calcProp = (((arrayCB[i]-menor)/menor)*100);
				arrayCB[i] = calcProp;
			}
		}
		
//		for (int i = 1; i < arrayCB.length; i++) {
//		    for (int j = 0; j < i; j++) {
//		        if (arrayCB[i] > arrayCB[j]) {
//		            double temp = arrayCB[i];
//		            arrayCB[i] = arrayCB[j];
//		            arrayCB[j] = temp;
//		        }
//		    }
//		}

	}
}
