package dividir;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadoraDividir {
	static Integer valorMenu = 0;
	static Scanner teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
		CalculadoraDividir CalculadoraDividir = new CalculadoraDividir();
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				Double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor 1"));
				Double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor 2"));
				CalculadoraDividir.setValor1(numero1);
				CalculadoraDividir.setValor2(numero2);
				CalculadoraDividir.dividir();
				chamarMenu();
			} else if (valorMenu == 2) {
				System.err.println(CalculadoraDividir.getResultados());
				chamarMenu();
			} else if (valorMenu == 3) {
				System.exit(0);
			}else{
				chamarMenu();
			}
		}
	}

	private static void chamarMenu() {		
		System.err.println("#########################");
		System.err.println("MENU");
		System.err.println("1:DIVIDIR");
		System.err.println("2:IMPRIMIR");
		System.err.println("3:SAIR");
		valorMenu = teclado.nextInt();
	}
}