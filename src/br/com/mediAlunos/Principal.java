package br.com.mediAlunos;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, nota3;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));

		CalculoNotas med = new CalculoNotas();

		    JOptionPane.showMessageDialog(null, "A média das notas é: " + med.media(nota1, nota2, nota3));
		  
		}
}
