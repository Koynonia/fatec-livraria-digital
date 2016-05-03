/**
 * @author Fernando Moraes Oliveira
 * Matéria 4724 - Engenharia de Software 3
 * 4º ADS - Noite
 * Iniciado em 03/05/2016
 */

package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import entity.Usuario;
import entity.Sessao;
import dao.Arquivo;
import dao.ArquivoSessao;

public class SessaoController implements Arquivo {

	// Variável estática que conterá a instancia da classe
	private static SessaoController instance;
	private String diretorio = "../LivrariaDigital_teste/";
	private String arquivo = "log";
	private List<Sessao> logon;
	private ArquivoSessao dao = new ArquivoSessao();

	// Construtor privado (suprime o construtor público padrão).
	private SessaoController() {
		
		new ArrayList<Usuario>();
		this.setLogon(new ArrayList<Sessao>());
		
		lerSession();
	}

	// Método público estático de acesso único ao objeto!
	public static SessaoController getInstance() {
		if (instance == null)
			instance = new SessaoController();
		return instance;
	}

	
	// METODOS DE SUPORTE ////////////////////////

	public void msg(String tipo, String mensagem) {

		switch (tipo) {

		case "errorsession":
			JOptionPane.showMessageDialog(null, 
					"ACESSO NEGADO!\n\nPor favor, solicite a autorização de um administrador.", 
					"Bloqueado", 
					JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("../MASProject/icons/warning.png"));
			break;

		default:
			JOptionPane.showMessageDialog(null, 
					"ERRO! Algo não deveria ter acontecido…\n\nSessaoCtrl - Termo: " + mensagem
					+ "\n\nOcorreu no Controller desta Tela.", 
					"Erro no Controller", 
					JOptionPane.PLAIN_MESSAGE,
					new ImageIcon("../MASProject/icons/error.png"));
		}
	}

public void lerSession() {
		
		String linha = new String();
		ArrayList<String> list = new ArrayList<>();
	
		try {
			dao.lerArquivo( diretorio + "data/", arquivo );
			linha = dao.getBuffer();
			String[] listaSession = linha.split(";");
			for (String s : listaSession) {
				String text = s.replaceAll(".*: ", "");
				list.add(text);
				if (s.contains("---")) {
					Sessao log = new Sessao();
					log.setId(list.get(0));
					log.setUsuario(list.get(1));
					log.setNivel(list.get(2));
					log.setHora(list.get(3));
					getLogon().add(log);
					list.clear();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void atualizaSession(List<Sessao> lista) {
		
		File f = new File( diretorio + "data/", arquivo );
		f.delete();	
		for (Sessao logon : lista) {
			try {
				dao.escreverArquivo(diretorio + "data/", arquivo, "", logon);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	public String registrar(String id, String usuario, String acesso, String tela) {
		
		Sessao log = new Sessao();
		Date date = new Date();

					getLogon().clear(); //APAGA A ULTIMA SESSAO
					log.setId(id);
					log.setUsuario(usuario);
					log.setNivel(acesso);
					log.setHora(date.toString());
					log.setTela(tela);
					getLogon().add(log);
					atualizaSession(getLogon());
					return getLogon().get(0).getNivel();	
	}
	
	
	public boolean acesso() {

			lerSession();
			boolean open;
			if (("Administrativo").equalsIgnoreCase(getLogon().get(0).getNivel())){
				open = true;
			} else {
				//msg("errorsession", logon.get(0).getNivel());
				open = false;
			}
			return open;
		}

	public List<Sessao> getLogon() {
		return logon;
	}

	public void setLogon(List<Sessao> logon) {
		this.logon = logon;
	}

	@Override
	public void lerArquivo(String diretorio, String arquivo) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escreverArquivo(String diretorio, String arquivo, String texto,
			Object object) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lerDiretorio(String diretorio) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirDadosArquivo(String diretorio, String arquivo,
			String[] registro) throws IOException {
		// TODO Auto-generated method stub
		
	} 
	
}