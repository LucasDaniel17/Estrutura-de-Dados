package br.edu.ifba.agenda.gui;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import br.edu.ifba.agenda.basicas.Categoria;
import br.edu.ifba.agenda.cadastros.CadastroCategoria;
import br.edu.ifba.agenda.colecao.ColecaoCategoria;
import br.edu.ifba.agenda.exception.CadastroCategoriaException;
import br.edu.ifba.agenda.tableModel.CategoriaTableModel;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JanelaCategoria extends JPanel {
	private JTextField txtCategoria;
	private JTable tabelaCategoria;
	CategoriaTableModel modelo = new CategoriaTableModel();
	CadastroCategoria c = new CadastroCategoria();
	
	public JanelaCategoria() {
		
		preencherTabelaCategoria();
		setLayout(null);
		setBounds(10, 11, 443, 392);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 423, 78);
		add(panel);
		panel.setLayout(null);
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/icons8-mais-2-matemática-30 (1).png")));
		btnSalvar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSalvar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Categoria cat = new Categoria();
				cat.setNome(txtCategoria.getText());
				try {
					c.adicionarCategoria(cat);
				} catch (CadastroCategoriaException e2) {
					return;
				}
								
			}
		});
		
		btnSalvar.setBounds(43, 11, 75, 56);
		panel.add(btnSalvar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtualizar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/icons8-atualizar-arquivo-30.png")));
		btnAtualizar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAtualizar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAtualizar.setBounds(128, 11, 87, 56);
		panel.add(btnAtualizar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/icons8-editar-arquivo-30.png")));
		btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEditar.setBounds(225, 12, 75, 54);
		panel.add(btnEditar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeletar.setIcon(new ImageIcon(getClass().getResource("../../../../../../Resources/icons8-res\u00EDduos-30.png")));
		btnDeletar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDeletar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDeletar.setBounds(310, 12, 75, 54);
		panel.add(btnDeletar);
		
		JLabel lblNomeCategoria = new JLabel("Nome Categoria:");
		lblNomeCategoria.setBounds(10, 109, 115, 14);
		add(lblNomeCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(10, 128, 211, 20);
		add(txtCategoria);
		txtCategoria.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 173, 423, 208);
		add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 403, 186);
		panel_1.add(scrollPane);
		
		if (this.tabelaCategoria == null) {
			this.tabelaCategoria = new JTable(this.modelo);
		}
		
		scrollPane.setViewportView(this.tabelaCategoria);
	}
	
	private void preencherTabelaCategoria() {
		List<Categoria> categorias = this.c.listarCategoria();
		
		for(Categoria temp: categorias) {
			modelo.addCategoria(temp);
		}
	}
	
}
