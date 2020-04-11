package spring.studies.transactions.tracktoolz.service

import spring.studies.transactions.tracktoolz.model.Release


interface ReleaseService {
    fun addRelease(release: Release): Release
    fun getRelease(releaseId: Long): Release?
    fun scheduleRelease(release: Release): Release?
}