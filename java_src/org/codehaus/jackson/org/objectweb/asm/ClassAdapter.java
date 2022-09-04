package org.codehaus.jackson.org.objectweb.asm;
/* loaded from: classes3.dex */
public class ClassAdapter implements ClassVisitor {

    /* renamed from: cv */
    protected ClassVisitor f36861cv;

    public ClassAdapter(ClassVisitor classVisitor) {
        this.f36861cv = classVisitor;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f36861cv.visit(i, i2, str, str2, str3, strArr);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        return this.f36861cv.visitAnnotation(str, z);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        this.f36861cv.visitAttribute(attribute);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitEnd() {
        this.f36861cv.visitEnd();
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        return this.f36861cv.visitField(i, str, str2, str3, obj);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        this.f36861cv.visitInnerClass(str, str2, str3, i);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return this.f36861cv.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        this.f36861cv.visitOuterClass(str, str2, str3);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.ClassVisitor
    public void visitSource(String str, String str2) {
        this.f36861cv.visitSource(str, str2);
    }
}
