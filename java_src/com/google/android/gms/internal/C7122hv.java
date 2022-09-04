package com.google.android.gms.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.p286a.p287a.C11086e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.hv */
/* loaded from: classes2.dex */
public class C7122hv {

    /* renamed from: a */
    private static long f23986a = 0;

    /* renamed from: b */
    private AbstractC7126b f23987b;

    /* renamed from: c */
    private boolean f23988c = false;

    /* renamed from: d */
    private boolean f23989d = false;

    /* renamed from: e */
    private long f23990e = 0;

    /* renamed from: f */
    private C7135hx f23991f;

    /* renamed from: g */
    private AbstractC7125a f23992g;

    /* renamed from: h */
    private ScheduledFuture<?> f23993h;

    /* renamed from: i */
    private ScheduledFuture<?> f23994i;

    /* renamed from: j */
    private final C7099hn f23995j;

    /* renamed from: k */
    private final ScheduledExecutorService f23996k;

    /* renamed from: l */
    private final C7315ks f23997l;

    /* renamed from: com.google.android.gms.internal.hv$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7125a {
        /* renamed from: a */
        void mo15460a(Map<String, Object> map);

        /* renamed from: a */
        void mo15459a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hv$b */
    /* loaded from: classes2.dex */
    public interface AbstractC7126b {
        /* renamed from: a */
        void mo15458a();

        /* renamed from: a */
        void mo15457a(String str);

        /* renamed from: b */
        void mo15456b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hv$c */
    /* loaded from: classes2.dex */
    public class C7127c implements AbstractC7126b, AbstractC7370lt {

        /* renamed from: b */
        private C7365ls f24001b;

        private C7127c(C7365ls c7365ls) {
            this.f24001b = c7365ls;
            this.f24001b.m14688a(this);
        }

        /* renamed from: e */
        private void m15455e() {
            this.f24001b.m14680e();
            try {
                this.f24001b.m14678g();
            } catch (InterruptedException e) {
                C7122hv.this.f23997l.m14842a("Interrupted while shutting down websocket threads", e);
            }
        }

        @Override // com.google.android.gms.internal.C7122hv.AbstractC7126b
        /* renamed from: a */
        public void mo15458a() {
            try {
                this.f24001b.m14681d();
            } catch (C7371lu e) {
                if (C7122hv.this.f23997l.m14844a()) {
                    C7122hv.this.f23997l.m14841a("Error connecting", e, new Object[0]);
                }
                m15455e();
            }
        }

        @Override // com.google.android.gms.internal.AbstractC7370lt
        /* renamed from: a */
        public void mo14671a(final C7371lu c7371lu) {
            C7122hv.this.f23996k.execute(new Runnable() { // from class: com.google.android.gms.internal.hv.c.4
                @Override // java.lang.Runnable
                public void run() {
                    if (c7371lu.getCause() == null || !(c7371lu.getCause() instanceof EOFException)) {
                        C7122hv.this.f23997l.m14841a("WebSocket error.", c7371lu, new Object[0]);
                    } else {
                        C7122hv.this.f23997l.m14840a("WebSocket reached EOF.", new Object[0]);
                    }
                    C7122hv.this.m15464g();
                }
            });
        }

        @Override // com.google.android.gms.internal.AbstractC7370lt
        /* renamed from: a */
        public void mo14670a(C7373lw c7373lw) {
            final String m14661a = c7373lw.m14661a();
            if (C7122hv.this.f23997l.m14844a()) {
                C7315ks c7315ks = C7122hv.this.f23997l;
                String valueOf = String.valueOf(m14661a);
                c7315ks.m14840a(valueOf.length() != 0 ? "ws message: ".concat(valueOf) : new String("ws message: "), new Object[0]);
            }
            C7122hv.this.f23996k.execute(new Runnable() { // from class: com.google.android.gms.internal.hv.c.2
                @Override // java.lang.Runnable
                public void run() {
                    C7122hv.this.m15471c(m14661a);
                }
            });
        }

        @Override // com.google.android.gms.internal.C7122hv.AbstractC7126b
        /* renamed from: a */
        public void mo15457a(String str) {
            this.f24001b.m14686a(str);
        }

        @Override // com.google.android.gms.internal.C7122hv.AbstractC7126b
        /* renamed from: b */
        public void mo15456b() {
            this.f24001b.m14680e();
        }

        @Override // com.google.android.gms.internal.AbstractC7370lt
        /* renamed from: c */
        public void mo14669c() {
            C7122hv.this.f23996k.execute(new Runnable() { // from class: com.google.android.gms.internal.hv.c.1
                @Override // java.lang.Runnable
                public void run() {
                    C7122hv.this.f23994i.cancel(false);
                    C7122hv.this.f23988c = true;
                    if (C7122hv.this.f23997l.m14844a()) {
                        C7122hv.this.f23997l.m14840a("websocket opened", new Object[0]);
                    }
                    C7122hv.this.m15470d();
                }
            });
        }

        @Override // com.google.android.gms.internal.AbstractC7370lt
        /* renamed from: d */
        public void mo14668d() {
            C7122hv.this.f23996k.execute(new Runnable() { // from class: com.google.android.gms.internal.hv.c.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C7122hv.this.f23997l.m14844a()) {
                        C7122hv.this.f23997l.m14840a("closed", new Object[0]);
                    }
                    C7122hv.this.m15464g();
                }
            });
        }
    }

    public C7122hv(C7099hn c7099hn, C7101hp c7101hp, String str, AbstractC7125a abstractC7125a, String str2) {
        this.f23995j = c7099hn;
        this.f23996k = c7099hn.m15582c();
        this.f23992g = abstractC7125a;
        long j = f23986a;
        f23986a = 1 + j;
        this.f23997l = new C7315ks(c7099hn.m15584a(), "WebSocket", new StringBuilder(23).append("ws_").append(j).toString());
        this.f23987b = m15483a(c7101hp, str, str2);
    }

    /* renamed from: a */
    private AbstractC7126b m15483a(C7101hp c7101hp, String str, String str2) {
        if (str == null) {
            str = c7101hp.m15573a();
        }
        URI m15572a = C7101hp.m15572a(str, c7101hp.m15570c(), c7101hp.m15571b(), str2);
        HashMap hashMap = new HashMap();
        hashMap.put(C11086e.f35703Y, this.f23995j.m15579f());
        return new C7127c(new C7365ls(m15572a, null, hashMap));
    }

    /* renamed from: a */
    private void m15484a(int i) {
        this.f23990e = i;
        this.f23991f = new C7135hx();
        if (this.f23997l.m14844a()) {
            this.f23997l.m14840a(new StringBuilder(41).append("HandleNewFrameCount: ").append(this.f23990e).toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    private void m15479a(String str) {
        this.f23991f.m15442a(str);
        this.f23990e--;
        if (this.f23990e == 0) {
            try {
                this.f23991f.m15444a();
                Map<String, Object> m14635a = C7380mb.m14635a(this.f23991f.toString());
                this.f23991f = null;
                if (this.f23997l.m14844a()) {
                    C7315ks c7315ks = this.f23997l;
                    String valueOf = String.valueOf(m14635a);
                    c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 36).append("handleIncomingFrame complete frame: ").append(valueOf).toString(), new Object[0]);
                }
                this.f23992g.mo15460a(m14635a);
            } catch (IOException e) {
                C7315ks c7315ks2 = this.f23997l;
                String valueOf2 = String.valueOf(this.f23991f.toString());
                c7315ks2.m14842a(valueOf2.length() != 0 ? "Error parsing frame: ".concat(valueOf2) : new String("Error parsing frame: "), e);
                m15473c();
                m15462h();
            } catch (ClassCastException e2) {
                C7315ks c7315ks3 = this.f23997l;
                String valueOf3 = String.valueOf(this.f23991f.toString());
                c7315ks3.m14842a(valueOf3.length() != 0 ? "Error parsing frame (cast error): ".concat(valueOf3) : new String("Error parsing frame (cast error): "), e2);
                m15473c();
                m15462h();
            }
        }
    }

    /* renamed from: a */
    private static String[] m15478a(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            arrayList.add(str.substring(i2, Math.min(i2 + i, str.length())));
            i2 += i;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    private String m15474b(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    m15484a(parseInt);
                }
                return null;
            } catch (NumberFormatException e) {
            }
        }
        m15484a(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m15471c(String str) {
        if (!this.f23989d) {
            m15470d();
            if (m15466f()) {
                m15479a(str);
                return;
            }
            String m15474b = m15474b(str);
            if (m15474b == null) {
                return;
            }
            m15479a(m15474b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m15470d() {
        if (!this.f23989d) {
            if (this.f23993h != null) {
                this.f23993h.cancel(false);
                if (this.f23997l.m14844a()) {
                    this.f23997l.m14840a(new StringBuilder(48).append("Reset keepAlive. Remaining: ").append(this.f23993h.getDelay(TimeUnit.MILLISECONDS)).toString(), new Object[0]);
                }
            } else if (this.f23997l.m14844a()) {
                this.f23997l.m14840a("Reset keepAlive", new Object[0]);
            }
            this.f23993h = this.f23996k.schedule(m15468e(), 45000L, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: e */
    private Runnable m15468e() {
        return new Runnable() { // from class: com.google.android.gms.internal.hv.2
            @Override // java.lang.Runnable
            public void run() {
                if (C7122hv.this.f23987b != null) {
                    C7122hv.this.f23987b.mo15457a("0");
                    C7122hv.this.m15470d();
                }
            }
        };
    }

    /* renamed from: f */
    private boolean m15466f() {
        return this.f23991f != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m15464g() {
        if (!this.f23989d) {
            if (this.f23997l.m14844a()) {
                this.f23997l.m14840a("closing itself", new Object[0]);
            }
            m15462h();
        }
        this.f23987b = null;
        if (this.f23993h != null) {
            this.f23993h.cancel(false);
        }
    }

    /* renamed from: h */
    private void m15462h() {
        this.f23989d = true;
        this.f23992g.mo15459a(this.f23988c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m15461i() {
        if (this.f23988c || this.f23989d) {
            return;
        }
        if (this.f23997l.m14844a()) {
            this.f23997l.m14840a("timed out on connect", new Object[0]);
        }
        this.f23987b.mo15456b();
    }

    /* renamed from: a */
    public void m15485a() {
        this.f23987b.mo15458a();
        this.f23994i = this.f23996k.schedule(new Runnable() { // from class: com.google.android.gms.internal.hv.1
            @Override // java.lang.Runnable
            public void run() {
                C7122hv.this.m15461i();
            }
        }, NotificationOptions.f16268b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m15477a(Map<String, Object> map) {
        m15470d();
        try {
            String[] m15478a = m15478a(C7380mb.m14634a(map), 16384);
            if (m15478a.length > 1) {
                this.f23987b.mo15457a(new StringBuilder(11).append(m15478a.length).toString());
            }
            for (String str : m15478a) {
                this.f23987b.mo15457a(str);
            }
        } catch (IOException e) {
            C7315ks c7315ks = this.f23997l;
            String valueOf = String.valueOf(map.toString());
            c7315ks.m14842a(valueOf.length() != 0 ? "Failed to serialize message: ".concat(valueOf) : new String("Failed to serialize message: "), e);
            m15462h();
        }
    }

    /* renamed from: b */
    public void m15476b() {
    }

    /* renamed from: c */
    public void m15473c() {
        if (this.f23997l.m14844a()) {
            this.f23997l.m14840a("websocket is being closed", new Object[0]);
        }
        this.f23989d = true;
        this.f23987b.mo15456b();
        if (this.f23994i != null) {
            this.f23994i.cancel(true);
        }
        if (this.f23993h != null) {
            this.f23993h.cancel(true);
        }
    }
}
