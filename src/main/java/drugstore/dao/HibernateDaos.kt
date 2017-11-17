package drugstore.dao

import drugstore.entity.Drug
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager

abstract class BaseDao<T>(private val manager: EntityManager) : Dao<T> {

    override fun add(entity: T) = manager.persist(entity)

    override fun update(entity: T): T = manager.merge(entity)

    override fun delete(id: Int) = manager.remove(getById(id))
}

@Repository
open class DrugDaoImpl(private val manager: EntityManager) : BaseDao<Drug>(manager), Dao<Drug> {

    override fun getAll() = manager.createQuery("FROM Drug", Drug::class.java).resultList

    override fun getById(id: Int) = manager.find(Drug::class.java, id)

}