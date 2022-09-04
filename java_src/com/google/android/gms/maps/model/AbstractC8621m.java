package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
/* renamed from: com.google.android.gms.maps.model.m */
/* loaded from: classes2.dex */
public abstract class AbstractC8621m implements AbstractC8620l {

    /* renamed from: a */
    private final int f27584a;

    /* renamed from: c */
    private final int f27585c;

    public AbstractC8621m(int i, int i2) {
        this.f27584a = i;
        this.f27585c = i2;
    }

    /* renamed from: a */
    private static long m10956a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    /* renamed from: a */
    private static byte[] m10957a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m10956a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.gms.maps.model.AbstractC8620l
    /* renamed from: a */
    public final Tile mo10958a(int i, int i2, int i3) {
        URL m10955b = m10955b(i, i2, i3);
        if (m10955b == null) {
            return f27583b;
        }
        try {
            return new Tile(this.f27584a, this.f27585c, m10957a(m10955b.openStream()));
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: b */
    public abstract URL m10955b(int i, int i2, int i3);
}
