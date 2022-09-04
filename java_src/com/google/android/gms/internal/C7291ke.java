package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.ke */
/* loaded from: classes2.dex */
public class C7291ke {

    /* renamed from: a */
    private final AbstractC7153ig f24413a;

    /* renamed from: b */
    private final C7315ks f24414b;

    public C7291ke(C7146ic c7146ic) {
        this.f24413a = c7146ic.m15400l();
        this.f24414b = c7146ic.m15413a("EventRaiser");
    }

    /* renamed from: a */
    public void m14926a(List<? extends AbstractC7287kc> list) {
        if (this.f24414b.m14844a()) {
            this.f24414b.m14840a(new StringBuilder(28).append("Raising ").append(list.size()).append(" event(s)").toString(), new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.f24413a.mo15156a(new Runnable() { // from class: com.google.android.gms.internal.ke.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC7287kc abstractC7287kc = (AbstractC7287kc) it2.next();
                    if (C7291ke.this.f24414b.m14844a()) {
                        C7315ks c7315ks = C7291ke.this.f24414b;
                        String valueOf = String.valueOf(abstractC7287kc.toString());
                        c7315ks.m14840a(valueOf.length() != 0 ? "Raising ".concat(valueOf) : new String("Raising "), new Object[0]);
                    }
                    abstractC7287kc.mo14934b();
                }
            }
        });
    }
}
