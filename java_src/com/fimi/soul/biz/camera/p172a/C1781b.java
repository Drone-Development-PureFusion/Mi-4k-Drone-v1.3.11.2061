package com.fimi.soul.biz.camera.p172a;

import android.os.Message;
import com.fimi.kernel.AbstractC1584b;
import com.fimi.kernel.C1642c;
import com.fimi.kernel.p158b.EnumC1626d;
import com.fimi.kernel.p158b.p161c.AbstractC1622a;
import com.fimi.kernel.p158b.p161c.AbstractC1625d;
import com.fimi.kernel.p158b.p162d.C1629c;
import com.fimi.kernel.p158b.p162d.C1631d;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.camera.p173b.AbstractC1793g;
/* renamed from: com.fimi.soul.biz.camera.a.b */
/* loaded from: classes.dex */
public class C1781b extends AbstractC1584b implements AbstractC1793g {

    /* renamed from: a */
    private C1629c f4641a = (C1629c) C1642c.m34890a(EnumC1626d.Socket);

    /* renamed from: b */
    private C1629c f4642b = (C1629c) C1642c.m34890a(EnumC1626d.Socket);

    public C1781b() {
        C1631d m34929f = this.f4641a.m34929f();
        m34929f.a(C1831e.m33977a());
        m34929f.a(C1831e.f4959e);
        m34929f.m34924b(10240);
        m34929f.m34922b(true);
        C1631d m34929f2 = this.f4642b.m34929f();
        m34929f2.a(C1831e.m33977a());
        m34929f2.a(C1831e.f4958d);
        m34929f2.m34924b(10240);
        m34929f2.m34922b(true);
    }

    @Override // com.fimi.kernel.AbstractC1584b
    /* renamed from: a */
    protected void mo30955a(Message message) {
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: a */
    public void mo34142a(AbstractC1622a abstractC1622a) {
        this.f4642b.m34940b(abstractC1622a);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: a */
    public void mo34141a(AbstractC1625d abstractC1625d) {
        this.f4641a.m34950a(abstractC1625d);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1789c
    /* renamed from: a */
    public synchronized void mo34118a(final byte[] bArr) {
        a(new Runnable() { // from class: com.fimi.soul.biz.camera.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!C1781b.this.f4641a.m34941b()) {
                        C1781b.this.f4641a.m34933d();
                    }
                    C1781b.this.f4641a.m34943a(bArr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: a */
    public synchronized void mo34117a(byte[] bArr, int i, int i2) {
        if (!this.f4642b.m34941b()) {
            this.f4642b.m34933d();
        }
        this.f4642b.m34942a(bArr, i, i2);
    }

    /* renamed from: b */
    public void m34172b() {
        this.f4641a.m34927g();
        this.f4642b.m34927g();
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: b */
    public void mo34116b(AbstractC1622a abstractC1622a) {
        this.f4642b.m34951a(abstractC1622a);
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1793g
    /* renamed from: b */
    public void mo34115b(AbstractC1625d abstractC1625d) {
        this.f4641a.m34939b(abstractC1625d);
    }

    /* renamed from: c */
    public boolean m34171c() {
        return this.f4641a.m34941b();
    }

    /* renamed from: d */
    public void m34170d() {
        this.f4641a.m34927g();
        C1631d m34929f = this.f4641a.m34929f();
        m34929f.a(C1831e.m33977a());
        m34929f.a(C1831e.f4959e);
        m34929f.m34924b(10240);
        m34929f.m34922b(true);
        this.f4641a.m34933d();
    }

    /* renamed from: e */
    public void m34169e() {
        this.f4642b.m34927g();
        this.f4642b.m34933d();
    }

    /* renamed from: f */
    public C1629c m34168f() {
        return this.f4641a;
    }

    /* renamed from: g */
    public C1629c m34167g() {
        return this.f4642b;
    }
}
