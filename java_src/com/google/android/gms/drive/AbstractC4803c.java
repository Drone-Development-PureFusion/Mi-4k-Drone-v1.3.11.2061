package com.google.android.gms.drive;

import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4487e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.query.Query;
import java.util.List;
/* renamed from: com.google.android.gms.drive.c */
/* loaded from: classes.dex */
public interface AbstractC4803c {

    /* renamed from: com.google.android.gms.drive.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4804a extends AbstractC4502m {
        /* renamed from: c */
        AbstractC4807d mo22452c();
    }

    /* renamed from: com.google.android.gms.drive.c$b */
    /* loaded from: classes2.dex */
    public interface AbstractC4805b extends AbstractC4502m {
        /* renamed from: b */
        DriveId mo22450b();
    }

    /* renamed from: com.google.android.gms.drive.c$c */
    /* loaded from: classes2.dex */
    public interface AbstractC4806c extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        C4989m mo22448c();
    }

    /* renamed from: a */
    AbstractC4494i<AbstractC4804a> mo22470a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    AbstractC4494i<AbstractC4806c> mo22467a(AbstractC4489g abstractC4489g, Query query);

    /* renamed from: a */
    AbstractC4494i<AbstractC4805b> mo22466a(AbstractC4489g abstractC4489g, String str);

    @Deprecated
    /* renamed from: a */
    AbstractC4494i<Status> mo22465a(AbstractC4489g abstractC4489g, List<String> list);

    @Deprecated
    /* renamed from: a */
    AbstractC4808e mo22468a(AbstractC4489g abstractC4489g, DriveId driveId);

    /* renamed from: a */
    C5023o mo22471a();

    /* renamed from: b */
    C4795a mo22464b();

    /* renamed from: b */
    AbstractC4836f mo22463b(AbstractC4489g abstractC4489g);

    @Deprecated
    /* renamed from: b */
    AbstractC4836f mo22462b(AbstractC4489g abstractC4489g, DriveId driveId);

    /* renamed from: c */
    AbstractC4836f mo22461c(AbstractC4489g abstractC4489g);

    /* renamed from: d */
    AbstractC4494i<Status> mo22460d(AbstractC4489g abstractC4489g);

    @Deprecated
    /* renamed from: e */
    AbstractC4494i<C4487e> mo22459e(AbstractC4489g abstractC4489g);
}
