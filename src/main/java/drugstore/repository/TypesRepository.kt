package drugstore.repository

import drugstore.dao.Dao
import drugstore.entity.Type


class TypesRepository(private val typesDao: Dao<Type>) {

    fun getAllTypes() = typesDao.getAll().map { Type(it) }

    fun getById(id: Int) = Type(typesDao.getById(id))
}