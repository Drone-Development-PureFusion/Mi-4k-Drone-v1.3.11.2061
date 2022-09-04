package p005b.p006a.p007a.p008a.p011c.p012a;
/* renamed from: b.a.a.a.c.a.d */
/* loaded from: classes.dex */
public class C0279d implements AbstractC0277b {

    /* renamed from: a */
    private String f188a = "";

    /* renamed from: b */
    private String f189b = "";

    /* renamed from: c */
    private String f190c = "";

    /* renamed from: d */
    private String f191d = "";

    @Override // p005b.p006a.p007a.p008a.p011c.p012a.AbstractC0277b
    /* renamed from: a */
    public <N extends Enum<?>> String mo39810a(N n) {
        return this.f188a + n.name().toLowerCase() + this.f189b;
    }

    /* renamed from: a */
    public void m39809a(String str) {
        if (str == null) {
            str = "";
        }
        this.f188a = str;
    }

    @Override // p005b.p006a.p007a.p008a.p011c.p012a.AbstractC0277b
    /* renamed from: b */
    public <N extends Enum<?>> String mo39808b(N n) {
        return this.f190c + n.name().toLowerCase() + this.f191d;
    }

    /* renamed from: b */
    public void m39807b(String str) {
        if (str == null) {
            str = "";
        }
        this.f189b = str;
    }

    /* renamed from: c */
    public void m39806c(String str) {
        if (str == null) {
            str = "";
        }
        this.f190c = str;
    }

    /* renamed from: d */
    public void m39805d(String str) {
        if (str == null) {
            str = "";
        }
        this.f191d = str;
    }
}
