package com.xiaomi.network;

import android.text.TextUtils;
import com.tencent.stat.DeviceInfo;
import com.xiaomi.market.sdk.C10445j;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Fallback {

    /* renamed from: a */
    public String f32727a;

    /* renamed from: b */
    public String f32728b;

    /* renamed from: c */
    public String f32729c;

    /* renamed from: d */
    public String f32730d;

    /* renamed from: e */
    public String f32731e;

    /* renamed from: f */
    public String f32732f;

    /* renamed from: g */
    public String f32733g;

    /* renamed from: h */
    protected String f32734h;

    /* renamed from: i */
    private long f32735i;

    /* renamed from: k */
    private String f32737k;

    /* renamed from: j */
    private ArrayList<C10557c> f32736j = new ArrayList<>();

    /* renamed from: l */
    private double f32738l = 0.1d;

    /* renamed from: m */
    private String f32739m = "s.mi1.cc";

    /* renamed from: n */
    private long f32740n = 86400000;

    public Fallback(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f32735i = System.currentTimeMillis();
        this.f32736j.add(new C10557c(str, -1));
        this.f32727a = HostManager.getInstance().getActiveNetworkLabel();
        this.f32728b = str;
    }

    /* renamed from: c */
    private synchronized void m4760c(String str) {
        Iterator<C10557c> it2 = this.f32736j.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().f32751a, str)) {
                it2.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized Fallback m4766a(JSONObject jSONObject) {
        this.f32727a = jSONObject.optString("net");
        this.f32740n = jSONObject.getLong("ttl");
        this.f32738l = jSONObject.getDouble("pct");
        this.f32735i = jSONObject.getLong(DeviceInfo.TAG_TIMESTAMPS);
        this.f32730d = jSONObject.optString("city");
        this.f32729c = jSONObject.optString("prv");
        this.f32733g = jSONObject.optString("cty");
        this.f32731e = jSONObject.optString("isp");
        this.f32732f = jSONObject.optString("ip");
        this.f32728b = jSONObject.optString(C10445j.HOST);
        this.f32734h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            m4771a(new C10557c().m4732a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public ArrayList<String> m4770a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.f32728b)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it2 = mo4737a(true).iterator();
        while (it2.hasNext()) {
            Host m4755a = Host.m4755a(it2.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), m4755a.m4754b(), m4755a.m4756a(), url.getFile()).toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized ArrayList<String> mo4737a(boolean z) {
        ArrayList<String> arrayList;
        synchronized (this) {
            C10557c[] c10557cArr = new C10557c[this.f32736j.size()];
            this.f32736j.toArray(c10557cArr);
            Arrays.sort(c10557cArr);
            arrayList = new ArrayList<>();
            for (C10557c c10557c : c10557cArr) {
                if (z) {
                    arrayList.add(c10557c.f32751a);
                } else {
                    int indexOf = c10557c.f32751a.indexOf(":");
                    if (indexOf != -1) {
                        arrayList.add(c10557c.f32751a.substring(0, indexOf));
                    } else {
                        arrayList.add(c10557c.f32751a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m4774a(double d) {
        this.f32738l = d;
    }

    /* renamed from: a */
    public void m4773a(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("the duration is invalid " + j);
        }
        this.f32740n = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m4771a(C10557c c10557c) {
        m4760c(c10557c.f32751a);
        this.f32736j.add(c10557c);
    }

    /* renamed from: a */
    public void m4769a(String str, int i, long j, long j2, Exception exc) {
        mo4738a(str, new AccessHistory(i, j, j2, exc));
    }

    /* renamed from: a */
    public void m4768a(String str, long j, long j2) {
        try {
            m4763b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException e) {
        }
    }

    /* renamed from: a */
    public void m4767a(String str, long j, long j2, Exception exc) {
        try {
            m4762b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r0.m4734a(r5);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void mo4738a(String str, AccessHistory accessHistory) {
        Iterator<C10557c> it2 = this.f32736j.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C10557c next = it2.next();
            if (TextUtils.equals(str, next.f32751a)) {
                break;
            }
        }
    }

    /* renamed from: a */
    public synchronized void m4765a(String[] strArr) {
        for (int size = this.f32736j.size() - 1; size >= 0; size--) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(this.f32736j.get(size).f32751a, strArr[i])) {
                        this.f32736j.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<C10557c> it2 = this.f32736j.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            C10557c next = it2.next();
            i2 = next.f32752b > i2 ? next.f32752b : i2;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            m4771a(new C10557c(strArr[i3], (strArr.length + i2) - i3));
        }
    }

    /* renamed from: a */
    public boolean m4775a() {
        return TextUtils.equals(this.f32727a, HostManager.getInstance().getActiveNetworkLabel());
    }

    /* renamed from: a */
    public boolean m4772a(Fallback fallback) {
        return TextUtils.equals(this.f32727a, fallback.f32727a);
    }

    /* renamed from: b */
    public void m4764b(String str) {
        this.f32739m = str;
    }

    /* renamed from: b */
    public void m4763b(String str, long j, long j2) {
        m4769a(str, 0, j, j2, null);
    }

    /* renamed from: b */
    public void m4762b(String str, long j, long j2, Exception exc) {
        m4769a(str, -1, j, j2, exc);
    }

    /* renamed from: b */
    public boolean mo4736b() {
        return System.currentTimeMillis() - this.f32735i < this.f32740n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m4761c() {
        long j = 864000000;
        if (864000000 < this.f32740n) {
            j = this.f32740n;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - this.f32735i > j || (currentTimeMillis - this.f32735i > this.f32740n && this.f32727a.startsWith("WIFI-"));
    }

    /* renamed from: d */
    public synchronized ArrayList<String> m4759d() {
        return mo4737a(false);
    }

    /* renamed from: e */
    public synchronized String m4758e() {
        String str;
        if (!TextUtils.isEmpty(this.f32737k)) {
            str = this.f32737k;
        } else if (TextUtils.isEmpty(this.f32731e)) {
            str = "hardcode_isp";
        } else {
            this.f32737k = HostManager.join(new String[]{this.f32731e, this.f32729c, this.f32730d, this.f32733g, this.f32732f}, "_");
            str = this.f32737k;
        }
        return str;
    }

    /* renamed from: f */
    public synchronized JSONObject m4757f() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f32727a);
        jSONObject.put("ttl", this.f32740n);
        jSONObject.put("pct", this.f32738l);
        jSONObject.put(DeviceInfo.TAG_TIMESTAMPS, this.f32735i);
        jSONObject.put("city", this.f32730d);
        jSONObject.put("prv", this.f32729c);
        jSONObject.put("cty", this.f32733g);
        jSONObject.put("isp", this.f32731e);
        jSONObject.put("ip", this.f32732f);
        jSONObject.put(C10445j.HOST, this.f32728b);
        jSONObject.put("xf", this.f32734h);
        JSONArray jSONArray = new JSONArray();
        Iterator<C10557c> it2 = this.f32736j.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m4735a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32727a);
        sb.append("\n");
        sb.append(m4758e());
        Iterator<C10557c> it2 = this.f32736j.iterator();
        while (it2.hasNext()) {
            sb.append("\n");
            sb.append(it2.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
