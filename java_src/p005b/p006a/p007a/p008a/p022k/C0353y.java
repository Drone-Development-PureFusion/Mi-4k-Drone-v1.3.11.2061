package p005b.p006a.p007a.p008a.p022k;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.p286a.p287a.p299f.p302c.C11125l;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p008a.p028p.C0397e;
import p005b.p006a.p007a.p029b.p042h.AbstractC0543i;
/* renamed from: b.a.a.a.k.y */
/* loaded from: classes.dex */
public class C0353y extends AbstractC0333e {

    /* renamed from: c */
    SimpleDateFormat f350c;

    /* renamed from: e */
    int f352e;

    /* renamed from: a */
    long f348a = -1;

    /* renamed from: b */
    String f349b = null;

    /* renamed from: d */
    final String f351d = "localhost";

    /* renamed from: a */
    String m39600a(long j) {
        String str;
        synchronized (this) {
            if (j != this.f348a) {
                this.f348a = j;
                this.f349b = this.f350c.format(new Date(j));
            }
            str = this.f349b;
        }
        return str;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0566b
    /* renamed from: a */
    public String mo38694a(AbstractC0366d abstractC0366d) {
        return "<" + (this.f352e + C0397e.m39429a(abstractC0366d)) + ">" + m39600a(abstractC0366d.mo39526n()) + C11125l.f35805c + "localhost" + C11125l.f35805c;
    }

    @Override // p005b.p006a.p007a.p029b.p045i.AbstractC0584d, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        boolean z = false;
        String d = d();
        if (d == null) {
            c("was expecting a facility string as an option");
            return;
        }
        this.f352e = AbstractC0543i.m38887b(d);
        try {
            this.f350c = new SimpleDateFormat("MMM dd HH:mm:ss", new DateFormatSymbols(Locale.US));
        } catch (IllegalArgumentException e) {
            a("Could not instantiate SimpleDateFormat", e);
            z = true;
        }
        if (z) {
            return;
        }
        super.j();
    }
}
