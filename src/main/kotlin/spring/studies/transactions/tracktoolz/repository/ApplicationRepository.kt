package spring.studies.transactions.tracktoolz.repository

import org.springframework.data.jpa.repository.JpaRepository
import spring.studies.transactions.tracktoolz.model.Application

interface ApplicationRepository : JpaRepository<Application,Long>{

}