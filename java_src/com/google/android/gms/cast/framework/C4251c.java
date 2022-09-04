package com.google.android.gms.cast.framework;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.p001v4.app.FragmentActivity;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.view.KeyEvent;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.afc;
import com.google.android.gms.internal.afd;
import com.google.android.gms.internal.afm;
import com.google.android.gms.internal.zznv;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.google.android.gms.cast.framework.c */
/* loaded from: classes.dex */
public final class C4251c {

    /* renamed from: a */
    public static final String f16141a = "com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME";

    /* renamed from: b */
    private static final C4440m f16142b = new C4440m("CastContext");

    /* renamed from: c */
    private static C4252a f16143c;

    /* renamed from: d */
    private static C4251c f16144d;

    /* renamed from: e */
    private final Context f16145e;

    /* renamed from: f */
    private final AbstractC4359t f16146f;

    /* renamed from: g */
    private final C4282k f16147g;

    /* renamed from: h */
    private final C4352q f16148h;

    /* renamed from: i */
    private final CastOptions f16149i;

    /* renamed from: j */
    private afm f16150j;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: com.google.android.gms.cast.framework.c$a */
    /* loaded from: classes2.dex */
    public static class C4252a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private Context f16151a;

        public C4252a(Context context) {
            this.f16151a = context.getApplicationContext();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C4251c.m24868a(this.f16151a).m24861b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C4251c.m24868a(this.f16151a).m24869a(activity);
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
    }

    private C4251c(Context context, CastOptions castOptions, List<AbstractC4284m> list) {
        AbstractC4368w abstractC4368w;
        AbstractC4238aa abstractC4238aa;
        C4282k c4282k = null;
        this.f16145e = context.getApplicationContext();
        this.f16149i = castOptions;
        this.f16150j = new afm(MediaRouter.getInstance(this.f16145e));
        HashMap hashMap = new HashMap();
        afd afdVar = new afd(this.f16145e, castOptions, this.f16150j);
        hashMap.put(afdVar.b(), afdVar.d());
        if (list != null) {
            for (AbstractC4284m abstractC4284m : list) {
                C4588d.m23626a(abstractC4284m, "Additional SessionProvider must not be null.");
                String m23624a = C4588d.m23624a(abstractC4284m.m24709b(), (Object) "Category for SessionProvider must not be null or empty string.");
                C4588d.m23618b(!hashMap.containsKey(m23624a), String.format("SessionProvider for category %s already added", m23624a));
                hashMap.put(m23624a, abstractC4284m.m24708d());
            }
        }
        this.f16146f = afc.m17810a(this.f16145e, castOptions, this.f16150j, hashMap);
        try {
            abstractC4368w = this.f16146f.mo24401d();
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "getDiscoveryManagerImpl", AbstractC4359t.class.getSimpleName());
            abstractC4368w = null;
        }
        this.f16148h = abstractC4368w == null ? null : new C4352q(abstractC4368w);
        try {
            abstractC4238aa = this.f16146f.mo24402c();
        } catch (RemoteException e2) {
            f16142b.m24163a(e2, "Unable to call %s on %s.", "getSessionManagerImpl", AbstractC4359t.class.getSimpleName());
            abstractC4238aa = null;
        }
        this.f16147g = abstractC4238aa != null ? new C4282k(abstractC4238aa) : c4282k;
    }

    /* renamed from: a */
    public static C4251c m24868a(@NonNull Context context) {
        C4588d.m23620b("getSharedInstance must be called from the main thread.");
        if (f16144d == null) {
            AbstractC4266i m24860b = m24860b(context.getApplicationContext());
            f16144d = new C4251c(context, m24860b.m24795a(context.getApplicationContext()), m24860b.m24794b(context.getApplicationContext()));
            if (C4696s.m23110d()) {
                f16143c = new C4252a(context.getApplicationContext());
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f16143c);
            }
        }
        return f16144d;
    }

    /* renamed from: a */
    private boolean m24864a(C4253d c4253d, double d, boolean z) {
        double d2 = 1.0d;
        if (z) {
            try {
                double m24828h = c4253d.m24828h() + d;
                if (m24828h <= 1.0d) {
                    d2 = m24828h;
                }
                c4253d.m24852a(d2);
            } catch (IOException | IllegalStateException e) {
                f16142b.m24154e("Unable to call CastSession.setVolume(double).", e);
            }
        }
        return true;
    }

    /* renamed from: b */
    private static AbstractC4266i m24860b(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(f16141a);
            if (string != null) {
                return (AbstractC4266i) Class.forName(string).newInstance();
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NullPointerException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    /* renamed from: a */
    public CastOptions m24870a() {
        C4588d.m23620b("getCastOptions must be called from the main thread.");
        return this.f16149i;
    }

    /* renamed from: a */
    public void m24869a(Activity activity) {
        C4588d.m23620b("onActivityResumed must be called from the main thread.");
        try {
            this.f16146f.mo24407a(BinderC4173f.m25293a(activity));
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "onActivityResumed", AbstractC4359t.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public void m24867a(@NonNull FragmentActivity fragmentActivity, Bundle bundle) {
        if (!C4696s.m23110d()) {
            zznv.m12695a(fragmentActivity, bundle);
        }
    }

    /* renamed from: a */
    public void m24865a(AbstractC4237a abstractC4237a) {
        C4588d.m23620b("addAppVisibilityListener must be called from the main thread.");
        C4588d.m23627a(abstractC4237a);
        try {
            this.f16146f.mo24406a(new BinderC4349n(abstractC4237a));
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "addVisibilityChangeListener", AbstractC4359t.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public void m24863a(AbstractC4260f abstractC4260f) {
        C4588d.m23620b("addCastStateListener must be called from the main thread.");
        C4588d.m23627a(abstractC4260f);
        this.f16147g.m24719a(abstractC4260f);
    }

    /* renamed from: a */
    public boolean m24866a(KeyEvent keyEvent) {
        C4253d m24715b;
        C4588d.m23620b("onDispatchVolumeKeyEventBeforeJellyBean must be called from the main thread.");
        if (!C4696s.m23109e() && (m24715b = this.f16147g.m24715b()) != null && m24715b.o()) {
            double m24905i = m24870a().m24905i();
            boolean z = keyEvent.getAction() == 0;
            switch (keyEvent.getKeyCode()) {
                case 24:
                    return m24864a(m24715b, m24905i, z);
                case 25:
                    return m24864a(m24715b, -m24905i, z);
                default:
                    return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C4282k m24862b() {
        C4588d.m23620b("getSessionManager must be called from the main thread.");
        return this.f16147g;
    }

    /* renamed from: b */
    public void m24861b(Activity activity) {
        C4588d.m23620b("onActivityPaused must be called from the main thread.");
        try {
            this.f16146f.mo24404b(BinderC4173f.m25293a(activity));
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "onActivityPaused", AbstractC4359t.class.getSimpleName());
        }
    }

    /* renamed from: b */
    public void m24859b(AbstractC4237a abstractC4237a) {
        C4588d.m23620b("removeAppVisibilityListener must be called from the main thread.");
        if (abstractC4237a == null) {
            return;
        }
        try {
            this.f16146f.mo24403b(new BinderC4349n(abstractC4237a));
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "addVisibilityChangeListener", AbstractC4359t.class.getSimpleName());
        }
    }

    /* renamed from: b */
    public void m24858b(AbstractC4260f abstractC4260f) {
        C4588d.m23620b("addCastStateListener must be called from the main thread.");
        if (abstractC4260f == null) {
            return;
        }
        this.f16147g.m24714b(abstractC4260f);
    }

    /* renamed from: c */
    public MediaRouteSelector m24857c() {
        C4588d.m23620b("getMergedSelector must be called from the main thread.");
        try {
            return MediaRouteSelector.fromBundle(this.f16146f.mo24408a());
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", AbstractC4359t.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: d */
    public boolean m24856d() {
        C4588d.m23620b("isAppVisible must be called from the main thread.");
        try {
            return this.f16146f.mo24405b();
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "isApplicationVisible", AbstractC4359t.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: e */
    public C4352q m24855e() {
        C4588d.m23620b("getDiscoveryManager must be called from the main thread.");
        return this.f16148h;
    }

    /* renamed from: f */
    public AbstractC4170e m24854f() {
        try {
            return this.f16146f.mo24399f();
        } catch (RemoteException e) {
            f16142b.m24163a(e, "Unable to call %s on %s.", "getWrappedThis", AbstractC4359t.class.getSimpleName());
            return null;
        }
    }
}
