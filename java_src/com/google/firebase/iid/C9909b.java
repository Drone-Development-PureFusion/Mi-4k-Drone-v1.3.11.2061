package com.google.firebase.iid;

import android.support.annotation.Nullable;
/* renamed from: com.google.firebase.iid.b */
/* loaded from: classes2.dex */
public class C9909b {

    /* renamed from: a */
    private final FirebaseInstanceId f30803a;

    private C9909b(FirebaseInstanceId firebaseInstanceId) {
        this.f30803a = firebaseInstanceId;
    }

    /* renamed from: a */
    public static C9909b m6576a() {
        return new C9909b(FirebaseInstanceId.m6622a());
    }

    /* renamed from: b */
    public String m6575b() {
        return this.f30803a.m6611c();
    }

    @Nullable
    /* renamed from: c */
    public String m6574c() {
        return this.f30803a.m6605f();
    }
}
