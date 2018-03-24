package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadAluno extends MyDialog
{
	private JLabel lbCodigo, lbNome, lbDataNasc, lbCpf, lbRg, lbLogradouro, lbNumero,
	lbBairro, lbCidade, lbCep, lbEstado, lbPeso, lbAltura, lbStatus, lbComplemento, lbSexo;
	private JTextField tfCodigo, tfNome, tfLogradouro, tfBairro, tfComplemento;
	private JFormattedTextField tfDataNasc, tfCpf, tfCep, tfNumero, tfRg,tfPeso, tfAltura;
	private MaskFormatter mfDataNasc, mfCpf, mfCep, mfNumero, mfPeso, mfAltura;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEstado, cbCidade;
	private ButtonGroup bgSexo, bgStatus;
	private JRadioButton rbAtivo, rbInativo, rbMasculino, rbFeminino;
	private JPanel pDadosPessoais, pPerfil;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisar;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		CadAluno aluno = new CadAluno();
		
	}
	public CadAluno()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de alunos");
		this.setResizable(false);
		this.setSize(670,420);
		this.setLocationRelativeTo(null);

		this.setVisible(true);
	}
	
	@SuppressWarnings("rawtypes")
	private void iniciarComponentes()
	{
		lbCodigo = new JLabel("Código: ");
		lbCodigo.setBounds(12,20,100,20);
		tfCodigo = new JTextField("");
		tfCodigo.setBounds(10,40,160,30);
		tfCodigo.setEnabled(false);
		
		lbNome = new JLabel("Nome: ");
		lbNome.setBounds(222,20,100,20);
		tfNome = new JTextField("");
		tfNome.setBounds(220,40,430,30);
		
		lbDataNasc = new JLabel("Data de Nascimento: ");
		lbDataNasc.setBounds(12,70,150,20);
		tfDataNasc = new JFormattedTextField();
		tfDataNasc.setBounds(10,90,120,30);
		
		lbCpf = new JLabel("CPF: ");
		lbCpf.setBounds(182,70,100,20);
		tfCpf = new JFormattedTextField();
		tfCpf.setBounds(180,90,120,30);
		
		lbRg = new JLabel("RG: ");
		lbRg.setBounds(352,70,100,20);
		tfRg = new JFormattedTextField();
		tfRg.setBounds(350,90,120,30);
		
		
		lbCep = new JLabel("CEP: ");
		lbCep.setBounds(532,70,100,20);
		tfCep = new JFormattedTextField();
		tfCep.setBounds(530,90,120,30);
		
		lbEstado = new JLabel("Estado: ");
		lbEstado.setBounds(352,170,100,20);
		cbEstado = new JComboBox();
        cbEstado.setBounds(350,190,120,30);
        cbEstado.setSelectedIndex(-1);
        cbEstado.setEditable(false);
		
		lbLogradouro = new JLabel("Rua: ");
		lbLogradouro.setBounds(12,120,100,20);
		tfLogradouro = new JTextField("");
		tfLogradouro.setBounds(10,140,290,30);
		
		lbNumero = new JLabel("Número: ");
		lbNumero.setBounds(352,120,100,20);
		tfNumero = new JFormattedTextField("");
		tfNumero.setBounds(350,140,120,30);
		
		lbComplemento = new JLabel("Complemento: ");
		lbComplemento.setBounds(532,120,100,20);
		tfComplemento = new JTextField("");
		tfComplemento.setBounds(530,140,120,30);
		
		lbBairro = new JLabel("Bairro: ");
		lbBairro.setBounds(12,170,100,20);
		tfBairro = new JTextField("");
		tfBairro.setBounds(10,190,290,30);
		
		lbCidade = new JLabel("Cidade: ");
		lbCidade.setBounds(532,170,100,20);
		cbCidade = new JComboBox();
        cbCidade.setBounds(530,190,120,30);
        cbCidade.setSelectedIndex(-1);
        cbCidade.setEditable(false);
        
        lbStatus = new JLabel("Status: ");
        lbStatus.setBounds(12,20,100,20);
        
        rbAtivo = new JRadioButton("Ativo");
		rbAtivo.setBounds(10,40,100,20);
		rbAtivo.setBackground(Color.WHITE);
		rbAtivo.setEnabled(false);
		
		rbInativo = new JRadioButton("Inativo");
		rbInativo.setBounds(10,60,100,20);
		rbInativo.setBackground(Color.WHITE);
		rbInativo.setSelected(true);
		rbInativo.setEnabled(false);
		
		bgStatus = new ButtonGroup();
		bgStatus.add(rbAtivo);
		bgStatus.add(rbInativo);
		add(rbAtivo);
		add(rbInativo);
		
		lbSexo = new JLabel("Sexo: ");
        lbSexo.setBounds(182,20,100,20);
		
		rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setBounds(180,40,100,20);
		rbMasculino.setBackground(Color.WHITE);
		rbMasculino.setSelected(true);
		
		rbFeminino = new JRadioButton("Feminino");
		rbFeminino.setBounds(180,60,100,20);
		rbFeminino.setBackground(Color.WHITE);
		
		bgSexo = new ButtonGroup();
		bgSexo.add(rbMasculino);
		bgSexo.add(rbFeminino);
		add(rbMasculino);
		add(rbFeminino);
        
        lbPeso = new JLabel("Peso: ");
        lbPeso.setBounds(352,20,100,20);
        tfPeso = new JFormattedTextField("");
        tfPeso.setBounds(350, 40, 100, 30);
        
        lbAltura = new JLabel("Altura: ");
        lbAltura.setBounds(532,20,100,20);
        tfAltura = new JFormattedTextField("");
        tfAltura.setBounds(530, 40, 100, 30);
		
        //Mascaras de formato
		try
		{
			this.mfNumero = new MaskFormatter("#######");
			this.mfNumero.install(this.tfNumero);
			
			this.mfPeso = new MaskFormatter("###");
			this.mfPeso.install(this.tfPeso);
			
			this.mfAltura = new MaskFormatter("#.##");
			this.mfAltura.install(this.tfAltura);
			
			this.mfDataNasc = new MaskFormatter("##/##/####");
			mfDataNasc.setPlaceholderCharacter('_');
			this.mfDataNasc.install(tfDataNasc);
			
			this.mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.setPlaceholderCharacter('_');
			this.mfCpf.install(this.tfCpf);
			
			this.mfCep = new MaskFormatter("#####-###");
			mfCep.setPlaceholderCharacter('_');
			this.mfCep.install(this.tfCep);
		}
		catch(Exception erroG)
		{
			
		}
		
		bPesquisar = new JButton("");
		bPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaConsultaAluno();
			}
		});
		bPesquisar.setBounds(180,40,30,30);//C:\Users\Igor\Pictures
		bPesquisar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisar.setToolTipText("Clique para pesquisar um aluno !");
		
		// Instancia/Cria o Painel "SUPERIOR"
        this.pDadosPessoais = new JPanel(null);
        this.pDadosPessoais.setBorder(new TitledBorder("DADOS PESSOAIS"));
        this.pDadosPessoais.setBackground(Color.WHITE);
        this.pDadosPessoais.setBounds(2, 7, 660, 235);
        // Adiciona os componentes ao painel "SUPERIOR"
        this.pDadosPessoais.add(this.lbCodigo);
        this.pDadosPessoais.add(this.tfCodigo);
        this.pDadosPessoais.add(this.bPesquisar);
        this.pDadosPessoais.add(this.lbNome);
        this.pDadosPessoais.add(this.tfNome);
        this.pDadosPessoais.add(this.lbDataNasc);
        this.pDadosPessoais.add(this.tfDataNasc);
        this.pDadosPessoais.add(this.lbCpf);
        this.pDadosPessoais.add(this.tfCpf);
        this.pDadosPessoais.add(this.lbRg);
        this.pDadosPessoais.add(this.tfRg);
        this.pDadosPessoais.add(this.lbCep);
        this.pDadosPessoais.add(this.tfCep);
        this.pDadosPessoais.add(this.lbEstado);
        this.pDadosPessoais.add(this.cbEstado);
        this.pDadosPessoais.add(this.lbLogradouro);
        this.pDadosPessoais.add(this.tfLogradouro);
        this.pDadosPessoais.add(this.lbNumero);
        this.pDadosPessoais.add(this.tfNumero);
        this.pDadosPessoais.add(this.lbComplemento);
        this.pDadosPessoais.add(tfComplemento);
        this.pDadosPessoais.add(this.lbBairro);
        this.pDadosPessoais.add(this.tfBairro);
        this.pDadosPessoais.add(this.lbCidade);
        this.pDadosPessoais.add(this.cbCidade);
        
        // Instancia/Cria o Painel "INFERIOR"
        this.pPerfil = new JPanel(null);
        this.pPerfil.setBorder(new TitledBorder("PERFIL")); 
        this.pPerfil.setBackground(Color.WHITE);
        this.pPerfil.setBounds(2,245, 660, 90);
        // Adiciona os componentes ao painel "INFERIOR"
        this.pPerfil.add(this.lbPeso);
        this.pPerfil.add(this.tfPeso);
        this.pPerfil.add(this.lbAltura);
        this.pPerfil.add(this.tfAltura);
        this.pPerfil.add(this.lbStatus);
        this.pPerfil.add(this.rbAtivo);
        this.pPerfil.add(this.rbInativo);
        this.pPerfil.add(this.lbSexo);
        this.pPerfil.add(this.rbMasculino);
        this.pPerfil.add(this.rbFeminino);
        
        //Adicionando os paineis
        this.add(this.pDadosPessoais);
        this.add(this.pPerfil);

        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				validarCampos();
			}
		});
        bSalvar.setBounds(44,340,120,40);
        bSalvar.setMnemonic('S');
        bSalvar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/save.png"))));
        bSalvar.setToolTipText("Clique para salvar o cadastro !");
		add(bSalvar);
		
		bCancelar = new JButton("Cancelar");
		bCancelar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar o cadastro ?", "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
				{
					setVisible(false);
				}
			}
		});
		bCancelar.setBounds(196,340,120,40);
		bCancelar.setMnemonic('C');
		bCancelar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cancel.png"))));
		bCancelar.setToolTipText("Clique para cancelar o cadastro !");
		add(bCancelar);
		
		bExcluir = new JButton("Excluir");
		bExcluir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		bExcluir.setBounds(348,340,120,40);
		bExcluir.setMnemonic('E');
		bExcluir.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/delete.png"))));
		bExcluir.setToolTipText("Clique para excluir o cadastro !");
		add(bExcluir);
		
		bSair = new JButton("Sair");
		bSair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		bSair.setBounds(500,340,120,40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaAluno()
	{
		ConsultaAluno consultaAluno = new ConsultaAluno();
	}
	
	private void validarCampos()
	{
		if(tfNome.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Nome obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfNome.grabFocus();
			return;
		} else if(tfDataNasc.getText().equals("__/__/____")){
			JOptionPane.showConfirmDialog(null, "Campo Data de Nascimento obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataNasc.grabFocus();
			return;
		} else if(tfCpf.getText().equals("___.___.___-__")){
			JOptionPane.showConfirmDialog(null, "Campo CPF obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfCpf.grabFocus();
			return;
		} else if(tfRg.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo RG obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfRg.grabFocus();
			return;
		} else if(tfCep.getText().equals("_____-___")){
			JOptionPane.showConfirmDialog(null, "Campo CEP obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfCep.grabFocus();
			return;
		} else if(tfLogradouro.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Rua obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfLogradouro.grabFocus();
			return;
		} else if(tfNumero.getText().equals("       ")){
			JOptionPane.showConfirmDialog(null, "Campo Número obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfNumero.grabFocus();
			return;
		} else if(tfComplemento.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Complemento obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfComplemento.grabFocus();
			return;
		} else if(tfBairro.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Bairro obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfBairro.grabFocus();
			return;
		} else if(cbEstado.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Estado obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbEstado.grabFocus();
			return;
		} else if(cbCidade.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Cidade obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbCidade.grabFocus();
			return;
		} else if(tfPeso.getText().equals("   ")){
			JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfNumero.grabFocus();
			return;
		} else if(tfAltura.getText().equals(" .  ")){
			JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfAltura.grabFocus();
			return;
		} else{
			limparTela();
		}
	}
	
	private void limparTela()
	{
		tfCodigo.setText("");
		tfNome.setText("");
		tfDataNasc.setText("");
		tfCpf.setText("");
		tfRg.setText("");
		tfCep.setText("");
		tfLogradouro.setText("");
		tfNumero.setText("");
		tfComplemento.setText("");
		tfBairro.setText("");
		cbEstado.setSelectedIndex(-1);
		cbCidade.setSelectedIndex(-1);
		tfPeso.setText("");
		tfAltura.setText("");
	}
}
