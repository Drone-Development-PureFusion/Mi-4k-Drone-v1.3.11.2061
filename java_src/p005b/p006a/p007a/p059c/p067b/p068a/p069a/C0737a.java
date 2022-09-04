package p005b.p006a.p007a.p059c.p067b.p068a.p069a;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: b.a.a.c.b.a.a.a */
/* loaded from: classes.dex */
public final class C0737a implements DataInput {

    /* renamed from: d */
    private static final String f1379d = "copyright (c) 1999-2010 Roedy Green, Canadian Mind Products, http://mindprod.com";

    /* renamed from: a */
    protected final DataInputStream f1380a;

    /* renamed from: b */
    protected final InputStream f1381b;

    /* renamed from: c */
    protected final byte[] f1382c = new byte[8];

    public C0737a(InputStream inputStream) {
        this.f1381b = inputStream;
        this.f1380a = new DataInputStream(inputStream);
    }

    /* renamed from: a */
    public static String m38299a(DataInput dataInput) {
        return DataInputStream.readUTF(dataInput);
    }

    /* renamed from: a */
    public final int m38298a(byte[] bArr, int i, int i2) {
        return this.f1381b.read(bArr, i, i2);
    }

    /* renamed from: a */
    public final void m38300a() {
        this.f1380a.close();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return this.f1380a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return this.f1380a.readByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1380a.readFully(this.f1382c, 0, 2);
        return (char) (((this.f1382c[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f1382c[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1380a.readFully(bArr, 0, bArr.length);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f1380a.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1380a.readFully(this.f1382c, 0, 4);
        return (this.f1382c[3] << 24) | ((this.f1382c[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((this.f1382c[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f1382c[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return this.f1380a.readLine();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f1380a.readFully(this.f1382c, 0, 8);
        return (this.f1382c[7] << 56) | ((this.f1382c[6] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 48) | ((this.f1382c[5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 40) | ((this.f1382c[4] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 32) | ((this.f1382c[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24) | ((this.f1382c[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((this.f1382c[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f1382c[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1380a.readFully(this.f1382c, 0, 2);
        return (short) (((this.f1382c[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f1382c[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return this.f1380a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        return this.f1380a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1380a.readFully(this.f1382c, 0, 2);
        return ((this.f1382c[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | (this.f1382c[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return this.f1380a.skipBytes(i);
    }
}
