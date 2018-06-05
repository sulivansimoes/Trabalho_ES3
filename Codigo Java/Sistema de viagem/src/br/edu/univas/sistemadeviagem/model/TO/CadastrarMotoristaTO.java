package br.edu.univas.sistemadeviagem.model.TO;

public class CadastrarMotoristaTO {

	int codMotorista;
	String nome;
	String cpf;
	String rg;
	String cnh;
	String telefone;
	String endereco;
	
	public CadastrarMotoristaTO(){
		
	}
	
	public CadastrarMotoristaTO(int codMotorista, String nome, String cpf, String rg, String cnh, String telefone, String endereco){
		this.codMotorista = codMotorista;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cnh = cnh;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getCodMotorista() {
		return codMotorista;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getRg() {
		return rg;
	}

	public String getCnh() {
		return cnh;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setCodMotorista(int codMotorista) {
		this.codMotorista = codMotorista;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

}
