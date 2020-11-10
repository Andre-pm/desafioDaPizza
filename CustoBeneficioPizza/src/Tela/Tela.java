package Tela;

import java.util.Scanner;

import Sistema.Calculos;
import Sistema.Pizza;

public class Tela {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculos calculos = new Calculos();
		String menu = "1";

		System.out.println("Sistema Custo Benef�cio Pizzas:");

		while (menu.equalsIgnoreCase("1")) {
			System.out.println("Insira uma Descri��o a Pizza:");
			String descricao = scan.next();

			System.out.println("Insira o Tamanho da Pizza em Cent�metros:");
			double tamanho = scan.nextDouble();

			System.out.println("Insira o valor da Pizza:");
			double valor = scan.nextDouble();

			Pizza pizza = new Pizza(descricao, tamanho, valor);
			calculos.adicionaPizza(pizza);

			System.out.println("Deseja Adicionar Mais Pizzas?\n1-Sim   2-N�o");
			menu = scan.next();
		}
		if (calculos.getPizzas() != null) {
			System.out.println("----Custo benef�cio----");
			System.out.println("Pizza com melhor custo Beneficio: "+ calculos.calcularCB());
			System.out.println("----------------------------------------------------");
			calculos.calculoComparacaoMelhor();
			for (int i = 0; i < calculos.getPizzas().length; i++) {
				if (calculos.getArrayCB(i) != calculos.getMenor()) {
					System.out.println("Pizza: "+ calculos.getPizza(i).getDescricao() + 
							"   Tamanho:" + calculos.getPizza(i).getTamanho()+
							"   Valor: R$"+calculos.getPizza(i).getValor()+
							"   Diferen�a +"+calculos.getArrayCB(i) + "%");
				}else {
					System.out.println("Pizza: "+ calculos.getPizza(i).getDescricao() + 
							"   Tamanho:" + calculos.getPizza(i).getTamanho()+
							"   Valor: R$"+calculos.getPizza(i).getValor()+
							"   Diferen�a  N/A");
				}

			}

		}else {
			System.out.println("Cadastre uma Pizza para Come�ar!");
		}
	}
}
