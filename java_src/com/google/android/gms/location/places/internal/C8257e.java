package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.BinderC8308s;
import com.google.android.gms.location.places.BinderC8327y;
import com.google.android.gms.location.places.C8292m;
import com.google.android.gms.location.places.internal.AbstractC8263g;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;
/* renamed from: com.google.android.gms.location.places.internal.e */
/* loaded from: classes2.dex */
public class C8257e extends AbstractC4638w<AbstractC8263g> {

    /* renamed from: a */
    private final PlacesParams f27130a;

    /* renamed from: e */
    private final Locale f27131e;

    /* renamed from: com.google.android.gms.location.places.internal.e$a */
    /* loaded from: classes2.dex */
    public static class C8259a extends C4467a.AbstractC4473b<C8257e, C8292m> {
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8257e mo7438a(Context context, Looper looper, C4626s c4626s, C8292m c8292m, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            C8292m m12149a = c8292m == null ? new C8292m.C8294a().m12149a() : c8292m;
            String packageName = context.getPackageName();
            if (m12149a.f27161a != null) {
                packageName = m12149a.f27161a;
            }
            return new C8257e(context, looper, c4626s, abstractC4491b, abstractC4492c, packageName, m12149a);
        }
    }

    private C8257e(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, String str, C8292m c8292m) {
        super(context, looper, 65, c4626s, abstractC4491b, abstractC4492c);
        this.f27131e = Locale.getDefault();
        this.f27130a = new PlacesParams(str, this.f27131e, c4626s.m23533b() != null ? c4626s.m23533b().name : null, c8292m.f27162b, c8292m.f27163c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC8263g mo7440b(IBinder iBinder) {
        return AbstractC8263g.AbstractBinderC8264a.m12240a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    /* renamed from: a */
    public void m12253a(BinderC8308s binderC8308s, String str) {
        C4588d.m23626a(str, (Object) "placeId cannot be null");
        ((AbstractC8263g) G()).mo12225a(str, this.f27130a, binderC8308s);
    }

    /* renamed from: a */
    public void m12252a(BinderC8308s binderC8308s, String str, int i, int i2, int i3) {
        boolean z = true;
        C4588d.m23626a(str, (Object) "fifeUrl cannot be null");
        C4588d.m23618b(i > 0, "width should be > 0");
        if (i <= 0) {
            z = false;
        }
        C4588d.m23618b(z, "height should be > 0");
        ((AbstractC8263g) G()).mo12227a(str, i, i2, i3, this.f27130a, binderC8308s);
    }

    /* renamed from: a */
    public void m12251a(BinderC8327y binderC8327y, AddPlaceRequest addPlaceRequest) {
        C4588d.m23626a(addPlaceRequest, "userAddedPlace == null");
        ((AbstractC8263g) G()).mo12239a(addPlaceRequest, this.f27130a, binderC8327y);
    }

    /* renamed from: a */
    public void m12250a(BinderC8327y binderC8327y, String str, @Nullable LatLngBounds latLngBounds, @Nullable AutocompleteFilter autocompleteFilter) {
        C4588d.m23626a(binderC8327y, "callback == null");
        ((AbstractC8263g) G()).mo12223a(str == null ? "" : str, latLngBounds, autocompleteFilter == null ? new AutocompleteFilter.C8234a().m12358a() : autocompleteFilter, this.f27130a, binderC8327y);
    }

    /* renamed from: a */
    public void m12249a(BinderC8327y binderC8327y, List<String> list) {
        ((AbstractC8263g) G()).mo12217b(list, this.f27130a, binderC8327y);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }
}
