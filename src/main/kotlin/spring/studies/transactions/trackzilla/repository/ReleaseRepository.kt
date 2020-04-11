package spring.studies.transactions.trackzilla.repository

import org.springframework.data.jpa.repository.JpaRepository
import spring.studies.transactions.trackzilla.model.Release

interface ReleaseRepository : JpaRepository< Release,Long>{

}