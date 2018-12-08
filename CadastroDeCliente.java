package locadora;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroDeCliente extends JFrame {
	ArrayList<Cliente> ListaClientesCadastro;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nome;
	private JTextField endereço;
	private JTextField cpf;
	private JTextField idade;
	private JTextField numero;

	public CadastroDeCliente(TelaSecundaria telaSecundaria, ArrayList<Cliente> lista56) {
		setTitle("CADASTRO");

		ListaClientesCadastro = lista56;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSejaUmNovo = new JLabel("SEJA UM NOVO CLIENTE TOPTOP");
		JLabel lblNome = new JLabel("NOME:");
		lblSejaUmNovo.setFont(new Font("Source Sans Pro Light", Font.ITALIC, 15));
		lblSejaUmNovo.setBounds(182, 11, 292, 14);
		contentPane.add(lblSejaUmNovo);

		lblNome.setBounds(100, 65, 46, 14);
		contentPane.add(lblNome);

		nome = new JTextField();
		nome.setBounds(176, 51, 298, 28);
		contentPane.add(nome);
		nome.setColumns(10);

		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setBounds(100, 103, 73, 14);
		contentPane.add(lblEndereo);

		endereço = new JTextField();
		endereço.setBounds(176, 89, 298, 28);
		contentPane.add(endereço);
		endereço.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(100, 140, 46, 14);
		contentPane.add(lblCpf);

		cpf = new JTextField();
		cpf.setBounds(176, 126, 298, 28);
		contentPane.add(cpf);
		cpf.setColumns(10);

		JLabel lblIdade = new JLabel("IDADE");
		lblIdade.setBounds(100, 177, 46, 14);
		contentPane.add(lblIdade);

		idade = new JTextField();
		idade.setBounds(176, 163, 298, 28);
		contentPane.add(idade);
		idade.setColumns(10);

		JLabel lblNumero = new JLabel("NUMERO");
		lblNumero.setBounds(100, 216, 73, 14);
		contentPane.add(lblNumero);

		numero = new JTextField();
		numero.setBounds(176, 202, 298, 28);
		contentPane.add(numero);
		numero.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Cliente cliente = new Cliente(nome.getText(), endereço.getText(), cpf.getText(), idade.getText(),
						numero.getText());
				lista56.add(cliente);

				JOptionPane.showMessageDialog(null, "Parabens Você é um cliente toptop");
				System.out.println("Lista dos cliente Atualizada: " + lista56.toString());

			}
		});
		btnCadastrar.setBounds(100, 319, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVerClientes = new JButton("Ver Clientes");
		btnVerClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lista56.size()==0) {
				JOptionPane.showMessageDialog(null,"Sem Clientes por enquanto");
				}
				else {
					JOptionPane.showMessageDialog(null, lista56.toString());
				}
			}
		});
		btnVerClientes.setBounds(216, 319, 89, 23);
		contentPane.add(btnVerClientes);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(331, 319, 89, 23);
		contentPane.add(btnVoltar);

		JButton btnVerFilmes = new JButton("Ver filmes");
		btnVerFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VerFilmes tela4 = new VerFilmes(null, CadastroDeCliente.this);
				tela4.setVisible(true);
				dispose();
			}
		});
		btnVerFilmes.setBounds(451, 319, 89, 23);
		contentPane.add(btnVerFilmes);
	}
}