package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RawRes;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.tagmanager.C9196e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* renamed from: com.google.android.gms.tagmanager.f */
/* loaded from: classes2.dex */
public class C9203f {

    /* renamed from: g */
    private static C9203f f29016g;

    /* renamed from: a */
    private final AbstractC9208a f29017a;

    /* renamed from: b */
    private final Context f29018b;

    /* renamed from: c */
    private final C9196e f29019c;

    /* renamed from: d */
    private final AbstractC9126cl f29020d;

    /* renamed from: e */
    private final ConcurrentMap<String, C9167dl> f29021e;

    /* renamed from: f */
    private final C9183dq f29022f;

    /* renamed from: com.google.android.gms.tagmanager.f$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9208a {
        /* renamed from: a */
        C9170dm mo8926a(Context context, C9203f c9203f, Looper looper, String str, int i, C9183dq c9183dq);
    }

    C9203f(Context context, AbstractC9208a abstractC9208a, C9196e c9196e, AbstractC9126cl abstractC9126cl) {
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f29018b = context.getApplicationContext();
        this.f29020d = abstractC9126cl;
        this.f29017a = abstractC9208a;
        this.f29021e = new ConcurrentHashMap();
        this.f29019c = c9196e;
        this.f29019c.m8971a(new C9196e.AbstractC9200b() { // from class: com.google.android.gms.tagmanager.f.1
            @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9200b
            /* renamed from: a */
            public void mo8927a(Map<String, Object> map) {
                Object obj = map.get(C9196e.f29004b);
                if (obj != null) {
                    C9203f.this.m8939a(obj.toString());
                }
            }
        });
        this.f29019c.m8971a(new C9124cj(this.f29018b));
        this.f29022f = new C9183dq();
        m8931c();
        m8928d();
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    /* renamed from: a */
    public static C9203f m8943a(Context context) {
        C9203f c9203f;
        synchronized (C9203f.class) {
            if (f29016g == null) {
                if (context == null) {
                    C9065aw.m9301a("TagManager.getInstance requires non-null context.");
                    throw new NullPointerException();
                }
                f29016g = new C9203f(context, new AbstractC9208a() { // from class: com.google.android.gms.tagmanager.f.2
                    @Override // com.google.android.gms.tagmanager.C9203f.AbstractC9208a
                    /* renamed from: a */
                    public C9170dm mo8926a(Context context2, C9203f c9203f2, Looper looper, String str, int i, C9183dq c9183dq) {
                        return new C9170dm(context2, c9203f2, looper, str, i, c9183dq);
                    }
                }, new C9196e(new C9188du(context)), C9127cm.m9177c());
            }
            c9203f = f29016g;
        }
        return c9203f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8939a(String str) {
        for (C9167dl c9167dl : this.f29021e.values()) {
            c9167dl.m9064a(str);
        }
    }

    @TargetApi(14)
    /* renamed from: c */
    private void m8931c() {
        if (Build.VERSION.SDK_INT >= 14) {
            this.f29018b.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.google.android.gms.tagmanager.f.3
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
                    if (i == 20) {
                        C9203f.this.m8935b();
                    }
                }
            });
        }
    }

    /* renamed from: d */
    private void m8928d() {
        C9209g.m8924a(this.f29018b);
    }

    /* renamed from: a */
    public int m8941a(C9167dl c9167dl) {
        this.f29021e.put(c9167dl.m9060e(), c9167dl);
        return this.f29021e.size();
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC9069b> m8938a(String str, @RawRes int i) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, null, str, i, this.f29022f);
        mo8926a.m9045b();
        return mo8926a;
    }

    /* renamed from: a */
    public AbstractC4494i<AbstractC9069b> m8937a(String str, @RawRes int i, Handler handler) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, handler.getLooper(), str, i, this.f29022f);
        mo8926a.m9045b();
        return mo8926a;
    }

    /* renamed from: a */
    public C9196e m8944a() {
        return this.f29019c;
    }

    /* renamed from: a */
    public void m8936a(boolean z) {
        C9065aw.m9302a(z ? 2 : 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m8942a(Uri uri) {
        boolean z;
        C9092bs m9265a = C9092bs.m9265a();
        if (m9265a.m9264a(uri)) {
            String m9259d = m9265a.m9259d();
            switch (m9265a.m9262b()) {
                case NONE:
                    C9167dl c9167dl = this.f29021e.get(m9259d);
                    if (c9167dl != null) {
                        c9167dl.m9063b(null);
                        c9167dl.mo9061d();
                        break;
                    }
                    break;
                case CONTAINER:
                case CONTAINER_DEBUG:
                    for (String str : this.f29021e.keySet()) {
                        C9167dl c9167dl2 = this.f29021e.get(str);
                        if (str.equals(m9259d)) {
                            c9167dl2.m9063b(m9265a.m9260c());
                            c9167dl2.mo9061d();
                        } else if (c9167dl2.m9059f() != null) {
                            c9167dl2.m9063b(null);
                            c9167dl2.mo9061d();
                        }
                    }
                    break;
            }
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC9069b> m8933b(String str, @RawRes int i) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, null, str, i, this.f29022f);
        mo8926a.m9043c();
        return mo8926a;
    }

    /* renamed from: b */
    public AbstractC4494i<AbstractC9069b> m8932b(String str, @RawRes int i, Handler handler) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, handler.getLooper(), str, i, this.f29022f);
        mo8926a.m9043c();
        return mo8926a;
    }

    /* renamed from: b */
    public void m8935b() {
        this.f29020d.mo9184a();
    }

    /* renamed from: b */
    public boolean m8934b(C9167dl c9167dl) {
        return this.f29021e.remove(c9167dl.m9060e()) != null;
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC9069b> m8930c(String str, @RawRes int i) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, null, str, i, this.f29022f);
        mo8926a.m9038g();
        return mo8926a;
    }

    /* renamed from: c */
    public AbstractC4494i<AbstractC9069b> m8929c(String str, @RawRes int i, Handler handler) {
        C9170dm mo8926a = this.f29017a.mo8926a(this.f29018b, this, handler.getLooper(), str, i, this.f29022f);
        mo8926a.m9038g();
        return mo8926a;
    }
}
