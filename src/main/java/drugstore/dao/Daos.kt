package drugstore.dao

import drugstore.entity.Drug

interface Dao<T> {

    fun add(entity: T)

    fun getById(id: Int): T

    fun update(entity: T): T

    fun delete(id: Int)

    fun getAll(): List<T>
}
