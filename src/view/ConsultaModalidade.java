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
public class ConsultaModalidade extends MyDialog
{
	private JLabel lbFormaPesquisa, lbPesquisa;
	private ButtonGroup bgFormaPesquisa;
	private JRadioButton rbCodigo, rbDescricao;
	private JTextField tfPesquisa;
	private JButton bPesquisar;
	private JPanel pConsultaModalidade;
	private JScrollPane scrollPaneTabela;
	private JTable tabelaModalidades;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		ConsultaModalidade consultaModalidade = new ConsultaModalidade();
	}
	
	public ConsultaModalidade()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Consulta de modalidades");
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
		
		rbDescricao = new JRadioButton("Descrição");
		rbDescricao.setBounds(110,40,100,20);
		rbDescricao.setBackground(Color.WHITE);
		rbDescricao.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				tfPesquisa.setText("Digite a descrição...");
				tfPesquisa.setFont(new Font("Tahoma", Font.ITALIC, 14));
				tfPesquisa.setForeground(Color.GRAY);
			}
		});
		rbDescricao.setToolTipText("Pesquisa por descrição !");
		
		bgFormaPesquisa = new ButtonGroup();
		bgFormaPesquisa.add(rbCodigo);
		bgFormaPesquisa.add(rbDescricao);
		add(rbCodigo);
		add(rbDescricao);
		
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
        bPesquisar.setToolTipText("Clique para pesquisar uma modalidade !");
        
        //Painel onde fica o JTable
        JPanel pTable = new JPanel();
        pTable.setBackground(Color.WHITE);
		pTable.setBounds(2, 125, 596, 345);
		pTable.setBorder(new TitledBorder(""));
		
		scrollPaneTabela = new JScrollPane();
		scrollPaneTabela.setPreferredSize(new Dimension(pTable.getWidth() - 20, pTable.getHeight() - 25));
		pTable.add(scrollPaneTabela);
		
		tabelaModalidades = new JTable();
		tabelaModalidades.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unused")
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int linha = tabelaModalidades.getSelectedRow();
					//setAlunoSelecionado(Integer.parseInt(tabelaAlunos.getValueAt(linha, 0).toString()));
					dispose();
				}
			}
		});
		tabelaModalidades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabelaModalidades.setModel(new DefaultTableModel(new Object[][] {},
				new String[] {"Código", "Descrição", "Valor"}) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		});

		scrollPaneTabela.setViewportView(tabelaModalidades);

		tabelaModalidades.getColumnModel().getColumn(0).setPreferredWidth(100);
		tabelaModalidades.getColumnModel().getColumn(1).setPreferredWidth(100);
		tabelaModalidades.getColumnModel().getColumn(2).setPreferredWidth(100);
        
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pConsultaModalidade = new JPanel(null);
        this.pConsultaModalidade.setBorder(new TitledBorder("MODALIDADES CADASTRADAS"));
        this.pConsultaModalidade.setBackground(Color.WHITE);
        this.pConsultaModalidade.setBounds(2, 2, 600, 467);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pConsultaModalidade.add(this.lbFormaPesquisa);
        this.pConsultaModalidade.add(this.rbCodigo);
        this.pConsultaModalidade.add(this.rbDescricao);
        this.pConsultaModalidade.add(this.lbPesquisa);
        this.pConsultaModalidade.add(this.tfPesquisa);
        this.pConsultaModalidade.add(this.bPesquisar);
        this.pConsultaModalidade.add(pTable);
        
        this.add(pConsultaModalidade);
        
	}
}
