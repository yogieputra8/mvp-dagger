package tkpd.tokopedia.com.myapplication.root;

import javax.inject.Singleton;

import dagger.Component;
import tkpd.tokopedia.com.myapplication.login.LoginActivity;
import tkpd.tokopedia.com.myapplication.login.LoginModule;

@Singleton
@Component(modules = { ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}

// 2