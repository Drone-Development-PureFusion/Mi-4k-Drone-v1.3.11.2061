package p005b.p006a.p007a.p029b.p058r;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* renamed from: b.a.a.b.r.b */
/* loaded from: classes.dex */
public class C0703b {

    /* renamed from: a */
    long f1277a = -1;

    /* renamed from: b */
    String f1278b = null;

    /* renamed from: c */
    final SimpleDateFormat f1279c;

    public C0703b(String str) {
        this.f1279c = new SimpleDateFormat(str);
    }

    /* renamed from: a */
    public final String m38440a(long j) {
        String str;
        synchronized (this) {
            if (j != this.f1277a) {
                this.f1277a = j;
                this.f1278b = this.f1279c.format(new Date(j));
            }
            str = this.f1278b;
        }
        return str;
    }

    /* renamed from: a */
    public void m38439a(TimeZone timeZone) {
        this.f1279c.setTimeZone(timeZone);
    }
}
