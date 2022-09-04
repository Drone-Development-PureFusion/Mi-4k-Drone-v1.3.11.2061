package com.google.android.gms.tagmanager;

import android.text.TextUtils;
/* renamed from: com.google.android.gms.tagmanager.z */
/* loaded from: classes2.dex */
class C9235z {

    /* renamed from: a */
    private final long f29075a;

    /* renamed from: b */
    private final long f29076b;

    /* renamed from: c */
    private final long f29077c;

    /* renamed from: d */
    private String f29078d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9235z(long j, long j2, long j3) {
        this.f29075a = j;
        this.f29076b = j2;
        this.f29077c = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m8869a() {
        return this.f29075a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8868a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.f29078d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m8867b() {
        return this.f29077c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m8866c() {
        return this.f29078d;
    }
}
