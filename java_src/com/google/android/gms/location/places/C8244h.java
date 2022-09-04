package com.google.android.gms.location.places;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractC4521a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.location.places.internal.C8280n;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.Comparator;
/* renamed from: com.google.android.gms.location.places.h */
/* loaded from: classes2.dex */
public class C8244h extends AbstractC4521a<AbstractC8243g> implements AbstractC4502m {

    /* renamed from: b */
    private static final Comparator<PlaceLikelihoodEntity> f27047b = new Comparator<PlaceLikelihoodEntity>() { // from class: com.google.android.gms.location.places.h.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(PlaceLikelihoodEntity placeLikelihoodEntity, PlaceLikelihoodEntity placeLikelihoodEntity2) {
            return -Float.compare(placeLikelihoodEntity.mo12200c(), placeLikelihoodEntity2.mo12200c());
        }
    };

    /* renamed from: c */
    private final String f27048c;

    /* renamed from: d */
    private final int f27049d;

    /* renamed from: e */
    private final Status f27050e;

    /* renamed from: com.google.android.gms.location.places.h$a */
    /* loaded from: classes2.dex */
    public static class C8246a {
        /* renamed from: a */
        static int m12317a(int i) {
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                    return i;
                default:
                    throw new IllegalArgumentException(new StringBuilder(27).append("invalid source: ").append(i).toString());
            }
        }
    }

    public C8244h(DataHolder dataHolder, int i) {
        super(dataHolder);
        this.f27050e = C8295n.m12143c(dataHolder.m23883e());
        this.f27049d = C8246a.m12317a(i);
        if (dataHolder == null || dataHolder.m23881f() == null) {
            this.f27048c = null;
        } else {
            this.f27048c = dataHolder.m23881f().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
        }
    }

    /* renamed from: a */
    public static int m12321a(Bundle bundle) {
        return bundle.getInt("com.google.android.gms.location.places.PlaceLikelihoodBuffer.SOURCE_EXTRA_KEY");
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f27050e;
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: b */
    public AbstractC8243g mo9715a(int i) {
        return new C8280n(this.f16904a, i);
    }

    @Nullable
    /* renamed from: h */
    public CharSequence m12319h() {
        return this.f27048c;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("status", mo7645a()).m23632a("attributions", this.f27048c).toString();
    }
}
