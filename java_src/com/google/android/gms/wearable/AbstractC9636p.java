package com.google.android.gms.wearable;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
import java.util.List;
/* renamed from: com.google.android.gms.wearable.p */
/* loaded from: classes.dex */
public interface AbstractC9636p {

    /* renamed from: com.google.android.gms.wearable.p$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9637a extends AbstractC4502m {
        /* renamed from: b */
        List<AbstractC9635o> mo7561b();
    }

    /* renamed from: com.google.android.gms.wearable.p$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9638b extends AbstractC4502m {
        /* renamed from: b */
        AbstractC9635o mo7560b();
    }

    @Deprecated
    /* renamed from: com.google.android.gms.wearable.p$c */
    /* loaded from: classes.dex */
    public interface AbstractC9639c {
        @Deprecated
        /* renamed from: a */
        void mo7559a(AbstractC9635o abstractC9635o);

        @Deprecated
        /* renamed from: b */
        void mo7558b(AbstractC9635o abstractC9635o);
    }

    /* renamed from: a */
    AbstractC4494i<AbstractC9638b> mo7565a(AbstractC4489g abstractC4489g);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo7564a(AbstractC4489g abstractC4489g, AbstractC9639c abstractC9639c);

    /* renamed from: b */
    AbstractC4494i<AbstractC9637a> mo7563b(AbstractC4489g abstractC4489g);

    @Deprecated
    /* renamed from: b */
    AbstractC4494i<Status> mo7562b(AbstractC4489g abstractC4489g, AbstractC9639c abstractC9639c);
}
