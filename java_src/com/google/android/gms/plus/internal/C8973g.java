package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.p232c.AbstractC4175h;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.plus.C8948d;
import com.google.android.gms.plus.internal.AbstractC8962c;
/* renamed from: com.google.android.gms.plus.internal.g */
/* loaded from: classes2.dex */
public final class C8973g extends AbstractC4175h<AbstractC8962c> {

    /* renamed from: a */
    private static final C8973g f28520a = new C8973g();

    private C8973g() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m9615a(Context context, int i, int i2, String str, int i3) {
        try {
            if (str != null) {
                return (View) BinderC4173f.m25294a(f28520a.b(context).mo9657a(BinderC4173f.m25293a(context), i, i2, str, i3));
            }
            throw new NullPointerException();
        } catch (Exception e) {
            return new C8948d(context, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.p232c.AbstractC4175h
    /* renamed from: a */
    public AbstractC8962c mo9613b(IBinder iBinder) {
        return AbstractC8962c.AbstractBinderC8963a.m9658a(iBinder);
    }
}
