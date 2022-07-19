package im5AW.server.im5.entities;

import im5AW.server.im5.entities.Produit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-19T07:50:10")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile CollectionAttribute<Categorie, Produit> produitCollection;
    public static volatile SingularAttribute<Categorie, String> visuel;
    public static volatile SingularAttribute<Categorie, String> libelle;
    public static volatile SingularAttribute<Categorie, String> texte;
    public static volatile SingularAttribute<Categorie, Integer> id;

}