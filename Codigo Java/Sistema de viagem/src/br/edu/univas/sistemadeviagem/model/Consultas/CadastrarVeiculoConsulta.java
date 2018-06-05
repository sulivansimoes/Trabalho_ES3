package br.edu.univas.sistemadeviagem.model.Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.edu.univas.sistemadeviagem.model.Exception.CadastrarVeiculoExeption;
import br.edu.univas.sistemadeviagem.model.TO.CadastrarVeiculoTO;
import br.edu.univas.sistemadeviagem.model.Util.DBUtil;

public class CadastrarVeiculoConsulta {
	
	public CadastrarVeiculoTO selectCadastrarVeiculo(int codigo) throws CadastrarVeiculoExeption{
		
		String sentenca = "SELECT COD_VEICULO, PLACA, MARCA, UF, ANO, TIPO_COMBUSTIVEL, QUANT_PASSAGEIRO "
						+ " FROM CADASTRO_VEICULO"
						+ " WHERE COD_VEICULO = ?";
		
		Connection conn = null;
		try {
			
			conn = DBUtil.openConnection();
			PreparedStatement prep = conn.prepareStatement(sentenca);
			prep.setInt(1, codigo);
			
			ResultSet rs = prep.executeQuery();
			while(rs.next()){
				
				int codVeiculo = rs.getInt(1);
				String placa = rs.getString(2);
				String marca = rs.getString(3);
				String uf = rs.getString(4);
				int ano = rs.getInt(5);
				int tipoCombustivel = rs.getInt(6);
				int quantPassageiro = rs.getInt(7);
				
				CadastrarVeiculoTO to = new CadastrarVeiculoTO(codVeiculo, placa, marca, uf, ano, 
					                                      tipoCombustivel, quantPassageiro);
				return to;
			}
			
		} catch (Exception e) {
			throw new CadastrarVeiculoExeption("Erro ao consultar cadastro usuario \n" + e);
		}finally {
			DBUtil.closeConnection(conn);
		}
		return null;
	}

}
