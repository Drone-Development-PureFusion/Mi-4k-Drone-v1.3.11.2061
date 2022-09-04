package com.xiaomi.channel.commonutils.misc;
/* renamed from: com.xiaomi.channel.commonutils.misc.a */
/* loaded from: classes.dex */
public class C10405a {

    /* renamed from: a */
    public static final String f32335a;

    /* renamed from: b */
    public static final boolean f32336b;

    /* renamed from: c */
    public static final boolean f32337c;

    /* renamed from: d */
    public static final boolean f32338d;

    /* renamed from: e */
    public static final boolean f32339e;

    /* renamed from: f */
    public static boolean f32340f;

    /* renamed from: g */
    public static final boolean f32341g;

    /* renamed from: h */
    public static final boolean f32342h;

    /* renamed from: i */
    private static int f32343i;

    static {
        boolean z = false;
        f32335a = C10407c.f32344a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f32336b = f32335a.contains("2A2FE0D7");
        f32337c = f32336b || "DEBUG".equalsIgnoreCase(f32335a);
        f32338d = "LOGABLE".equalsIgnoreCase(f32335a);
        f32339e = f32335a.contains("YY");
        f32340f = f32335a.equalsIgnoreCase("TEST");
        f32341g = "BETA".equalsIgnoreCase(f32335a);
        if (f32335a != null && f32335a.startsWith("RC")) {
            z = true;
        }
        f32342h = z;
        f32343i = 1;
        if (f32335a.equalsIgnoreCase("SANDBOX")) {
            f32343i = 2;
        } else if (f32335a.equalsIgnoreCase("ONEBOX")) {
            f32343i = 3;
        } else {
            f32343i = 1;
        }
    }

    /* renamed from: a */
    public static void m5261a(int i) {
        f32343i = i;
    }

    /* renamed from: a */
    public static boolean m5262a() {
        return f32343i == 2;
    }

    /* renamed from: b */
    public static boolean m5260b() {
        return f32343i == 3;
    }

    /* renamed from: c */
    public static int m5259c() {
        return f32343i;
    }
}
