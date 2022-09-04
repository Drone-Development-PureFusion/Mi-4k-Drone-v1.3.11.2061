package com.xiaomi.measite.smack;

import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.AbstractC10720d;
import com.xiaomi.smack.AbstractC10723f;
import com.xiaomi.smack.debugger.AbstractC10721a;
import com.xiaomi.smack.filter.AbstractC10724a;
import com.xiaomi.smack.packet.AbstractC10735d;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.xiaomi.measite.smack.a */
/* loaded from: classes2.dex */
public class C10459a implements AbstractC10721a {

    /* renamed from: a */
    public static boolean f32521a;

    /* renamed from: c */
    private AbstractC10716a f32523c;

    /* renamed from: b */
    private SimpleDateFormat f32522b = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: d */
    private C10460a f32524d = null;

    /* renamed from: e */
    private C10460a f32525e = null;

    /* renamed from: f */
    private AbstractC10720d f32526f = null;

    /* renamed from: g */
    private final String f32527g = "[Slim] ";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.measite.smack.a$a */
    /* loaded from: classes2.dex */
    public class C10460a implements AbstractC10723f, AbstractC10724a {

        /* renamed from: a */
        String f32528a;

        C10460a(boolean z) {
            this.f32528a = z ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.smack.AbstractC10723f
        /* renamed from: a */
        public void mo3953a(C10710b c10710b) {
            if (C10459a.f32521a) {
                AbstractC10404b.m5265c("[Slim] " + C10459a.this.f32522b.format(new Date()) + this.f32528a + c10710b.toString());
            } else {
                AbstractC10404b.m5265c("[Slim] " + C10459a.this.f32522b.format(new Date()) + this.f32528a + " Blob [" + c10710b.m4035a() + Constants.ACCEPT_TIME_SEPARATOR_SP + c10710b.m4023c() + Constants.ACCEPT_TIME_SEPARATOR_SP + c10710b.m4015h() + "]");
            }
        }

        @Override // com.xiaomi.smack.filter.AbstractC10724a
        /* renamed from: a */
        public boolean mo3951a(AbstractC10735d abstractC10735d) {
            return true;
        }

        @Override // com.xiaomi.smack.AbstractC10723f
        /* renamed from: b */
        public void mo3952b(AbstractC10735d abstractC10735d) {
            if (C10459a.f32521a) {
                AbstractC10404b.m5265c("[Slim] " + C10459a.this.f32522b.format(new Date()) + this.f32528a + " PKT " + abstractC10735d.mo3862c());
            } else {
                AbstractC10404b.m5265c("[Slim] " + C10459a.this.f32522b.format(new Date()) + this.f32528a + " PKT [" + abstractC10735d.m3884l() + Constants.ACCEPT_TIME_SEPARATOR_SP + abstractC10735d.m3886k() + "]");
            }
        }
    }

    static {
        boolean z = true;
        if (C10399j.m5291c() != 1) {
            z = false;
        }
        f32521a = z;
    }

    public C10459a(AbstractC10716a abstractC10716a) {
        this.f32523c = null;
        this.f32523c = abstractC10716a;
        m5066a();
    }

    /* renamed from: a */
    private void m5066a() {
        this.f32524d = new C10460a(true);
        this.f32525e = new C10460a(false);
        this.f32523c.m3987a(this.f32524d, this.f32524d);
        this.f32523c.m3980b(this.f32525e, this.f32525e);
        this.f32526f = new C10461b(this);
    }
}
