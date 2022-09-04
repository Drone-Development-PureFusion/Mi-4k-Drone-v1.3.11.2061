package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* renamed from: com.google.android.gms.wearable.a */
/* loaded from: classes.dex */
public interface AbstractC9441a {

    /* renamed from: a */
    public static final String f29839a = "com.google.android.gms.wearable.CAPABILITY_CHANGED";

    /* renamed from: b */
    public static final int f29840b = 0;

    /* renamed from: c */
    public static final int f29841c = 1;

    /* renamed from: d */
    public static final int f29842d = 0;

    /* renamed from: e */
    public static final int f29843e = 1;

    /* renamed from: com.google.android.gms.wearable.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC9442a extends AbstractC4502m {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.a$b */
    /* loaded from: classes.dex */
    public @interface AbstractC9443b {
    }

    /* renamed from: com.google.android.gms.wearable.a$c */
    /* loaded from: classes.dex */
    public interface AbstractC9444c {
        /* renamed from: a */
        void mo7884a(AbstractC9452b abstractC9452b);
    }

    /* renamed from: com.google.android.gms.wearable.a$d */
    /* loaded from: classes.dex */
    public interface AbstractC9445d extends AbstractC4502m {
        /* renamed from: b */
        Map<String, AbstractC9452b> mo7881b();
    }

    /* renamed from: com.google.android.gms.wearable.a$e */
    /* loaded from: classes.dex */
    public interface AbstractC9446e extends AbstractC4502m {
        /* renamed from: b */
        AbstractC9452b mo7880b();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.a$f */
    /* loaded from: classes.dex */
    public @interface AbstractC9447f {
    }

    /* renamed from: com.google.android.gms.wearable.a$g */
    /* loaded from: classes.dex */
    public interface AbstractC9448g extends AbstractC4502m {
    }

    /* renamed from: a */
    AbstractC4494i<AbstractC9445d> mo7903a(AbstractC4489g abstractC4489g, int i);

    /* renamed from: a */
    AbstractC4494i<Status> mo7902a(AbstractC4489g abstractC4489g, AbstractC9444c abstractC9444c);

    /* renamed from: a */
    AbstractC4494i<Status> mo7901a(AbstractC4489g abstractC4489g, AbstractC9444c abstractC9444c, Uri uri, int i);

    /* renamed from: a */
    AbstractC4494i<Status> mo7900a(AbstractC4489g abstractC4489g, AbstractC9444c abstractC9444c, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC9442a> mo7898a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC9446e> mo7897a(AbstractC4489g abstractC4489g, String str, int i);

    /* renamed from: b */
    AbstractC4494i<Status> mo7895b(AbstractC4489g abstractC4489g, AbstractC9444c abstractC9444c, String str);

    /* renamed from: b */
    AbstractC4494i<AbstractC9448g> mo7894b(AbstractC4489g abstractC4489g, String str);
}
