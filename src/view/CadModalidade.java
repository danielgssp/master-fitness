package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadModalidade extends MyDialog
{
	private JLabel lbCodigo, lbDescricao, lbValor, lbObservacao;
	private JTextField tfCodigo, tfDescricao;
	private JFormattedTextField tfValor;
	private MaskFormatter mfValor;
	private JTextArea taObservacao;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisar;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		CadModalidade modalidade = new CadModalidade();
		
	}
	public CadModalidade()
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}
	
	private void iniciarTela()
	{
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de modalidades");
		this.setResizable(false);
		this.setSize(620,220);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void iniciarComponentes()
	{
		lbCodigo = new JLabel("Código: ");
		lbCodigo.setBounds(12,20,100,20);
		add(lbCodigo);
		tfCodigo = new JTextField("");
		tfCodigo.setBounds(10,40,150,30);
		tfCodigo.setEnabled(false);
		add(tfCodigo);
		
		lbDescricao = new JLabel("Descrição: ");
		lbDescricao.setBounds(222,20,100,20);
		add(lbDescricao);
		tfDescricao = new JTextField("");
		tfDescricao.setBounds(220,40,200,30);
		add(tfDescricao);
		
		lbValor = new JLabel("Valor: ");
		lbValor.setBounds(452,20,100,20);
		add(lbValor);
		tfValor = new JFormattedTextField(new DecimalFormat("#,###,##0.00"));
		tfValor.setBounds(450,40,150,30);
		add(tfValor);
		
		try{
			this.mfValor = new MaskFormatter("#######");
			this.mfValor.install(tfValor);
		} catch(Exception ex){
			
		}
		
		lbObservacao = new JLabel("Observação: ");
		lbObservacao.setBounds(12,70,100,20);
		add(lbObservacao);
		taObservacao = new JTextArea("");
		taObservacao.setLineWrap(true);
		taObservacao.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		taObservacao.setBounds(10,90,590,40);
		add(taObservacao);
		
		bPesquisar = new JButton("");
		bPesquisar.setBounds(170,40,30,30);//C:\Users\Igor\Pictures
		bPesquisar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				carregarTelaConsultaModalidade();
			}
		});
		bPesquisar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisar.setToolTipText("Clique para pesquisar uma modalidade !");
		add(bPesquisar);
		
		bSalvar = new JButton("Salvar");
        bSalvar.setBounds(20,140,120,40);
        bSalvar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				validarCampos();
			}
		});
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
		bCancelar.setBounds(170,140,120,40);
		bCancelar.setMnemonic('C');
		bCancelar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cancel.png"))));
		bCancelar.setToolTipText("Clique para cancelar o cadastro !");
		add(bCancelar);
		
		bExcluir = new JButton("Excluir");
		bExcluir.setBounds(320,140,120,40);
		bExcluir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
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
		bSair.setBounds(470,140,120,40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);
	}
		
	@SuppressWarnings("unused")
	private void carregarTelaConsultaModalidade()
	{
		ConsultaModalidade consultaModalidade = new ConsultaModalidade();
	}
	
	private void validarCampos()
	{
		if(tfDescricao.getText().equals("")){
			JOptionPane.showConfirmDialog(null, "Campo Descrição obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDescricao.grabFocus();
			return;
		} else if(tfValor.getText().equals("     ")){
			JOptionPane.showConfirmDialog(null, "Campo Valor obrigatório ! Favor preencher o campo.", "Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfValor.grabFocus();
			return;
		} else{
			limparTela();
		}
	}
	
	private void limparTela()
	{
		tfCodigo.setText("");
		tfDescricao.setText("");
		tfValor.setText("");
		taObservacao.setText("");
	}
}
