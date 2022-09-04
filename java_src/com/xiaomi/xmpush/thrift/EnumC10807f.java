package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.f */
/* loaded from: classes2.dex */
public enum EnumC10807f {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: c */
    private final int f34259c;

    EnumC10807f(int i) {
        this.f34259c = i;
    }

    /* renamed from: a */
    public static EnumC10807f m3435a(int i) {
        switch (i) {
            case 1:
                return MISC_CONFIG;
            case 2:
                return PLUGIN_CONFIG;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public int m3436a() {
        return this.f34259c;
    }
}
