package org.codehaus.jackson.org.objectweb.asm;
/* loaded from: classes3.dex */
public class Attribute {

    /* renamed from: a */
    Attribute f36857a;

    /* renamed from: b */
    byte[] f36858b;
    public final String type;

    /* JADX INFO: Access modifiers changed from: protected */
    public Attribute(String str) {
        this.type = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m272a() {
        int i = 0;
        while (this != null) {
            i++;
            this = this.f36857a;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m271a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        Attribute attribute = this;
        while (attribute != null) {
            classWriter.newUTF8(attribute.type);
            attribute = attribute.f36857a;
            i4 = attribute.write(classWriter, bArr, i, i2, i3).f36860b + 6 + i4;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m270a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3, ByteVector byteVector) {
        for (Attribute attribute = this; attribute != null; attribute = attribute.f36857a) {
            ByteVector write = attribute.write(classWriter, bArr, i, i2, i3);
            byteVector.putShort(classWriter.newUTF8(attribute.type)).putInt(write.f36860b);
            byteVector.putByteArray(write.f36859a, 0, write.f36860b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Label[] getLabels() {
        return null;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        attribute.f36858b = new byte[i2];
        System.arraycopy(classReader.f36863b, i, attribute.f36858b, 0, i2);
        return attribute;
    }

    protected ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byteVector.f36859a = this.f36858b;
        byteVector.f36860b = this.f36858b.length;
        return byteVector;
    }
}
