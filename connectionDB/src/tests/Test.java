package tests;

import java.sql.SQLException;
import java.util.List;

import model.Usuario;
import repository.UsuarioDAO;

public class Test {

	public static void main(String[] args) throws SQLException {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario lucas = new Usuario();
		Usuario ken = new Usuario();

		lucas.setId(1L);
		lucas.setNome("Lucas");
		lucas.setEmail("lucas@gmail.com.br");
		lucas.setTelefone(123456);

		ken.setId(2L);
		ken.setNome("Ken");
		ken.setEmail("ken@gmail.com.br");
		ken.setTelefone(101112);

		dao.insert(ken);
		dao.insert(lucas);
		
		List<Usuario> lista = dao.select();
		
		for(Usuario usuario: lista) {
			System.out.println(usuario.getId());
			System.out.println(usuario.getNome());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getDataRegistro());
			
			
		}

	}

}
