package br.edu.univas.sistemadeviagem.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.univas.sistemadeviagem.model.Exception.CadastrarUsuarioExeption;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarUsuarioTO;
import br.edu.univas.sistemadeviagem.model.Util.DBUtil;

public class CadastrarUsuarioDAO {
	
public void insertNewCadastrarUsuario(CadastrarUsuarioTO to) throws CadastrarUsuarioExeption{
	
	String sentenca = "INSERT INTO CADASTRO_USUARIO"
						+ "( COD_USUARIO, NOME, CPF, SENHA)"
						+ " VALUES (?,?,?,?)";		
		
		Connection conn = null;
		try{			
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
						
			prepStat.setInt(1, to.getCodUsuario());
			prepStat.setString(2, to.getNome());
			prepStat.setString(3, to.getCpf());
			prepStat.setString(4, to.getSenha());
					
			prepStat.execute();
		}catch (Exception e){			
			throw new CadastrarUsuarioExeption("Erro ao incluir cadastro de usuario" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void deleteCadastrarUsuario(int codigo) throws CadastrarUsuarioExeption{
		
		String sql = "DELETE FROM CADASTRO_USUARIO WHERE COD_USUARIO = ?";
		
		Connection conn = null;		
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sql);
			
			prep.setInt(1, codigo);
			
			prep.execute();
		}catch (SQLException e) {
			throw new CadastrarUsuarioExeption("Erro excluindo  Cadastrar usuario " + codigo);
		} finally {
			DBUtil.closeConnection(conn);
		}
	}
	
	public void updateCadastrarUsuario(CadastrarUsuarioTO to) throws CadastrarUsuarioExeption{
		
		String sentenca = "UPDATE CADASTRO_USUARIO SET NOME = ?, CPF = ?, SENHA = ?"
						+ " WHERE COD_USUARIO = ?";
		
		Connection conn = null;
		try{
			conn = DBUtil.openConnection();
			PreparedStatement prepStat = conn.prepareStatement(sentenca);
			
			prepStat.setString(1, to.getNome());
			prepStat.setString(2, to.getCpf());
			prepStat.setString(3, to.getSenha());
			prepStat.setInt(4, to.getCodUsuario());
			
			prepStat.execute();
		}catch (Exception e) {
			throw new CadastrarUsuarioExeption("Erro ao atualizar cadastrar USUARIO" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
	}


}
