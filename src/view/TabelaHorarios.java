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
public class TabelaHorarios extends MyDialog
{
	private JScrollPane scrollPaneTabela;
	private JTable tabelaHorario;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		TabelaHorarios horario = new TabelaHorarios();
	}
	
	public TabelaHorarios()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Tabela de horários");
		this.setResizable(false);
		this.setSize(526,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void iniciarComponentes()
	{
		//Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(0, 0, 520, 175);
		pTable.setBorder(new TitledBorder(""));
		add(pTable);
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaHorario = new JTable();
		tabelaHorario.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Dias da Semana", "Nível", "Horários"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});
		
		tabelaHorario.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabelaHorario.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabelaHorario.getColumnModel().getColumn(2).setPreferredWidth(150);
		
		scrollPaneTabela.setViewportView(tabelaHorario);
	}
}
