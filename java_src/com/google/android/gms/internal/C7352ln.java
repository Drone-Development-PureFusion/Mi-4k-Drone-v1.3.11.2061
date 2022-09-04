package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.internal.AbstractC6830df;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ln */
/* loaded from: classes2.dex */
public final class C7352ln {

    /* renamed from: a */
    static boolean f24546a = false;

    /* renamed from: c */
    private static MessageDigest f24548c = null;

    /* renamed from: d */
    private static final Object f24549d = new Object();

    /* renamed from: e */
    private static final Object f24550e = new Object();

    /* renamed from: b */
    static CountDownLatch f24547b = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ln$a */
    /* loaded from: classes2.dex */
    public static final class RunnableC7354a implements Runnable {
        private RunnableC7354a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MessageDigest unused = C7352ln.f24548c = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
            } finally {
                C7352ln.f24547b.countDown();
            }
        }
    }

    /* renamed from: a */
    private static int m14719a(boolean z) {
        return z ? 239 : 255;
    }

    /* renamed from: a */
    static AbstractC6830df.C6831a m14724a(long j) {
        AbstractC6830df.C6831a c6831a = new AbstractC6830df.C6831a();
        c6831a.f22981t = Long.valueOf(j);
        return c6831a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m14723a(AbstractC6830df.C6831a c6831a, String str, boolean z) {
        return m14715a(AbstractC7649rd.m13857a(c6831a), str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m14722a(String str, String str2, boolean z) {
        byte[] m14713b = m14713b(str, str2, z);
        return m14713b != null ? C7253jl.m15088a(m14713b, true) : Integer.toString(7);
    }

    /* renamed from: a */
    static String m14715a(byte[] bArr, String str, boolean z) {
        return C7253jl.m15088a(z ? m14712b(bArr, str) : m14716a(bArr, str), true);
    }

    /* renamed from: a */
    static Vector<byte[]> m14717a(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + i) - 1) / i;
        Vector<byte[]> vector = new Vector<>();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * i;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > i ? i3 + i : bArr.length));
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
        return vector;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m14725a() {
        synchronized (f24550e) {
            if (!f24546a) {
                f24546a = true;
                new Thread(new RunnableC7354a()).start();
            }
        }
    }

    /* renamed from: a */
    static void m14721a(String str, byte[] bArr) {
        if (str.length() > 32) {
            str = str.substring(0, 32);
        }
        new C7604pu(str.getBytes("UTF-8")).m14088a(bArr);
    }

    /* renamed from: a */
    public static byte[] m14718a(byte[] bArr) {
        byte[] digest;
        synchronized (f24549d) {
            MessageDigest m14714b = m14714b();
            if (m14714b == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            m14714b.reset();
            m14714b.update(bArr);
            digest = f24548c.digest();
        }
        return digest;
    }

    /* renamed from: a */
    static byte[] m14716a(byte[] bArr, String str) {
        Vector<byte[]> m14717a = m14717a(bArr, 255);
        if (m14717a == null || m14717a.size() == 0) {
            return m14712b(AbstractC7649rd.m13857a(m14724a((long) FimiMediaMeta.AV_CH_TOP_FRONT_LEFT)), str);
        }
        AbstractC6830df.C6838f c6838f = new AbstractC6830df.C6838f();
        c6838f.f23018a = new byte[m14717a.size()];
        Iterator<byte[]> it2 = m14717a.iterator();
        int i = 0;
        while (it2.hasNext()) {
            c6838f.f23018a[i] = m14711b(it2.next(), str, false);
            i++;
        }
        c6838f.f23019b = m14718a(bArr);
        return AbstractC7649rd.m13857a(c6838f);
    }

    /* renamed from: b */
    static MessageDigest m14714b() {
        m14725a();
        boolean z = false;
        try {
            z = f24547b.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
        if (z && f24548c != null) {
            return f24548c;
        }
        return null;
    }

    /* renamed from: b */
    static byte[] m14713b(String str, String str2, boolean z) {
        AbstractC6830df.C6835c c6835c = new AbstractC6830df.C6835c();
        try {
            c6835c.f23009a = str.length() < 3 ? str.getBytes("ISO-8859-1") : C7253jl.m15089a(str, true);
            c6835c.f23010b = z ? str2.length() < 3 ? str2.getBytes("ISO-8859-1") : C7253jl.m15089a(str2, true) : (str2 == null || str2.length() == 0) ? Integer.toString(5).getBytes("ISO-8859-1") : C7253jl.m15089a(m14715a(str2.getBytes("ISO-8859-1"), (String) null, C7788uf.f25824bc.m13486c().booleanValue()), true);
            return AbstractC7649rd.m13857a(c6835c);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            return null;
        }
    }

    /* renamed from: b */
    static byte[] m14712b(byte[] bArr, String str) {
        return m14711b(bArr, str, true);
    }

    /* renamed from: b */
    private static byte[] m14711b(byte[] bArr, String str, boolean z) {
        byte[] array;
        int m14719a = m14719a(z);
        if (bArr.length > m14719a) {
            bArr = AbstractC7649rd.m13857a(m14724a((long) FimiMediaMeta.AV_CH_TOP_FRONT_LEFT));
        }
        if (bArr.length < m14719a) {
            byte[] bArr2 = new byte[m14719a - bArr.length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(m14719a + 1).put((byte) bArr.length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(m14719a + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(m14718a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        new C7398mo().m14554a(array, bArr3);
        if (str != null && str.length() > 0) {
            m14721a(str, bArr3);
        }
        return bArr3;
    }
}
