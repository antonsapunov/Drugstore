package drugstore.repository

import drugstore.dao.Dao
import drugstore.entity.Provider

class ProvidersRepository(private val providersDao: Dao<Provider>) {

    fun getAllProviders() = providersDao.getAll().map { Provider(it) }

    fun getById(id: Int) = Provider(providersDao.getById(id))
}