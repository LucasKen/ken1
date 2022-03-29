package telaLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	public static void main(String[] args) {

		JFrame tela = new JFrame("LOGIN");
		JPanel painel_1 = new JPanel();
		JPanel painel_2 = new JPanel();
		JLabel lbUsuario = new JLabel("usuario ");
		JTextField cmpUsuario = new JTextField(20);
		JLabel lbSenha = new JLabel("senha ");
		JPasswordField cmpSenha = new JPasswordField(20);
		JButton btnEnviar = new JButton("Enviar");
		JButton btnSair = new JButton("Sair");
		JButton btnLimpar = new JButton("Limpar");

		// vincular componentes
		tela.add(painel_1);
		tela.add(painel_2);
		painel_1.add(lbUsuario);
		painel_1.add(cmpUsuario);
		painel_1.add(lbSenha);
		painel_1.add(cmpSenha);
		painel_2.add(btnEnviar);
		painel_2.add(btnSair);
		painel_2.add(btnLimpar);

		// ajustar o frame
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.pack();
		tela.setSize(600, 400);

		tela.getContentPane().setLayout(new BorderLayout());
		tela.getContentPane().add(painel_1, BorderLayout.NORTH);
		tela.getContentPane().add(painel_2, BorderLayout.SOUTH);

		painel_1.setBackground(Color.CYAN);
		painel_2.setBackground(Color.YELLOW);

		lbUsuario.setFont(new Font("Arial", Font.ITALIC, 20));
		lbSenha.setFont(new Font("Arial", Font.ITALIC, 15));

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = cmpUsuario.getText();

				@SuppressWarnings("deprecation")
				String senha = cmpSenha.getText();
				JOptionPane.showMessageDialog(null, "Usuario " + usuario + " Senha: " + senha);

			}
		});
		

			
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cmpUsuario.setText(null);
			cmpSenha.setText(null);

			}
		});
		
	}

}
