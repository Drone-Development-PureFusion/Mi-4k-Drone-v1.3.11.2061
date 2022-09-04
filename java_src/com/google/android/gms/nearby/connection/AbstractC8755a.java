package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C4683f;
import java.util.List;
/* renamed from: com.google.android.gms.nearby.connection.a */
/* loaded from: classes.dex */
public interface AbstractC8755a {

    /* renamed from: c */
    public static final long f28048c = 0;

    /* renamed from: d */
    public static final int f28049d = 1168;

    /* renamed from: e */
    public static final int f28050e = 4096;

    /* renamed from: f */
    public static final List<Integer> f28051f = C4683f.m23150a(1, 2);

    /* renamed from: com.google.android.gms.nearby.connection.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8756a {
        /* renamed from: a */
        void m10210a(String str, String str2, String str3, byte[] bArr);
    }

    /* renamed from: com.google.android.gms.nearby.connection.a$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8757b {
        /* renamed from: a */
        void m10209a(String str, Status status, byte[] bArr);
    }

    /* renamed from: com.google.android.gms.nearby.connection.a$c */
    /* loaded from: classes2.dex */
    public interface AbstractC8758c {
        /* renamed from: a */
        void m10208a(String str);

        /* renamed from: a */
        void m10207a(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.google.android.gms.nearby.connection.a$d */
    /* loaded from: classes2.dex */
    public interface AbstractC8759d {
        /* renamed from: a */
        void m10206a(String str);

        /* renamed from: a */
        void m10205a(String str, byte[] bArr, boolean z);
    }

    /* renamed from: com.google.android.gms.nearby.connection.a$e */
    /* loaded from: classes2.dex */
    public interface AbstractC8760e extends AbstractC4502m {
        /* renamed from: b */
        String mo10204b();
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo10223a(AbstractC4489g abstractC4489g, String str, long j, AbstractC8758c abstractC8758c);

    /* renamed from: a */
    AbstractC4494i<AbstractC8760e> mo10222a(AbstractC4489g abstractC4489g, String str, AppMetadata appMetadata, long j, AbstractC8756a abstractC8756a);

    /* renamed from: a */
    AbstractC4494i<Status> mo10221a(AbstractC4489g abstractC4489g, String str, String str2, byte[] bArr, AbstractC8757b abstractC8757b, AbstractC8759d abstractC8759d);

    /* renamed from: a */
    AbstractC4494i<Status> mo10219a(AbstractC4489g abstractC4489g, String str, byte[] bArr, AbstractC8759d abstractC8759d);

    @Deprecated
    /* renamed from: a */
    String mo10225a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    void mo10224a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    void mo10220a(AbstractC4489g abstractC4489g, String str, byte[] bArr);

    /* renamed from: a */
    void mo10218a(AbstractC4489g abstractC4489g, List<String> list, byte[] bArr);

    /* renamed from: b */
    AbstractC4494i<Status> mo10216b(AbstractC4489g abstractC4489g, String str);

    @Deprecated
    /* renamed from: b */
    String mo10217b(AbstractC4489g abstractC4489g);

    /* renamed from: b */
    void mo10215b(AbstractC4489g abstractC4489g, String str, byte[] bArr);

    /* renamed from: b */
    void mo10214b(AbstractC4489g abstractC4489g, List<String> list, byte[] bArr);

    /* renamed from: c */
    void mo10213c(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    void mo10212c(AbstractC4489g abstractC4489g, String str);

    /* renamed from: d */
    void mo10211d(AbstractC4489g abstractC4489g);
}
