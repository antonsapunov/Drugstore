package drugstore.repository

import drugstore.dao.Dao
import drugstore.entity.ActiveElement

class ActiveElementsRepository(private val activeElementsDao: Dao<ActiveElement>) {

    fun getAllActiveElements() = activeElementsDao.getAll().map { ActiveElement(it) }

    fun getById(id: Int) = ActiveElement(activeElementsDao.getById(id))

}