package view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class TabelaImc extends MyDialog
{
	private JScrollPane scrollPaneTabela;
	private JTable tabelaImc;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		TabelaImc imc = new TabelaImc();
	}
	
	public TabelaImc()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Tabela imc");
		this.setResizable(false);
		this.setSize(526,160);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void iniciarComponentes()
	{
		
		
		//Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 0, 520, 134);
		pTable.setBorder(new TitledBorder(""));
		add(pTable);
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaImc = new JTable();
		tabelaImc.setModel(new DefaultTableModel(
			new Object[][] {
				{"Menor que 18.5", "Azul", "Abaixo do peso"},
				{"Entre 18.6 a 24.9", "Verde", "Peso normal (PARAB\u00C9NS)"},
				{"Entre 25.0 a 29.9", "Amarelo", "Acima do peso"},
				{"Entre 30.0 a 34.9", "Laranja", "Obesidade"},
				{"Acima de 35", "Vermelho", "Obesidade (M\u00D3RBIDA)"},
			},
			new String[] {
				"Imc", "Cor", "Situa\u00E7\u00E3o"
			}){
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});
		
		tabelaImc.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabelaImc.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabelaImc.getColumnModel().getColumn(2).setPreferredWidth(150);
		
		scrollPaneTabela.setViewportView(tabelaImc);
	}
}
