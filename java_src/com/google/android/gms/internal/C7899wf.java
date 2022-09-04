package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.wf */
/* loaded from: classes.dex */
class C7899wf implements AbstractC7877vt {
    /* renamed from: a */
    private int m13272a(Map<String, String> map) {
        int parseInt = Integer.parseInt(map.get("playbackState"));
        if (parseInt < 0 || 3 < parseInt) {
            return 0;
        }
        return parseInt;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        add addVar;
        if (!C7788uf.f25761aS.m13486c().booleanValue()) {
            return;
        }
        add mo18070z = acyVar.mo18070z();
        if (mo18070z == null) {
            try {
                add addVar2 = new add(acyVar, Float.parseFloat(map.get("duration")));
                acyVar.mo18112a(addVar2);
                addVar = addVar2;
            } catch (NullPointerException | NumberFormatException e) {
                abr.b("Unable to parse videoMeta message.", e);
                C3779u.m26886i().m18451a(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        } else {
            addVar = mo18070z;
        }
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat = Float.parseFloat(map.get("currentTime"));
        int m13272a = m13272a(map);
        String str = map.get("aspectRatio");
        float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (abr.a(3)) {
            abr.a(new StringBuilder(String.valueOf(str).length() + 79).append("Video Meta GMSG: isMuted : ").append(equals).append(" , playbackState : ").append(m13272a).append(" , aspectRatio : ").append(str).toString());
        }
        addVar.m18066a(parseFloat, m13272a, equals, parseFloat2);
    }
}
