package dividir;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDividir {
	private Double valor1;
	private Double valor2;
	private Double resultado;
	private List<String> resultados = new ArrayList<String>();

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public List<String> getResultados() {
		return resultados;
	}

	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	
	public void dividir(){
		resultado=valor1 / valor2;
		resultados.add("["+valor1+"/"+valor2+"="+resultado+"]");
	}

}