package com.google.android.gms.location.places.p246ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.p246ui.AbstractC8322d;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.firebase.p251a.C9654a;
/* renamed from: com.google.android.gms.location.places.ui.a */
/* loaded from: classes2.dex */
public class C8317a extends AbstractC8322d {

    /* renamed from: a */
    public static final int f27209a = 2;

    /* renamed from: b */
    public static final int f27210b = 1;

    /* renamed from: c */
    public static final int f27211c = 2;

    /* renamed from: com.google.android.gms.location.places.ui.a$a */
    /* loaded from: classes2.dex */
    public static class C8318a extends AbstractC8322d.AbstractC8323a {
        public C8318a(int i) {
            super("com.google.android.gms.location.places.ui.AUTOCOMPLETE");
            this.f27214a.putExtra("gmscore_client_jar_version", C4515b.f16876a);
            this.f27214a.putExtra("mode", i);
            this.f27214a.putExtra(C9654a.C9656b.f30238w, 2);
        }

        @Override // com.google.android.gms.location.places.p246ui.AbstractC8322d.AbstractC8323a
        /* renamed from: a */
        public Intent mo12064a(Activity activity) {
            return super.mo12064a(activity);
        }

        /* renamed from: a */
        public C8318a m12077a(int i) {
            this.f27214a.putExtra(C9654a.C9656b.f30238w, i);
            return this;
        }

        /* renamed from: a */
        public C8318a m12076a(@Nullable AutocompleteFilter autocompleteFilter) {
            if (autocompleteFilter != null) {
                this.f27214a.putExtra("filter", autocompleteFilter);
            } else {
                this.f27214a.removeExtra("filter");
            }
            return this;
        }

        /* renamed from: a */
        public C8318a m12075a(@Nullable LatLngBounds latLngBounds) {
            if (latLngBounds != null) {
                this.f27214a.putExtra("bounds", latLngBounds);
            } else {
                this.f27214a.removeExtra("bounds");
            }
            return this;
        }

        /* renamed from: a */
        public C8318a m12074a(@Nullable String str) {
            if (str != null) {
                this.f27214a.putExtra("initial_query", str);
            } else {
                this.f27214a.removeExtra("initial_query");
            }
            return this;
        }
    }

    private C8317a() {
    }

    /* renamed from: a */
    public static AbstractC8240d m12079a(Context context, Intent intent) {
        return AbstractC8322d.m12066c(context, intent);
    }

    /* renamed from: b */
    public static Status m12078b(Context context, Intent intent) {
        return AbstractC8322d.m12065d(context, intent);
    }
}
