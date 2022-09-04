package com.xiaomi.network;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.places.AbstractC8240d;
import com.xiaomi.channel.commonutils.network.AbstractC10422c;
import com.xiaomi.channel.commonutils.network.C10423d;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class HttpUtils {

    /* loaded from: classes2.dex */
    public static class DefaultHttpGetProcessor extends HttpProcessor {
        public DefaultHttpGetProcessor() {
            super(1);
        }

        @Override // com.xiaomi.network.HttpProcessor
        /* renamed from: b */
        public String mo4740b(Context context, String str, List<AbstractC10422c> list) {
            if (list == null) {
                return C10423d.m5225a(context, new URL(str));
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (AbstractC10422c abstractC10422c : list) {
                buildUpon.appendQueryParameter(abstractC10422c.mo5230a(), abstractC10422c.mo5229b());
            }
            return C10423d.m5225a(context, new URL(buildUpon.toString()));
        }
    }

    /* renamed from: a */
    static int m4747a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + 1080 + i + i2;
    }

    /* renamed from: a */
    static int m4746a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + AbstractC8240d.f27001bd + i2 + i + i3;
    }

    /* renamed from: a */
    private static int m4743a(HttpProcessor httpProcessor, String str, List<AbstractC10422c> list, String str2) {
        if (httpProcessor.m4749a() == 1) {
            return m4747a(str.length(), m4742a(str2));
        }
        if (httpProcessor.m4749a() != 2) {
            return -1;
        }
        return m4746a(str.length(), m4741a(list), m4742a(str2));
    }

    /* renamed from: a */
    static int m4742a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    /* renamed from: a */
    static int m4741a(List<AbstractC10422c> list) {
        int i = 0;
        Iterator<AbstractC10422c> it2 = list.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                AbstractC10422c next = it2.next();
                if (!TextUtils.isEmpty(next.mo5230a())) {
                    i2 += next.mo5230a().length();
                }
                i = !TextUtils.isEmpty(next.mo5229b()) ? next.mo5229b().length() + i2 : i2;
            } else {
                return i2 * 2;
            }
        }
    }

    /* renamed from: a */
    public static String m4745a(Context context, String str, List<AbstractC10422c> list) {
        return m4744a(context, str, list, new DefaultHttpGetProcessor(), true);
    }

    /* renamed from: a */
    public static String m4744a(Context context, String str, List<AbstractC10422c> list, HttpProcessor httpProcessor, boolean z) {
        if (C10423d.m5213d(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                Fallback fallback = null;
                if (z && (fallback = HostManager.getInstance().getFallbacksByURL(str)) != null) {
                    arrayList = fallback.m4770a(str);
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                String str2 = null;
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                    } catch (IOException e) {
                        if (fallback != null) {
                            fallback.m4767a(next, System.currentTimeMillis() - currentTimeMillis, m4743a(httpProcessor, next, arrayList2, str2), e);
                        }
                        e.printStackTrace();
                    }
                    if (!httpProcessor.m4748a(context, next, arrayList2)) {
                        return str2;
                    }
                    str2 = httpProcessor.mo4740b(context, next, arrayList2);
                    if (!TextUtils.isEmpty(str2)) {
                        if (fallback == null) {
                            return str2;
                        }
                        fallback.m4768a(next, System.currentTimeMillis() - currentTimeMillis, m4743a(httpProcessor, next, arrayList2, str2));
                        return str2;
                    }
                    if (fallback != null) {
                        fallback.m4767a(next, System.currentTimeMillis() - currentTimeMillis, m4743a(httpProcessor, next, arrayList2, str2), null);
                    }
                    str2 = str2;
                }
                return str2;
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
