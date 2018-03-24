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
public class ConsultaPrescricaoTreino extends MyDialog
{
	private JLabel lbFormaPesquisa, lbPesquisa;
	private ButtonGroup bgFormaPesquisa;
	private JRadioButton rbCodigo, rbNomeAluno, rbNomePersonal;
	private JTextField tfPesquisa;
	private JButton bPesquisar;
	private JPanel pConsultaPrescricao;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaPrescricoes;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ConsultaPrescricaoTreino treinos = new ConsultaPrescricaoTreino();
	}
	
	public ConsultaPrescricaoTreino()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Consulta de precrições de treino");
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
		rbCodigo.setSelected(true);
		rbCodigo.setToolTipText("Pesquisa por código !");
		
		rbNomeAluno = new JRadioButton("Nome aluno");
		rbNomeAluno.setBounds(110,40,100,20);
		rbNomeAluno.setBackground(Color.WHITE);
		rbNomeAluno.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nome do aluno ...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbNomeAluno.setToolTipText("Pesquisa por nome do aluno !");
		
		rbNomePersonal = new JRadioButton("Nome personal");
		rbNomePersonal.setBounds(210,40,130,20);
		rbNomePersonal.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nome do personal...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbNomePersonal.setBackground(Color.WHITE);
		rbNomePersonal.setToolTipText("Pesquisa por nome do personal !");
		
		bgFormaPesquisa = new ButtonGroup();
		bgFormaPesquisa.add(rbCodigo);
		bgFormaPesquisa.add(rbNomeAluno);
		bgFormaPesquisa.add(rbNomePersonal);
		add(rbCodigo);
		add(rbNomeAluno);
		add(rbNomePersonal);
		
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
        bPesquisar.setToolTipText("Clique para pesquisar um aluno !");
        
        //Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(2, 125, 596, 345);
		pTable.setBorder(new TitledBorder(""));
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaPrescricoes = new JTable();
		tabelaPrescricoes.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int linha = tabelaPrescricoes.getSelectedRow();
					//setAlunoSelecionado(Integer.parseInt(tabelaAlunos.getValueAt(linha, 0).toString()));
					dispose();
				}
			}
		});
		tabelaPrescricoes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaPrescricoes.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Código Pescrição", "Nome Aluno", "Personal", "Data Início", "Data Término"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		scrollPaneTabela.setViewportView(tabelaPrescricoes);

		tabelaPrescricoes.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaPrescricoes.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaPrescricoes.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaPrescricoes.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabelaPrescricoes.getColumnModel().getColumn(4).setPreferredWidth(100);
        
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pConsultaPrescricao = new JPanel(null);
        this.pConsultaPrescricao.setBorder(new TitledBorder("PRESCRIÇÕES DE TREINOS CADASTRADAS"));
        this.pConsultaPrescricao.setBackground(Color.WHITE);
        this.pConsultaPrescricao.setBounds(2, 2, 600, 467);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pConsultaPrescricao.add(this.lbFormaPesquisa);
        this.pConsultaPrescricao.add(this.rbCodigo);
        this.pConsultaPrescricao.add(this.rbNomeAluno);
        this.pConsultaPrescricao.add(this.rbNomePersonal);
        this.pConsultaPrescricao.add(this.lbPesquisa);
        this.pConsultaPrescricao.add(this.tfPesquisa);
        this.pConsultaPrescricao.add(this.bPesquisar);
        this.pConsultaPrescricao.add(pTable);
        
        this.add(pConsultaPrescricao);
	}
}
