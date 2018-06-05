package br.edu.univas.sistemadeviagem.model.TO;

import java.sql.Date;
import java.sql.Time;

public class AgendarViagemTO {
	
	private int codViagem;
	private String endereco;
	private int quantPassageiro;
	private Date dataSaida;
	private Date dataRetorno;
	private Date horaSaida;
	private Date horaRetorno;
	private int statusViagem;
	private float valorViagem;
	
	public AgendarViagemTO(int codViagem, String endereco, int quantPassageiro, Date dataSaida,	Date dataRetorno, 
			Date horaSaida, Date horaRetorno, int statusViagem, float valorViagem){
		this.codViagem = codViagem;
		this.endereco = endereco;
		this.quantPassageiro = quantPassageiro;
		this.dataSaida = dataSaida;
		this.dataRetorno = dataRetorno;
		this.horaSaida = horaSaida;
		this.horaRetorno = horaRetorno;
		this.statusViagem = statusViagem;
		this.valorViagem = valorViagem;
		
	}

	public int getCodViagem() {
		return codViagem;
	}

	public void setCodViagem(int codViagem) {
		this.codViagem = codViagem;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQuantPassageiro() {
		return quantPassageiro;
	}

	public void setQuantPassageiro(int quantPassageiro) {
		this.quantPassageiro = quantPassageiro;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Date getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}

	public Date getHoraRetorno() {
		return horaRetorno;
	}

	public void setHoraRetorno(Date horaRetorno) {
		this.horaRetorno = horaRetorno;
	}

	public int getStatusViagem() {
		return statusViagem;
	}

	public void setStatusViagem(int statusViagem) {
		this.statusViagem = statusViagem;
	}

	public float getValorViagem() {
		return valorViagem;
	}

	public void setValorViagem(float valorViagem) {
		this.valorViagem = valorViagem;
	}
	
	
}
