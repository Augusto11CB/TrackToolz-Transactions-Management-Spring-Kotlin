package spring.studies.transactions.tracktoolz.repository

import org.springframework.data.jpa.repository.JpaRepository
import spring.studies.transactions.tracktoolz.model.Release

interface ReleaseRepository : JpaRepository< Release,Long>{

}