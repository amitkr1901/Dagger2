package com.codingwithamit.dagger2.di;

import android.app.Application;

import com.codingwithamit.dagger2.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface  Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
