package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes2.dex */
class aoy {

    /* renamed from: a */
    private final long f22675a;

    /* renamed from: b */
    private final long f22676b;

    /* renamed from: c */
    private final long f22677c;

    /* renamed from: d */
    private String f22678d;

    /* renamed from: e */
    private String f22679e;

    /* renamed from: f */
    private Map<String, String> f22680f;

    /* renamed from: g */
    private String f22681g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aoy(long j, long j2, long j3) {
        this.f22675a = j;
        this.f22676b = j2;
        this.f22677c = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m16423a() {
        return this.f22675a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16422a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.f22678d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m16421a(Map<String, String> map) {
        this.f22680f = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m16420b() {
        return this.f22677c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m16419b(String str) {
        this.f22679e = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m16418c() {
        return this.f22678d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m16417c(String str) {
        this.f22681g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m16416d() {
        return this.f22679e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Map<String, String> m16415e() {
        return this.f22680f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public String m16414f() {
        return this.f22681g;
    }
}
