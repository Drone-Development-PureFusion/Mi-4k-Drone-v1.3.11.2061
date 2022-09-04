package com.xiaomi.slim;

import android.text.TextUtils;
import com.google.p222a.p223a.C3385a;
import com.google.p222a.p223a.C3389d;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.AbstractC10726h;
import com.xiaomi.smack.C10718b;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.util.C10752g;
import com.xiaomi.stats.C10764h;
/* renamed from: com.xiaomi.slim.f */
/* loaded from: classes.dex */
public class C10714f extends AbstractC10726h {

    /* renamed from: v */
    private Thread f33394v;

    /* renamed from: w */
    private C10711c f33395w;

    /* renamed from: x */
    private C10712d f33396x;

    public C10714f(XMPushService xMPushService, C10718b c10718b) {
        super(xMPushService, c10718b);
    }

    /* renamed from: c */
    private C10710b m3995c(boolean z) {
        C10710b c10710b = new C10710b();
        c10710b.m4030a("PING", (String) null);
        if (z) {
            c10710b.m4031a("1");
        } else {
            c10710b.m4031a("0");
        }
        C10570b.C10580j c10580j = new C10570b.C10580j();
        byte[] mo3964a = c().mo3964a();
        if (mo3964a != null) {
            try {
                c10580j.m4540a(C10570b.C10572b.m4650b(mo3964a));
            } catch (C3389d e) {
            }
        }
        byte[] m3773c = C10764h.m3773c();
        if (m3773c != null) {
            c10580j.m4541a(C3385a.m28024a(m3773c));
        }
        c10710b.m4027a(c10580j.c(), (String) null);
        return c10710b;
    }

    /* renamed from: v */
    private void m3994v() {
        try {
            this.f33395w = new C10711c(this.f33435p.getInputStream(), this);
            this.f33396x = new C10712d(this.f33435p.getOutputStream(), this);
            this.f33394v = new C10715g(this, "Blob Reader (" + this.f33410l + ")");
            this.f33394v.start();
        } catch (Exception e) {
            throw new C10730l("Error to init reader and writer", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.smack.AbstractC10726h
    /* renamed from: a */
    public synchronized void mo3944a(int i, Exception exc) {
        if (this.f33395w != null) {
            this.f33395w.m4006b();
            this.f33395w = null;
        }
        if (this.f33396x != null) {
            try {
                this.f33396x.m4000b();
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
            }
            this.f33396x = null;
        }
        super.mo3944a(i, exc);
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public synchronized void mo3989a(C10615ak.C10617b c10617b) {
        C10709a.m4037a(c10617b, q(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3998a(C10710b c10710b) {
        if (c10710b == null) {
            return;
        }
        if (c10710b.m4020d()) {
            AbstractC10404b.m5269a("[Slim] RCV blob chid=" + c10710b.m4023c() + "; id=" + c10710b.m4015h() + "; errCode=" + c10710b.m4018e() + "; err=" + c10710b.m4017f());
        }
        if (c10710b.m4023c() == 0) {
            if ("PING".equals(c10710b.m4035a())) {
                AbstractC10404b.m5269a("[Slim] RCV ping id=" + c10710b.m4015h());
                u();
            } else if ("CLOSE".equals(c10710b.m4035a())) {
                c(13, null);
            }
        }
        for (AbstractC10716a.C10717a c10717a : this.f33405g.values()) {
            c10717a.m3966a(c10710b);
        }
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    @Deprecated
    /* renamed from: a */
    public void mo3986a(AbstractC10735d abstractC10735d) {
        mo3982b(C10710b.m4032a(abstractC10735d, (String) null));
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public synchronized void mo3984a(String str, String str2) {
        C10709a.m4036a(str, str2, this);
    }

    @Override // com.xiaomi.smack.AbstractC10726h
    /* renamed from: a */
    protected void mo3939a(boolean z) {
        if (this.f33396x != null) {
            C10710b m3995c = m3995c(z);
            AbstractC10404b.m5269a("[Slim] SND ping id=" + m3995c.m4015h());
            mo3982b(m3995c);
            t();
            return;
        }
        throw new C10730l("The BlobWriter is null.");
    }

    @Override // com.xiaomi.smack.AbstractC10726h, com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public void mo3938a(C10710b[] c10710bArr) {
        for (C10710b c10710b : c10710bArr) {
            mo3982b(c10710b);
        }
    }

    @Override // com.xiaomi.smack.AbstractC10726h, com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public void mo3937a(AbstractC10735d[] abstractC10735dArr) {
        for (AbstractC10735d abstractC10735d : abstractC10735dArr) {
            mo3986a(abstractC10735d);
        }
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: a */
    public boolean mo3993a() {
        return true;
    }

    @Override // com.xiaomi.smack.AbstractC10726h
    /* renamed from: b */
    protected synchronized void mo3936b() {
        m3994v();
        this.f33396x.m4002a();
    }

    @Override // com.xiaomi.smack.AbstractC10716a
    /* renamed from: b */
    public void mo3982b(C10710b c10710b) {
        if (this.f33396x != null) {
            try {
                int m4001a = this.f33396x.m4001a(c10710b);
                String m4014i = c10710b.m4014i();
                if (!TextUtils.isEmpty(m4014i)) {
                    C10752g.m3827a(this.f33412n, m4014i, m4001a, false, System.currentTimeMillis());
                }
                for (AbstractC10716a.C10717a c10717a : this.f33406h.values()) {
                    c10717a.m3966a(c10710b);
                }
                return;
            } catch (Exception e) {
                throw new C10730l(e);
            }
        }
        throw new C10730l("the writer is null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m3996b(AbstractC10735d abstractC10735d) {
        if (abstractC10735d == null) {
            return;
        }
        for (AbstractC10716a.C10717a c10717a : this.f33405g.values()) {
            c10717a.m3965a(abstractC10735d);
        }
    }
}
