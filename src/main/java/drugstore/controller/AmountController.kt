package drugstore.controller

import drugstore.entity.AmountOfDrugs
import drugstore.entity.Drug
import drugstore.repository.AmountOfDrugsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/amount")
class AmountController(private val amountOfDrugsRepository: AmountOfDrugsRepository) {// add drugRepository

    @GetMapping(value = "/getAll")
    fun getAllDrugs() = amountOfDrugsRepository.getAllAmountOfDrugs()

    @GetMapping(value = "/getByDrug")
    fun filterByDrug(@RequestParam(name = "id", required = true) drug_id: Int) {
        val list = amountOfDrugsRepository.getByDrug(drug_id)
        println(list.first().price)
    }

}