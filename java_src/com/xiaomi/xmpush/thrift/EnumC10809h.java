package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.h */
/* loaded from: classes2.dex */
public enum EnumC10809h {
    Baidu(0),
    Tencent(1),
    AutoNavi(2),
    Google(3),
    GPS(4);
    

    /* renamed from: f */
    private final int f34272f;

    EnumC10809h(int i) {
        this.f34272f = i;
    }

    /* renamed from: a */
    public static EnumC10809h m3432a(int i) {
        switch (i) {
            case 0:
                return Baidu;
            case 1:
                return Tencent;
            case 2:
                return AutoNavi;
            case 3:
                return Google;
            case 4:
                return GPS;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public int m3433a() {
        return this.f34272f;
    }
}
