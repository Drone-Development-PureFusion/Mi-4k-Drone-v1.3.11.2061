package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.internal.sy */
/* loaded from: classes2.dex */
public final class C7718sy {

    /* renamed from: a */
    private final AbstractC7723tc f25571a;

    public C7718sy(String str, Context context, boolean z) {
        this.f25571a = C7722tb.m13654a(str, context, z);
    }

    /* renamed from: a */
    public Uri m13659a(Uri uri, Context context) {
        AbstractC4170e mo13649a = this.f25571a.mo13649a(BinderC4173f.m25293a(uri), BinderC4173f.m25293a(context));
        if (mo13649a == null) {
            throw new C7719sz();
        }
        return (Uri) BinderC4173f.m25294a(mo13649a);
    }

    /* renamed from: a */
    public void m13658a(MotionEvent motionEvent) {
        this.f25571a.mo13641d(BinderC4173f.m25293a(motionEvent));
    }

    /* renamed from: b */
    public Uri m13657b(Uri uri, Context context) {
        AbstractC4170e mo13643b = this.f25571a.mo13643b(BinderC4173f.m25293a(uri), BinderC4173f.m25293a(context));
        if (mo13643b == null) {
            throw new C7719sz();
        }
        return (Uri) BinderC4173f.m25294a(mo13643b);
    }
}
