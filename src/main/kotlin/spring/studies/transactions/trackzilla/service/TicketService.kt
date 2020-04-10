package spring.studies.transactions.trackzilla.service

import spring.studies.transactions.trackzilla.model.Ticket

interface TicketService {
    fun getAllTickets(): List<Ticket>
    fun getTicketById(ticketId: Int): Ticket?
    fun addTicket(ticket: Ticket)
    fun updateTicket(ticket: Ticket)
    fun deleteTicket(ticketId: Int)
    fun closeTicket(ticketId: Int)
}