package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.ji */
/* loaded from: classes2.dex */
public class C7248ji {

    /* renamed from: a */
    public static final C7248ji f24327a;

    /* renamed from: b */
    public static final C7248ji f24328b;

    /* renamed from: c */
    static final /* synthetic */ boolean f24329c;

    /* renamed from: d */
    private final EnumC7249a f24330d;

    /* renamed from: e */
    private final C7293kf f24331e;

    /* renamed from: f */
    private final boolean f24332f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ji$a */
    /* loaded from: classes2.dex */
    public enum EnumC7249a {
        User,
        Server
    }

    static {
        f24329c = !C7248ji.class.desiredAssertionStatus();
        f24327a = new C7248ji(EnumC7249a.User, null, false);
        f24328b = new C7248ji(EnumC7249a.Server, null, false);
    }

    public C7248ji(EnumC7249a enumC7249a, C7293kf c7293kf, boolean z) {
        this.f24330d = enumC7249a;
        this.f24331e = c7293kf;
        this.f24332f = z;
        if (f24329c || !z || m15094b()) {
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static C7248ji m15095a(C7293kf c7293kf) {
        return new C7248ji(EnumC7249a.Server, c7293kf, true);
    }

    /* renamed from: a */
    public boolean m15096a() {
        return this.f24330d == EnumC7249a.User;
    }

    /* renamed from: b */
    public boolean m15094b() {
        return this.f24330d == EnumC7249a.Server;
    }

    /* renamed from: c */
    public boolean m15093c() {
        return this.f24332f;
    }

    /* renamed from: d */
    public C7293kf m15092d() {
        return this.f24331e;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f24330d);
        String valueOf2 = String.valueOf(this.f24331e);
        return new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length()).append("OperationSource{source=").append(valueOf).append(", queryParams=").append(valueOf2).append(", tagged=").append(this.f24332f).append("}").toString();
    }
}
