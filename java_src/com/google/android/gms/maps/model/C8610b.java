package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8579b;
/* renamed from: com.google.android.gms.maps.model.b */
/* loaded from: classes2.dex */
public final class C8610b {

    /* renamed from: a */
    public static final float f27564a = 0.0f;

    /* renamed from: b */
    public static final float f27565b = 30.0f;

    /* renamed from: c */
    public static final float f27566c = 60.0f;

    /* renamed from: d */
    public static final float f27567d = 120.0f;

    /* renamed from: e */
    public static final float f27568e = 180.0f;

    /* renamed from: f */
    public static final float f27569f = 210.0f;

    /* renamed from: g */
    public static final float f27570g = 240.0f;

    /* renamed from: h */
    public static final float f27571h = 270.0f;

    /* renamed from: i */
    public static final float f27572i = 300.0f;

    /* renamed from: j */
    public static final float f27573j = 330.0f;

    /* renamed from: k */
    private static AbstractC8579b f27574k;

    private C8610b() {
    }

    /* renamed from: a */
    public static C8575a m11088a() {
        try {
            return new C8575a(m11082b().mo11235a());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8575a m11087a(float f) {
        try {
            return new C8575a(m11082b().mo11234a(f));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8575a m11086a(int i) {
        try {
            return new C8575a(m11082b().mo11233a(i));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8575a m11085a(Bitmap bitmap) {
        try {
            return new C8575a(m11082b().mo11232a(bitmap));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8575a m11083a(String str) {
        try {
            return new C8575a(m11082b().mo11231a(str));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static void m11084a(AbstractC8579b abstractC8579b) {
        if (f27574k != null) {
            return;
        }
        f27574k = (AbstractC8579b) C4588d.m23627a(abstractC8579b);
    }

    /* renamed from: b */
    private static AbstractC8579b m11082b() {
        return (AbstractC8579b) C4588d.m23626a(f27574k, "IBitmapDescriptorFactory is not initialized");
    }

    /* renamed from: b */
    public static C8575a m11081b(String str) {
        try {
            return new C8575a(m11082b().mo11230b(str));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public static C8575a m11080c(String str) {
        try {
            return new C8575a(m11082b().mo11229c(str));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
