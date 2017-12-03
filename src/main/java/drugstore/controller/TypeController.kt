package drugstore.controller

import drugstore.repository.TypesRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/types")
class TypeController(private val typesRepository: TypesRepository) {

    @GetMapping(value = "/getAll")
    fun getAllTypes() = typesRepository.getAllTypes()

    @GetMapping(value = "/get")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = typesRepository.getById(id)
}