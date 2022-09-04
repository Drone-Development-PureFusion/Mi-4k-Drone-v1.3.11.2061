package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.C10445j;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.yn */
/* loaded from: classes.dex */
public class C8063yn {

    /* renamed from: a */
    private final acy f26426a;

    /* renamed from: b */
    private final String f26427b;

    public C8063yn(acy acyVar) {
        this(acyVar, "");
    }

    public C8063yn(acy acyVar, String str) {
        this.f26426a = acyVar;
        this.f26427b = str;
    }

    /* renamed from: a */
    public void m12885a(int i, int i2, int i3, int i4) {
        try {
            this.f26426a.b("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(FimiMediaMeta.IJKM_KEY_WIDTH, i3).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i4));
        } catch (JSONException e) {
            abr.b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public void m12884a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f26426a.b("onScreenInfoChanged", new JSONObject().put(FimiMediaMeta.IJKM_KEY_WIDTH, i).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put(C10445j.f32464aj, f).put("rotation", i5));
        } catch (JSONException e) {
            abr.b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: b */
    public void m12883b(int i, int i2, int i3, int i4) {
        try {
            this.f26426a.b("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(FimiMediaMeta.IJKM_KEY_WIDTH, i3).put(FimiMediaMeta.IJKM_KEY_HEIGHT, i4));
        } catch (JSONException e) {
            abr.b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public void m12882b(String str) {
        try {
            this.f26426a.b("onError", new JSONObject().put(RMsgInfoDB.TABLE, str).put(AuthActivity.ACTION_KEY, this.f26427b));
        } catch (JSONException e) {
            abr.b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: c */
    public void m12881c(String str) {
        try {
            this.f26426a.b("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            abr.b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: d */
    public void m12880d(String str) {
        try {
            this.f26426a.b("onStateChanged", new JSONObject().put(XiaomiOAuthConstants.EXTRA_STATE_2, str));
        } catch (JSONException e) {
            abr.b("Error occured while dispatching state change.", e);
        }
    }
}
