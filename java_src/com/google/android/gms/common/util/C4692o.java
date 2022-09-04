package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: com.google.android.gms.common.util.o */
/* loaded from: classes2.dex */
public final class C4692o {
    /* renamed from: a */
    public static long m23122a(InputStream inputStream, OutputStream outputStream) {
        return m23121a(inputStream, outputStream, false);
    }

    /* renamed from: a */
    public static long m23121a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return m23120a(inputStream, outputStream, z, 1024);
    }

    /* renamed from: a */
    public static long m23120a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m23124a((Closeable) inputStream);
                    m23124a(outputStream);
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public static void m23125a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m23124a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static byte[] m23123a(InputStream inputStream) {
        return m23119a(inputStream, true);
    }

    /* renamed from: a */
    public static byte[] m23119a(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m23121a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
