package org.codehaus.jackson.org.objectweb.asm;

import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes3.dex */
class MethodWriter implements MethodVisitor {

    /* renamed from: A */
    private int f36950A;

    /* renamed from: B */
    private Handler f36951B;

    /* renamed from: C */
    private Handler f36952C;

    /* renamed from: D */
    private int f36953D;

    /* renamed from: E */
    private ByteVector f36954E;

    /* renamed from: F */
    private int f36955F;

    /* renamed from: G */
    private ByteVector f36956G;

    /* renamed from: H */
    private int f36957H;

    /* renamed from: I */
    private ByteVector f36958I;

    /* renamed from: J */
    private Attribute f36959J;

    /* renamed from: K */
    private boolean f36960K;

    /* renamed from: L */
    private int f36961L;

    /* renamed from: M */
    private final int f36962M;

    /* renamed from: N */
    private Label f36963N;

    /* renamed from: O */
    private Label f36964O;

    /* renamed from: P */
    private Label f36965P;

    /* renamed from: Q */
    private int f36966Q;

    /* renamed from: R */
    private int f36967R;

    /* renamed from: S */
    private int f36968S;

    /* renamed from: a */
    MethodWriter f36969a;

    /* renamed from: b */
    final ClassWriter f36970b;

    /* renamed from: c */
    private int f36971c;

    /* renamed from: d */
    private final int f36972d;

    /* renamed from: e */
    private final int f36973e;

    /* renamed from: f */
    private final String f36974f;

    /* renamed from: g */
    String f36975g;

    /* renamed from: h */
    int f36976h;

    /* renamed from: i */
    int f36977i;

    /* renamed from: j */
    int f36978j;

    /* renamed from: k */
    int[] f36979k;

    /* renamed from: l */
    private ByteVector f36980l;

    /* renamed from: m */
    private AnnotationWriter f36981m;

    /* renamed from: n */
    private AnnotationWriter f36982n;

    /* renamed from: o */
    private AnnotationWriter[] f36983o;

    /* renamed from: p */
    private AnnotationWriter[] f36984p;

    /* renamed from: q */
    private Attribute f36985q;

    /* renamed from: r */
    private ByteVector f36986r = new ByteVector();

    /* renamed from: s */
    private int f36987s;

    /* renamed from: t */
    private int f36988t;

    /* renamed from: u */
    private int f36989u;

    /* renamed from: v */
    private ByteVector f36990v;

    /* renamed from: w */
    private int f36991w;

    /* renamed from: x */
    private int[] f36992x;

    /* renamed from: y */
    private int f36993y;

    /* renamed from: z */
    private int[] f36994z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodWriter(ClassWriter classWriter, int i, String str, String str2, String str3, String[] strArr, boolean z, boolean z2) {
        int i2 = 0;
        if (classWriter.f36867A == null) {
            classWriter.f36867A = this;
        } else {
            classWriter.f36868B.f36969a = this;
        }
        classWriter.f36868B = this;
        this.f36970b = classWriter;
        this.f36971c = i;
        this.f36972d = classWriter.newUTF8(str);
        this.f36973e = classWriter.newUTF8(str2);
        this.f36974f = str2;
        this.f36975g = str3;
        if (strArr != null && strArr.length > 0) {
            this.f36978j = strArr.length;
            this.f36979k = new int[this.f36978j];
            for (int i3 = 0; i3 < this.f36978j; i3++) {
                this.f36979k[i3] = classWriter.newClass(strArr[i3]);
            }
        }
        this.f36962M = !z2 ? z ? 1 : 2 : i2;
        if (z || z2) {
            if (z2 && "<init>".equals(str)) {
                this.f36971c |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
            }
            int argumentsAndReturnSizes = Type.getArgumentsAndReturnSizes(this.f36974f) >> 2;
            this.f36988t = (i & 8) != 0 ? argumentsAndReturnSizes - 1 : argumentsAndReturnSizes;
            this.f36963N = new Label();
            this.f36963N.f36938a |= 8;
            visitLabel(this.f36963N);
        }
    }

    /* renamed from: a */
    static int m204a(byte[] bArr, int i) {
        return ((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[i + 2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (bArr[i + 3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: a */
    static int m202a(int[] iArr, int[] iArr2, int i, int i2) {
        int i3 = i2 - i;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i < iArr[i4] && iArr[i4] <= i2) {
                i3 += iArr2[i4];
            } else if (i2 < iArr[i4] && iArr[i4] <= i) {
                i3 -= iArr2[i4];
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m210a(int i, int i2) {
        while (i < i2) {
            int i3 = this.f36994z[i];
            int i4 = (-268435456) & i3;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                switch (i3 & 267386880) {
                    case 24117248:
                        this.f36990v.putByte(7).putShort(this.f36970b.newClass(this.f36970b.f36870E[i5].f36933g));
                        continue;
                    case 25165824:
                        this.f36990v.putByte(8).putShort(this.f36970b.f36870E[i5].f36931c);
                        continue;
                    default:
                        this.f36990v.putByte(i5);
                        continue;
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                int i6 = i4 >> 28;
                while (true) {
                    int i7 = i6 - 1;
                    if (i6 > 0) {
                        stringBuffer.append('[');
                        i6 = i7;
                    } else {
                        if ((i3 & 267386880) != 24117248) {
                            switch (i3 & 15) {
                                case 1:
                                    stringBuffer.append('I');
                                    break;
                                case 2:
                                    stringBuffer.append('F');
                                    break;
                                case 3:
                                    stringBuffer.append('D');
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                default:
                                    stringBuffer.append('J');
                                    break;
                                case 9:
                                    stringBuffer.append('Z');
                                    break;
                                case 10:
                                    stringBuffer.append('B');
                                    break;
                                case 11:
                                    stringBuffer.append('C');
                                    break;
                                case 12:
                                    stringBuffer.append('S');
                                    break;
                            }
                        } else {
                            stringBuffer.append('L');
                            stringBuffer.append(this.f36970b.f36870E[i3 & 1048575].f36933g);
                            stringBuffer.append(';');
                        }
                        this.f36990v.putByte(7).putShort(this.f36970b.newClass(stringBuffer.toString()));
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m209a(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        if (this.f36994z == null || this.f36994z.length < i4) {
            this.f36994z = new int[i4];
        }
        this.f36994z[0] = i;
        this.f36994z[1] = i2;
        this.f36994z[2] = i3;
        this.f36993y = 3;
    }

    /* renamed from: a */
    private void m208a(int i, Label label) {
        Edge edge = new Edge();
        edge.f36901a = i;
        edge.f36902b = label;
        edge.f36903c = this.f36965P.f36947j;
        this.f36965P.f36947j = edge;
    }

    /* renamed from: a */
    private void m207a(Object obj) {
        if (obj instanceof String) {
            this.f36990v.putByte(7).putShort(this.f36970b.newClass((String) obj));
        } else if (obj instanceof Integer) {
            this.f36990v.putByte(((Integer) obj).intValue());
        } else {
            this.f36990v.putByte(8).putShort(((Label) obj).f36940c);
        }
    }

    /* renamed from: a */
    private void m205a(Label label, Label[] labelArr) {
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(Opcodes.LOOKUPSWITCH, 0, (ClassWriter) null, (Item) null);
                m208a(0, label);
                label.m219a().f36938a |= 16;
                for (int i = 0; i < labelArr.length; i++) {
                    m208a(0, labelArr[i]);
                    labelArr[i].m219a().f36938a |= 16;
                }
            } else {
                this.f36966Q--;
                m208a(this.f36966Q, label);
                for (Label label2 : labelArr) {
                    m208a(this.f36966Q, label2);
                }
            }
            m194e();
        }
    }

    /* renamed from: a */
    static void m203a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    /* renamed from: a */
    static void m201a(int[] iArr, int[] iArr2, Label label) {
        if ((label.f36938a & 4) == 0) {
            label.f36940c = m202a(iArr, iArr2, 0, label.f36940c);
            label.f36938a |= 4;
        }
    }

    /* renamed from: b */
    static short m198b(byte[] bArr, int i) {
        return (short) (((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
    }

    /* renamed from: b */
    private void m200b() {
        if (this.f36992x != null) {
            if (this.f36990v == null) {
                this.f36990v = new ByteVector();
            }
            m197c();
            this.f36989u++;
        }
        this.f36992x = this.f36994z;
        this.f36994z = null;
    }

    /* renamed from: b */
    private void m199b(Frame frame) {
        int i = 0;
        int[] iArr = frame.f36916c;
        int[] iArr2 = frame.f36917d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iArr.length) {
            int i5 = iArr[i2];
            if (i5 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
            if (i5 == 16777220 || i5 == 16777219) {
                i2++;
            }
            i2++;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr2.length) {
            int i8 = iArr2[i6];
            i7++;
            if (i8 == 16777220 || i8 == 16777219) {
                i6++;
            }
            i6++;
        }
        m209a(frame.f36915b.f36940c, i3, i7);
        int i9 = 0;
        while (i3 > 0) {
            int i10 = iArr[i9];
            int[] iArr3 = this.f36994z;
            int i11 = this.f36993y;
            this.f36993y = i11 + 1;
            iArr3[i11] = i10;
            if (i10 == 16777220 || i10 == 16777219) {
                i9++;
            }
            i9++;
            i3--;
        }
        while (i < iArr2.length) {
            int i12 = iArr2[i];
            int[] iArr4 = this.f36994z;
            int i13 = this.f36993y;
            this.f36993y = i13 + 1;
            iArr4[i13] = i12;
            if (i12 == 16777220 || i12 == 16777219) {
                i++;
            }
            i++;
        }
        m200b();
    }

    /* renamed from: c */
    static int m196c(byte[] bArr, int i) {
        return ((bArr[i] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (bArr[i + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    /* renamed from: c */
    private void m197c() {
        int i;
        int i2;
        char c = '@';
        int i3 = 0;
        int i4 = this.f36994z[1];
        int i5 = this.f36994z[2];
        if ((this.f36970b.f36876b & 65535) < 50) {
            this.f36990v.putShort(this.f36994z[0]).putShort(i4);
            m210a(3, i4 + 3);
            this.f36990v.putShort(i5);
            m210a(i4 + 3, i4 + 3 + i5);
            return;
        }
        int i6 = this.f36992x[1];
        int i7 = this.f36989u == 0 ? this.f36994z[0] : (this.f36994z[0] - this.f36992x[0]) - 1;
        if (i5 == 0) {
            i = i4 - i6;
            switch (i) {
                case -3:
                case -2:
                case -1:
                    c = 248;
                    i6 = i4;
                    break;
                case 0:
                    if (i7 >= 64) {
                        c = 251;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c = 252;
                    break;
                default:
                    c = 255;
                    break;
            }
            i2 = i6;
        } else if (i4 == i6 && i5 == 1) {
            if (i7 >= 63) {
                c = 247;
            }
            i = 0;
            i2 = i6;
        } else {
            i = 0;
            c = 255;
            i2 = i6;
        }
        if (c != 255) {
            int i8 = 3;
            while (true) {
                if (i3 < i2) {
                    if (this.f36994z[i8] != this.f36992x[i8]) {
                        c = 255;
                    } else {
                        i8++;
                        i3++;
                    }
                }
            }
        }
        switch (c) {
            case 0:
                this.f36990v.putByte(i7);
                return;
            case '@':
                this.f36990v.putByte(i7 + 64);
                m210a(i4 + 3, i4 + 4);
                return;
            case 247:
                this.f36990v.putByte(247).putShort(i7);
                m210a(i4 + 3, i4 + 4);
                return;
            case 248:
                this.f36990v.putByte(i + 251).putShort(i7);
                return;
            case 251:
                this.f36990v.putByte(251).putShort(i7);
                return;
            case SmileConstants.INT_MARKER_END_OF_STRING /* 252 */:
                this.f36990v.putByte(i + 251).putShort(i7);
                m210a(i2 + 3, i4 + 3);
                return;
            default:
                this.f36990v.putByte(255).putShort(i7).putShort(i4);
                m210a(3, i4 + 3);
                this.f36990v.putShort(i5);
                m210a(i4 + 3, i4 + 3 + i5);
                return;
        }
    }

    /* renamed from: d */
    private void m195d() {
        int i;
        int m198b;
        int i2;
        int m198b2;
        int i3;
        byte[] bArr = this.f36986r.f36859a;
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        boolean[] zArr = new boolean[this.f36986r.f36860b];
        int i4 = 3;
        while (true) {
            if (i4 == 3) {
                i4 = 2;
            }
            int i5 = i4;
            short s = 0;
            while (s < bArr.length) {
                int i6 = bArr[s] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                int i7 = 0;
                switch (ClassWriter.f36866a[i6]) {
                    case 0:
                    case 4:
                        s++;
                        break;
                    case 1:
                    case 3:
                    case 10:
                        s += 2;
                        break;
                    case 2:
                    case 5:
                    case 6:
                    case 11:
                    case 12:
                        s += 3;
                        break;
                    case 7:
                        s += 5;
                        break;
                    case 8:
                        if (i6 > 201) {
                            i6 = i6 < 218 ? i6 - 49 : i6 - 20;
                            m198b2 = m196c(bArr, s + 1) + s;
                        } else {
                            m198b2 = m198b(bArr, s + 1) + s;
                        }
                        int m202a = m202a(iArr, iArr2, s, m198b2);
                        if ((m202a < -32768 || m202a > 32767) && !zArr[s]) {
                            i3 = (i6 == 167 || i6 == 168) ? 2 : 5;
                            zArr[s] = true;
                        } else {
                            i3 = 0;
                        }
                        s += 3;
                        i7 = i3;
                        break;
                    case 9:
                        s += 5;
                        break;
                    case 13:
                        if (i5 == 1) {
                            i7 = -(m202a(iArr, iArr2, 0, s) & 3);
                        } else if (!zArr[s]) {
                            i7 = s & 3;
                            zArr[s] = true;
                        }
                        int i8 = (s + 4) - (s & 3);
                        s = i8 + (((m204a(bArr, i8 + 8) - m204a(bArr, i8 + 4)) + 1) * 4) + 12;
                        break;
                    case 14:
                        if (i5 == 1) {
                            i7 = -(m202a(iArr, iArr2, 0, s) & 3);
                        } else if (!zArr[s]) {
                            i7 = s & 3;
                            zArr[s] = true;
                        }
                        int i9 = (s + 4) - (s & 3);
                        s = i9 + (m204a(bArr, i9 + 4) * 8) + 8;
                        break;
                    case 15:
                    default:
                        s += 4;
                        break;
                    case 16:
                        if ((bArr[s + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) == 132) {
                            s += 6;
                            break;
                        } else {
                            s += 4;
                            break;
                        }
                }
                if (i7 != 0) {
                    int[] iArr3 = new int[iArr.length + 1];
                    int[] iArr4 = new int[iArr2.length + 1];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, 0, iArr2.length);
                    iArr3[iArr.length] = s;
                    iArr4[iArr2.length] = i7;
                    if (i7 > 0) {
                        i5 = 3;
                        iArr2 = iArr4;
                        iArr = iArr3;
                    } else {
                        iArr2 = iArr4;
                        iArr = iArr3;
                    }
                }
            }
            if (i5 < 3) {
                i5--;
            }
            if (i5 == 0) {
                ByteVector byteVector = new ByteVector(this.f36986r.f36860b);
                short s2 = 0;
                while (s2 < this.f36986r.f36860b) {
                    int i10 = bArr[s2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
                    switch (ClassWriter.f36866a[i10]) {
                        case 0:
                        case 4:
                            byteVector.putByte(i10);
                            s2++;
                            continue;
                        case 1:
                        case 3:
                        case 10:
                            byteVector.putByteArray(bArr, s2, 2);
                            s2 += 2;
                            continue;
                        case 2:
                        case 5:
                        case 6:
                        case 11:
                        case 12:
                            byteVector.putByteArray(bArr, s2, 3);
                            s2 += 3;
                            continue;
                        case 7:
                            byteVector.putByteArray(bArr, s2, 5);
                            s2 += 5;
                            continue;
                        case 8:
                            if (i10 > 201) {
                                i10 = i10 < 218 ? i10 - 49 : i10 - 20;
                                m198b = m196c(bArr, s2 + 1) + s2;
                            } else {
                                m198b = m198b(bArr, s2 + 1) + s2;
                            }
                            int m202a2 = m202a(iArr, iArr2, s2, m198b);
                            if (zArr[s2]) {
                                if (i10 == 167) {
                                    byteVector.putByte(200);
                                    i2 = m202a2;
                                } else if (i10 == 168) {
                                    byteVector.putByte(201);
                                    i2 = m202a2;
                                } else {
                                    byteVector.putByte(i10 <= 166 ? ((i10 + 1) ^ 1) - 1 : i10 ^ 1);
                                    byteVector.putShort(8);
                                    byteVector.putByte(200);
                                    i2 = m202a2 - 3;
                                }
                                byteVector.putInt(i2);
                            } else {
                                byteVector.putByte(i10);
                                byteVector.putShort(m202a2);
                            }
                            s2 += 3;
                            continue;
                        case 9:
                            int m202a3 = m202a(iArr, iArr2, s2, m204a(bArr, s2 + 1) + s2);
                            byteVector.putByte(i10);
                            byteVector.putInt(m202a3);
                            s2 += 5;
                            continue;
                        case 13:
                            int i11 = (s2 + 4) - (s2 & 3);
                            byteVector.putByte(170);
                            byteVector.putByteArray(null, 0, (4 - (byteVector.f36860b % 4)) % 4);
                            int i12 = i11 + 4;
                            byteVector.putInt(m202a(iArr, iArr2, s2, m204a(bArr, i11) + s2));
                            int m204a = m204a(bArr, i12);
                            int i13 = i12 + 4;
                            byteVector.putInt(m204a);
                            int m204a2 = (m204a(bArr, i13) - m204a) + 1;
                            int i14 = i13 + 4;
                            byteVector.putInt(m204a(bArr, i14 - 4));
                            i = i14;
                            int i15 = m204a2;
                            while (i15 > 0) {
                                byteVector.putInt(m202a(iArr, iArr2, s2, s2 + m204a(bArr, i)));
                                i15--;
                                i += 4;
                            }
                            break;
                        case 14:
                            int i16 = (s2 + 4) - (s2 & 3);
                            byteVector.putByte(Opcodes.LOOKUPSWITCH);
                            byteVector.putByteArray(null, 0, (4 - (byteVector.f36860b % 4)) % 4);
                            int i17 = i16 + 4;
                            byteVector.putInt(m202a(iArr, iArr2, s2, m204a(bArr, i16) + s2));
                            int m204a3 = m204a(bArr, i17);
                            byteVector.putInt(m204a3);
                            i = i17 + 4;
                            int i18 = m204a3;
                            while (i18 > 0) {
                                byteVector.putInt(m204a(bArr, i));
                                int i19 = i + 4;
                                byteVector.putInt(m202a(iArr, iArr2, s2, s2 + m204a(bArr, i19)));
                                i18--;
                                i = i19 + 4;
                            }
                            break;
                        case 15:
                        default:
                            byteVector.putByteArray(bArr, s2, 4);
                            s2 += 4;
                            continue;
                        case 16:
                            if ((bArr[s2 + 1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) == 132) {
                                byteVector.putByteArray(bArr, s2, 6);
                                s2 += 6;
                            } else {
                                byteVector.putByteArray(bArr, s2, 4);
                                s2 += 4;
                                continue;
                            }
                    }
                    s2 = i;
                }
                if (this.f36989u > 0) {
                    if (this.f36962M == 0) {
                        this.f36989u = 0;
                        this.f36990v = null;
                        this.f36992x = null;
                        this.f36994z = null;
                        Frame frame = new Frame();
                        frame.f36915b = this.f36963N;
                        frame.m232a(this.f36970b, this.f36971c, Type.getArgumentTypes(this.f36974f), this.f36988t);
                        m199b(frame);
                        for (Label label = this.f36963N; label != null; label = label.f36946i) {
                            int i20 = label.f36940c - 3;
                            if ((label.f36938a & 32) != 0 || (i20 >= 0 && zArr[i20])) {
                                m201a(iArr, iArr2, label);
                                m199b(label.f36945h);
                            }
                        }
                    } else {
                        this.f36970b.f36874I = true;
                    }
                }
                for (Handler handler = this.f36951B; handler != null; handler = handler.f36928f) {
                    m201a(iArr, iArr2, handler.f36923a);
                    m201a(iArr, iArr2, handler.f36924b);
                    m201a(iArr, iArr2, handler.f36925c);
                }
                int i21 = 0;
                while (true) {
                    int i22 = i21;
                    if (i22 >= 2) {
                        if (this.f36958I != null) {
                            byte[] bArr2 = this.f36958I.f36859a;
                            for (int i23 = 0; i23 < this.f36958I.f36860b; i23 += 4) {
                                m203a(bArr2, i23, m202a(iArr, iArr2, 0, m196c(bArr2, i23)));
                            }
                        }
                        for (Attribute attribute = this.f36959J; attribute != null; attribute = attribute.f36857a) {
                            Label[] labels = attribute.getLabels();
                            if (labels != null) {
                                for (int length = labels.length - 1; length >= 0; length--) {
                                    m201a(iArr, iArr2, labels[length]);
                                }
                            }
                        }
                        this.f36986r = byteVector;
                        return;
                    }
                    ByteVector byteVector2 = i22 == 0 ? this.f36954E : this.f36956G;
                    if (byteVector2 != null) {
                        byte[] bArr3 = byteVector2.f36859a;
                        for (int i24 = 0; i24 < byteVector2.f36860b; i24 += 10) {
                            int m196c = m196c(bArr3, i24);
                            int m202a4 = m202a(iArr, iArr2, 0, m196c);
                            m203a(bArr3, i24, m202a4);
                            m203a(bArr3, i24 + 2, m202a(iArr, iArr2, 0, m196c + m196c(bArr3, i24 + 2)) - m202a4);
                        }
                    }
                    i21 = i22 + 1;
                }
            } else {
                i4 = i5;
            }
        }
    }

    /* renamed from: e */
    private void m194e() {
        if (this.f36962M == 0) {
            Label label = new Label();
            label.f36945h = new Frame();
            label.f36945h.f36915b = label;
            label.m214a(this, this.f36986r.f36860b, this.f36986r.f36859a);
            this.f36964O.f36946i = label;
            this.f36964O = label;
        } else {
            this.f36965P.f36944g = this.f36967R;
        }
        this.f36965P = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m211a() {
        int i;
        if (this.f36976h != 0) {
            return this.f36977i + 6;
        }
        if (this.f36960K) {
            m195d();
        }
        int i2 = 8;
        if (this.f36986r.f36860b > 0) {
            this.f36970b.newUTF8("Code");
            int i3 = this.f36986r.f36860b + 18 + (this.f36950A * 8) + 8;
            if (this.f36954E != null) {
                this.f36970b.newUTF8("LocalVariableTable");
                i3 += this.f36954E.f36860b + 8;
            }
            if (this.f36956G != null) {
                this.f36970b.newUTF8("LocalVariableTypeTable");
                i3 += this.f36956G.f36860b + 8;
            }
            if (this.f36958I != null) {
                this.f36970b.newUTF8("LineNumberTable");
                i3 += this.f36958I.f36860b + 8;
            }
            if (this.f36990v != null) {
                this.f36970b.newUTF8((this.f36970b.f36876b & 65535) >= 50 ? "StackMapTable" : "StackMap");
                i2 = i3 + this.f36990v.f36860b + 8;
            } else {
                i2 = i3;
            }
            if (this.f36959J != null) {
                i2 += this.f36959J.m271a(this.f36970b, this.f36986r.f36859a, this.f36986r.f36860b, this.f36987s, this.f36988t);
            }
        }
        if (this.f36978j > 0) {
            this.f36970b.newUTF8("Exceptions");
            i2 += (this.f36978j * 2) + 8;
        }
        if ((this.f36971c & 4096) != 0 && ((this.f36970b.f36876b & 65535) < 49 || (this.f36971c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            this.f36970b.newUTF8("Synthetic");
            i2 += 6;
        }
        if ((this.f36971c & 131072) != 0) {
            this.f36970b.newUTF8("Deprecated");
            i2 += 6;
        }
        if (this.f36975g != null) {
            this.f36970b.newUTF8(Consts.SIGNATURE);
            this.f36970b.newUTF8(this.f36975g);
            i2 += 8;
        }
        if (this.f36980l != null) {
            this.f36970b.newUTF8("AnnotationDefault");
            i2 += this.f36980l.f36860b + 6;
        }
        if (this.f36981m != null) {
            this.f36970b.newUTF8("RuntimeVisibleAnnotations");
            i2 += this.f36981m.m275a() + 8;
        }
        if (this.f36982n != null) {
            this.f36970b.newUTF8("RuntimeInvisibleAnnotations");
            i2 += this.f36982n.m275a() + 8;
        }
        if (this.f36983o != null) {
            this.f36970b.newUTF8("RuntimeVisibleParameterAnnotations");
            i = i2 + ((this.f36983o.length - this.f36968S) * 2) + 7;
            int length = this.f36983o.length;
            while (true) {
                length--;
                if (length < this.f36968S) {
                    break;
                }
                i += this.f36983o[length] == null ? 0 : this.f36983o[length].m275a();
            }
        } else {
            i = i2;
        }
        if (this.f36984p != null) {
            this.f36970b.newUTF8("RuntimeInvisibleParameterAnnotations");
            i += ((this.f36984p.length - this.f36968S) * 2) + 7;
            int length2 = this.f36984p.length;
            while (true) {
                length2--;
                if (length2 < this.f36968S) {
                    break;
                }
                i += this.f36984p[length2] == null ? 0 : this.f36984p[length2].m275a();
            }
        }
        int i4 = i;
        return this.f36985q != null ? i4 + this.f36985q.m271a(this.f36970b, null, 0, -1, -1) : i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m206a(ByteVector byteVector) {
        boolean z = true;
        byteVector.putShort(((393216 | ((this.f36971c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) / 64)) ^ (-1)) & this.f36971c).putShort(this.f36972d).putShort(this.f36973e);
        if (this.f36976h != 0) {
            byteVector.putByteArray(this.f36970b.f36875J.f36863b, this.f36976h, this.f36977i);
            return;
        }
        int i = this.f36986r.f36860b > 0 ? 1 : 0;
        if (this.f36978j > 0) {
            i++;
        }
        if ((this.f36971c & 4096) != 0 && ((this.f36970b.f36876b & 65535) < 49 || (this.f36971c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            i++;
        }
        if ((this.f36971c & 131072) != 0) {
            i++;
        }
        if (this.f36975g != null) {
            i++;
        }
        if (this.f36980l != null) {
            i++;
        }
        if (this.f36981m != null) {
            i++;
        }
        if (this.f36982n != null) {
            i++;
        }
        if (this.f36983o != null) {
            i++;
        }
        if (this.f36984p != null) {
            i++;
        }
        if (this.f36985q != null) {
            i += this.f36985q.m272a();
        }
        byteVector.putShort(i);
        if (this.f36986r.f36860b > 0) {
            int i2 = this.f36986r.f36860b + 12 + (this.f36950A * 8);
            if (this.f36954E != null) {
                i2 += this.f36954E.f36860b + 8;
            }
            if (this.f36956G != null) {
                i2 += this.f36956G.f36860b + 8;
            }
            if (this.f36958I != null) {
                i2 += this.f36958I.f36860b + 8;
            }
            int i3 = this.f36990v != null ? i2 + this.f36990v.f36860b + 8 : i2;
            if (this.f36959J != null) {
                i3 += this.f36959J.m271a(this.f36970b, this.f36986r.f36859a, this.f36986r.f36860b, this.f36987s, this.f36988t);
            }
            byteVector.putShort(this.f36970b.newUTF8("Code")).putInt(i3);
            byteVector.putShort(this.f36987s).putShort(this.f36988t);
            byteVector.putInt(this.f36986r.f36860b).putByteArray(this.f36986r.f36859a, 0, this.f36986r.f36860b);
            byteVector.putShort(this.f36950A);
            if (this.f36950A > 0) {
                for (Handler handler = this.f36951B; handler != null; handler = handler.f36928f) {
                    byteVector.putShort(handler.f36923a.f36940c).putShort(handler.f36924b.f36940c).putShort(handler.f36925c.f36940c).putShort(handler.f36927e);
                }
            }
            int i4 = this.f36954E != null ? 1 : 0;
            if (this.f36956G != null) {
                i4++;
            }
            if (this.f36958I != null) {
                i4++;
            }
            if (this.f36990v != null) {
                i4++;
            }
            if (this.f36959J != null) {
                i4 += this.f36959J.m272a();
            }
            byteVector.putShort(i4);
            if (this.f36954E != null) {
                byteVector.putShort(this.f36970b.newUTF8("LocalVariableTable"));
                byteVector.putInt(this.f36954E.f36860b + 2).putShort(this.f36953D);
                byteVector.putByteArray(this.f36954E.f36859a, 0, this.f36954E.f36860b);
            }
            if (this.f36956G != null) {
                byteVector.putShort(this.f36970b.newUTF8("LocalVariableTypeTable"));
                byteVector.putInt(this.f36956G.f36860b + 2).putShort(this.f36955F);
                byteVector.putByteArray(this.f36956G.f36859a, 0, this.f36956G.f36860b);
            }
            if (this.f36958I != null) {
                byteVector.putShort(this.f36970b.newUTF8("LineNumberTable"));
                byteVector.putInt(this.f36958I.f36860b + 2).putShort(this.f36957H);
                byteVector.putByteArray(this.f36958I.f36859a, 0, this.f36958I.f36860b);
            }
            if (this.f36990v != null) {
                if ((this.f36970b.f36876b & 65535) < 50) {
                    z = false;
                }
                byteVector.putShort(this.f36970b.newUTF8(z ? "StackMapTable" : "StackMap"));
                byteVector.putInt(this.f36990v.f36860b + 2).putShort(this.f36989u);
                byteVector.putByteArray(this.f36990v.f36859a, 0, this.f36990v.f36860b);
            }
            if (this.f36959J != null) {
                this.f36959J.m270a(this.f36970b, this.f36986r.f36859a, this.f36986r.f36860b, this.f36988t, this.f36987s, byteVector);
            }
        }
        if (this.f36978j > 0) {
            byteVector.putShort(this.f36970b.newUTF8("Exceptions")).putInt((this.f36978j * 2) + 2);
            byteVector.putShort(this.f36978j);
            for (int i5 = 0; i5 < this.f36978j; i5++) {
                byteVector.putShort(this.f36979k[i5]);
            }
        }
        if ((this.f36971c & 4096) != 0 && ((this.f36970b.f36876b & 65535) < 49 || (this.f36971c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            byteVector.putShort(this.f36970b.newUTF8("Synthetic")).putInt(0);
        }
        if ((this.f36971c & 131072) != 0) {
            byteVector.putShort(this.f36970b.newUTF8("Deprecated")).putInt(0);
        }
        if (this.f36975g != null) {
            byteVector.putShort(this.f36970b.newUTF8(Consts.SIGNATURE)).putInt(2).putShort(this.f36970b.newUTF8(this.f36975g));
        }
        if (this.f36980l != null) {
            byteVector.putShort(this.f36970b.newUTF8("AnnotationDefault"));
            byteVector.putInt(this.f36980l.f36860b);
            byteVector.putByteArray(this.f36980l.f36859a, 0, this.f36980l.f36860b);
        }
        if (this.f36981m != null) {
            byteVector.putShort(this.f36970b.newUTF8("RuntimeVisibleAnnotations"));
            this.f36981m.m274a(byteVector);
        }
        if (this.f36982n != null) {
            byteVector.putShort(this.f36970b.newUTF8("RuntimeInvisibleAnnotations"));
            this.f36982n.m274a(byteVector);
        }
        if (this.f36983o != null) {
            byteVector.putShort(this.f36970b.newUTF8("RuntimeVisibleParameterAnnotations"));
            AnnotationWriter.m273a(this.f36983o, this.f36968S, byteVector);
        }
        if (this.f36984p != null) {
            byteVector.putShort(this.f36970b.newUTF8("RuntimeInvisibleParameterAnnotations"));
            AnnotationWriter.m273a(this.f36984p, this.f36968S, byteVector);
        }
        if (this.f36985q == null) {
            return;
        }
        this.f36985q.m270a(this.f36970b, null, 0, -1, -1, byteVector);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f36970b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f36970b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f36855g = this.f36981m;
            this.f36981m = annotationWriter;
        } else {
            annotationWriter.f36855g = this.f36982n;
            this.f36982n = annotationWriter;
        }
        return annotationWriter;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        this.f36980l = new ByteVector();
        return new AnnotationWriter(this.f36970b, false, this.f36980l, null, 0);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute.isCodeAttribute()) {
            attribute.f36857a = this.f36959J;
            this.f36959J = attribute;
            return;
        }
        attribute.f36857a = this.f36985q;
        this.f36985q = attribute;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitCode() {
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitEnd() {
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        int i2;
        int i3 = 1;
        int i4 = -2;
        Item m248a = this.f36970b.m248a(str, str2, str3);
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, 0, this.f36970b, m248a);
            } else {
                char charAt = str3.charAt(0);
                switch (i) {
                    case Opcodes.GETSTATIC /* 178 */:
                        int i5 = this.f36966Q;
                        if (charAt == 'D' || charAt == 'J') {
                            i3 = 2;
                        }
                        i2 = i3 + i5;
                        break;
                    case Opcodes.PUTSTATIC /* 179 */:
                        i2 = ((charAt == 'D' || charAt == 'J') ? -2 : -1) + this.f36966Q;
                        break;
                    case Opcodes.GETFIELD /* 180 */:
                        int i6 = this.f36966Q;
                        if (charAt != 'D' && charAt != 'J') {
                            i3 = 0;
                        }
                        i2 = i3 + i6;
                        break;
                    default:
                        int i7 = this.f36966Q;
                        if (charAt == 'D' || charAt == 'J') {
                            i4 = -3;
                        }
                        i2 = i7 + i4;
                        break;
                }
                if (i2 > this.f36967R) {
                    this.f36967R = i2;
                }
                this.f36966Q = i2;
            }
        }
        this.f36986r.m267b(i, m248a.f36929a);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        int i5 = 0;
        if (this.f36962M == 0) {
            return;
        }
        if (i == -1) {
            m209a(this.f36986r.f36860b, i2, i3);
            for (int i6 = 0; i6 < i2; i6++) {
                if (objArr[i6] instanceof String) {
                    int[] iArr = this.f36994z;
                    int i7 = this.f36993y;
                    this.f36993y = i7 + 1;
                    iArr[i7] = this.f36970b.m243c((String) objArr[i6]) | 24117248;
                } else if (objArr[i6] instanceof Integer) {
                    int[] iArr2 = this.f36994z;
                    int i8 = this.f36993y;
                    this.f36993y = i8 + 1;
                    iArr2[i8] = ((Integer) objArr[i6]).intValue();
                } else {
                    int[] iArr3 = this.f36994z;
                    int i9 = this.f36993y;
                    this.f36993y = i9 + 1;
                    iArr3[i9] = this.f36970b.m250a("", ((Label) objArr[i6]).f36940c) | 25165824;
                }
            }
            while (i5 < i3) {
                if (objArr2[i5] instanceof String) {
                    int[] iArr4 = this.f36994z;
                    int i10 = this.f36993y;
                    this.f36993y = i10 + 1;
                    iArr4[i10] = this.f36970b.m243c((String) objArr2[i5]) | 24117248;
                } else if (objArr2[i5] instanceof Integer) {
                    int[] iArr5 = this.f36994z;
                    int i11 = this.f36993y;
                    this.f36993y = i11 + 1;
                    iArr5[i11] = ((Integer) objArr2[i5]).intValue();
                } else {
                    int[] iArr6 = this.f36994z;
                    int i12 = this.f36993y;
                    this.f36993y = i12 + 1;
                    iArr6[i12] = this.f36970b.m250a("", ((Label) objArr2[i5]).f36940c) | 25165824;
                }
                i5++;
            }
            m200b();
            return;
        }
        if (this.f36990v == null) {
            this.f36990v = new ByteVector();
            i4 = this.f36986r.f36860b;
        } else {
            i4 = (this.f36986r.f36860b - this.f36991w) - 1;
            if (i4 < 0) {
                if (i == 3) {
                    return;
                }
                throw new IllegalStateException();
            }
        }
        switch (i) {
            case 0:
                this.f36990v.putByte(255).putShort(i4).putShort(i2);
                for (int i13 = 0; i13 < i2; i13++) {
                    m207a(objArr[i13]);
                }
                this.f36990v.putShort(i3);
                while (i5 < i3) {
                    m207a(objArr2[i5]);
                    i5++;
                }
                break;
            case 1:
                this.f36990v.putByte(i2 + 251).putShort(i4);
                for (int i14 = 0; i14 < i2; i14++) {
                    m207a(objArr[i14]);
                }
                break;
            case 2:
                this.f36990v.putByte(251 - i2).putShort(i4);
                break;
            case 3:
                if (i4 < 64) {
                    this.f36990v.putByte(i4);
                    break;
                } else {
                    this.f36990v.putByte(251).putShort(i4);
                    break;
                }
            case 4:
                if (i4 < 64) {
                    this.f36990v.putByte(i4 + 64);
                } else {
                    this.f36990v.putByte(247).putShort(i4);
                }
                m207a(objArr2[0]);
                break;
        }
        this.f36991w = this.f36986r.f36860b;
        this.f36989u++;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        int i3;
        if (this.f36965P != null && this.f36962M == 0) {
            this.f36965P.f36945h.m236a(132, i, (ClassWriter) null, (Item) null);
        }
        if (this.f36962M != 2 && (i3 = i + 1) > this.f36988t) {
            this.f36988t = i3;
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.f36986r.putByte(SmileConstants.MIN_BUFFER_FOR_POSSIBLE_SHORT_STRING).m267b(132, i).putShort(i2);
        } else {
            this.f36986r.putByte(132).m268a(i, i2);
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        this.f36986r.putByte(i);
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, 0, (ClassWriter) null, (Item) null);
            } else {
                int i2 = this.f36966Q + Frame.f36914a[i];
                if (i2 > this.f36967R) {
                    this.f36967R = i2;
                }
                this.f36966Q = i2;
            }
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m194e();
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i != 188) {
                int i3 = this.f36966Q + 1;
                if (i3 > this.f36967R) {
                    this.f36967R = i3;
                }
                this.f36966Q = i3;
            }
        }
        if (i == 17) {
            this.f36986r.m267b(i, i2);
        } else {
            this.f36986r.m268a(i, i2);
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        Label label2 = null;
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, 0, (ClassWriter) null, (Item) null);
                label.m219a().f36938a |= 16;
                m208a(0, label);
                if (i != 167) {
                    label2 = new Label();
                }
            } else if (i == 168) {
                if ((label.f36938a & 512) == 0) {
                    label.f36938a |= 512;
                    this.f36961L++;
                }
                this.f36965P.f36938a |= 128;
                m208a(this.f36966Q + 1, label);
                label2 = new Label();
            } else {
                this.f36966Q += Frame.f36914a[i];
                m208a(this.f36966Q, label);
            }
        }
        if ((label.f36938a & 2) == 0 || label.f36940c - this.f36986r.f36860b >= -32768) {
            this.f36986r.putByte(i);
            label.m213a(this, this.f36986r, this.f36986r.f36860b - 1, false);
        } else {
            if (i == 167) {
                this.f36986r.putByte(200);
            } else if (i == 168) {
                this.f36986r.putByte(201);
            } else {
                if (label2 != null) {
                    label2.f36938a |= 16;
                }
                this.f36986r.putByte(i <= 166 ? ((i + 1) ^ 1) - 1 : i ^ 1);
                this.f36986r.putShort(8);
                this.f36986r.putByte(200);
            }
            label.m213a(this, this.f36986r, this.f36986r.f36860b - 1, true);
        }
        if (this.f36965P != null) {
            if (label2 != null) {
                visitLabel(label2);
            }
            if (i != 167) {
                return;
            }
            m194e();
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        this.f36960K |= label.m214a(this, this.f36986r.f36860b, this.f36986r.f36859a);
        if ((label.f36938a & 1) != 0) {
            return;
        }
        if (this.f36962M != 0) {
            if (this.f36962M != 1) {
                return;
            }
            if (this.f36965P != null) {
                this.f36965P.f36944g = this.f36967R;
                m208a(this.f36966Q, label);
            }
            this.f36965P = label;
            this.f36966Q = 0;
            this.f36967R = 0;
            if (this.f36964O != null) {
                this.f36964O.f36946i = label;
            }
            this.f36964O = label;
            return;
        }
        if (this.f36965P != null) {
            if (label.f36940c == this.f36965P.f36940c) {
                this.f36965P.f36938a |= label.f36938a & 16;
                label.f36945h = this.f36965P.f36945h;
                return;
            }
            m208a(0, label);
        }
        this.f36965P = label;
        if (label.f36945h == null) {
            label.f36945h = new Frame();
            label.f36945h.f36915b = label;
        }
        if (this.f36964O != null) {
            if (label.f36940c == this.f36964O.f36940c) {
                this.f36964O.f36938a |= label.f36938a & 16;
                label.f36945h = this.f36964O.f36945h;
                this.f36965P = this.f36964O;
                return;
            }
            this.f36964O.f36946i = label;
        }
        this.f36964O = label;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        Item m252a = this.f36970b.m252a(obj);
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(18, 0, this.f36970b, m252a);
            } else {
                int i = (m252a.f36930b == 5 || m252a.f36930b == 6) ? this.f36966Q + 2 : this.f36966Q + 1;
                if (i > this.f36967R) {
                    this.f36967R = i;
                }
                this.f36966Q = i;
            }
        }
        int i2 = m252a.f36929a;
        if (m252a.f36930b == 5 || m252a.f36930b == 6) {
            this.f36986r.m267b(20, i2);
        } else if (i2 >= 256) {
            this.f36986r.m267b(19, i2);
        } else {
            this.f36986r.m268a(18, i2);
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.f36958I == null) {
            this.f36958I = new ByteVector();
        }
        this.f36957H++;
        this.f36958I.putShort(label.f36940c);
        this.f36958I.putShort(i);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        int i2 = 2;
        if (str3 != null) {
            if (this.f36956G == null) {
                this.f36956G = new ByteVector();
            }
            this.f36955F++;
            this.f36956G.putShort(label.f36940c).putShort(label2.f36940c - label.f36940c).putShort(this.f36970b.newUTF8(str)).putShort(this.f36970b.newUTF8(str3)).putShort(i);
        }
        if (this.f36954E == null) {
            this.f36954E = new ByteVector();
        }
        this.f36953D++;
        this.f36954E.putShort(label.f36940c).putShort(label2.f36940c - label.f36940c).putShort(this.f36970b.newUTF8(str)).putShort(this.f36970b.newUTF8(str2)).putShort(i);
        if (this.f36962M != 2) {
            char charAt = str2.charAt(0);
            if (charAt != 'J' && charAt != 'D') {
                i2 = 1;
            }
            int i3 = i2 + i;
            if (i3 <= this.f36988t) {
                return;
            }
            this.f36988t = i3;
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        int i = this.f36986r.f36860b;
        this.f36986r.putByte(Opcodes.LOOKUPSWITCH);
        this.f36986r.putByteArray(null, 0, (4 - (this.f36986r.f36860b % 4)) % 4);
        label.m213a(this, this.f36986r, i, true);
        this.f36986r.putInt(labelArr.length);
        for (int i2 = 0; i2 < labelArr.length; i2++) {
            this.f36986r.putInt(iArr[i2]);
            labelArr[i2].m213a(this, this.f36986r, i, true);
        }
        m205a(label, labelArr);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        Label label;
        if (this.f36962M != 0) {
            if (this.f36962M != 1) {
                this.f36987s = i;
                this.f36988t = i2;
                return;
            }
            for (Handler handler = this.f36951B; handler != null; handler = handler.f36928f) {
                Label label2 = handler.f36925c;
                Label label3 = handler.f36924b;
                for (Label label4 = handler.f36923a; label4 != label3; label4 = label4.f36946i) {
                    Edge edge = new Edge();
                    edge.f36901a = Integer.MAX_VALUE;
                    edge.f36902b = label2;
                    if ((label4.f36938a & 128) == 0) {
                        edge.f36903c = label4.f36947j;
                        label4.f36947j = edge;
                    } else {
                        edge.f36903c = label4.f36947j.f36903c.f36903c;
                        label4.f36947j.f36903c.f36903c = edge;
                    }
                }
            }
            if (this.f36961L > 0) {
                this.f36963N.m212b(null, 1L, this.f36961L);
                int i3 = 0;
                for (Label label5 = this.f36963N; label5 != null; label5 = label5.f36946i) {
                    if ((label5.f36938a & 128) != 0) {
                        Label label6 = label5.f36947j.f36903c.f36902b;
                        if ((label6.f36938a & 1024) == 0) {
                            i3++;
                            label6.m212b(null, ((i3 / 32) << 32) | (1 << (i3 % 32)), this.f36961L);
                        }
                    }
                }
                for (Label label7 = this.f36963N; label7 != null; label7 = label7.f36946i) {
                    if ((label7.f36938a & 128) != 0) {
                        for (Label label8 = this.f36963N; label8 != null; label8 = label8.f36946i) {
                            label8.f36938a &= -2049;
                        }
                        label7.f36947j.f36903c.f36902b.m212b(label7, 0L, this.f36961L);
                    }
                }
            }
            Label label9 = this.f36963N;
            int i4 = 0;
            while (label9 != null) {
                Label label10 = label9.f36948k;
                int i5 = label9.f36943f;
                int i6 = label9.f36944g + i5;
                if (i6 <= i4) {
                    i6 = i4;
                }
                Edge edge2 = label9.f36947j;
                Edge edge3 = (label9.f36938a & 128) != 0 ? edge2.f36903c : edge2;
                while (edge3 != null) {
                    Label label11 = edge3.f36902b;
                    if ((label11.f36938a & 8) == 0) {
                        label11.f36943f = edge3.f36901a == Integer.MAX_VALUE ? 1 : edge3.f36901a + i5;
                        label11.f36938a |= 8;
                        label11.f36948k = label10;
                        label = label11;
                    } else {
                        label = label10;
                    }
                    edge3 = edge3.f36903c;
                    label10 = label;
                }
                label9 = label10;
                i4 = i6;
            }
            this.f36987s = i4;
            return;
        }
        for (Handler handler2 = this.f36951B; handler2 != null; handler2 = handler2.f36928f) {
            Label m219a = handler2.f36923a.m219a();
            Label m219a2 = handler2.f36925c.m219a();
            Label m219a3 = handler2.f36924b.m219a();
            int m243c = 24117248 | this.f36970b.m243c(handler2.f36926d == null ? "java/lang/Throwable" : handler2.f36926d);
            m219a2.f36938a |= 16;
            for (Label label12 = m219a; label12 != m219a3; label12 = label12.f36946i) {
                Edge edge4 = new Edge();
                edge4.f36901a = m243c;
                edge4.f36902b = m219a2;
                edge4.f36903c = label12.f36947j;
                label12.f36947j = edge4;
            }
        }
        Frame frame = this.f36963N.f36945h;
        frame.m232a(this.f36970b, this.f36971c, Type.getArgumentTypes(this.f36974f), this.f36988t);
        m199b(frame);
        Label label13 = this.f36963N;
        int i7 = 0;
        while (label13 != null) {
            Label label14 = label13.f36948k;
            label13.f36948k = null;
            Frame frame2 = label13.f36945h;
            if ((label13.f36938a & 16) != 0) {
                label13.f36938a |= 32;
            }
            label13.f36938a |= 64;
            int length = frame2.f36917d.length + label13.f36944g;
            if (length <= i7) {
                length = i7;
            }
            Edge edge5 = label13.f36947j;
            while (edge5 != null) {
                Label m219a4 = edge5.f36902b.m219a();
                if (!frame2.m230a(this.f36970b, m219a4.f36945h, edge5.f36901a) || m219a4.f36948k != null) {
                    m219a4 = label14;
                } else {
                    m219a4.f36948k = label14;
                }
                edge5 = edge5.f36903c;
                label14 = m219a4;
            }
            label13 = label14;
            i7 = length;
        }
        int i8 = i7;
        for (Label label15 = this.f36963N; label15 != null; label15 = label15.f36946i) {
            Frame frame3 = label15.f36945h;
            if ((label15.f36938a & 32) != 0) {
                m199b(frame3);
            }
            if ((label15.f36938a & 64) == 0) {
                Label label16 = label15.f36946i;
                int i9 = label15.f36940c;
                int i10 = (label16 == null ? this.f36986r.f36860b : label16.f36940c) - 1;
                if (i10 >= i9) {
                    i8 = Math.max(i8, 1);
                    for (int i11 = i9; i11 < i10; i11++) {
                        this.f36986r.f36859a[i11] = 0;
                    }
                    this.f36986r.f36859a[i10] = -65;
                    m209a(i9, 0, 1);
                    int[] iArr = this.f36994z;
                    int i12 = this.f36993y;
                    this.f36993y = i12 + 1;
                    iArr[i12] = this.f36970b.m243c("java/lang/Throwable") | 24117248;
                    m200b();
                }
            }
        }
        this.f36987s = i8;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        int i2;
        boolean z = i == 185;
        Item m249a = i == 186 ? this.f36970b.m249a(str2, str3) : this.f36970b.m247a(str, str2, str3, z);
        int i3 = m249a.f36931c;
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, 0, this.f36970b, m249a);
            } else {
                if (i3 == 0) {
                    i2 = Type.getArgumentsAndReturnSizes(str3);
                    m249a.f36931c = i2;
                } else {
                    i2 = i3;
                }
                int i4 = (i == 184 || i == 186) ? (this.f36966Q - (i2 >> 2)) + (i2 & 3) + 1 : (this.f36966Q - (i2 >> 2)) + (i2 & 3);
                if (i4 > this.f36967R) {
                    this.f36967R = i4;
                }
                this.f36966Q = i4;
                i3 = i2;
            }
        }
        if (z) {
            if (i3 == 0) {
                i3 = Type.getArgumentsAndReturnSizes(str3);
                m249a.f36931c = i3;
            }
            this.f36986r.m267b(Opcodes.INVOKEINTERFACE, m249a.f36929a).m268a(i3 >> 2, 0);
            return;
        }
        this.f36986r.m267b(i, m249a.f36929a);
        if (i != 186) {
            return;
        }
        this.f36986r.putShort(0);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        Item m251a = this.f36970b.m251a(str);
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(197, i, this.f36970b, m251a);
            } else {
                this.f36966Q += 1 - i;
            }
        }
        this.f36986r.m267b(197, m251a.f36929a).putByte(i);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f36968S = Math.max(this.f36968S, i + 1);
            return new AnnotationWriter(this.f36970b, false, byteVector, null, 0);
        }
        byteVector.putShort(this.f36970b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f36970b, true, byteVector, byteVector, 2);
        if (z) {
            if (this.f36983o == null) {
                this.f36983o = new AnnotationWriter[Type.getArgumentTypes(this.f36974f).length];
            }
            annotationWriter.f36855g = this.f36983o[i];
            this.f36983o[i] = annotationWriter;
            return annotationWriter;
        }
        if (this.f36984p == null) {
            this.f36984p = new AnnotationWriter[Type.getArgumentTypes(this.f36974f).length];
        }
        annotationWriter.f36855g = this.f36984p[i];
        this.f36984p[i] = annotationWriter;
        return annotationWriter;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label[] labelArr) {
        int i3 = this.f36986r.f36860b;
        this.f36986r.putByte(170);
        this.f36986r.putByteArray(null, 0, (4 - (this.f36986r.f36860b % 4)) % 4);
        label.m213a(this, this.f36986r, i3, true);
        this.f36986r.putInt(i).putInt(i2);
        for (Label label2 : labelArr) {
            label2.m213a(this, this.f36986r, i3, true);
        }
        m205a(label, labelArr);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        this.f36950A++;
        Handler handler = new Handler();
        handler.f36923a = label;
        handler.f36924b = label2;
        handler.f36925c = label3;
        handler.f36926d = str;
        handler.f36927e = str != null ? this.f36970b.newClass(str) : 0;
        if (this.f36952C == null) {
            this.f36951B = handler;
        } else {
            this.f36952C.f36928f = handler;
        }
        this.f36952C = handler;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        Item m251a = this.f36970b.m251a(str);
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, this.f36986r.f36860b, this.f36970b, m251a);
            } else if (i == 187) {
                int i2 = this.f36966Q + 1;
                if (i2 > this.f36967R) {
                    this.f36967R = i2;
                }
                this.f36966Q = i2;
            }
        }
        this.f36986r.m267b(i, m251a.f36929a);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        if (this.f36965P != null) {
            if (this.f36962M == 0) {
                this.f36965P.f36945h.m236a(i, i2, (ClassWriter) null, (Item) null);
            } else if (i == 169) {
                this.f36965P.f36938a |= 256;
                this.f36965P.f36943f = this.f36966Q;
                m194e();
            } else {
                int i3 = this.f36966Q + Frame.f36914a[i];
                if (i3 > this.f36967R) {
                    this.f36967R = i3;
                }
                this.f36966Q = i3;
            }
        }
        if (this.f36962M != 2) {
            int i4 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i4 > this.f36988t) {
                this.f36988t = i4;
            }
        }
        if (i2 < 4 && i != 169) {
            this.f36986r.putByte(i < 54 ? ((i - 21) << 2) + 26 + i2 : ((i - 54) << 2) + 59 + i2);
        } else if (i2 >= 256) {
            this.f36986r.putByte(SmileConstants.MIN_BUFFER_FOR_POSSIBLE_SHORT_STRING).m267b(i, i2);
        } else {
            this.f36986r.m268a(i, i2);
        }
        if (i < 54 || this.f36962M != 0 || this.f36950A <= 0) {
            return;
        }
        visitLabel(new Label());
    }
}
