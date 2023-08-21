package controller;

public class OcorrenciaController {

	public OcorrenciaController() {
		super();
	}

	public int ocorrencia(int n, int dig) {
		if (n < 10) {
			return (n == dig) ? 1 : 0;
		}
		int ultimo = n %10;
		int ocorre = (ultimo == dig) ? 1 : 0;
		
		return ocorre + ocorrencia(n / 10, dig);
	}
}
