package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.AbstractC9746t;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import java.util.List;
/* renamed from: com.google.android.gms.internal.gp */
/* loaded from: classes2.dex */
public class C7047gp implements AbstractC9746t {

    /* renamed from: a */
    private List<String> f23803a;

    public C7047gp(@NonNull CreateAuthUriResponse createAuthUriResponse) {
        C4588d.m23627a(createAuthUriResponse);
        this.f23803a = createAuthUriResponse.m7343f();
    }

    @Override // com.google.firebase.auth.AbstractC9746t
    @Nullable
    /* renamed from: a */
    public List<String> mo7239a() {
        return this.f23803a;
    }
}
