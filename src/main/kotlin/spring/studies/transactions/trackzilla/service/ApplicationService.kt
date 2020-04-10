package spring.studies.transactions.trackzilla.service

import spring.studies.transactions.trackzilla.model.Application

interface ApplicationService {
    fun getAllApplications(): List<Application>
    fun addApplication(application: Application?)
    fun getApplicationById(applicationId: Int): Application?
    fun updateApplication(application: Application)
    fun deleteApplication(applicationId: Int)
}