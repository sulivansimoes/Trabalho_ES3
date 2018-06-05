package br.edu.univas.sistemadeviagem.model.Consultas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;

import br.edu.univas.sistemadeviagem.model.Exception.AgendarViagemException;
import br.edu.univas.sistemadeviagem.model.TO.AgendarViagemTO;
import br.edu.univas.sistemadeviagem.model.Util.DBUtil;

public class AgendarViagemConsulta{
	
	public  ArrayList<AgendarViagemTO> selectAgendarViagem(Date dateSaida) throws AgendarViagemException{
	
	String sentenca = "SELECT COD_VIAGEM, ENDERECO, QUANT_PASSAGEIRO, DATA_SAIDA, "
					+ " DATA_RETORNO, HORA_SAIDA, HORA_RETORNO, STATUS_VIAGEM, VALOR_VIAGEM"
					+ " FROM AGENDAMENTO_VIAGEM"
					+ " WHERE DATA_SAIDA = ?";
	
	ArrayList<AgendarViagemTO> lista = new ArrayList<AgendarViagemTO>();
	
	Connection conn = null;
	try{
		
		conn = DBUtil.openConnection();
		PreparedStatement prep = conn.prepareStatement(sentenca);
		prep.setDate(1, dateSaida);
		
		ResultSet rs = prep.executeQuery();
		while(rs.next()){ // ENQUANTO TIVER DADOS DENTRO DE RS 
			
			int codViagem = rs.getInt(1);
			String endereco = rs.getString(2);
			int quantPassageiro = rs.getInt(3);
			Date dataSaida = rs.getDate(4);
			Date dataRetormo = rs.getDate(5);
			Time horaSaida = rs.getTime(6);
			Time horaRetorno = rs.getTime(7);
			int statusViagem = rs.getInt(8);
			float valorViagem = rs.getFloat(9);
			
			AgendarViagemTO to = new AgendarViagemTO(codViagem, endereco, quantPassageiro, dataSaida, dataRetormo, horaSaida, 
												horaRetorno, statusViagem, valorViagem);
			return to;
			
		}
	}catch (Exception e) {
		throw new AgendarViagemException("Erro ao consultar agendar viagem \n");
	}finally {
		DBUtil.closeConnection(conn);
	}
		return null;		
	}
}
