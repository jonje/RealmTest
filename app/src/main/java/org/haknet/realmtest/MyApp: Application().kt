package org.haknet.realmtest

import android.app.Application
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import org.haknet.realmtest.models.Address
import org.haknet.realmtest.models.Course
import org.haknet.realmtest.models.Student
import org.haknet.realmtest.models.Teacher

class MyApp : Application() {
    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}