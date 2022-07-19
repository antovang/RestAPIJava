/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package im5AW.server.im5.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author vangriea
 */
@Embeddable
public class LigneCommandePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "commande_id")
    private int commandeId;
    @Basic(optional = false)
    @Column(name = "produit_id")
    private int produitId;

    public LigneCommandePK() {
    }

    public LigneCommandePK(int commandeId, int produitId) {
        this.commandeId = commandeId;
        this.produitId = produitId;
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) commandeId;
        hash += (int) produitId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LigneCommandePK)) {
            return false;
        }
        LigneCommandePK other = (LigneCommandePK) object;
        if (this.commandeId != other.commandeId) {
            return false;
        }
        if (this.produitId != other.produitId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "im5AW.server.im5.LigneCommandePK[ commandeId=" + commandeId + ", produitId=" + produitId + " ]";
    }
    
}
