package org.codehaus.jackson.org.objectweb.asm;

import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes3.dex */
public class Label {

    /* renamed from: a */
    int f36938a;

    /* renamed from: b */
    int f36939b;

    /* renamed from: c */
    int f36940c;

    /* renamed from: d */
    private int f36941d;

    /* renamed from: e */
    private int[] f36942e;

    /* renamed from: f */
    int f36943f;

    /* renamed from: g */
    int f36944g;

    /* renamed from: h */
    Frame f36945h;

    /* renamed from: i */
    Label f36946i;
    public Object info;

    /* renamed from: j */
    Edge f36947j;

    /* renamed from: k */
    Label f36948k;

    /* renamed from: a */
    private void m218a(int i, int i2) {
        if (this.f36942e == null) {
            this.f36942e = new int[6];
        }
        if (this.f36941d >= this.f36942e.length) {
            int[] iArr = new int[this.f36942e.length + 6];
            System.arraycopy(this.f36942e, 0, iArr, 0, this.f36942e.length);
            this.f36942e = iArr;
        }
        int[] iArr2 = this.f36942e;
        int i3 = this.f36941d;
        this.f36941d = i3 + 1;
        iArr2[i3] = i;
        int[] iArr3 = this.f36942e;
        int i4 = this.f36941d;
        this.f36941d = i4 + 1;
        iArr3[i4] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Label m219a() {
        return this.f36945h == null ? this : this.f36945h.f36915b;
    }

    /* renamed from: a */
    void m216a(long j, int i) {
        if ((this.f36938a & 1024) == 0) {
            this.f36938a |= 1024;
            this.f36942e = new int[((i - 1) / 32) + 1];
        }
        int[] iArr = this.f36942e;
        int i2 = (int) (j >>> 32);
        iArr[i2] = iArr[i2] | ((int) j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m213a(MethodWriter methodWriter, ByteVector byteVector, int i, boolean z) {
        if ((this.f36938a & 2) != 0) {
            if (z) {
                byteVector.putInt(this.f36940c - i);
            } else {
                byteVector.putShort(this.f36940c - i);
            }
        } else if (z) {
            m218a((-1) - i, byteVector.f36860b);
            byteVector.putInt(-1);
        } else {
            m218a(i, byteVector.f36860b);
            byteVector.putShort(-1);
        }
    }

    /* renamed from: a */
    boolean m217a(long j) {
        return ((this.f36938a & 1024) == 0 || (this.f36942e[(int) (j >>> 32)] & ((int) j)) == 0) ? false : true;
    }

    /* renamed from: a */
    boolean m215a(Label label) {
        if ((this.f36938a & 1024) == 0 || (label.f36938a & 1024) == 0) {
            return false;
        }
        for (int i = 0; i < this.f36942e.length; i++) {
            if ((this.f36942e[i] & label.f36942e[i]) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m214a(MethodWriter methodWriter, int i, byte[] bArr) {
        int i2 = 0;
        this.f36938a |= 2;
        this.f36940c = i;
        boolean z = false;
        while (i2 < this.f36941d) {
            int i3 = i2 + 1;
            int i4 = this.f36942e[i2];
            i2 = i3 + 1;
            int i5 = this.f36942e[i3];
            if (i4 >= 0) {
                int i6 = i - i4;
                if (i6 < -32768 || i6 > 32767) {
                    int i7 = bArr[i5 - 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                    if (i7 <= 168) {
                        bArr[i5 - 1] = (byte) (i7 + 49);
                    } else {
                        bArr[i5 - 1] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i5] = (byte) (i6 >>> 8);
                bArr[i5 + 1] = (byte) i6;
            } else {
                int i8 = i4 + i + 1;
                int i9 = i5 + 1;
                bArr[i5] = (byte) (i8 >>> 24);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (i8 >>> 16);
                bArr[i10] = (byte) (i8 >>> 8);
                bArr[i10 + 1] = (byte) i8;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m212b(Label label, long j, int i) {
        Edge edge;
        while (this != null) {
            Label label2 = this.f36948k;
            this.f36948k = null;
            if (label != null) {
                if ((this.f36938a & 2048) != 0) {
                    this = label2;
                } else {
                    this.f36938a |= 2048;
                    if ((this.f36938a & 256) != 0 && !this.m215a(label)) {
                        Edge edge2 = new Edge();
                        edge2.f36901a = this.f36943f;
                        edge2.f36902b = label.f36947j.f36902b;
                        edge2.f36903c = this.f36947j;
                        this.f36947j = edge2;
                    }
                    Label label3 = label2;
                    for (edge = this.f36947j; edge != null; edge = edge.f36903c) {
                        if (((this.f36938a & 128) == 0 || edge != this.f36947j.f36903c) && edge.f36902b.f36948k == null) {
                            edge.f36902b.f36948k = label3;
                            label3 = edge.f36902b;
                        }
                    }
                    this = label3;
                }
            } else if (this.m217a(j)) {
                this = label2;
            } else {
                this.m216a(j, i);
                Label label32 = label2;
                while (edge != null) {
                }
                this = label32;
            }
        }
    }

    public int getOffset() {
        if ((this.f36938a & 2) == 0) {
            throw new IllegalStateException("Label offset position has not been resolved yet");
        }
        return this.f36940c;
    }

    public String toString() {
        return new StringBuffer().append("L").append(System.identityHashCode(this)).toString();
    }
}
