package com.xiaomi.measite.smack;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.AbstractC10720d;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.measite.smack.b */
/* loaded from: classes2.dex */
public class C10461b implements AbstractC10720d {

    /* renamed from: a */
    final /* synthetic */ C10459a f32530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10461b(C10459a c10459a) {
        this.f32530a = c10459a;
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3803a(AbstractC10716a abstractC10716a) {
        AbstractC10716a abstractC10716a2;
        StringBuilder append = new StringBuilder().append("[Slim] ").append(this.f32530a.f32522b.format(new Date())).append(" Connection reconnected (");
        abstractC10716a2 = this.f32530a.f32523c;
        AbstractC10404b.m5265c(append.append(abstractC10716a2.hashCode()).append(")").toString());
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3802a(AbstractC10716a abstractC10716a, int i, Exception exc) {
        AbstractC10716a abstractC10716a2;
        StringBuilder append = new StringBuilder().append("[Slim] ").append(this.f32530a.f32522b.format(new Date())).append(" Connection closed (");
        abstractC10716a2 = this.f32530a.f32523c;
        AbstractC10404b.m5265c(append.append(abstractC10716a2.hashCode()).append(")").toString());
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3801a(AbstractC10716a abstractC10716a, Exception exc) {
        AbstractC10716a abstractC10716a2;
        StringBuilder append = new StringBuilder().append("[Slim] ").append(this.f32530a.f32522b.format(new Date())).append(" Reconnection failed due to an exception (");
        abstractC10716a2 = this.f32530a.f32523c;
        AbstractC10404b.m5265c(append.append(abstractC10716a2.hashCode()).append(")").toString());
        exc.printStackTrace();
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: b */
    public void mo3799b(AbstractC10716a abstractC10716a) {
        AbstractC10716a abstractC10716a2;
        StringBuilder append = new StringBuilder().append("[Slim] ").append(this.f32530a.f32522b.format(new Date())).append(" Connection started (");
        abstractC10716a2 = this.f32530a.f32523c;
        AbstractC10404b.m5265c(append.append(abstractC10716a2.hashCode()).append(")").toString());
    }
}
