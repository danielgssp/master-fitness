package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadFuncionario extends MyDialog
{
	private JLabel lbCodigo, lbNome, lbDataNasc, lbCpf, lbRg, lbLogradouro, lbNumero,
	lbBairro, lbCidade, lbCep, lbEstado, lbStatus, lbComplemento, lbUsuario, lbSenha, 
	lbSalario, lbDataAdmissao, lbDataDemissao, lbCargo;
	private JTextField tfCodigo, tfNome, tfLogradouro, tfBairro, tfComplemento,
	tfUsuario;
	private JFormattedTextField tfDataNasc, tfCpf, tfRg, tfCep, tfNumero, tfSalario,
	tfDataAdmissao, tfDataDemissao;
	private JPasswordField pfSenha;
	private MaskFormatter mfDataNasc, mfCpf, mfCep, mfNumero, mfSalario,
	mfDataAdmissao, mfDataDemissao;
	@SuppressWarnings("rawtypes")
	private JComboBox cbEstado, cbCidade, cbCargo;
	private ButtonGroup bgStatus;
	private JRadioButton rbAtivo, rbInativo;
	private JPanel pDadosPessoais, pDadoProfissionais;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisar;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		CadFuncionario funcionario = new CadFuncionario();
		
	}
	public CadFuncionario()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de funcionários");
		this.setResizable(false);
		this.setSize(670,460);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		tfRg = new JFormattedTextField("");
		tfRg.setBounds(350,90,120,30);
		
		lbCep = new JLabel("CEP: ");
		lbCep.setBounds(532,70,100,20);
		tfCep = new JFormattedTextField();
		tfCep.setBounds(530,90,120,30);
		
		lbEstado = new JLabel("Estado: ");
		lbEstado.setBounds(352,170,100,20);
		cbEstado = new JComboBox();
		cbEstado.setSelectedIndex(-1);
        cbEstado.setBounds(350,190,120,30);
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
        
		lbUsuario = new JLabel("Usuário: ");
		lbUsuario.setBounds(182,20,100,20);
		tfUsuario = new JFormattedTextField();
		tfUsuario.setBounds(180,40,120,30);
		
		lbSenha = new JLabel("Senha: ");
		lbSenha.setBounds(352,20,100,20);
		pfSenha = new JPasswordField();
		pfSenha.setBounds(350,40,120,30);
		
		lbDataAdmissao = new JLabel("Data Admissão: ");
		lbDataAdmissao.setBounds(182,70,100,20);
		tfDataAdmissao = new JFormattedTextField("");
		tfDataAdmissao.setBounds(180,90,120,30);
		
		lbDataDemissao = new JLabel("Data Demissão: ");
		lbDataDemissao.setBounds(352,70,100,20);
		tfDataDemissao  = new JFormattedTextField("");
		tfDataDemissao.setBounds(350,90,120,30);
		
		lbCargo = new JLabel("Cargo: ");
		lbCargo.setBounds(532,20,100,20);
		cbCargo = new JComboBox();
		cbCargo.setModel(new DefaultComboBoxModel(new String[] {"Recepcionista", "Personal"}));
		cbCargo.setSelectedIndex(-1);
		cbCargo.setBounds(530,40,120,30);
		
		lbSalario = new JLabel("Salário: ");
		lbSalario.setBounds(532,70,100,20);
		tfSalario  = new JFormattedTextField(new DecimalFormat("#,###,##0.00"));
		tfSalario.setBounds(530,90,120,30);
		
        //Mascaras de formato
		try
		{
			this.mfDataNasc = new MaskFormatter("##/##/####");
			mfDataNasc.setPlaceholderCharacter('_');
			this.mfDataNasc.install(tfDataNasc);
			
			this.mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.setPlaceholderCharacter('_');
			this.mfCpf.install(this.tfCpf);
			
			this.mfCep = new MaskFormatter("#####-###");
			mfCep.setPlaceholderCharacter('_');
			this.mfCep.install(this.tfCep);
			
			this.mfNumero = new MaskFormatter("#######");
			this.mfNumero.install(this.tfNumero);
			
			this.mfSalario = new MaskFormatter("#######");
			this.mfSalario.install(this.tfSalario);
			
			this.mfDataAdmissao = new MaskFormatter("##/##/####");
			mfDataAdmissao.setPlaceholderCharacter('_');
			this.mfDataAdmissao.install(tfDataAdmissao);
			
			this.mfDataDemissao = new MaskFormatter("##/##/####");
			mfDataDemissao.setPlaceholderCharacter('_');
			this.mfDataDemissao.install(tfDataDemissao);
		}
		catch(Exception erroG)
		{
			
		}
		
		bPesquisar = new JButton("");
		bPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaConsultaFuncionario();
			}
		});
		bPesquisar.setBounds(180,40,30,30);//C:\Users\Igor\Pictures
		bPesquisar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisar.setToolTipText("Clique para pesquisar um funcionário !");
		
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
        this.pDadosPessoais.add(this.lbComplemento);
        this.pDadosPessoais.add(this.tfComplemento);
        this.pDadosPessoais.add(this.lbCep);
        this.pDadosPessoais.add(this.tfCep);
        this.pDadosPessoais.add(this.lbEstado);
        this.pDadosPessoais.add(this.cbEstado);
        this.pDadosPessoais.add(this.lbLogradouro);
        this.pDadosPessoais.add(this.tfLogradouro);
        this.pDadosPessoais.add(this.lbNumero);
        this.pDadosPessoais.add(this.tfNumero);
        this.pDadosPessoais.add(this.lbBairro);
        this.pDadosPessoais.add(this.tfBairro);
        this.pDadosPessoais.add(this.lbCidade);
        this.pDadosPessoais.add(this.cbCidade);
        
        // Instancia/Cria o Painel "INFERIOR"
        this.pDadoProfissionais = new JPanel(null);
        this.pDadoProfissionais.setBorder(new TitledBorder("DADOS PROFISSIONAIS"));
        this.pDadoProfissionais.setBackground(Color.WHITE);
        this.pDadoProfissionais.setBounds(2,245, 660, 135);
        // Adiciona os componentes ao painel "INFERIOR"
        this.pDadoProfissionais.add(this.lbStatus);
        this.pDadoProfissionais.add(this.rbAtivo);
        this.pDadoProfissionais.add(this.rbInativo);
        this.pDadoProfissionais.add(this.lbUsuario);
        this.pDadoProfissionais.add(this.tfUsuario);
        this.pDadoProfissionais.add(this.lbSenha);
        this.pDadoProfissionais.add(this.pfSenha);
        this.pDadoProfissionais.add(this.lbDataAdmissao);
        this.pDadoProfissionais.add(this.tfDataAdmissao);
        this.pDadoProfissionais.add(this.lbDataDemissao);
        this.pDadoProfissionais.add(this.tfDataDemissao);
        this.pDadoProfissionais.add(this.lbCargo);
        this.pDadoProfissionais.add(this.cbCargo);
        this.pDadoProfissionais.add(this.lbSalario);
        this.pDadoProfissionais.add(this.tfSalario);
        
        //Adicionando os paineis
        this.add(this.pDadosPessoais);
        this.add(this.pDadoProfissionais);
        
        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				validarCampos();
			}
		});
        bSalvar.setBounds(44,385,120,40);
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
		bCancelar.setBounds(196,385,120,40);
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
		bExcluir.setBounds(348,385,120,40);
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
		bSair.setBounds(500,385,120,40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaFuncionario()
	{
		ConsultaFuncionario consultaFuncionario = new ConsultaFuncionario();
	}
	
	@SuppressWarnings("deprecation")
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
			//return;
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
			tfComplemento.grabFocus();
			return;
		} else if(cbCidade.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Cidade obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbCidade.grabFocus();
			return;
		} else if(tfUsuario.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Usuário obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfUsuario.grabFocus();
			return;
		} else if(pfSenha.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Senha obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			pfSenha.grabFocus();
			return;
		} else if(tfDataAdmissao.getText().equals("__/__/____")){
			JOptionPane.showConfirmDialog(null, "Campo Data de Admissão obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataAdmissao.grabFocus();
			return;
		} else if(tfDataDemissao.getText().equals("__/__/____")){
			JOptionPane.showConfirmDialog(null, "Campo Data de Demissão obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataDemissao.grabFocus();
			return;
		} else if(cbCargo.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Cargo obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbCargo.grabFocus();
			return;
		} else if(tfSalario.getText().equals("        ")){
			JOptionPane.showConfirmDialog(null, "Campo Salário obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfSalario.grabFocus();
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
		tfUsuario.setText("");
		pfSenha.setText("");
		tfDataAdmissao.setText("");
		tfDataDemissao.setText("");
		cbCargo.setSelectedIndex(-1);
		tfSalario.setText("");
	}
}