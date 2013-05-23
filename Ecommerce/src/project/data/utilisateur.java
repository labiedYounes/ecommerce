package project.data;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

public class utilisateur {
	private String[] varTab = { "login", "pwd", "email", "type", "img", "nom",
			"prenom", "lieuNaissance", "dateNaissance", "adresse", "sexe",
			"tel" };
	private int id;
	private String login, pwd, email, type, img, nom, prenom, lieuNaissance,
			tel, dateNaissance, adresse, sexe;
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getSexe() {
		return sexe;
	}
	
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	
	public String getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "<tr><td>"
				+ login
				+ "</td><td>"
				+ email
				+ "</td><td><input type=\"button\" value=\"modifier\" onClick=alert("
				+ id + ")><td></tr>";
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public void setAll(HttpServletRequest request) {
	}
	private void setll(HttpServletRequest request) {
	}
	
	
}
