package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
/* renamed from: com.google.android.gms.auth.api.credentials.internal.c */
/* loaded from: classes2.dex */
public final class C4014c {
    /* renamed from: a */
    public static Intent m25743a(Context context, HintRequest hintRequest, PasswordSpecification passwordSpecification) {
        return new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("com.google.android.gms.credentials.RequestType", "Hints").putExtra("com.google.android.gms.credentials.HintRequest", hintRequest).putExtra("com.google.android.gms.credentials.PasswordSpecification", passwordSpecification);
    }
}
