package com.xiaomi.push.service;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.zxing.client.result.optional.NDEFRecord;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.network.Fallback;
import com.xiaomi.network.HostManager;
import com.xiaomi.push.log.C10559b;
import com.xiaomi.push.protobuf.C10570b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.C10718b;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.packet.C10731a;
import com.xiaomi.smack.packet.C10732b;
import com.xiaomi.smack.packet.C10734c;
import com.xiaomi.smack.util.C10752g;
import com.xiaomi.stats.C10764h;
import java.util.Date;
/* loaded from: classes.dex */
public class PacketSync {

    /* renamed from: a */
    private XMPushService f32923a;

    /* loaded from: classes.dex */
    public interface PacketReceiveHandler extends Parcelable {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PacketSync(XMPushService xMPushService) {
        this.f32923a = xMPushService;
    }

    /* renamed from: a */
    private void m4507a(C10731a c10731a) {
        String m3917c = c10731a.m3917c();
        if (!TextUtils.isEmpty(m3917c)) {
            String[] split = m3917c.split(";");
            Fallback fallbacksByHost = HostManager.getInstance().getFallbacksByHost(C10718b.m3960b(), false);
            if (fallbacksByHost == null || split.length <= 0) {
                return;
            }
            fallbacksByHost.m4765a(split);
            this.f32923a.m4499a(20, (Exception) null);
            this.f32923a.m4477a(true);
        }
    }

    /* renamed from: b */
    private void m4504b(AbstractC10735d abstractC10735d) {
        C10615ak.C10617b m4374b;
        String m3882m = abstractC10735d.m3882m();
        String m3884l = abstractC10735d.m3884l();
        if (TextUtils.isEmpty(m3882m) || TextUtils.isEmpty(m3884l) || (m4374b = C10615ak.m4383a().m4374b(m3884l, m3882m)) == null) {
            return;
        }
        C10752g.m3827a(this.f32923a, m4374b.f32996a, C10752g.m3824a(abstractC10735d.mo3862c()), true, System.currentTimeMillis());
    }

    /* renamed from: c */
    private void m4503c(C10710b c10710b) {
        C10615ak.C10617b m4374b;
        String m4013j = c10710b.m4013j();
        String num = Integer.toString(c10710b.m4023c());
        if (TextUtils.isEmpty(m4013j) || TextUtils.isEmpty(num) || (m4374b = C10615ak.m4383a().m4374b(num, m4013j)) == null) {
            return;
        }
        C10752g.m3827a(this.f32923a, m4374b.f32996a, c10710b.m4011l(), true, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void m4508a(C10710b c10710b) {
        if (5 != c10710b.m4023c()) {
            m4503c(c10710b);
        }
        try {
            m4505b(c10710b);
        } catch (Exception e) {
            AbstractC10404b.m5268a("handle Blob chid = " + c10710b.m4023c() + " cmd = " + c10710b.m4035a() + " packetid = " + c10710b.m4015h() + " failure ", e);
        }
    }

    /* renamed from: a */
    public void m4506a(AbstractC10735d abstractC10735d) {
        if (!"5".equals(abstractC10735d.m3884l())) {
            m4504b(abstractC10735d);
        }
        String m3884l = abstractC10735d.m3884l();
        if (TextUtils.isEmpty(m3884l)) {
            m3884l = "1";
            abstractC10735d.m3883l(m3884l);
        }
        if (m3884l.equals("0")) {
            AbstractC10404b.m5269a("Received wrong packet with chid = 0 : " + abstractC10735d.mo3862c());
        }
        if (abstractC10735d instanceof C10732b) {
            C10731a m3875p = abstractC10735d.m3875p("kick");
            if (m3875p != null) {
                String m3882m = abstractC10735d.m3882m();
                String m3922a = m3875p.m3922a("type");
                String m3922a2 = m3875p.m3922a("reason");
                AbstractC10404b.m5269a("kicked by server, chid=" + m3884l + " userid=" + m3882m + " type=" + m3922a + " reason=" + m3922a2);
                if (!"wait".equals(m3922a)) {
                    this.f32923a.m4480a(m3884l, m3882m, 3, m3922a2, m3922a);
                    C10615ak.m4383a().m4377a(m3884l, m3882m);
                    return;
                }
                C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(m3884l, m3882m);
                if (m4374b == null) {
                    return;
                }
                this.f32923a.m4487a(m4374b);
                m4374b.m4364a(C10615ak.EnumC10619c.unbind, 3, 0, m3922a2, m3922a);
                return;
            }
        } else if (abstractC10735d instanceof C10734c) {
            C10734c c10734c = (C10734c) abstractC10735d;
            if ("redir".equals(c10734c.m3910a())) {
                C10731a p = c10734c.p("hosts");
                if (p == null) {
                    return;
                }
                m4507a(p);
                return;
            }
        }
        this.f32923a.m4459e().m4288a(this.f32923a, m3884l, abstractC10735d);
    }

    /* renamed from: b */
    public void m4505b(C10710b c10710b) {
        String m4035a = c10710b.m4035a();
        switch (c10710b.m4023c()) {
            case 0:
                if ("PING".equals(m4035a)) {
                    byte[] m4012k = c10710b.m4012k();
                    if (m4012k != null && m4012k.length > 0) {
                        C10570b.C10580j m4538b = C10570b.C10580j.m4538b(m4012k);
                        if (m4538b.m4535f()) {
                            C10630at.m4340a().m4339a(m4538b.m4534g());
                        }
                    }
                    if ("1".equals(c10710b.m4015h())) {
                        this.f32923a.m4501a();
                        return;
                    } else {
                        C10764h.m3775b();
                        return;
                    }
                } else if (!"SYNC".equals(m4035a)) {
                    if (!"NOTIFY".equals(c10710b.m4035a())) {
                        return;
                    }
                    C10570b.C10578h m4551b = C10570b.C10578h.m4551b(c10710b.m4012k());
                    AbstractC10404b.m5269a("notify by server err = " + m4551b.m4550d() + " desc = " + m4551b.m4548f());
                    return;
                } else if ("CONF".equals(c10710b.m4026b())) {
                    C10630at.m4340a().m4339a(C10570b.C10572b.m4650b(c10710b.m4012k()));
                    return;
                } else if (TextUtils.equals(NDEFRecord.URI_WELL_KNOWN_TYPE, c10710b.m4026b())) {
                    C10570b.C10581k m4522b = C10570b.C10581k.m4522b(c10710b.m4012k());
                    C10559b.m4723a(this.f32923a).m4720a(m4522b.m4521d(), m4522b.m4519f(), new Date(m4522b.m4517h()), new Date(m4522b.m4515j()), m4522b.m4511n() * 1024, m4522b.m4513l());
                    C10710b c10710b2 = new C10710b();
                    c10710b2.m4034a(0);
                    c10710b2.m4030a(c10710b.m4035a(), "UCA");
                    c10710b2.m4031a(c10710b.m4015h());
                    this.f32923a.m4494a(new C10629as(this.f32923a, c10710b2));
                    return;
                } else if (!TextUtils.equals("P", c10710b.m4026b())) {
                    return;
                } else {
                    C10570b.C10579i m4544b = C10570b.C10579i.m4544b(c10710b.m4012k());
                    C10710b c10710b3 = new C10710b();
                    c10710b3.m4034a(0);
                    c10710b3.m4030a(c10710b.m4035a(), "PCA");
                    c10710b3.m4031a(c10710b.m4015h());
                    C10570b.C10579i c10579i = new C10570b.C10579i();
                    if (m4544b.m4542e()) {
                        c10579i.m4546a(m4544b.m4543d());
                    }
                    c10710b3.m4027a(c10579i.c(), (String) null);
                    this.f32923a.m4494a(new C10629as(this.f32923a, c10710b3));
                    AbstractC10404b.m5269a("ACK msgP: id = " + c10710b.m4015h());
                    return;
                }
            default:
                String num = Integer.toString(c10710b.m4023c());
                if ("SECMSG".equals(c10710b.m4035a())) {
                    if (!c10710b.m4020d()) {
                        this.f32923a.m4459e().m4289a(this.f32923a, num, c10710b);
                        return;
                    } else {
                        AbstractC10404b.m5269a("Recv SECMSG errCode = " + c10710b.m4018e() + " errStr = " + c10710b.m4017f());
                        return;
                    }
                } else if (!"BIND".equals(m4035a)) {
                    if (!"KICK".equals(m4035a)) {
                        return;
                    }
                    C10570b.C10577g m4562b = C10570b.C10577g.m4562b(c10710b.m4012k());
                    String m4013j = c10710b.m4013j();
                    String m4560d = m4562b.m4560d();
                    String m4558f = m4562b.m4558f();
                    AbstractC10404b.m5269a("kicked by server, chid=" + num + " userid=" + m4013j + " type=" + m4560d + " reason=" + m4558f);
                    if (!"wait".equals(m4560d)) {
                        this.f32923a.m4480a(num, m4013j, 3, m4558f, m4560d);
                        C10615ak.m4383a().m4377a(num, m4013j);
                        return;
                    }
                    C10615ak.C10617b m4374b = C10615ak.m4383a().m4374b(num, m4013j);
                    if (m4374b == null) {
                        return;
                    }
                    this.f32923a.m4487a(m4374b);
                    m4374b.m4364a(C10615ak.EnumC10619c.unbind, 3, 0, m4558f, m4560d);
                    return;
                } else {
                    C10570b.C10574d m4617b = C10570b.C10574d.m4617b(c10710b.m4012k());
                    String m4013j2 = c10710b.m4013j();
                    C10615ak.C10617b m4374b2 = C10615ak.m4383a().m4374b(num, m4013j2);
                    if (m4374b2 == null) {
                        return;
                    }
                    if (m4617b.m4615d()) {
                        AbstractC10404b.m5269a("SMACK: channel bind succeeded, chid=" + c10710b.m4023c());
                        m4374b2.m4364a(C10615ak.EnumC10619c.binded, 1, 0, null, null);
                        return;
                    }
                    String m4613f = m4617b.m4613f();
                    if ("auth".equals(m4613f)) {
                        if ("invalid-sig".equals(m4617b.m4611h())) {
                            AbstractC10404b.m5269a("SMACK: bind error invalid-sig token = " + m4374b2.f32998c + " sec = " + m4374b2.f33004i);
                            C10764h.m3780a(0, EnumC10704a.BIND_INVALID_SIG.m4077a(), 1, null, 0);
                        }
                        m4374b2.m4364a(C10615ak.EnumC10619c.unbind, 1, 5, m4617b.m4611h(), m4613f);
                        C10615ak.m4383a().m4377a(num, m4013j2);
                    } else if ("cancel".equals(m4613f)) {
                        m4374b2.m4364a(C10615ak.EnumC10619c.unbind, 1, 7, m4617b.m4611h(), m4613f);
                        C10615ak.m4383a().m4377a(num, m4013j2);
                    } else if ("wait".equals(m4613f)) {
                        this.f32923a.m4487a(m4374b2);
                        m4374b2.m4364a(C10615ak.EnumC10619c.unbind, 1, 7, m4617b.m4611h(), m4613f);
                    }
                    AbstractC10404b.m5269a("SMACK: channel bind failed, chid=" + num + " reason=" + m4617b.m4611h());
                    return;
                }
        }
    }
}
