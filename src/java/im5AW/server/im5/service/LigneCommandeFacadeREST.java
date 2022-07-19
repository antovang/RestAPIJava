/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package im5AW.server.im5.service;

import im5AW.server.im5.entities.LigneCommande;
import im5AW.server.im5.entities.LigneCommandePK;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author vangriea
 */
@javax.ejb.Stateless
@Path("im5aw.server.im5.lignecommande")
public class LigneCommandeFacadeREST extends AbstractFacade<LigneCommande> {

    @PersistenceContext(unitName = "im5RestPU")
    private EntityManager em = Persistence.createEntityManagerFactory("im5RestPU").createEntityManager();

    private LigneCommandePK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;commandeId=commandeIdValue;produitId=produitIdValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        im5AW.server.im5.entities.LigneCommandePK key = new im5AW.server.im5.entities.LigneCommandePK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> commandeId = map.get("commandeId");
        if (commandeId != null && !commandeId.isEmpty()) {
            key.setCommandeId(new java.lang.Integer(commandeId.get(0)));
        }
        java.util.List<String> produitId = map.get("produitId");
        if (produitId != null && !produitId.isEmpty()) {
            key.setProduitId(new java.lang.Integer(produitId.get(0)));
        }
        return key;
    }

    public LigneCommandeFacadeREST() {
        super(LigneCommande.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public LigneCommande create(LigneCommande entity) {
        return (super.create(entity));
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public LigneCommande edit(@PathParam("id") PathSegment id, LigneCommande entity) {
        return (super.edit(entity));
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        im5AW.server.im5.entities.LigneCommandePK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public LigneCommande find(@PathParam("id") PathSegment id) {
        im5AW.server.im5.entities.LigneCommandePK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<LigneCommande> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<LigneCommande> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
