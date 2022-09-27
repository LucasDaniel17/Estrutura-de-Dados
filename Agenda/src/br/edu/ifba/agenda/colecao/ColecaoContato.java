package br.edu.ifba.agenda.colecao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.agenda.basicas.Categoria;
import br.edu.ifba.agenda.basicas.Contato;

public class ColecaoContato {
	
	public void adicionarContato(Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("insert into contato (nome, email, fone, celular, id_categoria) values (?, ?, ?, ?, ?)");
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getFone());
			stmt.setString(4, c.getCelular());
			stmt.setInt(5, c.getCategoria().getId());;
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update (Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("update contato set nome = ? where id = ?");
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletar (Contato c) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("delete from contato where id = ?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Contato> listarContato () {
		
		ColecaoCategoria cc = new ColecaoCategoria();
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from contato");			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setFone(rs.getString("fone"));
				c.setCelular(rs.getString("celular"));
				c.setCategoria(cc.procurarCategoriaId(rs.getInt("id_categoria")));
				contatos.add(c);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return contatos;
	}
	
	public Contato procurarContatoId(int id) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from contato where id = ?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Contato procurarContatoNome(String nome) {
		try {
			PreparedStatement stmt = Conexao.getConnection().prepareStatement("select * from contato where nome = ?");
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				Contato c = new Contato();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				return c;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
