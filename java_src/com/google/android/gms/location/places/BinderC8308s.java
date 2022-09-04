package com.google.android.gms.location.places;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.BinderC8327y;
import com.google.android.gms.location.places.internal.AbstractC8266h;
/* renamed from: com.google.android.gms.location.places.s */
/* loaded from: classes2.dex */
public class BinderC8308s extends AbstractC8266h.AbstractBinderC8267a {

    /* renamed from: a */
    private final AbstractC8310b f27189a;

    /* renamed from: b */
    private final AbstractC8309a f27190b;

    /* renamed from: com.google.android.gms.location.places.s$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8309a<A extends C4467a.AbstractC4477f> extends BinderC8327y.AbstractC8329b<PlacePhotoResult, A> {
        public AbstractC8309a(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public PlacePhotoResult mo7807b(Status status) {
            return new PlacePhotoResult(status, null);
        }
    }

    /* renamed from: com.google.android.gms.location.places.s$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8310b<A extends C4467a.AbstractC4477f> extends BinderC8327y.AbstractC8329b<PlacePhotoMetadataResult, A> {
        public AbstractC8310b(C4467a c4467a, AbstractC4489g abstractC4489g) {
            super(c4467a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public PlacePhotoMetadataResult mo7807b(Status status) {
            return new PlacePhotoMetadataResult(status, null);
        }
    }

    public BinderC8308s(AbstractC8309a abstractC8309a) {
        this.f27189a = null;
        this.f27190b = abstractC8309a;
    }

    public BinderC8308s(AbstractC8310b abstractC8310b) {
        this.f27189a = abstractC8310b;
        this.f27190b = null;
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8266h
    /* renamed from: a */
    public void mo12107a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.f27189a.b((AbstractC8310b) placePhotoMetadataResult);
    }

    @Override // com.google.android.gms.location.places.internal.AbstractC8266h
    /* renamed from: a */
    public void mo12106a(PlacePhotoResult placePhotoResult) {
        this.f27190b.b((AbstractC8309a) placePhotoResult);
    }
}
