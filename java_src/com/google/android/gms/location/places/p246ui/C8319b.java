package com.google.android.gms.location.places.p246ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.p246ui.AbstractC8322d;
import com.google.android.gms.maps.model.LatLngBounds;
/* renamed from: com.google.android.gms.location.places.ui.b */
/* loaded from: classes.dex */
public class C8319b extends AbstractC8322d {

    /* renamed from: a */
    public static final int f27212a = 2;

    /* renamed from: com.google.android.gms.location.places.ui.b$a */
    /* loaded from: classes2.dex */
    public static class C8320a extends AbstractC8322d.AbstractC8323a {
        public C8320a() {
            super("com.google.android.gms.location.places.ui.PICK_PLACE");
            this.f27214a.putExtra("gmscore_client_jar_version", C4515b.f16876a);
        }

        @Override // com.google.android.gms.location.places.p246ui.AbstractC8322d.AbstractC8323a
        /* renamed from: a */
        public Intent mo12064a(Activity activity) {
            return super.mo12064a(activity);
        }

        /* renamed from: a */
        public C8320a m12069a(LatLngBounds latLngBounds) {
            C4588d.m23627a(latLngBounds);
            C4631c.m23443a(latLngBounds, this.f27214a, "latlng_bounds");
            return this;
        }
    }

    private C8319b() {
    }

    /* renamed from: a */
    public static AbstractC8240d m12073a(Context context, Intent intent) {
        return AbstractC8322d.m12066c(context, intent);
    }

    @Deprecated
    /* renamed from: a */
    public static AbstractC8240d m12071a(Intent intent, Context context) {
        return AbstractC8322d.m12066c(context, intent);
    }

    @Deprecated
    /* renamed from: a */
    public static String m12072a(Intent intent) {
        return intent.getStringExtra("third_party_attributions");
    }

    /* renamed from: b */
    public static LatLngBounds m12070b(Intent intent) {
        return (LatLngBounds) C4631c.m23445a(intent, "final_latlng_bounds", LatLngBounds.CREATOR);
    }
}
