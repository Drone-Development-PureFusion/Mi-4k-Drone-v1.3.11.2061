package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.firebase.p251a.C9654a;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
@aaa
/* renamed from: com.google.android.gms.internal.wq */
/* loaded from: classes.dex */
class C7939wq {

    /* renamed from: a */
    private final Object[] f26114a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7939wq(AdRequestParcel adRequestParcel, String str, int i) {
        this.f26114a = m13208a(adRequestParcel, str, i);
    }

    /* renamed from: a */
    private static String m13209a(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = new TreeSet(bundle.keySet()).iterator();
        while (it2.hasNext()) {
            Object obj = bundle.get((String) it2.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? m13209a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Object[] m13208a(AdRequestParcel adRequestParcel, String str, int i) {
        HashSet hashSet = new HashSet(Arrays.asList(C7788uf.f25792ax.m13486c().split(Constants.ACCEPT_TIME_SEPARATOR_SP)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(adRequestParcel.f13846b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m13209a(adRequestParcel.f13847c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(adRequestParcel.f13848d));
        }
        if (hashSet.contains("keywords")) {
            if (adRequestParcel.f13849e != null) {
                arrayList.add(adRequestParcel.f13849e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.f13850f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(adRequestParcel.f13851g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(adRequestParcel.f13852h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(adRequestParcel.f13853i);
        }
        if (hashSet.contains(C9654a.C9656b.f30231p)) {
            if (adRequestParcel.f13855k != null) {
                arrayList.add(adRequestParcel.f13855k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(adRequestParcel.f13856l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m13209a(adRequestParcel.f13857m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m13209a(adRequestParcel.f13858n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (adRequestParcel.f13859o != null) {
                arrayList.add(adRequestParcel.f13859o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(adRequestParcel.f13860p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(adRequestParcel.f13861q);
        }
        return arrayList.toArray();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7939wq)) {
            return false;
        }
        return Arrays.equals(this.f26114a, ((C7939wq) obj).f26114a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f26114a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f26114a));
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("[InterstitialAdPoolKey ").append(valueOf).append("]").toString();
    }
}
