package spring.studies.transactions.trackzilla.service

import spring.studies.transactions.trackzilla.model.Release


interface ReleaseService {
    fun addRelease(release: Release): Release
    fun getRelease(releaseId: Long): Release?
    fun scheduleRelease(release: Release): Release?
}