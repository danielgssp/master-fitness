package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadPrescricaoTreino extends MyDialog {
	private JLabel lbCodigoAluno, lbNome, lbDataNasc, lbCpf, lbRg, lbModalidade, lbCodigoPrescricao, lbSexo, lbPersonal,
			lbDataInicio, lbDataTermino, lbExPerna, lbSeriesPerna, lbRepeticoesPerna, lbExCostas, lbSeriesCostas,
			lbRepeticoesCostas, lbExBracos, lbSeriesBracos, lbRepeticoesBracos, lbExPeito, lbSeriesPeito,
			lbRepeticoesPeito, lbExOmAb, lbSeriesOmAb, lbRepeticoesOmAb;
	private JFormattedTextField tfCodigoAluno, tfNome, tfDataNasc, tfCpf, tfRg, tfModalidade, tfSexo,
			tfCodigoPrescricao, tfDataInicio, tfDataTermino, sPerna1, sPerna2, sPerna3, sPerna4, sPerna5, sPerna6,
			sPerna7, sPerna8, sPerna9, sPerna10, sPerna11, sPerna12, rPerna1, rPerna2, rPerna3, rPerna4, rPerna5,
			rPerna6, rPerna7, rPerna8, rPerna9, rPerna10, rPerna11, rPerna12, sCostas1, sCostas2, sCostas3, sCostas4,
			sCostas5, sCostas6, sCostas7, sCostas8, sCostas9, sCostas10, sCostas11, rCostas1, rCostas2, rCostas3,
			rCostas4, rCostas5, rCostas6, rCostas7, rCostas8, rCostas9, rCostas10, rCostas11, sBracos1, sBracos2,
			sBracos3, sBracos4, sBracos5, sBracos6, sBracos7, sBracos8, rBracos1, rBracos2, rBracos3, rBracos4,
			rBracos5, rBracos6, rBracos7, rBracos8, sPeito1, sPeito2, sPeito3, sPeito4, sPeito5, rPeito1, rPeito2,
			rPeito3, rPeito4, rPeito5, sOmAb1, sOmAb2, sOmAb3, sOmAb4, sOmAb5, sOmAb6, rOmAb1, rOmAb2, rOmAb3, rOmAb4,
			rOmAb5, rOmAb6;
	private MaskFormatter mfDataNasc, mfCpf, mfDataInicio, mfDataTermino, msPerna1, msPerna2, msPerna3, msPerna4,
			msPerna5, msPerna6, msPerna7, msPerna8, msPerna9, msPerna10, msPerna11, msPerna12, mrPerna1, mrPerna2,
			mrPerna3, mrPerna4, mrPerna5, mrPerna6, mrPerna7, mrPerna8, mrPerna9, mrPerna10, mrPerna11, mrPerna12,
			msCostas1, msCostas2, msCostas3, msCostas4, msCostas5, msCostas6, msCostas7, msCostas8, msCostas9,
			msCostas10, msCostas11, mrCostas1, mrCostas2, mrCostas3, mrCostas4, mrCostas5, mrCostas6, mrCostas7,
			mrCostas8, mrCostas9, mrCostas10, mrCostas11, msBracos1, msBracos2, msBracos3, msBracos4, msBracos5,
			msBracos6, msBracos7, msBracos8, mrBracos1, mrBracos2, mrBracos3, mrBracos4, mrBracos5, mrBracos6,
			mrBracos7, mrBracos8, msPeito1, msPeito2, msPeito3, msPeito4, msPeito5, mrPeito1, mrPeito2, mrPeito3,
			mrPeito4, mrPeito5, msOmAb1, msOmAb2, msOmAb3, msOmAb4, msOmAb5, msOmAb6, mrOmAb1, mrOmAb2, mrOmAb3,
			mrOmAb4, mrOmAb5, mrOmAb6;
	@SuppressWarnings("rawtypes")
	private JComboBox cbPersonal;
	private JCheckBox cPerna1, cPerna2, cPerna3, cPerna4, cPerna5, cPerna6, cPerna7, cPerna8, cPerna9, cPerna10,
			cPerna11, cPerna12, cCostas1, cCostas2, cCostas3, cCostas4, cCostas5, cCostas6, cCostas7, cCostas8,
			cCostas9, cCostas10, cCostas11, cBracos1, cBracos2, cBracos3, cBracos4, cBracos5, cBracos6, cBracos7,
			cBracos8, cPeito1, cPeito2, cPeito3, cPeito4, cPeito5, cOmAb1, cOmAb2, cOmAb3, cOmAb4, cOmAb5, cOmAb6;
	private JPanel pDadosPrescricao, pDadosPernas, pDadosCostas, pDadosBracos, pDadosPeito, pDadosOmbroAbdomen;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisarAluno, bPesquisarPrescricao, bImprimir;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CadPrescricaoTreino prescricao = new CadPrescricaoTreino();
	}

	public CadPrescricaoTreino() {
		this.iniciarComponentes();
		this.iniciarTela();
	}

	private void iniciarTela() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de precrição de treino");
		this.setResizable(false);
		this.setSize(1227, 670);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@SuppressWarnings("rawtypes")
	private void iniciarComponentes() {
		lbCodigoAluno = new JLabel("Código Aluno: ");
		lbCodigoAluno.setBounds(12, 20, 100, 20);
		tfCodigoAluno = new JFormattedTextField("");
		tfCodigoAluno.setBounds(10, 40, 160, 30);
		tfCodigoAluno.setEnabled(false);

		lbNome = new JLabel("Nome: ");
		lbNome.setBounds(222, 20, 100, 20);
		tfNome = new JFormattedTextField("");
		tfNome.setBounds(220, 40, 370, 30);
		tfNome.setEnabled(false);

		lbDataNasc = new JLabel("Data de Nascimento: ");
		lbDataNasc.setBounds(1042, 20, 150, 20);
		tfDataNasc = new JFormattedTextField();
		tfDataNasc.setBounds(1040, 40, 160, 30);
		tfDataNasc.setEnabled(false);

		lbCpf = new JLabel("CPF: ");
		lbCpf.setBounds(10, 70, 100, 20);
		tfCpf = new JFormattedTextField();
		tfCpf.setBounds(12, 90, 160, 30);
		tfCpf.setEnabled(false);

		lbRg = new JLabel("RG: ");
		lbRg.setBounds(222, 70, 100, 20);
		tfRg = new JFormattedTextField("");
		tfRg.setBounds(220, 90, 160, 30);
		tfRg.setEnabled(false);

		lbModalidade = new JLabel("Modalidade: ");
		lbModalidade.setBounds(632, 20, 100, 20);
		tfModalidade = new JFormattedTextField();
		tfModalidade.setBounds(630, 40, 160, 30);
		tfModalidade.setEnabled(false);

		lbSexo = new JLabel("Sexo: ");
		lbSexo.setBounds(842, 20, 100, 20);
		tfSexo = new JFormattedTextField();
		tfSexo.setBounds(840, 40, 160, 30);
		tfSexo.setEnabled(false);

		bPesquisarAluno = new JButton("");
		bPesquisarAluno.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {

				ConsultaAluno consultaAluno = new ConsultaAluno();
			}
		});
		bPesquisarAluno.setBounds(170, 40, 30, 30);// C:\Users\Igor\Pictures
		bPesquisarAluno.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisarAluno.setToolTipText("Clique para pesquisar um aluno !");

		lbCodigoPrescricao = new JLabel("Código Prescrição: ");
		lbCodigoPrescricao.setBounds(432, 70, 120, 20);
		tfCodigoPrescricao = new JFormattedTextField("");
		tfCodigoPrescricao.setBounds(430, 90, 160, 30);
		tfCodigoPrescricao.setEnabled(false);

		lbPersonal = new JLabel("Personal: ");
		lbPersonal.setBounds(632, 70, 100, 20);
		cbPersonal = new JComboBox();
		cbPersonal.setBounds(630, 90, 160, 30);

		lbDataInicio = new JLabel("Data Início: ");
		lbDataInicio.setBounds(842, 70, 100, 20);
		tfDataInicio = new JFormattedTextField();
		tfDataInicio.setBounds(840, 90, 160, 30);

		lbDataTermino = new JLabel("Data Término: ");
		lbDataTermino.setBounds(1042, 70, 100, 20);
		tfDataTermino = new JFormattedTextField();
		tfDataTermino.setBounds(1040, 90, 160, 30);

		bPesquisarPrescricao = new JButton("");
		bPesquisarPrescricao.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				ConsultaPrescricaoTreino treino = new ConsultaPrescricaoTreino();
			}
		});
		bPesquisarPrescricao.setBounds(590, 90, 30, 30);// C:\Users\Igor\Pictures
		bPesquisarPrescricao.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisarPrescricao.setToolTipText("Clique para pesquisar uma prescrição de treino !");

		lbExPerna = new JLabel("Exercícios: ");
		lbExPerna.setBounds(12, 20, 100, 20);

		cPerna1 = new JCheckBox("Abdutor");
		cPerna1.setBounds(10, 40, 140, 30);
		cPerna1.setBackground(Color.WHITE);

		cPerna2 = new JCheckBox("Adutor");
		cPerna2.setBounds(10, 70, 140, 30);
		cPerna2.setBackground(Color.WHITE);

		cPerna3 = new JCheckBox("Agachamento");
		cPerna3.setBounds(10, 100, 140, 30);
		cPerna3.setBackground(Color.WHITE);

		cPerna4 = new JCheckBox("Extensor");
		cPerna4.setBounds(10, 130, 140, 30);
		cPerna4.setBackground(Color.WHITE);

		cPerna5 = new JCheckBox("Extensor unilateral");
		cPerna5.setBounds(10, 160, 140, 30);
		cPerna5.setBackground(Color.WHITE);

		cPerna6 = new JCheckBox("Flexor");
		cPerna6.setBounds(10, 190, 140, 30);
		cPerna6.setBackground(Color.WHITE);

		cPerna7 = new JCheckBox("Glúteo em pé");
		cPerna7.setBounds(10, 220, 140, 30);
		cPerna7.setBackground(Color.WHITE);

		cPerna8 = new JCheckBox("Glúteo estendido");
		cPerna8.setBounds(10, 250, 140, 30);
		cPerna8.setBackground(Color.WHITE);

		cPerna9 = new JCheckBox("Glúteo flexionado");
		cPerna9.setBounds(10, 280, 140, 30);
		cPerna9.setBackground(Color.WHITE);

		cPerna10 = new JCheckBox("Panturrilha");
		cPerna10.setBounds(10, 310, 140, 30);
		cPerna10.setBackground(Color.WHITE);

		cPerna11 = new JCheckBox("Passada");
		cPerna11.setBounds(10, 340, 140, 30);
		cPerna11.setBackground(Color.WHITE);

		cPerna12 = new JCheckBox("Stiff");
		cPerna12.setBounds(10, 370, 140, 30);
		cPerna12.setBackground(Color.WHITE);

		lbSeriesPerna = new JLabel("Séries: ");
		lbSeriesPerna.setBounds(162, 20, 100, 20);

		lbRepeticoesPerna = new JLabel("Repetições: ");
		lbRepeticoesPerna.setBounds(220, 20, 100, 20);

		sPerna1 = new JFormattedTextField("");
		sPerna1.setBounds(162, 40, 40, 30);
		sPerna1.setEnabled(false);

		sPerna2 = new JFormattedTextField("");
		sPerna2.setBounds(162, 70, 40, 30);
		sPerna2.setEnabled(false);

		sPerna3 = new JFormattedTextField("");
		sPerna3.setBounds(162, 100, 40, 30);
		sPerna3.setEnabled(false);

		sPerna4 = new JFormattedTextField("");
		sPerna4.setBounds(162, 130, 40, 30);
		sPerna4.setEnabled(false);

		sPerna5 = new JFormattedTextField("");
		sPerna5.setBounds(162, 160, 40, 30);
		sPerna5.setEnabled(false);

		sPerna6 = new JFormattedTextField("");
		sPerna6.setBounds(162, 190, 40, 30);
		sPerna6.setEnabled(false);

		sPerna7 = new JFormattedTextField("");
		sPerna7.setBounds(162, 220, 40, 30);
		sPerna7.setEnabled(false);

		sPerna8 = new JFormattedTextField("");
		sPerna8.setBounds(162, 250, 40, 30);
		sPerna8.setEnabled(false);

		sPerna9 = new JFormattedTextField("");
		sPerna9.setBounds(162, 280, 40, 30);
		sPerna9.setEnabled(false);

		sPerna10 = new JFormattedTextField("");
		sPerna10.setBounds(162, 310, 40, 30);
		sPerna10.setEnabled(false);

		sPerna11 = new JFormattedTextField("");
		sPerna11.setBounds(162, 340, 40, 30);
		sPerna11.setEnabled(false);

		sPerna12 = new JFormattedTextField("");
		sPerna12.setBounds(162, 370, 40, 30);
		sPerna12.setEnabled(false);

		rPerna1 = new JFormattedTextField("");
		rPerna1.setBounds(220, 40, 40, 30);
		rPerna1.setEnabled(false);

		rPerna2 = new JFormattedTextField("");
		rPerna2.setBounds(220, 70, 40, 30);
		rPerna2.setEnabled(false);

		rPerna3 = new JFormattedTextField("");
		rPerna3.setBounds(220, 100, 40, 30);
		rPerna3.setEnabled(false);

		rPerna4 = new JFormattedTextField("");
		rPerna4.setBounds(220, 130, 40, 30);
		rPerna4.setEnabled(false);

		rPerna5 = new JFormattedTextField("");
		rPerna5.setBounds(220, 160, 40, 30);
		rPerna5.setEnabled(false);

		rPerna6 = new JFormattedTextField("");
		rPerna6.setBounds(220, 190, 40, 30);
		rPerna6.setEnabled(false);

		rPerna7 = new JFormattedTextField("");
		rPerna7.setBounds(220, 220, 40, 30);
		rPerna7.setEnabled(false);

		rPerna8 = new JFormattedTextField("");
		rPerna8.setBounds(220, 250, 40, 30);
		rPerna8.setEnabled(false);

		rPerna9 = new JFormattedTextField("");
		rPerna9.setBounds(220, 280, 40, 30);
		rPerna9.setEnabled(false);

		rPerna10 = new JFormattedTextField("");
		rPerna10.setBounds(220, 310, 40, 30);
		rPerna10.setEnabled(false);

		rPerna11 = new JFormattedTextField("");
		rPerna11.setBounds(220, 340, 40, 30);
		rPerna11.setEnabled(false);

		rPerna12 = new JFormattedTextField("");
		rPerna12.setBounds(220, 370, 40, 30);
		rPerna12.setEnabled(false);

		lbExCostas = new JLabel("Exercícios: ");
		lbExCostas.setBounds(12, 20, 100, 20);

		cCostas1 = new JCheckBox("Remada alta");
		cCostas1.setBounds(10, 40, 140, 30);
		cCostas1.setBackground(Color.WHITE);

		cCostas2 = new JCheckBox("Remada alta/barra me.");
		cCostas2.setBounds(10, 70, 150, 30);
		cCostas2.setBackground(Color.WHITE);

		cCostas3 = new JCheckBox("Remada baixa");
		cCostas3.setBounds(10, 100, 140, 30);
		cCostas3.setBackground(Color.WHITE);

		cCostas4 = new JCheckBox("Remada em pé costas");
		cCostas4.setBounds(10, 130, 150, 30);
		cCostas4.setBackground(Color.WHITE);

		cCostas5 = new JCheckBox("Remada sentada");
		cCostas5.setBounds(10, 160, 140, 30);
		cCostas5.setBackground(Color.WHITE);

		cCostas6 = new JCheckBox("Remada unilateral");
		cCostas6.setBounds(10, 190, 140, 30);
		cCostas6.setBackground(Color.WHITE);

		cCostas7 = new JCheckBox("Serrote");
		cCostas7.setBounds(10, 220, 140, 30);
		cCostas7.setBackground(Color.WHITE);

		cCostas8 = new JCheckBox("Pull down");
		cCostas8.setBounds(10, 250, 140, 30);
		cCostas8.setBackground(Color.WHITE);

		cCostas9 = new JCheckBox("Puxada atrás");
		cCostas9.setBounds(10, 280, 140, 30);
		cCostas9.setBackground(Color.WHITE);

		cCostas10 = new JCheckBox("Puxada frente");
		cCostas10.setBounds(10, 310, 140, 30);
		cCostas10.setBackground(Color.WHITE);

		cCostas11 = new JCheckBox("Puxada invertida");
		cCostas11.setBounds(10, 340, 140, 30);
		cCostas11.setBackground(Color.WHITE);

		lbSeriesCostas = new JLabel("Séries: ");
		lbSeriesCostas.setBounds(162, 20, 100, 20);

		lbRepeticoesCostas = new JLabel("Repetições: ");
		lbRepeticoesCostas.setBounds(220, 20, 100, 20);

		sCostas1 = new JFormattedTextField("");
		sCostas1.setBounds(162, 40, 40, 30);
		sCostas1.setEnabled(false);

		sCostas2 = new JFormattedTextField("");
		sCostas2.setBounds(162, 70, 40, 30);
		sCostas2.setEnabled(false);

		sCostas3 = new JFormattedTextField("");
		sCostas3.setBounds(162, 100, 40, 30);
		sCostas3.setEnabled(false);

		sCostas4 = new JFormattedTextField("");
		sCostas4.setBounds(162, 130, 40, 30);
		sCostas4.setEnabled(false);

		sCostas5 = new JFormattedTextField("");
		sCostas5.setBounds(162, 160, 40, 30);
		sCostas5.setEnabled(false);

		sCostas6 = new JFormattedTextField("");
		sCostas6.setBounds(162, 190, 40, 30);
		sCostas6.setEnabled(false);

		sCostas7 = new JFormattedTextField("");
		sCostas7.setBounds(162, 220, 40, 30);
		sCostas7.setEnabled(false);

		sCostas8 = new JFormattedTextField("");
		sCostas8.setBounds(162, 250, 40, 30);
		sCostas8.setEnabled(false);

		sCostas9 = new JFormattedTextField("");
		sCostas9.setBounds(162, 280, 40, 30);
		sCostas9.setEnabled(false);

		sCostas10 = new JFormattedTextField("");
		sCostas10.setBounds(162, 310, 40, 30);
		sCostas10.setEnabled(false);

		sCostas11 = new JFormattedTextField("");
		sCostas11.setBounds(162, 340, 40, 30);
		sCostas11.setEnabled(false);

		rCostas1 = new JFormattedTextField("");
		rCostas1.setBounds(220, 40, 40, 30);
		rCostas1.setEnabled(false);

		rCostas2 = new JFormattedTextField("");
		rCostas2.setBounds(220, 70, 40, 30);
		rCostas2.setEnabled(false);

		rCostas3 = new JFormattedTextField("");
		rCostas3.setBounds(220, 100, 40, 30);
		rCostas3.setEnabled(false);

		rCostas4 = new JFormattedTextField("");
		rCostas4.setBounds(220, 130, 40, 30);
		rCostas4.setEnabled(false);

		rCostas5 = new JFormattedTextField("");
		rCostas5.setBounds(220, 160, 40, 30);
		rCostas5.setEnabled(false);

		rCostas6 = new JFormattedTextField("");
		rCostas6.setBounds(220, 190, 40, 30);
		rCostas6.setEnabled(false);

		rCostas7 = new JFormattedTextField("");
		rCostas7.setBounds(220, 220, 40, 30);
		rCostas7.setEnabled(false);

		rCostas8 = new JFormattedTextField("");
		rCostas8.setBounds(220, 250, 40, 30);
		rCostas8.setEnabled(false);

		rCostas9 = new JFormattedTextField("");
		rCostas9.setBounds(220, 280, 40, 30);
		rCostas9.setEnabled(false);

		rCostas10 = new JFormattedTextField("");
		rCostas10.setBounds(220, 310, 40, 30);
		rCostas10.setEnabled(false);

		rCostas11 = new JFormattedTextField("");
		rCostas11.setBounds(220, 340, 40, 30);
		rCostas11.setEnabled(false);

		lbExBracos = new JLabel("Exercícios: ");
		lbExBracos.setBounds(12, 20, 100, 20);

		cBracos1 = new JCheckBox("Rosca concentrada");
		cBracos1.setBounds(10, 40, 140, 30);
		cBracos1.setBackground(Color.WHITE);

		cBracos2 = new JCheckBox("Rosca direta");
		cBracos2.setBounds(10, 70, 140, 30);
		cBracos2.setBackground(Color.WHITE);

		cBracos3 = new JCheckBox("Rosca invertida");
		cBracos3.setBounds(10, 100, 140, 30);
		cBracos3.setBackground(Color.WHITE);

		cBracos4 = new JCheckBox("Rosca scott");
		cBracos4.setBounds(10, 130, 140, 30);
		cBracos4.setBackground(Color.WHITE);

		cBracos5 = new JCheckBox("Tríceps pulley");
		cBracos5.setBounds(10, 160, 140, 30);
		cBracos5.setBackground(Color.WHITE);

		cBracos6 = new JCheckBox("Tríceps pulley invertido");
		cBracos6.setBounds(10, 190, 150, 30);
		cBracos6.setBackground(Color.WHITE);

		cBracos7 = new JCheckBox("Tríceps testa");
		cBracos7.setBounds(10, 220, 140, 30);
		cBracos7.setBackground(Color.WHITE);

		cBracos8 = new JCheckBox("Tríceps unilateral");
		cBracos8.setBounds(10, 250, 140, 30);
		cBracos8.setBackground(Color.WHITE);

		lbSeriesBracos = new JLabel("Séries: ");
		lbSeriesBracos.setBounds(162, 20, 100, 20);

		lbRepeticoesBracos = new JLabel("Repetições: ");
		lbRepeticoesBracos.setBounds(220, 20, 100, 20);

		sBracos1 = new JFormattedTextField("");
		sBracos1.setBounds(162, 40, 40, 30);
		sBracos1.setEnabled(false);

		sBracos2 = new JFormattedTextField("");
		sBracos2.setBounds(162, 70, 40, 30);
		sBracos2.setEnabled(false);

		sBracos3 = new JFormattedTextField("");
		sBracos3.setBounds(162, 100, 40, 30);
		sBracos3.setEnabled(false);

		sBracos4 = new JFormattedTextField("");
		sBracos4.setBounds(162, 130, 40, 30);
		sBracos4.setEnabled(false);

		sBracos5 = new JFormattedTextField("");
		sBracos5.setBounds(162, 160, 40, 30);
		sBracos5.setEnabled(false);

		sBracos6 = new JFormattedTextField("");
		sBracos6.setBounds(162, 190, 40, 30);
		sBracos6.setEnabled(false);

		sBracos7 = new JFormattedTextField("");
		sBracos7.setBounds(162, 220, 40, 30);
		sBracos7.setEnabled(false);

		sBracos8 = new JFormattedTextField("");
		sBracos8.setBounds(162, 250, 40, 30);
		sBracos8.setEnabled(false);

		rBracos1 = new JFormattedTextField("");
		rBracos1.setBounds(220, 40, 40, 30);
		rBracos1.setEnabled(false);

		rBracos2 = new JFormattedTextField("");
		rBracos2.setBounds(220, 70, 40, 30);
		rBracos2.setEnabled(false);

		rBracos3 = new JFormattedTextField("");
		rBracos3.setBounds(220, 100, 40, 30);
		rBracos3.setEnabled(false);

		rBracos4 = new JFormattedTextField("");
		rBracos4.setBounds(220, 130, 40, 30);
		rBracos4.setEnabled(false);

		rBracos5 = new JFormattedTextField("");
		rBracos5.setBounds(220, 160, 40, 30);
		rBracos5.setEnabled(false);

		rBracos6 = new JFormattedTextField("");
		rBracos6.setBounds(220, 190, 40, 30);
		rBracos6.setEnabled(false);

		rBracos7 = new JFormattedTextField("");
		rBracos7.setBounds(220, 220, 40, 30);
		rBracos7.setEnabled(false);

		rBracos8 = new JFormattedTextField("");
		rBracos8.setBounds(220, 250, 40, 30);
		rBracos8.setEnabled(false);

		lbExPeito = new JLabel("Exercícios: ");
		lbExPeito.setBounds(12, 20, 100, 20);

		cPeito1 = new JCheckBox("Peck deck (voador)");
		cPeito1.setBounds(10, 40, 140, 30);
		cPeito1.setBackground(Color.WHITE);

		cPeito2 = new JCheckBox("Pull over");
		cPeito2.setBounds(10, 70, 140, 30);
		cPeito2.setBackground(Color.WHITE);

		cPeito3 = new JCheckBox("Supino declinado");
		cPeito3.setBounds(10, 100, 140, 30);
		cPeito3.setBackground(Color.WHITE);

		cPeito4 = new JCheckBox("Supino inclinado");
		cPeito4.setBounds(10, 130, 140, 30);
		cPeito4.setBackground(Color.WHITE);

		cPeito5 = new JCheckBox("Supino reto");
		cPeito5.setBounds(10, 160, 140, 30);
		cPeito5.setBackground(Color.WHITE);

		lbSeriesPeito = new JLabel("Séries: ");
		lbSeriesPeito.setBounds(170, 20, 100, 20);

		lbRepeticoesPeito = new JLabel("Repetições: ");
		lbRepeticoesPeito.setBounds(228, 20, 100, 20);

		sPeito1 = new JFormattedTextField("");
		sPeito1.setBounds(170, 40, 40, 30);
		sPeito1.setEnabled(false);

		sPeito2 = new JFormattedTextField("");
		sPeito2.setBounds(170, 70, 40, 30);
		sPeito2.setEnabled(false);

		sPeito3 = new JFormattedTextField("");
		sPeito3.setBounds(170, 100, 40, 30);
		sPeito3.setEnabled(false);

		sPeito4 = new JFormattedTextField("");
		sPeito4.setBounds(170, 130, 40, 30);
		sPeito4.setEnabled(false);

		sPeito5 = new JFormattedTextField("");
		sPeito5.setBounds(170, 160, 40, 30);
		sPeito5.setEnabled(false);

		rPeito1 = new JFormattedTextField("");
		rPeito1.setBounds(228, 40, 40, 30);
		rPeito1.setEnabled(false);

		rPeito2 = new JFormattedTextField("");
		rPeito2.setBounds(228, 70, 40, 30);
		rPeito2.setEnabled(false);

		rPeito3 = new JFormattedTextField("");
		rPeito3.setBounds(228, 100, 40, 30);
		rPeito3.setEnabled(false);

		rPeito4 = new JFormattedTextField("");
		rPeito4.setBounds(228, 130, 40, 30);
		rPeito4.setEnabled(false);

		rPeito5 = new JFormattedTextField("");
		rPeito5.setBounds(228, 160, 40, 30);
		rPeito5.setEnabled(false);

		lbExOmAb = new JLabel("Exercícios: ");
		lbExOmAb.setBounds(12, 20, 100, 20);

		cOmAb1 = new JCheckBox("Abdominal crunch");
		cOmAb1.setBounds(10, 40, 140, 30);
		cOmAb1.setBackground(Color.WHITE);

		cOmAb2 = new JCheckBox("Elevação frontal");
		cOmAb2.setBounds(10, 70, 140, 30);
		cOmAb2.setBackground(Color.WHITE);

		cOmAb3 = new JCheckBox("Elevação lateral");
		cOmAb3.setBounds(10, 100, 140, 30);
		cOmAb3.setBackground(Color.WHITE);

		cOmAb4 = new JCheckBox("Encolhimento de ombro");
		cOmAb4.setBounds(10, 130, 155, 30);
		cOmAb4.setBackground(Color.WHITE);

		cOmAb5 = new JCheckBox("Desenvolvimento abdo.");
		cOmAb5.setBounds(10, 160, 155, 30);
		cOmAb5.setBackground(Color.WHITE);

		cOmAb6 = new JCheckBox("Trapézio");
		cOmAb6.setBounds(10, 190, 140, 30);
		cOmAb6.setBackground(Color.WHITE);

		lbSeriesOmAb = new JLabel("Séries: ");
		lbSeriesOmAb.setBounds(170, 20, 100, 20);

		lbRepeticoesOmAb = new JLabel("Repetições: ");
		lbRepeticoesOmAb.setBounds(228, 20, 100, 20);

		sOmAb1 = new JFormattedTextField("");
		sOmAb1.setBounds(170, 40, 40, 30);
		sOmAb1.setEnabled(false);

		sOmAb2 = new JFormattedTextField("");
		sOmAb2.setBounds(170, 70, 40, 30);
		sOmAb2.setEnabled(false);

		sOmAb3 = new JFormattedTextField("");
		sOmAb3.setBounds(170, 100, 40, 30);
		sOmAb3.setEnabled(false);

		sOmAb4 = new JFormattedTextField("");
		sOmAb4.setBounds(170, 130, 40, 30);
		sOmAb4.setEnabled(false);

		sOmAb5 = new JFormattedTextField("");
		sOmAb5.setBounds(170, 160, 40, 30);
		sOmAb5.setEnabled(false);

		sOmAb6 = new JFormattedTextField("");
		sOmAb6.setBounds(170, 190, 40, 30);
		sOmAb6.setEnabled(false);

		rOmAb1 = new JFormattedTextField("");
		rOmAb1.setBounds(228, 40, 40, 30);
		rOmAb1.setEnabled(false);

		rOmAb2 = new JFormattedTextField("");
		rOmAb2.setBounds(228, 70, 40, 30);
		rOmAb2.setEnabled(false);

		rOmAb3 = new JFormattedTextField("");
		rOmAb3.setBounds(228, 100, 40, 30);
		rOmAb3.setEnabled(false);

		rOmAb4 = new JFormattedTextField("");
		rOmAb4.setBounds(228, 130, 40, 30);
		rOmAb4.setEnabled(false);

		rOmAb5 = new JFormattedTextField("");
		rOmAb5.setBounds(228, 160, 40, 30);
		rOmAb5.setEnabled(false);

		rOmAb6 = new JFormattedTextField("");
		rOmAb6.setBounds(228, 190, 40, 30);
		rOmAb6.setEnabled(false);

		// Mascaras de formato
		try {
			this.mfDataNasc = new MaskFormatter("##/##/####");
			mfDataNasc.setPlaceholderCharacter('_');
			this.mfDataNasc.install(tfDataNasc);

			this.mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.setPlaceholderCharacter('_');
			this.mfCpf.install(this.tfCpf);

			this.mfDataInicio = new MaskFormatter("##/##/####");
			mfDataInicio.setPlaceholderCharacter('_');
			this.mfDataInicio.install(tfDataInicio);

			this.mfDataTermino = new MaskFormatter("##/##/####");
			mfDataTermino.setPlaceholderCharacter('_');
			this.mfDataTermino.install(tfDataTermino);

			this.msPerna1 = new MaskFormatter("##");
			this.msPerna1.install(sPerna1);

			this.msPerna2 = new MaskFormatter("##");
			this.msPerna2.install(sPerna2);

			this.msPerna3 = new MaskFormatter("##");
			this.msPerna3.install(sPerna3);

			this.msPerna4 = new MaskFormatter("##");
			this.msPerna4.install(sPerna4);

			this.msPerna5 = new MaskFormatter("##");
			this.msPerna5.install(sPerna5);

			this.msPerna6 = new MaskFormatter("##");
			this.msPerna6.install(sPerna6);

			this.msPerna7 = new MaskFormatter("##");
			this.msPerna7.install(sPerna7);

			this.msPerna8 = new MaskFormatter("##");
			this.msPerna8.install(sPerna8);

			this.msPerna9 = new MaskFormatter("##");
			this.msPerna9.install(sPerna9);

			this.msPerna10 = new MaskFormatter("##");
			this.msPerna10.install(sPerna10);

			this.msPerna11 = new MaskFormatter("##");
			this.msPerna11.install(sPerna11);

			this.msPerna12 = new MaskFormatter("##");
			this.msPerna12.install(sPerna12);

			this.mrPerna1 = new MaskFormatter("##");
			this.mrPerna1.install(rPerna1);

			this.mrPerna2 = new MaskFormatter("##");
			this.mrPerna2.install(rPerna2);

			this.mrPerna3 = new MaskFormatter("##");
			this.mrPerna3.install(rPerna3);

			this.mrPerna4 = new MaskFormatter("##");
			this.mrPerna4.install(rPerna4);

			this.mrPerna5 = new MaskFormatter("##");
			this.mrPerna5.install(rPerna5);

			this.mrPerna6 = new MaskFormatter("##");
			this.mrPerna6.install(rPerna6);

			this.mrPerna7 = new MaskFormatter("##");
			this.mrPerna7.install(rPerna7);

			this.mrPerna8 = new MaskFormatter("##");
			this.mrPerna8.install(rPerna8);

			this.mrPerna9 = new MaskFormatter("##");
			this.mrPerna9.install(rPerna9);

			this.mrPerna10 = new MaskFormatter("##");
			this.mrPerna10.install(rPerna10);

			this.mrPerna11 = new MaskFormatter("##");
			this.mrPerna11.install(rPerna11);

			this.mrPerna12 = new MaskFormatter("##");
			this.mrPerna12.install(rPerna12);

			this.msCostas1 = new MaskFormatter("##");
			this.msCostas1.install(sCostas1);

			this.msCostas2 = new MaskFormatter("##");
			this.msCostas2.install(sCostas2);

			this.msCostas3 = new MaskFormatter("##");
			this.msCostas3.install(sCostas3);

			this.msCostas4 = new MaskFormatter("##");
			this.msCostas4.install(sCostas4);

			this.msCostas5 = new MaskFormatter("##");
			this.msCostas5.install(sCostas5);

			this.msCostas6 = new MaskFormatter("##");
			this.msCostas6.install(sCostas6);

			this.msCostas7 = new MaskFormatter("##");
			this.msCostas7.install(sCostas7);

			this.msCostas8 = new MaskFormatter("##");
			this.msCostas8.install(sCostas8);

			this.msCostas9 = new MaskFormatter("##");
			this.msCostas9.install(sCostas9);

			this.msCostas10 = new MaskFormatter("##");
			this.msCostas10.install(sCostas10);

			this.msCostas11 = new MaskFormatter("##");
			this.msCostas11.install(sCostas11);

			this.mrCostas1 = new MaskFormatter("##");
			this.mrCostas1.install(rCostas1);

			this.mrCostas2 = new MaskFormatter("##");
			this.mrCostas2.install(rCostas2);

			this.mrCostas3 = new MaskFormatter("##");
			this.mrCostas3.install(rCostas3);

			this.mrCostas4 = new MaskFormatter("##");
			this.mrCostas4.install(rCostas4);

			this.mrCostas5 = new MaskFormatter("##");
			this.mrCostas5.install(rCostas5);

			this.mrCostas6 = new MaskFormatter("##");
			this.mrCostas6.install(rCostas6);

			this.mrCostas7 = new MaskFormatter("##");
			this.mrCostas7.install(rCostas7);

			this.mrCostas8 = new MaskFormatter("##");
			this.mrCostas8.install(rCostas8);

			this.mrCostas9 = new MaskFormatter("##");
			this.mrCostas9.install(rCostas9);

			this.mrCostas10 = new MaskFormatter("##");
			this.mrCostas10.install(rCostas10);

			this.mrCostas11 = new MaskFormatter("##");
			this.mrCostas11.install(rCostas11);

			this.msBracos1 = new MaskFormatter("##");
			this.msBracos1.install(sBracos1);

			this.msBracos2 = new MaskFormatter("##");
			this.msBracos2.install(sBracos2);

			this.msBracos3 = new MaskFormatter("##");
			this.msBracos3.install(sBracos3);

			this.msBracos4 = new MaskFormatter("##");
			this.msBracos4.install(sBracos4);

			this.msBracos5 = new MaskFormatter("##");
			this.msBracos5.install(sBracos5);

			this.msBracos6 = new MaskFormatter("##");
			this.msBracos6.install(sBracos6);

			this.msBracos7 = new MaskFormatter("##");
			this.msBracos7.install(sBracos7);

			this.msBracos8 = new MaskFormatter("##");
			this.msBracos8.install(sBracos8);

			this.mrBracos1 = new MaskFormatter("##");
			this.mrBracos1.install(rBracos1);

			this.mrBracos2 = new MaskFormatter("##");
			this.mrBracos2.install(rBracos2);

			this.mrBracos3 = new MaskFormatter("##");
			this.mrBracos3.install(rBracos3);

			this.mrBracos4 = new MaskFormatter("##");
			this.mrBracos4.install(rBracos4);

			this.mrBracos5 = new MaskFormatter("##");
			this.mrBracos5.install(rBracos5);

			this.mrBracos6 = new MaskFormatter("##");
			this.mrBracos6.install(rBracos6);

			this.mrBracos7 = new MaskFormatter("##");
			this.mrBracos7.install(rBracos7);

			this.mrBracos8 = new MaskFormatter("##");
			this.mrBracos8.install(rBracos8);

			this.msPeito1 = new MaskFormatter("##");
			this.msPeito1.install(sPeito1);

			this.msPeito2 = new MaskFormatter("##");
			this.msPeito2.install(sPeito2);

			this.msPeito3 = new MaskFormatter("##");
			this.msPeito3.install(sPeito3);

			this.msPeito4 = new MaskFormatter("##");
			this.msPeito4.install(sPeito4);

			this.msPeito5 = new MaskFormatter("##");
			this.msPeito5.install(sPeito5);

			this.mrPeito1 = new MaskFormatter("##");
			this.mrPeito1.install(rPeito1);

			this.mrPeito2 = new MaskFormatter("##");
			this.mrPeito2.install(rPeito2);

			this.mrPeito3 = new MaskFormatter("##");
			this.mrPeito3.install(rPeito3);

			this.mrPeito4 = new MaskFormatter("##");
			this.mrPeito4.install(rPeito4);

			this.mrPeito5 = new MaskFormatter("##");
			this.mrPeito5.install(rPeito5);

			this.msOmAb1 = new MaskFormatter("##");
			this.msOmAb1.install(sOmAb1);

			this.msOmAb2 = new MaskFormatter("##");
			this.msOmAb2.install(sOmAb2);

			this.msOmAb3 = new MaskFormatter("##");
			this.msOmAb3.install(sOmAb3);

			this.msOmAb4 = new MaskFormatter("##");
			this.msOmAb4.install(sOmAb4);

			this.msOmAb5 = new MaskFormatter("##");
			this.msOmAb5.install(sOmAb5);

			this.msOmAb6 = new MaskFormatter("##");
			this.msOmAb6.install(sOmAb6);

			this.mrOmAb1 = new MaskFormatter("##");
			this.mrOmAb1.install(rOmAb1);

			this.mrOmAb2 = new MaskFormatter("##");
			this.mrOmAb2.install(rOmAb2);

			this.mrOmAb3 = new MaskFormatter("##");
			this.mrOmAb3.install(rOmAb3);

			this.mrOmAb4 = new MaskFormatter("##");
			this.mrOmAb4.install(rOmAb4);

			this.mrOmAb5 = new MaskFormatter("##");
			this.mrOmAb5.install(rOmAb5);

			this.mrOmAb6 = new MaskFormatter("##");
			this.mrOmAb6.install(rOmAb6);

		} catch (Exception e) {

		}

		// tratando os checkbox
		CheckBoxHandler tratador = new CheckBoxHandler();
		cPerna1.addItemListener(tratador);
		cPerna2.addItemListener(tratador);
		cPerna3.addItemListener(tratador);
		cPerna4.addItemListener(tratador);
		cPerna5.addItemListener(tratador);
		cPerna6.addItemListener(tratador);
		cPerna7.addItemListener(tratador);
		cPerna8.addItemListener(tratador);
		cPerna9.addItemListener(tratador);
		cPerna10.addItemListener(tratador);
		cPerna11.addItemListener(tratador);
		cPerna12.addItemListener(tratador);

		cCostas1.addItemListener(tratador);
		cCostas2.addItemListener(tratador);
		cCostas3.addItemListener(tratador);
		cCostas4.addItemListener(tratador);
		cCostas5.addItemListener(tratador);
		cCostas6.addItemListener(tratador);
		cCostas7.addItemListener(tratador);
		cCostas8.addItemListener(tratador);
		cCostas9.addItemListener(tratador);
		cCostas10.addItemListener(tratador);
		cCostas11.addItemListener(tratador);

		cBracos1.addItemListener(tratador);
		cBracos2.addItemListener(tratador);
		cBracos3.addItemListener(tratador);
		cBracos4.addItemListener(tratador);
		cBracos5.addItemListener(tratador);
		cBracos6.addItemListener(tratador);
		cBracos7.addItemListener(tratador);
		cBracos8.addItemListener(tratador);

		cOmAb1.addItemListener(tratador);
		cOmAb2.addItemListener(tratador);
		cOmAb3.addItemListener(tratador);
		cOmAb4.addItemListener(tratador);
		cOmAb5.addItemListener(tratador);
		cOmAb6.addItemListener(tratador);

		cPeito1.addItemListener(tratador);
		cPeito2.addItemListener(tratador);
		cPeito3.addItemListener(tratador);
		cPeito4.addItemListener(tratador);
		cPeito5.addItemListener(tratador);

		// Instancia/Cria o Painel "SUPERIOR"
		this.pDadosPrescricao = new JPanel(null);
		this.pDadosPrescricao.setBorder(new TitledBorder("DADOS PRESCRIÇÃO DE TREINO"));
		this.pDadosPrescricao.setBackground(Color.WHITE);
		this.pDadosPrescricao.setBounds(2, 7, 1215, 140);
		// Adiciona os componentes no panel "Superior"
		this.pDadosPrescricao.add(this.lbCodigoAluno);
		this.pDadosPrescricao.add(this.tfCodigoAluno);
		this.pDadosPrescricao.add(this.bPesquisarAluno);
		this.pDadosPrescricao.add(this.lbNome);
		this.pDadosPrescricao.add(this.tfNome);
		this.pDadosPrescricao.add(this.lbDataNasc);
		this.pDadosPrescricao.add(this.tfDataNasc);
		this.pDadosPrescricao.add(this.lbCpf);
		this.pDadosPrescricao.add(this.tfCpf);
		this.pDadosPrescricao.add(this.lbRg);
		this.pDadosPrescricao.add(this.tfRg);
		this.pDadosPrescricao.add(this.lbModalidade);
		this.pDadosPrescricao.add(this.tfModalidade);
		this.pDadosPrescricao.add(this.lbSexo);
		this.pDadosPrescricao.add(this.tfSexo);
		this.pDadosPrescricao.add(this.lbCodigoPrescricao);
		this.pDadosPrescricao.add(this.tfCodigoPrescricao);
		this.pDadosPrescricao.add(this.lbPersonal);
		this.pDadosPrescricao.add(this.cbPersonal);
		this.pDadosPrescricao.add(this.bPesquisarPrescricao);
		this.pDadosPrescricao.add(this.lbDataInicio);
		this.pDadosPrescricao.add(this.tfDataInicio);
		this.pDadosPrescricao.add(this.lbDataTermino);
		this.pDadosPrescricao.add(this.tfDataTermino);

		// Instancia/Cria o Painel "Perna"
		this.pDadosPernas = new JPanel(null);
		this.pDadosPernas.setBorder(new TitledBorder("PERNAS"));
		this.pDadosPernas.setBackground(Color.WHITE);
		this.pDadosPernas.setBounds(2, 147, 300, 425);

		this.pDadosPernas.add(this.lbExPerna);
		this.pDadosPernas.add(this.cPerna1);
		this.pDadosPernas.add(this.cPerna2);
		this.pDadosPernas.add(this.cPerna3);
		this.pDadosPernas.add(this.cPerna4);
		this.pDadosPernas.add(this.cPerna5);
		this.pDadosPernas.add(this.cPerna6);
		this.pDadosPernas.add(this.cPerna7);
		this.pDadosPernas.add(this.cPerna8);
		this.pDadosPernas.add(this.cPerna9);
		this.pDadosPernas.add(this.cPerna10);
		this.pDadosPernas.add(this.cPerna11);
		this.pDadosPernas.add(this.cPerna12);
		this.pDadosPernas.add(this.lbSeriesPerna);
		this.pDadosPernas.add(this.lbRepeticoesPerna);
		this.pDadosPernas.add(this.sPerna1);
		this.pDadosPernas.add(this.sPerna2);
		this.pDadosPernas.add(this.sPerna3);
		this.pDadosPernas.add(this.sPerna4);
		this.pDadosPernas.add(this.sPerna5);
		this.pDadosPernas.add(this.sPerna6);
		this.pDadosPernas.add(this.sPerna7);
		this.pDadosPernas.add(this.sPerna8);
		this.pDadosPernas.add(this.sPerna9);
		this.pDadosPernas.add(this.sPerna10);
		this.pDadosPernas.add(this.sPerna11);
		this.pDadosPernas.add(this.sPerna12);
		this.pDadosPernas.add(this.rPerna1);
		this.pDadosPernas.add(this.rPerna2);
		this.pDadosPernas.add(this.rPerna3);
		this.pDadosPernas.add(this.rPerna4);
		this.pDadosPernas.add(this.rPerna5);
		this.pDadosPernas.add(this.rPerna6);
		this.pDadosPernas.add(this.rPerna7);
		this.pDadosPernas.add(this.rPerna8);
		this.pDadosPernas.add(this.rPerna9);
		this.pDadosPernas.add(this.rPerna10);
		this.pDadosPernas.add(this.rPerna11);
		this.pDadosPernas.add(this.rPerna12);

		// Instancia/Cria o Painel "Costas"
		this.pDadosCostas = new JPanel(null);
		this.pDadosCostas.setBorder(new TitledBorder("COSTAS"));
		this.pDadosCostas.setBackground(Color.WHITE);
		this.pDadosCostas.setBounds(307, 147, 300, 425);

		this.pDadosCostas.add(this.lbExCostas);
		this.pDadosCostas.add(this.cCostas1);
		this.pDadosCostas.add(this.cCostas2);
		this.pDadosCostas.add(this.cCostas3);
		this.pDadosCostas.add(this.cCostas4);
		this.pDadosCostas.add(this.cCostas5);
		this.pDadosCostas.add(this.cCostas6);
		this.pDadosCostas.add(this.cCostas7);
		this.pDadosCostas.add(this.cCostas8);
		this.pDadosCostas.add(this.cCostas9);
		this.pDadosCostas.add(this.cCostas10);
		this.pDadosCostas.add(this.cCostas11);
		this.pDadosCostas.add(this.lbSeriesCostas);
		this.pDadosCostas.add(this.lbRepeticoesCostas);
		this.pDadosCostas.add(this.sCostas1);
		this.pDadosCostas.add(this.sCostas2);
		this.pDadosCostas.add(this.sCostas3);
		this.pDadosCostas.add(this.sCostas4);
		this.pDadosCostas.add(this.sCostas5);
		this.pDadosCostas.add(this.sCostas6);
		this.pDadosCostas.add(this.sCostas7);
		this.pDadosCostas.add(this.sCostas8);
		this.pDadosCostas.add(this.sCostas9);
		this.pDadosCostas.add(this.sCostas10);
		this.pDadosCostas.add(this.sCostas11);
		this.pDadosCostas.add(this.rCostas1);
		this.pDadosCostas.add(this.rCostas2);
		this.pDadosCostas.add(this.rCostas3);
		this.pDadosCostas.add(this.rCostas4);
		this.pDadosCostas.add(this.rCostas5);
		this.pDadosCostas.add(this.rCostas6);
		this.pDadosCostas.add(this.rCostas7);
		this.pDadosCostas.add(this.rCostas8);
		this.pDadosCostas.add(this.rCostas9);
		this.pDadosCostas.add(this.rCostas10);
		this.pDadosCostas.add(this.rCostas11);

		// Instancia/Cria o Painel "Bracos"
		this.pDadosBracos = new JPanel(null);
		this.pDadosBracos.setBorder(new TitledBorder("BRAÇOS"));
		this.pDadosBracos.setBackground(Color.WHITE);
		this.pDadosBracos.setBounds(612, 147, 300, 425);

		this.pDadosBracos.add(this.lbExBracos);
		this.pDadosBracos.add(this.cBracos1);
		this.pDadosBracos.add(this.cBracos2);
		this.pDadosBracos.add(this.cBracos3);
		this.pDadosBracos.add(this.cBracos4);
		this.pDadosBracos.add(this.cBracos5);
		this.pDadosBracos.add(this.cBracos6);
		this.pDadosBracos.add(this.cBracos7);
		this.pDadosBracos.add(this.cBracos8);
		this.pDadosBracos.add(this.lbSeriesBracos);
		this.pDadosBracos.add(this.lbRepeticoesBracos);
		this.pDadosBracos.add(this.sBracos1);
		this.pDadosBracos.add(this.sBracos2);
		this.pDadosBracos.add(this.sBracos3);
		this.pDadosBracos.add(this.sBracos4);
		this.pDadosBracos.add(this.sBracos5);
		this.pDadosBracos.add(this.sBracos6);
		this.pDadosBracos.add(this.sBracos7);
		this.pDadosBracos.add(this.sBracos8);
		this.pDadosBracos.add(this.rBracos1);
		this.pDadosBracos.add(this.rBracos2);
		this.pDadosBracos.add(this.rBracos3);
		this.pDadosBracos.add(this.rBracos4);
		this.pDadosBracos.add(this.rBracos5);
		this.pDadosBracos.add(this.rBracos6);
		this.pDadosBracos.add(this.rBracos7);
		this.pDadosBracos.add(this.rBracos8);

		// Instancia/Cria o Painel "Peito"
		this.pDadosPeito = new JPanel(null);
		this.pDadosPeito.setBorder(new TitledBorder("PEITO"));
		this.pDadosPeito.setBackground(Color.WHITE);
		this.pDadosPeito.setBounds(917, 147, 300, 198);

		this.pDadosPeito.add(this.lbExPeito);
		this.pDadosPeito.add(this.cPeito1);
		this.pDadosPeito.add(this.cPeito2);
		this.pDadosPeito.add(this.cPeito3);
		this.pDadosPeito.add(this.cPeito4);
		this.pDadosPeito.add(this.cPeito5);
		this.pDadosPeito.add(this.lbSeriesPeito);
		this.pDadosPeito.add(this.lbRepeticoesPeito);
		this.pDadosPeito.add(this.sPeito1);
		this.pDadosPeito.add(this.sPeito2);
		this.pDadosPeito.add(this.sPeito3);
		this.pDadosPeito.add(this.sPeito4);
		this.pDadosPeito.add(this.sPeito5);
		this.pDadosPeito.add(this.rPeito1);
		this.pDadosPeito.add(this.rPeito2);
		this.pDadosPeito.add(this.rPeito3);
		this.pDadosPeito.add(this.rPeito4);
		this.pDadosPeito.add(this.rPeito5);

		// Instancia/Cria o Painel "Ombro e abdomen"
		this.pDadosOmbroAbdomen = new JPanel(null);
		this.pDadosOmbroAbdomen.setBorder(new TitledBorder("OMBRO E ABDÔMEN"));
		this.pDadosOmbroAbdomen.setBackground(Color.WHITE);
		this.pDadosOmbroAbdomen.setBounds(917, 344, 300, 228);

		this.pDadosOmbroAbdomen.add(this.lbExOmAb);
		this.pDadosOmbroAbdomen.add(this.cOmAb1);
		this.pDadosOmbroAbdomen.add(this.cOmAb2);
		this.pDadosOmbroAbdomen.add(this.cOmAb3);
		this.pDadosOmbroAbdomen.add(this.cOmAb4);
		this.pDadosOmbroAbdomen.add(this.cOmAb5);
		this.pDadosOmbroAbdomen.add(this.cOmAb6);
		this.pDadosOmbroAbdomen.add(this.lbSeriesOmAb);
		this.pDadosOmbroAbdomen.add(this.lbRepeticoesOmAb);
		this.pDadosOmbroAbdomen.add(this.sOmAb1);
		this.pDadosOmbroAbdomen.add(this.sOmAb2);
		this.pDadosOmbroAbdomen.add(this.sOmAb3);
		this.pDadosOmbroAbdomen.add(this.sOmAb4);
		this.pDadosOmbroAbdomen.add(this.sOmAb5);
		this.pDadosOmbroAbdomen.add(this.sOmAb6);
		this.pDadosOmbroAbdomen.add(this.rOmAb1);
		this.pDadosOmbroAbdomen.add(this.rOmAb2);
		this.pDadosOmbroAbdomen.add(this.rOmAb3);
		this.pDadosOmbroAbdomen.add(this.rOmAb4);
		this.pDadosOmbroAbdomen.add(this.rOmAb5);
		this.pDadosOmbroAbdomen.add(this.rOmAb6);

		this.add(pDadosPrescricao);
		this.add(pDadosPernas);
		this.add(pDadosCostas);
		this.add(pDadosBracos);
		this.add(pDadosPeito);
		this.add(pDadosOmbroAbdomen);

		bSalvar = new JButton("Salvar");
		bSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarCampos();
			}
		});
		bSalvar.setBounds(307, 590, 120, 40);
		bSalvar.setMnemonic('S');
		bSalvar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/save.png"))));
		bSalvar.setToolTipText("Clique para salvar o cadastro !");
		add(bSalvar);

		bCancelar = new JButton("Cancelar");
		bCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar o cadastro ?", "Pergunta",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					setVisible(false);
				}
			}
		});
		bCancelar.setBounds(467, 590, 120, 40);
		bCancelar.setMnemonic('C');
		bCancelar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cancel.png"))));
		bCancelar.setToolTipText("Clique para cancelar o cadastro !");
		add(bCancelar);

		bExcluir = new JButton("Excluir");
		bExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		bExcluir.setBounds(627, 590, 120, 40);
		bExcluir.setMnemonic('E');
		bExcluir.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/delete.png"))));
		bExcluir.setToolTipText("Clique para excluir o cadastro !");
		add(bExcluir);

		bSair = new JButton("Sair");
		bSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		bSair.setBounds(787, 590, 120, 40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);

		bImprimir = new JButton("Imprimir");
		bImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		bImprimir.setBounds(1080, 590, 120, 40);
		bImprimir.setMnemonic('S');
		bImprimir.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/printer.png"))));
		bImprimir.setToolTipText("Clique para imprimir a prescriçãode treino !");
		add(bImprimir);
	}

	private class CheckBoxHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (cPerna1.isSelected()) {
				sPerna1.setEnabled(true);
				rPerna1.setEnabled(true);
			} else {
				sPerna1.setText("");
				rPerna1.setText("");
				sPerna1.setEnabled(false);
				rPerna1.setEnabled(false);
			}

			if (cPerna2.isSelected()) {
				sPerna2.setEnabled(true);
				rPerna2.setEnabled(true);
			} else {
				sPerna2.setText("");
				rPerna2.setText("");
				sPerna2.setEnabled(false);
				rPerna2.setEnabled(false);
			}

			if (cPerna3.isSelected()) {
				sPerna3.setEnabled(true);
				rPerna3.setEnabled(true);
			} else {
				sPerna3.setText("");
				rPerna3.setText("");
				sPerna3.setEnabled(false);
				rPerna3.setEnabled(false);
			}

			if (cPerna4.isSelected()) {
				sPerna4.setEnabled(true);
				rPerna4.setEnabled(true);
			} else {
				sPerna4.setText("");
				rPerna4.setText("");
				sPerna4.setEnabled(false);
				rPerna4.setEnabled(false);
			}

			if (cPerna5.isSelected()) {
				sPerna5.setEnabled(true);
				rPerna5.setEnabled(true);
			} else {
				sPerna5.setText("");
				rPerna5.setText("");
				sPerna5.setEnabled(false);
				rPerna5.setEnabled(false);
			}

			if (cPerna6.isSelected()) {
				sPerna6.setEnabled(true);
				rPerna6.setEnabled(true);
			} else {
				sPerna6.setText("");
				rPerna6.setText("");
				sPerna6.setEnabled(false);
				rPerna6.setEnabled(false);
			}

			if (cPerna7.isSelected()) {
				sPerna7.setEnabled(true);
				rPerna7.setEnabled(true);
			} else {
				sPerna7.setText("");
				rPerna7.setText("");
				sPerna7.setEnabled(false);
				rPerna7.setEnabled(false);
			}

			if (cPerna8.isSelected()) {
				sPerna8.setEnabled(true);
				rPerna8.setEnabled(true);
			} else {
				sPerna8.setText("");
				rPerna8.setText("");
				sPerna8.setEnabled(false);
				rPerna8.setEnabled(false);
			}

			if (cPerna9.isSelected()) {
				sPerna9.setEnabled(true);
				rPerna9.setEnabled(true);
			} else {
				sPerna9.setText("");
				rPerna9.setText("");
				sPerna9.setEnabled(false);
				rPerna9.setEnabled(false);
			}

			if (cPerna10.isSelected()) {
				sPerna10.setEnabled(true);
				rPerna10.setEnabled(true);
			} else {
				sPerna10.setText("");
				rPerna10.setText("");
				sPerna10.setEnabled(false);
				rPerna10.setEnabled(false);
			}

			if (cPerna11.isSelected()) {
				sPerna11.setEnabled(true);
				rPerna11.setEnabled(true);
			} else {
				sPerna11.setText("");
				rPerna11.setText("");
				sPerna11.setEnabled(false);
				rPerna11.setEnabled(false);
			}

			if (cPerna12.isSelected()) {
				sPerna12.setEnabled(true);
				rPerna12.setEnabled(true);
			} else {
				sPerna12.setText("");
				rPerna12.setText("");
				sPerna12.setEnabled(false);
				rPerna12.setEnabled(false);
			}

			if (cCostas1.isSelected()) {
				sCostas1.setEnabled(true);
				rCostas1.setEnabled(true);
			} else {
				sCostas1.setText("");
				rCostas1.setText("");
				sCostas1.setEnabled(false);
				rCostas1.setEnabled(false);
			}

			if (cCostas2.isSelected()) {
				sCostas2.setEnabled(true);
				rCostas2.setEnabled(true);
			} else {
				sCostas2.setText("");
				rCostas2.setText("");
				sCostas2.setEnabled(false);
				rCostas2.setEnabled(false);
			}

			if (cCostas3.isSelected()) {
				sCostas3.setEnabled(true);
				rCostas3.setEnabled(true);
			} else {
				sCostas3.setText("");
				rCostas3.setText("");
				sCostas3.setEnabled(false);
				rCostas3.setEnabled(false);
			}

			if (cCostas4.isSelected()) {
				sCostas4.setEnabled(true);
				rCostas4.setEnabled(true);
			} else {
				sCostas4.setText("");
				rCostas4.setText("");
				sCostas4.setEnabled(false);
				rCostas4.setEnabled(false);
			}

			if (cCostas5.isSelected()) {
				sCostas5.setEnabled(true);
				rCostas5.setEnabled(true);
			} else {
				sCostas5.setText("");
				rCostas5.setText("");
				sCostas5.setEnabled(false);
				rCostas5.setEnabled(false);
			}

			if (cCostas6.isSelected()) {
				sCostas6.setEnabled(true);
				rCostas6.setEnabled(true);
			} else {
				sCostas6.setText("");
				rCostas6.setText("");
				sCostas6.setEnabled(false);
				rCostas6.setEnabled(false);
			}

			if (cCostas7.isSelected()) {
				sCostas7.setEnabled(true);
				rCostas7.setEnabled(true);
			} else {
				sCostas7.setText("");
				rCostas7.setText("");
				sCostas7.setEnabled(false);
				rCostas7.setEnabled(false);
			}

			if (cCostas8.isSelected()) {
				sCostas8.setEnabled(true);
				rCostas8.setEnabled(true);
			} else {
				sCostas8.setText("");
				rCostas8.setText("");
				sCostas8.setEnabled(false);
				rCostas8.setEnabled(false);
			}

			if (cCostas9.isSelected()) {
				sCostas9.setEnabled(true);
				rCostas9.setEnabled(true);
			} else {
				sCostas9.setText("");
				rCostas9.setText("");
				sCostas9.setEnabled(false);
				rCostas9.setEnabled(false);
			}

			if (cCostas10.isSelected()) {
				sCostas10.setEnabled(true);
				rCostas10.setEnabled(true);
			} else {
				sCostas10.setText("");
				rCostas10.setText("");
				sCostas10.setEnabled(false);
				rCostas10.setEnabled(false);
			}

			if (cCostas11.isSelected()) {
				sCostas11.setEnabled(true);
				rCostas11.setEnabled(true);
			} else {
				sCostas11.setText("");
				rCostas11.setText("");
				sCostas11.setEnabled(false);
				rCostas11.setEnabled(false);
			}

			if (cBracos1.isSelected()) {
				sBracos1.setEnabled(true);
				rBracos1.setEnabled(true);
			} else {
				sBracos1.setText("");
				rBracos1.setText("");
				sBracos1.setEnabled(false);
				rBracos1.setEnabled(false);
			}

			if (cBracos2.isSelected()) {
				sBracos2.setEnabled(true);
				rBracos2.setEnabled(true);
			} else {
				sBracos2.setText("");
				rBracos2.setText("");
				sBracos2.setEnabled(false);
				rBracos2.setEnabled(false);
			}

			if (cBracos3.isSelected()) {
				sBracos3.setEnabled(true);
				rBracos3.setEnabled(true);
			} else {
				sBracos3.setText("");
				rBracos3.setText("");
				sBracos3.setEnabled(false);
				rBracos3.setEnabled(false);
			}

			if (cBracos4.isSelected()) {
				sBracos4.setEnabled(true);
				rBracos4.setEnabled(true);
			} else {
				sBracos4.setText("");
				rBracos4.setText("");
				sBracos4.setEnabled(false);
				rBracos4.setEnabled(false);
			}

			if (cBracos5.isSelected()) {
				sBracos5.setEnabled(true);
				rBracos5.setEnabled(true);
			} else {
				sBracos5.setText("");
				rBracos5.setText("");
				sBracos5.setEnabled(false);
				rBracos5.setEnabled(false);
			}

			if (cBracos6.isSelected()) {
				sBracos6.setEnabled(true);
				rBracos6.setEnabled(true);
			} else {
				sBracos6.setText("");
				rBracos6.setText("");
				sBracos6.setEnabled(false);
				rBracos6.setEnabled(false);
			}

			if (cBracos7.isSelected()) {
				sBracos7.setEnabled(true);
				rBracos7.setEnabled(true);
			} else {
				sBracos7.setText("");
				rBracos7.setText("");
				sBracos7.setEnabled(false);
				rBracos7.setEnabled(false);
			}

			if (cBracos8.isSelected()) {
				sBracos8.setEnabled(true);
				rBracos8.setEnabled(true);
			} else {
				sBracos8.setText("");
				rBracos8.setText("");
				sBracos8.setEnabled(false);
				rBracos8.setEnabled(false);
			}

			if (cOmAb1.isSelected()) {
				sOmAb1.setEnabled(true);
				rOmAb1.setEnabled(true);
			} else {
				sOmAb1.setText("");
				rOmAb1.setText("");
				sOmAb1.setEnabled(false);
				rOmAb1.setEnabled(false);
			}

			if (cOmAb2.isSelected()) {
				sOmAb2.setEnabled(true);
				rOmAb2.setEnabled(true);
			} else {
				sOmAb2.setText("");
				rOmAb2.setText("");
				sOmAb2.setEnabled(false);
				rOmAb2.setEnabled(false);
			}

			if (cOmAb3.isSelected()) {
				sOmAb3.setEnabled(true);
				rOmAb3.setEnabled(true);
			} else {
				sOmAb3.setText("");
				rOmAb3.setText("");
				sOmAb3.setEnabled(false);
				rOmAb3.setEnabled(false);
			}

			if (cOmAb4.isSelected()) {
				sOmAb4.setEnabled(true);
				rOmAb4.setEnabled(true);
			} else {
				sOmAb4.setText("");
				rOmAb4.setText("");
				sOmAb4.setEnabled(false);
				rOmAb4.setEnabled(false);
			}

			if (cOmAb5.isSelected()) {
				sOmAb5.setEnabled(true);
				rOmAb5.setEnabled(true);
			} else {
				sOmAb5.setText("");
				rOmAb5.setText("");
				sOmAb5.setEnabled(false);
				rOmAb5.setEnabled(false);
			}

			if (cOmAb6.isSelected()) {
				sOmAb6.setEnabled(true);
				rOmAb6.setEnabled(true);
			} else {
				sOmAb6.setText("");
				rOmAb6.setText("");
				sOmAb6.setEnabled(false);
				rOmAb6.setEnabled(false);
			}

			if (cPeito1.isSelected()) {
				sPeito1.setEnabled(true);
				rPeito1.setEnabled(true);
			} else {
				sPeito1.setText("");
				rPeito1.setText("");
				sPeito1.setEnabled(false);
				rPeito1.setEnabled(false);
			}

			if (cPeito2.isSelected()) {
				sPeito2.setEnabled(true);
				rPeito2.setEnabled(true);
			} else {
				sPeito2.setText("");
				rPeito2.setText("");
				sPeito2.setEnabled(false);
				rPeito2.setEnabled(false);
			}

			if (cPeito3.isSelected()) {
				sPeito3.setEnabled(true);
				rPeito3.setEnabled(true);
			} else {
				sPeito3.setText("");
				rPeito3.setText("");
				sPeito3.setEnabled(false);
				rPeito3.setEnabled(false);
			}

			if (cPeito4.isSelected()) {
				sPeito4.setEnabled(true);
				rPeito4.setEnabled(true);
			} else {
				sPeito4.setText("");
				rPeito4.setText("");
				sPeito4.setEnabled(false);
				rPeito4.setEnabled(false);
			}

			if (cPeito5.isSelected()) {
				sPeito5.setEnabled(true);
				rPeito5.setEnabled(true);
			} else {
				sPeito5.setText("");
				rPeito5.setText("");
				sPeito5.setEnabled(false);
				rPeito5.setEnabled(false);
			}
		}
	}

	private void validarCampos() {
		if (tfCodigoAluno.getText().equals("")) {
			JOptionPane.showConfirmDialog(null,
					"Dados do aluno não preenchido ! Favor buscar um aluno para prescrição de treino.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		} else if (cbPersonal.getSelectedIndex() == -1) {
			JOptionPane.showConfirmDialog(null, "Campo Personal obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbPersonal.grabFocus();
			return;
		} else if (tfDataInicio.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data Início obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataInicio.grabFocus();
			return;
		} else if (tfDataTermino.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data Término obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataTermino.grabFocus();
			return;
		} else if (cPerna1.isSelected() && sPerna1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Abdutor (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna1.grabFocus();
		} else if (cPerna1.isSelected() && rPerna1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Abdutor (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna1.grabFocus();
		} else if (cPerna2.isSelected() && sPerna2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Adutor (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna2.grabFocus();
		} else if (cPerna2.isSelected() && rPerna2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Adutor (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna2.grabFocus();
		} else if (cPerna3.isSelected() && sPerna3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Agachamento (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna3.grabFocus();
		} else if (cPerna3.isSelected() && rPerna3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Agachamento (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna3.grabFocus();
		} else if (cPerna4.isSelected() && sPerna4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Extensor (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna4.grabFocus();
		} else if (cPerna4.isSelected() && rPerna4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Extensor (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna4.grabFocus();
		} else if (cPerna5.isSelected() && sPerna5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Extensor unilateral (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna5.grabFocus();
		} else if (cPerna5.isSelected() && rPerna5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Extensor unilateral (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna5.grabFocus();
		} else if (cPerna6.isSelected() && sPerna6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Flexor (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna6.grabFocus();
		} else if (cPerna6.isSelected() && rPerna6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Flexor (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna6.grabFocus();
		} else if (cPerna7.isSelected() && sPerna7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Glúteo em pé (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna7.grabFocus();
		} else if (cPerna7.isSelected() && rPerna7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Glúteo em pé (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna7.grabFocus();
		} else if (cPerna8.isSelected() && sPerna8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Glúteo estendido (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna8.grabFocus();
		} else if (cPerna8.isSelected() && rPerna8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Glúteo estendido (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna8.grabFocus();
		} else if (cPerna9.isSelected() && sPerna9.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Glúteo flexionado (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna9.grabFocus();
		} else if (cPerna9.isSelected() && rPerna9.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Glúteo flexionado (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna9.grabFocus();
		} else if (cPerna10.isSelected() && sPerna10.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Panturrilha (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna10.grabFocus();
		} else if (cPerna10.isSelected() && rPerna10.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Panturrilha (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna10.grabFocus();
		} else if (cPerna11.isSelected() && sPerna11.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Passada (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna11.grabFocus();
		} else if (cPerna11.isSelected() && rPerna11.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Passada (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna11.grabFocus();
		} else if (cPerna12.isSelected() && sPerna12.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Staff (exercício de perna) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPerna12.grabFocus();
		} else if (cPerna12.isSelected() && rPerna12.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Staff (exercício de perna) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPerna12.grabFocus();
		} else if (cCostas1.isSelected() && sCostas1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada alta (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas1.grabFocus();
		} else if (cCostas1.isSelected() && rCostas1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada alta (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas1.grabFocus();
		} else if (cCostas2.isSelected() && sCostas2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada alta/barra menor (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas2.grabFocus();
		} else if (cCostas2.isSelected() && rCostas2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada alta/barra menor (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas2.grabFocus();
		} else if (cCostas3.isSelected() && sCostas3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada baixa (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas3.grabFocus();
		} else if (cCostas3.isSelected() && rCostas3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada baixa (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas3.grabFocus();
		} else if (cCostas4.isSelected() && sCostas4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada em pé costas (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas4.grabFocus();
		} else if (cCostas4.isSelected() && rCostas4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada em pé costas (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas4.grabFocus();
		} else if (cCostas5.isSelected() && sCostas5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada sentada (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas5.grabFocus();
		} else if (cCostas5.isSelected() && rCostas5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada sentada (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas5.grabFocus();
		} else if (cCostas6.isSelected() && sCostas6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Remada unilateral (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas6.grabFocus();
		} else if (cCostas6.isSelected() && rCostas6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Remada unilateral (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas6.grabFocus();
		} else if (cCostas7.isSelected() && sCostas7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Serrote (exercício de costas) obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas7.grabFocus();
		} else if (cCostas7.isSelected() && rCostas7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Serrote (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas7.grabFocus();
		} else if (cCostas8.isSelected() && sCostas8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Pull down (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas8.grabFocus();
		} else if (cCostas8.isSelected() && rCostas8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Pull down (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas8.grabFocus();
		} else if (cCostas9.isSelected() && sCostas9.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Puxada atrás (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas9.grabFocus();
		} else if (cCostas9.isSelected() && rCostas9.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Puxada atrás (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas9.grabFocus();
		} else if (cCostas10.isSelected() && sCostas10.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Puxada frente (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas10.grabFocus();
		} else if (cCostas10.isSelected() && rCostas10.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Puxada frente (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas10.grabFocus();
		} else if (cCostas11.isSelected() && sCostas11.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Puxada invertida (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sCostas11.grabFocus();
		} else if (cCostas11.isSelected() && rCostas11.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Puxada invertida (exercício de costas) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rCostas11.grabFocus();
		} else if (cBracos1.isSelected() && sBracos1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Rosca concentrada (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos1.grabFocus();
		} else if (cBracos1.isSelected() && rBracos1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Rosca concentrada (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos1.grabFocus();
		} else if (cBracos2.isSelected() && sBracos2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Rosca direta (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos2.grabFocus();
		} else if (cBracos2.isSelected() && rBracos2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Rosca direta (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos2.grabFocus();
		} else if (cBracos3.isSelected() && sBracos3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Rosca invertida (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos3.grabFocus();
		} else if (cBracos3.isSelected() && rBracos3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Rosca invertida (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos3.grabFocus();
		} else if (cBracos4.isSelected() && sBracos4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Rosca scott (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos4.grabFocus();
		} else if (cBracos4.isSelected() && rBracos4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Rosca scott (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos4.grabFocus();
		} else if (cBracos5.isSelected() && sBracos5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Tríceps pulley (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos5.grabFocus();
		} else if (cBracos5.isSelected() && rBracos5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Tríceps pulley (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos5.grabFocus();
		} else if (cBracos6.isSelected() && sBracos6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Tríceps pulley invertida (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos6.grabFocus();
		} else if (cBracos6.isSelected() && rBracos6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Tríceps pulley invertida (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos6.grabFocus();
		} else if (cBracos7.isSelected() && sBracos7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Tríceps testa (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos7.grabFocus();
		} else if (cBracos7.isSelected() && rBracos7.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Tríceps testa (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos7.grabFocus();
		} else if (cBracos8.isSelected() && sBracos8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Tríceps unilateral (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sBracos8.grabFocus();
		} else if (cBracos8.isSelected() && rBracos8.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Tríceps unilateral (exercício de braços) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rBracos8.grabFocus();
		} else if (cOmAb1.isSelected() && sOmAb1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Abdominal crunch (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb1.grabFocus();
		} else if (cOmAb1.isSelected() && rOmAb1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Abdominal crunch (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb1.grabFocus();
		} else if (cOmAb2.isSelected() && sOmAb2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Elevação frontal (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb2.grabFocus();
		} else if (cOmAb2.isSelected() && rOmAb2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Elevação frontal (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb2.grabFocus();
		} else if (cOmAb3.isSelected() && sOmAb3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Elevação lateral (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb3.grabFocus();
		} else if (cOmAb3.isSelected() && rOmAb3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Elevação lateral (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb3.grabFocus();
		} else if (cOmAb4.isSelected() && sOmAb4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Encolhimento de ombro (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb4.grabFocus();
		} else if (cOmAb4.isSelected() && rOmAb4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Encolhimento de ombro (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb4.grabFocus();
		} else if (cOmAb5.isSelected() && sOmAb5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Desenvolvimento abdominal (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb5.grabFocus();
		} else if (cOmAb5.isSelected() && rOmAb5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Desenvolvimento abdominal (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb5.grabFocus();
		} else if (cOmAb6.isSelected() && sOmAb6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Trapézio (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sOmAb6.grabFocus();
		} else if (cOmAb6.isSelected() && rOmAb6.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Trapézio (exercício de ombro e abdômen) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rOmAb6.grabFocus();
		} else if (cPeito1.isSelected() && sPeito1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Peck deck (voador) (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPeito1.grabFocus();
		} else if (cPeito1.isSelected() && rPeito1.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Peck deck (voador) (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPeito1.grabFocus();
		} else if (cPeito2.isSelected() && sPeito2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Pull over (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPeito2.grabFocus();
		} else if (cOmAb2.isSelected() && rPeito2.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Pull over (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPeito2.grabFocus();
		} else if (cPeito3.isSelected() && sPeito3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Supino declinado (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPeito3.grabFocus();
		} else if (cPeito3.isSelected() && rPeito3.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Supino declinado (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPeito3.grabFocus();
		} else if (cPeito4.isSelected() && sPeito4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Supino inclinado (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPeito4.grabFocus();
		} else if (cPeito4.isSelected() && rPeito4.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Supino inclinado (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPeito4.grabFocus();
		} else if (cPeito5.isSelected() && sPeito5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Série de Supino reto (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			sPeito5.grabFocus();
		} else if (cPeito5.isSelected() && rPeito5.getText().equals("  ")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Repetição de Supino reto (exercício de peito) obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			rPeito5.grabFocus();
		} else {
			limparTela();
		}
	}

	private void limparTela() {
		tfCodigoAluno.setText("");
		tfNome.setText("");
		tfDataNasc.setText("");
		tfCpf.setText("");
		tfRg.setText("");
		tfModalidade.setText("");
		tfSexo.setText("");

		tfCodigoPrescricao.setText("");
		cbPersonal.setSelectedIndex(-1);
		tfDataInicio.setText("");
		tfDataTermino.setText("");

		cPerna1.setSelected(false);
		cPerna2.setSelected(false);
		cPerna3.setSelected(false);
		cPerna4.setSelected(false);
		cPerna5.setSelected(false);
		cPerna6.setSelected(false);
		cPerna7.setSelected(false);
		cPerna8.setSelected(false);
		cPerna9.setSelected(false);
		cPerna10.setSelected(false);
		cPerna11.setSelected(false);
		cPerna12.setSelected(false);

		sPerna1.setText("");
		sPerna2.setText("");
		sPerna3.setText("");
		sPerna4.setText("");
		sPerna5.setText("");
		sPerna6.setText("");
		sPerna7.setText("");
		sPerna8.setText("");
		sPerna9.setText("");
		sPerna10.setText("");
		sPerna11.setText("");
		sPerna12.setText("");

		rPerna1.setText("");
		rPerna2.setText("");
		rPerna3.setText("");
		rPerna4.setText("");
		rPerna5.setText("");
		rPerna6.setText("");
		rPerna7.setText("");
		rPerna8.setText("");
		rPerna9.setText("");
		rPerna10.setText("");
		rPerna11.setText("");
		rPerna12.setText("");

		cCostas1.setSelected(false);
		cCostas2.setSelected(false);
		cCostas3.setSelected(false);
		cCostas4.setSelected(false);
		cCostas5.setSelected(false);
		cCostas6.setSelected(false);
		cCostas7.setSelected(false);
		cCostas8.setSelected(false);
		cCostas9.setSelected(false);
		cCostas10.setSelected(false);
		cCostas11.setSelected(false);

		sCostas1.setText("");
		sCostas2.setText("");
		sCostas3.setText("");
		sCostas4.setText("");
		sCostas5.setText("");
		sCostas6.setText("");
		sCostas7.setText("");
		sCostas8.setText("");
		sCostas9.setText("");
		sCostas10.setText("");
		sCostas11.setText("");

		rCostas1.setText("");
		rCostas2.setText("");
		rCostas3.setText("");
		rCostas4.setText("");
		rCostas5.setText("");
		rCostas6.setText("");
		rCostas7.setText("");
		rCostas8.setText("");
		rCostas9.setText("");
		rCostas10.setText("");
		rCostas11.setText("");

		cBracos1.setSelected(false);
		cBracos2.setSelected(false);
		cBracos3.setSelected(false);
		cBracos4.setSelected(false);
		cBracos5.setSelected(false);
		cBracos6.setSelected(false);
		cBracos7.setSelected(false);
		cBracos8.setSelected(false);

		sBracos1.setText("");
		sBracos2.setText("");
		sBracos3.setText("");
		sBracos4.setText("");
		sBracos5.setText("");
		sBracos6.setText("");
		sBracos7.setText("");
		sBracos8.setText("");

		rBracos1.setText("");
		rBracos2.setText("");
		rBracos3.setText("");
		rBracos4.setText("");
		rBracos5.setText("");
		rBracos6.setText("");
		rBracos7.setText("");
		rBracos8.setText("");

		cOmAb1.setSelected(false);
		cOmAb2.setSelected(false);
		cOmAb3.setSelected(false);
		cOmAb4.setSelected(false);
		cOmAb5.setSelected(false);
		cOmAb6.setSelected(false);

		sOmAb1.setText("");
		sOmAb2.setText("");
		sOmAb3.setText("");
		sOmAb4.setText("");
		sOmAb5.setText("");
		sOmAb6.setText("");

		rOmAb1.setText("");
		rOmAb2.setText("");
		rOmAb3.setText("");
		rOmAb4.setText("");
		rOmAb5.setText("");
		rOmAb6.setText("");

		cPeito1.setSelected(false);
		cPeito2.setSelected(false);
		cPeito3.setSelected(false);
		cPeito4.setSelected(false);
		cPeito5.setSelected(false);

		sPeito1.setText("");
		sPeito2.setText("");
		sPeito3.setText("");
		sPeito4.setText("");
		sPeito5.setText("");

		rPeito1.setText("");
		rPeito2.setText("");
		rPeito3.setText("");
		rPeito4.setText("");
		rPeito5.setText("");
	}
}