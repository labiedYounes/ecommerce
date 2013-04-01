package project.data;

public class Categorie {
	private String nom,discription;
	private int id;
	public Categorie() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "<tr><td>"+ nom +"</td><td>"+discription+"</td></tr>";
				
	}
	
	

}
