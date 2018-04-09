package multiplicar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadoraMultiplicar {
	static Integer valorMenu = 0;
	static Scanner teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
		CalculadoraMultiplicar calculadoraMultiplicar = new CalculadoraMultiplicar();
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadoraMultiplicar.setValor1(numero1);
				calculadoraMultiplicar.setValor2(numero2);
				calculadoraMultiplicar.multiplicar();
				chamarMenu();
			} else if (valorMenu == 2) {
				System.err.println(calculadoraMultiplicar.getResultados());
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
		System.err.println("1:MULTIPLICAR");
		System.err.println("2:IMPRIMIR");
		System.err.println("3:SAIR");
		valorMenu = teclado.nextInt();
	}
}