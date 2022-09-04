package org.codehaus.jackson.org.objectweb.asm;

import android.support.p001v4.view.accessibility.AccessibilityEventCompat;
import com.xiaomi.infra.galaxy.fds.android.util.Consts;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FieldWriter implements FieldVisitor {

    /* renamed from: a */
    FieldWriter f36904a;

    /* renamed from: b */
    private final ClassWriter f36905b;

    /* renamed from: c */
    private final int f36906c;

    /* renamed from: d */
    private final int f36907d;

    /* renamed from: e */
    private final int f36908e;

    /* renamed from: f */
    private int f36909f;

    /* renamed from: g */
    private int f36910g;

    /* renamed from: h */
    private AnnotationWriter f36911h;

    /* renamed from: i */
    private AnnotationWriter f36912i;

    /* renamed from: j */
    private Attribute f36913j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldWriter(ClassWriter classWriter, int i, String str, String str2, String str3, Object obj) {
        if (classWriter.f36899y == null) {
            classWriter.f36899y = this;
        } else {
            classWriter.f36900z.f36904a = this;
        }
        classWriter.f36900z = this;
        this.f36905b = classWriter;
        this.f36906c = i;
        this.f36907d = classWriter.newUTF8(str);
        this.f36908e = classWriter.newUTF8(str2);
        if (str3 != null) {
            this.f36909f = classWriter.newUTF8(str3);
        }
        if (obj != null) {
            this.f36910g = classWriter.m252a(obj).f36929a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m241a() {
        int i;
        int i2 = 8;
        if (this.f36910g != 0) {
            this.f36905b.newUTF8("ConstantValue");
            i2 = 16;
        }
        if ((this.f36906c & 4096) != 0 && ((this.f36905b.f36876b & 65535) < 49 || (this.f36906c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            this.f36905b.newUTF8("Synthetic");
            i2 += 6;
        }
        if ((this.f36906c & 131072) != 0) {
            this.f36905b.newUTF8("Deprecated");
            i2 += 6;
        }
        if (this.f36909f != 0) {
            this.f36905b.newUTF8(Consts.SIGNATURE);
            i2 += 8;
        }
        if (this.f36911h != null) {
            this.f36905b.newUTF8("RuntimeVisibleAnnotations");
            i2 += this.f36911h.m275a() + 8;
        }
        if (this.f36912i != null) {
            this.f36905b.newUTF8("RuntimeInvisibleAnnotations");
            i = i2 + this.f36912i.m275a() + 8;
        } else {
            i = i2;
        }
        return this.f36913j != null ? i + this.f36913j.m271a(this.f36905b, null, 0, -1, -1) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m240a(ByteVector byteVector) {
        byteVector.putShort(((393216 | ((this.f36906c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) / 64)) ^ (-1)) & this.f36906c).putShort(this.f36907d).putShort(this.f36908e);
        int i = this.f36910g != 0 ? 1 : 0;
        if ((this.f36906c & 4096) != 0 && ((this.f36905b.f36876b & 65535) < 49 || (this.f36906c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            i++;
        }
        if ((this.f36906c & 131072) != 0) {
            i++;
        }
        if (this.f36909f != 0) {
            i++;
        }
        if (this.f36911h != null) {
            i++;
        }
        if (this.f36912i != null) {
            i++;
        }
        if (this.f36913j != null) {
            i += this.f36913j.m272a();
        }
        byteVector.putShort(i);
        if (this.f36910g != 0) {
            byteVector.putShort(this.f36905b.newUTF8("ConstantValue"));
            byteVector.putInt(2).putShort(this.f36910g);
        }
        if ((this.f36906c & 4096) != 0 && ((this.f36905b.f36876b & 65535) < 49 || (this.f36906c & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) != 0)) {
            byteVector.putShort(this.f36905b.newUTF8("Synthetic")).putInt(0);
        }
        if ((this.f36906c & 131072) != 0) {
            byteVector.putShort(this.f36905b.newUTF8("Deprecated")).putInt(0);
        }
        if (this.f36909f != 0) {
            byteVector.putShort(this.f36905b.newUTF8(Consts.SIGNATURE));
            byteVector.putInt(2).putShort(this.f36909f);
        }
        if (this.f36911h != null) {
            byteVector.putShort(this.f36905b.newUTF8("RuntimeVisibleAnnotations"));
            this.f36911h.m274a(byteVector);
        }
        if (this.f36912i != null) {
            byteVector.putShort(this.f36905b.newUTF8("RuntimeInvisibleAnnotations"));
            this.f36912i.m274a(byteVector);
        }
        if (this.f36913j != null) {
            this.f36913j.m270a(this.f36905b, null, 0, -1, -1, byteVector);
        }
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.f36905b.newUTF8(str)).putShort(0);
        AnnotationWriter annotationWriter = new AnnotationWriter(this.f36905b, true, byteVector, byteVector, 2);
        if (z) {
            annotationWriter.f36855g = this.f36911h;
            this.f36911h = annotationWriter;
        } else {
            annotationWriter.f36855g = this.f36912i;
            this.f36912i = annotationWriter;
        }
        return annotationWriter;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.f36857a = this.f36913j;
        this.f36913j = attribute;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.FieldVisitor
    public void visitEnd() {
    }
}
