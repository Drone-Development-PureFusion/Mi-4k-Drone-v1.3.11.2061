package com.google.android.gms.awareness.state;

import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* loaded from: classes2.dex */
public interface BeaconState {

    /* loaded from: classes2.dex */
    public static abstract class TypeFilter extends AbstractSafeParcelable {
        /* renamed from: a */
        public static TypeFilter m25359a(String str, String str2) {
            return new BeaconStateImpl.TypeFilterImpl(str, str2);
        }

        /* renamed from: a */
        public static TypeFilter m25358a(String str, String str2, byte[] bArr) {
            return new BeaconStateImpl.TypeFilterImpl(str, str2, bArr);
        }
    }

    /* renamed from: com.google.android.gms.awareness.state.BeaconState$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4140a {
        /* renamed from: a */
        String mo25357a();

        /* renamed from: b */
        String mo25356b();

        /* renamed from: c */
        byte[] mo25355c();
    }

    /* renamed from: a */
    List<AbstractC4140a> mo25360a();
}
