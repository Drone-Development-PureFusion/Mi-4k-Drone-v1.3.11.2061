package p005b.p006a.p007a.p029b.p042h;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
/* renamed from: b.a.a.b.h.d */
/* loaded from: classes.dex */
public class C0532d extends Authenticator {

    /* renamed from: a */
    String f835a;

    /* renamed from: b */
    String f836b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0532d(String str, String str2) {
        this.f835a = str;
        this.f836b = str2;
    }

    /* renamed from: a */
    public PasswordAuthentication m38955a() {
        return new PasswordAuthentication(this.f835a, this.f836b);
    }
}
