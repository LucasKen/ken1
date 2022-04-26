package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connectionFactory.ConnectionFactory;
import model.Usuario;

public class UsuarioDAO {

	private Connection conexao;

	public UsuarioDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}

	public void insert(Usuario usuario) throws SQLException {
		String sql = "insert into usuarios(id, nome, email, telefone, data) values (?, ?, ?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);

		stmt.setLong(1, usuario.getId());
		stmt.setString(2, usuario.getNome());
		stmt.setString(3, usuario.getEmail());
		stmt.setInt(4, usuario.getTelefone());
		stmt.setDate(5, usuario.getDataRegistro());

		stmt.execute();
		stmt.close();
	}

	public List<Usuario> select() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "select * from usuarios order by nome";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setId(rs.getLong("id"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setTelefone(rs.getInt("telefone"));
			usuario.setDataRegistro(rs.getDate("data"));

			usuarios.add(usuario);

		}

		rs.close();
		stmt.close();

		return usuarios;

	}

}
