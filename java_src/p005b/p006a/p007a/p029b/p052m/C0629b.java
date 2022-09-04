package p005b.p006a.p007a.p029b.p052m;

import java.io.File;
import java.util.Date;
import p005b.p006a.p007a.p029b.C0494h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0610e;
import p005b.p006a.p007a.p029b.p052m.p053a.C0614h;
import p005b.p006a.p007a.p029b.p052m.p053a.C0618i;
import p005b.p006a.p007a.p029b.p052m.p053a.C0623n;
import p005b.p006a.p007a.p029b.p052m.p053a.EnumC0608c;
/* renamed from: b.a.a.b.m.b */
/* loaded from: classes.dex */
public class C0629b extends AbstractC0633e {

    /* renamed from: a */
    static final String f1104a = "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ";

    /* renamed from: b */
    static final String f1105b = "See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported";

    /* renamed from: c */
    static final String f1106c = "Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set";

    /* renamed from: h */
    public static final String f1107h = "yyyy-MM-dd_HHmm";

    /* renamed from: m */
    private static int f1108m = 20;

    /* renamed from: g */
    C0610e f1112g;

    /* renamed from: f */
    C0623n f1111f = new C0623n();

    /* renamed from: e */
    int f1110e = 1;

    /* renamed from: d */
    int f1109d = 7;

    /* renamed from: b */
    private String m38670b(String str) {
        return C0614h.m38715a(C0614h.m38711b(str)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
    }

    /* renamed from: a */
    protected int m38673a() {
        return f1108m;
    }

    /* renamed from: a */
    public void m38672a(int i) {
        this.f1109d = i;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: b */
    public void mo38629b() {
        if (this.f1109d >= 0) {
            File file = new File(this.f1123j.m38706a(this.f1109d));
            if (file.exists()) {
                file.delete();
            }
            int i = this.f1109d;
            while (true) {
                i--;
                if (i < this.f1110e) {
                    break;
                }
                String m38706a = this.f1123j.m38706a(i);
                if (new File(m38706a).exists()) {
                    this.f1111f.m38690a(m38706a, this.f1123j.m38706a(i + 1));
                } else {
                    d("Skipping roll-over for inexistent file " + m38706a);
                }
            }
            switch (this.f1122i) {
                case NONE:
                    this.f1111f.m38690a(mo38627d(), this.f1123j.m38706a(this.f1110e));
                    return;
                case GZ:
                    this.f1112g.m38731a(mo38627d(), this.f1123j.m38706a(this.f1110e), null);
                    return;
                case ZIP:
                    this.f1112g.m38731a(mo38627d(), this.f1123j.m38706a(this.f1110e), this.f1125l.m38705a((Object) new Date()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void m38671b(int i) {
        this.f1110e = i;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0632d
    /* renamed from: d */
    public String mo38627d() {
        return n();
    }

    /* renamed from: e */
    public int m38669e() {
        return this.f1109d;
    }

    /* renamed from: f */
    public int m38668f() {
        return this.f1110e;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.AbstractC0633e, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f1111f.a(this.f1199s);
        if (this.f1124k == null) {
            c(f1104a);
            c(C0494h.f689J);
            throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
        }
        this.f1123j = new C0618i(this.f1124k, this.f1199s);
        h();
        if (m()) {
            c("Prudent mode is not supported with FixedWindowRollingPolicy.");
            c(f1105b);
            throw new IllegalStateException("Prudent mode is not supported.");
        } else if (n() == null) {
            c("The File name property must be set before using this rolling policy.");
            c(f1106c);
            throw new IllegalStateException("The \"File\" option must be set.");
        } else {
            if (this.f1109d < this.f1110e) {
                e("MaxIndex (" + this.f1109d + ") cannot be smaller than MinIndex (" + this.f1110e + ").");
                e("Setting maxIndex to equal minIndex.");
                this.f1109d = this.f1110e;
            }
            int m38673a = m38673a();
            if (this.f1109d - this.f1110e > m38673a) {
                e("Large window sizes are not allowed.");
                this.f1109d = m38673a + this.f1110e;
                e("MaxIndex reduced to " + this.f1109d);
            }
            if (this.f1123j.m38699c() == null) {
                throw new IllegalStateException("FileNamePattern [" + this.f1123j.m38698d() + "] does not contain a valid IntegerToken");
            }
            if (this.f1122i == EnumC0608c.ZIP) {
                this.f1125l = new C0618i(m38670b(this.f1124k), this.f1199s);
            }
            this.f1112g = new C0610e(this.f1122i);
            this.f1112g.a(this.f1199s);
            super.mo38474j();
        }
    }
}
