package com.google.android.gms.games.snapshot;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
/* renamed from: com.google.android.gms.games.snapshot.g */
/* loaded from: classes2.dex */
public interface AbstractC6013g {

    /* renamed from: a */
    public static final String f20395a = "com.google.android.gms.games.SNAPSHOT_METADATA";

    /* renamed from: b */
    public static final String f20396b = "com.google.android.gms.games.SNAPSHOT_NEW";

    /* renamed from: c */
    public static final int f20397c = -1;

    /* renamed from: d */
    public static final int f20398d = -1;

    /* renamed from: e */
    public static final int f20399e = 1;

    /* renamed from: f */
    public static final int f20400f = 2;

    /* renamed from: g */
    public static final int f20401g = 3;

    /* renamed from: h */
    public static final int f20402h = 4;

    /* renamed from: com.google.android.gms.games.snapshot.g$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6014a extends AbstractC4502m {
        /* renamed from: c */
        SnapshotMetadata mo19072c();
    }

    /* renamed from: com.google.android.gms.games.snapshot.g$b */
    /* loaded from: classes2.dex */
    public interface AbstractC6015b extends AbstractC4502m {
        /* renamed from: b */
        String mo19071b();
    }

    /* renamed from: com.google.android.gms.games.snapshot.g$c */
    /* loaded from: classes2.dex */
    public interface AbstractC6016c extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        C6008c mo19070c();
    }

    /* renamed from: com.google.android.gms.games.snapshot.g$d */
    /* loaded from: classes2.dex */
    public interface AbstractC6017d extends AbstractC4502m {
        /* renamed from: c */
        Snapshot mo19069c();

        /* renamed from: d */
        String mo19068d();

        /* renamed from: e */
        Snapshot mo19067e();

        /* renamed from: f */
        SnapshotContents mo19066f();
    }

    /* renamed from: a */
    int mo19085a(AbstractC4489g abstractC4489g);

    /* renamed from: a */
    Intent mo19076a(AbstractC4489g abstractC4489g, String str, boolean z, boolean z2, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC6014a> mo19083a(AbstractC4489g abstractC4489g, Snapshot snapshot, AbstractC6009d abstractC6009d);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19082a(AbstractC4489g abstractC4489g, SnapshotMetadata snapshotMetadata);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19081a(AbstractC4489g abstractC4489g, SnapshotMetadata snapshotMetadata, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19080a(AbstractC4489g abstractC4489g, String str, Snapshot snapshot);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19079a(AbstractC4489g abstractC4489g, String str, String str2, AbstractC6009d abstractC6009d, SnapshotContents snapshotContents);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19078a(AbstractC4489g abstractC4489g, String str, boolean z);

    /* renamed from: a */
    AbstractC4494i<AbstractC6017d> mo19077a(AbstractC4489g abstractC4489g, String str, boolean z, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC6016c> mo19075a(AbstractC4489g abstractC4489g, boolean z);

    /* renamed from: a */
    SnapshotMetadata mo19086a(Bundle bundle);

    /* renamed from: a */
    void mo19084a(AbstractC4489g abstractC4489g, Snapshot snapshot);

    /* renamed from: b */
    int mo19074b(AbstractC4489g abstractC4489g);

    /* renamed from: b */
    AbstractC4494i<AbstractC6015b> mo19073b(AbstractC4489g abstractC4489g, SnapshotMetadata snapshotMetadata);
}
