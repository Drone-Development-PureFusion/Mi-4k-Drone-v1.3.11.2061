package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.rq */
/* loaded from: classes2.dex */
public class C7669rq {

    /* renamed from: b */
    private static Cipher f25462b = null;

    /* renamed from: c */
    private static final Object f25463c = new Object();

    /* renamed from: d */
    private static final Object f25464d = new Object();

    /* renamed from: a */
    private final SecureRandom f25465a;

    /* renamed from: com.google.android.gms.internal.rq$a */
    /* loaded from: classes2.dex */
    public class C7670a extends Exception {
        public C7670a() {
        }

        public C7670a(Throwable th) {
            super(th);
        }
    }

    public C7669rq(SecureRandom secureRandom) {
        this.f25465a = secureRandom;
    }

    /* renamed from: a */
    private Cipher m13779a() {
        Cipher cipher;
        synchronized (f25464d) {
            if (f25462b == null) {
                f25462b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f25462b;
        }
        return cipher;
    }

    /* renamed from: a */
    static void m13777a(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ 68);
        }
    }

    /* renamed from: a */
    public String m13775a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length != 16) {
            throw new C7670a();
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f25463c) {
                m13779a().init(1, secretKeySpec, this.f25465a);
                doFinal = m13779a().doFinal(bArr2);
                iv = m13779a().getIV();
            }
            int length = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length];
            allocate.get(bArr3);
            return C7253jl.m15088a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new C7670a(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C7670a(e2);
        } catch (BadPaddingException e3) {
            throw new C7670a(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new C7670a(e4);
        } catch (NoSuchPaddingException e5) {
            throw new C7670a(e5);
        }
    }

    /* renamed from: a */
    public byte[] m13778a(String str) {
        try {
            byte[] m15089a = C7253jl.m15089a(str, false);
            if (m15089a.length != 32) {
                throw new C7670a();
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(m15089a, 4, 16).get(bArr);
            m13777a(bArr);
            return bArr;
        } catch (IllegalArgumentException e) {
            throw new C7670a(e);
        }
    }

    /* renamed from: a */
    public byte[] m13776a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length != 16) {
            throw new C7670a();
        }
        try {
            byte[] m15089a = C7253jl.m15089a(str, false);
            if (m15089a.length <= 16) {
                throw new C7670a();
            }
            ByteBuffer allocate = ByteBuffer.allocate(m15089a.length);
            allocate.put(m15089a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[m15089a.length - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f25463c) {
                m13779a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = m13779a().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e) {
            throw new C7670a(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new C7670a(e2);
        } catch (InvalidKeyException e3) {
            throw new C7670a(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new C7670a(e4);
        } catch (BadPaddingException e5) {
            throw new C7670a(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new C7670a(e6);
        } catch (NoSuchPaddingException e7) {
            throw new C7670a(e7);
        }
    }
}
