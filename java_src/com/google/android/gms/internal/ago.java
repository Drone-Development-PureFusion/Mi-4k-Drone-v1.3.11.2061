package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.games.C5355c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ago {

    /* renamed from: n */
    private static final C4440m f21629n = new C4440m("GameManagerMessage");

    /* renamed from: a */
    protected final int f21630a;

    /* renamed from: b */
    protected final int f21631b;

    /* renamed from: c */
    protected final String f21632c;

    /* renamed from: d */
    protected final JSONObject f21633d;

    /* renamed from: e */
    protected final int f21634e;

    /* renamed from: f */
    protected final int f21635f;

    /* renamed from: g */
    protected final List<ags> f21636g;

    /* renamed from: h */
    protected final JSONObject f21637h;

    /* renamed from: i */
    protected final String f21638i;

    /* renamed from: j */
    protected final String f21639j;

    /* renamed from: k */
    protected final long f21640k;

    /* renamed from: l */
    protected final String f21641l;

    /* renamed from: m */
    protected final agn f21642m;

    public ago(int i, int i2, String str, JSONObject jSONObject, int i3, int i4, List<ags> list, JSONObject jSONObject2, String str2, String str3, long j, String str4, agn agnVar) {
        this.f21630a = i;
        this.f21631b = i2;
        this.f21632c = str;
        this.f21633d = jSONObject;
        this.f21634e = i3;
        this.f21635f = i4;
        this.f21636g = list;
        this.f21637h = jSONObject2;
        this.f21638i = str2;
        this.f21639j = str3;
        this.f21640k = j;
        this.f21641l = str4;
        this.f21642m = agnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static ago m17618a(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("type", -1);
        try {
        } catch (JSONException e) {
            f21629n.m24159b(e, "Exception while parsing GameManagerMessage from json", new Object[0]);
        }
        switch (optInt) {
            case 1:
                agn agnVar = null;
                JSONObject optJSONObject = jSONObject.optJSONObject("gameManagerConfig");
                if (optJSONObject != null) {
                    agnVar = new agn(optJSONObject);
                }
                return new ago(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), m17619a(jSONObject.optJSONArray(C5355c.f19402a)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), jSONObject.optLong("requestId"), jSONObject.optString("playerToken"), agnVar);
            case 2:
                return new ago(optInt, jSONObject.optInt("statusCode"), jSONObject.optString("errorDescription"), jSONObject.optJSONObject("extraMessageData"), jSONObject.optInt("gameplayState"), jSONObject.optInt("lobbyState"), m17619a(jSONObject.optJSONArray(C5355c.f19402a)), jSONObject.optJSONObject("gameData"), jSONObject.optString("gameStatusText"), jSONObject.optString("playerId"), -1L, null, null);
            default:
                f21629n.m24155d("Unrecognized Game Message type %d", Integer.valueOf(optInt));
                return null;
        }
    }

    /* renamed from: a */
    private static List<ags> m17619a(JSONArray jSONArray) {
        ags agsVar;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    agsVar = new ags(optJSONObject);
                } catch (JSONException e) {
                    f21629n.m24159b(e, "Exception when attempting to parse PlayerInfoMessageComponent at index %d", Integer.valueOf(i));
                    agsVar = null;
                }
                if (agsVar != null) {
                    arrayList.add(agsVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int m17620a() {
        return this.f21630a;
    }

    /* renamed from: b */
    public final int m17617b() {
        return this.f21631b;
    }

    /* renamed from: c */
    public final String m17616c() {
        return this.f21632c;
    }

    /* renamed from: d */
    public final JSONObject m17615d() {
        return this.f21633d;
    }

    /* renamed from: e */
    public final int m17614e() {
        return this.f21634e;
    }

    /* renamed from: f */
    public final int m17613f() {
        return this.f21635f;
    }

    /* renamed from: g */
    public final List<ags> m17612g() {
        return this.f21636g;
    }

    /* renamed from: h */
    public final JSONObject m17611h() {
        return this.f21637h;
    }

    /* renamed from: i */
    public final String m17610i() {
        return this.f21638i;
    }

    /* renamed from: j */
    public final String m17609j() {
        return this.f21639j;
    }

    /* renamed from: k */
    public final long m17608k() {
        return this.f21640k;
    }

    /* renamed from: l */
    public final String m17607l() {
        return this.f21641l;
    }

    /* renamed from: m */
    public final agn m17606m() {
        return this.f21642m;
    }
}
