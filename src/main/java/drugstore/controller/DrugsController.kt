package drugstore.controller

import drugstore.entity.ActiveElement
import drugstore.entity.Drug
import drugstore.entity.Provider
import drugstore.repository.ActiveElementsRepository
import drugstore.repository.DrugsRepository
import drugstore.repository.ProvidersRepository
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping



@RestController
@CrossOrigin(origins = arrayOf("*"))
@RequestMapping("/drugs")
class DrugsController(private val drugsRepository: DrugsRepository, private val providersRepository: ProvidersRepository,
                      private val activeElementsRepository: ActiveElementsRepository) {

    @GetMapping(value = "/getAll")
    fun getAllDrugs() = drugsRepository.getAllDrugs()

    @GetMapping(value = "/get")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = drugsRepository.getById(id)

    @DeleteMapping(value = "/deleteDrug")
    fun deleteDrug(@RequestParam(name = "id", required = true) id: Int) {
        drugsRepository.deleteById(id)
        print("delete" + id)
    }

    @PostMapping(value = "/addDrug")
    fun addDrug(@RequestBody map: Map<String, String>) {

        val provider = Provider(map.getValue("brand"))
        providersRepository.addProvider(provider)

        val activeElement = ActiveElement(map.getValue("activeElement"))
        activeElementsRepository.addActiveElement(activeElement)

        val drug = Drug(map.getValue("name"),
                providersRepository.getAllProviders().last().id,
                (map.getValue("type_id")).toInt(),
                activeElementsRepository.getAllActiveElements().last().id)
        drugsRepository.addDrug(drug)

    }

}
