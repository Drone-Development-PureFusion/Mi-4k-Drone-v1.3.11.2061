package com.fimi.kernel.p158b.p160b;

import android.content.Context;
import com.fimi.kernel.p158b.p160b.C1600b;
import com.fimi.kernel.p158b.p160b.C1617f;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.kernel.b.b.c */
/* loaded from: classes.dex */
public class C1609c implements C1600b.AbstractC1606d {

    /* renamed from: c */
    private static int f3984c = 3;

    /* renamed from: d */
    private static C1609c f3985d;

    /* renamed from: e */
    private static List<C1600b> f3986e;

    /* renamed from: a */
    List<String> f3987a;

    /* renamed from: b */
    private AbstractC1612a f3988b;

    /* renamed from: f */
    private AbstractC1613b f3989f;

    /* renamed from: g */
    private Context f3990g;

    /* renamed from: h */
    private String f3991h;

    /* renamed from: com.fimi.kernel.b.b.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC1612a {
        /* renamed from: a */
        void mo30341a(C1600b c1600b, int i);
    }

    /* renamed from: com.fimi.kernel.b.b.c$b */
    /* loaded from: classes.dex */
    public interface AbstractC1613b {
        /* renamed from: a */
        void mo30332a(List<C1600b> list, boolean z, C1600b c1600b);
    }

    private C1609c() {
    }

    /* renamed from: a */
    public static synchronized C1609c m34997a(Context context) {
        C1609c c1609c;
        synchronized (C1609c.class) {
            if (f3985d == null) {
                f3985d = new C1609c();
                f3985d.f3990g = context;
            }
            f3985d.f3990g = context;
            c1609c = f3985d;
        }
        return c1609c;
    }

    /* renamed from: b */
    private boolean m34989b(C1600b c1600b) {
        c1600b.m35050a(c1600b);
        String m35012m = c1600b.m35012m();
        for (C1600b c1600b2 : f3986e) {
            if (c1600b2.m35012m().equals(m35012m)) {
                f3986e.remove(c1600b);
                if (this.f3989f != null) {
                    this.f3989f.mo30332a(f3986e, false, c1600b);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:9:0x0007, B:12:0x000d, B:14:0x0015, B:16:0x0027, B:20:0x0039, B:23:0x0044, B:25:0x0048, B:27:0x005a, B:29:0x005e, B:31:0x0066, B:32:0x006c, B:34:0x0072, B:36:0x007e, B:39:0x0084, B:41:0x0093, B:43:0x009f, B:48:0x0050, B:52:0x00b1), top: B:8:0x0007 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized C1600b m34996a(Context context, String str) {
        C1600b c1600b;
        int i;
        C1600b c1600b2 = null;
        synchronized (this) {
            if (str == null) {
                c1600b = null;
            } else {
                if (f3986e != null) {
                    int i2 = 0;
                    while (true) {
                        i = i2;
                        if (i >= f3986e.size()) {
                            c1600b = null;
                            break;
                        } else if (f3986e.get(i).m35040b().equals(str) || f3986e.get(i).m35012m().equals(str)) {
                            break;
                        } else {
                            i2 = i + 1;
                        }
                    }
                    c1600b = f3986e.get(i);
                    if (c1600b == null) {
                        c1600b2 = c1600b;
                    }
                } else {
                    f3986e = new ArrayList();
                }
                if (this.f3987a == null || this.f3987a.size() > 0) {
                    this.f3987a = C1617f.m34967a(context).m34969a();
                }
                if (this.f3987a != null && this.f3987a.size() > 0) {
                    for (String str2 : this.f3987a) {
                        if (str2.endsWith(str) || str2.equals(str)) {
                            c1600b = C1617f.m34967a(context).m34966a(context, str2, new C1617f.AbstractC1619a() { // from class: com.fimi.kernel.b.b.c.1
                                @Override // com.fimi.kernel.p158b.p160b.C1617f.AbstractC1619a
                                /* renamed from: a */
                                public void mo34955a(C1600b c1600b3) {
                                    if (c1600b3 == null || C1609c.this.m34990b() >= C1609c.f3984c) {
                                        return;
                                    }
                                    c1600b3.m35035c();
                                }
                            });
                            break;
                        }
                        while (r2.hasNext()) {
                        }
                    }
                }
                c1600b = c1600b2;
                if (c1600b != null) {
                    f3986e.add(c1600b);
                    c1600b.m35038b(this);
                    if (this.f3989f != null) {
                        this.f3989f.mo30332a(f3986e, true, c1600b);
                    }
                }
            }
        }
        return c1600b;
    }

    /* renamed from: a */
    public void m34998a() {
        if (f3986e == null || f3986e.size() != 0) {
            return;
        }
        C1617f.m34967a(this.f3990g).m34960c();
    }

    @Override // com.fimi.kernel.p158b.p160b.C1600b.AbstractC1606d
    /* renamed from: a */
    public void mo31727a(C1600b.EnumC1602a enumC1602a, C1600b c1600b) {
        if (enumC1602a != C1600b.EnumC1602a.Completed || c1600b.m35012m().equals(this.f3991h)) {
            return;
        }
        this.f3991h = c1600b.m35012m();
        int m34990b = m34990b();
        if (this.f3988b != null) {
            this.f3988b.mo30341a(c1600b, m34990b);
        }
        m34988c();
    }

    /* renamed from: a */
    public void m34994a(AbstractC1612a abstractC1612a) {
        this.f3988b = abstractC1612a;
    }

    /* renamed from: a */
    public void m34993a(AbstractC1613b abstractC1613b) {
        this.f3989f = abstractC1613b;
    }

    /* renamed from: a */
    public synchronized void m34991a(String str, String str2, long j, Boolean bool, String str3) {
        if (f3986e == null) {
            f3986e = new ArrayList();
        }
        int size = f3986e.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (f3986e.get(size).m35012m().equals(str)) {
                f3986e.get(size).m35050a(f3986e.get(size));
                f3986e.remove(size);
                C1617f.m34967a(this.f3990g).m34957d(str);
                break;
            } else {
                size--;
            }
        }
        C1600b m35053a = C1600b.m35053a(this.f3990g, str, str2, j, bool, str3, new C1600b.AbstractC1607e() { // from class: com.fimi.kernel.b.b.c.2
            @Override // com.fimi.kernel.p158b.p160b.C1600b.AbstractC1607e
            /* renamed from: a */
            public void mo34956a(C1600b c1600b) {
                if (c1600b != null) {
                    c1600b.m35038b(C1609c.this);
                    if (C1609c.this.m34990b() < C1609c.f3984c) {
                        c1600b.m35035c();
                    }
                    if (C1609c.this.f3989f == null) {
                        return;
                    }
                    C1609c.this.f3989f.mo30332a(C1609c.f3986e, true, c1600b);
                }
            }
        });
        if (m35053a != null) {
            f3986e.add(m35053a);
        }
    }

    /* renamed from: a */
    public boolean m34995a(C1600b c1600b) {
        if (c1600b != null) {
            C1617f.m34967a(this.f3990g).m34957d(c1600b.m35012m());
            return m34989b(c1600b);
        }
        return false;
    }

    /* renamed from: b */
    public synchronized int m34990b() {
        int i;
        i = 0;
        for (C1600b c1600b : f3986e) {
            i = c1600b.m35024g() == C1600b.EnumC1602a.Downloading ? i + 1 : i;
        }
        return i;
    }

    /* renamed from: c */
    public void m34988c() {
        if (m34990b() < f3984c) {
            for (C1600b c1600b : f3986e) {
                if (c1600b.m35024g() == C1600b.EnumC1602a.Wait) {
                    c1600b.m35035c();
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public void m34987d() {
        if (f3986e == null || f3986e.size() <= 0) {
            return;
        }
        for (C1600b c1600b : f3986e) {
            if (c1600b.m35024g() == C1600b.EnumC1602a.Downloading || c1600b.m35024g() == C1600b.EnumC1602a.Wait) {
                c1600b.m35029e();
            }
        }
    }

    /* renamed from: e */
    public void m34986e() {
        if (f3986e == null || f3986e.size() <= 0) {
            return;
        }
        for (C1600b c1600b : f3986e) {
            if (c1600b.m35024g() == C1600b.EnumC1602a.Pause) {
                if (m34990b() < f3984c) {
                    c1600b.m35035c();
                } else {
                    c1600b.m35032d();
                }
            }
        }
    }
}
