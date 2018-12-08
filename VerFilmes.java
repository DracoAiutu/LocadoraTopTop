package locadora;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerFilmes extends JFrame {

	private static final long serialVersionUID = 1L;
	TelaLogin t1;
	TelaSecundaria tela2;
	private JPanel contentPane;
	private JTable table;

	/**
	 * @wbp.parser.constructor
	 */
	public VerFilmes(TelaSecundaria telaSecundaria, CadastroDeCliente cadastroDeCliente) {
		setTitle("VER FILMES");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel painelFilmes = new JPanel();
		painelFilmes.setBorder(UIManager.getBorder("EditorPane.border"));
		painelFilmes.setBounds(29, 26, 778, 444);
		contentPane.add(painelFilmes);
		painelFilmes.setLayout(null);

		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"quantidade", "Codigo", "Filmes", "valor $$", "situa\u00E7\u00E3o"},
				{"6", "00", "Jorrada nas Estrelas", "5.00", "Alugado"},
				{"9", "01", "Harry Potter", "6.5", "Alugado"},
				{"2", "02", "A menina que roubava filmes", "6.0", "Alugado"},
				{"5", "03", "Se beber n\u00E3o case", "6.0", "Alugado"},
				{"3", "04", "Tropa de elite", "5.0", "Alugado"},
				{"6", "05", "Lisbela e o prisioneiro", "6.0", "Alugado"},
				{"5", "06", "Uma noite no museu", "4.0", "Alugado"},
				{"7", "07", "O auto da compadecida", "6.0", "Alugado"},
				{"8", "08", "Up: altas aventuras", "5.0", "Alugado"},
				{"6", "09", "velozes e curiosos", "6.0", "Alugado"},
				{"3", "10", "Carros", "4.0", "Alugado"},
				{"2", "11", "A era do Gelo", "6.0", "Alugado"},
				{"4", "12", "Matrix", "5.0", "Alugado"},
				{"5", "13", "Animais fantasticos", "6.0", "Alugado"},
				{"5", "14", "A volta dos que n\u00E3o foram", "6.0", "Alugado"},
				{"2", "15", "Vingadores 4", "4.0", "Alugado"},
				{"3", "16", "Vingadores 3", "5.0", "Alugado"},
				{"4", "17", "vingadores 2", "6.0", "Alugado"},
				{"2", "18", "vingadores", "4.0", "Alugado"},
				{"4", "19", "10 coisas que eu odeio em voc\u00EA", "6.0", "Alugado"},
				{"3", "20", "Onde os fracos n\u00E3o tem vez", "5.0", "Alugado"},
				{"5", "21", "weverton \u00E9 gay", "4.0", "Alugado"},
				{"2", "22", "A barbie", "6.0", "Alugado"},
				{"3", "23", "A Grande Familia", "5.0", "Alugado"},
				{"1", "24", "Jessica jones", "6.0", "Alugado"},
			},
			new String[] {
				"Quantidade", "codigo", "Filme", "valor", "situa\u00E7\u00E3o"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(55);
		table.getColumnModel().getColumn(1).setMinWidth(10);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.setSurrendersFocusOnKeystroke(true);
		table.setColumnSelectionAllowed(true);
		table.setBackground(new Color(211, 211, 211));
		table.setBounds(10, 11, 758, 416);
		painelFilmes.add(table);
		
		JButton btnAlugarUmFilme = new JButton("Alugar um filme");
		btnAlugarUmFilme.setBounds(626, 474, 181, 23);
		contentPane.add(btnAlugarUmFilme);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);

			}
		});
		btnSair.setBounds(39, 474, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(1>0){
				tela2.setVisible(true);
				dispose();}
			}
		});
		btnVoltar.setBounds(141, 474, 89, 23);
		contentPane.add(btnVoltar);
	}

	public VerFilmes(TelaSecundaria telaSecundaria, ArrayList<Cliente> listaClientesSecundaria) {
		// TODO Auto-generated constructor stub
	}
}