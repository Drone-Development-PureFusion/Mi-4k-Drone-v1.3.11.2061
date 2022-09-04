package com.google.android.gms.wearable;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* renamed from: com.google.android.gms.wearable.c */
/* loaded from: classes.dex */
public interface AbstractC9453c {

    /* renamed from: a */
    public static final String f29844a = "com.google.android.gms.wearable.CHANNEL_EVENT";

    /* renamed from: com.google.android.gms.wearable.c$a */
    /* loaded from: classes.dex */
    public interface AbstractC9454a {

        /* renamed from: a */
        public static final int f29845a = 0;

        /* renamed from: b */
        public static final int f29846b = 1;

        /* renamed from: c */
        public static final int f29847c = 2;

        /* renamed from: d */
        public static final int f29848d = 3;

        /* renamed from: a */
        void mo7994a(Channel channel);

        /* renamed from: a */
        void mo7993a(Channel channel, int i, int i2);

        /* renamed from: b */
        void mo7992b(Channel channel, int i, int i2);

        /* renamed from: c */
        void mo7991c(Channel channel, int i, int i2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.wearable.c$b */
    /* loaded from: classes.dex */
    public @interface AbstractC9455b {
    }

    /* renamed from: com.google.android.gms.wearable.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC9456c extends AbstractC4502m {
        /* renamed from: b */
        Channel mo7867b();
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo7874a(AbstractC4489g abstractC4489g, AbstractC9454a abstractC9454a);

    /* renamed from: a */
    AbstractC4494i<AbstractC9456c> mo7873a(AbstractC4489g abstractC4489g, String str, String str2);

    /* renamed from: b */
    AbstractC4494i<Status> mo7871b(AbstractC4489g abstractC4489g, AbstractC9454a abstractC9454a);
}
