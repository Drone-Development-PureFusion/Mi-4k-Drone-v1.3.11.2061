package com.fimi.soul.module.droneTrack;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.soul.module.droneTrack.g */
/* loaded from: classes.dex */
public class C2687g {

    /* renamed from: c */
    public static final int f9151c = 256;

    /* renamed from: a */
    public ByteBuffer f9152a;

    /* renamed from: b */
    public int f9153b;

    /* renamed from: d */
    StringBuilder f9154d = new StringBuilder();

    public C2687g() {
    }

    public C2687g(char[] cArr) {
        try {
            this.f9152a = ByteBuffer.allocate(256);
            if (cArr == null) {
                return;
            }
            for (int i = 0; i < cArr.length - 1; i += 2) {
                this.f9152a.put((byte) Integer.parseInt(cArr[i] + "" + cArr[i + 1], 16));
            }
            this.f9153b = 0;
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public byte m30629a() {
        byte b = (byte) (0 | (this.f9152a.get(this.f9153b + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f9153b++;
        return b;
    }

    /* renamed from: a */
    public boolean m30628a(String str) {
        return Pattern.compile("[0-9a-zA-Z]*").matcher(str).matches();
    }

    /* renamed from: a */
    public boolean m30627a(char[] cArr) {
        try {
            this.f9152a = ByteBuffer.allocate(256);
            if (cArr == null) {
                return false;
            }
            for (int i = 0; i < cArr.length - 1; i += 2) {
                this.f9154d.append(cArr[i]).append("").append(cArr[i + 1]);
                this.f9152a.put((byte) Integer.parseInt(this.f9154d.toString(), 16));
                this.f9154d.delete(0, this.f9154d.length());
            }
            this.f9153b = 0;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: b */
    public short m30626b() {
        short s = (short) (((short) (0 | ((this.f9152a.get(this.f9153b + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8))) | (this.f9152a.get(this.f9153b + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
        this.f9153b += 2;
        return s;
    }

    /* renamed from: c */
    public int m30625c() {
        int i = 0 | ((this.f9152a.get(this.f9153b + 3) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((this.f9152a.get(this.f9153b + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((this.f9152a.get(this.f9153b + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f9152a.get(this.f9153b + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        this.f9153b += 4;
        return i;
    }

    /* renamed from: d */
    public long m30624d() {
        long j = 0 | ((this.f9152a.get(this.f9153b + 7) & 255) << 56) | ((this.f9152a.get(this.f9153b + 6) & 255) << 48) | ((this.f9152a.get(this.f9153b + 5) & 255) << 40) | ((this.f9152a.get(this.f9153b + 4) & 255) << 32) | ((this.f9152a.get(this.f9153b + 3) & 255) << 24) | ((this.f9152a.get(this.f9153b + 2) & 255) << 16) | ((this.f9152a.get(this.f9153b + 1) & 255) << 8) | (this.f9152a.get(this.f9153b + 0) & 255);
        this.f9153b += 8;
        return j;
    }

    /* renamed from: e */
    public long m30623e() {
        long j = 0 | ((this.f9152a.get(this.f9153b + 0) & 255) << 56) | ((this.f9152a.get(this.f9153b + 1) & 255) << 48) | ((this.f9152a.get(this.f9153b + 2) & 255) << 40) | ((this.f9152a.get(this.f9153b + 3) & 255) << 32) | ((this.f9152a.get(this.f9153b + 4) & 255) << 24) | ((this.f9152a.get(this.f9153b + 5) & 255) << 16) | ((this.f9152a.get(this.f9153b + 6) & 255) << 8) | (this.f9152a.get(this.f9153b + 7) & 255);
        this.f9153b += 8;
        return j;
    }

    /* renamed from: f */
    public float m30622f() {
        return Float.intBitsToFloat(m30625c());
    }

    /* renamed from: g */
    public float m30621g() {
        BigInteger bigInteger = new BigInteger(1, new byte[]{(byte) ((this.f9152a.get(this.f9153b + 2) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f9152a.get(this.f9153b + 1) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0), (byte) ((this.f9152a.get(this.f9153b + 0) & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | 0)});
        this.f9153b += 3;
        return Float.parseFloat(bigInteger.toString());
    }

    /* renamed from: h */
    public void m30620h() {
        if (this.f9152a != null) {
            this.f9152a = null;
        }
    }

    /* renamed from: i */
    public Double m30619i() {
        return Double.valueOf(Double.longBitsToDouble(m30624d()));
    }
}
