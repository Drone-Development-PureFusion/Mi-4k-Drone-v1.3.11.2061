package com.fimi.p155h;

import android.util.Log;
import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p146f.C1516b;
import com.fimi.p148c.AbstractC1523b;
import com.fimi.p149d.p150a.C1529d;
import com.fimi.p149d.p151b.C1536b;
import com.fimi.p152e.C1543b;
import com.fimi.p152e.C1549d;
import com.fimi.p153f.C1552b;
import com.fimi.soul.biz.camera.C1783b;
import com.fimi.soul.biz.camera.C1827d;
import com.fimi.soul.module.update.p218a.C3021a;
import com.fimi.soul.module.update.p218a.C3025e;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.fimi.h.a */
/* loaded from: classes.dex */
public class C1562a implements AbstractC1523b {

    /* renamed from: a */
    public static final int f3842a = 0;

    /* renamed from: b */
    public static final int f3843b = 1;

    /* renamed from: e */
    private AbstractC1564a f3846e;

    /* renamed from: d */
    private String f3845d = "";

    /* renamed from: c */
    C1827d f3844c = (C1827d) C1783b.m34166a().m34150d();

    /* renamed from: com.fimi.h.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC1564a {
        /* renamed from: a */
        void m35141a(String str);
    }

    public C1562a() {
        C1543b.m35227b().m35229a(this);
    }

    /* renamed from: a */
    public void m35149a() {
        C1543b.m35227b().m35226b(this);
    }

    /* renamed from: a */
    public void m35148a(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override // com.fimi.p148c.AbstractC1523b
    /* renamed from: a */
    public void mo28086a(int i, C1508c c1508c) {
        AbstractC1507b m35463g = c1508c.m35463g();
        if (m35463g instanceof C1529d) {
            C1529d c1529d = (C1529d) m35463g;
            c1529d.m35310l();
            C1565b c1565b = new C1565b(c1529d.b(), c1529d.m35309m(), c1529d.m35311k(), c1529d.m35310l(), c1529d.m35314h(), c1529d.m35313i(), c1529d.m35312j(), null);
            c1565b.m35130j();
            C1567d.m35115a().m35113a(c1565b);
            byte[] bArr = new byte[12];
            System.arraycopy(c1529d.m35314h(), 0, bArr, 0, 4);
            System.arraycopy(c1529d.m35313i(), 0, bArr, 4, 4);
            System.arraycopy(c1529d.m35312j(), 0, bArr, 8, 4);
            String m35418a = C1516b.m35418a(bArr);
            C3021a.m29616a().m29613a(new C3025e(c1529d.b(), c1529d.m35309m(), c1529d.m35310l(), String.valueOf(c1529d.m35311k()), c1529d.m35314h(), c1529d.m35313i(), c1529d.m35312j(), new byte[4]));
            C3021a.m29616a().m29614a(c1529d.b(), c1529d.m35310l());
            this.f3845d += "T: " + ((int) c1529d.b()) + " " + c1529d.m35309m() + " V: " + c1529d.m35310l() + " [" + m35418a + "]\n";
            Log.i("zhej", "versionInfo:" + this.f3845d);
        }
    }

    /* renamed from: a */
    public void m35147a(AbstractC1564a abstractC1564a) {
        this.f3846e = abstractC1564a;
    }

    /* renamed from: a */
    public void m35146a(byte[] bArr) {
        C1549d.m35208b().m35209a(bArr, bArr.length);
    }

    /* renamed from: b */
    public void m35145b() {
        this.f3844c.m33989u().m34037k();
        C1552b.m35201a().m35199a(new Runnable() { // from class: com.fimi.h.a.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Log.i("zhej", "run: " + C3021a.m29616a().m29615a(3).m29557d() + Constants.ACCEPT_TIME_SEPARATOR_SP + C3021a.m29616a().m29615a(8).m29557d());
                    if (C3021a.m29616a().m29615a(3).m29557d() == 0) {
                        C1562a.this.m35144c();
                        C1562a.this.m35148a(500);
                    }
                    if (C3021a.m29616a().m29615a(8).m29557d() == 0) {
                        C1562a.this.m35143d();
                        C1562a.this.m35148a(1000);
                    }
                    if (C3021a.m29616a().m29615a(6).m29557d() == 0) {
                        C1562a.this.m35142e();
                        C1562a.this.m35148a(1000);
                    }
                }
            }
        });
        if (this.f3846e != null) {
            this.f3846e.m35141a(this.f3845d);
        }
    }

    /* renamed from: c */
    public void m35144c() {
        C1536b c1536b = new C1536b();
        c1536b.c(2);
        c1536b.d(1);
        c1536b.a(0);
        c1536b.b(C1536b.f3729a);
        c1536b.mo35268a((byte) 3);
        m35146a(c1536b.mo35234g().m35464f());
    }

    /* renamed from: d */
    public void m35143d() {
        C1536b c1536b = new C1536b();
        c1536b.c(3);
        c1536b.d(1);
        c1536b.a(0);
        c1536b.b(C1536b.f3729a);
        c1536b.mo35268a((byte) 8);
        m35146a(c1536b.mo35234g().m35464f());
    }

    /* renamed from: e */
    public void m35142e() {
        C1536b c1536b = new C1536b();
        c1536b.c(2);
        c1536b.d(1);
        c1536b.a(0);
        c1536b.b(C1536b.f3729a);
        c1536b.mo35268a((byte) 6);
        m35146a(c1536b.mo35234g().m35464f());
    }
}
