package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class Splash extends MyDialog
{
	@SuppressWarnings("unused")
	private JProgressBar progressBar;

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Splash splash = new Splash();
	}

	Splash() 
	{
		this.iniciarComponentes();
		this.iniciarTela();
	}

	private void iniciarTela() 
	{
		this.setLayout(null);
		this.setUndecorated(true);
		this.setSize(700, 250);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void iniciarComponentes() 
	{

		final JProgressBar progressBar = new JProgressBar();
		progressBar.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 25));
		progressBar.setStringPainted(true);
		progressBar.setIndeterminate(false);

		progressBar.setBounds(274, 149, 389, 41);
		add(progressBar);

		JLabel imgSpl = new JLabel("");
		imgSpl.setBounds(0, 0, 700, 250);
		add(imgSpl);
		imgSpl.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/splash.png"))));
		new Thread() {
			public void run()
			{
				for (int i = 0; i < 100; i++)
				{
					try 
					{
						sleep(40);
						progressBar.setValue(i);
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				carregarTelaLogin();
			}
		}.start();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaLogin()
	{
		this.setVisible(false);
		Login logar = new Login();
	}
}
