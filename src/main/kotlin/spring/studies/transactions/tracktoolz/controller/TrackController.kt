package spring.studies.transactions.tracktoolz.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import spring.studies.transactions.tracktoolz.model.Application
import spring.studies.transactions.tracktoolz.model.Ticket
import spring.studies.transactions.tracktoolz.service.ApplicationService
import spring.studies.transactions.tracktoolz.service.TicketService


@RestController
@RequestMapping("/tza")
class TrackController(
        private val applicationService: ApplicationService,
        private val ticketService: TicketService
) {

    @GetMapping("/tickets")
    fun getAllTickets(): ResponseEntity<List<Ticket>> {
        val list: List<Ticket> = ticketService.getAllTickets()
        return ResponseEntity(list, HttpStatus.OK)
    }

    @GetMapping("/applications")
    fun getAllApplications(): ResponseEntity<List<Application>>? {
        val list: List<Application> = applicationService.getAllApplications()
        return ResponseEntity(list, HttpStatus.OK)
    }
}