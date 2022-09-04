package com.baidu.tts.p118p;

import android.content.Context;
import android.os.Build;
import com.baidu.android.common.util.CommonParam;
import com.baidu.tts.jni.EmbeddedSynthesizerEngine;
import com.baidu.tts.p105h.p107b.C1193b;
import com.baidu.tts.tools.CommonUtility;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.baidu.tts.p.a */
/* loaded from: classes.dex */
public class C1248a {
    /* renamed from: a */
    public static String m36086a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("System", Build.VERSION.RELEASE);
            jSONObject.put("SystemVersion", Build.VERSION.SDK + "");
            jSONObject.put("PhoneModel", Build.MODEL);
            jSONObject.put("CPU", Build.CPU_ABI);
            jSONObject.put("NetworkType", CommonUtility.getNetworkInfo(context));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static String m36085b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Cuid", CommonParam.getCUID(context));
            jSONObject.put("AppPackageName", context.getPackageName());
            jSONObject.put("SDKVersion", C1193b.m36288a().m36281j());
            jSONObject.put("soInfo", EmbeddedSynthesizerEngine.bdTTSGetEngineParam());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
