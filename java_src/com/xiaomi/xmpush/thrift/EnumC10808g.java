package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.g */
/* loaded from: classes2.dex */
public enum EnumC10808g {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);
    

    /* renamed from: e */
    private final int f34265e;

    EnumC10808g(int i) {
        this.f34265e = i;
    }

    /* renamed from: a */
    public static EnumC10808g m3434a(int i) {
        switch (i) {
            case 1:
                return INT;
            case 2:
                return LONG;
            case 3:
                return STRING;
            case 4:
                return BOOLEAN;
            default:
                return null;
        }
    }
}
