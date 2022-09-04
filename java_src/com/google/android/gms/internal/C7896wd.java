package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.tencent.tauth.AuthActivity;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.wd */
/* loaded from: classes.dex */
public class C7896wd implements AbstractC7877vt {

    /* renamed from: a */
    private final AbstractC7897a f26038a;

    /* renamed from: com.google.android.gms.internal.wd$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7897a {
        /* renamed from: J */
        void mo13275J();

        /* renamed from: b */
        void mo13274b(RewardItemParcel rewardItemParcel);
    }

    public C7896wd(AbstractC7897a abstractC7897a) {
        this.f26038a = abstractC7897a;
    }

    /* renamed from: a */
    public static void m13278a(acy acyVar, AbstractC7897a abstractC7897a) {
        acyVar.mo18084l().m18167a("/reward", new C7896wd(abstractC7897a));
    }

    /* renamed from: a */
    private void m13277a(Map<String, String> map) {
        RewardItemParcel rewardItemParcel;
        int parseInt;
        String str;
        try {
            parseInt = Integer.parseInt(map.get("amount"));
            str = map.get("type");
        } catch (NumberFormatException e) {
            abr.d("Unable to parse reward amount.", e);
        }
        if (!TextUtils.isEmpty(str)) {
            rewardItemParcel = new RewardItemParcel(str, parseInt);
            this.f26038a.mo13274b(rewardItemParcel);
        }
        rewardItemParcel = null;
        this.f26038a.mo13274b(rewardItemParcel);
    }

    /* renamed from: b */
    private void m13276b(Map<String, String> map) {
        this.f26038a.mo13275J();
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        String str = map.get(AuthActivity.ACTION_KEY);
        if ("grant".equals(str)) {
            m13277a(map);
        } else if (!"video_start".equals(str)) {
        } else {
            m13276b(map);
        }
    }
}
