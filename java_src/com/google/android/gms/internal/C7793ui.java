package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
@aaa
/* renamed from: com.google.android.gms.internal.ui */
/* loaded from: classes.dex */
public class C7793ui {
    @Nullable
    /* renamed from: a */
    public C7791uh m13453a(@Nullable C7790ug c7790ug) {
        if (c7790ug == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        }
        if (!c7790ug.m13467a()) {
            abr.m18409e("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (c7790ug.m13465c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else {
            if (!TextUtils.isEmpty(c7790ug.m13464d())) {
                return new C7791uh(c7790ug.m13465c(), c7790ug.m13464d(), c7790ug.m13466b(), c7790ug.m13463e());
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
