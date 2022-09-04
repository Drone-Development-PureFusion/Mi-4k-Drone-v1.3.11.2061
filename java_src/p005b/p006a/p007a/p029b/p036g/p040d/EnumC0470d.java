package p005b.p006a.p007a.p029b.p036g.p040d;

import java.io.OutputStream;
@Deprecated
/* renamed from: b.a.a.b.g.d.d */
/* loaded from: classes.dex */
public enum EnumC0470d {
    SystemOut("System.out", new OutputStream() { // from class: b.a.a.b.g.d.d.1
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            System.out.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            System.out.write(bArr, i, i2);
        }
    }),
    SystemErr("System.err", new OutputStream() { // from class: b.a.a.b.g.d.d.2
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            System.err.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            System.err.write(bArr, i, i2);
        }
    });
    

    /* renamed from: c */
    private final String f640c;

    /* renamed from: d */
    private final OutputStream f641d;

    EnumC0470d(String str, OutputStream outputStream) {
        this.f640c = str;
        this.f641d = outputStream;
    }

    /* renamed from: a */
    public static EnumC0470d m39228a(String str) {
        EnumC0470d[] values;
        for (EnumC0470d enumC0470d : values()) {
            if (enumC0470d.f640c.equalsIgnoreCase(str)) {
                return enumC0470d;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String m39229a() {
        return this.f640c;
    }

    /* renamed from: b */
    public OutputStream m39227b() {
        return this.f641d;
    }
}
