package drugstore.dao

import drugstore.entity.*
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.transaction.Transactional

abstract class BaseDao<T>(private val manager: EntityManager) : Dao<T> {

    override fun add(entity: T) = manager.persist(entity)

    override fun update(entity: T): T = manager.merge(entity)

    @Transactional
    override fun delete(id: Int) = manager.remove(getById(id))
}

@Repository
open class DrugDaoImpl(private val manager: EntityManager) : BaseDao<Drug>(manager), Dao<Drug> {

    override fun getAll() = manager.createQuery("FROM Drug", Drug::class.java).resultList

    override fun getById(id: Int) = manager.find(Drug::class.java, id)

}

@Repository
open class ProviderDaoImpl(private val manager: EntityManager) : BaseDao<Provider>(manager), Dao<Provider> {

    override fun getAll() = manager.createQuery("FROM Provider", Provider::class.java).resultList

    override fun getById(id: Int) = manager.find(Provider::class.java, id)

}

@Repository
open class ActiveElementDaoImpl(private val manager: EntityManager) : BaseDao<ActiveElement>(manager), Dao<ActiveElement> {

    override fun getAll() = manager.createQuery("FROM ActiveElement", ActiveElement::class.java).resultList

    override fun getById(id: Int) = manager.find(ActiveElement::class.java, id)

}

@Repository
open class TypeDaoImpl(private val manager: EntityManager) : BaseDao<Type>(manager), Dao<Type> {

    override fun getAll() = manager.createQuery("FROM Type", Type::class.java).resultList

    override fun getById(id: Int) = manager.find(Type::class.java, id)

}

@Repository
open class DrugstoreDaoImpl(private val manager: EntityManager) : BaseDao<Drugstore>(manager), Dao<Drugstore> {

    override fun getAll() = manager.createQuery("FROM Drugstore", Drugstore::class.java).resultList

    override fun getById(id: Int) = manager.find(Drugstore::class.java, id)

}
