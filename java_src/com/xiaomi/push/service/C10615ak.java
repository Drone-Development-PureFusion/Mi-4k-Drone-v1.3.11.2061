package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.xiaomi.push.service.ak */
/* loaded from: classes.dex */
public class C10615ak {

    /* renamed from: a */
    private static C10615ak f32993a;

    /* renamed from: b */
    private ConcurrentHashMap<String, HashMap<String, C10617b>> f32994b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private List<AbstractC10616a> f32995c = new ArrayList();

    /* renamed from: com.xiaomi.push.service.ak$a */
    /* loaded from: classes.dex */
    public interface AbstractC10616a {
        /* renamed from: a */
        void mo4284a();
    }

    /* renamed from: com.xiaomi.push.service.ak$b */
    /* loaded from: classes.dex */
    public static class C10617b {

        /* renamed from: a */
        public String f32996a;

        /* renamed from: b */
        public String f32997b;

        /* renamed from: c */
        public String f32998c;

        /* renamed from: d */
        public String f32999d;

        /* renamed from: e */
        public boolean f33000e;

        /* renamed from: f */
        public String f33001f;

        /* renamed from: g */
        public String f33002g;

        /* renamed from: h */
        public String f33003h;

        /* renamed from: i */
        public String f33004i;

        /* renamed from: j */
        public String f33005j;

        /* renamed from: k */
        public C10646b f33006k;

        /* renamed from: l */
        public Context f33007l;

        /* renamed from: p */
        private XMPushService f33011p;

        /* renamed from: m */
        EnumC10619c f33008m = EnumC10619c.unbind;

        /* renamed from: n */
        private int f33009n = 0;

        /* renamed from: o */
        private List<AbstractC10618a> f33010o = new ArrayList();

        /* renamed from: q */
        private XMPushService.C10586b f33012q = new XMPushService.C10586b(this);

        /* renamed from: com.xiaomi.push.service.ak$b$a */
        /* loaded from: classes2.dex */
        public interface AbstractC10618a {
            /* renamed from: a */
            void mo3815a(EnumC10619c enumC10619c, EnumC10619c enumC10619c2, int i);
        }

        public C10617b() {
        }

        public C10617b(XMPushService xMPushService) {
            this.f33011p = xMPushService;
            m4366a(new C10620al(this));
        }

        /* renamed from: a */
        public long m4368a() {
            return 1000 * (((long) ((Math.random() * 20.0d) - 10.0d)) + ((this.f33009n + 1) * 15));
        }

        /* renamed from: a */
        public String m4367a(int i) {
            switch (i) {
                case 1:
                    return "OPEN";
                case 2:
                    return "CLOSE";
                case 3:
                    return "KICK";
                default:
                    return "unknown";
            }
        }

        /* renamed from: a */
        public void m4366a(AbstractC10618a abstractC10618a) {
            synchronized (this.f33010o) {
                this.f33010o.add(abstractC10618a);
            }
        }

        /* renamed from: a */
        public void m4364a(EnumC10619c enumC10619c, int i, int i2, String str, String str2) {
            boolean z = true;
            synchronized (this.f33010o) {
                for (AbstractC10618a abstractC10618a : this.f33010o) {
                    abstractC10618a.mo3815a(this.f33008m, enumC10619c, i2);
                }
            }
            if (this.f33008m != enumC10619c) {
                AbstractC10404b.m5269a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", this.f33008m, enumC10619c, m4367a(i), AbstractC10621am.m4361a(i2), str, str2, this.f33003h));
                this.f33008m = enumC10619c;
            }
            if (this.f33006k == null) {
                AbstractC10404b.m5264d("status changed while the client dispatcher is missing");
            } else if (i == 2) {
                this.f33006k.m4292a(this.f33007l, this, i2);
            } else if (i == 3) {
                this.f33006k.m4291a(this.f33007l, this, str2, str);
            } else if (i == 1) {
                if (enumC10619c != EnumC10619c.binded) {
                    z = false;
                }
                if (!z && "wait".equals(str2)) {
                    this.f33009n++;
                } else if (z) {
                    this.f33009n = 0;
                }
                this.f33006k.m4290a(this.f33007l, this, z, i2, str);
            }
        }

        /* renamed from: b */
        public void m4363b(AbstractC10618a abstractC10618a) {
            synchronized (this.f33010o) {
                this.f33010o.remove(abstractC10618a);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.ak$c */
    /* loaded from: classes.dex */
    public enum EnumC10619c {
        unbind,
        binding,
        binded
    }

    private C10615ak() {
    }

    /* renamed from: a */
    public static synchronized C10615ak m4383a() {
        C10615ak c10615ak;
        synchronized (C10615ak.class) {
            if (f32993a == null) {
                f32993a = new C10615ak();
            }
            c10615ak = f32993a;
        }
        return c10615ak;
    }

    /* renamed from: d */
    private String m4370d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a */
    public synchronized void m4382a(Context context) {
        for (HashMap<String, C10617b> hashMap : this.f32994b.values()) {
            for (C10617b c10617b : hashMap.values()) {
                c10617b.m4364a(EnumC10619c.unbind, 1, 3, null, null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4381a(Context context, int i) {
        for (HashMap<String, C10617b> hashMap : this.f32994b.values()) {
            for (C10617b c10617b : hashMap.values()) {
                c10617b.m4364a(EnumC10619c.unbind, 2, i, null, null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4380a(AbstractC10616a abstractC10616a) {
        this.f32995c.add(abstractC10616a);
    }

    /* renamed from: a */
    public synchronized void m4379a(C10617b c10617b) {
        HashMap<String, C10617b> hashMap = this.f32994b.get(c10617b.f33003h);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f32994b.put(c10617b.f33003h, hashMap);
        }
        hashMap.put(m4370d(c10617b.f32997b), c10617b);
        for (AbstractC10616a abstractC10616a : this.f32995c) {
            abstractC10616a.mo4284a();
        }
    }

    /* renamed from: a */
    public synchronized void m4378a(String str) {
        HashMap<String, C10617b> hashMap = this.f32994b.get(str);
        if (hashMap != null) {
            hashMap.clear();
            this.f32994b.remove(str);
        }
        for (AbstractC10616a abstractC10616a : this.f32995c) {
            abstractC10616a.mo4284a();
        }
    }

    /* renamed from: a */
    public synchronized void m4377a(String str, String str2) {
        HashMap<String, C10617b> hashMap = this.f32994b.get(str);
        if (hashMap != null) {
            hashMap.remove(m4370d(str2));
            if (hashMap.isEmpty()) {
                this.f32994b.remove(str);
            }
        }
        for (AbstractC10616a abstractC10616a : this.f32995c) {
            abstractC10616a.mo4284a();
        }
    }

    /* renamed from: b */
    public synchronized C10617b m4374b(String str, String str2) {
        HashMap<String, C10617b> hashMap;
        hashMap = this.f32994b.get(str);
        return hashMap == null ? null : hashMap.get(m4370d(str2));
    }

    /* renamed from: b */
    public synchronized ArrayList<C10617b> m4376b() {
        ArrayList<C10617b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, C10617b> hashMap : this.f32994b.values()) {
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized List<String> m4375b(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, C10617b> hashMap : this.f32994b.values()) {
            for (C10617b c10617b : hashMap.values()) {
                if (str.equals(c10617b.f32996a)) {
                    arrayList.add(c10617b.f33003h);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized int m4373c() {
        return this.f32994b.size();
    }

    /* renamed from: c */
    public synchronized Collection<C10617b> m4372c(String str) {
        return !this.f32994b.containsKey(str) ? new ArrayList<>() : ((HashMap) this.f32994b.get(str).clone()).values();
    }

    /* renamed from: d */
    public synchronized void m4371d() {
        this.f32994b.clear();
    }

    /* renamed from: e */
    public synchronized void m4369e() {
        this.f32995c.clear();
    }
}
