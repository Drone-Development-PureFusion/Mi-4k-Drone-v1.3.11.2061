package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
/* renamed from: com.google.android.gms.internal.oc */
/* loaded from: classes2.dex */
public final class C7477oc {
    /* renamed from: a */
    public AbstractC7471nx m14356a(C7598pp c7598pp) {
        boolean m14136p = c7598pp.m14136p();
        m14136p = true;
        try {
            try {
                return C7527oz.m14270a(c7598pp);
            } catch (OutOfMemoryError e) {
                String valueOf = String.valueOf(c7598pp);
                throw new C7476ob(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Failed parsing JSON source: ").append(valueOf).append(" to Json").toString(), e);
            } catch (StackOverflowError e2) {
                String valueOf2 = String.valueOf(c7598pp);
                throw new C7476ob(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("Failed parsing JSON source: ").append(valueOf2).append(" to Json").toString(), e2);
            }
        } finally {
            c7598pp.m14159a(m14136p);
        }
    }

    /* renamed from: a */
    public AbstractC7471nx m14355a(Reader reader) {
        try {
            C7598pp c7598pp = new C7598pp(reader);
            AbstractC7471nx m14356a = m14356a(c7598pp);
            if (m14356a.m14368k() || c7598pp.mo14146f() == EnumC7600pq.END_DOCUMENT) {
                return m14356a;
            }
            throw new C7481og("Did not consume the entire document.");
        } catch (C7603pt e) {
            throw new C7481og(e);
        } catch (IOException e2) {
            throw new C7472ny(e2);
        } catch (NumberFormatException e3) {
            throw new C7481og(e3);
        }
    }

    /* renamed from: a */
    public AbstractC7471nx m14354a(String str) {
        return m14355a(new StringReader(str));
    }
}
