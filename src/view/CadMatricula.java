package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadMatricula extends MyDialog
{
	private JLabel lbCodigoAluno, lbNome, lbDataNasc, lbCpf, lbRg, lbCodigoMatricula, lbNivel,
	lbDataMatricula, lbDataTermino, lbStatus, lbModalidade;
	private JFormattedTextField tfCodigoAluno, tfNome, tfDataNasc, tfCpf, tfRg, tfCodigoMatricula,
	tfDataMatricula, tfDataTermino;
	private MaskFormatter mfDataNasc, mfCpf, mfDataMatricula, mfDataTermino;
	@SuppressWarnings("rawtypes")
	private JComboBox cbNivel, cbModalidade;
	private ButtonGroup bgStatus;
	private JRadioButton rbAtivo, rbInativo;
	private JPanel pDadosAluno, pDadosMatricula;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisarAluno, bPesquisarMatricula, bPesquisarHorario;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		CadMatricula matricula = new CadMatricula();
	}
	
	public CadMatricula()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de matrícula");
		this.setResizable(false);
		this.setSize(610,400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void iniciarComponentes()
	{
		lbCodigoAluno = new JLabel("Código: ");
		lbCodigoAluno.setBounds(12,20,100,20);
		tfCodigoAluno = new JFormattedTextField("");
		tfCodigoAluno.setBounds(10,40,160,30);
		tfCodigoAluno.setEnabled(false);
		
		
		lbNome = new JLabel("Nome: ");
		lbNome.setBounds(222,20,100,20);
		tfNome = new JFormattedTextField("");
		tfNome.setBounds(220,40,370,30);
		tfNome.setEnabled(false);
		
		lbDataNasc = new JLabel("Data de Nascimento: ");
		lbDataNasc.setBounds(12,70,150,20);
		tfDataNasc = new JFormattedTextField();
		tfDataNasc.setBounds(10,90,160,30);
		tfDataNasc.setEnabled(false);
		
		lbCpf = new JLabel("CPF: ");
		lbCpf.setBounds(222,70,100,20);
		tfCpf = new JFormattedTextField();
		tfCpf.setBounds(220,90,160,30);
		tfCpf.setEnabled(false);
		
		lbRg = new JLabel("RG: ");
		lbRg.setBounds(432,70,100,20);
		tfRg = new JFormattedTextField("");
		tfRg.setBounds(430,90,160,30);
		tfRg.setEnabled(false);
		
		bPesquisarAluno = new JButton("");
		bPesquisarAluno.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaConsultaAluno();
			}
		});
		bPesquisarAluno.setBounds(170,40,30,30);//C:\Users\Igor\Pictures
		bPesquisarAluno.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisarAluno.setToolTipText("Clique para pesquisar um aluno !");
		
        lbCodigoMatricula = new JLabel("Código: ");
        lbCodigoMatricula.setBounds(12,20,100,20);
        tfCodigoMatricula = new JFormattedTextField("");
        tfCodigoMatricula.setBounds(10,40,160,30);
        tfCodigoMatricula.setEnabled(false);
		
		
		lbNivel = new JLabel("Nível: ");
		lbNivel.setBounds(222,20,100,20);
		cbNivel = new JComboBox();
		cbNivel.setModel(new DefaultComboBoxModel(new String[] {"Iniciante", "Intermediario","Avançado"}));
		cbNivel.setSelectedIndex(-1);
		cbNivel.setBounds(220,40,160,30);
		
		lbModalidade = new JLabel("Modalidade: ");
		lbModalidade.setBounds(432,20,100,20);
		cbModalidade = new JComboBox();
		cbModalidade.setBounds(430,40,160,30);
		
		lbStatus = new JLabel("Status: ");
        lbStatus.setBounds(12,70,100,20);
		
		rbAtivo = new JRadioButton("Ativo");
		rbAtivo.setBounds(10,90,100,20);
		rbAtivo.setBackground(Color.WHITE);
		rbAtivo.setEnabled(false);
		
		rbInativo = new JRadioButton("Inativo");
		rbInativo.setBounds(10,110,100,20);
		rbInativo.setBackground(Color.WHITE);
		rbInativo.setSelected(true);
		rbInativo.setEnabled(false);
		
		bgStatus = new ButtonGroup();
		bgStatus.add(rbAtivo);
		bgStatus.add(rbInativo);
		add(rbAtivo);
		add(rbInativo);
		
		lbDataMatricula = new JLabel("Data Matrícula: ");
		lbDataMatricula.setBounds(222,70,100,20);
		tfDataMatricula = new JFormattedTextField("");
		tfDataMatricula.setBounds(220,90,160,30);
		
		lbDataTermino = new JLabel("Data Término: ");
		lbDataTermino.setBounds(432,70,100,20);
		tfDataTermino  = new JFormattedTextField("");
		tfDataTermino.setBounds(430,90,160,30);
		
		//Mascaras de formato
		try
		{
			
			
			this.mfDataNasc = new MaskFormatter("##/##/####");
			mfDataNasc.setPlaceholderCharacter('_');
			this.mfDataNasc.install(tfDataNasc);
			
			this.mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.setPlaceholderCharacter('_');
			this.mfCpf.install(this.tfCpf);
			
			this.mfDataMatricula = new MaskFormatter("##/##/####");
			mfDataMatricula.setPlaceholderCharacter('_');
			this.mfDataMatricula.install(tfDataMatricula);
					
			this.mfDataTermino = new MaskFormatter("##/##/####");
			mfDataTermino.setPlaceholderCharacter('_');
			this.mfDataTermino.install(tfDataTermino);
		}
		catch(Exception erroG)
		{
					
		}
		
		bPesquisarMatricula = new JButton("");
		bPesquisarMatricula.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaConsultaMatricula();
			}
		});
		bPesquisarMatricula.setBounds(170,40,30,30);//C:\Users\Igor\Pictures
		bPesquisarMatricula.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisarMatricula.setToolTipText("Clique para pesquisar um aluno !");
		
		bPesquisarHorario = new JButton("Horários");
		bPesquisarHorario.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaHorarios();
			}
		});
		bPesquisarHorario.setBounds(456,125,120,30);//C:\Users\Igor\Pictures
		bPesquisarHorario.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/time.png"))));
		bPesquisarHorario.setToolTipText("Clique para pesquisar horários de turma !");
        
		// Instancia/Cria o Painel "SUPERIOR"
        this.pDadosAluno = new JPanel(null);
        this.pDadosAluno.setBorder(new TitledBorder("DADOS ALUNO"));
        this.pDadosAluno.setBackground(Color.WHITE);
        this.pDadosAluno.setBounds(2, 7, 600, 140);
        //Adiciona os componentes no panel "Superior"
        this.pDadosAluno.add(this.lbCodigoAluno);
        this.pDadosAluno.add(this.tfCodigoAluno);
        this.pDadosAluno.add(this.bPesquisarAluno);
        this.pDadosAluno.add(this.lbNome);
        this.pDadosAluno.add(this.tfNome);
        this.pDadosAluno.add(this.lbDataNasc);
        this.pDadosAluno.add(this.tfDataNasc);
        this.pDadosAluno.add(this.lbCpf);
        this.pDadosAluno.add(this.tfCpf);
        this.pDadosAluno.add(this.lbRg);
        this.pDadosAluno.add(this.tfRg);
		
        // Instancia/Cria o Painel "INFERIOR"
        this.pDadosMatricula = new JPanel(null);
        this.pDadosMatricula.setBorder(new TitledBorder("DADOS MATRÍCULA"));
        this.pDadosMatricula.setBackground(Color.WHITE);
        this.pDadosMatricula.setBounds(2, 147, 600, 170);
        //Adiciona os componentes no panel "Inferior"
        this.pDadosMatricula.add(this.lbCodigoMatricula);
        this.pDadosMatricula.add(this.tfCodigoMatricula);
        this.pDadosMatricula.add(this.bPesquisarMatricula);
        this.pDadosMatricula.add(this.lbNivel);
        this.pDadosMatricula.add(this.cbNivel);
        this.pDadosMatricula.add(this.lbModalidade);
        this.pDadosMatricula.add(this.cbModalidade);
        this.pDadosMatricula.add(this.lbStatus);
        this.pDadosMatricula.add(this.rbAtivo);
        this.pDadosMatricula.add(this.rbInativo);
        this.pDadosMatricula.add(this.lbDataMatricula);
        this.pDadosMatricula.add(this.tfDataMatricula);
        this.pDadosMatricula.add(this.lbDataTermino);
        this.pDadosMatricula.add(this.tfDataTermino);
        this.pDadosMatricula.add(this.bPesquisarHorario);
        
        this.add(pDadosAluno);
        this.add(pDadosMatricula);
        
        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				validarCampos();
			}
		});
        bSalvar.setBounds(30,320,120,40);
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
		bCancelar.setBounds(172,320,120,40);
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
		bExcluir.setBounds(314,320,120,40);
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
		bSair.setBounds(456,320,120,40);
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
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaMatricula()
	{
		ConsultaMatricula consultaMatricula = new ConsultaMatricula();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaHorarios()
	{
		TabelaHorarios horario = new TabelaHorarios();
	}
	
	private void validarCampos()
	{
		if(tfCodigoAluno.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Dados do aluno não preenchido ! Favor buscar um aluno para matricula.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		} else if(cbNivel.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Nível obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbNivel.grabFocus();
			return;
		} else if (cbModalidade.getSelectedIndex() == -1){
			JOptionPane.showConfirmDialog(null, "Campo Modalidade obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbModalidade.grabFocus();
			return;
		} else if(tfDataMatricula.getText().equals("__/__/____")){
			JOptionPane.showConfirmDialog(null, "Campo Data Matrícula obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataMatricula.grabFocus();
			return;
		} else if(tfDataTermino.getText().equals("__/__/____")){
			JOptionPane.showConfirmDialog(null, "Campo Data Término obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataTermino.grabFocus();
			return;
		} else{
			limparTela();
		}
	}
	
	private void limparTela()
	{
		tfCodigoAluno.setText("");
		tfNome.setText("");
		tfDataNasc.setText("");
		tfCpf.setText("");
		tfRg.setText("");
		tfCodigoMatricula.setText("");
		cbNivel.setSelectedIndex(-1);
		cbModalidade.setSelectedIndex(-1);
		tfDataMatricula.setText("");
		tfDataTermino.setText("");
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaHistorico()
	{
		CadHistorico historico = new CadHistorico();
	}
}
