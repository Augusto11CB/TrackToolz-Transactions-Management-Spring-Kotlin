package spring.studies.transactions.tracktoolz.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Ticket(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,
        val title: String,
        val description: String,
        val applicationID: Long,
        val status: String
) {
}