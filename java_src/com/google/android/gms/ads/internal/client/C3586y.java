package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.search.C3825b;
import com.google.android.gms.internal.aaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
@aaa
/* renamed from: com.google.android.gms.ads.internal.client.y */
/* loaded from: classes.dex */
public class C3586y {

    /* renamed from: a */
    public static final C3586y f14056a = new C3586y();

    protected C3586y() {
    }

    /* renamed from: a */
    public static C3586y m27414a() {
        return f14056a;
    }

    /* renamed from: a */
    public AdRequestParcel m27413a(Context context, C3559e c3559e) {
        Date m27559a = c3559e.m27559a();
        long time = m27559a != null ? m27559a.getTime() : -1L;
        String m27556b = c3559e.m27556b();
        int m27554c = c3559e.m27554c();
        Set<String> m27552d = c3559e.m27552d();
        List unmodifiableList = !m27552d.isEmpty() ? Collections.unmodifiableList(new ArrayList(m27552d)) : null;
        boolean m27558a = c3559e.m27558a(context);
        int m27544l = c3559e.m27544l();
        Location m27551e = c3559e.m27551e();
        Bundle m27555b = c3559e.m27555b(AdMobAdapter.class);
        boolean m27550f = c3559e.m27550f();
        String m27549g = c3559e.m27549g();
        C3825b m27547i = c3559e.m27547i();
        SearchAdRequestParcel searchAdRequestParcel = m27547i != null ? new SearchAdRequestParcel(m27547i) : null;
        String str = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            str = C3514ac.m27586a().m26855a(Thread.currentThread().getStackTrace(), applicationContext.getPackageName());
        }
        return new AdRequestParcel(7, time, m27555b, m27554c, unmodifiableList, m27558a, m27544l, m27550f, m27549g, searchAdRequestParcel, m27551e, m27556b, c3559e.m27545k(), c3559e.m27543m(), Collections.unmodifiableList(new ArrayList(c3559e.m27542n())), c3559e.m27548h(), str, c3559e.m27541o());
    }

    /* renamed from: a */
    public RewardedVideoAdRequestParcel m27412a(Context context, C3559e c3559e, String str) {
        return new RewardedVideoAdRequestParcel(m27413a(context, c3559e), str);
    }
}
