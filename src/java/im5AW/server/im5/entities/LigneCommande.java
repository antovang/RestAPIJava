/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package im5AW.server.im5.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vangriea
 */
@Entity
@Table(name = "ligne_commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneCommande.findAll", query = "SELECT l FROM LigneCommande l"),
    @NamedQuery(name = "LigneCommande.findByQuantite", query = "SELECT l FROM LigneCommande l WHERE l.quantite = :quantite"),
    @NamedQuery(name = "LigneCommande.findByPrix", query = "SELECT l FROM LigneCommande l WHERE l.prix = :prix"),
    @NamedQuery(name = "LigneCommande.findByCommandeId", query = "SELECT l FROM LigneCommande l WHERE l.ligneCommandePK.commandeId = :commandeId"),
    @NamedQuery(name = "LigneCommande.findByProduitId", query = "SELECT l FROM LigneCommande l WHERE l.ligneCommandePK.produitId = :produitId")})
public class LigneCommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LigneCommandePK ligneCommandePK;
    @Basic(optional = false)
    @Column(name = "quantite")
    private int quantite;
    @Basic(optional = false)
    @Column(name = "prix")
    private double prix;
    @JoinColumn(name = "commande_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Commande commande;
    @JoinColumn(name = "produit_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produit produit;

    public LigneCommande() {
    }

    public LigneCommande(LigneCommandePK ligneCommandePK) {
        this.ligneCommandePK = ligneCommandePK;
    }

    public LigneCommande(LigneCommandePK ligneCommandePK, int quantite, double prix) {
        this.ligneCommandePK = ligneCommandePK;
        this.quantite = quantite;
        this.prix = prix;
    }

    public LigneCommande(int commandeId, int produitId) {
        this.ligneCommandePK = new LigneCommandePK(commandeId, produitId);
    }

    public LigneCommandePK getLigneCommandePK() {
        return ligneCommandePK;
    }

    public void setLigneCommandePK(LigneCommandePK ligneCommandePK) {
        this.ligneCommandePK = ligneCommandePK;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ligneCommandePK != null ? ligneCommandePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneCommande)) {
            return false;
        }
        LigneCommande other = (LigneCommande) object;
        if ((this.ligneCommandePK == null && other.ligneCommandePK != null) || (this.ligneCommandePK != null && !this.ligneCommandePK.equals(other.ligneCommandePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "im5AW.server.im5.LigneCommande[ ligneCommandePK=" + ligneCommandePK + " ]";
    }
    
}
