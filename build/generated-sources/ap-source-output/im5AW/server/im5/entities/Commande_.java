package im5AW.server.im5.entities;

import im5AW.server.im5.entities.LigneCommande;
import im5AW.server.im5.entities.Usager;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-07-19T07:50:10")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile CollectionAttribute<Commande, LigneCommande> ligneCommandeCollection;
    public static volatile SingularAttribute<Commande, Integer> id;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile SingularAttribute<Commande, Usager> usagerId;
    public static volatile SingularAttribute<Commande, String> statut;

}