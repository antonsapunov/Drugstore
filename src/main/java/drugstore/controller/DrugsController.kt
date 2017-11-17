package drugstore.controller

import drugstore.repository.DrugsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/drugs")
class DrugsController(private val drugsRepository: DrugsRepository) {

    @GetMapping(value = "/getAll")
    fun getAllDrugs() = drugsRepository.getAllDrugs()

    @GetMapping(value = "/filter")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = drugsRepository.getById(id)
}