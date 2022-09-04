package com.google.android.gms.games.quest;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
/* renamed from: com.google.android.gms.games.quest.f */
/* loaded from: classes2.dex */
public interface AbstractC5991f {

    /* renamed from: a */
    public static final int f20315a = 1;

    /* renamed from: b */
    public static final int f20316b = 2;

    /* renamed from: c */
    public static final int f20317c = 3;

    /* renamed from: d */
    public static final int f20318d = 4;

    /* renamed from: e */
    public static final int f20319e = 101;

    /* renamed from: f */
    public static final int f20320f = 5;

    /* renamed from: g */
    public static final int f20321g = 102;

    /* renamed from: h */
    public static final int f20322h = 6;

    /* renamed from: i */
    public static final int f20323i = 103;

    /* renamed from: j */
    public static final int[] f20324j = {1, 2, 3, 4, 101, 5, 102, 6, 103};

    /* renamed from: k */
    public static final int f20325k = 0;

    /* renamed from: l */
    public static final int f20326l = 1;

    /* renamed from: m */
    public static final String f20327m = "quest";

    /* renamed from: com.google.android.gms.games.quest.f$a */
    /* loaded from: classes2.dex */
    public interface AbstractC5992a extends AbstractC4502m {
        /* renamed from: c */
        Quest mo19195c();
    }

    /* renamed from: com.google.android.gms.games.quest.f$b */
    /* loaded from: classes2.dex */
    public interface AbstractC5993b extends AbstractC4502m {
        /* renamed from: c */
        Milestone mo19194c();

        /* renamed from: d */
        Quest mo19193d();
    }

    /* renamed from: com.google.android.gms.games.quest.f$c */
    /* loaded from: classes2.dex */
    public interface AbstractC5994c extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        C5988c mo19192c();
    }

    /* renamed from: a */
    Intent mo19202a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    Intent mo19199a(AbstractC4489g abstractC4489g, int[] iArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC5993b> mo19201a(AbstractC4489g abstractC4489g, String str, String str2);

    /* renamed from: a */
    AbstractC4494i<AbstractC5994c> mo19200a(AbstractC4489g abstractC4489g, boolean z, String... strArr);

    /* renamed from: a */
    AbstractC4494i<AbstractC5994c> mo19198a(AbstractC4489g abstractC4489g, int[] iArr, int i, boolean z);

    /* renamed from: a */
    void mo19204a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    void mo19203a(AbstractC4489g abstractC4489g, AbstractC5990e abstractC5990e);

    /* renamed from: b */
    AbstractC4494i<AbstractC5992a> mo19197b(AbstractC4489g abstractC4489g, String str);

    /* renamed from: c */
    void mo19196c(AbstractC4489g abstractC4489g, String str);
}
