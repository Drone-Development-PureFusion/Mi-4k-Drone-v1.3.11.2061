package com.tencent.open.utils;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.tencent.open.p264a.C10257f;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes2.dex */
public class OpenConfig {

    /* renamed from: a */
    private static HashMap<String, OpenConfig> f31999a = null;

    /* renamed from: b */
    private static String f32000b = null;

    /* renamed from: c */
    private Context f32001c;

    /* renamed from: d */
    private String f32002d;

    /* renamed from: e */
    private JSONObject f32003e = null;

    /* renamed from: f */
    private long f32004f = 0;

    /* renamed from: g */
    private int f32005g = 0;

    /* renamed from: h */
    private boolean f32006h = true;

    private OpenConfig(Context context, String str) {
        this.f32001c = null;
        this.f32002d = null;
        this.f32001c = context.getApplicationContext();
        this.f32002d = str;
        m5588a();
        m5581b();
    }

    /* renamed from: a */
    private String m5584a(String str) {
        InputStream open;
        try {
            open = this.f32001c.openFileInput(this.f32002d != null ? str + "." + this.f32002d : str);
        } catch (FileNotFoundException e) {
            try {
                open = this.f32001c.getAssets().open(str);
            } catch (IOException e2) {
                e2.printStackTrace();
                return "";
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charset.forName("UTF-8")));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String stringBuffer2 = stringBuffer.toString();
                        try {
                            return stringBuffer2;
                        } catch (IOException e3) {
                            return stringBuffer2;
                        }
                    }
                    stringBuffer.append(readLine);
                } catch (IOException e4) {
                    e4.printStackTrace();
                    try {
                        open.close();
                        bufferedReader.close();
                        return "";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return "";
                    }
                }
            } finally {
                try {
                    open.close();
                    bufferedReader.close();
                } catch (IOException e32) {
                    e32.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private void m5588a() {
        try {
            this.f32003e = new JSONObject(m5584a("com.tencent.open.config.json"));
        } catch (JSONException e) {
            this.f32003e = new JSONObject();
        }
    }

    /* renamed from: a */
    private void m5583a(String str, String str2) {
        try {
            if (this.f32002d != null) {
                str = str + "." + this.f32002d;
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f32001c.openFileOutput(str, 0), Charset.forName("UTF-8"));
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m5582a(JSONObject jSONObject) {
        m5580b("cgi back, do update");
        this.f32003e = jSONObject;
        m5583a("com.tencent.open.config.json", jSONObject.toString());
        this.f32004f = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.tencent.open.utils.OpenConfig$1] */
    /* renamed from: b */
    private void m5581b() {
        if (this.f32005g != 0) {
            m5580b("update thread is running, return");
            return;
        }
        this.f32005g = 1;
        final Bundle bundle = new Bundle();
        bundle.putString("appid", this.f32002d);
        bundle.putString("appid_for_getting_config", this.f32002d);
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        new Thread() { // from class: com.tencent.open.utils.OpenConfig.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    OpenConfig.this.m5582a(Util.parseJson(HttpUtils.openUrl2(OpenConfig.this.f32001c, "http://cgi.connect.qq.com/qqconnectopen/openapi/policy_conf", "GET", bundle).response));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                OpenConfig.this.f32005g = 0;
            }
        }.start();
    }

    /* renamed from: b */
    private void m5580b(String str) {
        if (this.f32006h) {
            C10257f.m5673b("OpenConfig", str + "; appid: " + this.f32002d);
        }
    }

    /* renamed from: c */
    private void m5579c() {
        int optInt = this.f32003e.optInt("Common_frequency");
        if (optInt == 0) {
            optInt = 1;
        }
        if (SystemClock.elapsedRealtime() - this.f32004f >= optInt * C0494h.f704Y) {
            m5581b();
        }
    }

    public static OpenConfig getInstance(Context context, String str) {
        if (f31999a == null) {
            f31999a = new HashMap<>();
        }
        if (str != null) {
            f32000b = str;
        }
        if (str == null) {
            str = f32000b != null ? f32000b : "0";
        }
        OpenConfig openConfig = f31999a.get(str);
        if (openConfig == null) {
            OpenConfig openConfig2 = new OpenConfig(context, str);
            f31999a.put(str, openConfig2);
            return openConfig2;
        }
        return openConfig;
    }

    public boolean getBoolean(String str) {
        m5580b("get " + str);
        m5579c();
        Object opt = this.f32003e.opt(str);
        if (opt == null) {
            return false;
        }
        if (opt instanceof Integer) {
            return !opt.equals(0);
        } else if (!(opt instanceof Boolean)) {
            return false;
        } else {
            return ((Boolean) opt).booleanValue();
        }
    }

    public int getInt(String str) {
        m5580b("get " + str);
        m5579c();
        return this.f32003e.optInt(str);
    }

    public long getLong(String str) {
        m5580b("get " + str);
        m5579c();
        return this.f32003e.optLong(str);
    }
}
