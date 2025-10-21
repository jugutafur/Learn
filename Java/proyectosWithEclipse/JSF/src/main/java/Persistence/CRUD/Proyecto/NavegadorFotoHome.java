/*
package Persistence.CRUD.Proyecto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import Web.Entity.Pojo.Portfolio.NavegadorFoto;

/**
 * Home object for domain model class NavegadorFoto.
 * @see .NavegadorFoto
 * @author Hibernate Tools
 *//*
@Stateless
public class NavegadorFotoHome {

	private static final Log log = LogFactory.getLog(NavegadorFotoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(NavegadorFoto transientInstance) {
		log.debug("persisting NavegadorFoto instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(NavegadorFoto persistentInstance) {
		log.debug("removing NavegadorFoto instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public NavegadorFoto merge(NavegadorFoto detachedInstance) {
		log.debug("merging NavegadorFoto instance");
		try {
			NavegadorFoto result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public NavegadorFoto findById(int id) {
		log.debug("getting NavegadorFoto instance with id: " + id);
		try {
			NavegadorFoto instance = entityManager.find(NavegadorFoto.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}*/
