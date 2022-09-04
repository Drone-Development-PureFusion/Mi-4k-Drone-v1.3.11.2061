package p005b.p006a.p007a.p008a.p009a;

import android.util.Log;
import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0291g;
import p005b.p006a.p007a.p008a.p013d.C0282a;
import p005b.p006a.p007a.p008a.p026n.AbstractC0366d;
import p005b.p006a.p007a.p029b.AbstractC0404b;
import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.p045i.AbstractC0591k;
/* renamed from: b.a.a.a.a.d */
/* loaded from: classes.dex */
public class C0268d extends AbstractC0404b<AbstractC0366d> {

    /* renamed from: a */
    private static final int f139a = 23;

    /* renamed from: b */
    private C0282a f140b = null;

    /* renamed from: c */
    private C0282a f141c = null;

    /* renamed from: d */
    private boolean f142d = false;

    /* renamed from: a */
    public C0282a m39843a() {
        return this.f140b;
    }

    /* renamed from: a */
    public void m39842a(C0282a c0282a) {
        this.f140b = c0282a;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo38607a(AbstractC0366d abstractC0366d) {
        if (!b_()) {
            return;
        }
        String m39837b = m39837b(abstractC0366d);
        switch (abstractC0366d.mo39538b().f217v) {
            case Integer.MIN_VALUE:
            case 5000:
                if (this.f142d && !Log.isLoggable(m39837b, 2)) {
                    return;
                }
                Log.v(m39837b, this.f140b.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d));
                return;
            case 10000:
                if (this.f142d && !Log.isLoggable(m39837b, 3)) {
                    return;
                }
                Log.d(m39837b, this.f140b.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d));
                return;
            case 20000:
                if (this.f142d && !Log.isLoggable(m39837b, 4)) {
                    return;
                }
                Log.i(m39837b, this.f140b.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d));
                return;
            case 30000:
                if (this.f142d && !Log.isLoggable(m39837b, 5)) {
                    return;
                }
                Log.w(m39837b, this.f140b.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d));
                return;
            case C0281d.f197b /* 40000 */:
                if (this.f142d && !Log.isLoggable(m39837b, 6)) {
                    return;
                }
                Log.e(m39837b, this.f140b.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void m39840a(boolean z) {
        this.f142d = z;
    }

    /* renamed from: b */
    public C0282a m39839b() {
        return this.f141c;
    }

    /* renamed from: b */
    protected String m39837b(AbstractC0366d abstractC0366d) {
        String mo38773a = this.f141c != null ? this.f141c.d().mo38773a((AbstractC0594j<AbstractC0366d>) abstractC0366d) : abstractC0366d.mo39534f();
        return (!this.f142d || mo38773a.length() <= 23) ? mo38773a : mo38773a.substring(0, 22) + AbstractC11759f.f37104a;
    }

    /* renamed from: b */
    public void m39838b(C0282a c0282a) {
        this.f141c = c0282a;
    }

    /* renamed from: c */
    public boolean m39836c() {
        return this.f142d;
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0404b, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f140b == null || this.f140b.d() == null) {
            c("No layout set for the appender named [" + this.f485g + "].");
            return;
        }
        if (this.f141c != null) {
            AbstractC0594j<AbstractC0366d> d = this.f141c.d();
            if (d == null) {
                c("No tag layout set for the appender named [" + this.f485g + "].");
                return;
            } else if (d instanceof C0291g) {
                String h = this.f141c.h();
                if (!h.contains("%nopex")) {
                    this.f141c.k();
                    this.f141c.a(h + "%nopex");
                    this.f141c.mo38474j();
                }
                ((C0291g) d).a((AbstractC0591k) null);
            }
        }
        super.mo38474j();
    }
}
