package com.xiaomi.network;

import com.xiaomi.market.sdk.C10445j;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.xiaomi.network.c */
/* loaded from: classes.dex */
class C10557c implements Comparable<C10557c> {

    /* renamed from: a */
    String f32751a;

    /* renamed from: b */
    protected int f32752b;

    /* renamed from: c */
    private final LinkedList<AccessHistory> f32753c;

    /* renamed from: d */
    private long f32754d;

    public C10557c() {
        this(null, 0);
    }

    public C10557c(String str, int i) {
        this.f32753c = new LinkedList<>();
        this.f32754d = 0L;
        this.f32751a = str;
        this.f32752b = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C10557c c10557c) {
        if (c10557c == null) {
            return 1;
        }
        return c10557c.f32752b - this.f32752b;
    }

    /* renamed from: a */
    public synchronized C10557c m4732a(JSONObject jSONObject) {
        this.f32754d = jSONObject.getLong("tt");
        this.f32752b = jSONObject.getInt("wt");
        this.f32751a = jSONObject.getString(C10445j.HOST);
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f32753c.add(new AccessHistory().m4777a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    /* renamed from: a */
    public synchronized JSONObject m4735a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("tt", this.f32754d);
        jSONObject.put("wt", this.f32752b);
        jSONObject.put(C10445j.HOST, this.f32751a);
        JSONArray jSONArray = new JSONArray();
        Iterator<AccessHistory> it2 = this.f32753c.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m4776b());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void m4734a(AccessHistory accessHistory) {
        if (accessHistory != null) {
            this.f32753c.add(accessHistory);
            int m4778a = accessHistory.m4778a();
            if (m4778a > 0) {
                this.f32752b += accessHistory.m4778a();
            } else {
                int i = 0;
                for (int size = this.f32753c.size() - 1; size >= 0 && this.f32753c.get(size).m4778a() < 0; size--) {
                    i++;
                }
                this.f32752b += m4778a * i;
            }
            if (this.f32753c.size() > 30) {
                this.f32752b -= this.f32753c.remove().m4778a();
            }
        }
    }

    public String toString() {
        return this.f32751a + ":" + this.f32752b;
    }
}
