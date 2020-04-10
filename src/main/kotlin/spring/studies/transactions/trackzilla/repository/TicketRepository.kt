package spring.studies.transactions.trackzilla.repository

import org.springframework.data.jpa.repository.JpaRepository
import spring.studies.transactions.trackzilla.model.Ticket

interface TicketRepository : JpaRepository<Long, Ticket>{

}