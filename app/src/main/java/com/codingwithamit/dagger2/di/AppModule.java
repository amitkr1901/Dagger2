package com.codingwithamit.dagger2.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.codingwithamit.dagger2.R;

import androidx.core.content.ContextCompat;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static boolean getApp(Application application){
        return application == null;
    }

    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions
                .placeholderOf(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
    }

    @Provides
    static RequestManager provideGlideInstance(Application application,RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application,R.drawable.logo);
    }


}
