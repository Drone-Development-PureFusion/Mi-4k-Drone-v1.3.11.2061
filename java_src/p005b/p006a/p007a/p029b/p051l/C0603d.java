package p005b.p006a.p007a.p029b.p051l;

import java.io.OutputStream;
import p005b.p006a.p007a.p029b.p042h.C0545k;
/* renamed from: b.a.a.b.l.d */
/* loaded from: classes.dex */
public class C0603d extends AbstractC0602c {

    /* renamed from: d */
    String f1049d;

    /* renamed from: e */
    int f1050e;

    public C0603d(String str, int i) {
        this.f1049d = str;
        this.f1050e = i;
        this.f1043b = new C0545k(str, i);
        this.f1044c = true;
    }

    @Override // p005b.p006a.p007a.p029b.p051l.AbstractC0602c
    /* renamed from: c */
    String mo38738c() {
        return "syslog [" + this.f1049d + ":" + this.f1050e + "]";
    }

    @Override // p005b.p006a.p007a.p029b.p051l.AbstractC0602c
    /* renamed from: d */
    OutputStream mo38737d() {
        return new C0545k(this.f1049d, this.f1050e);
    }

    public String toString() {
        return "c.q.l.c.recovery.ResilientSyslogOutputStream@" + System.identityHashCode(this);
    }
}
