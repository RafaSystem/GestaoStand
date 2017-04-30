package model;

public class Stand {
	private int 	ID;
	private String  nome,
					morada,
					localidade,
					codigoPostal,
					contacto,
					contacto_alternativo;
	private boolean isDeleted;
	
	public Stand(int iD, String nome, String morada, String localidade, String codigoPostal, String contacto,
			String contacto_alternativo, boolean isDeleted) {
		super();
		ID = iD;
		this.nome = nome;
		this.morada = morada;
		this.localidade = localidade;
		this.codigoPostal = codigoPostal;
		this.contacto = contacto;
		this.contacto_alternativo = contacto_alternativo;
		this.isDeleted = isDeleted;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getContacto_alternativo() {
		return contacto_alternativo;
	}

	public void setContacto_alternativo(String contacto_alternativo) {
		this.contacto_alternativo = contacto_alternativo;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
