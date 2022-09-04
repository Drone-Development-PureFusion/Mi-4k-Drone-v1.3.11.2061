package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7877vt;
import com.google.android.gms.internal.AbstractC7980wy;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.C7957wx;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abk;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.acr;
import com.google.android.gms.internal.acy;
import java.util.Map;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.g */
/* loaded from: classes.dex */
public class C3619g {

    /* renamed from: c */
    private Context f14175c;

    /* renamed from: b */
    private final Object f14174b = new Object();

    /* renamed from: a */
    public final AbstractC7877vt f14173a = new AbstractC7877vt() { // from class: com.google.android.gms.ads.internal.g.1
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            acyVar.b("/appSettingsFetched", this);
            synchronized (C3619g.this.f14174b) {
                if (map != null) {
                    if ("true".equalsIgnoreCase(map.get("isSuccessful"))) {
                        C3779u.m26886i().m18458a(C3619g.this.f14175c, map.get("appSettingsJson"));
                    }
                }
            }
        }
    };

    /* renamed from: a */
    private static boolean m27340a(@Nullable abk abkVar) {
        if (abkVar == null) {
            return true;
        }
        return (((C3779u.m26884k().mo16434a() - abkVar.m18471a()) > C7788uf.f25865cf.m13486c().longValue() ? 1 : ((C3779u.m26884k().mo16434a() - abkVar.m18471a()) == C7788uf.f25865cf.m13486c().longValue() ? 0 : -1)) > 0) || !abkVar.m18468b();
    }

    /* renamed from: a */
    public void m27342a(final Context context, VersionInfoParcel versionInfoParcel, final boolean z, @Nullable abk abkVar, final String str, @Nullable final String str2) {
        if (!m27340a(abkVar)) {
            return;
        }
        if (context == null) {
            abr.d("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            abr.d("App settings could not be fetched. Required parameters missing");
        } else {
            this.f14175c = context;
            final C7957wx m18374a = C3779u.m26890e().m18374a(context, versionInfoParcel);
            abv.f21039a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.g.2
                @Override // java.lang.Runnable
                public void run() {
                    m18374a.m13150a().a(new acr.AbstractC6193c<AbstractC7980wy>() { // from class: com.google.android.gms.ads.internal.g.2.1
                        @Override // com.google.android.gms.internal.acr.AbstractC6193c
                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void mo12764a(AbstractC7980wy abstractC7980wy) {
                            abstractC7980wy.mo13113a("/appSettingsFetched", C3619g.this.f14173a);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (!TextUtils.isEmpty(str)) {
                                    jSONObject.put("app_id", str);
                                } else if (!TextUtils.isEmpty(str2)) {
                                    jSONObject.put("ad_unit_id", str2);
                                }
                                jSONObject.put("is_init", z);
                                jSONObject.put("pn", context.getPackageName());
                                abstractC7980wy.mo13111a("AFMA_fetchAppSettings", jSONObject);
                            } catch (Exception e) {
                                abstractC7980wy.mo13110b("/appSettingsFetched", C3619g.this.f14173a);
                                abr.b("Error requesting application settings", e);
                            }
                        }
                    }, new acr.C6192b());
                }
            });
        }
    }
}
