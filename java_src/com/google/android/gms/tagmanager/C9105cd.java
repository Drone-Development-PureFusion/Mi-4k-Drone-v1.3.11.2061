package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.tagmanager.C9170dm;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.cd */
/* loaded from: classes2.dex */
public class C9105cd implements C9170dm.AbstractC9178e {

    /* renamed from: a */
    private final String f28786a;

    /* renamed from: b */
    private final Context f28787b;

    /* renamed from: c */
    private final ScheduledExecutorService f28788c;

    /* renamed from: d */
    private final AbstractC9108a f28789d;

    /* renamed from: e */
    private ScheduledFuture<?> f28790e;

    /* renamed from: f */
    private boolean f28791f;

    /* renamed from: g */
    private C9183dq f28792g;

    /* renamed from: h */
    private String f28793h;

    /* renamed from: i */
    private AbstractC9063av<AbstractC7030gi.C7040j> f28794i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.cd$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9108a {
        /* renamed from: a */
        RunnableC9104cc mo9235a(C9183dq c9183dq);
    }

    /* renamed from: com.google.android.gms.tagmanager.cd$b */
    /* loaded from: classes2.dex */
    interface AbstractC9109b {
        /* renamed from: a */
        ScheduledExecutorService mo9234a();
    }

    public C9105cd(Context context, String str, C9183dq c9183dq) {
        this(context, str, c9183dq, null, null);
    }

    C9105cd(Context context, String str, C9183dq c9183dq, AbstractC9109b abstractC9109b, AbstractC9108a abstractC9108a) {
        this.f28792g = c9183dq;
        this.f28787b = context;
        this.f28786a = str;
        this.f28788c = (abstractC9109b == null ? new AbstractC9109b() { // from class: com.google.android.gms.tagmanager.cd.1
            @Override // com.google.android.gms.tagmanager.C9105cd.AbstractC9109b
            /* renamed from: a */
            public ScheduledExecutorService mo9234a() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        } : abstractC9109b).mo9234a();
        if (abstractC9108a == null) {
            this.f28789d = new AbstractC9108a() { // from class: com.google.android.gms.tagmanager.cd.2
                @Override // com.google.android.gms.tagmanager.C9105cd.AbstractC9108a
                /* renamed from: a */
                public RunnableC9104cc mo9235a(C9183dq c9183dq2) {
                    return new RunnableC9104cc(C9105cd.this.f28787b, C9105cd.this.f28786a, c9183dq2);
                }
            };
        } else {
            this.f28789d = abstractC9108a;
        }
    }

    /* renamed from: a */
    private synchronized void m9239a() {
        if (this.f28791f) {
            throw new IllegalStateException("called method after closed");
        }
    }

    /* renamed from: b */
    private RunnableC9104cc m9236b(String str) {
        RunnableC9104cc mo9235a = this.f28789d.mo9235a(this.f28792g);
        mo9235a.m9244a(this.f28794i);
        mo9235a.m9243a(this.f28793h);
        mo9235a.m9241b(str);
        return mo9235a;
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9178e
    /* renamed from: a */
    public synchronized void mo9023a(long j, String str) {
        String str2 = this.f28786a;
        C9065aw.m9295e(new StringBuilder(String.valueOf(str2).length() + 55).append("loadAfterDelay: containerId=").append(str2).append(" delay=").append(j).toString());
        m9239a();
        if (this.f28794i == null) {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        if (this.f28790e != null) {
            this.f28790e.cancel(false);
        }
        this.f28790e = this.f28788c.schedule(m9236b(str), j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9178e
    /* renamed from: a */
    public synchronized void mo9022a(AbstractC9063av<AbstractC7030gi.C7040j> abstractC9063av) {
        m9239a();
        this.f28794i = abstractC9063av;
    }

    @Override // com.google.android.gms.tagmanager.C9170dm.AbstractC9178e
    /* renamed from: a */
    public synchronized void mo9021a(String str) {
        m9239a();
        this.f28793h = str;
    }

    @Override // com.google.android.gms.common.api.AbstractC4500k
    /* renamed from: b */
    public synchronized void mo7804b() {
        m9239a();
        if (this.f28790e != null) {
            this.f28790e.cancel(false);
        }
        this.f28788c.shutdown();
        this.f28791f = true;
    }
}
