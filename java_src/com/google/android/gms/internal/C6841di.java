package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.C6850dm;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.di */
/* loaded from: classes2.dex */
public class C6841di {

    /* renamed from: a */
    final Map<String, C6844c<C6865dv>> f23027a;

    /* renamed from: b */
    private final Context f23028b;

    /* renamed from: c */
    private final C6852dn f23029c;

    /* renamed from: d */
    private final AbstractC4682e f23030d;

    /* renamed from: e */
    private String f23031e;

    /* renamed from: f */
    private final Map<String, C6863dt> f23032f;

    /* renamed from: com.google.android.gms.internal.di$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6842a {
        /* renamed from: a */
        void mo16135a(C6850dm c6850dm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.di$b */
    /* loaded from: classes2.dex */
    public class C6843b extends AbstractC6840dh {

        /* renamed from: f */
        private final AbstractC6842a f23034f;

        /* renamed from: g */
        private final List<Integer> f23035g;

        /* renamed from: h */
        private final int f23036h;

        C6843b(int i, C6849dl c6849dl, AbstractC6845dj abstractC6845dj, List<Integer> list, int i2, AbstractC6842a abstractC6842a, aos aosVar) {
            super(i, c6849dl, abstractC6845dj, aosVar);
            this.f23034f = abstractC6842a;
            this.f23035g = list;
            this.f23036h = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
        @Override // com.google.android.gms.internal.AbstractC6840dh
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected void mo16134a(C6850dm c6850dm) {
            boolean z;
            if (c6850dm.mo7645a() == Status.f16786a) {
                String valueOf = String.valueOf(c6850dm.m16122e());
                aph.m16391d(valueOf.length() != 0 ? "Container resource successfully loaded from ".concat(valueOf) : new String("Container resource successfully loaded from "));
                if (c6850dm.m16123d() == 0) {
                    C6850dm.C6851a m16125b = c6850dm.m16125b();
                    if (m16125b.m16120b().m16171e()) {
                        z = true;
                    } else {
                        C6841di.this.m16143a(c6850dm.mo7645a(), m16125b);
                        if (m16125b.m16121a() != null && m16125b.m16121a().length > 0) {
                            C6841di.this.f23029c.m16113a(m16125b.m16120b().m16172d(), m16125b.m16121a());
                            z = true;
                        }
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    this.f23034f.mo16135a(c6850dm);
                    return;
                }
                String valueOf2 = String.valueOf(c6850dm.m16122e());
                String str = c6850dm.mo7645a().m24018f() ? "SUCCESS" : "FAILURE";
                aph.m16391d(new StringBuilder(String.valueOf(valueOf2).length() + 54 + String.valueOf(str).length()).append("Cannot fetch a valid resource from ").append(valueOf2).append(". Response status: ").append(str).toString());
                if (c6850dm.mo7645a().m24018f()) {
                    String valueOf3 = String.valueOf(c6850dm.m16122e());
                    aph.m16391d(valueOf3.length() != 0 ? "Response source: ".concat(valueOf3) : new String("Response source: "));
                    aph.m16391d(new StringBuilder(26).append("Response size: ").append(c6850dm.m16125b().m16121a().length).toString());
                }
                C6841di.this.m16140a(this.f23022a, this.f23035g, this.f23036h + 1, this.f23034f, this.f23025d);
                return;
            }
            z = false;
            if (!z) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.di$c */
    /* loaded from: classes2.dex */
    public static class C6844c<T> {

        /* renamed from: a */
        private Status f23037a;

        /* renamed from: b */
        private T f23038b;

        /* renamed from: c */
        private long f23039c;

        public C6844c(Status status, T t, long j) {
            this.f23037a = status;
            this.f23038b = t;
            this.f23039c = j;
        }

        /* renamed from: a */
        public long m16133a() {
            return this.f23039c;
        }

        /* renamed from: a */
        public void m16132a(long j) {
            this.f23039c = j;
        }

        /* renamed from: a */
        public void m16131a(Status status) {
            this.f23037a = status;
        }

        /* renamed from: a */
        public void m16130a(T t) {
            this.f23038b = t;
        }
    }

    public C6841di(Context context) {
        this(context, new HashMap(), new C6852dn(context), C4685h.m23138d());
    }

    C6841di(Context context, Map<String, C6863dt> map, C6852dn c6852dn, AbstractC4682e abstractC4682e) {
        this.f23031e = null;
        this.f23027a = new HashMap();
        this.f23028b = context.getApplicationContext();
        this.f23030d = abstractC4682e;
        this.f23029c = c6852dn;
        this.f23032f = map;
    }

    /* renamed from: a */
    private void m16141a(C6849dl c6849dl, List<Integer> list, int i, AbstractC6842a abstractC6842a) {
        C6828dd m16128a = c6849dl.m16128a();
        String valueOf = String.valueOf(m16128a.m16175a());
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 52).append("Attempting to fetch container ").append(valueOf).append(" from a saved resource").toString());
        this.f23029c.m16115a(m16128a.m16172d(), new C6843b(1, c6849dl, C6846dk.f23040a, list, i, abstractC6842a, null));
    }

    /* renamed from: b */
    private void m16137b(C6849dl c6849dl, List<Integer> list, int i, AbstractC6842a abstractC6842a) {
        C6828dd m16128a = c6849dl.m16128a();
        String valueOf = String.valueOf(m16128a.m16175a());
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Attempting to fetch container ").append(valueOf).append(" from the default resource").toString());
        this.f23029c.m16114a(m16128a.m16172d(), m16128a.m16174b(), new C6843b(2, c6849dl, C6846dk.f23040a, list, i, abstractC6842a, null));
    }

    /* renamed from: b */
    private void m16136b(C6849dl c6849dl, List<Integer> list, int i, AbstractC6842a abstractC6842a, @Nullable aos aosVar) {
        boolean z;
        C6863dt c6863dt;
        C6828dd m16128a = c6849dl.m16128a();
        C6844c<C6865dv> c6844c = this.f23027a.get(m16128a.m16175a());
        if (c6849dl.m16128a().m16171e()) {
            z = true;
        } else {
            z = (c6844c != null ? c6844c.m16133a() : this.f23029c.m16116a(m16128a.m16175a())) + 900000 < this.f23030d.mo16434a();
        }
        if (!z) {
            m16140a(c6849dl, list, i + 1, abstractC6842a, aosVar);
            return;
        }
        C6863dt c6863dt2 = this.f23032f.get(c6849dl.m16126b());
        if (c6863dt2 == null) {
            C6863dt c6863dt3 = 0 == 0 ? new C6863dt() : new C6863dt(this.f23031e);
            this.f23032f.put(c6849dl.m16126b(), c6863dt3);
            c6863dt = c6863dt3;
        } else {
            c6863dt = c6863dt2;
        }
        String valueOf = String.valueOf(m16128a.m16175a());
        aph.m16391d(new StringBuilder(String.valueOf(valueOf).length() + 43).append("Attempting to fetch container ").append(valueOf).append(" from network").toString());
        c6863dt.m16093a(this.f23028b, c6849dl, 0L, new C6843b(0, c6849dl, C6846dk.f23040a, list, i, abstractC6842a, aosVar));
    }

    /* renamed from: a */
    void m16143a(Status status, C6850dm.C6851a c6851a) {
        String m16175a = c6851a.m16120b().m16175a();
        C6865dv m16119c = c6851a.m16119c();
        if (!this.f23027a.containsKey(m16175a)) {
            this.f23027a.put(m16175a, new C6844c<>(status, m16119c, this.f23030d.mo16434a()));
            return;
        }
        C6844c<C6865dv> c6844c = this.f23027a.get(m16175a);
        c6844c.m16132a(this.f23030d.mo16434a());
        if (status != Status.f16786a) {
            return;
        }
        c6844c.m16131a(status);
        c6844c.m16130a((C6844c<C6865dv>) m16119c);
    }

    /* renamed from: a */
    void m16140a(C6849dl c6849dl, List<Integer> list, int i, AbstractC6842a abstractC6842a, @Nullable aos aosVar) {
        if (i == 0) {
            aph.m16391d("Starting to fetch a new resource");
        }
        if (i >= list.size()) {
            String valueOf = String.valueOf(c6849dl.m16128a().m16175a());
            String concat = valueOf.length() != 0 ? "There is no valid resource for the container: ".concat(valueOf) : new String("There is no valid resource for the container: ");
            aph.m16391d(concat);
            abstractC6842a.mo16135a(new C6850dm(new Status(16, concat), list.get(i - 1).intValue()));
            return;
        }
        switch (list.get(i).intValue()) {
            case 0:
                m16136b(c6849dl, list, i, abstractC6842a, aosVar);
                return;
            case 1:
                m16141a(c6849dl, list, i, abstractC6842a);
                return;
            case 2:
                m16137b(c6849dl, list, i, abstractC6842a);
                return;
            default:
                throw new UnsupportedOperationException(new StringBuilder(36).append("Unknown fetching source: ").append(i).toString());
        }
    }

    /* renamed from: a */
    public void m16138a(String str, @Nullable String str2, @Nullable String str3, List<Integer> list, AbstractC6842a abstractC6842a, aos aosVar) {
        C4588d.m23619b(!list.isEmpty());
        m16140a(new C6849dl().m16127a(new C6828dd(str, str2, str3, m16139a(str), apn.m16354a().m16350c())), Collections.unmodifiableList(list), 0, abstractC6842a, aosVar);
    }

    /* renamed from: a */
    boolean m16139a(String str) {
        apn m16354a = apn.m16354a();
        return m16354a.m16351b() && str.equals(m16354a.m16349d());
    }
}
