package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
public class CadTurma extends MyDialog {
	private JLabel lbCodigo, lbPersonal, lbDiaSemana, lbNivel, lbModalidade, lbHorario1, lbHorario2, lbAs11, lbAs12,
			lbAs13, lbAs14, lbAs15, lbAs16, lbAs21, lbAs22, lbAs23, lbAs24, lbAs25, lbAs26;
	private JTextField tfCodigo;
	private JFormattedTextField das11, ate11, das12, ate12, das13, ate13, das14, ate14, das15, ate15, das16, ate16,
			das21, ate21, das22, ate22, das23, ate23, das24, ate24, das25, ate25, das26, ate26;
	private MaskFormatter mdas11, mate11, mdas12, mate12, mdas13, mate13, mdas14, mate14, mdas15, mate15, mdas16,
			mate16, mdas21, mate21, mdas22, mate22, mdas23, mate23, mdas24, mate24, mdas25, mate25, mdas26, mate26;
	private JCheckBox checkSegunda, checkTerca, checkQuarta, checkQuinta, checkSexta, checkSabado;
	@SuppressWarnings("rawtypes")
	private JComboBox cbPersonal, cbNivel, cbModalidade;
	private JButton bPesquisar, bAddHoraSeg, bAddHoraTer, bAddHoraQua, bAddHoraQui, bAddHoraSex, bAddHoraSab,
			bSaiHoraSeg, bSaiHoraTer, bSaiHoraQua, bSaiHoraQui, bSaiHoraSex, bSaiHoraSab, bSalvar, bCancelar, bExcluir,
			bSair;
	private JPanel pDadosTurma;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		CadTurma turma = new CadTurma();
	}

	public CadTurma() {
		this.iniciarComponentes();
		this.iniciarTela();
	}

	private void iniciarTela() {
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.WHITE);
		this.setTitle("Cadastro de turma");
		this.setResizable(false);
		this.setSize(604, 425);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void iniciarComponentes() {
		lbCodigo = new JLabel("Código: ");
		lbCodigo.setBounds(12, 20, 100, 20);
		tfCodigo = new JTextField("");
		tfCodigo.setBounds(10, 40, 160, 30);
		tfCodigo.setEnabled(false);

		lbPersonal = new JLabel("Personal Responsável: ");
		lbPersonal.setBounds(222, 20, 160, 20);
		cbPersonal = new JComboBox();
		cbPersonal.setSelectedIndex(-1);
		cbPersonal.setBounds(220, 40, 363, 30);

		lbNivel = new JLabel("Nível: ");
		lbNivel.setBounds(12, 70, 100, 20);
		cbNivel = new JComboBox();
		cbNivel.setModel(new DefaultComboBoxModel(new String[] { "Iniciante", "Intermediario", "Avançado" }));
		cbNivel.setSelectedIndex(-1);
		cbNivel.setBounds(10, 90, 160, 30);

		lbModalidade = new JLabel("Modalidade: ");
		lbModalidade.setBounds(222, 70, 100, 20);
		cbModalidade = new JComboBox();
		cbModalidade.setSelectedIndex(-1);
		cbModalidade.setBounds(220, 90, 190, 30);

		lbDiaSemana = new JLabel("Dias da semana:");
		lbDiaSemana.setBounds(12, 120, 160, 20);

		checkSegunda = new JCheckBox("Segunda-feira");
		checkSegunda.setBounds(10, 140, 160, 30);
		checkSegunda.setBackground(Color.WHITE);

		checkTerca = new JCheckBox("Terça-feira");
		checkTerca.setBounds(10, 170, 160, 30);
		checkTerca.setBackground(Color.WHITE);

		checkQuarta = new JCheckBox("Quarta-feira");
		checkQuarta.setBounds(10, 200, 160, 30);
		checkQuarta.setBackground(Color.WHITE);

		checkQuinta = new JCheckBox("Quinta-feira");
		checkQuinta.setBounds(10, 230, 160, 30);
		checkQuinta.setBackground(Color.WHITE);

		checkSexta = new JCheckBox("Sexta-feira");
		checkSexta.setBounds(10, 260, 160, 30);
		checkSexta.setBackground(Color.WHITE);

		checkSabado = new JCheckBox("Sábado");
		checkSabado.setBounds(10, 290, 160, 30);
		checkSabado.setBackground(Color.WHITE);

		lbHorario1 = new JLabel("Horário 1:");
		lbHorario1.setBounds(222, 120, 100, 20);

		das11 = new JFormattedTextField();
		das11.setBounds(222, 140, 50, 30);
		das11.setEnabled(false);
		lbAs11 = new JLabel("Às");
		lbAs11.setBounds(289, 150, 30, 20);
		ate11 = new JFormattedTextField();
		ate11.setBounds(322, 140, 50, 30);
		ate11.setEnabled(false);

		das12 = new JFormattedTextField();
		das12.setBounds(222, 170, 50, 30);
		das12.setEnabled(false);
		lbAs12 = new JLabel("Às");
		lbAs12.setBounds(289, 180, 30, 20);
		ate12 = new JFormattedTextField();
		ate12.setBounds(322, 170, 50, 30);
		ate12.setEnabled(false);

		das13 = new JFormattedTextField();
		das13.setBounds(222, 200, 50, 30);
		das13.setEnabled(false);
		lbAs13 = new JLabel("Às");
		lbAs13.setBounds(289, 210, 30, 20);
		ate13 = new JFormattedTextField();
		ate13.setBounds(322, 200, 50, 30);
		ate13.setEnabled(false);

		das14 = new JFormattedTextField();
		das14.setBounds(222, 230, 50, 30);
		das14.setEnabled(false);
		lbAs14 = new JLabel("Às");
		lbAs14.setBounds(289, 240, 30, 20);
		ate14 = new JFormattedTextField();
		ate14.setBounds(322, 230, 50, 30);
		ate14.setEnabled(false);

		das15 = new JFormattedTextField();
		das15.setBounds(222, 260, 50, 30);
		das15.setEnabled(false);
		lbAs15 = new JLabel("Às");
		lbAs15.setBounds(289, 270, 30, 20);
		ate15 = new JFormattedTextField();
		ate15.setBounds(322, 260, 50, 30);
		ate15.setEnabled(false);

		das16 = new JFormattedTextField();
		das16.setBounds(222, 290, 50, 30);
		das16.setEnabled(false);
		lbAs16 = new JLabel("Às");
		lbAs16.setBounds(289, 300, 30, 20);
		ate16 = new JFormattedTextField();
		ate16.setBounds(322, 290, 50, 30);
		ate16.setEnabled(false);

		lbHorario2 = new JLabel("Horário 2:");
		lbHorario2.setBounds(432, 120, 100, 20);
		lbHorario2.setVisible(false);

		das21 = new JFormattedTextField();
		das21.setBounds(432, 140, 50, 30);
		das21.setVisible(false);
		lbAs21 = new JLabel("Às");
		lbAs21.setBounds(499, 150, 30, 20);
		lbAs21.setVisible(false);
		ate21 = new JFormattedTextField();
		ate21.setBounds(532, 140, 50, 30);
		ate21.setVisible(false);

		das22 = new JFormattedTextField();
		das22.setBounds(432, 170, 50, 30);
		das22.setVisible(false);
		lbAs22 = new JLabel("Às");
		lbAs22.setBounds(499, 180, 30, 20);
		lbAs22.setVisible(false);
		ate22 = new JFormattedTextField();
		ate22.setBounds(532, 170, 50, 30);
		ate22.setVisible(false);

		das23 = new JFormattedTextField();
		das23.setBounds(432, 200, 50, 30);
		das23.setVisible(false);
		lbAs23 = new JLabel("Às");
		lbAs23.setBounds(499, 210, 30, 20);
		lbAs23.setVisible(false);
		ate23 = new JFormattedTextField();
		ate23.setBounds(532, 200, 50, 30);
		ate23.setVisible(false);

		das24 = new JFormattedTextField();
		das24.setBounds(432, 230, 50, 30);
		das24.setVisible(false);
		lbAs24 = new JLabel("Às");
		lbAs24.setBounds(499, 240, 30, 20);
		lbAs24.setVisible(false);
		ate24 = new JFormattedTextField();
		ate24.setBounds(532, 230, 50, 30);
		ate24.setVisible(false);

		das25 = new JFormattedTextField();
		das25.setBounds(432, 260, 50, 30);
		das25.setVisible(false);
		lbAs25 = new JLabel("Às");
		lbAs25.setBounds(499, 270, 30, 20);
		lbAs25.setVisible(false);
		ate25 = new JFormattedTextField();
		ate25.setBounds(532, 260, 50, 30);
		ate25.setVisible(false);

		das26 = new JFormattedTextField();
		das26.setBounds(432, 290, 50, 30);
		das26.setVisible(false);
		lbAs26 = new JLabel("Às");
		lbAs26.setBounds(499, 300, 30, 20);
		lbAs26.setVisible(false);
		ate26 = new JFormattedTextField();
		ate26.setBounds(532, 290, 50, 30);
		ate26.setVisible(false);

		// Mascaras de formato
		try {
			this.mdas11 = new MaskFormatter("##:##");
			mdas11.setPlaceholderCharacter('_');
			this.mdas11.install(this.das11);

			this.mate11 = new MaskFormatter("##:##");
			mate11.setPlaceholderCharacter('_');
			this.mate11.install(this.ate11);

			this.mdas12 = new MaskFormatter("##:##");
			mdas12.setPlaceholderCharacter('_');
			this.mdas12.install(this.das12);

			this.mate12 = new MaskFormatter("##:##");
			mate12.setPlaceholderCharacter('_');
			this.mate12.install(this.ate12);

			this.mdas13 = new MaskFormatter("##:##");
			mdas13.setPlaceholderCharacter('_');
			this.mdas13.install(this.das13);

			this.mate13 = new MaskFormatter("##:##");
			mate13.setPlaceholderCharacter('_');
			this.mate13.install(this.ate13);

			this.mdas14 = new MaskFormatter("##:##");
			mdas14.setPlaceholderCharacter('_');
			this.mdas14.install(this.das14);

			this.mate14 = new MaskFormatter("##:##");
			mate14.setPlaceholderCharacter('_');
			this.mate14.install(this.ate14);

			this.mdas15 = new MaskFormatter("##:##");
			mdas15.setPlaceholderCharacter('_');
			this.mdas15.install(this.das15);

			this.mate15 = new MaskFormatter("##:##");
			mate15.setPlaceholderCharacter('_');
			this.mate15.install(this.ate15);

			this.mdas16 = new MaskFormatter("##:##");
			mdas16.setPlaceholderCharacter('_');
			this.mdas16.install(this.das16);

			this.mate16 = new MaskFormatter("##:##");
			mate16.setPlaceholderCharacter('_');
			this.mate16.install(this.ate16);

			this.mdas21 = new MaskFormatter("##:##");
			mdas21.setPlaceholderCharacter('_');
			this.mdas21.install(this.das21);

			this.mate21 = new MaskFormatter("##:##");
			mate21.setPlaceholderCharacter('_');
			this.mate21.install(this.ate21);

			this.mdas22 = new MaskFormatter("##:##");
			mdas22.setPlaceholderCharacter('_');
			this.mdas22.install(this.das22);

			this.mate22 = new MaskFormatter("##:##");
			mate22.setPlaceholderCharacter('_');
			this.mate22.install(this.ate22);

			this.mdas23 = new MaskFormatter("##:##");
			mdas23.setPlaceholderCharacter('_');
			this.mdas23.install(this.das23);

			this.mate23 = new MaskFormatter("##:##");
			mate23.setPlaceholderCharacter('_');
			this.mate23.install(this.ate23);

			this.mdas24 = new MaskFormatter("##:##");
			mdas24.setPlaceholderCharacter('_');
			this.mdas24.install(this.das24);

			this.mate24 = new MaskFormatter("##:##");
			mate24.setPlaceholderCharacter('_');
			this.mate24.install(this.ate24);

			this.mdas25 = new MaskFormatter("##:##");
			mdas25.setPlaceholderCharacter('_');
			this.mdas25.install(this.das25);

			this.mate25 = new MaskFormatter("##:##");
			mate25.setPlaceholderCharacter('_');
			this.mate25.install(this.ate25);

			this.mdas26 = new MaskFormatter("##:##");
			mdas26.setPlaceholderCharacter('_');
			this.mdas26.install(this.das26);

			this.mate26 = new MaskFormatter("##:##");
			mate26.setPlaceholderCharacter('_');
			this.mate26.install(this.ate26);
		} catch (Exception erroG) {

		}

		bAddHoraSeg = new JButton("");
		bAddHoraSeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das21.setVisible(true);
				lbAs21.setVisible(true);
				ate21.setVisible(true);

				bAddHoraSeg.setVisible(false);
				bSaiHoraSeg.setVisible(true);
			}
		});
		bAddHoraSeg.setBounds(382, 140, 30, 30);
		bAddHoraSeg.setEnabled(false);
		bAddHoraSeg.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraSeg.setToolTipText("Clique para adicionar um horário para segunda-feira !");

		bSaiHoraSeg = new JButton("");
		bSaiHoraSeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraSeg.setVisible(true);
				das21.setVisible(false);
				lbAs21.setVisible(false);
				ate21.setVisible(false);

				das21.setText("");
				;
				ate21.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraSeg.setBounds(382, 140, 30, 30);
		bSaiHoraSeg.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraSeg.setVisible(false);
		bSaiHoraSeg.setToolTipText("Clique para remover o horário2 de segunda-feira !");

		bAddHoraTer = new JButton("");
		bAddHoraTer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das22.setVisible(true);
				lbAs22.setVisible(true);
				ate22.setVisible(true);

				bAddHoraTer.setVisible(false);
				bSaiHoraTer.setVisible(true);
			}
		});
		bAddHoraTer.setBounds(382, 170, 30, 30);
		bAddHoraTer.setEnabled(false);
		bAddHoraTer.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraTer.setToolTipText("Clique para adicionar um horário para terça-feira !");

		bSaiHoraTer = new JButton("");
		bSaiHoraTer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraTer.setVisible(true);
				das22.setVisible(false);
				lbAs22.setVisible(false);
				ate22.setVisible(false);

				das22.setText("");
				ate22.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraTer.setBounds(382, 170, 30, 30);
		bSaiHoraTer.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraTer.setVisible(false);
		bSaiHoraTer.setToolTipText("Clique para remover o horário2 de terça-feira !");

		bAddHoraQua = new JButton("");
		bAddHoraQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das23.setVisible(true);
				lbAs23.setVisible(true);
				ate23.setVisible(true);

				bAddHoraQua.setVisible(false);
				bSaiHoraQua.setVisible(true);
			}
		});
		bAddHoraQua.setBounds(382, 200, 30, 30);
		bAddHoraQua.setEnabled(false);
		bAddHoraQua.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraQua.setToolTipText("Clique para adicionar um horário para quarta-feira !");

		bSaiHoraQua = new JButton("");
		bSaiHoraQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraQua.setVisible(true);
				das23.setVisible(false);
				lbAs23.setVisible(false);
				ate23.setVisible(false);

				das23.setText("");
				ate23.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraQua.setBounds(382, 200, 30, 30);
		bSaiHoraQua.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraQua.setVisible(false);
		bSaiHoraQua.setToolTipText("Clique para remover o horário2 de quarta-feira !");

		bAddHoraQui = new JButton("");
		bAddHoraQui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das24.setVisible(true);
				lbAs24.setVisible(true);
				ate24.setVisible(true);

				bAddHoraQui.setVisible(false);
				bSaiHoraQui.setVisible(true);
			}
		});
		bAddHoraQui.setBounds(382, 230, 30, 30);
		bAddHoraQui.setEnabled(false);
		bAddHoraQui.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraQui.setToolTipText("Clique para adicionar um horário para quinta-feira !");

		bSaiHoraQui = new JButton("");
		bSaiHoraQui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraQui.setVisible(true);
				das24.setVisible(false);
				lbAs24.setVisible(false);
				ate24.setVisible(false);

				das24.setText("");
				ate24.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraQui.setBounds(382, 230, 30, 30);
		bSaiHoraQui.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraQui.setVisible(false);
		bSaiHoraQui.setToolTipText("Clique para remover o horário2 de quinta-feira !");

		bAddHoraSex = new JButton("");
		bAddHoraSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das25.setVisible(true);
				lbAs25.setVisible(true);
				ate25.setVisible(true);

				bAddHoraSex.setVisible(false);
				bSaiHoraSex.setVisible(true);
			}
		});
		bAddHoraSex.setBounds(382, 260, 30, 30);
		bAddHoraSex.setEnabled(false);
		bAddHoraSex.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraSex.setToolTipText("Clique para adicionar um horário para sexta-feira !");

		bSaiHoraSex = new JButton("");
		bSaiHoraSex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraSex.setVisible(true);
				das25.setVisible(false);
				lbAs25.setVisible(false);
				ate25.setVisible(false);

				das25.setText("");
				ate25.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraSex.setBounds(382, 260, 30, 30);
		bSaiHoraSex.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraSex.setVisible(false);
		bSaiHoraSex.setToolTipText("Clique para remover o horário2 de sexta-feira !");

		bAddHoraSab = new JButton("");
		bAddHoraSab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbHorario2.setVisible(true);

				das26.setVisible(true);
				lbAs26.setVisible(true);
				ate26.setVisible(true);

				bAddHoraSab.setVisible(false);
				bSaiHoraSab.setVisible(true);
				bSaiHoraSab.grabFocus();
			}
		});
		bAddHoraSab.setBounds(382, 290, 30, 30);
		bAddHoraSab.setEnabled(false);
		bAddHoraSab.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/add.gif"))));
		bAddHoraSab.setToolTipText("Clique para adicionar um horário para sábado !");

		bSaiHoraSab = new JButton("");
		bSaiHoraSab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAddHoraSab.setVisible(true);
				das26.setVisible(false);
				lbAs26.setVisible(false);
				ate26.setVisible(false);

				das26.setText("");
				ate26.setText("");
				mostrarLbHorario2();
			}
		});
		bSaiHoraSab.setBounds(382, 290, 30, 30);
		bSaiHoraSab.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/remove.png"))));
		bSaiHoraSab.setVisible(false);
		bSaiHoraSab.setToolTipText("Clique para remover o horário2 de sábado !");

		// tratando os checkbox
		CheckBoxHandler tratador = new CheckBoxHandler();
		checkSegunda.addItemListener(tratador);
		checkTerca.addItemListener(tratador);
		checkQuarta.addItemListener(tratador);
		checkQuinta.addItemListener(tratador);
		checkSexta.addItemListener(tratador);
		checkSabado.addItemListener(tratador);

		bPesquisar = new JButton("");
		bPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carregarTelaConsultaTurma();
			}
		});
		bPesquisar.setBounds(180, 40, 30, 30);// C:\Users\Igor\Pictures
		bPesquisar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/p.png"))));
		bPesquisar.setToolTipText("Clique para pesquisar uma turma !");

		// Instancia/Cria o Painel "SUPERIOR"
		this.pDadosTurma = new JPanel(null);
		this.pDadosTurma.setBorder(new TitledBorder("DADOS TURMA"));
		this.pDadosTurma.setBackground(Color.WHITE);
		this.pDadosTurma.setBounds(2, 7, 593, 340);
		// Adiciona os componentes ao painel "SUPERIOR"
		this.pDadosTurma.add(this.lbCodigo);
		this.pDadosTurma.add(this.tfCodigo);
		this.pDadosTurma.add(this.bPesquisar);
		this.pDadosTurma.add(this.lbPersonal);
		this.pDadosTurma.add(this.cbPersonal);
		this.pDadosTurma.add(this.lbNivel);
		this.pDadosTurma.add(this.cbNivel);
		this.pDadosTurma.add(this.lbModalidade);
		this.pDadosTurma.add(this.cbModalidade);
		this.pDadosTurma.add(this.lbDiaSemana);
		this.pDadosTurma.add(this.checkSegunda);
		this.pDadosTurma.add(this.checkTerca);
		this.pDadosTurma.add(this.checkQuarta);
		this.pDadosTurma.add(this.checkQuinta);
		this.pDadosTurma.add(this.checkSexta);
		this.pDadosTurma.add(this.checkSabado);
		this.pDadosTurma.add(this.lbHorario1);
		this.pDadosTurma.add(this.das11);
		this.pDadosTurma.add(this.lbAs11);
		this.pDadosTurma.add(this.ate11);
		this.pDadosTurma.add(this.das12);
		this.pDadosTurma.add(this.lbAs12);
		this.pDadosTurma.add(this.ate12);
		this.pDadosTurma.add(this.das13);
		this.pDadosTurma.add(this.lbAs13);
		this.pDadosTurma.add(this.ate13);
		this.pDadosTurma.add(this.das14);
		this.pDadosTurma.add(this.lbAs14);
		this.pDadosTurma.add(this.ate14);
		this.pDadosTurma.add(this.das15);
		this.pDadosTurma.add(this.lbAs15);
		this.pDadosTurma.add(this.ate15);
		this.pDadosTurma.add(this.das16);
		this.pDadosTurma.add(this.lbAs16);
		this.pDadosTurma.add(this.ate16);
		this.pDadosTurma.add(this.bAddHoraSeg);
		this.pDadosTurma.add(this.bSaiHoraSeg);
		this.pDadosTurma.add(this.lbHorario2);
		this.pDadosTurma.add(this.das21);
		this.pDadosTurma.add(this.lbAs21);
		this.pDadosTurma.add(this.ate21);
		this.pDadosTurma.add(this.bAddHoraTer);
		this.pDadosTurma.add(this.bSaiHoraTer);
		this.pDadosTurma.add(this.das22);
		this.pDadosTurma.add(this.lbAs22);
		this.pDadosTurma.add(this.ate22);
		this.pDadosTurma.add(this.bAddHoraQua);
		this.pDadosTurma.add(this.bSaiHoraQua);
		this.pDadosTurma.add(this.das23);
		this.pDadosTurma.add(this.lbAs23);
		this.pDadosTurma.add(this.ate23);
		this.pDadosTurma.add(this.bAddHoraQui);
		this.pDadosTurma.add(this.bSaiHoraQui);
		this.pDadosTurma.add(this.das24);
		this.pDadosTurma.add(this.lbAs24);
		this.pDadosTurma.add(this.ate24);
		this.pDadosTurma.add(this.bAddHoraSex);
		this.pDadosTurma.add(this.bSaiHoraSex);
		this.pDadosTurma.add(this.das25);
		this.pDadosTurma.add(this.lbAs25);
		this.pDadosTurma.add(this.ate25);
		this.pDadosTurma.add(this.bAddHoraSab);
		this.pDadosTurma.add(this.bSaiHoraSab);
		this.pDadosTurma.add(this.das26);
		this.pDadosTurma.add(this.lbAs26);
		this.pDadosTurma.add(this.ate26);

		this.add(pDadosTurma);

		bSalvar = new JButton("Salvar");
		bSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validarCampos();
			}
		});
		bSalvar.setBounds(15, 350, 120, 40);
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
		bCancelar.setBounds(165, 350, 120, 40);
		bCancelar.setMnemonic('C');
		bCancelar.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/cancel.png"))));
		bCancelar.setToolTipText("Clique para cancelar o cadastro !");
		add(bCancelar);

		bExcluir = new JButton("Excluir");
		bExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		bExcluir.setBounds(315, 350, 120, 40);
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
		bSair.setBounds(465, 350, 120, 40);
		bSair.setMnemonic('S');
		bSair.setIcon(new ImageIcon((CadAluno.class.getResource("/imagens/getout.png"))));
		bSair.setToolTipText("Clique para sair do cadastro !");
		add(bSair);
	}

	private class CheckBoxHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (checkSegunda.isSelected()) {
				das11.setEnabled(true);
				ate11.setEnabled(true);
				bAddHoraSeg.setEnabled(true);
			} else {
				// horario 1 kkk
				das11.setText("");
				das11.setEnabled(false);
				ate11.setText("");
				ate11.setEnabled(false);
				bAddHoraSeg.setEnabled(false);
				bAddHoraSeg.setVisible(true);
				bSaiHoraSeg.setVisible(false);

				// horario 2 cambada
				das21.setText("");
				das21.setVisible(false);
				lbAs21.setVisible(false);
				ate21.setText("");
				ate21.setVisible(false);
			}

			if (checkTerca.isSelected()) {
				das12.setEnabled(true);
				ate12.setEnabled(true);
				bAddHoraTer.setEnabled(true);
			} else {
				// horario 1 kkk
				das12.setText("");
				das12.setEnabled(false);
				ate12.setText("");
				ate12.setEnabled(false);
				bAddHoraTer.setEnabled(false);

				// horario 2 cambada
				das22.setText("");
				das22.setVisible(false);
				lbAs22.setVisible(false);
				ate22.setText("");
				ate22.setVisible(false);
				bAddHoraTer.setVisible(true);
				bSaiHoraTer.setVisible(false);
			}

			if (checkQuarta.isSelected()) {
				das13.setEnabled(true);
				ate13.setEnabled(true);
				bAddHoraQua.setEnabled(true);
			} else {
				// horario 1 kkk
				das13.setText("");
				das13.setEnabled(false);
				ate13.setText("");
				ate13.setEnabled(false);
				bAddHoraQua.setEnabled(false);

				// horario 2 cambada
				das23.setText("");
				das23.setVisible(false);
				lbAs23.setVisible(false);
				ate23.setText("");
				ate23.setVisible(false);
				bAddHoraQua.setVisible(true);
				bSaiHoraQua.setVisible(false);
			}

			if (checkQuinta.isSelected()) {
				das14.setEnabled(true);
				ate14.setEnabled(true);
				bAddHoraQui.setEnabled(true);
			} else {
				// horario 1 kkk
				das14.setText("");
				das14.setEnabled(false);
				ate14.setText("");
				ate14.setEnabled(false);
				bAddHoraQui.setEnabled(false);

				// horario 2 cambada
				das24.setText("");
				das24.setVisible(false);
				lbAs24.setVisible(false);
				ate24.setText("");
				ate24.setVisible(false);
				bAddHoraQui.setVisible(true);
				bSaiHoraQui.setVisible(false);
			}

			if (checkSexta.isSelected()) {
				das15.setEnabled(true);
				ate15.setEnabled(true);
				bAddHoraSex.setEnabled(true);
			} else {
				// horario 1 kkk
				das15.setText("");
				das15.setEnabled(false);
				ate15.setText("");
				ate15.setEnabled(false);
				bAddHoraSex.setEnabled(false);

				// horario 2 cambada
				das25.setText("");
				das25.setVisible(false);
				lbAs25.setVisible(false);
				ate25.setText("");
				ate25.setVisible(false);
				bAddHoraSex.setVisible(true);
				bSaiHoraSex.setVisible(false);
			}

			if (checkSabado.isSelected()) {
				das16.setEnabled(true);
				ate16.setEnabled(true);
				bAddHoraSab.setEnabled(true);
			} else {
				// horario 1 kkk
				das16.setText("");
				das16.setEnabled(false);
				ate16.setText("");
				ate16.setEnabled(false);
				bAddHoraSab.setEnabled(false);

				// horario 2 cambada
				das26.setText("");
				das26.setVisible(false);
				lbAs26.setVisible(false);
				ate26.setText("");
				ate26.setVisible(false);
				bAddHoraSab.setVisible(true);
				bSaiHoraSab.setVisible(false);
			}

			// Aqui faz com que o lbHorario2 só suma da tela quando nenhum
			// componente dele esteja visivel
			if (das21.isVisible() || das22.isVisible() || das23.isVisible() || das24.isVisible() || das25.isVisible()
					|| das26.isVisible()) {
				lbHorario2.setVisible(true);
			} else {
				lbHorario2.setVisible(false);
			}
		}
	}

	private void mostrarLbHorario2() {
		// Aqui faz com que o lbHorario2 só suma da tela quando nenhum
		// componente dele esteja visivel
		if (das21.isVisible() || das22.isVisible() || das23.isVisible() || das24.isVisible() || das25.isVisible()
				|| das26.isVisible()) {
			lbHorario2.setVisible(true);
		} else {
			lbHorario2.setVisible(false);
		}
	}

	@SuppressWarnings("unused")
	private void carregarTelaConsultaTurma() {
		ConsultaTurma consultaTurma = new ConsultaTurma();
	}

	private void validarCampos() {
		if (cbPersonal.getSelectedIndex() == -1) {
			JOptionPane.showConfirmDialog(null, "Campo Personal obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbPersonal.grabFocus();
			return;
		} else if (cbNivel.getSelectedIndex() == -1) {
			JOptionPane.showConfirmDialog(null, "Campo Nível obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbNivel.grabFocus();
			return;
		} else if (cbModalidade.getSelectedIndex() == -1) {
			JOptionPane.showConfirmDialog(null, "Campo Modalidade obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			cbModalidade.grabFocus();
			return;
		} else if (checkSegunda.isSelected() && das11.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da segunda-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das11.grabFocus();
			return;
		} else if (checkSegunda.isSelected() && ate11.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da segunda-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate11.grabFocus();
			return;
		} else if (checkTerca.isSelected() && das12.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 da terça-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das12.grabFocus();
			return;
		} else if (checkTerca.isSelected() && ate12.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 da terça-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate12.grabFocus();
			return;
		} else if (checkQuarta.isSelected() && das13.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da quarta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das13.grabFocus();
			return;
		} else if (checkQuarta.isSelected() && ate13.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da quarta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate13.grabFocus();
			return;
		} else if (checkQuinta.isSelected() && das14.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da quinta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das14.grabFocus();
			return;
		} else if (checkQuinta.isSelected() && ate14.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 1 da quinta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate14.grabFocus();
			return;
		} else if (checkSexta.isSelected() && das15.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 da sexta-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das15.grabFocus();
			return;
		} else if (checkSexta.isSelected() && ate15.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 da sexta-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate15.grabFocus();
			return;
		} else if (checkSabado.isSelected() && das16.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 do sábado obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das16.grabFocus();
			return;
		} else if (checkSabado.isSelected() && ate16.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 1 do sábado obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate16.grabFocus();
			return;
		} else if (checkSegunda.isSelected() && das21.isVisible() && das21.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da segunda-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das21.grabFocus();
			return;
		} else if (checkSegunda.isSelected() && ate21.isVisible() && ate21.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da segunda-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate21.grabFocus();
			return;
		} else if (checkTerca.isSelected() && das22.isVisible() && das22.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 da terça-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das22.grabFocus();
			return;
		} else if (checkTerca.isSelected() && ate22.isVisible() && ate22.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 da terça-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate22.grabFocus();
			return;
		} else if (checkQuarta.isSelected() && das23.isVisible() && das23.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da quarta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das23.grabFocus();
			return;
		} else if (checkQuarta.isSelected() && ate23.isVisible() && ate23.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da quarta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate23.grabFocus();
			return;
		} else if (checkQuinta.isSelected() && das24.isVisible() && das24.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da quinta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das24.grabFocus();
			return;
		} else if (checkQuinta.isSelected() && ate24.isVisible() && ate24.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null,
					"Campo Horário 2 da quinta-feira obrigatório ! Favor preencher o campo.", "Informação",
					JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate24.grabFocus();
			return;
		} else if (checkSexta.isSelected() && das25.isVisible() && das25.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 da sexta-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das25.grabFocus();
			return;
		} else if (checkSexta.isSelected() && ate25.isVisible() && ate25.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 da sexta-feira obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate25.grabFocus();
			return;
		} else if (checkSabado.isSelected() && das26.isVisible() && das26.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 do sábado obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			das26.grabFocus();
			return;
		} else if (checkSabado.isSelected() && ate26.isVisible() && ate26.getText().equals("__:__")) {
			JOptionPane.showConfirmDialog(null, "Campo Horário 2 do sábado obrigatório ! Favor preencher o campo.",
					"Informação", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
			ate26.grabFocus();
			return;
		} else {
			limparTela();
		}
	}

	private void limparTela() {
		tfCodigo.setText("");
		cbPersonal.setSelectedIndex(-1);
		cbNivel.setSelectedIndex(-1);
		cbModalidade.setSelectedIndex(-1);
		checkSegunda.setSelected(false);
		checkTerca.setSelected(false);
		checkQuarta.setSelected(false);
		checkQuinta.setSelected(false);
		checkSexta.setSelected(false);
		checkSabado.setSelected(false);
	}
}