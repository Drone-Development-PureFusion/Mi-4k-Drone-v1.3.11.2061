package p005b.p006a.p007a.p029b.p052m.p053a;

import java.io.File;
import java.util.Date;
import p005b.p006a.p007a.p029b.p045i.AbstractC0566b;
import p005b.p006a.p007a.p029b.p045i.C0588h;
import p005b.p006a.p007a.p029b.p055o.C0662f;
/* renamed from: b.a.a.b.m.a.g */
/* loaded from: classes.dex */
public abstract class AbstractC0613g extends C0662f implements AbstractC0606a {

    /* renamed from: a */
    protected static final long f1069a = -1;

    /* renamed from: b */
    protected static final long f1070b = 5529600000L;

    /* renamed from: c */
    static final int f1071c = 336;

    /* renamed from: d */
    final C0618i f1072d;

    /* renamed from: e */
    final C0624o f1073e;

    /* renamed from: f */
    int f1074f;

    /* renamed from: g */
    final boolean f1075g;

    /* renamed from: h */
    long f1076h = -1;

    public AbstractC0613g(C0618i c0618i, C0624o c0624o) {
        this.f1072d = c0618i;
        this.f1073e = c0624o;
        this.f1075g = m38722a(c0618i);
    }

    /* renamed from: a */
    private void m38720a(File file, int i) {
        if (i < 3 && file.isDirectory() && C0614h.m38718a(file)) {
            d("deleting folder [" + file + "]");
            file.delete();
            m38720a(file.getParentFile(), i + 1);
        }
    }

    /* renamed from: a */
    int m38723a(long j) {
        long j2 = 336;
        if (this.f1076h == -1) {
            d("first clean up after appender initialization");
            long m38687a = this.f1073e.m38687a(j, f1070b + j);
            if (m38687a <= 336) {
                j2 = m38687a;
            }
        } else {
            j2 = this.f1073e.m38687a(this.f1076h, j);
            if (j2 < 1) {
                e("Unexpected periodsElapsed value " + j2);
                j2 = 1;
            }
        }
        return (int) j2;
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0606a
    /* renamed from: a */
    public void mo38724a(int i) {
        this.f1074f = (-i) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m38721a(File file) {
        m38720a(file, 0);
    }

    @Override // p005b.p006a.p007a.p029b.p052m.p053a.AbstractC0606a
    /* renamed from: a */
    public void mo38719a(Date date) {
        long time = date.getTime();
        int m38723a = m38723a(time);
        this.f1076h = time;
        if (m38723a > 1) {
            d("periodsElapsed = " + m38723a);
        }
        for (int i = 0; i < m38723a; i++) {
            mo38678a(date, this.f1074f - i);
        }
    }

    /* renamed from: a */
    abstract void mo38678a(Date date, int i);

    /* renamed from: a */
    boolean m38722a(C0618i c0618i) {
        if (c0618i.m38701b().m38728a().indexOf(47) != -1) {
            return true;
        }
        AbstractC0566b<Object> abstractC0566b = c0618i.f1080c;
        while (abstractC0566b != null && !(abstractC0566b instanceof C0612f)) {
            abstractC0566b = abstractC0566b.m38860b();
        }
        while (abstractC0566b != null) {
            if ((abstractC0566b instanceof C0588h) && abstractC0566b.mo38694a(null).indexOf(47) != -1) {
                return true;
            }
            abstractC0566b = abstractC0566b.m38860b();
        }
        return false;
    }
}
