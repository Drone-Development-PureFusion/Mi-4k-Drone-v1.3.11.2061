package it.p273a.p274a;
/* renamed from: it.a.a.s */
/* loaded from: classes.dex */
public class C10880s {

    /* renamed from: a */
    private int f34888a;

    /* renamed from: b */
    private String[] f34889b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10880s(int i, String[] strArr) {
        this.f34888a = 0;
        this.f34888a = i;
        this.f34889b = strArr;
    }

    /* renamed from: a */
    public int m2982a() {
        return this.f34888a;
    }

    /* renamed from: b */
    public boolean m2981b() {
        int i = this.f34888a - 200;
        return i >= 0 && i < 100;
    }

    /* renamed from: c */
    public String[] m2980c() {
        return this.f34889b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [code=");
        stringBuffer.append(this.f34888a);
        stringBuffer.append(", message=");
        for (int i = 0; i < this.f34889b.length; i++) {
            if (i > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(this.f34889b[i]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
