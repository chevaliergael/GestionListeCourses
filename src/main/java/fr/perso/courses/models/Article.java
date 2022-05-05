package fr.perso.courses.models;

/**
 * Classe représentant un article
 * 
 * @author adm
 *
 */
public class Article {
	private int id;
	private String nom;

	/**
	 * constructeur vide
	 */
	public Article() {
	}

	/**
	 * Constructeur avec paramètres
	 * 
	 * @param id
	 * @param nom
	 */
	public Article(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Article [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append("]");
		return builder.toString();
	}

}
