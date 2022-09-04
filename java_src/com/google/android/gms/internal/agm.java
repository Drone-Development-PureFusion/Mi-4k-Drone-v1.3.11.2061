package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.C4235f;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.AbstractC4418b;
import com.google.android.gms.cast.internal.AbstractC4419c;
import com.google.android.gms.cast.internal.AbstractC4444p;
import com.google.android.gms.cast.internal.C4423e;
import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.cast.internal.C4445q;
import com.google.android.gms.cast.p233a.AbstractC4223b;
import com.google.android.gms.cast.p233a.AbstractC4224c;
import com.google.android.gms.cast.p233a.C4219a;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.AbstractC4503n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class agm extends AbstractC4419c {

    /* renamed from: g */
    static final String f21582g = C4430f.m24203b("com.google.cast.games");

    /* renamed from: h */
    private static final C4440m f21583h = new C4440m("GameManagerChannel");

    /* renamed from: j */
    private final List<C4445q> f21585j;

    /* renamed from: k */
    private final SharedPreferences f21586k;

    /* renamed from: l */
    private final String f21587l;

    /* renamed from: m */
    private final C4201a.AbstractC4204b f21588m;

    /* renamed from: n */
    private final AbstractC4489g f21589n;

    /* renamed from: o */
    private agn f21590o;

    /* renamed from: q */
    private AbstractC4223b f21592q;

    /* renamed from: r */
    private AbstractC4223b f21593r;

    /* renamed from: s */
    private String f21594s;

    /* renamed from: t */
    private JSONObject f21595t;

    /* renamed from: v */
    private C4219a.AbstractC4222c f21597v;

    /* renamed from: w */
    private final AbstractC4682e f21598w;

    /* renamed from: x */
    private String f21599x;

    /* renamed from: i */
    private final Map<String, String> f21584i = new ConcurrentHashMap();

    /* renamed from: p */
    private boolean f21591p = false;

    /* renamed from: u */
    private long f21596u = 0;

    /* renamed from: com.google.android.gms.internal.agm$a */
    /* loaded from: classes2.dex */
    public abstract class AbstractC6297a extends AbstractC6299b<C4219a.AbstractC4221b> {
        public AbstractC6297a() {
            super();
            this.f21614f = new AbstractC4444p() { // from class: com.google.android.gms.internal.agm.a.1
                @Override // com.google.android.gms.cast.internal.AbstractC4444p
                /* renamed from: a */
                public void mo17629a(long j) {
                    AbstractC6297a.this.b((AbstractC6297a) ((C4219a.AbstractC4221b) AbstractC6297a.this.mo7807b(new Status(2103))));
                }

                @Override // com.google.android.gms.cast.internal.AbstractC4444p
                /* renamed from: a */
                public void mo17628a(long j, int i, Object obj) {
                    try {
                        if (obj == null) {
                            AbstractC6297a.this.b((AbstractC6297a) new C6303e(new Status(i, null, null), null, j, null));
                            return;
                        }
                        ago agoVar = (ago) obj;
                        String m17609j = agoVar.m17609j();
                        if (i == 0 && m17609j != null) {
                            agm.this.f21599x = m17609j;
                        }
                        AbstractC6297a.this.b((AbstractC6297a) new C6303e(new Status(i, agoVar.m17616c(), null), m17609j, agoVar.m17608k(), agoVar.m17615d()));
                    } catch (ClassCastException e) {
                        AbstractC6297a.this.b((AbstractC6297a) ((C4219a.AbstractC4221b) AbstractC6297a.this.mo7807b(new Status(13))));
                    }
                }
            };
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C4219a.AbstractC4221b mo7807b(Status status) {
            return new C6303e(status, null, -1L, null);
        }
    }

    /* renamed from: com.google.android.gms.internal.agm$b */
    /* loaded from: classes2.dex */
    public abstract class AbstractC6299b<R extends AbstractC4502m> extends AbstractC4418b<R> {

        /* renamed from: f */
        protected AbstractC4444p f21614f;

        public AbstractC6299b() {
            super(agm.this.f21589n);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C4423e c4423e) {
            mo17633b();
        }

        /* renamed from: b */
        public abstract void mo17633b();

        /* renamed from: c */
        public AbstractC4444p m17632c() {
            return this.f21614f;
        }
    }

    /* renamed from: com.google.android.gms.internal.agm$c */
    /* loaded from: classes2.dex */
    public abstract class AbstractC6300c extends AbstractC6299b<C4219a.AbstractC4220a> {

        /* renamed from: a */
        private C4219a f21616a;

        public AbstractC6300c(C4219a c4219a) {
            super();
            this.f21616a = c4219a;
            this.f21614f = new AbstractC4444p() { // from class: com.google.android.gms.internal.agm.c.1
                @Override // com.google.android.gms.cast.internal.AbstractC4444p
                /* renamed from: a */
                public void mo17629a(long j) {
                    AbstractC6300c.this.b((AbstractC6300c) ((C4219a.AbstractC4220a) AbstractC6300c.this.mo7807b(new Status(2103))));
                }

                @Override // com.google.android.gms.cast.internal.AbstractC4444p
                /* renamed from: a */
                public void mo17628a(long j, int i, Object obj) {
                    try {
                        if (obj == null) {
                            AbstractC6300c.this.b((AbstractC6300c) new C6302d(new Status(i, null, null), AbstractC6300c.this.f21616a));
                        } else {
                            ago agoVar = (ago) obj;
                            agn m17606m = agoVar.m17606m();
                            if (m17606m == null || C4430f.m24206a("1.0.0", m17606m.m17621c())) {
                                AbstractC6300c.this.b((AbstractC6300c) new C6302d(new Status(i, agoVar.m17616c(), null), AbstractC6300c.this.f21616a));
                            } else {
                                agm.this.f21590o = null;
                                AbstractC6300c.this.b((AbstractC6300c) ((C4219a.AbstractC4220a) AbstractC6300c.this.mo7807b(new Status(C4219a.f16057a, String.format(Locale.ROOT, "Incorrect Game Manager SDK version. Receiver: %s Sender: %s", m17606m.m17621c(), "1.0.0")))));
                            }
                        }
                    } catch (ClassCastException e) {
                        AbstractC6300c.this.b((AbstractC6300c) ((C4219a.AbstractC4220a) AbstractC6300c.this.mo7807b(new Status(13))));
                    }
                }
            };
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public C4219a.AbstractC4220a mo7807b(Status status) {
            return new C6302d(status, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.agm$d */
    /* loaded from: classes2.dex */
    public static final class C6302d implements C4219a.AbstractC4220a {

        /* renamed from: a */
        private final Status f21620a;

        /* renamed from: b */
        private final C4219a f21621b;

        C6302d(Status status, C4219a c4219a) {
            this.f21620a = status;
            this.f21621b = c4219a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21620a;
        }

        @Override // com.google.android.gms.cast.p233a.C4219a.AbstractC4220a
        /* renamed from: b */
        public C4219a mo17627b() {
            return this.f21621b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.agm$e */
    /* loaded from: classes2.dex */
    public static final class C6303e implements C4219a.AbstractC4221b {

        /* renamed from: a */
        private final Status f21622a;

        /* renamed from: b */
        private final String f21623b;

        /* renamed from: c */
        private final long f21624c;

        /* renamed from: d */
        private final JSONObject f21625d;

        C6303e(Status status, String str, long j, JSONObject jSONObject) {
            this.f21622a = status;
            this.f21623b = str;
            this.f21624c = j;
            this.f21625d = jSONObject;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f21622a;
        }

        @Override // com.google.android.gms.cast.p233a.C4219a.AbstractC4221b
        /* renamed from: b */
        public String mo17626b() {
            return this.f21623b;
        }

        @Override // com.google.android.gms.cast.p233a.C4219a.AbstractC4221b
        /* renamed from: c */
        public long mo17625c() {
            return this.f21624c;
        }

        @Override // com.google.android.gms.cast.p233a.C4219a.AbstractC4221b
        /* renamed from: d */
        public JSONObject mo17624d() {
            return this.f21625d;
        }
    }

    public agm(AbstractC4489g abstractC4489g, String str, C4201a.AbstractC4204b abstractC4204b) {
        super(f21582g, "CastGameManagerChannel", null);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("castSessionId cannot be null.");
        }
        if (abstractC4489g == null || !abstractC4489g.mo17353j() || !abstractC4489g.mo17369b(C4201a.f16031k)) {
            throw new IllegalArgumentException("googleApiClient needs to be connected and contain the Cast.API API.");
        }
        this.f21598w = C4685h.m23138d();
        this.f21585j = new ArrayList();
        this.f21587l = str;
        this.f21588m = abstractC4204b;
        this.f21589n = abstractC4489g;
        Context applicationContext = abstractC4489g.mo17372b().getApplicationContext();
        this.f21586k = applicationContext.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", applicationContext.getPackageName(), "game_manager_channel_data"), 0);
        this.f21593r = null;
        this.f21592q = new agq(0, 0, "", null, new ArrayList(), "", -1);
    }

    /* renamed from: a */
    private int m17668a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 2001;
            case 2:
                return C4235f.f16106h;
            case 3:
                return C4219a.f16057a;
            case 4:
                return C4219a.f16058b;
            default:
                f21583h.m24155d(new StringBuilder(53).append("Unknown GameManager protocol status code: ").append(i).toString(), new Object[0]);
                return 13;
        }
    }

    /* renamed from: a */
    private JSONObject m17664a(long j, String str, int i, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("requestId", j);
            jSONObject2.put("type", i);
            jSONObject2.put("extraMessageData", jSONObject);
            jSONObject2.put("playerId", str);
            jSONObject2.put("playerToken", m17649c(str));
            return jSONObject2;
        } catch (JSONException e) {
            f21583h.m24155d("JSONException when trying to create a message: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private void m17665a(long j, int i, Object obj) {
        Iterator<C4445q> it2 = this.f21585j.iterator();
        while (it2.hasNext()) {
            if (it2.next().m24115a(j, i, obj)) {
                it2.remove();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m17657a(ago agoVar) {
        boolean z = true;
        synchronized (this) {
            if (agoVar.m17620a() != 1) {
                z = false;
            }
            this.f21593r = this.f21592q;
            if (z && agoVar.m17606m() != null) {
                this.f21590o = agoVar.m17606m();
            }
            if (m17643h()) {
                ArrayList arrayList = new ArrayList();
                for (ags agsVar : agoVar.m17612g()) {
                    String m17577c = agsVar.m17577c();
                    arrayList.add(new agr(m17577c, agsVar.m17579a(), agsVar.m17578b(), this.f21584i.containsKey(m17577c)));
                }
                this.f21592q = new agq(agoVar.m17613f(), agoVar.m17614e(), agoVar.m17610i(), agoVar.m17611h(), arrayList, this.f21590o.m17623a(), this.f21590o.m17622b());
                AbstractC4224c mo17601a = this.f21592q.mo17601a(agoVar.m17609j());
                if (mo17601a != null && mo17601a.mo17580e() && agoVar.m17620a() == 2) {
                    this.f21594s = agoVar.m17609j();
                    this.f21595t = agoVar.m17615d();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m17655a(String str, int i, JSONObject jSONObject, AbstractC4444p abstractC4444p) {
        final long j = 1 + this.f21596u;
        this.f21596u = j;
        JSONObject m17664a = m17664a(j, str, i, jSONObject);
        if (m17664a == null) {
            abstractC4444p.mo17628a(-1L, 2001, null);
            f21583h.m24155d("Not sending request because it was invalid.", new Object[0]);
            return;
        }
        C4445q c4445q = new C4445q(this.f21598w, NotificationOptions.f16268b);
        c4445q.m24114a(j, abstractC4444p);
        this.f21585j.add(c4445q);
        a(true);
        this.f21588m.mo24951a(this.f21589n, b(), m17664a.toString()).mo13673a(new AbstractC4503n<Status>() { // from class: com.google.android.gms.internal.agm.4
            @Override // com.google.android.gms.common.api.AbstractC4503n
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7161a(Status status) {
                if (!status.m24018f()) {
                    agm.this.mo17666a(j, status.m24015i());
                }
            }
        });
    }

    /* renamed from: j */
    private synchronized void m17641j() {
        if (!m17643h()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel before it is initialized.");
        }
        if (m17644g()) {
            throw new IllegalStateException("Attempted to perform an operation on the GameManagerChannel after it has been disposed.");
        }
    }

    /* renamed from: k */
    private void m17640k() {
        if (this.f21597v != null) {
            if (this.f21593r != null && !this.f21592q.equals(this.f21593r)) {
                this.f21597v.m24958a(this.f21592q, this.f21593r);
            }
            if (this.f21595t != null && this.f21594s != null) {
                this.f21597v.m24957a(this.f21594s, this.f21595t);
            }
        }
        this.f21593r = null;
        this.f21594s = null;
        this.f21595t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public synchronized void m17639l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("castSessionId", this.f21587l);
            jSONObject.put("playerTokenMap", new JSONObject(this.f21584i));
            this.f21586k.edit().putString("save_data", jSONObject.toString()).commit();
        } catch (JSONException e) {
            f21583h.m24155d("Error while saving data: %s", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public synchronized void m17638m() {
        String string = this.f21586k.getString("save_data", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (this.f21587l.equals(jSONObject.getString("castSessionId"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("playerTokenMap");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f21584i.put(next, jSONObject2.getString(next));
                    }
                    this.f21596u = 0L;
                }
            } catch (JSONException e) {
                f21583h.m24155d("Error while loading data: %s", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public synchronized AbstractC4494i<C4219a.AbstractC4220a> m17662a(C4219a c4219a) {
        if (c4219a == null) {
            throw new IllegalArgumentException("gameManagerClient can't be null.");
        }
        return this.f21589n.mo17253b((AbstractC4489g) new AbstractC6300c(c4219a) { // from class: com.google.android.gms.internal.agm.1
            @Override // com.google.android.gms.internal.agm.AbstractC6299b
            /* renamed from: b */
            public void mo17633b() {
                try {
                    agm.this.f21588m.mo24952a(agm.this.f21589n, agm.this.b(), new C4201a.AbstractC4216e() { // from class: com.google.android.gms.internal.agm.1.1
                        @Override // com.google.android.gms.cast.C4201a.AbstractC4216e
                        /* renamed from: a */
                        public void mo17637a(CastDevice castDevice, String str, String str2) {
                            agm.this.mo17652b(str2);
                        }
                    });
                    agm.this.m17638m();
                    agm.this.m17639l();
                    agm.this.m17655a((String) null, 1100, (JSONObject) null, c());
                } catch (IOException | IllegalStateException e) {
                    c().mo17628a(-1L, 8, null);
                }
            }
        });
    }

    /* renamed from: a */
    public synchronized AbstractC4494i<C4219a.AbstractC4221b> m17656a(final String str, final int i, final JSONObject jSONObject) {
        m17641j();
        return this.f21589n.mo17253b((AbstractC4489g) new AbstractC6297a() { // from class: com.google.android.gms.internal.agm.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.agm.AbstractC6299b
            /* renamed from: b */
            public void mo17633b() {
                int m17605a = agp.m17605a(i);
                if (m17605a != 0) {
                    agm.this.m17655a(str, m17605a, jSONObject, c());
                    return;
                }
                c().mo17628a(-1L, 2001, null);
                agm.f21583h.m24155d("sendPlayerRequest for unsupported playerState: %d", Integer.valueOf(i));
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: a */
    public void mo17666a(long j, int i) {
        m17665a(j, i, (Object) null);
    }

    /* renamed from: a */
    public synchronized void m17663a(C4219a.AbstractC4222c abstractC4222c) {
        this.f21597v = abstractC4222c;
    }

    /* renamed from: a */
    public synchronized void m17654a(String str, JSONObject jSONObject) {
        m17641j();
        long j = 1 + this.f21596u;
        this.f21596u = j;
        JSONObject m17664a = m17664a(j, str, 7, jSONObject);
        if (m17664a != null) {
            this.f21588m.mo24951a(this.f21589n, b(), m17664a.toString());
        }
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4419c
    /* renamed from: a */
    protected boolean mo17667a(long j) {
        boolean z;
        Iterator<C4445q> it2 = this.f21585j.iterator();
        while (it2.hasNext()) {
            if (it2.next().m24112b(j, 15)) {
                it2.remove();
            }
        }
        synchronized (C4445q.f16691a) {
            Iterator<C4445q> it3 = this.f21585j.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                } else if (it3.next().m24113b()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public synchronized AbstractC4494i<C4219a.AbstractC4221b> m17651b(final String str, final JSONObject jSONObject) {
        m17641j();
        return this.f21589n.mo17253b((AbstractC4489g) new AbstractC6297a() { // from class: com.google.android.gms.internal.agm.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.android.gms.internal.agm.AbstractC6299b
            /* renamed from: b */
            public void mo17633b() {
                agm.this.m17655a(str, 6, jSONObject, c());
            }
        });
    }

    @Override // com.google.android.gms.cast.internal.AbstractC4422d
    /* renamed from: b */
    public final void mo17652b(String str) {
        f21583h.m24160b("message received: %s", str);
        try {
            ago m17618a = ago.m17618a(new JSONObject(str));
            if (m17618a == null) {
                f21583h.m24155d("Could not parse game manager message from string: %s", str);
            } else if ((!m17643h() && m17618a.m17606m() == null) || m17644g()) {
            } else {
                boolean z = m17618a.m17620a() == 1;
                if (z && !TextUtils.isEmpty(m17618a.m17607l())) {
                    this.f21584i.put(m17618a.m17609j(), m17618a.m17607l());
                    m17639l();
                }
                if (m17618a.m17617b() == 0) {
                    m17657a(m17618a);
                } else {
                    f21583h.m24155d("Not updating from game message because the message contains error code: %d", Integer.valueOf(m17618a.m17617b()));
                }
                int m17668a = m17668a(m17618a.m17617b());
                if (z) {
                    m17665a(m17618a.m17608k(), m17668a, m17618a);
                }
                if (!m17643h() || m17668a != 0) {
                    return;
                }
                m17640k();
            }
        } catch (JSONException e) {
            f21583h.m24155d("Message is malformed (%s); ignoring: %s", e.getMessage(), str);
        }
    }

    /* renamed from: c */
    public synchronized String m17649c(String str) {
        return str == null ? null : this.f21584i.get(str);
    }

    /* renamed from: d */
    public synchronized void m17648d() {
        if (!this.f21591p) {
            this.f21592q = null;
            this.f21593r = null;
            this.f21594s = null;
            this.f21595t = null;
            this.f21591p = true;
            try {
                this.f21588m.mo24941d(this.f21589n, b());
            } catch (IOException e) {
                f21583h.m24155d("Exception while detaching game manager channel.", e);
            }
        }
    }

    /* renamed from: e */
    public synchronized AbstractC4223b m17646e() {
        m17641j();
        return this.f21592q;
    }

    /* renamed from: f */
    public synchronized String m17645f() {
        m17641j();
        return this.f21599x;
    }

    /* renamed from: g */
    public synchronized boolean m17644g() {
        return this.f21591p;
    }

    /* renamed from: h */
    public synchronized boolean m17643h() {
        return this.f21590o != null;
    }
}
