package locadora;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class VerFilmes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public VerFilmes(TelaSecundaria telaSecundaria, CadastroDeCliente cadastroDeCliente) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 862, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel painelFilmes = new JPanel();
		painelFilmes.setBorder(UIManager.getBorder("EditorPane.border"));
		painelFilmes.setBounds(29, 26, 778, 453);
		contentPane.add(painelFilmes);
		painelFilmes.setLayout(null);

		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(new Object[][] {
				{ "quantidade", "Codigo", "Filmes", "valor $$", "situa\u00E7\u00E3o" },
				{ "6", "00", "STAR WARS", "5.00", "" }, { "9", "01", "HARRY POTTER", "6.5", "" },
				{ "2", "02", "A MENINA QUE ROUBAVA FILMES", "6.0", null }, { "5", "03", null, null, null },
				{ "3", "04", null, null, null }, { "6", "05", null, null, null }, { "5", "06", null, null, null },
				{ "7", "07", null, null, null }, { "8", "08", null, null, null }, { "6", "09", null, null, null },
				{ "3", "10", null, null, null }, { null, "11", null, null, null }, { null, "12", null, null, null },
				{ null, "13", null, null, null }, { null, "14", null, null, null }, { null, "15", null, null, null },
				{ null, "16", null, null, null }, { null, "17", null, null, null }, { null, "18", null, null, null },
				{ null, "19", null, null, null }, { null, "20", null, null, null }, { null, "21", null, null, null },
				{ null, "22", null, null, null }, { null, "23", null, null, null }, { null, "24", null, null, null }, },
				new String[] { "Quantidade", "codigo", "Filme", "valor", "situa\u00E7\u00E3o" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] { Object.class, String.class, String.class, Object.class, Object.class };

			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(55);
		table.getColumnModel().getColumn(1).setMinWidth(10);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.setSurrendersFocusOnKeystroke(true);
		table.setColumnSelectionAllowed(true);
		table.setBackground(new Color(211, 211, 211));
		table.setBounds(10, 11, 758, 416);
		painelFilmes.add(table);
	}

	public VerFilmes(TelaSecundaria telaSecundaria, ArrayList<Cliente> listaClientesSecundaria) {
		// TODO Auto-generated constructor stub
	}
}