package spring.studies.transactions.tracktoolz.service

import spring.studies.transactions.tracktoolz.model.Ticket

interface TicketService {
    fun getAllTickets(): List<Ticket>
    fun getTicketById(ticketId: Long): Ticket?
    fun addTicket(ticket: Ticket)
    fun updateTicket(ticket: Ticket)
    fun deleteTicket(ticketId: Long)
    fun closeTicket(ticketId: Long)
}