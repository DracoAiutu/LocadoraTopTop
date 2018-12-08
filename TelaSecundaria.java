package locadora;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;

public class TelaSecundaria extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	TelaLogin t1;
	public static ArrayList<Cliente> ListaClientesSecundaria;

	public TelaSecundaria(TelaLogin aThis,  ArrayList<Cliente> listac ) {
		setForeground(Color.RED);
		setResizable(false);
		setTitle("OP\u00C7\u00D5ES");
		ListaClientesSecundaria = listac;
		initComponents();
		this.t1 = aThis;
	}

	private void initComponents() {

		sairPraTela = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		sairPraTela.setText("Sair");
		sairPraTela.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(sairPraTela, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(sairPraTela, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel.setLayout(null);

		JButton editorFilmes = new JButton("Editar filmes");
		editorFilmes.setBounds(43, 133, 147, 23);
		panel.add(editorFilmes);

		JButton verFilmes = new JButton("Ver Filmes");
//		verFilmes.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				VerFilmes tela67 = new VerFilmes(null, TelaLogin.this);
//				tela67.setVisible(true);
//				dispose();			
//				}
//		});
		verFilmes.setBounds(43, 92, 147, 23);
		panel.add(verFilmes);

		JButton cdtCliente = new JButton("Cadastrar Cliente");
		cdtCliente.setBounds(43, 58, 147, 23);
		panel.add(cdtCliente);
		cdtCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastroDeCliente tela3 = new CadastroDeCliente(TelaSecundaria.this, ListaClientesSecundaria);
				tela3.setVisible(true);
				dispose();

			}
		});
		getContentPane().setLayout(layout);

		pack();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		t1.setVisible(true);
		dispose();
	}

	private javax.swing.JButton sairPraTela;
}