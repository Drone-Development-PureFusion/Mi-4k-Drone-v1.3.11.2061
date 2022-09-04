package com.baidu.tts.p098d;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.baidu.tts.d.a */
/* loaded from: classes.dex */
public class C1131a {

    /* renamed from: a */
    private boolean f2672a = false;

    /* renamed from: b */
    private Map<String, Integer> f2673b = new HashMap();

    /* renamed from: a */
    public void m36511a(String str, int i) {
        this.f2673b.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m36510a(boolean z) {
        this.f2672a = z;
    }

    /* renamed from: a */
    public boolean m36512a() {
        return this.f2672a;
    }

    /* renamed from: b */
    public boolean m36509b() {
        for (Integer num : this.f2673b.values()) {
            if (num.intValue() != 7) {
                return false;
            }
        }
        return true;
    }
}
