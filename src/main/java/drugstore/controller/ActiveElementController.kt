package drugstore.controller

import drugstore.repository.ActiveElementsRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/activeElements")
class ActiveElementController(private val activeElementsRepository: ActiveElementsRepository) {

    @GetMapping(value = "/getAll")
    fun getAllActiveElements() = activeElementsRepository.getAllActiveElements()

    @GetMapping(value = "/get")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = activeElementsRepository.getById(id)

}