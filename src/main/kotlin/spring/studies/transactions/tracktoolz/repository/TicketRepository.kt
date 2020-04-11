package spring.studies.transactions.tracktoolz.repository

import org.springframework.data.jpa.repository.JpaRepository
import spring.studies.transactions.tracktoolz.model.Ticket

interface TicketRepository : JpaRepository<Ticket, Long> {

}