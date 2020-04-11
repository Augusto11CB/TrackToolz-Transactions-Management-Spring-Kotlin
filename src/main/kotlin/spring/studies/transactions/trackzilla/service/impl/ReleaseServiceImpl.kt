package spring.studies.transactions.trackzilla.service.impl

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import spring.studies.transactions.trackzilla.model.Release
import spring.studies.transactions.trackzilla.model.Ticket
import spring.studies.transactions.trackzilla.repository.ReleaseRepository
import spring.studies.transactions.trackzilla.repository.TicketRepository
import spring.studies.transactions.trackzilla.service.ReleaseService

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
class ReleaseServiceImpl(
        private val releaseRepository: ReleaseRepository,
        private val ticketRepository: TicketRepository
) : ReleaseService {
    override fun addRelease(release: Release): Release {
        return releaseRepository.save(release)
    }

    override fun getRelease(releaseId: Long): Release? {
        return releaseRepository.findById(releaseId).orElse(null)
    }

    override fun scheduleRelease(release: Release): Release? {
        /*Transaction consists of two steps:
             1.) Assign a ticket to an existing release as one database tranx via releaseDAO
             2.) Update the status on existing tickets to deployed status as another database tranx via ticketDAO
         */
        createTickets(release)
        return assignTicketsToRelease(release.id, release.tickets)

    }

    private fun createTickets(release: Release) {
        // Step 1a - Create the new Tickets
        release.tickets.forEach {
            ticketRepository.save(it)
        }
    }

    private fun assignTicketsToRelease(id: Long, tickets: List<Ticket>): Release? {
        //STEP 1b - Associate the Tickets to a Release


        var releaseToUpdate = this.getRelease(id)

        releaseToUpdate?.let {

            var newTickts = mutableListOf<Ticket>()

            tickets.forEach { ticket ->
                newTickts.add(ticket.copy(status = "COMPLETED"))
            }
            //STEP 2 - Update the Tickets to Completed only after associating them to a release
            val newRelease = it.copy(tickets = newTickts)

            return newRelease
        }

        return null;
    }
}
