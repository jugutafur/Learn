/*
package Persistence.CRUD.Proyecto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import Persistence.MapperXML.Proyecto.Proyecto;

/**
 * Home object for domain model class Proyecto.
 * @see .Proyecto
 * @author Hibernate Tools
 *//*
@Stateless
public class ProyectoHome {

	private static final Log log = LogFactory.getLog(ProyectoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Proyecto transientInstance) {
		log.debug("persisting Proyecto instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Proyecto persistentInstance) {
		log.debug("removing Proyecto instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Proyecto merge(Proyecto detachedInstance) {
		log.debug("merging Proyecto instance");
		try {
			Proyecto result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Proyecto findById(int id) {
		log.debug("getting Proyecto instance with id: " + id);
		try {
			Proyecto instance = entityManager.find(Proyecto.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}*/
