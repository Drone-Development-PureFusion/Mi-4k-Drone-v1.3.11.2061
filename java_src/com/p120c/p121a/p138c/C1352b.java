package com.p120c.p121a.p138c;

import android.opengl.GLES10;
import com.p120c.p121a.p129b.p130a.C1300e;
import com.p120c.p121a.p129b.p130a.EnumC1303h;
import com.p120c.p121a.p129b.p135e.AbstractC1333a;
/* renamed from: com.c.a.c.b */
/* loaded from: classes.dex */
public final class C1352b {

    /* renamed from: a */
    private static final int f3526a = 2048;

    /* renamed from: b */
    private static C1300e f3527b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f3527b = new C1300e(max, max);
    }

    private C1352b() {
    }

    /* renamed from: a */
    private static int m35625a(int i, int i2, int i3, boolean z) {
        int m35911a = f3527b.m35911a();
        int m35908b = f3527b.m35908b();
        while (true) {
            if (i / i3 > m35911a || i2 / i3 > m35908b) {
                i3 = z ? i3 * 2 : i3 + 1;
            } else {
                return i3;
            }
        }
    }

    /* renamed from: a */
    public static int m35624a(C1300e c1300e) {
        int m35911a = c1300e.m35911a();
        int m35908b = c1300e.m35908b();
        return Math.max((int) Math.ceil(m35911a / f3527b.m35911a()), (int) Math.ceil(m35908b / f3527b.m35908b()));
    }

    /* renamed from: a */
    public static int m35623a(C1300e c1300e, C1300e c1300e2, EnumC1303h enumC1303h, boolean z) {
        int min;
        int i = 1;
        int m35911a = c1300e.m35911a();
        int m35908b = c1300e.m35908b();
        int m35911a2 = c1300e2.m35911a();
        int m35908b2 = c1300e2.m35908b();
        switch (enumC1303h) {
            case FIT_INSIDE:
                if (!z) {
                    min = Math.max(m35911a / m35911a2, m35908b / m35908b2);
                    break;
                } else {
                    int i2 = m35911a / 2;
                    int i3 = m35908b / 2;
                    min = 1;
                    while (true) {
                        if (i2 / min <= m35911a2 && i3 / min <= m35908b2) {
                            break;
                        } else {
                            min *= 2;
                        }
                    }
                }
                break;
            case CROP:
                if (!z) {
                    min = Math.min(m35911a / m35911a2, m35908b / m35908b2);
                    break;
                } else {
                    int i4 = m35911a / 2;
                    int i5 = m35908b / 2;
                    min = 1;
                    while (i4 / min > m35911a2 && i5 / min > m35908b2) {
                        min *= 2;
                    }
                }
                break;
            default:
                min = 1;
                break;
        }
        if (min >= 1) {
            i = min;
        }
        return m35625a(m35911a, m35908b, i, z);
    }

    /* renamed from: a */
    public static C1300e m35622a(AbstractC1333a abstractC1333a, C1300e c1300e) {
        int mo35686a = abstractC1333a.mo35686a();
        if (mo35686a <= 0) {
            mo35686a = c1300e.m35911a();
        }
        int mo35681b = abstractC1333a.mo35681b();
        if (mo35681b <= 0) {
            mo35681b = c1300e.m35908b();
        }
        return new C1300e(mo35686a, mo35681b);
    }

    /* renamed from: b */
    public static float m35621b(C1300e c1300e, C1300e c1300e2, EnumC1303h enumC1303h, boolean z) {
        int i;
        int i2;
        int m35911a = c1300e.m35911a();
        int m35908b = c1300e.m35908b();
        int m35911a2 = c1300e2.m35911a();
        int m35908b2 = c1300e2.m35908b();
        float f = m35911a / m35911a2;
        float f2 = m35908b / m35908b2;
        if ((enumC1303h != EnumC1303h.FIT_INSIDE || f < f2) && (enumC1303h != EnumC1303h.CROP || f >= f2)) {
            i = (int) (m35911a / f2);
            i2 = m35908b2;
        } else {
            i = m35911a2;
            i2 = (int) (m35908b / f);
        }
        if ((z || i >= m35911a || i2 >= m35908b) && (!z || i == m35911a || i2 == m35908b)) {
            return 1.0f;
        }
        return i / m35911a;
    }
}
