package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.baidu.tts.chainofresponsibility.logger.e */
/* loaded from: classes.dex */
public class C1129e {

    /* renamed from: a */
    private List<String> f2612a = new ArrayList();

    /* renamed from: b */
    private List<String> f2613b = new ArrayList();

    /* renamed from: a */
    public void m36526a() {
        if (this.f2612a != null) {
            this.f2612a.clear();
        }
        if (this.f2613b != null) {
            this.f2613b.clear();
        }
    }

    /* renamed from: a */
    public void m36525a(C1124c c1124c, Void r9, C1125d c1125d) {
        boolean z;
        String m36546b = c1124c.m36546b();
        String m36544c = c1124c.m36544c();
        String m36543d = c1124c.m36543d();
        String str = m36543d != null ? "(" + m36543d + ")" + m36544c : m36544c;
        if (this.f2613b == null || this.f2613b.isEmpty()) {
            z = true;
        } else if (this.f2613b.contains(m36546b)) {
            z = false;
        } else {
            Iterator<String> it2 = this.f2613b.iterator();
            z = true;
            while (it2.hasNext()) {
                String next = it2.next();
                z = (next == null || str == null || !str.contains(next)) ? z : false;
            }
        }
        if (this.f2612a != null && !this.f2612a.isEmpty()) {
            if (this.f2612a.contains(m36546b)) {
                z = true;
            } else {
                for (String str2 : this.f2612a) {
                    if (str2 != null && str != null) {
                        z = str.contains(str2);
                    }
                }
            }
        }
        if (z) {
            Log.println(c1124c.m36549a(), "bdtts-" + m36546b, str);
        }
    }

    /* renamed from: a */
    public void m36524a(String str) {
        if (this.f2612a == null || this.f2612a.contains(str)) {
            return;
        }
        this.f2612a.add(str);
    }

    /* renamed from: a */
    public void m36523a(List<String> list) {
        if (this.f2612a != null) {
            this.f2612a.addAll(list);
        }
    }

    /* renamed from: b */
    public void m36522b(String str) {
        if (this.f2613b == null || this.f2613b.contains(str)) {
            return;
        }
        this.f2613b.add(str);
    }
}
