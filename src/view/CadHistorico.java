package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadHistorico extends MyDialog {
	private JLabel lbCodigoAluno, lbNome, lbDataNasc, lbCpf, lbRg, lbModalidade, lbSexo, lbNivelIniciante,
			lbFotoIniciante, lbDataInicioIniciante, lbDataTerminoIniciante, lbPesoIniciante, lbAlturaIniciante,
			lbImcIniciante, lbNivelIntermediario, lbFotoIntermediario, lbDataInicioIntermediario,
			lbDataTerminoIntermediario, lbPesoIntermediario, lbAlturaIntermediario, lbImcIntermediario, lbNivelAvancado,
			lbFotoAvancado, lbDataInicioAvancado, lbDataTerminoAvancado, lbPesoAvancado, lbAlturaAvancado,
			lbImcAvancado, lbFotoIni, lbFotoInt, lbFotoAva;
	private JFormattedTextField tfCodigoAluno, tfNome, tfDataNasc, tfCpf, tfRg, tfModalidade, tfSexo, tfNivelIniciante,
			tfDataInicioIniciante, tfDataTerminoIniciante, tfPesoIniciante, tfAlturaIniciante, tfImcIniciante,
			tfNivelIntermediario, tfDataInicioIntermediario, tfDataTerminoIntermediario, tfPesoIntermediario,
			tfAlturaIntermediario, tfImcIntermediario, tfNivelAvancado, tfDataInicioAvancado, tfDataTerminoAvancado,
			tfPesoAvancado, tfAlturaAvancado, tfImcAvancado;
	private MaskFormatter mfDataNasc, mfCpf, mfDataInicioIniciante, mfDataTerminoIniciante, mfPesoIniciante,
			mfAlturaIniciante, mfDataInicioIntermediario, mfDataTerminoIntermediario, mfPesoIntermediario,
			mfAlturaIntermediario, mfDataInicioAvancado, mfDataTerminoAvancado, mfPesoAvancado, mfAlturaAvancado;
	private JPanel pDadosAluno, pDadosHistoricoIniciante, pDadosHistoricoIntermediario, pDadosHistoricoAvancado,
			pFotoIniciante, pFotoIntermediario, pFotoAvancado;
	private JButton bSalvar, bCancelar, bSair, bExcluir, bPesquisarAluno, bBuscarFotoIniciante,
			bBuscarFotoIntermediario, bBuscarFotoAvancado, bAvancarIntermediario, bAvancarAvancado, bEncerrarHistorico,
			bImcIni, bImcInt, bImcAva;
	private String localizacaoImagem = "";

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CadHistorico historico = new CadHistorico();
	}

	public CadHistorico() {
		this.iniciarComponentes();
		this.iniciarTela();
	}

	private void iniciarTela() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de histórico");
		this.setResizable(false);
		this.setSize(820, 670);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	private void iniciarComponentes() {
		lbCodigoAluno = new JLabel("Código: ");
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
		lbDataNasc.setBounds(12, 70, 150, 20);
		tfDataNasc = new JFormattedTextField();
		tfDataNasc.setBounds(10, 90, 160, 30);
		tfDataNasc.setEnabled(false);

		lbCpf = new JLabel("CPF: ");
		lbCpf.setBounds(222, 70, 100, 20);
		tfCpf = new JFormattedTextField();
		tfCpf.setBounds(220, 90, 160, 30);
		tfCpf.setEnabled(false);

		lbRg = new JLabel("RG: ");
		lbRg.setBounds(432, 70, 100, 20);
		tfRg = new JFormattedTextField("");
		tfRg.setBounds(430, 90, 160, 30);
		tfRg.setEnabled(false);

		lbModalidade = new JLabel("Modalidade: ");
		lbModalidade.setBounds(630, 20, 100, 20);
		tfModalidade = new JFormattedTextField();
		tfModalidade.setBounds(629, 40, 160, 30);
		tfModalidade.setEnabled(false);

		lbSexo = new JLabel("Sexo: ");
		lbSexo.setBounds(630, 70, 100, 20);
		tfSexo = new JFormattedTextField();
		tfSexo.setBounds(629, 90, 160, 30);
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

		lbNivelIniciante = new JLabel("Nível:");
		lbNivelIniciante.setBounds(12, 20, 100, 20);
		tfNivelIniciante = new JFormattedTextField("Iniciante");
		tfNivelIniciante.setBounds(10, 40, 160, 30);
		tfNivelIniciante.setEnabled(false);

		lbFotoIniciante = new JLabel("Foto: ");
		lbFotoIniciante.setBounds(630, 20, 100, 20);
		lbFotoIni = new JLabel("");
		lbFotoIni.setHorizontalAlignment(SwingConstants.CENTER);
		pFotoIniciante = new JPanel();
		pFotoIniciante.setBackground(Color.WHITE);
		pFotoIniciante.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192),
				new Color(192, 192, 192), Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		pFotoIniciante.setBounds(630, 40, 130, 80);
		pFotoIniciante.add(lbFotoIni);

		lbDataInicioIniciante = new JLabel("Data Início: ");
		lbDataInicioIniciante.setBounds(222, 20, 150, 20);
		tfDataInicioIniciante = new JFormattedTextField();
		tfDataInicioIniciante.setBounds(220, 40, 160, 30);

		lbDataTerminoIniciante = new JLabel("Data Témino: ");
		lbDataTerminoIniciante.setBounds(432, 20, 150, 20);
		tfDataTerminoIniciante = new JFormattedTextField();
		tfDataTerminoIniciante.setBounds(430, 40, 160, 30);

		lbPesoIniciante = new JLabel("Peso: ");
		lbPesoIniciante.setBounds(12, 70, 150, 20);
		tfPesoIniciante = new JFormattedTextField();
		tfPesoIniciante.setBounds(10, 90, 160, 30);

		lbAlturaIniciante = new JLabel("Altura: ");
		lbAlturaIniciante.setBounds(222, 70, 150, 20);
		tfAlturaIniciante = new JFormattedTextField();
		tfAlturaIniciante.setBounds(220, 90, 160, 30);

		lbImcIniciante = new JLabel("Imc: ");
		lbImcIniciante.setBounds(432, 70, 150, 20);
		tfImcIniciante = new JFormattedTextField();
		tfImcIniciante.setBounds(430, 90, 160, 30);
		tfImcIniciante.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				calcularImcIniciante();
			}
		});
		tfImcIniciante.setEditable(false);

		bImcIni = new JButton("");
		bImcIni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TabelaImc tabela = new TabelaImc();
			}
		});
		bImcIni.setBounds(590, 90, 30, 30);// C:\Users\Igor\Pictures
		bImcIni.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/tabela.png"))));
		bImcIni.setToolTipText("Clique para consultar a tabela de imc !");

		lbNivelIntermediario = new JLabel("Nível:");
		lbNivelIntermediario.setBounds(12, 20, 100, 20);

		tfNivelIntermediario = new JFormattedTextField("Intermediário");
		tfNivelIntermediario.setBounds(10, 40, 160, 30);
		tfNivelIntermediario.setEnabled(false);

		lbFotoIntermediario = new JLabel("Foto: ");
		lbFotoIntermediario.setBounds(630, 20, 100, 20);
		lbFotoInt = new JLabel("");
		lbFotoInt.setHorizontalAlignment(SwingConstants.CENTER);
		pFotoIntermediario = new JPanel();
		pFotoIntermediario.setBackground(Color.WHITE);
		pFotoIntermediario.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192),
				new Color(192, 192, 192), Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		pFotoIntermediario.setBounds(630, 40, 130, 80);
		pFotoIntermediario.add(lbFotoInt);

		lbDataInicioIntermediario = new JLabel("Data Início: ");
		lbDataInicioIntermediario.setBounds(222, 20, 150, 20);
		tfDataInicioIntermediario = new JFormattedTextField();
		tfDataInicioIntermediario.setBounds(220, 40, 160, 30);
		tfDataInicioIntermediario.setEnabled(false);

		lbDataTerminoIntermediario = new JLabel("Data Témino: ");
		lbDataTerminoIntermediario.setBounds(432, 20, 150, 20);
		tfDataTerminoIntermediario = new JFormattedTextField();
		tfDataTerminoIntermediario.setBounds(432, 40, 160, 30);
		tfDataTerminoIntermediario.setEnabled(false);

		lbPesoIntermediario = new JLabel("Peso: ");
		lbPesoIntermediario.setBounds(12, 70, 150, 20);
		tfPesoIntermediario = new JFormattedTextField();
		tfPesoIntermediario.setBounds(10, 90, 160, 30);
		tfPesoIntermediario.setEnabled(false);

		lbAlturaIntermediario = new JLabel("Altura: ");
		lbAlturaIntermediario.setBounds(222, 70, 150, 20);
		tfAlturaIntermediario = new JFormattedTextField();
		tfAlturaIntermediario.setBounds(220, 90, 160, 30);
		tfAlturaIntermediario.setEnabled(false);

		lbImcIntermediario = new JLabel("Imc: ");
		lbImcIntermediario.setBounds(432, 70, 150, 20);
		tfImcIntermediario = new JFormattedTextField();
		tfImcIntermediario.setBounds(430, 90, 160, 30);
		tfImcIntermediario.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				calcularImcIntermediario();
			}
		});
		tfImcIntermediario.setEditable(false);

		bImcInt = new JButton("");
		bImcInt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TabelaImc tabela = new TabelaImc();
			}
		});
		bImcInt.setBounds(590, 90, 30, 30);// C:\Users\Igor\Pictures
		bImcInt.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/tabela.png"))));
		bImcInt.setToolTipText("Clique para consultar a tabela de imc !");
		bImcInt.setEnabled(false);

		lbNivelAvancado = new JLabel("Nível:");
		lbNivelAvancado.setBounds(12, 20, 100, 20);
		tfNivelAvancado = new JFormattedTextField("Avançado");
		tfNivelAvancado.setBounds(10, 40, 160, 30);
		tfNivelAvancado.setEnabled(false);

		lbFotoAvancado = new JLabel("Foto: ");
		lbFotoAvancado.setBounds(630, 20, 100, 20);
		lbFotoAva = new JLabel("");
		lbFotoAva.setHorizontalAlignment(SwingConstants.CENTER);
		pFotoAvancado = new JPanel();
		pFotoAvancado.setBackground(Color.WHITE);
		pFotoAvancado.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192),
				new Color(192, 192, 192), Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		pFotoAvancado.setBounds(630, 40, 130, 80);
		pFotoAvancado.add(lbFotoAva);

		lbDataInicioAvancado = new JLabel("Data Início: ");
		lbDataInicioAvancado.setBounds(222, 20, 150, 20);
		tfDataInicioAvancado = new JFormattedTextField();
		tfDataInicioAvancado.setBounds(220, 40, 160, 30);
		tfDataInicioAvancado.setEnabled(false);

		lbDataTerminoAvancado = new JLabel("Data Término: ");
		lbDataTerminoAvancado.setBounds(432, 20, 150, 20);
		tfDataTerminoAvancado = new JFormattedTextField();
		tfDataTerminoAvancado.setBounds(430, 40, 160, 30);
		tfDataTerminoAvancado.setEnabled(false);

		lbPesoAvancado = new JLabel("Peso: ");
		lbPesoAvancado.setBounds(12, 70, 150, 20);
		tfPesoAvancado = new JFormattedTextField();
		tfPesoAvancado.setBounds(10, 90, 160, 30);
		tfPesoAvancado.setEnabled(false);

		lbAlturaAvancado = new JLabel("Altura: ");
		lbAlturaAvancado.setBounds(222, 70, 150, 20);
		tfAlturaAvancado = new JFormattedTextField();
		tfAlturaAvancado.setBounds(220, 90, 160, 30);
		tfAlturaAvancado.setEnabled(false);

		lbImcAvancado = new JLabel("Imc: ");
		lbImcAvancado.setBounds(432, 70, 150, 20);
		tfImcAvancado = new JFormattedTextField();
		tfImcAvancado.setBounds(430, 90, 160, 30);
		tfImcAvancado.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				calcularImcAvancado();
			}
		});
		tfImcAvancado.setEditable(false);

		bImcAva = new JButton("");
		bImcAva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				TabelaImc tabela = new TabelaImc();
			}
		});
		bImcAva.setBounds(590, 90, 30, 30);// C:\Users\Igor\Pictures
		bImcAva.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/tabela.png"))));
		bImcAva.setToolTipText("Clique para consultar a tabela de imc !");
		bImcAva.setEnabled(false);

		// Mascaras de formato
		try {
			this.mfDataNasc = new MaskFormatter("##/##/####");
			mfDataNasc.setPlaceholderCharacter('_');
			this.mfDataNasc.install(tfDataNasc);

			this.mfCpf = new MaskFormatter("###.###.###-##");
			mfCpf.setPlaceholderCharacter('_');
			this.mfCpf.install(this.tfCpf);

			this.mfDataInicioIniciante = new MaskFormatter("##/##/####");
			mfDataInicioIniciante.setPlaceholderCharacter('_');
			this.mfDataInicioIniciante.install(tfDataInicioIniciante);

			this.mfDataTerminoIniciante = new MaskFormatter("##/##/####");
			mfDataTerminoIniciante.setPlaceholderCharacter('_');
			this.mfDataTerminoIniciante.install(tfDataTerminoIniciante);

			this.mfPesoIniciante = new MaskFormatter("###");
			this.mfPesoIniciante.install(this.tfPesoIniciante);

			this.mfAlturaIniciante = new MaskFormatter("#.##");
			this.mfAlturaIniciante.install(this.tfAlturaIniciante);

			this.mfDataInicioIntermediario = new MaskFormatter("##/##/####");
			mfDataInicioIntermediario.setPlaceholderCharacter('_');
			this.mfDataInicioIntermediario.install(tfDataInicioIntermediario);

			this.mfDataTerminoIntermediario = new MaskFormatter("##/##/####");
			mfDataTerminoIntermediario.setPlaceholderCharacter('_');
			this.mfDataTerminoIntermediario.install(tfDataTerminoIntermediario);

			this.mfPesoIntermediario = new MaskFormatter("###");
			this.mfPesoIntermediario.install(this.tfPesoIntermediario);

			this.mfAlturaIntermediario = new MaskFormatter("#.##");
			this.mfAlturaIntermediario.install(this.tfAlturaIntermediario);

			this.mfDataInicioAvancado = new MaskFormatter("##/##/####");
			mfDataInicioAvancado.setPlaceholderCharacter('_');
			this.mfDataInicioAvancado.install(tfDataInicioAvancado);

			this.mfDataTerminoAvancado = new MaskFormatter("##/##/####");
			mfDataTerminoAvancado.setPlaceholderCharacter('_');
			this.mfDataTerminoAvancado.install(tfDataTerminoAvancado);

			this.mfPesoAvancado = new MaskFormatter("###");
			this.mfPesoAvancado.install(this.tfPesoAvancado);

			this.mfAlturaAvancado = new MaskFormatter("#.##");
			this.mfAlturaAvancado.install(this.tfAlturaAvancado);
		} catch (Exception erroG) {

		}

		bBuscarFotoIniciante = new JButton("");
		bBuscarFotoIniciante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarFotoIniciante();
			}
		});
		bBuscarFotoIniciante.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cam.png"))));
		bBuscarFotoIniciante.setToolTipText("Clique para buscar uma foto do aluno é quando iniciante !");
		bBuscarFotoIniciante.setBounds(770, 40, 30, 30);

		bAvancarIntermediario = new JButton("");
		bAvancarIntermediario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				upNivelDeInicianteParaIntermediario();
			}
		});
		bAvancarIntermediario.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/next.png"))));
		bAvancarIntermediario.setToolTipText("Clique para avançar para o nível intermediário !");
		bAvancarIntermediario.setBounds(770, 90, 30, 30);

		bBuscarFotoIntermediario = new JButton("");
		bBuscarFotoIntermediario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarFotoIntermediario();
			}
		});
		bBuscarFotoIntermediario.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cam.png"))));
		bBuscarFotoIntermediario.setToolTipText("Clique para buscar uma foto do aluno é quando intermediário !");
		bBuscarFotoIntermediario.setBounds(770, 40, 30, 30);
		bBuscarFotoIntermediario.setEnabled(false);

		bAvancarAvancado = new JButton("");
		bAvancarAvancado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				upNivelDeIntermediarioParaAvancado();
			}
		});
		bAvancarAvancado.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/next.png"))));
		bAvancarAvancado.setToolTipText("Clique para avançar para o nível avançado !");
		bAvancarAvancado.setEnabled(false);
		bAvancarAvancado.setBounds(770, 90, 30, 30);

		bBuscarFotoAvancado = new JButton("");
		bBuscarFotoAvancado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarFotoAvancado();
			}
		});
		bBuscarFotoAvancado.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cam.png"))));
		bBuscarFotoAvancado.setToolTipText("Clique para buscar uma foto do aluno é quando avançado !");
		bBuscarFotoAvancado.setBounds(770, 40, 30, 30);
		bBuscarFotoAvancado.setEnabled(false);

		bEncerrarHistorico = new JButton("");
		bEncerrarHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encerrarHistorico();
			}
		});
		bEncerrarHistorico.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/enc.png"))));
		bEncerrarHistorico.setToolTipText("Clique para encerrar o histórico !");
		bEncerrarHistorico.setEnabled(false);
		bEncerrarHistorico.setBounds(770, 90, 30, 30);

		// Instancia/Cria o Painel "SUPERIOR"
		this.pDadosAluno = new JPanel(null);
		this.pDadosAluno.setBorder(new TitledBorder("DADOS ALUNO"));
		this.pDadosAluno.setBackground(Color.WHITE);
		this.pDadosAluno.setBounds(2, 7, 810, 140);
		// Adiciona os componentes no panel "Superior"
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
		this.pDadosAluno.add(this.lbModalidade);
		this.pDadosAluno.add(this.tfModalidade);
		this.pDadosAluno.add(this.lbSexo);
		this.pDadosAluno.add(this.tfSexo);

		// Instancia/Cria o Painel "1"
		this.pDadosHistoricoIniciante = new JPanel(null);
		this.pDadosHistoricoIniciante.setBorder(new TitledBorder("DADOS HISTÓRICO INICIANTE"));
		this.pDadosHistoricoIniciante.setBackground(Color.WHITE);
		this.pDadosHistoricoIniciante.setBounds(2, 150, 810, 140);
		// Adiciona os componentes no panel "Superior"
		this.pDadosHistoricoIniciante.add(this.lbNivelIniciante);
		this.pDadosHistoricoIniciante.add(this.tfNivelIniciante);
		this.pDadosHistoricoIniciante.add(this.lbFotoIniciante);
		this.pDadosHistoricoIniciante.add(this.pFotoIniciante);
		this.pDadosHistoricoIniciante.add(this.lbDataInicioIniciante);
		this.pDadosHistoricoIniciante.add(this.tfDataInicioIniciante);
		this.pDadosHistoricoIniciante.add(this.lbDataTerminoIniciante);
		this.pDadosHistoricoIniciante.add(this.tfDataTerminoIniciante);
		this.pDadosHistoricoIniciante.add(this.lbPesoIniciante);
		this.pDadosHistoricoIniciante.add(this.tfPesoIniciante);
		this.pDadosHistoricoIniciante.add(this.lbAlturaIniciante);
		this.pDadosHistoricoIniciante.add(this.tfAlturaIniciante);
		this.pDadosHistoricoIniciante.add(this.lbImcIniciante);
		this.pDadosHistoricoIniciante.add(this.tfImcIniciante);
		this.pDadosHistoricoIniciante.add(this.bBuscarFotoIniciante);
		this.pDadosHistoricoIniciante.add(this.bAvancarIntermediario);
		this.pDadosHistoricoIniciante.add(this.bImcIni);

		// Instancia/Cria o Painel "2"
		this.pDadosHistoricoIntermediario = new JPanel(null);
		this.pDadosHistoricoIntermediario.setBorder(new TitledBorder("DADOS HISTÓRICO INTERMEDIÁRIO"));
		this.pDadosHistoricoIntermediario.setBackground(Color.WHITE);
		this.pDadosHistoricoIntermediario.setEnabled(false);
		this.pDadosHistoricoIntermediario.setBounds(2, 297, 810, 140);
		// Adiciona os componentes no panel "Superior"
		this.pDadosHistoricoIntermediario.add(this.lbNivelIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfNivelIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbFotoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.pFotoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbDataInicioIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfDataInicioIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbDataTerminoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfDataTerminoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbPesoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfPesoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbAlturaIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfAlturaIntermediario);
		this.pDadosHistoricoIntermediario.add(this.lbImcIntermediario);
		this.pDadosHistoricoIntermediario.add(this.tfImcIntermediario);
		this.pDadosHistoricoIntermediario.add(this.bBuscarFotoIntermediario);
		this.pDadosHistoricoIntermediario.add(this.bAvancarAvancado);
		this.pDadosHistoricoIntermediario.add(this.bImcInt);

		// Instancia/Cria o Painel "3"
		this.pDadosHistoricoAvancado = new JPanel(null);
		this.pDadosHistoricoAvancado.setBorder(new TitledBorder("DADOS HISTÓRICO AVANÇADO"));
		this.pDadosHistoricoAvancado.setBackground(Color.WHITE);
		this.pDadosHistoricoAvancado.setEnabled(false);
		this.pDadosHistoricoAvancado.setBounds(2, 440, 810, 140);
		// Adiciona os componentes no panel "Superior"
		this.pDadosHistoricoAvancado.add(this.lbNivelAvancado);
		this.pDadosHistoricoAvancado.add(this.tfNivelAvancado);
		this.pDadosHistoricoAvancado.add(this.lbFotoAvancado);
		this.pDadosHistoricoAvancado.add(this.pFotoAvancado);
		this.pDadosHistoricoAvancado.add(this.lbDataInicioAvancado);
		this.pDadosHistoricoAvancado.add(this.tfDataInicioAvancado);
		this.pDadosHistoricoAvancado.add(this.lbDataTerminoAvancado);
		this.pDadosHistoricoAvancado.add(this.tfDataTerminoAvancado);
		this.pDadosHistoricoAvancado.add(this.lbPesoAvancado);
		this.pDadosHistoricoAvancado.add(this.tfPesoAvancado);
		this.pDadosHistoricoAvancado.add(this.lbAlturaAvancado);
		this.pDadosHistoricoAvancado.add(this.tfAlturaAvancado);
		this.pDadosHistoricoAvancado.add(this.lbImcAvancado);
		this.pDadosHistoricoAvancado.add(this.tfImcAvancado);
		this.pDadosHistoricoAvancado.add(this.bBuscarFotoAvancado);
		this.pDadosHistoricoAvancado.add(this.bEncerrarHistorico);
		this.pDadosHistoricoAvancado.add(this.bImcAva);

		this.add(pDadosHistoricoIniciante);
		this.add(pDadosHistoricoIntermediario);
		this.add(pDadosHistoricoAvancado);
		this.add(pDadosAluno);

		bSalvar = new JButton("Salvar");
		bSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarCampos();
			}
		});
		bSalvar.setBounds(120, 590, 120, 40);
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
		bCancelar.setBounds(270, 590, 120, 40);
		bCancelar.setMnemonic('C');
		bCancelar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cancel.png"))));
		bCancelar.setToolTipText("Clique para cancelar o cadastro !");
		add(bCancelar);

		bExcluir = new JButton("Excluir");
		bExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		bExcluir.setBounds(420, 590, 120, 40);
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
		bSair.setBounds(570, 590, 120, 40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);

	}

	private void buscarFotoIniciante() {
		JFileChooser fileChooser = new JFileChooser("c:");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setAcceptAllFileFilterUsed(false);
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File arq = fileChooser.getSelectedFile();
			localizacaoImagem = arq.toString();
			this.mostrarFotoIniciante();
		}
	}

	private void mostrarFotoIniciante() {
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = toolkit.getImage(localizacaoImagem);
			Image scaledImage = image.getScaledInstance(pFotoIniciante.getWidth(), pFotoIniciante.getHeight(),
					Image.SCALE_DEFAULT);
			this.lbFotoIni.setIcon(new ImageIcon(scaledImage));
		} catch (Exception ex) {

		}
	}

	private void buscarFotoIntermediario() {
		JFileChooser fileChooser = new JFileChooser("c:");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setAcceptAllFileFilterUsed(false);
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File arq = fileChooser.getSelectedFile();
			localizacaoImagem = arq.toString();
			this.mostrarFotoIntermediario();
		}
	}

	private void mostrarFotoIntermediario() {
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = toolkit.getImage(localizacaoImagem);
			Image scaledImage = image.getScaledInstance(pFotoIntermediario.getWidth(), pFotoIntermediario.getHeight(),
					Image.SCALE_DEFAULT);
			this.lbFotoInt.setIcon(new ImageIcon(scaledImage));
		} catch (Exception ex) {

		}
	}

	private void buscarFotoAvancado() {
		JFileChooser fileChooser = new JFileChooser("c:");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fileChooser.setAcceptAllFileFilterUsed(false);
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File arq = fileChooser.getSelectedFile();
			localizacaoImagem = arq.toString();
			this.mostrarFotoAvancado();
		}
	}

	private void mostrarFotoAvancado() {
		try {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image image = toolkit.getImage(localizacaoImagem);
			Image scaledImage = image.getScaledInstance(pFotoAvancado.getWidth(), pFotoAvancado.getHeight(),
					Image.SCALE_DEFAULT);
			this.lbFotoAva.setIcon(new ImageIcon(scaledImage));
		} catch (Exception ex) {

		}
	}

	private void upNivelDeInicianteParaIntermediario() {
		if (tfCodigoAluno.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Dados do aluno não preenchido ! Favor buscar um aluno para matricula.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		} else if (tfDataInicioIniciante.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataInicioIniciante.grabFocus();
			return;
		} else if (tfPesoIniciante.getText().equals("   ")) {
			JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfPesoIniciante.grabFocus();
			return;
		} else if (tfAlturaIniciante.getText().equals(" .  ")) {
			JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfAlturaIniciante.grabFocus();
			return;
		} else if (tfDataTerminoIniciante.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Término obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataTerminoIniciante.grabFocus();
			return;
		} else {
			tfDataInicioIniciante.setEnabled(false);
			tfDataTerminoIniciante.setEnabled(false);
			tfPesoIniciante.setEnabled(false);
			tfAlturaIniciante.setEnabled(false);
			bBuscarFotoIniciante.setEnabled(false);
			bAvancarIntermediario.setEnabled(false);
			pDadosHistoricoIniciante.setEnabled(false);
			bImcIni.setEnabled(false);

			tfDataInicioIntermediario.setEnabled(true);
			tfDataInicioIntermediario.grabFocus();
			tfDataTerminoIntermediario.setEnabled(true);
			tfPesoIntermediario.setEnabled(true);
			tfAlturaIntermediario.setEnabled(true);
			bBuscarFotoIntermediario.setEnabled(true);
			pDadosHistoricoIntermediario.setEnabled(true);
			bAvancarAvancado.setEnabled(true);
			bImcInt.setEnabled(true);
		}
	}

	private void upNivelDeIntermediarioParaAvancado() {
		if (tfCodigoAluno.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Dados do aluno não preenchido ! Favor buscar um aluno para matricula.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		} else if (tfDataInicioIntermediario.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataInicioIntermediario.grabFocus();
			return;
		} else if (tfPesoIntermediario.getText().equals("   ")) {
			JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfPesoIntermediario.grabFocus();
			return;
		} else if (tfAlturaIntermediario.getText().equals(" .  ")) {
			JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfAlturaIntermediario.grabFocus();
			return;
		} else if (tfDataTerminoIntermediario.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Término obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataTerminoIntermediario.grabFocus();
			return;
		} else {
			tfDataInicioIntermediario.setEnabled(false);
			tfDataTerminoIntermediario.setEnabled(false);
			tfPesoIntermediario.setEnabled(false);
			tfAlturaIntermediario.setEnabled(false);
			bBuscarFotoIntermediario.setEnabled(false);
			bAvancarAvancado.setEnabled(false);
			pDadosHistoricoIntermediario.setEnabled(false);
			bImcInt.setEnabled(false);

			tfDataInicioAvancado.setEnabled(true);
			tfDataInicioAvancado.grabFocus();
			tfDataTerminoAvancado.setEnabled(true);
			tfPesoAvancado.setEnabled(true);
			tfAlturaAvancado.setEnabled(true);
			bBuscarFotoAvancado.setEnabled(true);
			pDadosHistoricoAvancado.setEnabled(true);
			bEncerrarHistorico.setEnabled(true);
			bImcAva.setEnabled(true);
		}
	}

	private void encerrarHistorico() {
		if (tfCodigoAluno.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Dados do aluno não preenchido ! Favor buscar um aluno para matricula.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		} else if (tfDataInicioAvancado.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataInicioAvancado.grabFocus();
			return;
		} else if (tfPesoAvancado.getText().equals("   ")) {
			JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfPesoAvancado.grabFocus();
			return;
		} else if (tfAlturaAvancado.getText().equals(" .  ")) {
			JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfAlturaAvancado.grabFocus();
			return;
		} else if (tfDataTerminoAvancado.getText().equals("__/__/____")) {
			JOptionPane.showConfirmDialog(null, "Campo Data de Término obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			tfDataTerminoAvancado.grabFocus();
			return;
		} else {
			tfDataInicioAvancado.setEnabled(false);
			tfDataTerminoAvancado.setEnabled(false);
			tfPesoAvancado.setEnabled(false);
			tfAlturaAvancado.setEnabled(false);
			bBuscarFotoAvancado.setEnabled(false);
			pDadosHistoricoAvancado.setEnabled(false);
			bEncerrarHistorico.setEnabled(false);
		}
	}

	private void validarCampos() {
		if (tfCodigoAluno.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Dados do aluno não preenchido ! Favor buscar um aluno para matricula.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			bPesquisarAluno.grabFocus();
			return;
		}
		
		if (pDadosHistoricoIniciante.isEnabled() == true) {
			if (tfDataInicioIniciante.getText().equals("__/__/____")) {
				JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
						"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfDataInicioIniciante.grabFocus();
				return;
			} else if (tfPesoIniciante.getText().equals("   ")) {
				JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfPesoIniciante.grabFocus();
				return;
			} else if (tfAlturaIniciante.getText().equals(" .  ")) {
				JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfAlturaIniciante.grabFocus();
				return;
			} else{
				limparTela();
			}
		}

		if (pDadosHistoricoIntermediario.isEnabled() == true) {
			if (tfDataInicioIntermediario.getText().equals("__/__/____")) {
				JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
						"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfDataInicioIntermediario.grabFocus();
				return;
			} else if (tfPesoIntermediario.getText().equals("   ")) {
				JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfPesoIntermediario.grabFocus();
				return;
			} else if (tfAlturaIntermediario.getText().equals(" .  ")) {
				JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfAlturaIntermediario.grabFocus();
				return;
			} else{
				limparTela();
			}
		}

		if (pDadosHistoricoAvancado.isEnabled() == true) {
			if (tfDataInicioAvancado.getText().equals("__/__/____")) {
				JOptionPane.showConfirmDialog(null, "Campo Data de Inicio obrigatório ! Favor preencher o campo.",
						"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfDataInicioAvancado.grabFocus();
				return;
			} else if (tfPesoAvancado.getText().equals("   ")) {
				JOptionPane.showConfirmDialog(null, "Campo Peso obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfPesoAvancado.grabFocus();
				return;
			} else if (tfAlturaAvancado.getText().equals(" .  ")) {
				JOptionPane.showConfirmDialog(null, "Campo Altura obrigatório ! Favor preencher o campo.", "Informação",
						JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
				tfAlturaAvancado.grabFocus();
				return;
			} else {
				limparTela();
			}
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

		tfDataInicioIniciante.setText("");
		tfDataTerminoIniciante.setText("");
		tfPesoIniciante.setText("");
		tfAlturaIniciante.setText("");
		tfImcIniciante.setText("");
		lbFotoIni.setIcon(null);

		tfDataInicioIntermediario.setText("");
		tfDataTerminoIntermediario.setText("");
		tfPesoIntermediario.setText("");
		tfAlturaIntermediario.setText("");
		tfImcIntermediario.setText("");
		lbFotoInt.setIcon(null);

		tfDataInicioAvancado.setText("");
		tfDataTerminoAvancado.setText("");
		tfPesoAvancado.setText("");
		tfAlturaAvancado.setText("");
		tfImcAvancado.setText("");
		lbFotoAva.setIcon(null);

	}

	private void calcularImcIniciante() {
		double peso = 0, altura = 0, imc = 0;

		try {
			peso = Double.parseDouble(tfPesoIniciante.getText());
			altura = Double.parseDouble(tfAlturaIniciante.getText());
			imc = (peso / (altura * altura));
			tfImcIniciante.setText(String.format("%.2f", imc));
		} catch (Exception e) {
			peso = 0;
			altura = 0;
			imc = 0;
			tfImcIniciante.setText("");
		}

		if (imc == 0) {

		} else if (imc < 18.5) {
			tfImcIniciante.setBackground(Color.decode("#1243EA"));
			tfImcIniciante.setForeground(Color.WHITE);
			tfImcIniciante.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 18.5 && imc < 24.9) {
			tfImcIniciante.setBackground(Color.GREEN);
			tfImcIniciante.setForeground(Color.WHITE);
			tfImcIniciante.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 24.9 && imc < 29.9) {
			tfImcIniciante.setBackground(Color.YELLOW);
			tfImcIniciante.setForeground(Color.BLACK);
			tfImcIniciante.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 29.9 && imc < 34.9) {
			tfImcIniciante.setBackground(Color.ORANGE);
			tfImcIniciante.setForeground(Color.BLACK);
			tfImcIniciante.setFont(new Font("Arial", Font.BOLD, 16));
		} else {
			tfImcIniciante.setBackground(Color.RED);
			tfImcIniciante.setForeground(Color.WHITE);
			tfImcIniciante.setFont(new Font("Arial", Font.BOLD, 16));
		}
	}

	private void calcularImcIntermediario() {
		double peso = 0, altura = 0, imc = 0;

		try {
			peso = Double.parseDouble(tfPesoIntermediario.getText());
			altura = Double.parseDouble(tfAlturaIntermediario.getText());
			imc = (peso / (altura * altura));
			tfImcIntermediario.setText(String.format("%.2f", imc));
		} catch (Exception e) {
			peso = 0;
			altura = 0;
			imc = 0;
			tfImcIntermediario.setText("");
		}

		if (imc == 0) {

		} else if (imc < 18.5) {
			tfImcIntermediario.setBackground(Color.decode("#1243EA"));
			tfImcIntermediario.setForeground(Color.WHITE);
			tfImcIntermediario.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 18.5 && imc < 24.9) {
			tfImcIntermediario.setBackground(Color.GREEN);
			tfImcIntermediario.setForeground(Color.WHITE);
			tfImcIntermediario.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 24.9 && imc < 29.9) {
			tfImcIntermediario.setBackground(Color.YELLOW);
			tfImcIntermediario.setForeground(Color.BLACK);
			tfImcIntermediario.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 29.9 && imc < 34.9) {
			tfImcIntermediario.setBackground(Color.ORANGE);
			tfImcIntermediario.setForeground(Color.BLACK);
			tfImcIntermediario.setFont(new Font("Arial", Font.BOLD, 16));
		} else {
			tfImcIntermediario.setBackground(Color.RED);
			tfImcIntermediario.setForeground(Color.WHITE);
			tfImcIntermediario.setFont(new Font("Arial", Font.BOLD, 16));
		}
	}

	private void calcularImcAvancado() {
		double peso = 0, altura = 0, imc = 0;

		try {
			peso = Double.parseDouble(tfPesoAvancado.getText());
			altura = Double.parseDouble(tfAlturaAvancado.getText());
			imc = (peso / (altura * altura));
			tfImcAvancado.setText(String.format("%.2f", imc));
		} catch (Exception e) {
			peso = 0;
			altura = 0;
			imc = 0;
			tfImcAvancado.setText("");
		}

		if (imc == 0) {

		} else if (imc < 18.5) {
			tfImcAvancado.setBackground(Color.decode("#1243EA"));
			tfImcAvancado.setForeground(Color.WHITE);
			tfImcAvancado.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 18.5 && imc < 24.9) {
			tfImcAvancado.setBackground(Color.GREEN);
			tfImcAvancado.setForeground(Color.WHITE);
			tfImcAvancado.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 24.9 && imc < 29.9) {
			tfImcAvancado.setBackground(Color.YELLOW);
			tfImcAvancado.setForeground(Color.BLACK);
			tfImcAvancado.setFont(new Font("Arial", Font.BOLD, 16));
		} else if (imc >= 29.9 && imc < 34.9) {
			tfImcAvancado.setBackground(Color.ORANGE);
			tfImcAvancado.setForeground(Color.BLACK);
			tfImcAvancado.setFont(new Font("Arial", Font.BOLD, 16));
		} else {
			tfImcAvancado.setBackground(Color.RED);
			tfImcAvancado.setForeground(Color.WHITE);
			tfImcAvancado.setFont(new Font("Arial", Font.BOLD, 16));
		}
	}
}