package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import org.json.JSONArray;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.be */
/* loaded from: classes2.dex */
public class C6774be extends aqg {

    /* renamed from: a */
    private final int f22870a;

    /* renamed from: b */
    private final apr f22871b;

    public C6774be(int i, apr aprVar) {
        this.f22870a = i;
        this.f22871b = aprVar;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    public AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        if (abstractC6880eaArr.length != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        try {
            aqd m16157a = C6839dg.m16157a((Object) new JSONArray((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b()).getJSONArray(0));
            m16157a.m16225a(this.f22871b);
            return this.f22870a == 0 ? C6886ee.f23122e : m16157a.a_(aprVar, new AbstractC6880ea[0]);
        } catch (JSONException e) {
            aph.m16395a("Unable to convert Custom Pixie to instruction", e);
            return C6886ee.f23122e;
        }
    }
}
