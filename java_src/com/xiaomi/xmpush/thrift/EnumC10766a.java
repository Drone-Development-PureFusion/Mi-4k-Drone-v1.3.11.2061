package com.xiaomi.xmpush.thrift;
/* renamed from: com.xiaomi.xmpush.thrift.a */
/* loaded from: classes.dex */
public enum EnumC10766a {
    Registration(1),
    UnRegistration(2),
    Subscription(3),
    UnSubscription(4),
    SendMessage(5),
    AckMessage(6),
    SetConfig(7),
    ReportFeedback(8),
    Notification(9),
    Command(10),
    MultiConnectionBroadcast(11),
    MultiConnectionResult(12);
    

    /* renamed from: m */
    private final int f33615m;

    EnumC10766a(int i) {
        this.f33615m = i;
    }

    /* renamed from: a */
    public static EnumC10766a m3771a(int i) {
        switch (i) {
            case 1:
                return Registration;
            case 2:
                return UnRegistration;
            case 3:
                return Subscription;
            case 4:
                return UnSubscription;
            case 5:
                return SendMessage;
            case 6:
                return AckMessage;
            case 7:
                return SetConfig;
            case 8:
                return ReportFeedback;
            case 9:
                return Notification;
            case 10:
                return Command;
            case 11:
                return MultiConnectionBroadcast;
            case 12:
                return MultiConnectionResult;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public int m3772a() {
        return this.f33615m;
    }
}
