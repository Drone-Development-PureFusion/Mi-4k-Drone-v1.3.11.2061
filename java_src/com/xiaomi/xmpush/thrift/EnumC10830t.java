package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.t */
/* loaded from: classes2.dex */
public enum EnumC10830t {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: d */
    private final int f34534d;

    EnumC10830t(int i) {
        this.f34534d = i;
    }

    /* renamed from: a */
    public static EnumC10830t m3256a(int i) {
        switch (i) {
            case 0:
                return RegIdExpired;
            case 1:
                return PackageUnregistered;
            case 2:
                return Init;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public int m3257a() {
        return this.f34534d;
    }
}
