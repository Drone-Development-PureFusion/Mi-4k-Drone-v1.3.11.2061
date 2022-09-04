package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.AbstractC8079yx;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.d */
/* loaded from: classes.dex */
public class BinderC3687d extends AbstractC8079yx.AbstractBinderC8080a {

    /* renamed from: a */
    private String f14419a;

    /* renamed from: b */
    private Context f14420b;

    /* renamed from: c */
    private String f14421c;

    /* renamed from: d */
    private ArrayList<String> f14422d;

    public BinderC3687d(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.f14421c = str;
        this.f14422d = arrayList;
        this.f14419a = str2;
        this.f14420b = context;
    }

    /* renamed from: a */
    protected int m27096a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        return i == 4 ? 3 : 0;
    }

    @Override // com.google.android.gms.internal.AbstractC8079yx
    /* renamed from: a */
    public String mo12854a() {
        return this.f14421c;
    }

    /* renamed from: b */
    Map<String, String> m27095b() {
        String packageName = this.f14420b.getPackageName();
        String str = "";
        try {
            str = this.f14420b.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            abr.d("Error to retrieve app version", e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - C3779u.m26886i().m18444d().m18427a();
        HashMap hashMap = new HashMap();
        hashMap.put("sessionid", C3779u.m26886i().m18464a());
        hashMap.put("appid", packageName);
        hashMap.put("osversion", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdkversion", this.f14419a);
        hashMap.put("appversion", str);
        hashMap.put("timestamp", String.valueOf(elapsedRealtime));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC8079yx
    /* renamed from: b */
    public void mo12853b(int i) {
        if (i == 1) {
            m27094c();
        }
        Map<String, String> m27095b = m27095b();
        m27095b.put("status", String.valueOf(i));
        m27095b.put("sku", this.f14421c);
        LinkedList linkedList = new LinkedList();
        Iterator<String> it2 = this.f14422d.iterator();
        while (it2.hasNext()) {
            linkedList.add(C3779u.m26890e().m18346a(it2.next(), m27095b));
        }
        C3779u.m26890e().m18368a(this.f14420b, this.f14419a, linkedList);
    }

    /* renamed from: c */
    void m27094c() {
        try {
            this.f14420b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", Context.class, String.class, String.class, Boolean.TYPE).invoke(null, this.f14420b, this.f14421c, "", true);
        } catch (ClassNotFoundException e) {
            abr.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            abr.d("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Exception e3) {
            abr.d("Fail to report a conversion.", e3);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC8079yx
    /* renamed from: c */
    public void mo12852c(int i) {
        if (i == 0) {
            m27094c();
        }
        Map<String, String> m27095b = m27095b();
        m27095b.put("google_play_status", String.valueOf(i));
        m27095b.put("sku", this.f14421c);
        m27095b.put("status", String.valueOf(m27096a(i)));
        LinkedList linkedList = new LinkedList();
        Iterator<String> it2 = this.f14422d.iterator();
        while (it2.hasNext()) {
            linkedList.add(C3779u.m26890e().m18346a(it2.next(), m27095b));
        }
        C3779u.m26890e().m18368a(this.f14420b, this.f14419a, linkedList);
    }
}
