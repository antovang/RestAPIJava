package im5AW.server.im5.entities;

import im5AW.server.im5.entities.Commande;
import im5AW.server.im5.entities.LigneCommandePK;
import im5AW.server.im5.entities.Produit;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-19T07:50:10")
@StaticMetamodel(LigneCommande.class)
public class LigneCommande_ { 

    public static volatile SingularAttribute<LigneCommande, Produit> produit;
    public static volatile SingularAttribute<LigneCommande, Double> prix;
    public static volatile SingularAttribute<LigneCommande, LigneCommandePK> ligneCommandePK;
    public static volatile SingularAttribute<LigneCommande, Commande> commande;
    public static volatile SingularAttribute<LigneCommande, Integer> quantite;

}