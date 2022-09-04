package com.google.android.gms.nearby;

import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.internal.amy;
import com.google.android.gms.internal.ang;
import com.google.android.gms.nearby.bootstrap.AbstractC8745a;
import com.google.android.gms.nearby.connection.AbstractC8755a;
import com.google.android.gms.nearby.connection.dev.AbstractC8767d;
import com.google.android.gms.nearby.internal.connection.dev.C8790l;
import com.google.android.gms.nearby.messages.AbstractC8834f;
import com.google.android.gms.nearby.messages.AbstractC8913q;
import com.google.android.gms.nearby.messages.C8835g;
import com.google.android.gms.nearby.messages.internal.C8884t;
import com.google.android.gms.nearby.messages.internal.C8896u;
/* renamed from: com.google.android.gms.nearby.a */
/* loaded from: classes2.dex */
public final class C8744a {

    /* renamed from: a */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f27992a = new C4467a<>("Nearby.CONNECTIONS_API", ang.f22454b, ang.f22453a);

    /* renamed from: b */
    public static final AbstractC8755a f27993b = new ang();

    /* renamed from: c */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f27994c = new C4467a<>("Nearby.CONNECTIONS_DEV_API", C8790l.f28156b, C8790l.f28155a);

    /* renamed from: d */
    public static final AbstractC8767d f27995d = new C8790l();

    /* renamed from: e */
    public static final C4467a<C8835g> f27996e = new C4467a<>("Nearby.MESSAGES_API", C8884t.f28356b, C8884t.f28355a);

    /* renamed from: f */
    public static final AbstractC8834f f27997f = new C8884t();

    /* renamed from: g */
    public static final AbstractC8913q f27998g = new C8896u();

    /* renamed from: h */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f27999h = new C4467a<>("Nearby.BOOTSTRAP_API", amy.f22413b, amy.f22412a);

    /* renamed from: i */
    public static final AbstractC8745a f28000i = new amy();

    private C8744a() {
    }
}
