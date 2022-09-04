package p005b.p006a.p007a.p059c.p060a.p066c;

import java.io.DataInput;
/* renamed from: b.a.a.c.a.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC0735a implements DataInput {

    /* renamed from: a */
    protected final DataInput f1378a;

    public AbstractC0735a(DataInput dataInput) {
        this.f1378a = dataInput;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        return this.f1378a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return this.f1378a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return this.f1378a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return this.f1378a.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return this.f1378a.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        this.f1378a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) {
        this.f1378a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public int readInt() {
        return this.f1378a.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() {
        return this.f1378a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return this.f1378a.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() {
        return this.f1378a.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return this.f1378a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return this.f1378a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return this.f1378a.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) {
        return this.f1378a.skipBytes(i);
    }
}
