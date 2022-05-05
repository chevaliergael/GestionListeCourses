package fr.perso.courses.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant une liste de course
 * 
 * @author adm
 *
 */
public class ListeCourse {
	private int id;
	private String nom;
	private List<Article> listeArticles;

	public ListeCourse() {
		this.listeArticles = new ArrayList<Article>();
	}

	/**
	 * @param id
	 * @param nom
	 * @param listeArticles
	 */
	public ListeCourse(int id, String nom, List<Article> listeArticles) {
		super();
		this.id = id;
		this.nom = nom;
		this.listeArticles = listeArticles;
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

	public List<Article> getListeArticles() {
		return listeArticles;
	}

	public void setListeArticles(List<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListeCourse [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", listeArticles=");
		builder.append(listeArticles);
		builder.append("]");
		return builder.toString();
	}

}
