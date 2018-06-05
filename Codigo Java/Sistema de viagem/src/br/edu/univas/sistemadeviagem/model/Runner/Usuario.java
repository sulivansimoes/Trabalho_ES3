package br.edu.univas.sistemadeviagem.model.Runner;

import br.edu.univas.sistemadeviagem.model.Consultas.CadastrarUsuarioConsulta;
import br.edu.univas.sistemadeviagem.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarUsuarioTO;

public class Usuario {

	public static void main(String[] args) throws CadastrarUsuarioExeption {
		
//		CadastrarUsuarioDAO usuarioDAO = new CadastrarUsuarioDAO();
//		CadastrarUsuarioTO to = new CadastrarUsuarioTO(107, "Thiago", 1234, "12345");
//		try {
//			usuarioDAO.insertNewCadastrarUsuario(to);
//		} catch (CadastrarUsuarioExeption e) {
//			System.out.println("Erro ao salvar cadastro de usuario");
//			e.printStackTrace();
//		}
//		System.out.println("Sucesso ao salvar cadastro de usuario");
//	}

//	CadastrarUsuarioDAO usuarioDAO = new CadastrarUsuarioDAO();
//	CadastrarUsuarioTO to = new CadastrarUsuarioTO(105, "BEATRIZ", 123, "1234567");
//	try {
//		usuarioDAO.deleteCadastrarUsuario(105);
//	} catch (CadastrarUsuarioExeption e) {
//		System.out.println("Erro ao deletar cadastro de usuario");
//		e.printStackTrace();
//	}
//	System.out.println("Sucesso ao deletar cadastro de usuario");
//	}
	
//	CadastrarUsuarioDAO usuarioDAO = new CadastrarUsuarioDAO();
//	CadastrarUsuarioTO to = new CadastrarUsuarioTO(105, "BEATRIZ", 123, "1234567");
//	try {
//		usuarioDAO.updateCadastrarUsuario(to);
//	}catch (CadastrarUsuarioExeption e) {
//		System.out.println("Erro ATUALIZANDO cadastro USUARIO");
//		e.printStackTrace();
//	}
//		System.out.println("Sucesso ATUALIZANDO cadastro USUARIO");
//	}
		
	CadastrarUsuarioConsulta usuarioConsulta = new CadastrarUsuarioConsulta();
	CadastrarUsuarioTO resultConsulta = new CadastrarUsuarioTO();
	resultConsulta = usuarioConsulta.selectCadastrarUsuario(107);
	
	System.out.println(resultConsulta.getNome());

	}
}
