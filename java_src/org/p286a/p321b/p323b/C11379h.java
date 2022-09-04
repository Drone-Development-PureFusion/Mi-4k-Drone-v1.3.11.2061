package org.p286a.p321b.p323b;

import org.p286a.p321b.C11392f;
/* renamed from: org.a.b.b.h */
/* loaded from: classes2.dex */
public class C11379h {

    /* renamed from: a */
    private static int f36488a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m1228a(AbstractC11376e abstractC11376e, byte b) {
        m1227a(abstractC11376e, b, f36488a);
    }

    /* renamed from: a */
    public static void m1227a(AbstractC11376e abstractC11376e, byte b, int i) {
        int i2 = 0;
        if (i <= 0) {
            throw new C11392f("Maximum skip depth exceeded");
        }
        switch (b) {
            case 2:
                abstractC11376e.mo1235q();
                return;
            case 3:
                abstractC11376e.mo1234r();
                return;
            case 4:
                abstractC11376e.mo1230v();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                abstractC11376e.mo1233s();
                return;
            case 8:
                abstractC11376e.mo1232t();
                return;
            case 10:
                abstractC11376e.mo1231u();
                return;
            case 11:
                abstractC11376e.mo1222x();
                return;
            case 12:
                abstractC11376e.mo1242g();
                while (true) {
                    C11373b mo1240i = abstractC11376e.mo1240i();
                    if (mo1240i.f36479b == 0) {
                        abstractC11376e.mo1241h();
                        return;
                    } else {
                        m1227a(abstractC11376e, mo1240i.f36479b, i - 1);
                        abstractC11376e.mo1239j();
                    }
                }
            case 13:
                C11375d mo1226k = abstractC11376e.mo1226k();
                while (i2 < mo1226k.f36485c) {
                    m1227a(abstractC11376e, mo1226k.f36483a, i - 1);
                    m1227a(abstractC11376e, mo1226k.f36484b, i - 1);
                    i2++;
                }
                abstractC11376e.mo1238l();
                return;
            case 14:
                C11380i mo1224o = abstractC11376e.mo1224o();
                while (i2 < mo1224o.f36490b) {
                    m1227a(abstractC11376e, mo1224o.f36489a, i - 1);
                    i2++;
                }
                abstractC11376e.mo1236p();
                return;
            case 15:
                C11374c mo1225m = abstractC11376e.mo1225m();
                while (i2 < mo1225m.f36482b) {
                    m1227a(abstractC11376e, mo1225m.f36481a, i - 1);
                    i2++;
                }
                abstractC11376e.mo1237n();
                return;
        }
    }
}
