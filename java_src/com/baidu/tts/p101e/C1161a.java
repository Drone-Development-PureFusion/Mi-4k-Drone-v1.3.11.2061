package com.baidu.tts.p101e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.baidu.android.common.net.ConnectManager;
import com.baidu.android.common.net.ProxyHttpClient;
import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import com.baidu.tts.p105h.p107b.C1193b;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.utils.p219a.C3070c;
import com.tencent.connect.common.Constants;
import com.tencent.open.GameAppOperation;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.AbstractC10446k;
import com.xiaomi.market.sdk.C10445j;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.p286a.p287a.p290c.p296f.C11081j;
/* renamed from: com.baidu.tts.e.a */
/* loaded from: classes.dex */
public class C1161a {
    /* renamed from: a */
    private static List<Integer> m36357a(JSONObject jSONObject, Cursor cursor, int i, int i2) {
        if (cursor == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        int i3 = 0;
        boolean moveToPosition = cursor.moveToPosition(i);
        while (moveToPosition) {
            int i4 = cursor.getInt(cursor.getColumnIndex(AbstractC10446k._ID));
            String string = cursor.getString(cursor.getColumnIndex(C3070c.C3071a.f11505i));
            int i5 = cursor.getInt(cursor.getColumnIndex(XiaomiOAuthConstants.EXTRA_CODE_2));
            int i6 = cursor.getInt(cursor.getColumnIndex("cmd_type"));
            int i7 = cursor.getInt(cursor.getColumnIndex("cmd_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("result"));
            arrayList.add(Integer.valueOf(i4));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C3070c.C3071a.f11505i, Long.parseLong(string));
                jSONObject2.put("error_code", i5);
                if (i5 == 0) {
                    jSONObject2.put("cmd_type", i6);
                    jSONObject2.put("cmd_id", i7);
                    jSONObject2.put("voice_to_text_result", string2);
                }
                jSONArray.put(jSONObject2);
            } catch (NumberFormatException e) {
                LoggerProxy.m36554d("StatHelper", "e " + e);
            } catch (JSONException e2) {
                LoggerProxy.m36554d("StatHelper", "je:" + e2);
            }
            i3++;
            if (i3 < i2) {
                moveToPosition = cursor.moveToNext();
            }
        }
        try {
            jSONObject.put("recog_results", jSONArray);
            return arrayList;
        } catch (JSONException e3) {
            LoggerProxy.m36554d("StatHelper", "je:" + e3);
            return arrayList;
        }
    }

    /* renamed from: a */
    private static UrlEncodedFormEntity m36358a(String str) {
        UrlEncodedFormEntity urlEncodedFormEntity;
        UnsupportedEncodingException e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("records", str));
        try {
            urlEncodedFormEntity = new UrlEncodedFormEntity(arrayList, "utf-8");
            try {
                urlEncodedFormEntity.setContentType(C11081j.f35660a);
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                e.printStackTrace();
                return urlEncodedFormEntity;
            }
        } catch (UnsupportedEncodingException e3) {
            urlEncodedFormEntity = null;
            e = e3;
        }
        return urlEncodedFormEntity;
    }

    /* renamed from: a */
    public static synchronized void m36360a(Context context, String str) {
        synchronized (C1161a.class) {
            if (ConnectManager.isNetworkConnected(context)) {
                long m36343a = C1165d.m36343a(context);
                int m36337b = C1165d.m36337b(context);
                long j = 86400000;
                if (m36337b > 0) {
                    j = m36337b;
                }
                LoggerProxy.m36554d("StatHelper", "lastTime " + m36343a + ", curTime " + System.currentTimeMillis() + ", lastPeriod " + m36337b);
                long currentTimeMillis = System.currentTimeMillis();
                Date date = new Date(m36343a);
                Date date2 = new Date(currentTimeMillis);
                if (currentTimeMillis - m36343a < j) {
                    LoggerProxy.m36554d("StatHelper", "lastTime " + m36343a + ", curTime " + System.currentTimeMillis());
                    LoggerProxy.m36554d("StatHelper", "lastDate " + date + "\ncurDate " + date2);
                } else if (m36356b(context, str)) {
                    m36355c(context, str);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m36359a(Context context, String str, String str2) {
        boolean z = false;
        ProxyHttpClient proxyHttpClient = new ProxyHttpClient(context);
        String m36354d = m36354d(context, str);
        LoggerProxy.m36554d("StatHelper", "url:" + m36354d);
        HttpPost httpPost = new HttpPost(m36354d);
        httpPost.addHeader("Content-Type", C11081j.f35660a);
        httpPost.setEntity(m36358a(str2));
        try {
            HttpResponse execute = proxyHttpClient.execute(httpPost);
            LoggerProxy.m36554d("StatHelper", "response.getStatusLine().getStatusCode():" + execute.getStatusLine().getStatusCode());
            if (execute.getStatusLine().getStatusCode() == 200) {
                String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
                LoggerProxy.m36554d("StatHelper", "entity:" + entityUtils);
                if (!TextUtils.isEmpty(entityUtils)) {
                    try {
                        if ("0".equals(new JSONObject(entityUtils).optString("errno"))) {
                            z = true;
                        }
                    } catch (JSONException e) {
                        LoggerProxy.m36554d("StatHelper", "parse:" + e.toString());
                    } catch (Exception e2) {
                        LoggerProxy.m36554d("StatHelper", "parse:" + e2.toString());
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (ClientProtocolException e4) {
            e4.printStackTrace();
        } finally {
            proxyHttpClient.close();
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m36356b(Context context, String str) {
        boolean z;
        C1163c m36350a = C1163c.m36350a(context);
        synchronized (m36350a) {
            if (!m36350a.m36346d()) {
                Cursor m36348b = m36350a.m36348b();
                if (m36348b != null) {
                    try {
                        if (m36348b.getCount() >= 1) {
                            LoggerProxy.m36554d("StatHelper", "cursor.getCount: " + m36348b.getCount());
                            int count = m36348b.getCount() % 500 == 0 ? m36348b.getCount() / 500 : (m36348b.getCount() / 500) + 1;
                            z = false;
                            for (int i = 0; i < count; i++) {
                                JSONObject jSONObject = new JSONObject();
                                List<Integer> m36357a = m36357a(jSONObject, m36348b, i * 500, 500);
                                LoggerProxy.m36554d("StatHelper", "jsonObj all: " + jSONObject.toString());
                                byte[] m36340a = C1165d.m36340a(jSONObject.toString());
                                if (m36340a.length >= 2) {
                                    m36340a[0] = 117;
                                    m36340a[1] = 123;
                                }
                                String m36339a = C1165d.m36339a(m36340a);
                                LoggerProxy.m36554d("StatHelper", " postContent:" + m36339a);
                                if (m36359a(context, str, m36339a)) {
                                    synchronized (m36350a) {
                                        if (!m36350a.m36346d()) {
                                            m36350a.m36349a(m36357a);
                                            C1165d.m36341a(context, System.currentTimeMillis());
                                            z = true;
                                        }
                                    }
                                }
                            }
                        } else {
                            z = false;
                        }
                        m36348b.close();
                    } catch (SQLiteException e) {
                        return false;
                    } catch (Exception e2) {
                        return false;
                    }
                } else {
                    z = false;
                }
                return z;
            }
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m36355c(Context context, String str) {
        boolean z = false;
        ProxyHttpClient proxyHttpClient = new ProxyHttpClient(context);
        String m36353e = m36353e(context, str);
        LoggerProxy.m36554d("StatHelper", "url:" + m36353e);
        try {
            HttpResponse execute = proxyHttpClient.execute(new HttpGet(m36353e));
            LoggerProxy.m36554d("StatHelper", "response.getStatusLine().getStatusCode():" + execute.getStatusLine().getStatusCode());
            if (execute.getStatusLine().getStatusCode() == 200) {
                String entityUtils = EntityUtils.toString(execute.getEntity(), "utf-8");
                LoggerProxy.m36554d("StatHelper", "entity:" + entityUtils);
                if (!TextUtils.isEmpty(entityUtils)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(entityUtils).optJSONObject(UriUtil.DATA_SCHEME);
                        if (optJSONObject != null) {
                            int optInt = optJSONObject.optInt("secs");
                            LoggerProxy.m36554d("StatHelper", "period:" + optInt);
                            int i = optInt * 1000;
                            if (i > 0) {
                                int m36337b = C1165d.m36337b(context);
                                LoggerProxy.m36554d("StatHelper", "oldPeriod:" + m36337b);
                                if (i != m36337b) {
                                    C1165d.m36342a(context, i);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        LoggerProxy.m36554d("StatHelper", "parse:" + e.toString());
                    } catch (Exception e2) {
                        LoggerProxy.m36554d("StatHelper", "parse:" + e2.toString());
                    }
                }
                z = true;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (ClientProtocolException e4) {
            e4.printStackTrace();
        } finally {
            proxyHttpClient.close();
        }
        return z;
    }

    /* renamed from: d */
    private static String m36354d(Context context, String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("wise_cuid", C1193b.m36288a().m36282i()));
        linkedList.add(new BasicNameValuePair("sdk_version", C1165d.m36344a()));
        linkedList.add(new BasicNameValuePair(GameAppOperation.QQFAV_DATALINE_APPNAME, C1165d.m36334c(context)));
        linkedList.add(new BasicNameValuePair(Constants.PARAM_PLATFORM, C1165d.m36332d(context)));
        linkedList.add(new BasicNameValuePair(C10445j.f32457ac, C1165d.m36338b()));
        linkedList.add(new BasicNameValuePair("net_type", C1165d.m36331e(context) + ""));
        linkedList.add(new BasicNameValuePair("appid", str));
        linkedList.add(new BasicNameValuePair("screen", C1165d.m36330f(context)));
        linkedList.add(new BasicNameValuePair("sdk_name", C1165d.m36335c()));
        linkedList.add(new BasicNameValuePair("app_signature", C1165d.m36329g(context)));
        return "http://yuyin.baidu.com/voice?osname=voiceopen&action=usereventflow&" + URLEncodedUtils.format(linkedList, "utf-8");
    }

    /* renamed from: e */
    private static String m36353e(Context context, String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new BasicNameValuePair("appid", str));
        return "http://uil.cbs.baidu.com/voiceLog/getconfig?" + URLEncodedUtils.format(linkedList, "utf-8");
    }
}
