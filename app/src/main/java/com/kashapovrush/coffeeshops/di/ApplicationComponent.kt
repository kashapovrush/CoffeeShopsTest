package com.kashapovrush.coffeeshops.di

import android.app.Application
import android.content.Context
import com.kashapovrush.coffeeshops.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create (
            @BindsInstance context: Context,
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}