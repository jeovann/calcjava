package subtrair;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MenuCalculadoraSubtrair {
	static Integer valorMenu = 0;
	static Scanner teclado = new Scanner(System.in);	
	
	public static void main(String[] args) {
		CalculadoraSubtrair calculadoraSubtrair = new CalculadoraSubtrair();
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				Float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 1"));
				Float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor 2"));
				calculadoraSubtrair.setValor1(numero1);
				calculadoraSubtrair.setValor2(numero2);
				calculadoraSubtrair.subtrair();
				chamarMenu();
			} else if (valorMenu == 2) {
				System.err.println(calculadoraSubtrair.getResultados());
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
		System.err.println("1:SUBTRAIR");
		System.err.println("2:IMPRIMIR");
		System.err.println("3:SAIR");
		valorMenu = teclado.nextInt();
	}
}