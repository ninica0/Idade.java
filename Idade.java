import javax.swing.JOptionPane;
public class Idade {
	public static void main(String[] args) {
		int idade;
	
	
	idade = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite a sua idade: ") );
	
	if (idade == 18 || idade <=59) {
		JOptionPane.showMessageDialog(null, "Você é um(a) adulto(a)");
	}else if(idade <18) {
		JOptionPane.showMessageDialog(null, "Você é um(a) adolescente");
	}else if (idade <=12) {
		JOptionPane.showMessageDialog(null, "Você é uma criança");
	}else if (idade >=60) {
		JOptionPane.showMessageDialog(null, "Você é um(a) idoso(a)");
	}
	}
}
