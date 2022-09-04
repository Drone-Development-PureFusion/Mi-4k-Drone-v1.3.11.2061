package com.xiaomi.market.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import org.p356d.AbstractC11759f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.market.sdk.t */
/* loaded from: classes2.dex */
public class AsyncTaskC10455t extends AsyncTask {
    private AsyncTaskC10455t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AsyncTaskC10455t(AsyncTaskC10455t asyncTaskC10455t) {
        this();
    }

    /* renamed from: a */
    private C10458w m5073a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null) {
            Log.e("MarketUpdateAgent", "update info json obj null");
            return null;
        }
        if (C10454s.DEBUG) {
            Log.d("MarketUpdateAgent", "updateInfo : " + jSONObject.toString());
        }
        C10458w c10458w = new C10458w();
        try {
            c10458w.f32512bi = jSONObject.getString(C10445j.HOST);
            c10458w.f32514bk = jSONObject.getInt(C10445j.f32474at);
            c10458w.f32513bj = jSONObject.getInt("source");
            c10458w.updateLog = jSONObject.getString(C10445j.f32476av);
            c10458w.versionCode = jSONObject.getInt("versionCode");
            c10458w.versionName = jSONObject.getString(C10445j.f32478ax);
            c10458w.f32515bl = jSONObject.getString(C10445j.f32479ay);
            c10458w.f32516bm = jSONObject.getString("apkHash");
            c10458w.f32517bn = jSONObject.getLong(C10445j.f32451aA);
            z = XiaomiUpdateAgent.f32393bg;
            if (z) {
                c10458w.f32518bo = jSONObject.getString(C10445j.f32452aB);
                c10458w.f32519bp = jSONObject.getString(C10445j.f32453aC);
                c10458w.f32520bq = jSONObject.getLong(C10445j.f32454aD);
            }
            return c10458w;
        } catch (JSONException e) {
            Log.e("MarketUpdateAgent", "get update info failed : " + e.toString());
            Log.e("MarketUpdateAgent", "original content : " + jSONObject.toString());
            return null;
        }
    }

    /* renamed from: w */
    private String m5071w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C10445j.f32462ah, String.valueOf(C10436a.f32396b) + AbstractC11759f.f37104a + C10436a.f32397c);
            jSONObject.put(C10445j.f32463ai, C10436a.f32398d);
            jSONObject.put(C10445j.f32464aj, C10436a.f32399e);
            jSONObject.put(C10445j.f32465ak, C10436a.f32400f);
            jSONObject.put(C10445j.f32466al, C10436a.f32401g);
            jSONObject.put(C10445j.f32467am, C10436a.f32402h);
            jSONObject.put(C10445j.f32468an, C10436a.f32403i);
            jSONObject.put(C10445j.f32469ao, C10436a.f32404j);
            jSONObject.put("sdk", C10436a.f32405k);
            jSONObject.put("version", C10436a.f32406l);
            jSONObject.put("release", C10436a.RELEASE);
            jSONObject.put(C10445j.f32473as, C10437b.m5142a(C10436a.f32407m));
            return jSONObject.toString();
        } catch (JSONException e) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static void m5070x() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        C10452q c10452q;
        C10458w c10458w;
        Context context5;
        Context context6;
        C10458w c10458w2;
        C10458w c10458w3;
        Context context7;
        String string;
        Context context8;
        Context context9;
        C10458w c10458w4;
        C10458w c10458w5;
        Context context10;
        Context context11;
        context = XiaomiUpdateAgent.mContext;
        if (context instanceof Activity) {
            context11 = XiaomiUpdateAgent.mContext;
            if (((Activity) context11).isFinishing()) {
                Log.e("MarketUpdateAgent", "activity not running!");
                return;
            }
        }
        context2 = XiaomiUpdateAgent.mContext;
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        context3 = XiaomiUpdateAgent.mContext;
        context4 = XiaomiUpdateAgent.mContext;
        int m5081b = C10454s.m5081b(context4.getPackageName(), "string", "xiaomi_update_dialog_title");
        c10452q = XiaomiUpdateAgent.f32390aL;
        AlertDialog.Builder title = builder.setTitle(context3.getString(m5081b, c10452q.f32502aT));
        c10458w = XiaomiUpdateAgent.f32389aK;
        if (TextUtils.isEmpty(c10458w.f32518bo)) {
            context8 = XiaomiUpdateAgent.mContext;
            context9 = XiaomiUpdateAgent.mContext;
            int m5081b2 = C10454s.m5081b(context9.getPackageName(), "string", "xiaomi_update_dialog_message");
            c10458w4 = XiaomiUpdateAgent.f32389aK;
            c10458w5 = XiaomiUpdateAgent.f32389aK;
            long j = c10458w5.f32517bn;
            context10 = XiaomiUpdateAgent.mContext;
            string = context8.getString(m5081b2, c10458w4.versionName, C10454s.m5082a(j, context10));
        } else {
            context5 = XiaomiUpdateAgent.mContext;
            context6 = XiaomiUpdateAgent.mContext;
            int m5081b3 = C10454s.m5081b(context6.getPackageName(), "string", "xiaomi_update_dialog_message_diff");
            c10458w2 = XiaomiUpdateAgent.f32389aK;
            c10458w3 = XiaomiUpdateAgent.f32389aK;
            long j2 = c10458w3.f32520bq;
            context7 = XiaomiUpdateAgent.mContext;
            string = context5.getString(m5081b3, c10458w2.versionName, C10454s.m5082a(j2, context7));
        }
        title.setMessage(string).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, new DialogInterface$OnClickListenerC10456u()).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Integer doInBackground(Void... voidArr) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        C10452q c10452q;
        C10452q c10452q2;
        C10452q c10452q3;
        C10452q c10452q4;
        C10452q c10452q5;
        C10458w c10458w;
        C10458w c10458w2;
        C10458w c10458w3;
        boolean z;
        context = XiaomiUpdateAgent.mContext;
        if (!C10454s.m5077m(context)) {
            return 3;
        }
        context2 = XiaomiUpdateAgent.mContext;
        if (!C10454s.m5076n(context2)) {
            z = XiaomiUpdateAgent.f32392bf;
            if (z) {
                return 2;
            }
        }
        context3 = XiaomiUpdateAgent.mContext;
        C10436a.m5155a(context3);
        context4 = XiaomiUpdateAgent.mContext;
        XiaomiUpdateAgent.f32390aL = XiaomiUpdateAgent.m5163p(context4);
        c10452q = XiaomiUpdateAgent.f32390aL;
        if (c10452q == null) {
            return 5;
        }
        C10438c c10438c = new C10438c(C10445j.f32446V);
        c10438c.getClass();
        C10443h c10443h = new C10443h(c10438c);
        c10443h.m5110d(C10445j.f32461ag, m5071w());
        c10452q2 = XiaomiUpdateAgent.f32390aL;
        c10443h.m5110d(C10445j.f32447W, c10452q2.packageName);
        c10452q3 = XiaomiUpdateAgent.f32390aL;
        c10443h.m5110d("versionCode", new StringBuilder(String.valueOf(c10452q3.versionCode)).toString());
        c10452q4 = XiaomiUpdateAgent.f32390aL;
        c10443h.m5110d("apkHash", c10452q4.f32504aV);
        c10452q5 = XiaomiUpdateAgent.f32390aL;
        c10443h.m5110d("signature", c10452q5.f32503aU);
        c10443h.m5110d(C10445j.f32455aa, C10436a.f32408n);
        c10443h.m5110d("sdk", String.valueOf(C10436a.f32405k));
        c10443h.m5110d(C10445j.f32457ac, C10436a.f32406l);
        c10443h.m5110d(C10445j.f32458ad, C10436a.LANGUAGE);
        c10443h.m5110d(C10445j.f32459ae, C10436a.COUNTRY);
        c10443h.m5110d(C10445j.f32460af, "0");
        if (EnumC10442g.OK == c10438c.m5113h()) {
            XiaomiUpdateAgent.f32389aK = m5073a(c10438c.m5117e());
            c10458w = XiaomiUpdateAgent.f32389aK;
            if (c10458w != null) {
                c10458w2 = XiaomiUpdateAgent.f32389aK;
                Log.i("MarketUpdateAgent", c10458w2.toString());
                c10458w3 = XiaomiUpdateAgent.f32389aK;
                return Integer.valueOf(c10458w3.f32514bk == 0 ? 0 : 1);
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        boolean z;
        XiaomiUpdateListener xiaomiUpdateListener;
        XiaomiUpdateListener xiaomiUpdateListener2;
        C10458w c10458w;
        C10458w c10458w2;
        C10458w c10458w3;
        C10458w c10458w4;
        C10458w c10458w5;
        z = XiaomiUpdateAgent.f32391be;
        if (z) {
            switch (num.intValue()) {
                case 0:
                    new AsyncTaskC10457v(null).execute(new Void[0]);
                    return;
                default:
                    return;
            }
        }
        UpdateResponse updateResponse = new UpdateResponse();
        if (num.intValue() == 0) {
            c10458w = XiaomiUpdateAgent.f32389aK;
            updateResponse.updateLog = c10458w.updateLog;
            c10458w2 = XiaomiUpdateAgent.f32389aK;
            updateResponse.versionCode = c10458w2.versionCode;
            c10458w3 = XiaomiUpdateAgent.f32389aK;
            updateResponse.versionName = c10458w3.versionName;
            c10458w4 = XiaomiUpdateAgent.f32389aK;
            String str = c10458w4.f32512bi;
            c10458w5 = XiaomiUpdateAgent.f32389aK;
            updateResponse.path = C10438c.m5120c(str, c10458w5.f32515bl);
        }
        xiaomiUpdateListener = XiaomiUpdateAgent.f32394bh;
        if (xiaomiUpdateListener == null) {
            return;
        }
        xiaomiUpdateListener2 = XiaomiUpdateAgent.f32394bh;
        xiaomiUpdateListener2.onUpdateReturned(num.intValue(), updateResponse);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        boolean z;
        Log.d("MarketUpdateAgent", "start to check update");
        z = XiaomiUpdateAgent.f32393bg;
        if (!z) {
            XiaomiUpdateAgent.f32393bg = Patcher.m5168o();
        }
    }
}
