package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.t */
/* loaded from: classes2.dex */
public abstract class AbstractC9229t {

    /* renamed from: a */
    private final Set<String> f29066a;

    /* renamed from: b */
    private final String f29067b;

    public AbstractC9229t(String str, String... strArr) {
        this.f29067b = str;
        this.f29066a = new HashSet(strArr.length);
        for (String str2 : strArr) {
            this.f29066a.add(str2);
        }
    }

    /* renamed from: a */
    public abstract AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map);

    /* renamed from: a */
    public abstract boolean mo8872a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m8878a(Set<String> set) {
        return set.containsAll(this.f29066a);
    }

    /* renamed from: b */
    public String mo8877b() {
        return this.f29067b;
    }

    /* renamed from: c */
    public Set<String> mo8876c() {
        return this.f29066a;
    }
}
