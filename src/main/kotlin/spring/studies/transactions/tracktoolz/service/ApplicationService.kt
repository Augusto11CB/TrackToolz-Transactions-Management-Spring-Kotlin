package spring.studies.transactions.tracktoolz.service

import spring.studies.transactions.tracktoolz.model.Application

interface ApplicationService {
    fun getAllApplications(): List<Application>
    fun addApplication(application: Application?)
    fun getApplicationById(applicationId: Long): Application?
    fun updateApplication(application: Application)
    fun deleteApplication(applicationId: Long)
}