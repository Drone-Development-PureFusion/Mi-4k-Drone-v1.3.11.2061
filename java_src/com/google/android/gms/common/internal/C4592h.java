package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.internal.AbstractC4580aj;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.common.internal.h */
/* loaded from: classes.dex */
public final class C4592h extends AbstractC4175h<AbstractC4580aj> {

    /* renamed from: a */
    private static final C4592h f17044a = new C4592h();

    private C4592h() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m23606a(Context context, int i, int i2) {
        return f17044a.m23604b(context, i, i2);
    }

    /* renamed from: b */
    private View m23604b(Context context, int i, int i2) {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) BinderC4173f.m25294a(b(context).mo23643a(BinderC4173f.m25293a(context), signInButtonConfig));
        } catch (Exception e) {
            throw new AbstractC4175h.C4176a(new StringBuilder(64).append("Could not get button with size ").append(i).append(" and color ").append(i2).toString(), e);
        }
    }

    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC4580aj mo9613b(IBinder iBinder) {
        return AbstractC4580aj.AbstractBinderC4581a.m23645a(iBinder);
    }
}
