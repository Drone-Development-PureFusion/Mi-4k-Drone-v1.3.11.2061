package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.xb */
/* loaded from: classes.dex */
public class C7984xb implements AbstractC7983xa {

    /* renamed from: a */
    private final AbstractC7980wy f26213a;

    /* renamed from: b */
    private final HashSet<AbstractMap.SimpleEntry<String, AbstractC7877vt>> f26214b = new HashSet<>();

    public C7984xb(AbstractC7980wy abstractC7980wy) {
        this.f26213a = abstractC7980wy;
    }

    @Override // com.google.android.gms.internal.AbstractC7983xa
    /* renamed from: a */
    public void mo13114a() {
        Iterator<AbstractMap.SimpleEntry<String, AbstractC7877vt>> it2 = this.f26214b.iterator();
        while (it2.hasNext()) {
            AbstractMap.SimpleEntry<String, AbstractC7877vt> next = it2.next();
            String valueOf = String.valueOf(next.getValue().toString());
            abr.m18409e(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f26213a.mo13110b(next.getKey(), next.getValue());
        }
        this.f26214b.clear();
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13113a(String str, AbstractC7877vt abstractC7877vt) {
        this.f26213a.mo13113a(str, abstractC7877vt);
        this.f26214b.add(new AbstractMap.SimpleEntry<>(str, abstractC7877vt));
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13112a(String str, String str2) {
        this.f26213a.mo13112a(str, str2);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13111a(String str, JSONObject jSONObject) {
        this.f26213a.mo13111a(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13110b(String str, AbstractC7877vt abstractC7877vt) {
        this.f26213a.mo13110b(str, abstractC7877vt);
        this.f26214b.remove(new AbstractMap.SimpleEntry(str, abstractC7877vt));
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13109b(String str, JSONObject jSONObject) {
        this.f26213a.mo13109b(str, jSONObject);
    }
}
