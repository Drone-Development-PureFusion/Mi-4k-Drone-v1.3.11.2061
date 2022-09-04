package com.google.android.gms.location.places.internal;

import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C6982fr;
import com.google.android.gms.internal.C7648rc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.google.android.gms.location.places.internal.t */
/* loaded from: classes2.dex */
public abstract class AbstractC8287t extends AbstractC4531j {
    public AbstractC8287t(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public float m12163a(String str, float f) {
        return (!m_(str) || i(str)) ? f : f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public int m12162a(String str, int i) {
        return (!m_(str) || i(str)) ? i : c(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public long m12161a(String str, long j) {
        return (!m_(str) || i(str)) ? j : b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public <E extends SafeParcelable> E m12160a(String str, Parcelable.Creator<E> creator) {
        byte[] m12155a = m12155a(str, (byte[]) null);
        if (m12155a == null) {
            return null;
        }
        return (E) C4631c.m23442a(m12155a, creator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m12158a(String str, String str2) {
        return (!m_(str) || i(str)) ? str2 : e(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public <E extends SafeParcelable> List<E> m12159a(String str, Parcelable.Creator<E> creator, List<E> list) {
        byte[] m12155a = m12155a(str, (byte[]) null);
        if (m12155a == null) {
            return list;
        }
        try {
            C6982fr m15839a = C6982fr.m15839a(m12155a);
            if (m15839a.f23668c == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(m15839a.f23668c.length);
            byte[][] bArr = m15839a.f23668c;
            for (byte[] bArr2 : bArr) {
                arrayList.add(C4631c.m23442a(bArr2, creator));
            }
            return arrayList;
        } catch (C7648rc e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public List<Integer> m12157a(String str, List<Integer> list) {
        byte[] m12155a = m12155a(str, (byte[]) null);
        if (m12155a == null) {
            return list;
        }
        try {
            C6982fr m15839a = C6982fr.m15839a(m12155a);
            if (m15839a.f23667b == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(m15839a.f23667b.length);
            for (int i = 0; i < m15839a.f23667b.length; i++) {
                arrayList.add(Integer.valueOf(m15839a.f23667b[i]));
            }
            return arrayList;
        } catch (C7648rc e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m12156a(String str, boolean z) {
        return (!m_(str) || i(str)) ? z : d(str);
    }

    /* renamed from: a */
    protected byte[] m12155a(String str, byte[] bArr) {
        return (!m_(str) || i(str)) ? bArr : g(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public List<String> m12154b(String str, List<String> list) {
        byte[] m12155a = m12155a(str, (byte[]) null);
        if (m12155a == null) {
            return list;
        }
        try {
            C6982fr m15839a = C6982fr.m15839a(m12155a);
            return m15839a.f23666a != null ? Arrays.asList(m15839a.f23666a) : list;
        } catch (C7648rc e) {
            if (!Log.isLoggable("SafeDataBufferRef", 6)) {
                return list;
            }
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", e);
            return list;
        }
    }
}
