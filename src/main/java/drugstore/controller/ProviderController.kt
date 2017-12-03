package drugstore.controller

import drugstore.repository.ProvidersRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/providers")
class ProviderController(private val providersRepository: ProvidersRepository) {

    @GetMapping(value = "/getAll")
    fun getAllProviders() = providersRepository.getAllProviders()

    @GetMapping(value = "/get")
    fun filter(@RequestParam(name = "id", required = true) id: Int) = providersRepository.getById(id)
}