package im5AW.server.im5.entities;

import im5AW.server.im5.entities.Categorie;
import im5AW.server.im5.entities.LigneCommande;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-19T07:50:10")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile CollectionAttribute<Produit, LigneCommande> ligneCommandeCollection;
    public static volatile SingularAttribute<Produit, String> visuel;
    public static volatile SingularAttribute<Produit, BigDecimal> prix;
    public static volatile SingularAttribute<Produit, String> libelle;
    public static volatile SingularAttribute<Produit, String> texte;
    public static volatile SingularAttribute<Produit, Integer> id;
    public static volatile SingularAttribute<Produit, Categorie> categoryId;

}