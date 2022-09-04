package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.tagmanager.C9092bs;
import com.google.android.gms.tagmanager.C9184dr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.a */
/* loaded from: classes2.dex */
public class C9020a {

    /* renamed from: a */
    private final Context f28664a;

    /* renamed from: b */
    private final String f28665b;

    /* renamed from: c */
    private final C9196e f28666c;

    /* renamed from: d */
    private C9114cg f28667d;

    /* renamed from: g */
    private volatile long f28670g;

    /* renamed from: e */
    private Map<String, AbstractC9022a> f28668e = new HashMap();

    /* renamed from: f */
    private Map<String, AbstractC9023b> f28669f = new HashMap();

    /* renamed from: h */
    private volatile String f28671h = "";

    /* renamed from: com.google.android.gms.tagmanager.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9022a {
        /* renamed from: a */
        Object m9331a(String str, Map<String, Object> map);
    }

    /* renamed from: com.google.android.gms.tagmanager.a$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9023b {
        /* renamed from: a */
        void m9330a(String str, Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.a$c */
    /* loaded from: classes2.dex */
    public class C9024c implements C9184dr.AbstractC9185a {
        private C9024c() {
        }

        @Override // com.google.android.gms.tagmanager.C9184dr.AbstractC9185a
        /* renamed from: a */
        public Object mo9009a(String str, Map<String, Object> map) {
            AbstractC9022a m9336f = C9020a.this.m9336f(str);
            if (m9336f == null) {
                return null;
            }
            return m9336f.m9331a(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.tagmanager.a$d */
    /* loaded from: classes2.dex */
    public class C9025d implements C9184dr.AbstractC9185a {
        private C9025d() {
        }

        @Override // com.google.android.gms.tagmanager.C9184dr.AbstractC9185a
        /* renamed from: a */
        public Object mo9009a(String str, Map<String, Object> map) {
            AbstractC9023b m9334h = C9020a.this.m9334h(str);
            if (m9334h != null) {
                m9334h.m9330a(str, map);
            }
            return C9147cw.m9113f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9020a(Context context, C9196e c9196e, String str, long j, C6899en.C6903c c6903c) {
        this.f28664a = context;
        this.f28666c = c9196e;
        this.f28665b = str;
        this.f28670g = j;
        m9352a(c6903c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9020a(Context context, C9196e c9196e, String str, long j, AbstractC7030gi.C7040j c7040j) {
        this.f28664a = context;
        this.f28666c = c9196e;
        this.f28665b = str;
        this.f28670g = j;
        m9351a(c7040j.f23783b);
        if (c7040j.f23782a != null) {
            m9346a(c7040j.f23782a);
        }
    }

    /* renamed from: a */
    private void m9352a(C6899en.C6903c c6903c) {
        this.f28671h = c6903c.m15996c();
        m9350a(new C9114cg(this.f28664a, c6903c, this.f28666c, new C9024c(), new C9025d(), m9332j(this.f28671h)));
        if (m9349a("_gtm.loadEventEnabled")) {
            this.f28666c.m8966a("gtm.load", C9196e.m8961a("gtm.id", this.f28665b));
        }
    }

    /* renamed from: a */
    private void m9351a(AbstractC7030gi.C7036f c7036f) {
        if (c7036f == null) {
            throw new NullPointerException();
        }
        try {
            m9352a(C6899en.m16012a(c7036f));
        } catch (C6899en.C6907g e) {
            String valueOf = String.valueOf(c7036f);
            String valueOf2 = String.valueOf(e.toString());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length()).append("Not loading resource: ").append(valueOf).append(" because it is invalid: ").append(valueOf2).toString());
        }
    }

    /* renamed from: a */
    private synchronized void m9350a(C9114cg c9114cg) {
        this.f28667d = c9114cg;
    }

    /* renamed from: a */
    private void m9346a(AbstractC7030gi.C7039i[] c7039iArr) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7030gi.C7039i c7039i : c7039iArr) {
            arrayList.add(c7039i);
        }
        m9337f().m9215a(arrayList);
    }

    /* renamed from: f */
    private synchronized C9114cg m9337f() {
        return this.f28667d;
    }

    /* renamed from: a */
    public String m9353a() {
        return this.f28665b;
    }

    /* renamed from: a */
    public void m9348a(String str, AbstractC9022a abstractC9022a) {
        if (abstractC9022a == null) {
            throw new NullPointerException("Macro handler must be non-null");
        }
        synchronized (this.f28668e) {
            this.f28668e.put(str, abstractC9022a);
        }
    }

    /* renamed from: a */
    public void m9347a(String str, AbstractC9023b abstractC9023b) {
        if (abstractC9023b == null) {
            throw new NullPointerException("Tag callback must be non-null");
        }
        synchronized (this.f28669f) {
            this.f28669f.put(str, abstractC9023b);
        }
    }

    /* renamed from: a */
    public boolean m9349a(String str) {
        C9114cg m9337f = m9337f();
        if (m9337f == null) {
            C9065aw.m9301a("getBoolean called for closed container.");
            return C9147cw.m9121d().booleanValue();
        }
        try {
            return C9147cw.m9116e(m9337f.m9206b(str).m9288a()).booleanValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 66).append("Calling getBoolean() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return C9147cw.m9121d().booleanValue();
        }
    }

    /* renamed from: b */
    public double m9344b(String str) {
        C9114cg m9337f = m9337f();
        if (m9337f == null) {
            C9065aw.m9301a("getDouble called for closed container.");
            return C9147cw.m9125c().doubleValue();
        }
        try {
            return C9147cw.m9120d(m9337f.m9206b(str).m9288a()).doubleValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getDouble() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return C9147cw.m9125c().doubleValue();
        }
    }

    /* renamed from: b */
    public long m9345b() {
        return this.f28670g;
    }

    /* renamed from: c */
    public long m9342c(String str) {
        C9114cg m9337f = m9337f();
        if (m9337f == null) {
            C9065aw.m9301a("getLong called for closed container.");
            return C9147cw.m9129b().longValue();
        }
        try {
            return C9147cw.m9124c(m9337f.m9206b(str).m9288a()).longValue();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 63).append("Calling getLong() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return C9147cw.m9129b().longValue();
        }
    }

    /* renamed from: c */
    public boolean m9343c() {
        return m9345b() == 0;
    }

    /* renamed from: d */
    public String m9341d() {
        return this.f28671h;
    }

    /* renamed from: d */
    public String m9340d(String str) {
        C9114cg m9337f = m9337f();
        if (m9337f == null) {
            C9065aw.m9301a("getString called for closed container.");
            return C9147cw.m9113f();
        }
        try {
            return C9147cw.m9132a(m9337f.m9206b(str).m9288a());
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            C9065aw.m9301a(new StringBuilder(String.valueOf(valueOf).length() + 65).append("Calling getString() threw an exception: ").append(valueOf).append(" Returning default value.").toString());
            return C9147cw.m9113f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m9339e() {
        this.f28667d = null;
    }

    /* renamed from: e */
    public void m9338e(String str) {
        synchronized (this.f28668e) {
            this.f28668e.remove(str);
        }
    }

    /* renamed from: f */
    AbstractC9022a m9336f(String str) {
        AbstractC9022a abstractC9022a;
        synchronized (this.f28668e) {
            abstractC9022a = this.f28668e.get(str);
        }
        return abstractC9022a;
    }

    /* renamed from: g */
    public void m9335g(String str) {
        synchronized (this.f28669f) {
            this.f28669f.remove(str);
        }
    }

    /* renamed from: h */
    public AbstractC9023b m9334h(String str) {
        AbstractC9023b abstractC9023b;
        synchronized (this.f28669f) {
            abstractC9023b = this.f28669f.get(str);
        }
        return abstractC9023b;
    }

    /* renamed from: i */
    public void m9333i(String str) {
        m9337f().m9218a(str);
    }

    /* renamed from: j */
    AbstractC9226q m9332j(String str) {
        if (C9092bs.m9265a().m9262b().equals(C9092bs.EnumC9093a.CONTAINER_DEBUG)) {
        }
        return new C9075be();
    }
}
