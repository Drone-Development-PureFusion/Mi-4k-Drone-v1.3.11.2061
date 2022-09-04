package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.C6850dm;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.dk */
/* loaded from: classes2.dex */
public final class C6846dk {

    /* renamed from: a */
    public static final AbstractC6845dj f23040a = new AbstractC6845dj() { // from class: com.google.android.gms.internal.dk.1
        @Override // com.google.android.gms.internal.AbstractC6845dj
        /* renamed from: a */
        public C6850dm mo16129a(byte[] bArr) {
            if (bArr == null) {
                throw new C6829de("Cannot parse a null byte[]");
            }
            if (bArr.length == 0) {
                throw new C6829de("Cannot parse a 0 length byte[]");
            }
            try {
                C6865dv m16155a = C6839dg.m16155a(new String(bArr));
                if (m16155a != null) {
                    aph.m16391d("The container was successfully parsed from the resource");
                }
                return new C6850dm(Status.f16786a, 0, new C6850dm.C6851a(m16155a), C6846dk.f23041b.mo16129a(bArr).m16124c());
            } catch (C6829de e) {
                throw new C6829de("The resource data is invalid. The container cannot be extracted from the JSON data");
            } catch (JSONException e2) {
                throw new C6829de("The resource data is corrupted. The container cannot be extracted from the JSON data");
            }
        }
    };

    /* renamed from: b */
    public static final AbstractC6845dj f23041b = new AbstractC6845dj() { // from class: com.google.android.gms.internal.dk.2
        @Override // com.google.android.gms.internal.AbstractC6845dj
        /* renamed from: a */
        public C6850dm mo16129a(byte[] bArr) {
            if (bArr == null) {
                throw new C6829de("Cannot parse a null byte[]");
            }
            if (bArr.length == 0) {
                throw new C6829de("Cannot parse a 0 length byte[]");
            }
            try {
                C6873dy m16150b = C6839dg.m16150b(new String(bArr));
                if (m16150b != null) {
                    aph.m16391d("The runtime configuration was successfully parsed from the resource");
                }
                return new C6850dm(Status.f16786a, 0, null, m16150b);
            } catch (C6829de e) {
                throw new C6829de("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
            } catch (JSONException e2) {
                throw new C6829de("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
            }
        }
    };
}
