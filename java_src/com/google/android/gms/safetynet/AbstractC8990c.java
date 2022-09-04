package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import java.util.List;
/* renamed from: com.google.android.gms.safetynet.c */
/* loaded from: classes2.dex */
public interface AbstractC8990c {

    /* renamed from: com.google.android.gms.safetynet.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8991a extends AbstractC4502m {
        /* renamed from: b */
        String mo9427b();
    }

    /* renamed from: com.google.android.gms.safetynet.c$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8992b extends AbstractC4502m {
        /* renamed from: b */
        String mo9426b();

        /* renamed from: c */
        List<C8987a> mo9425c();
    }

    /* renamed from: com.google.android.gms.safetynet.c$c */
    /* loaded from: classes2.dex */
    public interface AbstractC8993c extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.safetynet.c$d */
    /* loaded from: classes2.dex */
    public interface AbstractC8994d extends AbstractC4502m {
    }

    /* renamed from: a */
    AbstractC4494i<AbstractC8994d> mo9433a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<AbstractC8992b> mo9432a(AbstractC4489g abstractC4489g, String str, int... iArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC8992b> mo9431a(AbstractC4489g abstractC4489g, List<Integer> list, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC8991a> mo9430a(AbstractC4489g abstractC4489g, byte[] bArr);

    /* renamed from: a */
    boolean mo9434a(Context context);

    /* renamed from: a */
    boolean mo9429a(String str, int... iArr);

    /* renamed from: b */
    AbstractC4494i<AbstractC8993c> mo9428b(AbstractC4489g abstractC4489g);
}
