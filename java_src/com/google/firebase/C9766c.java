package com.google.firebase;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.firebase.c */
/* loaded from: classes.dex */
public class C9766c extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public C9766c() {
    }

    public C9766c(@NonNull String str) {
        super(C4588d.m23624a(str, (Object) "Detail message must not be empty"));
    }

    public C9766c(@NonNull String str, Throwable th) {
        super(C4588d.m23624a(str, (Object) "Detail message must not be empty"), th);
    }
}
