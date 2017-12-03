package drugstore.repository

import drugstore.dao.Dao
import drugstore.entity.Drug

class DrugsRepository(private val drugsDao: Dao<Drug>) {

    fun getAllDrugs() = drugsDao.getAll().map { Drug(it) }

    fun getById(id: Int) = Drug(drugsDao.getById(id))

    fun deleteById(id: Int) {
        drugsDao.delete(id)
    }
}
