package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.location.places.BinderC8327y;
import com.google.android.gms.location.places.C8292m;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.internal.AbstractC8260f;
import java.util.Locale;
/* renamed from: com.google.android.gms.location.places.internal.k */
/* loaded from: classes2.dex */
public class C8275k extends AbstractC4638w<AbstractC8260f> {

    /* renamed from: a */
    private final PlacesParams f27140a;

    /* renamed from: e */
    private final Locale f27141e;

    /* renamed from: com.google.android.gms.location.places.internal.k$a */
    /* loaded from: classes2.dex */
    public static class C8277a extends C4467a.AbstractC4473b<C8275k, C8292m> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8275k mo7438a(Context context, Looper looper, C4626s c4626s, C8292m c8292m, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            C8292m m12149a = c8292m == null ? new C8292m.C8294a().m12149a() : c8292m;
            String packageName = context.getPackageName();
            if (m12149a.f27161a != null) {
                packageName = m12149a.f27161a;
            }
            return new C8275k(context, looper, c4626s, abstractC4491b, abstractC4492c, packageName, m12149a);
        }
    }

    private C8275k(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, String str, C8292m c8292m) {
        super(context, looper, 67, c4626s, abstractC4491b, abstractC4492c);
        this.f27141e = Locale.getDefault();
        this.f27140a = new PlacesParams(str, this.f27141e, c4626s.m23533b() != null ? c4626s.m23533b().name : null, c8292m.f27162b, c8292m.f27163c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8260f mo7440b(IBinder iBinder) {
        return AbstractC8260f.AbstractBinderC8261a.m12247a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    /* renamed from: a */
    public void m12209a(BinderC8327y binderC8327y, PlaceFilter placeFilter) {
        if (placeFilter == null) {
            placeFilter = PlaceFilter.m12341d();
        }
        ((AbstractC8260f) G()).mo12245a(placeFilter, this.f27140a, binderC8327y);
    }

    /* renamed from: a */
    public void m12208a(BinderC8327y binderC8327y, PlaceReport placeReport) {
        C4588d.m23627a(placeReport);
        ((AbstractC8260f) G()).mo12244a(placeReport, this.f27140a, binderC8327y);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }
}
