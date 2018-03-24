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
public class ConsultaFuncionario extends MyDialog
{
	private JLabel lbFormaPesquisa, lbPesquisa;
	private ButtonGroup bgFormaPesquisa;
	private JRadioButton rbCodigo, rbNome, rbCpf;
	private JTextField tfPesquisa;
	private JButton bPesquisar;
	private JPanel pConsultaFuncionario;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaFuncionarios;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ConsultaFuncionario consultaFun = new ConsultaFuncionario();
	}
	
	public ConsultaFuncionario()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Consulta de funcionários");
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
				tfPesquisa.setForeground(Color.LIGHT_GRAY);
			}
		});
		rbCodigo.setSelected(true);
		rbCodigo.setToolTipText("Pesquisa por código !");
		
		rbNome = new JRadioButton("Nome");
		rbNome.setBounds(110,40,100,20);
		rbNome.setBackground(Color.WHITE);
		rbNome.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o nome ...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.LIGHT_GRAY);
			}
		});
		rbNome.setToolTipText("Pesquisa por nome !");
		
		rbCpf = new JRadioButton("CPF");
		rbCpf.setBounds(210,40,100,20);
		rbCpf.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite o CPF...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.LIGHT_GRAY);
			}
		});
		rbCpf.setBackground(Color.WHITE);
		rbCpf.setToolTipText("Pesquisa por CPF !");
		
		bgFormaPesquisa = new ButtonGroup();
		bgFormaPesquisa.add(rbCodigo);
		bgFormaPesquisa.add(rbNome);
		bgFormaPesquisa.add(rbCpf);
		add(rbCodigo);
		add(rbNome);
		add(rbCpf);
		
		lbPesquisa = new JLabel("Pesquisa: ");
        lbPesquisa.setBounds(12,70,150,20);
        tfPesquisa = new JTextField();
        tfPesquisa.setBounds(10, 90, 460, 30);
        tfPesquisa.setText("Digite o código...");
		tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
		tfPesquisa.setForeground(Color.LIGHT_GRAY);
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
        bPesquisar.setToolTipText("Clique para pesquisar um funcionário !");
        
        //Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(2, 125, 596, 345);
		pTable.setBorder(new TitledBorder(""));
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaFuncionarios = new JTable();
		tabelaFuncionarios.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int linha = tabelaFuncionarios.getSelectedRow();
					//setAlunoSelecionado(Integer.parseInt(tabelaAlunos.getValueAt(linha, 0).toString()));
					dispose();
				}
			}
		});
		tabelaFuncionarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaFuncionarios.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Código", "Nome", "CPF", "RG", "Cargo"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		scrollPaneTabela.setViewportView(tabelaFuncionarios);

		tabelaFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(100);
		tabelaFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(100);
		tabelaFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(100);
        
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pConsultaFuncionario = new JPanel(null);
        this.pConsultaFuncionario.setBorder(new TitledBorder("FUNCIONÁRIOS CADASTRADOS"));
        this.pConsultaFuncionario.setBackground(Color.WHITE);
        this.pConsultaFuncionario.setBounds(2, 2, 600, 467);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pConsultaFuncionario.add(this.lbFormaPesquisa);
        this.pConsultaFuncionario.add(this.rbCodigo);
        this.pConsultaFuncionario.add(this.rbNome);
        this.pConsultaFuncionario.add(this.rbCpf);
        this.pConsultaFuncionario.add(this.lbPesquisa);
        this.pConsultaFuncionario.add(this.tfPesquisa);
        this.pConsultaFuncionario.add(this.bPesquisar);
        this.pConsultaFuncionario.add(pTable);
        
        this.add(pConsultaFuncionario);
        
	}
}
