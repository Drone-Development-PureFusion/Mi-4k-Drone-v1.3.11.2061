package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.android.gms.wearable.m */
/* loaded from: classes.dex */
public interface AbstractC9630m {

    /* renamed from: a */
    public static final String f30157a = "com.google.android.gms.wearable.MESSAGE_RECEIVED";

    /* renamed from: b */
    public static final int f30158b = 0;

    /* renamed from: c */
    public static final int f30159c = 1;

    /* renamed from: d */
    public static final int f30160d = -1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.m$a */
    /* loaded from: classes.dex */
    public @interface AbstractC9631a {
    }

    /* renamed from: com.google.android.gms.wearable.m$b */
    /* loaded from: classes.dex */
    public interface AbstractC9632b {
        /* renamed from: a */
        void mo7574a(AbstractC9634n abstractC9634n);
    }

    /* renamed from: com.google.android.gms.wearable.m$c */
    /* loaded from: classes.dex */
    public interface AbstractC9633c extends AbstractC4502m {
        /* renamed from: b */
        int mo7573b();
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo7578a(AbstractC4489g abstractC4489g, AbstractC9632b abstractC9632b);

    /* renamed from: a */
    AbstractC4494i<Status> mo7577a(AbstractC4489g abstractC4489g, AbstractC9632b abstractC9632b, Uri uri, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC9633c> mo7576a(AbstractC4489g abstractC4489g, String str, String str2, byte[] bArr);

    /* renamed from: b */
    AbstractC4494i<Status> mo7575b(AbstractC4489g abstractC4489g, AbstractC9632b abstractC9632b);
}
