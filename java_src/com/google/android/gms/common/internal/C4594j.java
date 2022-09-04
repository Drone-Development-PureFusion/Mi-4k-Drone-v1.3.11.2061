package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.C3424R;
/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes2.dex */
public class C4594j {

    /* renamed from: a */
    private final Resources f17046a;

    /* renamed from: b */
    private final String f17047b;

    public C4594j(Context context) {
        C4588d.m23627a(context);
        this.f17046a = context.getResources();
        this.f17047b = this.f17046a.getResourcePackageName(C3424R.C3427string.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String m23602a(String str) {
        int identifier = this.f17046a.getIdentifier(str, "string", this.f17047b);
        if (identifier == 0) {
            return null;
        }
        return this.f17046a.getString(identifier);
    }
}
