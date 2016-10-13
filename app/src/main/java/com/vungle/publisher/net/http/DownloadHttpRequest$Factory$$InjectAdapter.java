package com.vungle.publisher.net.http;

import com.vungle.publisher.net.http.HttpRequest.Factory;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: vungle */
public final class DownloadHttpRequest$Factory$$InjectAdapter extends Binding<Factory> implements MembersInjector<Factory>, Provider<Factory> {
    private Binding<Factory> a;

    public DownloadHttpRequest$Factory$$InjectAdapter() {
        super("com.vungle.publisher.net.http.DownloadHttpRequest$Factory", "members/com.vungle.publisher.net.http.DownloadHttpRequest$Factory", true, Factory.class);
    }

    public final void attach(Linker linker) {
        Linker linker2 = linker;
        this.a = linker2.requestBinding("members/com.vungle.publisher.net.http.HttpRequest$Factory", Factory.class, getClass().getClassLoader(), false, true);
    }

    public final void getDependencies(Set<Binding<?>> set, Set<Binding<?>> injectMembersBindings) {
        injectMembersBindings.add(this.a);
    }

    public final Factory get() {
        Factory factory = new Factory();
        injectMembers(factory);
        return factory;
    }

    public final void injectMembers(Factory object) {
        this.a.injectMembers(object);
    }
}
