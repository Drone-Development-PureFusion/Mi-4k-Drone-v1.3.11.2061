package it.p273a.p274a;
/* renamed from: it.a.a.m */
/* loaded from: classes.dex */
public class C10874m extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private int f34874a;

    /* renamed from: b */
    private String f34875b;

    public C10874m(int i) {
        this.f34874a = i;
    }

    public C10874m(int i, String str) {
        this.f34874a = i;
        this.f34875b = str;
    }

    public C10874m(C10880s c10880s) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] m2980c = c10880s.m2980c();
        for (int i = 0; i < m2980c.length; i++) {
            if (i > 0) {
                stringBuffer.append(System.getProperty("line.separator"));
            }
            stringBuffer.append(m2980c[i]);
        }
        this.f34874a = c10880s.m2982a();
        this.f34875b = stringBuffer.toString();
    }

    /* renamed from: a */
    public int m2994a() {
        return this.f34874a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f34875b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return new StringBuffer().append(getClass().getName()).append(" [code=").append(this.f34874a).append(", message= ").append(this.f34875b).append("]").toString();
    }
}
