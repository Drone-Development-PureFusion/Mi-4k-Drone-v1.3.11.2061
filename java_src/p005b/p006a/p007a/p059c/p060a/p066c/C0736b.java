package p005b.p006a.p007a.p059c.p060a.p066c;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: b.a.a.c.a.c.b */
/* loaded from: classes.dex */
public class C0736b extends AbstractC0735a {
    public C0736b(DataInput dataInput) {
        super(dataInput);
    }

    public C0736b(InputStream inputStream) {
        this((DataInput) new DataInputStream(inputStream));
    }

    /* renamed from: a */
    public String m38303a(int i, boolean z) {
        int i2;
        short readShort;
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            i2 = i - 1;
            if (i == 0 || (readShort = readShort()) == 0) {
                break;
            }
            sb.append((char) readShort);
            i = i2;
        }
        if (z) {
            skipBytes(i2 * 2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m38306a() {
        skipBytes(4);
    }

    /* renamed from: a */
    public void m38305a(byte b) {
        byte readByte = readByte();
        if (readByte != b) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Byte.valueOf(b), Byte.valueOf(readByte)));
        }
    }

    /* renamed from: a */
    public void m38302a(short s) {
        short readShort = readShort();
        if (readShort != s) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Short.valueOf(s), Short.valueOf(readShort)));
        }
    }

    /* renamed from: a */
    public int[] m38304a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    /* renamed from: b */
    public void m38301b(int i) {
        int readInt = readInt();
        if (readInt != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(readInt)));
        }
    }
}
