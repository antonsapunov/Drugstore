package drugstore.repository

import drugstore.dao.Dao
import drugstore.entity.Drugstore


class DrugstoresRepository(private val drugstoreDao: Dao<Drugstore>) {

    fun getAllDrugstores() = drugstoreDao.getAll().map { Drugstore(it) }

    fun getById(id: Int) = Drugstore(drugstoreDao.getById(id))
}