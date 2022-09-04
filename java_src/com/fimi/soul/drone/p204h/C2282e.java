package com.fimi.soul.drone.p204h;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* renamed from: com.fimi.soul.drone.h.e */
/* loaded from: classes.dex */
public class C2282e {
    /* renamed from: a */
    public static byte[] m32449a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
