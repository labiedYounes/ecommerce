package project.data;

import java.lang.reflect.Method;

public class produit {
 private String nom ,img,discription ;	
 private int qt,id;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQt() {
	return qt;
}
public void setQt(int qt) {
	this.qt = qt;
}
public static void  main(String[] Args) {
	Class<utilisateur> utClass=utilisateur.class;
	Method methods[]=utClass.getDeclaredMethods();
	for(int i=0;i<methods.length;i++){
		System.out.println(methods[i].getName());
	}
}

}
