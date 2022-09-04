package com.fimi.soul.drone.p203g;

import com.fimi.soul.drone.p195d.p196a.p197a.C2163bz;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
/* renamed from: com.fimi.soul.drone.g.b */
/* loaded from: classes.dex */
public class C2275b {

    /* renamed from: a */
    public static final int f7143a = 176;

    /* renamed from: b */
    public static Queue<C2163bz> f7144b = new LinkedList();

    /* renamed from: a */
    public static Queue<C2163bz> m32466a() {
        return f7144b;
    }

    /* renamed from: a */
    public static void m32464a(Queue<C2163bz> queue) {
        queue.removeAll(queue);
    }

    /* renamed from: a */
    public static byte[] m32465a(int i, InputStream inputStream, long j) {
        int i2 = 1;
        if (f7144b.size() > 1) {
            m32464a(f7144b);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[176];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                inputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
            C2163bz c2163bz = new C2163bz();
            c2163bz.f6676e = (byte) i;
            c2163bz.f6675d = (short) i2;
            if (bArr.length == 176) {
                c2163bz.m32866a(bArr.length);
                c2163bz.m32865b(bArr.length + 3);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    c2163bz.f6677f[i3] = bArr[i3];
                }
                f7144b.offer(c2163bz);
            } else {
                c2163bz.m32866a(bArr.length);
                c2163bz.m32865b(bArr.length + 3);
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    c2163bz.f6677f[i4] = bArr[i4];
                }
                f7144b.offer(c2163bz);
            }
            bArr = new byte[176];
            i2++;
        }
    }
}
