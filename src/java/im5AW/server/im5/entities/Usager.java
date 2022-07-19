/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package im5AW.server.im5.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vangriea
 */
@Entity
@Table(name = "usager")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usager.findAll", query = "SELECT u FROM Usager u"),
    @NamedQuery(name = "Usager.findById", query = "SELECT u FROM Usager u WHERE u.id = :id"),
    @NamedQuery(name = "Usager.findByEmail", query = "SELECT u FROM Usager u WHERE u.email = :email"),
    @NamedQuery(name = "Usager.findByPassword", query = "SELECT u FROM Usager u WHERE u.password = :password"),
    @NamedQuery(name = "Usager.findByNom", query = "SELECT u FROM Usager u WHERE u.nom = :nom"),
    @NamedQuery(name = "Usager.findByPrenom", query = "SELECT u FROM Usager u WHERE u.prenom = :prenom")})
public class Usager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "roles")
    private String roles;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Column(name = "prenom")
    private String prenom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usagerId")
    private Collection<Commande> commandeCollection;

    public Usager() {
    }

    public Usager(Integer id) {
        this.id = id;
    }

    public Usager(Integer id, String email, String roles, String password, String nom, String prenom) {
        this.id = id;
        this.email = email;
        this.roles = roles;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usager)) {
            return false;
        }
        Usager other = (Usager) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "im5AW.server.im5.Usager[ id=" + id + " ]";
    }
    
}
