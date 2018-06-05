package br.edu.univas.sistemadeviagem.model.Runner;

import br.edu.univas.sistemadeviagem.model.Consultas.CadastrarMotoristaConsulta;
import br.edu.univas.sistemadeviagem.model.Exception.CadastrarMotoristaException;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarMotoristaTO;

public class Motorista {

	public static void main(String[] args) {
		
//		CadastrarMotoristaDAO usuarioDAO = new CadastrarMotoristaDAO();
//		CadastrarMotoristaTO to = new CadastrarMotoristaTO(12, "Rafaela", 1234, 12345, 123, 9999, "Rua");
//		try {
//			usuarioDAO.insertNewCadastrarMotorista(to);
//		} catch (CadastrarMotoristaException e) {
//			System.out.println("Erro ao salvar cadastro de usuario\n");
//			e.printStackTrace();
//		}
//		System.out.println("Sucesso ao salvar cadastro de usuario\n");
		
		CadastrarMotoristaConsulta motoristaConsulta = new CadastrarMotoristaConsulta();
		CadastrarMotoristaTO resultConsulta = new CadastrarMotoristaTO();
		try {
			resultConsulta = motoristaConsulta.selectCadastrarMotorista(12);
		} catch (CadastrarMotoristaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(resultConsulta.getNome());

	}

}
