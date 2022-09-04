package com.google.android.gms.internal;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.AbstractC7097hm;
import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.C7093hl;
import com.google.android.gms.internal.C7132hw;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
import p005b.p006a.p007a.p029b.p052m.p053a.C0620k;
/* renamed from: com.google.android.gms.internal.hs */
/* loaded from: classes2.dex */
public class C7105hs implements C7093hl.AbstractC7094a, AbstractC7103hr {

    /* renamed from: a */
    static final /* synthetic */ boolean f23917a;

    /* renamed from: b */
    private static long f23918b;

    /* renamed from: B */
    private long f23920B;

    /* renamed from: C */
    private boolean f23921C;

    /* renamed from: c */
    private final AbstractC7103hr.AbstractC7104a f23922c;

    /* renamed from: d */
    private final C7101hp f23923d;

    /* renamed from: e */
    private String f23924e;

    /* renamed from: h */
    private long f23927h;

    /* renamed from: i */
    private C7093hl f23928i;

    /* renamed from: q */
    private String f23936q;

    /* renamed from: r */
    private boolean f23937r;

    /* renamed from: s */
    private final C7099hn f23938s;

    /* renamed from: t */
    private final AbstractC7097hm f23939t;

    /* renamed from: u */
    private final ScheduledExecutorService f23940u;

    /* renamed from: v */
    private final C7315ks f23941v;

    /* renamed from: w */
    private final C7132hw f23942w;

    /* renamed from: f */
    private HashSet<String> f23925f = new HashSet<>();

    /* renamed from: g */
    private boolean f23926g = true;

    /* renamed from: j */
    private EnumC7115b f23929j = EnumC7115b.Disconnected;

    /* renamed from: k */
    private long f23930k = 0;

    /* renamed from: l */
    private long f23931l = 0;

    /* renamed from: y */
    private long f23944y = 0;

    /* renamed from: z */
    private int f23945z = 0;

    /* renamed from: A */
    private ScheduledFuture<?> f23919A = null;

    /* renamed from: p */
    private Map<C7116c, C7118e> f23935p = new HashMap();

    /* renamed from: m */
    private Map<Long, AbstractC7114a> f23932m = new HashMap();

    /* renamed from: o */
    private Map<Long, C7119f> f23934o = new HashMap();

    /* renamed from: n */
    private List<C7117d> f23933n = new ArrayList();

    /* renamed from: x */
    private String f23943x = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7114a {
        /* renamed from: a */
        void mo15507a(Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$b */
    /* loaded from: classes2.dex */
    public enum EnumC7115b {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$c */
    /* loaded from: classes2.dex */
    public static class C7116c {

        /* renamed from: a */
        private final List<String> f23969a;

        /* renamed from: b */
        private final Map<String, Object> f23970b;

        public C7116c(List<String> list, Map<String, Object> map) {
            this.f23969a = list;
            this.f23970b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7116c)) {
                return false;
            }
            C7116c c7116c = (C7116c) obj;
            if (!this.f23969a.equals(c7116c.f23969a)) {
                return false;
            }
            return this.f23970b.equals(c7116c.f23970b);
        }

        public int hashCode() {
            return (this.f23969a.hashCode() * 31) + this.f23970b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(C7100ho.m15576a(this.f23969a));
            String valueOf2 = String.valueOf(this.f23970b);
            return new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length()).append(valueOf).append(" (params: ").append(valueOf2).append(")").toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$d */
    /* loaded from: classes2.dex */
    public static class C7117d {

        /* renamed from: a */
        private final String f23971a;

        /* renamed from: b */
        private final List<String> f23972b;

        /* renamed from: c */
        private final Object f23973c;

        /* renamed from: d */
        private final AbstractC7121hu f23974d;

        private C7117d(String str, List<String> list, Object obj, AbstractC7121hu abstractC7121hu) {
            this.f23971a = str;
            this.f23972b = list;
            this.f23973c = obj;
            this.f23974d = abstractC7121hu;
        }

        /* renamed from: a */
        public String m15504a() {
            return this.f23971a;
        }

        /* renamed from: b */
        public List<String> m15502b() {
            return this.f23972b;
        }

        /* renamed from: c */
        public Object m15501c() {
            return this.f23973c;
        }

        /* renamed from: d */
        public AbstractC7121hu m15500d() {
            return this.f23974d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$e */
    /* loaded from: classes2.dex */
    public static class C7118e {

        /* renamed from: a */
        private final AbstractC7121hu f23975a;

        /* renamed from: b */
        private final C7116c f23976b;

        /* renamed from: c */
        private final AbstractC7102hq f23977c;

        /* renamed from: d */
        private final Long f23978d;

        private C7118e(AbstractC7121hu abstractC7121hu, C7116c c7116c, Long l, AbstractC7102hq abstractC7102hq) {
            this.f23975a = abstractC7121hu;
            this.f23976b = c7116c;
            this.f23977c = abstractC7102hq;
            this.f23978d = l;
        }

        /* renamed from: a */
        public C7116c m15499a() {
            return this.f23976b;
        }

        /* renamed from: b */
        public Long m15497b() {
            return this.f23978d;
        }

        /* renamed from: c */
        public AbstractC7102hq m15495c() {
            return this.f23977c;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f23976b.toString());
            String valueOf2 = String.valueOf(this.f23978d);
            return new StringBuilder(String.valueOf(valueOf).length() + 8 + String.valueOf(valueOf2).length()).append(valueOf).append(" (Tag: ").append(valueOf2).append(")").toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.hs$f */
    /* loaded from: classes2.dex */
    public static class C7119f {

        /* renamed from: a */
        private String f23979a;

        /* renamed from: b */
        private Map<String, Object> f23980b;

        /* renamed from: c */
        private AbstractC7121hu f23981c;

        /* renamed from: d */
        private boolean f23982d;

        private C7119f(String str, Map<String, Object> map, AbstractC7121hu abstractC7121hu) {
            this.f23979a = str;
            this.f23980b = map;
            this.f23981c = abstractC7121hu;
        }

        /* renamed from: a */
        public String m15494a() {
            return this.f23979a;
        }

        /* renamed from: b */
        public Map<String, Object> m15492b() {
            return this.f23980b;
        }

        /* renamed from: c */
        public AbstractC7121hu m15491c() {
            return this.f23981c;
        }

        /* renamed from: d */
        public void m15490d() {
            this.f23982d = true;
        }

        /* renamed from: e */
        public boolean m15489e() {
            return this.f23982d;
        }
    }

    static {
        f23917a = !C7105hs.class.desiredAssertionStatus();
        f23918b = 0L;
    }

    public C7105hs(C7099hn c7099hn, C7101hp c7101hp, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        this.f23922c = abstractC7104a;
        this.f23938s = c7099hn;
        this.f23940u = c7099hn.m15582c();
        this.f23939t = c7099hn.m15583b();
        this.f23923d = c7101hp;
        this.f23942w = new C7132hw.C7134a(this.f23940u, c7099hn.m15584a(), "ConnectionRetryHelper").m15447a(1000L).m15448a(1.3d).m15445b(NotificationOptions.f16268b).m15446b(0.7d).m15449a();
        long j = f23918b;
        f23918b = 1 + j;
        this.f23941v = new C7315ks(c7099hn.m15584a(), "PersistentConnection", new StringBuilder(23).append("pc_").append(j).toString());
        m15510q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C7118e m15566a(C7116c c7116c) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(c7116c);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("removing query ").append(valueOf).toString(), new Object[0]);
        }
        if (this.f23935p.containsKey(c7116c)) {
            C7118e c7118e = this.f23935p.get(c7116c);
            this.f23935p.remove(c7116c);
            m15510q();
            return c7118e;
        }
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks2 = this.f23941v;
            String valueOf2 = String.valueOf(c7116c);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 64).append("Trying to remove listener for QuerySpec ").append(valueOf2).append(" but no listener exists.").toString(), new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    private Collection<C7118e> m15549a(List<String> list) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(list);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 29).append("removing all listens at path ").append(valueOf).toString(), new Object[0]);
        }
        ArrayList<C7118e> arrayList = new ArrayList();
        for (Map.Entry<C7116c, C7118e> entry : this.f23935p.entrySet()) {
            C7118e value = entry.getValue();
            if (entry.getKey().f23969a.equals(list)) {
                arrayList.add(value);
            }
        }
        for (C7118e c7118e : arrayList) {
            this.f23935p.remove(c7118e.m15499a());
        }
        m15510q();
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, Object> m15547a(List<String> list, Object obj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C7100ho.m15576a(list));
        hashMap.put(C0612f.f1063a, obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m15569a(long j) {
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("handling timestamp", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(j - System.currentTimeMillis()));
        this.f23922c.mo6828a(hashMap);
    }

    /* renamed from: a */
    private void m15565a(C7118e c7118e) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C7100ho.m15576a((List<String>) c7118e.f23976b.f23969a));
        Long m15497b = c7118e.m15497b();
        if (m15497b != null) {
            hashMap.put("q", c7118e.m15499a().f23970b);
            hashMap.put("t", m15497b);
        }
        m15551a("n", hashMap, (AbstractC7114a) null);
    }

    /* renamed from: a */
    private void m15555a(String str, String str2) {
        this.f23941v.m14843a(new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length()).append("Auth token revoked: ").append(str).append(" (").append(str2).append(")").toString());
        this.f23936q = null;
        this.f23937r = true;
        this.f23922c.mo6827a(false);
        this.f23928i.m15590b();
    }

    /* renamed from: a */
    private void m15554a(String str, List<String> list, Object obj, final AbstractC7121hu abstractC7121hu) {
        HashMap hashMap = new HashMap();
        hashMap.put("p", C7100ho.m15576a(list));
        hashMap.put(C0612f.f1063a, obj);
        m15551a(str, hashMap, new AbstractC7114a() { // from class: com.google.android.gms.internal.hs.2
            @Override // com.google.android.gms.internal.C7105hs.AbstractC7114a
            /* renamed from: a */
            public void mo15507a(Map<String, Object> map) {
                String str2 = null;
                String str3 = (String) map.get("s");
                if (!str3.equals("ok")) {
                    str2 = (String) map.get(C0612f.f1063a);
                } else {
                    str3 = null;
                }
                if (abstractC7121hu != null) {
                    abstractC7121hu.mo6832a(str3, str2);
                }
            }
        });
    }

    /* renamed from: a */
    private void m15553a(String str, List<String> list, Object obj, String str2, AbstractC7121hu abstractC7121hu) {
        Map<String, Object> m15547a = m15547a(list, obj, str2);
        long j = this.f23930k;
        this.f23930k = 1 + j;
        this.f23934o.put(Long.valueOf(j), new C7119f(str, m15547a, abstractC7121hu));
        if (m15531g()) {
            m15544b(j);
        }
        this.f23920B = System.currentTimeMillis();
        m15510q();
    }

    /* renamed from: a */
    private void m15552a(String str, Map<String, Object> map) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(map);
            c7315ks.m14840a(new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(valueOf).length()).append("handleServerMessage: ").append(str).append(" ").append(valueOf).toString(), new Object[0]);
        }
        if (str.equals(C0612f.f1063a) || str.equals(C0548a.f931b)) {
            boolean equals = str.equals(C0548a.f931b);
            String str2 = (String) map.get("p");
            Object obj = map.get(C0612f.f1063a);
            Long m15578a = C7100ho.m15578a(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.f23922c.mo6830a(C7100ho.m15577a(str2), obj, equals, m15578a);
            } else if (this.f23941v.m14844a()) {
                C7315ks c7315ks2 = this.f23941v;
                String valueOf2 = String.valueOf(str2);
                c7315ks2.m14840a(valueOf2.length() != 0 ? "ignoring empty merge for path ".concat(valueOf2) : new String("ignoring empty merge for path "), new Object[0]);
            }
        } else if (str.equals("rm")) {
            String str3 = (String) map.get("p");
            List<String> m15577a = C7100ho.m15577a(str3);
            Object obj2 = map.get(C0612f.f1063a);
            Long m15578a2 = C7100ho.m15578a(map.get("t"));
            ArrayList arrayList = new ArrayList();
            for (Map map2 : (List) obj2) {
                String str4 = (String) map2.get("s");
                String str5 = (String) map2.get("e");
                arrayList.add(new C7120ht(str4 != null ? C7100ho.m15577a(str4) : null, str5 != null ? C7100ho.m15577a(str5) : null, map2.get(C0548a.f931b)));
            }
            if (!arrayList.isEmpty()) {
                this.f23922c.mo6829a(m15577a, arrayList, m15578a2);
            } else if (this.f23941v.m14844a()) {
                C7315ks c7315ks3 = this.f23941v;
                String valueOf3 = String.valueOf(str3);
                c7315ks3.m14840a(valueOf3.length() != 0 ? "Ignoring empty range merge for path ".concat(valueOf3) : new String("Ignoring empty range merge for path "), new Object[0]);
            }
        } else if (str.equals("c")) {
            m15540b(C7100ho.m15577a((String) map.get("p")));
        } else if (str.equals("ac")) {
            m15555a((String) map.get("s"), (String) map.get(C0612f.f1063a));
        } else if (str.equals("sd")) {
            m15539b(map);
        } else if (this.f23941v.m14844a()) {
            C7315ks c7315ks4 = this.f23941v;
            String valueOf4 = String.valueOf(str);
            c7315ks4.m14840a(valueOf4.length() != 0 ? "Unrecognized action from server: ".concat(valueOf4) : new String("Unrecognized action from server: "), new Object[0]);
        }
    }

    /* renamed from: a */
    private void m15551a(String str, Map<String, Object> map, AbstractC7114a abstractC7114a) {
        m15550a(str, false, map, abstractC7114a);
    }

    /* renamed from: a */
    private void m15550a(String str, boolean z, Map<String, Object> map, AbstractC7114a abstractC7114a) {
        long m15512p = m15512p();
        HashMap hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(m15512p));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.f23928i.m15591a(hashMap, z);
        this.f23932m.put(Long.valueOf(m15512p), abstractC7114a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m15548a(List<String> list, C7116c c7116c) {
        if (list.contains("no_index")) {
            String valueOf = String.valueOf(c7116c.f23970b.get(C0620k.f1083a));
            String sb = new StringBuilder(String.valueOf(valueOf).length() + 14).append("\".indexOn\": \"").append(valueOf).append("\"").toString();
            C7315ks c7315ks = this.f23941v;
            String valueOf2 = String.valueOf(C7100ho.m15576a((List<String>) c7116c.f23969a));
            c7315ks.m14843a(new StringBuilder(String.valueOf(sb).length() + Opcodes.FNEG + String.valueOf(valueOf2).length()).append("Using an unspecified index. Consider adding '").append(sb).append("' at ").append(valueOf2).append(" to your security and Firebase Database rules for better performance").toString());
        }
    }

    /* renamed from: a */
    private void m15545a(final boolean z) {
        C7100ho.m15574a(m15533f(), "Must be connected to send auth, but was: %s", this.f23929j);
        C7100ho.m15574a(this.f23936q != null, "Auth token must be set to authenticate!", new Object[0]);
        AbstractC7114a abstractC7114a = new AbstractC7114a() { // from class: com.google.android.gms.internal.hs.3
            @Override // com.google.android.gms.internal.C7105hs.AbstractC7114a
            /* renamed from: a */
            public void mo15507a(Map<String, Object> map) {
                C7105hs.this.f23929j = EnumC7115b.Connected;
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    C7105hs.this.f23945z = 0;
                    C7105hs.this.f23922c.mo6827a(true);
                    if (!z) {
                        return;
                    }
                    C7105hs.this.m15516n();
                    return;
                }
                C7105hs.this.f23936q = null;
                C7105hs.this.f23937r = true;
                C7105hs.this.f23922c.mo6827a(false);
                String str2 = (String) map.get(C0612f.f1063a);
                C7105hs.this.f23941v.m14840a(new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length()).append("Authentication failed: ").append(str).append(" (").append(str2).append(")").toString(), new Object[0]);
                C7105hs.this.f23928i.m15590b();
                if (!str.equals("invalid_token")) {
                    return;
                }
                C7105hs.m15523j(C7105hs.this);
                if (C7105hs.this.f23945z < 3) {
                    return;
                }
                C7105hs.this.f23942w.m15451b();
                C7105hs.this.f23941v.m14843a("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        };
        HashMap hashMap = new HashMap();
        C7379ma m14639a = C7379ma.m14639a(this.f23936q);
        if (m14639a == null) {
            hashMap.put("cred", this.f23936q);
            m15550a("auth", true, (Map<String, Object>) hashMap, abstractC7114a);
            return;
        }
        hashMap.put("cred", m14639a.m14640a());
        if (m14639a.m14638b() != null) {
            hashMap.put("authvar", m14639a.m14638b());
        }
        m15550a("gauth", true, (Map<String, Object>) hashMap, abstractC7114a);
    }

    /* renamed from: b */
    private void m15544b(final long j) {
        if (f23917a || m15531g()) {
            final C7119f c7119f = this.f23934o.get(Long.valueOf(j));
            final AbstractC7121hu m15491c = c7119f.m15491c();
            final String m15494a = c7119f.m15494a();
            c7119f.m15490d();
            m15551a(m15494a, c7119f.m15492b(), new AbstractC7114a() { // from class: com.google.android.gms.internal.hs.4
                @Override // com.google.android.gms.internal.C7105hs.AbstractC7114a
                /* renamed from: a */
                public void mo15507a(Map<String, Object> map) {
                    if (C7105hs.this.f23941v.m14844a()) {
                        C7315ks c7315ks = C7105hs.this.f23941v;
                        String str = m15494a;
                        String valueOf = String.valueOf(map);
                        c7315ks.m14840a(new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length()).append(str).append(" response: ").append(valueOf).toString(), new Object[0]);
                    }
                    if (((C7119f) C7105hs.this.f23934o.get(Long.valueOf(j))) == c7119f) {
                        C7105hs.this.f23934o.remove(Long.valueOf(j));
                        if (m15491c != null) {
                            String str2 = (String) map.get("s");
                            if (str2.equals("ok")) {
                                m15491c.mo6832a(null, null);
                            } else {
                                m15491c.mo6832a(str2, (String) map.get(C0612f.f1063a));
                            }
                        }
                    } else if (C7105hs.this.f23941v.m14844a()) {
                        C7105hs.this.f23941v.m14840a(new StringBuilder(81).append("Ignoring on complete for put ").append(j).append(" because it was removed already.").toString(), new Object[0]);
                    }
                    C7105hs.this.m15510q();
                }
            });
            return;
        }
        throw new AssertionError("sendPut called when we can't send writes (we're disconnected or writes are paused).");
    }

    /* renamed from: b */
    private void m15543b(final C7118e c7118e) {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("p", C7100ho.m15576a((List<String>) c7118e.m15499a().f23969a));
        Object m15497b = c7118e.m15497b();
        if (m15497b != null) {
            hashMap.put("q", c7118e.f23976b.f23970b);
            hashMap.put("t", m15497b);
        }
        AbstractC7102hq m15495c = c7118e.m15495c();
        hashMap.put("h", m15495c.mo6835a());
        if (m15495c.mo6834b()) {
            C7092hk mo6833c = m15495c.mo6833c();
            ArrayList arrayList = new ArrayList();
            for (List<String> list : mo6833c.m15597a()) {
                arrayList.add(C7100ho.m15576a(list));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hs", mo6833c.m15596b());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        m15551a("q", hashMap, new AbstractC7114a() { // from class: com.google.android.gms.internal.hs.5
            @Override // com.google.android.gms.internal.C7105hs.AbstractC7114a
            /* renamed from: a */
            public void mo15507a(Map<String, Object> map) {
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    Map map2 = (Map) map.get(C0612f.f1063a);
                    if (map2.containsKey("w")) {
                        C7105hs.this.m15548a((List) map2.get("w"), c7118e.f23976b);
                    }
                }
                if (((C7118e) C7105hs.this.f23935p.get(c7118e.m15499a())) == c7118e) {
                    if (str.equals("ok")) {
                        c7118e.f23975a.mo6832a(null, null);
                        return;
                    }
                    C7105hs.this.m15566a(c7118e.m15499a());
                    c7118e.f23975a.mo6832a(str, (String) map.get(C0612f.f1063a));
                }
            }
        });
    }

    /* renamed from: b */
    private void m15540b(List<String> list) {
        Collection<C7118e> m15549a = m15549a(list);
        if (m15549a != null) {
            for (C7118e c7118e : m15549a) {
                c7118e.f23975a.mo6832a("permission_denied", null);
            }
        }
    }

    /* renamed from: b */
    private void m15539b(Map<String, Object> map) {
        this.f23941v.m14837b((String) map.get(SocialConstants.PARAM_SEND_MSG));
    }

    /* renamed from: c */
    static /* synthetic */ long m15538c(C7105hs c7105hs) {
        long j = c7105hs.f23944y;
        c7105hs.f23944y = 1 + j;
        return j;
    }

    /* renamed from: c */
    private void m15537c(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("c", map);
            m15551a("s", hashMap, new AbstractC7114a() { // from class: com.google.android.gms.internal.hs.6
                @Override // com.google.android.gms.internal.C7105hs.AbstractC7114a
                /* renamed from: a */
                public void mo15507a(Map<String, Object> map2) {
                    String str = (String) map2.get("s");
                    if (!str.equals("ok")) {
                        String str2 = (String) map2.get(C0612f.f1063a);
                        if (!C7105hs.this.f23941v.m14844a()) {
                            return;
                        }
                        C7105hs.this.f23941v.m14840a(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Failed to send stats: ").append(str).append(" (message: ").append(str2).append(")").toString(), new Object[0]);
                    }
                }
            });
        } else if (!this.f23941v.m14844a()) {
        } else {
            this.f23941v.m14840a("Not sending stats because stats are empty", new Object[0]);
        }
    }

    /* renamed from: f */
    private boolean m15533f() {
        return this.f23929j == EnumC7115b.Authenticating || this.f23929j == EnumC7115b.Connected;
    }

    /* renamed from: g */
    private boolean m15531g() {
        return this.f23929j == EnumC7115b.Connected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m15528h() {
        if (m15535e()) {
            C7100ho.m15574a(this.f23929j == EnumC7115b.Disconnected, "Not in disconnected state: %s", this.f23929j);
            final boolean z = this.f23937r;
            this.f23941v.m14840a("Scheduling connection attempt", new Object[0]);
            this.f23937r = false;
            this.f23942w.m15452a(new Runnable() { // from class: com.google.android.gms.internal.hs.1
                @Override // java.lang.Runnable
                public void run() {
                    C7105hs.this.f23941v.m14840a("Trying to fetch auth token", new Object[0]);
                    C7100ho.m15574a(C7105hs.this.f23929j == EnumC7115b.Disconnected, "Not in disconnected state: %s", C7105hs.this.f23929j);
                    C7105hs.this.f23929j = EnumC7115b.GettingToken;
                    C7105hs.m15538c(C7105hs.this);
                    final long j = C7105hs.this.f23944y;
                    C7105hs.this.f23939t.mo6823a(z, new AbstractC7097hm.AbstractC7098a() { // from class: com.google.android.gms.internal.hs.1.1
                        @Override // com.google.android.gms.internal.AbstractC7097hm.AbstractC7098a
                        /* renamed from: a */
                        public void mo6825a(String str) {
                            if (j != C7105hs.this.f23944y) {
                                C7105hs.this.f23941v.m14840a("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                            } else if (C7105hs.this.f23929j == EnumC7115b.GettingToken) {
                                C7105hs.this.f23941v.m14840a("Successfully fetched token, opening connection", new Object[0]);
                                C7105hs.this.m15529g(str);
                            } else {
                                C7100ho.m15574a(C7105hs.this.f23929j == EnumC7115b.Disconnected, "Expected connection state disconnected, but was %s", C7105hs.this.f23929j);
                                C7105hs.this.f23941v.m14840a("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                            }
                        }

                        @Override // com.google.android.gms.internal.AbstractC7097hm.AbstractC7098a
                        /* renamed from: b */
                        public void mo6824b(String str) {
                            if (j != C7105hs.this.f23944y) {
                                C7105hs.this.f23941v.m14840a("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                                return;
                            }
                            C7105hs.this.f23929j = EnumC7115b.Disconnected;
                            C7315ks c7315ks = C7105hs.this.f23941v;
                            String valueOf = String.valueOf(str);
                            c7315ks.m14840a(valueOf.length() != 0 ? "Error fetching token: ".concat(valueOf) : new String("Error fetching token: "), new Object[0]);
                            C7105hs.this.m15528h();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: i */
    private void m15526i() {
        Iterator<Map.Entry<Long, C7119f>> it2 = this.f23934o.entrySet().iterator();
        while (it2.hasNext()) {
            C7119f value = it2.next().getValue();
            if (value.m15492b().containsKey("h") && value.m15489e()) {
                value.m15491c().mo6832a("disconnected", null);
                it2.remove();
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ int m15523j(C7105hs c7105hs) {
        int i = c7105hs.f23945z;
        c7105hs.f23945z = i + 1;
        return i;
    }

    /* renamed from: j */
    private void m15524j() {
        m15545a(false);
    }

    /* renamed from: k */
    private void m15522k() {
        m15545a(true);
    }

    /* renamed from: l */
    private void m15520l() {
        C7100ho.m15574a(m15533f(), "Must be connected to send unauth.", new Object[0]);
        C7100ho.m15574a(this.f23936q == null, "Auth token must not be set.", new Object[0]);
        m15551a("unauth", Collections.emptyMap(), (AbstractC7114a) null);
    }

    /* renamed from: m */
    private void m15518m() {
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("calling restore state", new Object[0]);
        }
        C7100ho.m15574a(this.f23929j == EnumC7115b.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.f23929j);
        if (this.f23936q == null) {
            if (this.f23941v.m14844a()) {
                this.f23941v.m14840a("Not restoring auth because token is null.", new Object[0]);
            }
            this.f23929j = EnumC7115b.Connected;
            m15516n();
            return;
        }
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("Restoring auth.", new Object[0]);
        }
        this.f23929j = EnumC7115b.Authenticating;
        m15522k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m15516n() {
        C7100ho.m15574a(this.f23929j == EnumC7115b.Connected, "Should be connected if we're restoring state, but we are: %s", this.f23929j);
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("Restoring outstanding listens", new Object[0]);
        }
        for (C7118e c7118e : this.f23935p.values()) {
            if (this.f23941v.m14844a()) {
                C7315ks c7315ks = this.f23941v;
                String valueOf = String.valueOf(c7118e.m15499a());
                c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Restoring listen ").append(valueOf).toString(), new Object[0]);
            }
            m15543b(c7118e);
        }
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("Restoring writes.", new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.f23934o.keySet());
        Collections.sort(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m15544b(((Long) it2.next()).longValue());
        }
        for (C7117d c7117d : this.f23933n) {
            m15554a(c7117d.m15504a(), c7117d.m15502b(), c7117d.m15501c(), c7117d.m15500d());
        }
        this.f23933n.clear();
    }

    /* renamed from: o */
    private void m15514o() {
        HashMap hashMap = new HashMap();
        if (C7377lz.m14642a()) {
            if (this.f23938s.m15581d()) {
                hashMap.put("persistence.android.enabled", 1);
            }
            String valueOf = String.valueOf(this.f23938s.m15580e().replace(C0494h.f686G, '-'));
            hashMap.put(valueOf.length() != 0 ? "sdk.android.".concat(valueOf) : new String("sdk.android."), 1);
        } else if (!f23917a && this.f23938s.m15581d()) {
            throw new AssertionError("Stats for persistence on JVM missing (persistence not yet supported)");
        } else {
            String valueOf2 = String.valueOf(this.f23938s.m15580e().replace(C0494h.f686G, '-'));
            hashMap.put(valueOf2.length() != 0 ? "sdk.java.".concat(valueOf2) : new String("sdk.java."), 1);
        }
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("Sending first connection stats", new Object[0]);
        }
        m15537c(hashMap);
    }

    /* renamed from: p */
    private long m15512p() {
        long j = this.f23931l;
        this.f23931l = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m15510q() {
        boolean z = false;
        if (m15509r()) {
            if (this.f23919A != null) {
                this.f23919A.cancel(false);
            }
            this.f23919A = this.f23940u.schedule(new Runnable() { // from class: com.google.android.gms.internal.hs.7
                @Override // java.lang.Runnable
                public void run() {
                    C7105hs.this.f23919A = null;
                    if (C7105hs.this.m15508s()) {
                        C7105hs.this.mo6799d("connection_idle");
                    } else {
                        C7105hs.this.m15510q();
                    }
                }
            }, 60000L, TimeUnit.MILLISECONDS);
        } else if (!mo6797f("connection_idle")) {
        } else {
            if (!m15509r()) {
                z = true;
            }
            C7100ho.m15575a(z);
            mo6798e("connection_idle");
        }
    }

    /* renamed from: r */
    private boolean m15509r() {
        return this.f23935p.isEmpty() && this.f23932m.isEmpty() && !this.f23921C && this.f23934o.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public boolean m15508s() {
        return m15509r() && System.currentTimeMillis() > this.f23920B + 60000;
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6814a() {
        m15528h();
    }

    @Override // com.google.android.gms.internal.C7093hl.AbstractC7094a
    /* renamed from: a */
    public void mo15568a(long j, String str) {
        if (this.f23941v.m14844a()) {
            this.f23941v.m14840a("onReady", new Object[0]);
        }
        this.f23927h = System.currentTimeMillis();
        m15569a(j);
        if (this.f23926g) {
            m15514o();
        }
        m15518m();
        this.f23926g = false;
        this.f23943x = str;
        this.f23922c.mo6831a();
    }

    @Override // com.google.android.gms.internal.C7093hl.AbstractC7094a
    /* renamed from: a */
    public void mo15567a(C7093hl.EnumC7095b enumC7095b) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(enumC7095b.name());
            c7315ks.m14840a(valueOf.length() != 0 ? "Got on disconnect due to ".concat(valueOf) : new String("Got on disconnect due to "), new Object[0]);
        }
        this.f23929j = EnumC7115b.Disconnected;
        this.f23928i = null;
        this.f23921C = false;
        this.f23932m.clear();
        m15526i();
        if (m15535e()) {
            boolean z = this.f23927h > 0 ? System.currentTimeMillis() - this.f23927h > NotificationOptions.f16268b : false;
            if (enumC7095b == C7093hl.EnumC7095b.SERVER_RESET || z) {
                this.f23942w.m15454a();
            }
            m15528h();
        }
        this.f23927h = 0L;
        this.f23922c.mo6826b();
    }

    @Override // com.google.android.gms.internal.C7093hl.AbstractC7094a
    /* renamed from: a */
    public void mo15556a(String str) {
        this.f23924e = str;
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6811a(List<String> list, AbstractC7121hu abstractC7121hu) {
        if (m15531g()) {
            m15554a("oc", list, (Object) null, abstractC7121hu);
        } else {
            this.f23933n.add(new C7117d("oc", list, null, abstractC7121hu));
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6810a(List<String> list, Object obj, AbstractC7121hu abstractC7121hu) {
        m15553a("p", list, obj, (String) null, abstractC7121hu);
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6809a(List<String> list, Object obj, String str, AbstractC7121hu abstractC7121hu) {
        m15553a("p", list, obj, str, abstractC7121hu);
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6808a(List<String> list, Map<String, Object> map) {
        C7116c c7116c = new C7116c(list, map);
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(c7116c);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("unlistening on ").append(valueOf).toString(), new Object[0]);
        }
        C7118e m15566a = m15566a(c7116c);
        if (m15566a != null && m15533f()) {
            m15565a(m15566a);
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6807a(List<String> list, Map<String, Object> map, AbstractC7102hq abstractC7102hq, Long l, AbstractC7121hu abstractC7121hu) {
        C7116c c7116c = new C7116c(list, map);
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(c7116c);
            c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Listening on ").append(valueOf).toString(), new Object[0]);
        }
        C7100ho.m15574a(!this.f23935p.containsKey(c7116c), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks2 = this.f23941v;
            String valueOf2 = String.valueOf(c7116c);
            c7315ks2.m14840a(new StringBuilder(String.valueOf(valueOf2).length() + 21).append("Adding listen query: ").append(valueOf2).toString(), new Object[0]);
        }
        C7118e c7118e = new C7118e(abstractC7121hu, c7116c, l, abstractC7102hq);
        this.f23935p.put(c7116c, c7118e);
        if (m15533f()) {
            m15543b(c7118e);
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6806a(List<String> list, Map<String, Object> map, AbstractC7121hu abstractC7121hu) {
        m15553a(C0548a.f931b, list, map, (String) null, abstractC7121hu);
    }

    @Override // com.google.android.gms.internal.C7093hl.AbstractC7094a
    /* renamed from: a */
    public void mo15546a(Map<String, Object> map) {
        if (map.containsKey("r")) {
            AbstractC7114a remove = this.f23932m.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (remove == null) {
                return;
            }
            remove.mo15507a((Map) map.get("b"));
        } else if (map.containsKey("error")) {
        } else {
            if (map.containsKey("a")) {
                m15552a((String) map.get("a"), (Map) map.get("b"));
            } else if (!this.f23941v.m14844a()) {
            } else {
                C7315ks c7315ks = this.f23941v;
                String valueOf = String.valueOf(map);
                c7315ks.m14840a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Ignoring unknown message: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6805b() {
        mo6799d("shutdown");
    }

    @Override // com.google.android.gms.internal.C7093hl.AbstractC7094a
    /* renamed from: b */
    public void mo15541b(String str) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(str);
            c7315ks.m14840a(valueOf.length() != 0 ? "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(valueOf) : new String("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: "), new Object[0]);
        }
        mo6799d("server_kill");
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6804b(List<String> list, Object obj, AbstractC7121hu abstractC7121hu) {
        this.f23921C = true;
        if (m15531g()) {
            m15554a("o", list, obj, abstractC7121hu);
        } else {
            this.f23933n.add(new C7117d("o", list, obj, abstractC7121hu));
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6803b(List<String> list, Map<String, Object> map, AbstractC7121hu abstractC7121hu) {
        this.f23921C = true;
        if (m15531g()) {
            m15554a("om", list, map, abstractC7121hu);
        } else {
            this.f23933n.add(new C7117d("om", list, map, abstractC7121hu));
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: c */
    public void mo6802c() {
        this.f23941v.m14840a("Auth token refresh requested", new Object[0]);
        mo6799d("token_refresh");
        mo6798e("token_refresh");
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: c */
    public void mo6801c(String str) {
        this.f23941v.m14840a("Auth token refreshed.", new Object[0]);
        this.f23936q = str;
        if (m15533f()) {
            if (str != null) {
                m15524j();
            } else {
                m15520l();
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: d */
    public void mo6800d() {
        for (C7119f c7119f : this.f23934o.values()) {
            if (c7119f.f23981c != null) {
                c7119f.f23981c.mo6832a("write_canceled", null);
            }
        }
        for (C7117d c7117d : this.f23933n) {
            if (c7117d.f23974d != null) {
                c7117d.f23974d.mo6832a("write_canceled", null);
            }
        }
        this.f23934o.clear();
        this.f23933n.clear();
        if (!m15533f()) {
            this.f23921C = false;
        }
        m15510q();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: d */
    public void mo6799d(String str) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(str);
            c7315ks.m14840a(valueOf.length() != 0 ? "Connection interrupted for: ".concat(valueOf) : new String("Connection interrupted for: "), new Object[0]);
        }
        this.f23925f.add(str);
        if (this.f23928i != null) {
            this.f23928i.m15590b();
            this.f23928i = null;
        } else {
            this.f23942w.m15450c();
            this.f23929j = EnumC7115b.Disconnected;
        }
        this.f23942w.m15454a();
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: e */
    public void mo6798e(String str) {
        if (this.f23941v.m14844a()) {
            C7315ks c7315ks = this.f23941v;
            String valueOf = String.valueOf(str);
            c7315ks.m14840a(valueOf.length() != 0 ? "Connection no longer interrupted for: ".concat(valueOf) : new String("Connection no longer interrupted for: "), new Object[0]);
        }
        this.f23925f.remove(str);
        if (!m15535e() || this.f23929j != EnumC7115b.Disconnected) {
            return;
        }
        m15528h();
    }

    /* renamed from: e */
    boolean m15535e() {
        return this.f23925f.size() == 0;
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: f */
    public boolean mo6797f(String str) {
        return this.f23925f.contains(str);
    }

    /* renamed from: g */
    public void m15529g(String str) {
        C7100ho.m15574a(this.f23929j == EnumC7115b.GettingToken, "Trying to open network connection while in the wrong state: %s", this.f23929j);
        if (str == null) {
            this.f23922c.mo6827a(false);
        }
        this.f23936q = str;
        this.f23929j = EnumC7115b.Connecting;
        this.f23928i = new C7093hl(this.f23938s, this.f23923d, this.f23924e, this, this.f23943x);
        this.f23928i.m15595a();
    }
}
