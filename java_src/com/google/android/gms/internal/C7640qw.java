package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
/* renamed from: com.google.android.gms.internal.qw */
/* loaded from: classes2.dex */
public final class C7640qw {

    /* renamed from: a */
    private final ByteBuffer f25373a;

    /* renamed from: com.google.android.gms.internal.qw$a */
    /* loaded from: classes2.dex */
    public static class C7641a extends IOException {
        C7641a(int i, int i2) {
            super(new StringBuilder(108).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(i2).append(").").toString());
        }
    }

    private C7640qw(ByteBuffer byteBuffer) {
        this.f25373a = byteBuffer;
        this.f25373a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C7640qw(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    private static int m13965a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = i;
        int i3 = length;
        while (true) {
            if (i2 < length) {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 2048) {
                    i3 += m13964a(charSequence, i2);
                    break;
                }
                i2++;
                i3 = ((127 - charAt) >>> 31) + i3;
            } else {
                break;
            }
        }
        if (i3 < length) {
            throw new IllegalArgumentException(new StringBuilder(54).append("UTF-8 length does not fit in int: ").append(i3 + FimiMediaMeta.AV_CH_WIDE_RIGHT).toString());
        }
        return i3;
    }

    /* renamed from: a */
    private static int m13964a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i3).toString());
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: a */
    private static int m13962a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        int i4 = 0;
        int i5 = i + i2;
        while (i4 < length && i4 + i < i5) {
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i + i4] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128 && i6 < i5) {
                i3 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 < 2048 && i6 <= i5 - 2) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i3 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i6 > i5 - 3) {
                if (i6 > i5 - 4) {
                    throw new ArrayIndexOutOfBoundsException(new StringBuilder(37).append("Failed writing ").append(charAt2).append(" at index ").append(i6).toString());
                }
                if (i4 + 1 != charSequence.length()) {
                    i4++;
                    char charAt3 = charSequence.charAt(i4);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i8 = i6 + 1;
                        bArr[i6] = (byte) ((codePoint >>> 18) | 240);
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i3 = i10 + 1;
                        bArr[i10] = (byte) ((codePoint & 63) | 128);
                    }
                }
                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i4 - 1).toString());
            } else {
                int i11 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> '\f') | 480);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i3 = i12 + 1;
                bArr[i12] = (byte) ((charAt2 & '?') | 128);
            }
            i4++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: a */
    public static C7640qw m13959a(byte[] bArr) {
        return m13958a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C7640qw m13958a(byte[] bArr, int i, int i2) {
        return new C7640qw(bArr, i, i2);
    }

    /* renamed from: a */
    private static void m13963a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (!byteBuffer.hasArray()) {
            m13943b(charSequence, byteBuffer);
            return;
        }
        try {
            byteBuffer.position(m13962a(charSequence, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining()) - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    /* renamed from: b */
    public static int m13956b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m13955b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m13953b(int i, double d) {
        return m13921f(i) + m13956b(d);
    }

    /* renamed from: b */
    public static int m13952b(int i, float f) {
        return m13921f(i) + m13955b(f);
    }

    /* renamed from: b */
    public static int m13949b(int i, AbstractC7649rd abstractC7649rd) {
        return (m13921f(i) * 2) + m13933c(abstractC7649rd);
    }

    /* renamed from: b */
    public static int m13948b(int i, String str) {
        return m13921f(i) + m13942b(str);
    }

    /* renamed from: b */
    public static int m13947b(int i, boolean z) {
        return m13921f(i) + m13941b(z);
    }

    /* renamed from: b */
    public static int m13946b(int i, byte[] bArr) {
        return m13921f(i) + m13932c(bArr);
    }

    /* renamed from: b */
    public static int m13942b(String str) {
        int m13965a = m13965a((CharSequence) str);
        return m13965a + m13915h(m13965a);
    }

    /* renamed from: b */
    public static int m13941b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    private static void m13943b(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                byteBuffer.put((byte) charAt);
            } else if (charAt < 2048) {
                byteBuffer.put((byte) ((charAt >>> 6) | 960));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            } else if (charAt >= 55296 && 57343 >= charAt) {
                if (i + 1 != charSequence.length()) {
                    i++;
                    char charAt2 = charSequence.charAt(i);
                    if (Character.isSurrogatePair(charAt, charAt2)) {
                        int codePoint = Character.toCodePoint(charAt, charAt2);
                        byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                        byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                        byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((codePoint & 63) | 128));
                    }
                }
                throw new IllegalArgumentException(new StringBuilder(39).append("Unpaired surrogate at index ").append(i - 1).toString());
            } else {
                byteBuffer.put((byte) ((charAt >>> '\f') | 480));
                byteBuffer.put((byte) (((charAt >>> 6) & 63) | 128));
                byteBuffer.put((byte) ((charAt & '?') | 128));
            }
            i++;
        }
    }

    /* renamed from: c */
    public static int m13938c(int i) {
        if (i >= 0) {
            return m13915h(i);
        }
        return 10;
    }

    /* renamed from: c */
    public static int m13937c(int i, int i2) {
        return m13921f(i) + m13938c(i2);
    }

    /* renamed from: c */
    public static int m13935c(int i, AbstractC7649rd abstractC7649rd) {
        return m13921f(i) + m13927d(abstractC7649rd);
    }

    /* renamed from: c */
    public static int m13933c(AbstractC7649rd abstractC7649rd) {
        return abstractC7649rd.m13852g();
    }

    /* renamed from: c */
    public static int m13932c(byte[] bArr) {
        return m13915h(bArr.length) + bArr.length;
    }

    /* renamed from: d */
    public static int m13931d(int i) {
        return m13915h(m13910j(i));
    }

    /* renamed from: d */
    public static int m13930d(int i, int i2) {
        return m13921f(i) + m13931d(i2);
    }

    /* renamed from: d */
    public static int m13927d(AbstractC7649rd abstractC7649rd) {
        int m13852g = abstractC7649rd.m13852g();
        return m13852g + m13915h(m13852g);
    }

    /* renamed from: e */
    public static int m13923e(int i, long j) {
        return m13921f(i) + m13922e(j);
    }

    /* renamed from: e */
    public static int m13922e(long j) {
        return m13909j(j);
    }

    /* renamed from: f */
    public static int m13921f(int i) {
        return m13915h(C7652rg.m13842a(i, 0));
    }

    /* renamed from: f */
    public static int m13920f(int i, long j) {
        return m13921f(i) + m13919f(j);
    }

    /* renamed from: f */
    public static int m13919f(long j) {
        return m13909j(j);
    }

    /* renamed from: g */
    public static int m13917g(int i, long j) {
        return m13921f(i) + m13916g(j);
    }

    /* renamed from: g */
    public static int m13916g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m13915h(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return ((-268435456) & i) == 0 ? 4 : 5;
    }

    /* renamed from: h */
    public static int m13914h(int i, long j) {
        return m13921f(i) + m13913h(j);
    }

    /* renamed from: h */
    public static int m13913h(long j) {
        return m13909j(m13907l(j));
    }

    /* renamed from: j */
    public static int m13910j(int i) {
        return (i << 1) ^ (i >> 31);
    }

    /* renamed from: j */
    public static int m13909j(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (Long.MIN_VALUE & j) == 0 ? 9 : 10;
    }

    /* renamed from: l */
    public static long m13907l(long j) {
        return (j << 1) ^ (j >> 63);
    }

    /* renamed from: a */
    public int m13980a() {
        return this.f25373a.remaining();
    }

    /* renamed from: a */
    public void m13979a(byte b) {
        if (!this.f25373a.hasRemaining()) {
            throw new C7641a(this.f25373a.position(), this.f25373a.limit());
        }
        this.f25373a.put(b);
    }

    /* renamed from: a */
    public void m13978a(double d) {
        m13908k(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public void m13977a(float f) {
        m13912i(Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public void m13976a(int i) {
        if (i >= 0) {
            m13918g(i);
        } else {
            m13911i(i);
        }
    }

    /* renamed from: a */
    public void m13975a(int i, double d) {
        m13924e(i, 1);
        m13978a(d);
    }

    /* renamed from: a */
    public void m13974a(int i, float f) {
        m13924e(i, 5);
        m13977a(f);
    }

    /* renamed from: a */
    public void m13973a(int i, int i2) {
        m13924e(i, 0);
        m13976a(i2);
    }

    /* renamed from: a */
    public void m13972a(int i, long j) {
        m13924e(i, 0);
        m13967a(j);
    }

    /* renamed from: a */
    public void m13971a(int i, AbstractC7649rd abstractC7649rd) {
        m13924e(i, 2);
        m13944b(abstractC7649rd);
    }

    /* renamed from: a */
    public void m13970a(int i, String str) {
        m13924e(i, 2);
        m13961a(str);
    }

    /* renamed from: a */
    public void m13969a(int i, boolean z) {
        m13924e(i, 0);
        m13960a(z);
    }

    /* renamed from: a */
    public void m13968a(int i, byte[] bArr) {
        m13924e(i, 2);
        m13940b(bArr);
    }

    /* renamed from: a */
    public void m13967a(long j) {
        m13911i(j);
    }

    /* renamed from: a */
    public void m13966a(AbstractC7649rd abstractC7649rd) {
        abstractC7649rd.mo13818a(this);
    }

    /* renamed from: a */
    public void m13961a(String str) {
        try {
            int m13915h = m13915h(str.length());
            if (m13915h != m13915h(str.length() * 3)) {
                m13918g(m13965a((CharSequence) str));
                m13963a(str, this.f25373a);
                return;
            }
            int position = this.f25373a.position();
            if (this.f25373a.remaining() < m13915h) {
                throw new C7641a(m13915h + position, this.f25373a.limit());
            }
            this.f25373a.position(position + m13915h);
            m13963a(str, this.f25373a);
            int position2 = this.f25373a.position();
            this.f25373a.position(position);
            m13918g((position2 - position) - m13915h);
            this.f25373a.position(position2);
        } catch (BufferOverflowException e) {
            C7641a c7641a = new C7641a(this.f25373a.position(), this.f25373a.limit());
            c7641a.initCause(e);
            throw c7641a;
        }
    }

    /* renamed from: a */
    public void m13960a(boolean z) {
        m13925e(z ? 1 : 0);
    }

    /* renamed from: b */
    public void m13957b() {
        if (m13980a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public void m13954b(int i) {
        m13918g(m13910j(i));
    }

    /* renamed from: b */
    public void m13951b(int i, int i2) {
        m13924e(i, 0);
        m13954b(i2);
    }

    /* renamed from: b */
    public void m13950b(int i, long j) {
        m13924e(i, 0);
        m13945b(j);
    }

    /* renamed from: b */
    public void m13945b(long j) {
        m13911i(j);
    }

    /* renamed from: b */
    public void m13944b(AbstractC7649rd abstractC7649rd) {
        m13918g(abstractC7649rd.m13853f());
        abstractC7649rd.mo13818a(this);
    }

    /* renamed from: b */
    public void m13940b(byte[] bArr) {
        m13918g(bArr.length);
        m13926d(bArr);
    }

    /* renamed from: b */
    public void m13939b(byte[] bArr, int i, int i2) {
        if (this.f25373a.remaining() >= i2) {
            this.f25373a.put(bArr, i, i2);
            return;
        }
        throw new C7641a(this.f25373a.position(), this.f25373a.limit());
    }

    /* renamed from: c */
    public void m13936c(int i, long j) {
        m13924e(i, 1);
        m13934c(j);
    }

    /* renamed from: c */
    public void m13934c(long j) {
        m13908k(j);
    }

    /* renamed from: d */
    public void m13929d(int i, long j) {
        m13924e(i, 0);
        m13928d(j);
    }

    /* renamed from: d */
    public void m13928d(long j) {
        m13911i(m13907l(j));
    }

    /* renamed from: d */
    public void m13926d(byte[] bArr) {
        m13939b(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public void m13925e(int i) {
        m13979a((byte) i);
    }

    /* renamed from: e */
    public void m13924e(int i, int i2) {
        m13918g(C7652rg.m13842a(i, i2));
    }

    /* renamed from: g */
    public void m13918g(int i) {
        while ((i & (-128)) != 0) {
            m13925e((i & 127) | 128);
            i >>>= 7;
        }
        m13925e(i);
    }

    /* renamed from: i */
    public void m13912i(int i) {
        if (this.f25373a.remaining() < 4) {
            throw new C7641a(this.f25373a.position(), this.f25373a.limit());
        }
        this.f25373a.putInt(i);
    }

    /* renamed from: i */
    public void m13911i(long j) {
        while (((-128) & j) != 0) {
            m13925e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m13925e((int) j);
    }

    /* renamed from: k */
    public void m13908k(long j) {
        if (this.f25373a.remaining() < 8) {
            throw new C7641a(this.f25373a.position(), this.f25373a.limit());
        }
        this.f25373a.putLong(j);
    }
}
