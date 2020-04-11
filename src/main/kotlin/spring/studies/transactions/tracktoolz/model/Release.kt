package spring.studies.transactions.tracktoolz.model

import java.time.LocalDate
import javax.persistence.*

@Entity
data class Release(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val name: String,

        val description: String,

        @OneToMany(cascade = [CascadeType.PERSIST])
        val tickets: List<Ticket> = listOf(),

        val releaseDate: LocalDate = LocalDate.now()
) {

}