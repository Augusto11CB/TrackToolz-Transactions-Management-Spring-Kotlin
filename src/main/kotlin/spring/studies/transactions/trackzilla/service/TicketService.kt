package spring.studies.transactions.trackzilla.service

import spring.studies.transactions.trackzilla.model.Ticket

interface TicketService {
    fun getAllTickets(): List<Ticket>
    fun getTicketById(ticketId: Long): Ticket?
    fun addTicket(ticket: Ticket)
    fun updateTicket(ticket: Ticket)
    fun deleteTicket(ticketId: Long)
    fun closeTicket(ticketId: Long)
}