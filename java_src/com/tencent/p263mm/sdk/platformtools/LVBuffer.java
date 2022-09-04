package com.tencent.p263mm.sdk.platformtools;

import java.nio.ByteBuffer;
/* renamed from: com.tencent.mm.sdk.platformtools.LVBuffer */
/* loaded from: classes2.dex */
public class LVBuffer {
    public static final int LENGTH_ALLOC_PER_NEW = 4096;
    public static final int MAX_STRING_LENGTH = 2048;

    /* renamed from: ap */
    private ByteBuffer f31615ap;

    /* renamed from: aq */
    private boolean f31616aq;

    /* renamed from: a */
    private int m5879a(int i) {
        if (this.f31615ap.limit() - this.f31615ap.position() <= i) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f31615ap.limit() + 4096);
            allocate.put(this.f31615ap.array(), 0, this.f31615ap.position());
            this.f31615ap = allocate;
        }
        return 0;
    }

    public byte[] buildFinish() {
        if (!this.f31616aq) {
            throw new Exception("Buffer For Parse");
        }
        m5879a(1);
        this.f31615ap.put((byte) 125);
        byte[] bArr = new byte[this.f31615ap.position()];
        System.arraycopy(this.f31615ap.array(), 0, bArr, 0, bArr.length);
        return bArr;
    }

    public boolean checkGetFinish() {
        return this.f31615ap.limit() - this.f31615ap.position() <= 1;
    }

    public int getInt() {
        if (this.f31616aq) {
            throw new Exception("Buffer For Build");
        }
        return this.f31615ap.getInt();
    }

    public long getLong() {
        if (this.f31616aq) {
            throw new Exception("Buffer For Build");
        }
        return this.f31615ap.getLong();
    }

    public String getString() {
        if (this.f31616aq) {
            throw new Exception("Buffer For Build");
        }
        int i = this.f31615ap.getShort();
        if (i > 2048) {
            this.f31615ap = null;
            throw new Exception("Buffer String Length Error");
        } else if (i == 0) {
            return "";
        } else {
            byte[] bArr = new byte[i];
            this.f31615ap.get(bArr, 0, i);
            return new String(bArr);
        }
    }

    public int initBuild() {
        this.f31615ap = ByteBuffer.allocate(4096);
        this.f31615ap.put((byte) 123);
        this.f31616aq = true;
        return 0;
    }

    public int initParse(byte[] bArr) {
        int i = (bArr == null || bArr.length == 0) ? -1 : bArr[0] != 123 ? -2 : bArr[bArr.length + (-1)] != 125 ? -3 : 0;
        if (i != 0) {
            this.f31615ap = null;
            throw new Exception("Parse Buffer Check Failed :" + i);
        }
        this.f31615ap = ByteBuffer.wrap(bArr);
        this.f31615ap.position(1);
        this.f31616aq = false;
        return 0;
    }

    public int putInt(int i) {
        if (!this.f31616aq) {
            throw new Exception("Buffer For Parse");
        }
        m5879a(4);
        this.f31615ap.putInt(i);
        return 0;
    }

    public int putLong(long j) {
        if (!this.f31616aq) {
            throw new Exception("Buffer For Parse");
        }
        m5879a(8);
        this.f31615ap.putLong(j);
        return 0;
    }

    public int putString(String str) {
        if (!this.f31616aq) {
            throw new Exception("Buffer For Parse");
        }
        byte[] bArr = null;
        if (str != null) {
            bArr = str.getBytes();
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length > 2048) {
            throw new Exception("Buffer String Length Error");
        }
        m5879a(bArr.length + 2);
        this.f31615ap.putShort((short) bArr.length);
        if (bArr.length > 0) {
            this.f31615ap.put(bArr);
        }
        return 0;
    }
}
