package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.awt.Color;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

@SuppressWarnings({ "unused", "serial" })
public class Login extends MyDialog
{
	private JLabel lbUsuario, lbSenha, imgChave, imgCadiado, lbIdentificaUser;
	private JTextField  tfUsuario;
    private JButton bEntrar, bSair;
    private JPasswordField pfSenha;
    private JPanel panel, panel_1, panel_2;
    
    public static void main(String[] args)
    {
    	Login telaLogin = new Login();
    }
    
    Login ()
    {
    	this.iniciarComponentes();
		this.iniciarTela();
    }
    private void iniciarTela()
	{
    	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	this.setSize(333,226);
    	this.setTitle("Tela de login");
		this.setUndecorated(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	private void iniciarComponentes()
	{
		JButton bEntrar = new JButton("Entrar");
		bEntrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				iniciarSistema();
			}
		});
		bEntrar.setBackground(new Color(255, 255, 255));
		bEntrar.setBounds(131, 180, 91, 37);
		add(bEntrar);
		
		JButton bSair = new JButton("Sair");
		bSair.setBackground(new Color(255, 255, 255));
		bSair.setBounds(234, 180, 91, 37);
		add(bSair);
		bSair.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, new Color(192, 192, 192), null, null));
		panel.setBounds(10, 47, 313, 125);
		add(panel);
		panel.setLayout(null);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(117, 38, 161, 27);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lbUsuario = new JLabel("Usuário:");
		lbUsuario.setBounds(116, 26, 47, 14);
		panel.add(lbUsuario);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(117, 80, 161, 27);
		panel.add(pfSenha);
		pfSenha.setColumns(10);
		
		JLabel lbSenha = new JLabel("Senha:");
		lbSenha.setBounds(117, 66, 46, 14);
		panel.add(lbSenha);
		
		JLabel imgChave = new JLabel();
		imgChave.setBounds(0, 6, 114, 127);
		panel.add(imgChave);
		imgChave.setIcon(new ImageIcon((Login.class.getResource("/imagens/ch.png"))));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, new Color(192, 192, 192), null, null));
		panel_1.setBounds(10, 18, 313, 30);
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, new Color(192, 192, 192), null, null));
		panel_1.setBounds(10, 18, 313,  60);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbIdentificaUser = new JLabel("Identificação de Usuário ");
		lbIdentificaUser.setBounds(100, 8, 153, 14);
		panel_1.add(lbIdentificaUser);

		JLabel imgCadiado = new JLabel("");
		imgCadiado.setBounds(80, 1, 36, 25);
		panel_1.add(imgCadiado);
		imgCadiado.setIcon(new ImageIcon((Login.class.getResource("/imagens/cad.png"))));
		this.setLocationRelativeTo(null);
	}
	
	private void iniciarSistema()
	{
		this.setVisible(false);
		Menu window = new Menu();
	}
}
