package com.p079a.p080a;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.p079a.p080a.C0880o;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
/* renamed from: com.a.a.ac */
/* loaded from: classes.dex */
public abstract class AbstractC0864ac {

    /* renamed from: a */
    private static final byte[] f1797a = C0898z.m37448a(8448);

    /* renamed from: a */
    public static long m37595a(int i) {
        return i < 0 ? FimiMediaMeta.AV_CH_WIDE_RIGHT + i : i;
    }

    /* renamed from: a */
    public static C0898z m37589a(Date date) {
        return new C0898z(m37594a(date.getTime()));
    }

    /* renamed from: a */
    private static String m37593a(AbstractC0859a abstractC0859a, byte[] bArr) {
        if (abstractC0859a != null) {
            CRC32 crc32 = new CRC32();
            crc32.update(bArr);
            if (crc32.getValue() != abstractC0859a.m37656d_()) {
                return null;
            }
            try {
                return AbstractC0888v.f1903b.mo37520a(abstractC0859a.m37657b());
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Date m37590a(C0898z c0898z) {
        return new Date(m37587b(c0898z.m37445b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m37591a(C0890w c0890w, byte[] bArr, byte[] bArr2) {
        String m37593a;
        String name = c0890w.getName();
        String m37593a2 = m37593a((C0876k) c0890w.m37498b(C0876k.f1834a), bArr);
        if (m37593a2 != null && !name.equals(m37593a2)) {
            c0890w.m37507a(m37593a2);
        }
        if (bArr2 == null || bArr2.length <= 0 || (m37593a = m37593a((C0875j) c0890w.m37498b(C0875j.f1833a), bArr2)) == null) {
            return;
        }
        c0890w.setComment(m37593a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m37592a(C0890w c0890w) {
        return m37585c(c0890w) && m37584d(c0890w);
    }

    /* renamed from: a */
    public static byte[] m37594a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        if (i < 1980) {
            return m37588a(f1797a);
        }
        return C0898z.m37448a((calendar.get(13) >> 1) | ((i - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static byte[] m37588a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return null;
    }

    /* renamed from: b */
    public static long m37587b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j >> 16)) & 31);
        calendar.set(11, ((int) (j >> 11)) & 31);
        calendar.set(12, ((int) (j >> 5)) & 63);
        calendar.set(13, ((int) (j << 1)) & 62);
        return calendar.getTime().getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m37586b(C0890w c0890w) {
        if (!m37585c(c0890w)) {
            throw new C0880o(C0880o.C0881a.f1850a, c0890w);
        }
        if (m37584d(c0890w)) {
            return;
        }
        throw new C0880o(C0880o.C0881a.f1851b, c0890w);
    }

    /* renamed from: c */
    private static boolean m37585c(C0890w c0890w) {
        return !c0890w.m37486l().m37558c();
    }

    /* renamed from: d */
    private static boolean m37584d(C0890w c0890w) {
        return c0890w.getMethod() == 0 || c0890w.getMethod() == 8;
    }
}
