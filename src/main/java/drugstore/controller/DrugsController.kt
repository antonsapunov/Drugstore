package drugstore.controller

import drugstore.repository.DrugsRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/drugs")
class DrugsController(private val drugsRepository: DrugsRepository) {

    @GetMapping(value = "/getAll")
    fun getAllDrugs() = drugsRepository.getAllDrugs()

    @GetMapping(value = "/get")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = drugsRepository.getById(id)

    @DeleteMapping(value = "/deleteDrug")
    fun deleteDrug(@RequestParam(name = "id", required = true) id: Int) {
        drugsRepository.deleteById(id)
        print("delete" + id)
    }
}
