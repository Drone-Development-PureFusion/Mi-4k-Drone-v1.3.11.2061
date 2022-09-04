package org.codehaus.jackson.org.objectweb.asm.signature;

import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes3.dex */
public class SignatureWriter implements SignatureVisitor {

    /* renamed from: a */
    private final StringBuffer f37000a = new StringBuffer();

    /* renamed from: b */
    private boolean f37001b;

    /* renamed from: c */
    private boolean f37002c;

    /* renamed from: d */
    private int f37003d;

    /* renamed from: a */
    private void m189a() {
        if (this.f37001b) {
            this.f37001b = false;
            this.f37000a.append('>');
        }
    }

    /* renamed from: b */
    private void m188b() {
        if (this.f37003d % 2 != 0) {
            this.f37000a.append('>');
        }
        this.f37003d /= 2;
    }

    public String toString() {
        return this.f37000a.toString();
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.f37000a.append('[');
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.f37000a.append(c);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.f37000a.append('L');
        this.f37000a.append(str);
        this.f37003d *= 2;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        m188b();
        this.f37000a.append(';');
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.f37000a.append('^');
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        if (!this.f37001b) {
            this.f37001b = true;
            this.f37000a.append('<');
        }
        this.f37000a.append(str);
        this.f37000a.append(C0494h.f680A);
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        m188b();
        this.f37000a.append(C0494h.f686G);
        this.f37000a.append(str);
        this.f37003d *= 2;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.f37000a.append(C0494h.f680A);
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        m189a();
        if (!this.f37002c) {
            this.f37002c = true;
            this.f37000a.append(C0494h.f731s);
        }
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        m189a();
        if (!this.f37002c) {
            this.f37000a.append(C0494h.f731s);
        }
        this.f37000a.append(C0494h.f732t);
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        m189a();
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        if (this.f37003d % 2 == 0) {
            this.f37003d++;
            this.f37000a.append('<');
        }
        if (c != '=') {
            this.f37000a.append(c);
        }
        return this;
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        if (this.f37003d % 2 == 0) {
            this.f37003d++;
            this.f37000a.append('<');
        }
        this.f37000a.append('*');
    }

    @Override // org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.f37000a.append('T');
        this.f37000a.append(str);
        this.f37000a.append(';');
    }
}
