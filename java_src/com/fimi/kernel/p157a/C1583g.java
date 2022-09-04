package com.fimi.kernel.p157a;
/* renamed from: com.fimi.kernel.a.g */
/* loaded from: classes.dex */
public class C1583g {

    /* renamed from: a */
    public String f3906a;

    /* renamed from: b */
    public String f3907b;

    /* renamed from: c */
    public String f3908c;

    /* renamed from: d */
    public String f3909d;

    /* renamed from: e */
    public int f3910e;

    /* renamed from: f */
    public String f3911f;

    public C1583g(String str) {
        if (str == null) {
            return;
        }
        String[] split = str.split("[\\s]+");
        if (split.length != 9) {
            return;
        }
        this.f3909d = split[0];
        this.f3906a = split[1];
        this.f3908c = split[2];
        this.f3910e = Integer.parseInt(split[4]);
        this.f3907b = split[8];
        if (!m35096a()) {
            return;
        }
        this.f3911f = this.f3906a;
    }

    /* renamed from: a */
    public boolean m35096a() {
        return "zygote".equals(this.f3907b);
    }

    /* renamed from: b */
    public boolean m35095b() {
        return this.f3908c.equals(this.f3911f) && this.f3909d.startsWith("app_");
    }

    public String toString() {
        return "PsRow ( " + super.toString() + ";pid = " + this.f3906a + ";cmd = " + this.f3907b + ";ppid = " + this.f3908c + ";user = " + this.f3909d + ";mem = " + this.f3910e + " )";
    }
}
