package com.p079a.p080a;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.codehaus.jackson.smile.SmileConstants;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.a.a.i */
/* loaded from: classes.dex */
public class C0873i implements AbstractC0887u {

    /* renamed from: a */
    private final char[] f1829a;

    /* renamed from: b */
    private final List<C0874a> f1830b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.a.a.i$a */
    /* loaded from: classes.dex */
    public static final class C0874a implements Comparable<C0874a> {

        /* renamed from: a */
        public final char f1831a;

        /* renamed from: b */
        public final byte f1832b;

        C0874a(byte b, char c) {
            this.f1832b = b;
            this.f1831a = c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C0874a c0874a) {
            return this.f1831a - c0874a.f1831a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0874a) {
                C0874a c0874a = (C0874a) obj;
                return this.f1831a == c0874a.f1831a && this.f1832b == c0874a.f1832b;
            }
            return false;
        }

        public int hashCode() {
            return this.f1831a;
        }

        public String toString() {
            return "0x" + Integer.toHexString(65535 & this.f1831a) + "->0x" + Integer.toHexString(this.f1832b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
        }
    }

    public C0873i(char[] cArr) {
        this.f1829a = (char[]) cArr.clone();
        ArrayList arrayList = new ArrayList(this.f1829a.length);
        byte b = Byte.MAX_VALUE;
        for (int i = 0; i < this.f1829a.length; i++) {
            b = (byte) (b + 1);
            arrayList.add(new C0874a(b, this.f1829a[i]));
        }
        Collections.sort(arrayList);
        this.f1830b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    private C0874a m37549b(char c) {
        int i = 0;
        int size = this.f1830b.size();
        while (size > i) {
            int i2 = i + ((size - i) / 2);
            C0874a c0874a = this.f1830b.get(i2);
            if (c0874a.f1831a == c) {
                return c0874a;
            }
            if (c0874a.f1831a < c) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
        if (i >= this.f1830b.size()) {
            return null;
        }
        C0874a c0874a2 = this.f1830b.get(i);
        if (c0874a2.f1831a == c) {
            return c0874a2;
        }
        return null;
    }

    /* renamed from: a */
    public char m37552a(byte b) {
        return b >= 0 ? (char) b : this.f1829a[b + 128];
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public String mo37520a(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = m37552a(bArr[i]);
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public boolean m37551a(char c) {
        return (c >= 0 && c < 128) || m37549b(c) != null;
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: a */
    public boolean mo37521a(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!m37551a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m37550a(ByteBuffer byteBuffer, char c) {
        if (c >= 0 && c < 128) {
            byteBuffer.put((byte) c);
            return true;
        }
        C0874a m37549b = m37549b(c);
        if (m37549b == null) {
            return false;
        }
        byteBuffer.put(m37549b.f1832b);
        return true;
    }

    @Override // com.p079a.p080a.AbstractC0887u
    /* renamed from: b */
    public ByteBuffer mo37519b(String str) {
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + 6 + ((str.length() + 1) / 2));
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (allocate.remaining() < 6) {
                allocate = AbstractC0888v.m37516a(allocate, allocate.position() + 6);
            }
            if (!m37550a(allocate, charAt)) {
                AbstractC0888v.m37517a(allocate, charAt);
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }
}
