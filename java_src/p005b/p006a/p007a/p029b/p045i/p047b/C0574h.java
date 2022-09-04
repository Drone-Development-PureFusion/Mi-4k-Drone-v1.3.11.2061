package p005b.p006a.p007a.p029b.p045i.p047b;
/* renamed from: b.a.a.b.i.b.h */
/* loaded from: classes.dex */
class C0574h {

    /* renamed from: a */
    static final int f971a = 37;

    /* renamed from: b */
    static final int f972b = 41;

    /* renamed from: c */
    static final int f973c = 45;

    /* renamed from: d */
    static final int f974d = 46;

    /* renamed from: e */
    static final int f975e = 123;

    /* renamed from: f */
    static final int f976f = 125;

    /* renamed from: g */
    static final int f977g = 1000;

    /* renamed from: h */
    static final int f978h = 1002;

    /* renamed from: i */
    static final int f979i = 1004;

    /* renamed from: j */
    static final int f980j = 1005;

    /* renamed from: k */
    static final int f981k = 1006;

    /* renamed from: l */
    static final int f982l = Integer.MAX_VALUE;

    /* renamed from: m */
    static C0574h f983m = new C0574h(Integer.MAX_VALUE, "EOF");

    /* renamed from: n */
    static C0574h f984n = new C0574h(41);

    /* renamed from: o */
    static C0574h f985o = new C0574h(1005, "BARE");

    /* renamed from: p */
    static C0574h f986p = new C0574h(37);

    /* renamed from: q */
    private final int f987q;

    /* renamed from: r */
    private final Object f988r;

    public C0574h(int i) {
        this(i, null);
    }

    public C0574h(int i, Object obj) {
        this.f987q = i;
        this.f988r = obj;
    }

    /* renamed from: a */
    public int m38828a() {
        return this.f987q;
    }

    /* renamed from: b */
    public Object m38827b() {
        return this.f988r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0574h)) {
            return false;
        }
        C0574h c0574h = (C0574h) obj;
        if (this.f987q != c0574h.f987q) {
            return false;
        }
        if (this.f988r != null) {
            if (this.f988r.equals(c0574h.f988r)) {
                return true;
            }
        } else if (c0574h.f988r == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f988r != null ? this.f988r.hashCode() : 0) + (this.f987q * 29);
    }

    public String toString() {
        String str;
        switch (this.f987q) {
            case 37:
                str = "%";
                break;
            case 41:
                str = "RIGHT_PARENTHESIS";
                break;
            case 1000:
                str = "LITERAL";
                break;
            case 1002:
                str = "FormatModifier";
                break;
            case 1004:
                str = "SIMPLE_KEYWORD";
                break;
            case 1005:
                str = "COMPOSITE_KEYWORD";
                break;
            case 1006:
                str = "OPTION";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return this.f988r == null ? "Token(" + str + ")" : "Token(" + str + ", \"" + this.f988r + "\")";
    }
}
