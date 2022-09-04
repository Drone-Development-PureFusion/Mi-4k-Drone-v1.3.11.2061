package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.plus.C8954e;
import com.tencent.tauth.AuthActivity;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.vr */
/* loaded from: classes.dex */
public final class C7859vr implements AbstractC7877vt {
    /* renamed from: a */
    private long m13318a(long j) {
        return (j - C3779u.m26884k().mo16434a()) + C3779u.m26884k().mo16432b();
    }

    /* renamed from: b */
    private void m13317b(acy acyVar, Map<String, String> map) {
        String str = map.get(C8954e.f28488i);
        String str2 = map.get("start_label");
        String str3 = map.get("timestamp");
        if (TextUtils.isEmpty(str)) {
            abr.d("No label given for CSI tick.");
        } else if (TextUtils.isEmpty(str3)) {
            abr.d("No timestamp given for CSI tick.");
        } else {
            try {
                long m13318a = m13318a(Long.parseLong(str3));
                if (TextUtils.isEmpty(str2)) {
                    str2 = "native:view_load";
                }
                acyVar.mo18071y().m13440a(str, str2, m13318a);
            } catch (NumberFormatException e) {
                abr.d("Malformed timestamp for CSI tick.", e);
            }
        }
    }

    /* renamed from: c */
    private void m13316c(acy acyVar, Map<String, String> map) {
        String str = map.get("value");
        if (TextUtils.isEmpty(str)) {
            abr.d("No value given for CSI experiment.");
            return;
        }
        C7801un m13442a = acyVar.mo18071y().m13442a();
        if (m13442a == null) {
            abr.d("No ticker for WebView, dropping experiment ID.");
        } else {
            m13442a.m13433a("e", str);
        }
    }

    /* renamed from: d */
    private void m13315d(acy acyVar, Map<String, String> map) {
        String str = map.get("name");
        String str2 = map.get("value");
        if (TextUtils.isEmpty(str2)) {
            abr.d("No value given for CSI extra.");
        } else if (TextUtils.isEmpty(str)) {
            abr.d("No name given for CSI extra.");
        } else {
            C7801un m13442a = acyVar.mo18071y().m13442a();
            if (m13442a == null) {
                abr.d("No ticker for WebView, dropping extra parameter.");
            } else {
                m13442a.m13433a(str, str2);
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        String str = map.get(AuthActivity.ACTION_KEY);
        if ("tick".equals(str)) {
            m13317b(acyVar, map);
        } else if ("experiment".equals(str)) {
            m13316c(acyVar, map);
        } else if (!"extra".equals(str)) {
        } else {
            m13315d(acyVar, map);
        }
    }
}
