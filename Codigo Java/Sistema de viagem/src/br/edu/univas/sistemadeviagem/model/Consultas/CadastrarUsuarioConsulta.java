package br.edu.univas.sistemadeviagem.model.Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.univas.sistemadeviagem.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarUsuarioTO;
import br.edu.univas.sistemadeviagem.model.Util.DBUtil;

public class CadastrarUsuarioConsulta {
	
	public CadastrarUsuarioTO selectCadastrarUsuario(int codigo) throws CadastrarUsuarioExeption{
		
		String sentenca = "SELECT COD_USUARIO, NOME, CPF, SENHA "
						+ " FROM CADASTRO_USUARIO"
						+ " WHERE COD_USUARIO = ?";
		
		
		Connection conn = null;
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sentenca);
			prep.setInt(1, codigo);
			
			ResultSet rs = prep.executeQuery();
			if(rs.next()){
				
				int codUsuario = rs.getInt(1);
				String nome = rs.getString(2);
				String cpf = rs.getString(3);
				String senha = rs.getString(4);
				
				CadastrarUsuarioTO to = new CadastrarUsuarioTO(codUsuario, nome, cpf, senha);
				return to;
				
			}
			
		} catch (Exception e) {
			throw new CadastrarUsuarioExeption("Erro ao consultar cadastro usuario \n"+ e);
		}finally {
			DBUtil.closeConnection(conn);
		}
		return null;
	}

}
