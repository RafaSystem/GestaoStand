package model;

public class ClienteOnline {
		private int		ID;
		private String	nome,
						email,
						morada,
						localidade,
						codigoPostal,
						contacto,
						cc,
						cc2,
						cc3;
		private String	password;
		
		public ClienteOnline(int iD, String nome, String email, String morada, String localidade, String codigoPostal,
				String contacto, String cc, String cc2, String cc3, String password) {
			super();
			ID = iD;
			this.nome = nome;
			this.email = email;
			this.morada = morada;
			this.localidade = localidade;
			this.codigoPostal = codigoPostal;
			this.contacto = contacto;
			this.cc = cc;
			this.cc2 = cc2;
			this.cc3 = cc3;
			this.password = password;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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
		public String getCc() {
			return cc;
		}
		public void setCc(String cc) {
			this.cc = cc;
		}
		public String getCc2() {
			return cc2;
		}
		public void setCc2(String cc2) {
			this.cc2 = cc2;
		}
		public String getCc3() {
			return cc3;
		}
		public void setCc3(String cc3) {
			this.cc3 = cc3;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
