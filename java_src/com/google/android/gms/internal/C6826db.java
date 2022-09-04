package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.internal.C4588d;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.db */
/* loaded from: classes2.dex */
public class C6826db extends aqg {

    /* renamed from: a */
    private final aoz f22913a;

    public C6826db(aoz aozVar) {
        this.f22913a = aozVar;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = false;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
        C4588d.m23619b(!(abstractC6880ea instanceof C6886ee));
        C6886ee c6886ee = abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] : C6886ee.f23122e;
        C4588d.m23619b(c6886ee == C6886ee.f23122e || (c6886ee instanceof C6887ef));
        C6886ee c6886ee2 = abstractC6880eaArr.length > 2 ? abstractC6880eaArr[2] : C6886ee.f23122e;
        if (c6886ee2 == C6886ee.f23122e || !(c6886ee2 instanceof C6886ee)) {
            z = true;
        }
        C4588d.m23619b(z);
        Uri.Builder buildUpon = Uri.parse(aqf.m16218d(abstractC6880ea)).buildUpon();
        if (c6886ee != C6886ee.f23122e) {
            for (AbstractC6880ea<?> abstractC6880ea2 : ((C6887ef) c6886ee).mo16034b()) {
                C4588d.m23619b(abstractC6880ea2 instanceof C6891eh);
                for (Map.Entry<String, AbstractC6880ea<?>> entry : ((C6891eh) abstractC6880ea2).mo16034b().entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey().toString(), aqf.m16218d(C6895ek.m16028a(aprVar, entry.getValue())));
                }
            }
        }
        String uri = buildUpon.build().toString();
        if (c6886ee2 == C6886ee.f23122e) {
            this.f22913a.mo16412a(uri);
            String valueOf = String.valueOf(uri);
            aph.m16391d(valueOf.length() != 0 ? "SendPixel: url = ".concat(valueOf) : new String("SendPixel: url = "));
        } else {
            String m16218d = aqf.m16218d(c6886ee2);
            this.f22913a.mo16411a(uri, m16218d);
            aph.m16391d(new StringBuilder(String.valueOf(uri).length() + 30 + String.valueOf(m16218d).length()).append("SendPixel: url = ").append(uri).append(", uniqueId = ").append(m16218d).toString());
        }
        return C6886ee.f23122e;
    }
}
