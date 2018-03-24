package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class Menu 
{
	private MyFrame MenuPrincipal;
	private JMenuBar jmbBarra;
	private JMenu jmCadastro, jmConsulta, jmGerarPDF, jmSair;
	private JMenuItem jmiCadAluno, jmiCadFuncionario, jmiCadHistorico, jmiCadModalidade,jmiCadMatricula,
	jmiCadTurma, jmiConsultaAluno, jmiConsultaFuncionario, jmiConsultaMatricula, jmiConsultaModalidade,
	jmiCadPrescricaoTreino, jmiConsultaTurma, jmiGerarPrescriçãoTreino, jmiSair;
	private JLabel lbData, lbHora, lbImagemCentro;
	private URL caminhoImagem;
    private Image iconeTitulo;
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.MenuPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Menu()
	{
		iniciar();
		MenuPrincipal.setVisible(true);
	}
	
	private void iniciar()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		
		MenuPrincipal = new MyFrame();
		MenuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuPrincipal.getContentPane().setBackground(Color.WHITE);
		MenuPrincipal.setTitle("Menu principal");
		MenuPrincipal.setResizable(false);
		MenuPrincipal.setSize(d.width, d.height);
		
		jmbBarra = new JMenuBar();
		
		jmCadastro = new JMenu("Cadastro");
		jmCadastro.setMnemonic('C');
		jmCadastro.setIcon(new ImageIcon(getClass().getResource("/imagens/register.png")));
		
		jmConsulta = new JMenu("Consulta");
		jmConsulta.setMnemonic('o');
		jmConsulta.setIcon(new ImageIcon(getClass().getResource("/imagens/consult.gif")));
		
		jmGerarPDF = new JMenu("Gerar PDF");
		jmGerarPDF.setMnemonic('G');
		jmGerarPDF.setIcon(new ImageIcon(getClass().getResource("/imagens/reports.png")));
		
		jmSair = new JMenu("Sair");
		jmSair.setMnemonic('S');
		jmSair.setIcon(new ImageIcon(getClass().getResource("/imagens/exit.gif")));
		
		jmiCadAluno = new JMenuItem("Aluno");
		jmCadastro.add(jmiCadAluno);
		jmiCadAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadAluno();
			}
		});
		jmiCadAluno.setIcon(new ImageIcon(getClass().getResource("/imagens/aluno.png")));
		
		jmiCadFuncionario = new JMenuItem("Funcionário");
		jmCadastro.add(jmiCadFuncionario);
		jmiCadFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadFuncionario();
			}
		});
		jmiCadFuncionario.setIcon(new ImageIcon(getClass().getResource("/imagens/func.png")));
		
		jmiCadHistorico = new JMenuItem("Histórico");
		jmCadastro.add(jmiCadHistorico);
		jmiCadHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadHistorico();
			}
		});
		jmiCadHistorico.setIcon(new ImageIcon(getClass().getResource("/imagens/history.gif")));
		
		jmiCadMatricula = new JMenuItem("Matrícula");
		jmCadastro.add(jmiCadMatricula);
		jmiCadMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadMatricula();
			}
		});
		jmiCadMatricula.setIcon(new ImageIcon(getClass().getResource("/imagens/matri.png")));
		
		jmiCadModalidade = new JMenuItem("Modalidade");
		jmCadastro.add(jmiCadModalidade);
		jmiCadModalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadModalidade();
			}
		});
		jmiCadModalidade.setIcon(new ImageIcon(getClass().getResource("/imagens/modality.png")));
		
		jmiCadPrescricaoTreino= new JMenuItem("Prescrição de Treino");
		jmCadastro.add(jmiCadPrescricaoTreino);
		jmiCadPrescricaoTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadPrescricaoTreino();
			}
		});
		jmiCadPrescricaoTreino.setIcon(new ImageIcon(getClass().getResource("/imagens/prescri.png")));
		
		jmiCadTurma = new JMenuItem("Turma");
		jmCadastro.add(jmiCadTurma);
		jmiCadTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaCadTurma();
			}
		});
		jmiCadTurma.setIcon(new ImageIcon(getClass().getResource("/imagens/class.gif")));
		
		jmiConsultaAluno = new JMenuItem("Aluno");
		jmConsulta.add(jmiConsultaAluno);
		jmiConsultaAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaAluno();
			}
		});
		jmiConsultaAluno.setIcon(new ImageIcon(getClass().getResource("/imagens/consu.png")));
		
		jmiConsultaFuncionario = new JMenuItem("Funcionário");
		jmConsulta.add(jmiConsultaFuncionario);
		jmiConsultaFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaFuncionario();
			}
		});
		jmiConsultaFuncionario.setIcon(new ImageIcon(getClass().getResource("/imagens/cons1.png")));
		
		jmiConsultaMatricula = new JMenuItem("Matricula");
		jmConsulta.add(jmiConsultaMatricula);
		jmiConsultaMatricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaMatricula();
			}
		});
		jmiConsultaMatricula.setIcon(new ImageIcon(getClass().getResource("/imagens/search.png")));
		
		jmiConsultaModalidade = new JMenuItem("Modalidade");
		jmConsulta.add(jmiConsultaModalidade);
		jmiConsultaModalidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaModalidade();
			}
		});
		jmiConsultaModalidade.setIcon(new ImageIcon(getClass().getResource("/imagens/search2.png")));
		
		jmiConsultaTurma = new JMenuItem("Turma");
		jmConsulta.add(jmiConsultaTurma);
		jmiConsultaTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaTurma();
			}
		});
		jmiConsultaTurma.setIcon(new ImageIcon(getClass().getResource("/imagens/seach3.png")));
		
		jmiGerarPrescriçãoTreino = new JMenuItem("Prescrição de treino");
		jmGerarPDF.add(jmiGerarPrescriçãoTreino);
		jmiGerarPrescriçãoTreino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarConsultaPrescricaoTreino();
			}
		});
		jmiGerarPrescriçãoTreino.setIcon(new ImageIcon(getClass().getResource("/imagens/registerp.gif")));
		
		jmiSair = new JMenuItem("Sair");
		jmSair.add(jmiSair);
		jmiSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		jmiSair.setIcon(new ImageIcon(getClass().getResource("/imagens/saida.png")));
		
		jmbBarra.add(jmCadastro);
		jmbBarra.add(jmConsulta);
		jmbBarra.add(jmGerarPDF);
		jmbBarra.add(jmSair);
		
		MenuPrincipal.setJMenuBar(jmbBarra);
		
		MenuPrincipal.getContentPane().setLayout(null);
		
		lbData = new JLabel();
		lbData.setBounds(d.width - 261, d.height - 114, 110, 40);
		lbData.setHorizontalAlignment(SwingConstants.CENTER);
		lbData.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		lbData.setForeground(Color.BLACK);
		lbData.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		lbHora = new JLabel();
		lbHora.setBounds(d.width - 131, d.height - 114, 110, 40);
		lbHora.setHorizontalAlignment(SwingConstants.CENTER);
		lbHora.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		lbHora.setForeground(Color.BLACK);
		lbHora.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		MenuPrincipal.add(lbHora);
		MenuPrincipal.add(lbData);
		
		lbImagemCentro = new JLabel();
		lbImagemCentro.setBounds(d.width - 1356, d.height -758, d.height +568, 630);
		lbImagemCentro.setIcon(new ImageIcon(getClass().getResource("/imagens/L.png")));
		MenuPrincipal.add(lbImagemCentro);
		
		JPanel pRodape = new JPanel();
		pRodape.setBackground(Color.WHITE);
		pRodape.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, new Color(192, 192, 192), null, null));
		pRodape.setBounds(d.width - 1356, d.height - 115, d.width - 30,42);
		MenuPrincipal.add(pRodape);
		
		
		//Aqui a data do sistema é instanciada e manda o formato para o lbData
		Date dataSistema = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		lbData.setText(formato.format(dataSistema));
		
		//Aqui a hora do sitema é instanciada
		Timer timer = new Timer(1000, new hora());
		timer.start();
			
		caminhoImagem = CadAluno.class.getResource("/imagens/iconSistema.png");
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        MenuPrincipal.setIconImage(iconeTitulo);
	}

	@SuppressWarnings("unused")
	private void carregarTelaCadAluno()
	{
		CadAluno aluno = new CadAluno();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadFuncionario()
	{
		CadFuncionario funcionario = new CadFuncionario();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadHistorico()
	{
		CadHistorico historico = new CadHistorico();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadModalidade()
	{
		CadModalidade modalidade = new CadModalidade();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadMatricula()
	{
		CadMatricula matricula = new CadMatricula();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadPrescricaoTreino()
	{
		CadPrescricaoTreino cadTreino = new CadPrescricaoTreino();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaCadTurma()
	{
		CadTurma turma = new CadTurma();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaAluno()
	{
		ConsultaAluno consultaAluno = new ConsultaAluno();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaFuncionario()
	{
		ConsultaFuncionario consultaFuncionario = new ConsultaFuncionario();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaMatricula()
	{
		ConsultaMatricula consultaMatricula = new ConsultaMatricula();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaModalidade()
	{
		ConsultaModalidade consultaModalidade = new ConsultaModalidade();
	}
	
	@SuppressWarnings("unused")
	private void carregarTelaConsultaTurma()
	{
		ConsultaTurma consultaTurma = new ConsultaTurma();
	}
	
	@SuppressWarnings("unused")
	private void carregarConsultaPrescricaoTreino()
	{
		ConsultaPrescricaoTreino consultaTreino = new ConsultaPrescricaoTreino();
	}
	
	class hora implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Date horaSistema = new Date();
			SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
			lbHora.setText(formatoHora.format(horaSistema));
		}
	}
}