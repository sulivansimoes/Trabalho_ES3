package br.edu.univas.sistemadeviagem.model.Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.univas.sistemadeviagem.model.Exception.CadastrarMotoristaException;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarMotoristaTO;
import br.edu.univas.sistemadeviagem.model.Util.DBUtil;

public class CadastrarMotoristaConsulta {
	
	public  CadastrarMotoristaTO selectCadastrarMotorista(int codigo) throws CadastrarMotoristaException{
	
	String sentenca = "SELECT COD_MOTORISTA, NOME, CPF, RG, CNH, TELEFONE, ENDERECO "
					+ " FROM CADASTRO_MOTORISTA"
					+ " WHERE COD_MOTORISTA = ?";
		
	
	Connection conn = null;
	try{
		
		conn = DBUtil.openConnection();
		PreparedStatement prep = conn.prepareStatement(sentenca);
		prep.setInt(1, codigo);
		
		ResultSet rs = prep.executeQuery();
		while(rs.next()){
			
			int codMotorista = rs.getInt(1);
			String nome = rs.getString(2);
			String cpf = rs.getString(3);
			String rg = rs.getString(4);
			String cnh = rs.getString(5);
			String telefone = rs.getString(6);
			String endereco = rs.getString(7);
						
			CadastrarMotoristaTO to = new CadastrarMotoristaTO(codMotorista, nome, cpf, rg, cnh, telefone, endereco);
			return to;
			
		}	
	}catch (Exception e) {
		throw new CadastrarMotoristaException("Erro ao consultar cadastro motorista \n" + e);
	}finally {
		DBUtil.closeConnection(conn);
	}
	return null;		
	}

}
