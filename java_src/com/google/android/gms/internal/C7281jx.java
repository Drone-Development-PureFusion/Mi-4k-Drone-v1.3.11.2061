package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005b.p006a.p007a.p008a.p020j.C0324k;
/* renamed from: com.google.android.gms.internal.jx */
/* loaded from: classes2.dex */
public class C7281jx<T> {

    /* renamed from: a */
    public Map<C7319kv, C7281jx<T>> f24386a = new HashMap();

    /* renamed from: b */
    public T f24387b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m14960a(String str) {
        String valueOf = String.valueOf(this.f24387b);
        String sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(valueOf).length()).append(str).append("<value>: ").append(valueOf).append("\n").toString();
        if (this.f24386a.isEmpty()) {
            return new StringBuilder(String.valueOf(sb).length() + 7 + String.valueOf(str).length()).append(sb).append(str).append("<empty>").toString();
        }
        Iterator<Map.Entry<C7319kv, C7281jx<T>>> it2 = this.f24386a.entrySet().iterator();
        while (true) {
            String str2 = sb;
            if (!it2.hasNext()) {
                return str2;
            }
            Map.Entry<C7319kv, C7281jx<T>> next = it2.next();
            String valueOf2 = String.valueOf(str2);
            String valueOf3 = String.valueOf(next.getKey());
            String valueOf4 = String.valueOf(next.getValue().m14960a(String.valueOf(str).concat(C0324k.f324b)));
            sb = new StringBuilder(String.valueOf(valueOf2).length() + 3 + String.valueOf(str).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append(valueOf2).append(str).append(valueOf3).append(":\n").append(valueOf4).append("\n").toString();
        }
    }
}
