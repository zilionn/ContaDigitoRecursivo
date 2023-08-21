package view;

import javax.swing.JOptionPane;

import controller.OcorrenciaController;

public class Principal {

	public static void main(String[] args) {
		OcorrenciaController ocorreCont = new OcorrenciaController();
		int N = 0;
		int digito = 0;
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Insira um número: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				N = Integer.parseInt(input);
				if (N < 10 || N > 999999) {
					JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
					continue;
				}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
			}
			break;
		}while(true);
		
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Insira um digito que faça parte do número que digitou: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrado");
					System.exit(0);
				}
				digito = Integer.parseInt(input);
				if (digito < 0 || digito > 9) {
					JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
					continue;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Número inválido, tente novamente: ");
				continue;
			}
			break;
		}while (true);
		
		JOptionPane.showMessageDialog(null, "O número " +digito+ " aparece "  +ocorreCont.ocorrencia(N, digito)+ "x no número " +N);
	}

}
