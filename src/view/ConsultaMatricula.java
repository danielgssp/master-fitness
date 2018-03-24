package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ConsultaMatricula extends MyDialog
{
	private JLabel lbFormaPesquisa, lbPesquisa;
	private ButtonGroup bgFormaPesquisa;
	private JRadioButton rbCodigo, rbNivel, rbModalidade;
	private JTextField tfPesquisa;
	private JButton bPesquisar;
	private JPanel pConsultaMatricula;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaMatriculas;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ConsultaMatricula consultaMatricula= new ConsultaMatricula();
	}
	
	public ConsultaMatricula()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Consulta de matrículas");
		this.setResizable(false);
		this.setSize(610,500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void iniciarComponentes()
	{
		lbFormaPesquisa = new JLabel("Formas de pesquisa: ");
        lbFormaPesquisa.setBounds(12,20,150,20);
        
        rbCodigo = new JRadioButton("Código");
		rbCodigo.setBounds(10,40,100,20);
		rbCodigo.setBackground(Color.WHITE);
		rbCodigo.setSelected(true);
		rbCodigo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o código ...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbCodigo.setToolTipText("Pesquisa por código !");
		
		rbNivel = new JRadioButton("Nível");
		rbNivel.setBounds(110,40,100,20);
		rbNivel.setBackground(Color.WHITE);
		rbNivel.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nível ...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbNivel.setToolTipText("Pesquisa por nível !");
		
		rbModalidade = new JRadioButton("Modalidade");
		rbModalidade.setBounds(210,40,100,20);
		rbModalidade.setBackground(Color.WHITE);
		rbModalidade.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite a modalidade ...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbModalidade.setToolTipText("Pesquisa por modalidade !");
		
		bgFormaPesquisa = new ButtonGroup();
		bgFormaPesquisa.add(rbCodigo);
		bgFormaPesquisa.add(rbNivel);
		bgFormaPesquisa.add(rbModalidade);
		add(rbCodigo);
		add(rbNivel);
		add(rbModalidade);
		
		lbPesquisa = new JLabel("Pesquisa: ");
        lbPesquisa.setBounds(12,70,150,20);
        tfPesquisa = new JTextField();
        tfPesquisa.setBounds(10, 90, 460, 30);
        tfPesquisa.setText("Digite o código...");
		tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
		tfPesquisa.setForeground(Color.GRAY);
        tfPesquisa.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				tfPesquisa.setText("");
				tfPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 13));
				tfPesquisa.setForeground(Color.BLACK);
			}
		});
        
        bPesquisar = new JButton("Pesquisar");
        bPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
        bPesquisar.setBounds(485,90,100,30);
        bPesquisar.setMnemonic('P');
        bPesquisar.setToolTipText("Clique para pesquisar uma matrícula !");
        
        //Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(2, 125, 596, 345);
		pTable.setBorder(new TitledBorder(""));
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaMatriculas = new JTable();
		tabelaMatriculas.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int linha = tabelaMatriculas.getSelectedRow();
					//setAlunoSelecionado(Integer.parseInt(tabelaAlunos.getValueAt(linha, 0).toString()));
					dispose();
				}
			}
		});
		tabelaMatriculas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaMatriculas.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Código", "Nível", "Modalidade", "Data Início", "Data Término"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		scrollPaneTabela.setViewportView(tabelaMatriculas);

		tabelaMatriculas.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaMatriculas.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaMatriculas.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaMatriculas.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabelaMatriculas.getColumnModel().getColumn(4).setPreferredWidth(100);
        
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pConsultaMatricula = new JPanel(null);
        this.pConsultaMatricula.setBorder(new TitledBorder("MATRÍCULAS CADASTRADAS"));
        this.pConsultaMatricula.setBackground(Color.WHITE);
        this.pConsultaMatricula.setBounds(2, 2, 600, 467);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pConsultaMatricula.add(this.lbFormaPesquisa);
        this.pConsultaMatricula.add(this.rbCodigo);
        this.pConsultaMatricula.add(this.rbNivel);
        this.pConsultaMatricula.add(this.rbModalidade);
        this.pConsultaMatricula.add(this.lbPesquisa);
        this.pConsultaMatricula.add(this.tfPesquisa);
        this.pConsultaMatricula.add(this.bPesquisar);
        this.pConsultaMatricula.add(pTable);
        
        this.add(pConsultaMatricula);
        
	}
}
