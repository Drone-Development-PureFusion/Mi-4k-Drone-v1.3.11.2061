package com.fimi.soul.drone.p204h;

import android.content.Context;
import com.fimi.soul.drone.p195d.p196a.p197a.C2163bz;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.fimi.soul.drone.h.d */
/* loaded from: classes.dex */
public class C2281d {

    /* renamed from: a */
    public static Queue<C2163bz> f7293a = new LinkedList();

    /* renamed from: a */
    public static Queue<C2163bz> m32452a() {
        return f7293a;
    }

    /* renamed from: a */
    public static void m32450a(Queue<C2163bz> queue) {
        queue.removeAll(queue);
    }

    /* renamed from: a */
    public static byte[] m32451a(InputStream inputStream, long j, Context context) {
        if (f7293a.size() > 1) {
            m32450a(f7293a);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Opcodes.GETFIELD];
        int i = 1;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                inputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
            C2163bz c2163bz = new C2163bz();
            c2163bz.f6675d = (short) i;
            if (bArr.length == 180) {
                c2163bz.m32866a(bArr.length);
                c2163bz.m32865b(bArr.length + 2);
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    c2163bz.f6677f[i2] = bArr[i2];
                }
                f7293a.offer(c2163bz);
            } else {
                c2163bz.m32866a(bArr.length);
                c2163bz.m32865b(bArr.length + 2);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    c2163bz.f6677f[i3] = bArr[i3];
                }
                f7293a.offer(c2163bz);
            }
            bArr = ((long) i) == j / 180 ? new byte[(int) (j % 180)] : new byte[Opcodes.GETFIELD];
            i++;
        }
    }
}
