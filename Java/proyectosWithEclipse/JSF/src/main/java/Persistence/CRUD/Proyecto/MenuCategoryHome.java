/*
package Persistence.CRUD.Proyecto;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import Web.Entity.Pojo.Portfolio.MenuCategory;

/**
 * Home object for domain model class MenuCategory.
 * @see .MenuCategory
 * @author Hibernate Tools
 *//*
@Stateless
public class MenuCategoryHome {

	private static final Log log = LogFactory.getLog(MenuCategoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MenuCategory transientInstance) {
		log.debug("persisting MenuCategory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MenuCategory persistentInstance) {
		log.debug("removing MenuCategory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MenuCategory merge(MenuCategory detachedInstance) {
		log.debug("merging MenuCategory instance");
		try {
			MenuCategory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MenuCategory findById(int id) {
		log.debug("getting MenuCategory instance with id: " + id);
		try {
			MenuCategory instance = entityManager.find(MenuCategory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
*/