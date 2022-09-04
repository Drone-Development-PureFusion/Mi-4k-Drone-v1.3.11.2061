package com.xiaomi.stats;

import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.thrift.C10705b;
import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.stats.C10758d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.stats.a */
/* loaded from: classes2.dex */
public class C10755a implements C10615ak.C10617b.AbstractC10618a {

    /* renamed from: a */
    private XMPushService f33571a;

    /* renamed from: b */
    private C10615ak.C10617b f33572b;

    /* renamed from: c */
    private AbstractC10716a f33573c;

    /* renamed from: e */
    private int f33575e;

    /* renamed from: f */
    private boolean f33576f = false;

    /* renamed from: d */
    private C10615ak.EnumC10619c f33574d = C10615ak.EnumC10619c.binding;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10755a(XMPushService xMPushService, C10615ak.C10617b c10617b) {
        this.f33571a = xMPushService;
        this.f33572b = c10617b;
    }

    /* renamed from: b */
    private void m3813b() {
        this.f33572b.m4363b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3812c() {
        m3813b();
        if (this.f33576f && this.f33575e != 11) {
            C10705b m3786f = C10761f.m3796a().m3786f();
            switch (C10757c.f33578a[this.f33574d.ordinal()]) {
                case 1:
                    if (this.f33575e != 17) {
                        if (this.f33575e != 21) {
                            try {
                                C10758d.C10759a m3807c = C10758d.m3807c(C10761f.m3791b().m3804a());
                                m3786f.f33333b = m3807c.f33579a.m4077a();
                                m3786f.m4062c(m3807c.f33580b);
                                break;
                            } catch (NullPointerException e) {
                                m3786f = null;
                                break;
                            }
                        } else {
                            m3786f.f33333b = EnumC10704a.BIND_TIMEOUT.m4077a();
                            break;
                        }
                    } else {
                        m3786f.f33333b = EnumC10704a.BIND_TCP_READ_TIMEOUT.m4077a();
                        break;
                    }
                case 3:
                    m3786f.f33333b = EnumC10704a.BIND_SUCCESS.m4077a();
                    break;
            }
            if (m3786f == null) {
                return;
            }
            m3786f.m4066b(this.f33573c.mo3931d());
            m3786f.m4058d(this.f33572b.f32997b);
            m3786f.f33334c = 1;
            try {
                m3786f.m4074a((byte) Integer.parseInt(this.f33572b.f33003h));
            } catch (NumberFormatException e2) {
            }
            C10761f.m3796a().m3792a(m3786f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3816a() {
        this.f33572b.m4366a(this);
        this.f33573c = this.f33571a.m4453h();
    }

    @Override // com.xiaomi.push.service.C10615ak.C10617b.AbstractC10618a
    /* renamed from: a */
    public void mo3815a(C10615ak.EnumC10619c enumC10619c, C10615ak.EnumC10619c enumC10619c2, int i) {
        if (!this.f33576f && enumC10619c == C10615ak.EnumC10619c.binding) {
            this.f33574d = enumC10619c2;
            this.f33575e = i;
            this.f33576f = true;
        }
        this.f33571a.m4494a(new C10756b(this, 4));
    }
}
