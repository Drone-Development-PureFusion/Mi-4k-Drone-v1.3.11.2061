package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.p004v7.media.MediaRouteProviderProtocol;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.overlay.C3663k;
import com.tencent.tauth.AuthActivity;
import java.util.Map;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.we */
/* loaded from: classes.dex */
public final class C7898we implements AbstractC7877vt {

    /* renamed from: a */
    private boolean f26039a;

    /* renamed from: a */
    private static int m13273a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                return C3514ac.m27586a().m26865a(context, Integer.parseInt(str2));
            } catch (NumberFormatException e) {
                abr.d(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length()).append("Could not parse ").append(str).append(" in a video GMSG: ").append(str2).toString());
                return i;
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        int i;
        int i2;
        String str = map.get(AuthActivity.ACTION_KEY);
        if (str == null) {
            abr.d("Action missing from video GMSG.");
            return;
        }
        if (abr.a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject.toString());
            abr.a(new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length()).append("Video GMSG: ").append(str).append(" ").append(valueOf).toString());
        }
        if ("background".equals(str)) {
            String str2 = map.get("color");
            if (TextUtils.isEmpty(str2)) {
                abr.d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                acyVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException e) {
                abr.d("Invalid color parameter in video GMSG.");
                return;
            }
        }
        acx mo18073w = acyVar.mo18073w();
        if (mo18073w == null) {
            abr.d("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = acyVar.getContext();
            int m13273a = m13273a(context, map, "x", 0);
            int m13273a2 = m13273a(context, map, "y", 0);
            int m13273a3 = m13273a(context, map, "w", -1);
            int m13273a4 = m13273a(context, map, "h", -1);
            if (C7788uf.f25813bR.m13486c().booleanValue()) {
                i = Math.min(m13273a3, acyVar.getMeasuredWidth() - m13273a);
                m13273a4 = Math.min(m13273a4, acyVar.getMeasuredHeight() - m13273a2);
            } else {
                i = m13273a3;
            }
            try {
                i2 = Integer.parseInt(map.get("player"));
            } catch (NumberFormatException e2) {
                i2 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean(map.get("spherical"));
            if (!equals || mo18073w.m18189a() != null) {
                mo18073w.m18188a(m13273a, m13273a2, i, m13273a4);
                return;
            } else {
                mo18073w.m18187a(m13273a, m13273a2, i, m13273a4, i2, parseBoolean);
                return;
            }
        }
        C3663k m18189a = mo18073w.m18189a();
        if (m18189a == null) {
            C3663k.m27191a(acyVar);
        } else if ("click".equals(str)) {
            Context context2 = acyVar.getContext();
            int m13273a5 = m13273a(context2, map, "x", 0);
            int m13273a6 = m13273a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, m13273a5, m13273a6, 0);
            m18189a.m27193a(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            String str3 = map.get(C3070c.C3071a.f11505i);
            if (str3 == null) {
                abr.d("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                m18189a.m27195a((int) (Float.parseFloat(str3) * 1000.0f));
            } catch (NumberFormatException e3) {
                String valueOf2 = String.valueOf(str3);
                abr.d(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
            }
        } else if ("hide".equals(str)) {
            m18189a.setVisibility(4);
        } else if ("load".equals(str)) {
            m18189a.m27182g();
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean(map.get("muted"))) {
                m18189a.m27179j();
            } else {
                m18189a.m27178k();
            }
        } else if ("pause".equals(str)) {
            m18189a.m27181h();
        } else if ("play".equals(str)) {
            m18189a.m27180i();
        } else if ("show".equals(str)) {
            m18189a.setVisibility(0);
        } else if ("src".equals(str)) {
            m18189a.m27190a(map.get("src"));
        } else if ("touchMove".equals(str)) {
            Context context3 = acyVar.getContext();
            m18189a.m27196a(m13273a(context3, map, "dx", 0), m13273a(context3, map, "dy", 0));
            if (this.f26039a) {
                return;
            }
            acyVar.mo18087i().m27218r();
            this.f26039a = true;
        } else if (!MediaRouteProviderProtocol.CLIENT_DATA_VOLUME.equals(str)) {
            if ("watermark".equals(str)) {
                m18189a.m27177l();
                return;
            }
            String valueOf3 = String.valueOf(str);
            abr.d(valueOf3.length() != 0 ? "Unknown video action: ".concat(valueOf3) : new String("Unknown video action: "));
        } else {
            String str4 = map.get(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);
            if (str4 == null) {
                abr.d("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                m18189a.m27197a(Float.parseFloat(str4));
            } catch (NumberFormatException e4) {
                String valueOf4 = String.valueOf(str4);
                abr.d(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
            }
        }
    }
}
