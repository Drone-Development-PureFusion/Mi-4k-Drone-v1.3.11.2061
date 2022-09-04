package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ape;
import com.google.android.gms.tagmanager.AbstractC9032af;
import com.google.android.gms.tagmanager.AbstractC9035ag;
import com.google.android.gms.tagmanager.AbstractC9039ai;
import com.google.android.gms.tagmanager.AbstractC9042aj;
import com.google.android.gms.tagmanager.TagManagerService;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p356d.AbstractC11759f;
/* loaded from: classes2.dex */
public final class apx {

    /* renamed from: b */
    private static volatile apx f22785b;

    /* renamed from: c */
    private final Context f22787c;

    /* renamed from: d */
    private final AbstractC9042aj f22788d;

    /* renamed from: e */
    private final AbstractC9032af f22789e;

    /* renamed from: f */
    private final aqa f22790f;

    /* renamed from: g */
    private final ExecutorService f22791g;

    /* renamed from: h */
    private final ScheduledExecutorService f22792h;

    /* renamed from: i */
    private final apn f22793i;

    /* renamed from: j */
    private final C6741a f22794j;

    /* renamed from: l */
    private String f22796l;

    /* renamed from: m */
    private String f22797m;

    /* renamed from: a */
    private static final Pattern f22784a = Pattern.compile("(gtm-[a-z0-9]{1,10})\\.json", 2);

    /* renamed from: r */
    private static AbstractC6744c f22786r = new AbstractC6744c() { // from class: com.google.android.gms.internal.apx.1
        @Override // com.google.android.gms.internal.apx.AbstractC6744c
        /* renamed from: a */
        public apx mo16253a(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
            return new apx(context, abstractC9042aj, abstractC9032af, new aqa(context), apz.m16245a(), apz.m16244b(), apn.m16354a(), new C6741a(context));
        }
    };

    /* renamed from: k */
    private final Object f22795k = new Object();

    /* renamed from: n */
    private int f22798n = 1;

    /* renamed from: o */
    private final Queue<Runnable> f22799o = new LinkedList();

    /* renamed from: p */
    private volatile boolean f22800p = false;

    /* renamed from: q */
    private volatile boolean f22801q = false;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.internal.apx$a */
    /* loaded from: classes2.dex */
    public static class C6741a {

        /* renamed from: a */
        private final Context f22828a;

        public C6741a(Context context) {
            this.f22828a = context;
        }

        /* renamed from: a */
        public String[] m16256a() {
            return this.f22828a.getAssets().list("");
        }

        /* renamed from: a */
        public String[] m16255a(String str) {
            return this.f22828a.getAssets().list(str);
        }
    }

    /* renamed from: com.google.android.gms.internal.apx$b */
    /* loaded from: classes2.dex */
    private class BinderC6742b extends ape.AbstractBinderC6707a {
        private BinderC6742b() {
        }

        @Override // com.google.android.gms.internal.ape
        /* renamed from: a */
        public void mo16254a(final boolean z, final String str) {
            apx.this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (apx.this.f22798n != 2) {
                        aph.m16394b("Container load callback completed after timeout");
                        return;
                    }
                    if (z) {
                        apx.this.f22798n = 3;
                        String str2 = str;
                        aph.m16391d(new StringBuilder(String.valueOf(str2).length() + 18).append("Container ").append(str2).append(" loaded.").toString());
                    } else {
                        apx.this.f22798n = 4;
                        String valueOf = String.valueOf(str);
                        aph.m16396a(valueOf.length() != 0 ? "Error loading container:".concat(valueOf) : new String("Error loading container:"));
                    }
                    while (!apx.this.f22799o.isEmpty()) {
                        apx.this.f22791g.submit((Runnable) apx.this.f22799o.remove());
                    }
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.internal.apx$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6744c {
        /* renamed from: a */
        apx mo16253a(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af);
    }

    apx(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af, aqa aqaVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, apn apnVar, C6741a c6741a) {
        C4588d.m23627a(context);
        C4588d.m23627a(abstractC9042aj);
        this.f22787c = context;
        this.f22788d = abstractC9042aj;
        this.f22789e = abstractC9032af;
        this.f22790f = aqaVar;
        this.f22791g = executorService;
        this.f22792h = scheduledExecutorService;
        this.f22793i = apnVar;
        this.f22794j = c6741a;
    }

    /* renamed from: a */
    public static apx m16277a(Context context, AbstractC9042aj abstractC9042aj, AbstractC9032af abstractC9032af) {
        C4588d.m23627a(context);
        C4588d.m23627a(context);
        apx apxVar = f22785b;
        if (apxVar == null) {
            synchronized (apx.class) {
                apxVar = f22785b;
                if (apxVar == null) {
                    apxVar = f22786r.mo16253a(context, abstractC9042aj, abstractC9032af);
                    f22785b = apxVar;
                }
            }
        }
        return apxVar;
    }

    /* renamed from: a */
    private static boolean m16276a(Context context, Class<? extends Service> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 4);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public Pair<String, String> m16265b(String[] strArr) {
        aph.m16391d("Looking up container asset.");
        if (this.f22796l == null || this.f22797m == null) {
            if (strArr == null) {
                try {
                    strArr = m16267b().m16255a("containers");
                } catch (IOException e) {
                    aph.m16395a(String.format("Failed to enumerate assets in folder %s", "containers"), e);
                    return Pair.create(null, null);
                }
            }
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                Matcher matcher = f22784a.matcher(strArr[i]);
                if (!matcher.matches()) {
                    aph.m16394b(String.format("Ignoring container asset %s (does not match %s)", strArr[i], f22784a.pattern()));
                } else if (!z) {
                    this.f22796l = matcher.group(1);
                    String valueOf = String.valueOf("containers");
                    String valueOf2 = String.valueOf(File.separator);
                    String valueOf3 = String.valueOf(strArr[i]);
                    this.f22797m = new StringBuilder(String.valueOf(valueOf).length() + 0 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append(valueOf).append(valueOf2).append(valueOf3).toString();
                    String valueOf4 = String.valueOf(this.f22796l);
                    aph.m16391d(valueOf4.length() != 0 ? "Asset found for container ".concat(valueOf4) : new String("Asset found for container "));
                    z = true;
                } else {
                    String valueOf5 = String.valueOf(strArr[i]);
                    aph.m16394b(valueOf5.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(valueOf5) : new String("Extra container asset found, will not be loaded: "));
                }
            }
            if (!z) {
                aph.m16394b("No container asset found in /assets/containers. Checking top level /assets directory for container assets.");
                try {
                    String[] m16256a = m16267b().m16256a();
                    for (int i2 = 0; i2 < m16256a.length; i2++) {
                        Matcher matcher2 = f22784a.matcher(m16256a[i2]);
                        if (matcher2.matches()) {
                            if (!z) {
                                this.f22796l = matcher2.group(1);
                                this.f22797m = m16256a[i2];
                                String valueOf6 = String.valueOf(this.f22796l);
                                aph.m16391d(valueOf6.length() != 0 ? "Asset found for container ".concat(valueOf6) : new String("Asset found for container "));
                                aph.m16394b("Loading container assets from top level /assets directory. Please move the container asset to /assets/containers");
                                z = true;
                            } else {
                                String valueOf7 = String.valueOf(m16256a[i2]);
                                aph.m16394b(valueOf7.length() != 0 ? "Extra container asset found, will not be loaded: ".concat(valueOf7) : new String("Extra container asset found, will not be loaded: "));
                            }
                        }
                    }
                } catch (IOException e2) {
                    aph.m16395a("Failed to enumerate assets.", e2);
                    return Pair.create(null, null);
                }
            }
            return Pair.create(this.f22796l, this.f22797m);
        }
        return Pair.create(this.f22796l, this.f22797m);
    }

    /* renamed from: b */
    private C6741a m16267b() {
        return this.f22794j;
    }

    @WorkerThread
    /* renamed from: c */
    private void m16264c() {
        try {
            this.f22788d.mo8896a(new AbstractC9039ai.AbstractBinderC9040a() { // from class: com.google.android.gms.internal.apx.2
                @Override // com.google.android.gms.tagmanager.AbstractC9039ai
                /* renamed from: a */
                public void mo9317a(final String str, final String str2, final Bundle bundle, final long j) {
                    final String sb = new StringBuilder(String.valueOf(str).length() + 4).append(str).append(AbstractC11759f.f37105b).append("gtm").toString();
                    apx.this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.2.1

                        /* renamed from: g */
                        private boolean f22809g = false;

                        @Override // java.lang.Runnable
                        public void run() {
                            if (apx.this.f22798n == 3) {
                                apx.this.f22790f.m16239a(str2, bundle, sb, j, true);
                            } else if (apx.this.f22798n == 4) {
                                aph.m16391d(String.format("Container failed to load: skipping  event interceptor by logging event back to Firebase directly: name = %s, origin = %s, params = %s.", str2, sb, bundle));
                                try {
                                    apx.this.f22788d.mo8895a(sb, str2, bundle, j);
                                } catch (RemoteException e) {
                                    String valueOf = String.valueOf(e.getMessage());
                                    aph.m16396a(valueOf.length() != 0 ? "Error logging event on measurement proxy".concat(valueOf) : new String("Error logging event on measurement proxy"));
                                }
                            } else if (apx.this.f22798n != 1 && apx.this.f22798n != 2) {
                                aph.m16394b(new StringBuilder(28).append("Unexpected state:").append(apx.this.f22798n).toString());
                            } else if (this.f22809g) {
                                aph.m16394b("Invalid state - not expecting to see a deferred eventduring container loading.");
                            } else {
                                aph.m16391d(String.format("Container not loaded yet: deferring event interceptor by enqueuing the event: name = %s, origin = %s, params = %s.", str2, str, bundle));
                                this.f22809g = true;
                                apx.this.f22799o.add(this);
                            }
                        }
                    });
                }
            });
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            aph.m16396a(valueOf.length() != 0 ? "Error communicating with measurement proxy:".concat(valueOf) : new String("Error communicating with measurement proxy:"));
        }
        try {
            this.f22788d.mo8897a(new AbstractC9035ag.AbstractBinderC9036a() { // from class: com.google.android.gms.internal.apx.3
                @Override // com.google.android.gms.tagmanager.AbstractC9035ag
                /* renamed from: a */
                public void mo9319a(final String str, final String str2, final Bundle bundle, final long j) {
                    if (!str.endsWith("+gtm")) {
                        final String sb = new StringBuilder(String.valueOf(str).length() + 4).append(str).append(AbstractC11759f.f37105b).append("gtm").toString();
                        apx.this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.3.1

                            /* renamed from: g */
                            private boolean f22817g = false;

                            @Override // java.lang.Runnable
                            public void run() {
                                if (apx.this.f22798n == 3) {
                                    apx.this.f22790f.m16239a(str2, bundle, sb, j, false);
                                } else if (apx.this.f22798n != 1 && apx.this.f22798n != 2) {
                                    if (apx.this.f22798n == 4) {
                                        aph.m16391d(String.format("Container failed to load: skipping event listener by ignoring the event: name = %s, origin = %s, params = %s.", str2, str, bundle));
                                    } else {
                                        aph.m16394b(new StringBuilder(28).append("Unexpected state:").append(apx.this.f22798n).toString());
                                    }
                                } else if (this.f22817g) {
                                    aph.m16394b("Invalid state - not expecting to see a deferred event during container loading.");
                                } else {
                                    aph.m16391d(String.format("Container not loaded yet: deferring event listener by enqueuing the event: name = %s, origin = %s, params = %s.", str2, str, bundle));
                                    this.f22817g = true;
                                    apx.this.f22799o.add(this);
                                }
                            }
                        });
                    }
                }
            });
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            aph.m16396a(valueOf2.length() != 0 ? "Error communicating with measurement proxy:".concat(valueOf2) : new String("Error communicating with measurement proxy:"));
        }
    }

    @TargetApi(14)
    /* renamed from: d */
    private void m16262d() {
        if (Build.VERSION.SDK_INT >= 14) {
            this.f22787c.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.google.android.gms.internal.apx.6
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    if (i == 20) {
                        apx.this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                aph.m16391d("App's UI deactivated. Dispatching hits.");
                                apx.this.f22790f.m16236c();
                            }
                        });
                    }
                }
            });
        }
    }

    @WorkerThread
    /* renamed from: a */
    public void m16278a() {
        m16268a((String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16275a(final Uri uri) {
        this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.7
            @Override // java.lang.Runnable
            public void run() {
                String valueOf = String.valueOf(uri);
                aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Preview requested to uri ").append(valueOf).toString());
                synchronized (apx.this.f22795k) {
                    if (apx.this.f22798n == 2) {
                        aph.m16391d("Still initializing. Defer preview container loading.");
                        apx.this.f22799o.add(this);
                        return;
                    }
                    String str = (String) apx.this.m16265b((String[]) null).first;
                    if (str == null) {
                        aph.m16394b("Preview failed (no container found)");
                    } else if (!apx.this.f22793i.m16352a(str, uri)) {
                        String valueOf2 = String.valueOf(uri);
                        aph.m16394b(new StringBuilder(String.valueOf(valueOf2).length() + 73).append("Cannot preview the app with the uri: ").append(valueOf2).append(". Launching current version instead.").toString());
                    } else if (!apx.this.f22800p) {
                        String valueOf3 = String.valueOf(uri);
                        aph.m16391d(new StringBuilder(String.valueOf(valueOf3).length() + 84).append("Deferring container loading for preview uri: ").append(valueOf3).append("(Tag Manager has not been initialized).").toString());
                    } else {
                        String valueOf4 = String.valueOf(uri);
                        aph.m16392c(new StringBuilder(String.valueOf(valueOf4).length() + 36).append("Starting to load preview container: ").append(valueOf4).toString());
                        if (!apx.this.f22790f.m16237b()) {
                            aph.m16394b("Failed to reset TagManager service for preview");
                            return;
                        }
                        apx.this.f22800p = false;
                        apx.this.f22798n = 1;
                        apx.this.m16278a();
                    }
                }
            }
        });
    }

    @WorkerThread
    /* renamed from: a */
    public void m16270a(String str, @Nullable String str2) {
        m16269a(str, str2, (String) null);
    }

    @WorkerThread
    /* renamed from: a */
    public void m16269a(final String str, @Nullable final String str2, @Nullable final String str3) {
        this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.4
            @Override // java.lang.Runnable
            public void run() {
                String str4 = str;
                aph.m16391d(new StringBuilder(String.valueOf(str4).length() + 28).append("Starting to load container ").append(str4).append(".").toString());
                if (apx.this.f22798n != 1) {
                    aph.m16394b("Unexpected state - container loading already initiated.");
                    return;
                }
                apx.this.f22798n = 2;
                apx.this.f22790f.m16238a(str, str2, str3, new BinderC6742b());
            }
        });
        this.f22792h.schedule(new Runnable() { // from class: com.google.android.gms.internal.apx.5
            @Override // java.lang.Runnable
            public void run() {
                apx.this.f22791g.submit(new Runnable() { // from class: com.google.android.gms.internal.apx.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (apx.this.f22798n == 1 || apx.this.f22798n == 2) {
                            apx.this.f22798n = 4;
                            aph.m16396a("Container load timed out after 5000ms.");
                            while (!apx.this.f22799o.isEmpty()) {
                                apx.this.f22791g.submit((Runnable) apx.this.f22799o.remove());
                            }
                        }
                    }
                });
            }
        }, 5000L, TimeUnit.MILLISECONDS);
    }

    @WorkerThread
    /* renamed from: a */
    public void m16268a(String[] strArr) {
        aph.m16391d("Initializing Tag Manager.");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f22795k) {
            if (this.f22800p) {
                return;
            }
            if (!m16276a(this.f22787c, TagManagerService.class)) {
                aph.m16394b("Tag Manager fails to initialize (TagManagerService not enabled in the manifest)");
                this.f22800p = true;
                return;
            }
            Pair<String, String> m16265b = m16265b(strArr);
            String str = (String) m16265b.first;
            String str2 = (String) m16265b.second;
            if (str == null || str2 == null) {
                aph.m16394b("Tag Manager's event handler WILL NOT be installed (no container loaded)");
            } else {
                String valueOf = String.valueOf(str);
                aph.m16392c(valueOf.length() != 0 ? "Loading container ".concat(valueOf) : new String("Loading container "));
                m16270a(str, str2);
                if (!this.f22801q) {
                    aph.m16392c("Installing Tag Manager event handler.");
                    this.f22801q = true;
                    m16264c();
                    m16262d();
                    aph.m16392c("Tag Manager event handler installed.");
                }
            }
            this.f22800p = true;
            aph.m16392c(new StringBuilder(53).append("Tag Manager initilization took ").append(System.currentTimeMillis() - currentTimeMillis).append(LocaleUtil.MALAY).toString());
        }
    }
}
