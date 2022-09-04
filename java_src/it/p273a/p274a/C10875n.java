package it.p273a.p274a;

import java.util.Date;
/* renamed from: it.a.a.n */
/* loaded from: classes.dex */
public class C10875n {

    /* renamed from: a */
    public static final int f34876a = 0;

    /* renamed from: b */
    public static final int f34877b = 1;

    /* renamed from: c */
    public static final int f34878c = 2;

    /* renamed from: d */
    private String f34879d = null;

    /* renamed from: e */
    private String f34880e = null;

    /* renamed from: f */
    private Date f34881f = null;

    /* renamed from: g */
    private long f34882g = -1;

    /* renamed from: h */
    private int f34883h;

    /* renamed from: a */
    public Date m2993a() {
        return this.f34881f;
    }

    /* renamed from: a */
    public void m2992a(int i) {
        this.f34883h = i;
    }

    /* renamed from: a */
    public void m2991a(long j) {
        this.f34882g = j;
    }

    /* renamed from: a */
    public void m2990a(String str) {
        this.f34879d = str;
    }

    /* renamed from: a */
    public void m2989a(Date date) {
        this.f34881f = date;
    }

    /* renamed from: b */
    public String m2988b() {
        return this.f34879d;
    }

    /* renamed from: b */
    public void m2987b(String str) {
        this.f34880e = str;
    }

    /* renamed from: c */
    public int m2986c() {
        return this.f34883h;
    }

    /* renamed from: d */
    public long m2985d() {
        return this.f34882g;
    }

    /* renamed from: e */
    public String m2984e() {
        return this.f34880e;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [name=");
        stringBuffer.append(this.f34879d);
        stringBuffer.append(", type=");
        if (this.f34883h == 0) {
            stringBuffer.append("FILE");
        } else if (this.f34883h == 1) {
            stringBuffer.append("DIRECTORY");
        } else if (this.f34883h == 2) {
            stringBuffer.append("LINK");
            stringBuffer.append(", link=");
            stringBuffer.append(this.f34880e);
        } else {
            stringBuffer.append("UNKNOWN");
        }
        stringBuffer.append(", size=");
        stringBuffer.append(this.f34882g);
        stringBuffer.append(", modifiedDate=");
        stringBuffer.append(this.f34881f);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
