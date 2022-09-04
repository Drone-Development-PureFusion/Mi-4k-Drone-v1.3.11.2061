package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.firebase.C9751b;
import java.util.concurrent.atomic.AtomicBoolean;
@TargetApi(14)
/* renamed from: com.google.android.gms.internal.mn */
/* loaded from: classes2.dex */
public class ComponentCallbacks2C7397mn implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final ComponentCallbacks2C7397mn f24632a = new ComponentCallbacks2C7397mn();

    /* renamed from: b */
    private final AtomicBoolean f24633b = new AtomicBoolean();

    /* renamed from: c */
    private boolean f24634c;

    private ComponentCallbacks2C7397mn() {
    }

    /* renamed from: a */
    public static ComponentCallbacks2C7397mn m14557a() {
        return f24632a;
    }

    /* renamed from: a */
    public static void m14556a(Application application) {
        application.registerActivityLifecycleCallbacks(f24632a);
        application.registerComponentCallbacks(f24632a);
        f24632a.f24634c = true;
    }

    /* renamed from: b */
    public boolean m14555b() {
        return this.f24633b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f24633b.compareAndSet(true, false)) {
            C9751b.m7213a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.f24633b.compareAndSet(true, false)) {
            C9751b.m7213a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i != 20 || !this.f24633b.compareAndSet(false, true)) {
            return;
        }
        C9751b.m7213a(true);
    }
}
