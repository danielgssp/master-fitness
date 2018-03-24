package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;

@SuppressWarnings("serial")
public class MyDialog extends JDialog
{
	private URL caminhoImagem;
    private Image iconeTitulo;
	
	public MyDialog() {
		String className = getLookAndFeelClassName("Nimbus");
		
		try {
			UIManager.setLookAndFeel(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		this.setResizable(false);
		setModal(true);
		iniciarComponentes();
	}
	
	private void iniciarComponentes()
	{
		caminhoImagem = CadAluno.class.getResource("/imagens/iconSistema.png");
        iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
        setIconImage(iconeTitulo);
	}

	private String getLookAndFeelClassName(String nameSnippet) {
		LookAndFeelInfo[] plafs = UIManager.getInstalledLookAndFeels();
		for (LookAndFeelInfo info : plafs) {
			if (info.getName().contains(nameSnippet)) {
				return info.getClassName();
			}
		}
		return null;
	}
}