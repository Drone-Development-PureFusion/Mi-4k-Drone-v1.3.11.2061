package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.k */
/* loaded from: classes2.dex */
public enum EnumC10814k {
    Circle(0),
    Polygon(1);
    

    /* renamed from: c */
    private final int f34332c;

    EnumC10814k(int i) {
        this.f34332c = i;
    }

    /* renamed from: a */
    public static EnumC10814k m3379a(int i) {
        switch (i) {
            case 0:
                return Circle;
            case 1:
                return Polygon;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public int m3380a() {
        return this.f34332c;
    }
}
