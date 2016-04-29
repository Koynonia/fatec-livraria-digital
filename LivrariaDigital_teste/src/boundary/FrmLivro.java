/**
 * @author Fernando Moraes Oliveira e Vitor Fagundes Arantes
 * Matéria 4724 - Engenharia de Software 3
 * 4º ADS - Noite
 * Iniciado em 06/04/2016
 */

package boundary;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
<<<<<<< HEAD
import java.text.ParseException;

=======
import java.awt.Image;
import java.text.ParseException;

import javax.swing.ImageIcon;
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import controller.LivroController;


public class FrmLivro extends JFrame {
	
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD

	private JPanel painel;
	private JSeparator linha;
	private JLabel lblIsbnID;
=======
	private String diretorio = "../LivrariaDigital_teste/";
	private ImageIcon capa = new ImageIcon( diretorio + "imagem/capa.png" );
	private JPanel painel;
	private JSeparator linha;
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
	private JLabel lblPesquisa;
	private JLabel lblLogo;
	private JLabel lblCapa;
	private JLabel lblTitulo;
	private JLabel lblAutor;
	private JLabel lblSelecione;
	private JLabel lblEditora;
	private JLabel lblDtPub;
	private JLabel lblIsbn;
	private JLabel lblPaginas;
	private JLabel lblTipoCapa;
	private JLabel lblEsoque;
	private JLabel lblCategria;
	private JLabel lblCategorias;
	private JLabel lblSumario;
	private JLabel lblResumo;
	private JLabel lblPrecoCusto;
	private JLabel lblPrecoVenda;
	private JLabel lblMargem;
	private JTextField txtPesquisar;
<<<<<<< HEAD
=======
	private JTextField txtIsbnID;
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEstoque;
	private JTextField txtCategoria;
	private JTextField ftxtPaginas;
	private JTextField ftxtMargem;
	private JTextField ftxtIsbn;
	private JTextField ftxtPrecoCusto;
	private JTextField ftxtPrecoVenda;
	private JTextArea txtaSumario;
	private JTextArea txtaResumo;
	private JFormattedTextField ftxtDtPub;
	private JComboBox<String> cboAutor;
	private JComboBox<String> cboEditora;
	private JComboBox<String> cboTipoCapa;
	private JComboBox<String> cboCategoria;
	private JButton btnPesquisar;
	private JButton btnLimpar;
	private JButton btnExcluir;
	private JButton btnEditar;
	private JButton btnSalvar;
	private JButton btnVoltar;
	private JButton btnImagem;
	private MaskFormatter maskData;
	
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmLivro frame = new FrmLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public FrmLivro() throws ParseException {
		
		setTitle("Cadastro de Livro");
		setResizable(false);
		setSize( 1024, 710 );
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		painel = new JPanel();
		setContentPane( painel );
		painel.setLayout(null);
		
		lblLogo = new JLabel("LIVRARIA DIGITAL");
		lblLogo.setForeground(Color.GRAY);
		lblLogo.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
		lblLogo.setBounds(36, 36, 314, 45);
		painel.add(lblLogo);
		
		linha = new JSeparator();
		linha.setBounds(6, 93, 1012, 12);
		painel.add(linha);
			
		lblPesquisa = new JLabel("Pesquisa");
		lblPesquisa.setBounds(571, 42, 66, 16);
		painel.add(lblPesquisa);
		
		txtPesquisar = new JTextField(20);
		txtPesquisar.setToolTipText("Digite aqui o termo que deseja pesquisar…");
		txtPesquisar.setBounds(636, 36, 254, 28);
		painel.add(txtPesquisar);
		
		btnPesquisar = new JButton("Ir");
		btnPesquisar.setBounds(902, 37, 75, 29);
		painel.add(btnPesquisar);
		
		lblCapa = new JLabel();
		lblCapa.setName( "lblCapa" );
		lblCapa.setToolTipText("Capa");
		lblCapa.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapa.setBorder(new LineBorder(Color.GRAY));
		lblCapa.setBounds(36, 140, 287, 394);
<<<<<<< HEAD
=======
		lblCapa.setIcon(new ImageIcon(capa.getImage().getScaledInstance(lblCapa.getWidth(), 
		lblCapa.getHeight(), Image.SCALE_DEFAULT)));
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
		painel.add(lblCapa);
		
		txtTitulo = new JTextField(20);
		txtTitulo.setBounds(431, 140, 546, 28);
		painel.add(txtTitulo);
		
		lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(347, 146, 83, 16);
		painel.add(lblTitulo);
		
		lblAutor = new JLabel("Autor(es)");
		lblAutor.setBounds(347, 186, 83, 16);
		painel.add(lblAutor);
		
		txtAutor = new JTextField(20);
		txtAutor.setEditable(true);
		txtAutor.setBounds(431, 180, 219, 28);
		painel.add(txtAutor);
		
		cboAutor = new JComboBox<String>();
		cboAutor.setBounds(758, 181, 219, 27);
		painel.add(cboAutor);
		
		lblSelecione = new JLabel("Selecione");
		lblSelecione.setBounds(693, 186, 66, 16);
		painel.add(lblSelecione);
		
		lblEditora = new JLabel("Editora");
		lblEditora.setBounds(347, 226, 83, 16);
		painel.add(lblEditora);
		
		cboEditora = new JComboBox<String>();
		cboEditora.setBounds(431, 221, 219, 27);
		painel.add(cboEditora);	
		
		lblDtPub = new JLabel("Data de Publicação");
		lblDtPub.setBounds(693, 226, 119, 16);
		painel.add(lblDtPub);
		
		maskData = new MaskFormatter("##/##/####");
		ftxtDtPub = new JFormattedTextField(maskData);
		ftxtDtPub.setHorizontalAlignment(SwingConstants.CENTER);
		ftxtDtPub.setBounds(823, 220, 154, 28);
		ftxtDtPub.setEnabled(true);
		ftxtDtPub.setEditable(true);
		ftxtDtPub.setColumns(10);
		painel.add(ftxtDtPub);	
		
		lblIsbn = new JLabel("ISBN");
		lblIsbn.setBounds(347, 263, 83, 16);
		painel.add(lblIsbn);
		
<<<<<<< HEAD
		lblIsbnID = new JLabel();
		lblIsbnID.setVisible(false);
		lblIsbnID.setEnabled(false);
		lblIsbnID.setBounds(836, 117, 141, 16);
		painel.add(lblIsbnID);
=======
		txtIsbnID = new JTextField(20);
		txtIsbnID.setEditable(false);
		txtIsbnID.setVisible(false);
		txtIsbnID.setEnabled(false);
		txtIsbnID.setBounds(836, 117, 141, 16);
		painel.add(txtIsbnID);
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
		
		ftxtIsbn = new JTextField(20);
		ftxtIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		ftxtIsbn.setBounds(431, 257, 219, 28);
		painel.add(ftxtIsbn);
		
		lblPaginas = new JLabel("Páginas");
		lblPaginas.setBounds(693, 263, 66, 16);
		painel.add(lblPaginas);
		
		ftxtPaginas = new JTextField(20);
		ftxtPaginas.setHorizontalAlignment(SwingConstants.CENTER);
		ftxtPaginas.setBounds(823, 257, 154, 28);
		painel.add(ftxtPaginas);
		
		lblTipoCapa = new JLabel("Capa");
		lblTipoCapa.setBounds(347, 303, 83, 16);
		painel.add(lblTipoCapa);
		
		cboTipoCapa = new JComboBox<String>();
		cboTipoCapa.setBounds(431, 298, 219, 27);
		painel.add(cboTipoCapa);
		
		lblEsoque = new JLabel("Estoque");
		lblEsoque.setBounds(693, 303, 66, 16);
		painel.add(lblEsoque);
		
		txtEstoque = new JTextField(20);
<<<<<<< HEAD
		txtEstoque.setEditable(false);
=======
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
		txtEstoque.setBounds(823, 297, 154, 28);
		painel.add(txtEstoque);
		
		lblCategria = new JLabel("Categoria(s)");
		lblCategria.setBounds(347, 342, 83, 16);
		painel.add(lblCategria);
		
		txtCategoria = new JTextField(20);
		txtCategoria.setEditable(true);
		txtCategoria.setBounds(431, 336, 219, 28);
		painel.add(txtCategoria);
		
		lblCategorias = new JLabel("Selecione");
		lblCategorias.setBounds(693, 342, 66, 16);
		painel.add(lblCategorias);
		
		cboCategoria = new JComboBox<String>();
		cboCategoria.setBounds(758, 337, 219, 27);
		painel.add(cboCategoria);
		
		lblSumario = new JLabel("Sumário");
		lblSumario.setBounds(347, 395, 83, 16);		
		painel.add(lblSumario);
		
<<<<<<< HEAD
		txtaSumario = new JTextArea();
=======
		txtaSumario = new JTextArea(1, 1);
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
//		txtaSumario .setFont(new Font("Serif", Font.ITALIC, 16));
		txtaSumario .setLineWrap(true);
		txtaSumario .setWrapStyleWord(true);
		txtaSumario.setBounds(431, 389, 546, 66);
		painel.add(txtaSumario);
<<<<<<< HEAD
	          
=======
		
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
		lblResumo = new JLabel("Resumo");
		lblResumo.setBounds(347, 481, 83, 16);
		painel.add(lblResumo);
		
<<<<<<< HEAD
		txtaResumo = new JTextArea(10, 20);
=======
		txtaResumo = new JTextArea(1, 1);
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
//		txtaResumo.setFont(new Font("Serif", Font.ITALIC, 16));
		txtaResumo.setLineWrap(true);
		txtaResumo.setWrapStyleWord(true);
		txtaResumo.setBounds(431, 475, 546, 66);
		painel.add(txtaResumo);
		
		lblPrecoCusto = new JLabel("Preço de Custo");
		lblPrecoCusto.setBounds(40, 566, 118, 16);
		painel.add(lblPrecoCusto);	
		
		ftxtPrecoCusto = new JTextField(20);
		ftxtPrecoCusto.setHorizontalAlignment(SwingConstants.RIGHT);
		ftxtPrecoCusto.setEnabled(true);
		ftxtPrecoCusto.setEditable(true);
		ftxtPrecoCusto.setBounds(170, 560, 154, 28);
		ftxtPrecoCusto.setColumns(10);
		painel.add(ftxtPrecoCusto);
		
		lblPrecoVenda = new JLabel("Preço de Venda");
		lblPrecoVenda.setBounds(40, 605, 118, 16);
		painel.add(lblPrecoVenda);
		
		ftxtPrecoVenda = new JTextField(20);
		ftxtPrecoVenda.setHorizontalAlignment(SwingConstants.RIGHT);
		ftxtPrecoVenda.setEnabled(true);
		ftxtPrecoVenda.setEditable(true);
		ftxtPrecoVenda.setBounds(170, 599, 154, 28);
		ftxtPrecoVenda.setColumns(10);
		painel.add(ftxtPrecoVenda);
		
		lblMargem = new JLabel("Margem de Lucro");
		lblMargem.setBounds(40, 641, 118, 16);
		painel.add(lblMargem);
		
		ftxtMargem = new JTextField(20);
		ftxtMargem.setHorizontalAlignment(SwingConstants.CENTER);
		ftxtMargem.setEditable(false);
		ftxtMargem.setBounds(170, 635, 154, 28);
		painel.add(ftxtMargem);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(860, 553, 117, 29);
		painel.add(btnLimpar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(431, 634, 117, 29);
		painel.add(btnExcluir);
		
		btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		btnEditar.setBounds(560, 634, 117, 29);
		painel.add(btnEditar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(684, 634, 117, 29);
		painel.add(btnSalvar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(860, 634, 117, 29);
		painel.add(btnVoltar);
		
		
		LivroController livroCtrl = new LivroController( 
				this, 
				painel, 
				lblCapa, 
<<<<<<< HEAD
				lblIsbnID, 
=======
				txtIsbnID, 
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
				txtPesquisar,
				txtTitulo,
				txtAutor, 
				txtEstoque,
				txtCategoria, 
				ftxtDtPub, 
				ftxtPaginas,
				ftxtMargem, 
				ftxtIsbn,
				ftxtPrecoCusto, 
				ftxtPrecoVenda, 
				txtaSumario, 
				txtaResumo, 
				cboAutor, 
				cboEditora, 
				cboTipoCapa, 
				cboCategoria, 
<<<<<<< HEAD
				btnLimpar, 
=======
				btnImagem, 
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
				btnEditar, 
				btnExcluir, 
				btnSalvar, 
				btnVoltar );
		
		btnImagem = new JButton("Carregar Imagem");
		btnImagem.setBounds(104, 105, 141, 29);
		painel.add(btnImagem);
		
		
		txtPesquisar.addActionListener(livroCtrl.pesquisar);
		btnPesquisar.addActionListener(livroCtrl.pesquisar);
		txtPesquisar.addKeyListener(livroCtrl.tecla);
<<<<<<< HEAD
		txtaSumario.addKeyListener(livroCtrl.tecla);
=======
>>>>>>> fefdd4755b80c9939d18a5f6859cf81bd1270535
		cboAutor.addActionListener(livroCtrl.preencher);
		cboCategoria.addActionListener(livroCtrl.preencher);
		ftxtPrecoCusto.addKeyListener(livroCtrl.tecla);
		ftxtPrecoVenda.addKeyListener(livroCtrl.tecla);
		btnImagem.addActionListener(livroCtrl.carrgarImagem);
		btnLimpar.addActionListener(livroCtrl.limpar);
		btnExcluir.addActionListener(livroCtrl.excluir);
		btnEditar.addActionListener(livroCtrl.editar);
		btnSalvar.addActionListener(livroCtrl.salvar);
		btnVoltar.addActionListener(livroCtrl.janelas);
	}
}
