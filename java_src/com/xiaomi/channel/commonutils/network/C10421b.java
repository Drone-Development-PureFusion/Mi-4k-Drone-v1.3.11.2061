package com.xiaomi.channel.commonutils.network;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.xiaomi.channel.commonutils.network.b */
/* loaded from: classes2.dex */
public class C10421b {

    /* renamed from: a */
    public int f32368a;

    /* renamed from: b */
    public Map<String, String> f32369b = new HashMap();

    /* renamed from: c */
    public String f32370c;

    /* renamed from: a */
    public String m5231a() {
        return this.f32370c;
    }

    public String toString() {
        return String.format("resCode = %1$d, headers = %2$s, response = %3$s", Integer.valueOf(this.f32368a), this.f32369b.toString(), this.f32370c);
    }
}
