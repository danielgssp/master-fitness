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
public class ConsultaTurma extends MyDialog
{
	private JLabel lbFormaPesquisa, lbPesquisa;
	private ButtonGroup bgFormaPesquisa;
	private JRadioButton rbCodigo, rbProfessor, rbModalidade, rbNivel;
	private JTextField tfPesquisa;
	private JButton bPesquisar;
	private JPanel pConsultaTurma;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaTurmas;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ConsultaTurma consultaTurma = new ConsultaTurma();
	}
	
	public ConsultaTurma()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Consulta de turmas");
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
				tfPesquisa.setText("Digite o código...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbCodigo.setToolTipText("Pesquisa por código !");
		
		rbProfessor = new JRadioButton("Professor");
		rbProfessor.setBounds(110,40,100,20);
		rbProfessor.setBackground(Color.WHITE);
		rbProfessor.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nome do professor...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbProfessor.setToolTipText("Pesquisa por professor !");
		
		rbModalidade = new JRadioButton("Modalidade");
		rbModalidade.setBounds(210,40,100,20);
		rbModalidade.setBackground(Color.WHITE);
		rbModalidade.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nome da modalidade...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbModalidade.setToolTipText("Pesquisa por modalidade !");
		
		rbNivel = new JRadioButton("Nível");
		rbNivel.setBounds(310,40,100,20);
		rbNivel.setBackground(Color.WHITE);
		rbNivel.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nível...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbNivel.setToolTipText("Pesquisa por nível !");
		
		bgFormaPesquisa = new ButtonGroup();
		bgFormaPesquisa.add(rbCodigo);
		bgFormaPesquisa.add(rbProfessor);
		bgFormaPesquisa.add(rbModalidade);
		bgFormaPesquisa.add(rbNivel);
		add(rbCodigo);
		add(rbProfessor);
		add(rbModalidade);
		add(rbNivel);
		
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
        bPesquisar.setToolTipText("Clique para pesquisar uma turma !");
        
        //Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(2, 125, 596, 345);
		pTable.setBorder(new TitledBorder(""));
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaTurmas = new JTable();
		tabelaTurmas.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int linha = tabelaTurmas.getSelectedRow();
					//setAlunoSelecionado(Integer.parseInt(tabelaAlunos.getValueAt(linha, 0).toString()));
					dispose();
				}
			}
		});
		tabelaTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaTurmas.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Código", "Professor", "Modalidade", "Nível"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		scrollPaneTabela.setViewportView(tabelaTurmas);

		tabelaTurmas.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaTurmas.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaTurmas.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaTurmas.getColumnModel().getColumn(3).setPreferredWidth(100);
        
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pConsultaTurma = new JPanel(null);
        this.pConsultaTurma.setBorder(new TitledBorder("TURMAS CADASTRADAS"));
        this.pConsultaTurma.setBackground(Color.WHITE);
        this.pConsultaTurma.setBounds(2, 2, 600, 467);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pConsultaTurma.add(this.lbFormaPesquisa);
        this.pConsultaTurma.add(this.rbCodigo);
        this.pConsultaTurma.add(this.rbProfessor);
        this.pConsultaTurma.add(this.rbModalidade);
        this.pConsultaTurma.add(this.rbNivel);
        this.pConsultaTurma.add(this.lbPesquisa);
        this.pConsultaTurma.add(this.tfPesquisa);
        this.pConsultaTurma.add(this.bPesquisar);
        this.pConsultaTurma.add(pTable);
        
        this.add(pConsultaTurma);
        
	}
}
