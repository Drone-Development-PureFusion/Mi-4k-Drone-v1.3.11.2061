package com.google.ads.mediation;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.ads.mediation.AbstractC3794c;
import com.google.android.gms.ads.mediation.AbstractC3808e;
import com.google.android.gms.ads.mediation.AbstractC3810g;
@Keep
/* loaded from: classes2.dex */
public final class AdUrlAdapter extends AbstractC3396a implements AbstractC3794c, AbstractC3808e, AbstractC3810g {
    @Override // com.google.ads.mediation.AbstractC3396a
    public String getAdUnitId(Bundle bundle) {
        return "adurl";
    }

    @Override // com.google.ads.mediation.AbstractC3396a
    protected Bundle zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
