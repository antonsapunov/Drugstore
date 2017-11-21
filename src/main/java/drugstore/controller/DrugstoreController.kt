package drugstore.controller

import drugstore.repository.DrugstoresRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drugstores")
class DrugstoreController(private val drugstoreRepository: DrugstoresRepository) {

    @GetMapping(value = "/getAll")
    fun getAllDrugstores() = drugstoreRepository.getAllDrugstores()

    @GetMapping(value = "/filter")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = drugstoreRepository.getById(id)
}