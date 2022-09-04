package p070c.p072b;
/* renamed from: c.b.d */
/* loaded from: classes.dex */
public class C0747d extends C0745b {

    /* renamed from: a */
    private static final int f1399a = 20;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private String f1400b;

    /* renamed from: c */
    private String f1401c;

    public C0747d(String str, String str2, String str3) {
        super(str);
        this.f1400b = str2;
        this.f1401c = str3;
    }

    /* renamed from: a */
    public String m38245a() {
        return this.f1401c;
    }

    /* renamed from: b */
    public String m38244b() {
        return this.f1400b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new C0746c(20, this.f1400b, this.f1401c).m38251a(super.getMessage());
    }
}
