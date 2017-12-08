package drugstore.repository

import drugstore.dao.AmountOfDrugsDao
import drugstore.entity.AmountOfDrugs


class AmountOfDrugsRepository(private val amountOfDrugsDao: AmountOfDrugsDao) {

    fun getAllAmountOfDrugs() = amountOfDrugsDao.getAll().map { AmountOfDrugs(it) }

    fun getByDrug(id: Int) = amountOfDrugsDao.getByDrug(id).map { AmountOfDrugs(it) }

}
