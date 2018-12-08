package locadora;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.ArrayList;

class TelaLogin extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	public static ArrayList<Cliente> ListaClientes = new ArrayList<Cliente>();

	public TelaLogin() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		entradaUsuario = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		btnEntrar = new javax.swing.JButton();
		saidera = new javax.swing.JButton();
		entradaSenha = new javax.swing.JPasswordField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new Font("Source Sans Pro Light", Font.ITALIC, 28)); // NOI18N
		jLabel1.setText("locadora toptop");

		jLabel2.setText("usuario:");

		jLabel3.setText("senha:");

		btnEntrar.setText("entrar");
		btnEntrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEntrarActionPerformed(evt);
			}
		});

		saidera.setText("sair");
		saidera.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				saideraActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(61, 61, 61)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel3).addGap(24, 24, 24)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addComponent(btnEntrar)
												.addGap(27, 27, 27).addComponent(saidera))
										.addComponent(entradaSenha)))
						.addGroup(layout.createSequentialGroup().addComponent(jLabel2).addGap(18, 18, 18).addComponent(
								entradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 198,
								javax.swing.GroupLayout.PREFERRED_SIZE)))
				.addGap(25, 25, 25))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(67, 67, 67)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(
						jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(38, 38, 38)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(entradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(38, 38, 38)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(entradaSenha, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(32, 32, 32).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(btnEntrar).addComponent(saidera))
				.addContainerGap(31, Short.MAX_VALUE)));

		pack();
	}

	private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {
		String senha = new String(entradaSenha.getPassword());

		if (entradaUsuario.getText().equals("user") && senha.equals("pass")) {
			TelaSecundaria tela2 = new TelaSecundaria(TelaLogin.this, ListaClientes);
			tela2.setVisible(true);
			dispose();
			entradaUsuario.setText("");
			entradaSenha.setText("");

		} else {
			JOptionPane.showMessageDialog(null, "acesso bloqueado");
		}

	}

	private void saideraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saideraActionPerformed
		System.exit(0);
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaLogin().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnEntrar;
	private javax.swing.JPasswordField entradaSenha;
	private javax.swing.JTextField entradaUsuario;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JButton saidera;

}