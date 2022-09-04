package org.codehaus.jackson.org.objectweb.asm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnnotationWriter implements AnnotationVisitor {

    /* renamed from: a */
    private final ClassWriter f36849a;

    /* renamed from: b */
    private int f36850b;

    /* renamed from: c */
    private final boolean f36851c;

    /* renamed from: d */
    private final ByteVector f36852d;

    /* renamed from: e */
    private final ByteVector f36853e;

    /* renamed from: f */
    private final int f36854f;

    /* renamed from: g */
    AnnotationWriter f36855g;

    /* renamed from: h */
    AnnotationWriter f36856h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnnotationWriter(ClassWriter classWriter, boolean z, ByteVector byteVector, ByteVector byteVector2, int i) {
        this.f36849a = classWriter;
        this.f36851c = z;
        this.f36852d = byteVector;
        this.f36853e = byteVector2;
        this.f36854f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m273a(AnnotationWriter[] annotationWriterArr, int i, ByteVector byteVector) {
        int length = ((annotationWriterArr.length - i) * 2) + 1;
        for (int i2 = i; i2 < annotationWriterArr.length; i2++) {
            length += annotationWriterArr[i2] == null ? 0 : annotationWriterArr[i2].m275a();
        }
        byteVector.putInt(length).putByte(annotationWriterArr.length - i);
        while (i < annotationWriterArr.length) {
            AnnotationWriter annotationWriter = annotationWriterArr[i];
            AnnotationWriter annotationWriter2 = null;
            int i3 = 0;
            while (annotationWriter != null) {
                i3++;
                annotationWriter.visitEnd();
                annotationWriter.f36856h = annotationWriter2;
                AnnotationWriter annotationWriter3 = annotationWriter;
                annotationWriter = annotationWriter.f36855g;
                annotationWriter2 = annotationWriter3;
            }
            byteVector.putShort(i3);
            while (annotationWriter2 != null) {
                byteVector.putByteArray(annotationWriter2.f36852d.f36859a, 0, annotationWriter2.f36852d.f36860b);
                annotationWriter2 = annotationWriter2.f36856h;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m275a() {
        int i = 0;
        while (this != null) {
            i += this.f36852d.f36860b;
            this = this.f36855g;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m274a(ByteVector byteVector) {
        AnnotationWriter annotationWriter = null;
        int i = 2;
        int i2 = 0;
        for (AnnotationWriter annotationWriter2 = this; annotationWriter2 != null; annotationWriter2 = annotationWriter2.f36855g) {
            i2++;
            i += annotationWriter2.f36852d.f36860b;
            annotationWriter2.visitEnd();
            annotationWriter2.f36856h = annotationWriter;
            annotationWriter = annotationWriter2;
        }
        byteVector.putInt(i);
        byteVector.putShort(i2);
        while (annotationWriter != null) {
            byteVector.putByteArray(annotationWriter.f36852d.f36859a, 0, annotationWriter.f36852d.f36860b);
            annotationWriter = annotationWriter.f36856h;
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        int i = 1;
        int i2 = 0;
        this.f36850b++;
        if (this.f36851c) {
            this.f36852d.putShort(this.f36849a.newUTF8(str));
        }
        if (obj instanceof String) {
            this.f36852d.m267b(Opcodes.DREM, this.f36849a.newUTF8((String) obj));
        } else if (obj instanceof Byte) {
            this.f36852d.m267b(66, this.f36849a.m256a((int) ((Byte) obj).byteValue()).f36929a);
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                i = 0;
            }
            this.f36852d.m267b(90, this.f36849a.m256a(i).f36929a);
        } else if (obj instanceof Character) {
            this.f36852d.m267b(67, this.f36849a.m256a((int) ((Character) obj).charValue()).f36929a);
        } else if (obj instanceof Short) {
            this.f36852d.m267b(83, this.f36849a.m256a((int) ((Short) obj).shortValue()).f36929a);
        } else if (obj instanceof Type) {
            this.f36852d.m267b(99, this.f36849a.newUTF8(((Type) obj).getDescriptor()));
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f36852d.m267b(91, bArr.length);
            while (i2 < bArr.length) {
                this.f36852d.m267b(66, this.f36849a.m256a((int) bArr[i2]).f36929a);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f36852d.m267b(91, zArr.length);
            for (boolean z : zArr) {
                this.f36852d.m267b(90, this.f36849a.m256a(z ? 1 : 0).f36929a);
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f36852d.m267b(91, sArr.length);
            while (i2 < sArr.length) {
                this.f36852d.m267b(83, this.f36849a.m256a((int) sArr[i2]).f36929a);
                i2++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f36852d.m267b(91, cArr.length);
            while (i2 < cArr.length) {
                this.f36852d.m267b(67, this.f36849a.m256a((int) cArr[i2]).f36929a);
                i2++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f36852d.m267b(91, iArr.length);
            while (i2 < iArr.length) {
                this.f36852d.m267b(73, this.f36849a.m256a(iArr[i2]).f36929a);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f36852d.m267b(91, jArr.length);
            while (i2 < jArr.length) {
                this.f36852d.m267b(74, this.f36849a.m253a(jArr[i2]).f36929a);
                i2++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f36852d.m267b(91, fArr.length);
            while (i2 < fArr.length) {
                this.f36852d.m267b(70, this.f36849a.m257a(fArr[i2]).f36929a);
                i2++;
            }
        } else if (!(obj instanceof double[])) {
            Item m252a = this.f36849a.m252a(obj);
            this.f36852d.m267b(".s.IFJDCS".charAt(m252a.f36930b), m252a.f36929a);
        } else {
            double[] dArr = (double[]) obj;
            this.f36852d.m267b(91, dArr.length);
            while (i2 < dArr.length) {
                this.f36852d.m267b(68, this.f36849a.m258a(dArr[i2]).f36929a);
                i2++;
            }
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        this.f36850b++;
        if (this.f36851c) {
            this.f36852d.putShort(this.f36849a.newUTF8(str));
        }
        this.f36852d.m267b(64, this.f36849a.newUTF8(str2)).putShort(0);
        return new AnnotationWriter(this.f36849a, true, this.f36852d, this.f36852d, this.f36852d.f36860b - 2);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        this.f36850b++;
        if (this.f36851c) {
            this.f36852d.putShort(this.f36849a.newUTF8(str));
        }
        this.f36852d.m267b(91, 0);
        return new AnnotationWriter(this.f36849a, false, this.f36852d, this.f36852d, this.f36852d.f36860b - 2);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.AnnotationVisitor
    public void visitEnd() {
        if (this.f36853e != null) {
            byte[] bArr = this.f36853e.f36859a;
            bArr[this.f36854f] = (byte) (this.f36850b >>> 8);
            bArr[this.f36854f + 1] = (byte) this.f36850b;
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.f36850b++;
        if (this.f36851c) {
            this.f36852d.putShort(this.f36849a.newUTF8(str));
        }
        this.f36852d.m267b(101, this.f36849a.newUTF8(str2)).putShort(this.f36849a.newUTF8(str3));
    }
}
