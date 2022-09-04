package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4500k;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.games.internal.player.StockProfileImage;
/* renamed from: com.google.android.gms.games.n */
/* loaded from: classes.dex */
public interface AbstractC5978n {

    /* renamed from: a */
    public static final String f20277a = "player_search_results";

    /* renamed from: com.google.android.gms.games.n$a */
    /* loaded from: classes.dex */
    public interface AbstractC5979a extends AbstractC4500k, AbstractC4502m {
        /* renamed from: c */
        C5932j mo19258c();
    }

    /* renamed from: com.google.android.gms.games.n$b */
    /* loaded from: classes2.dex */
    public interface AbstractC5980b extends AbstractC4502m {
        /* renamed from: b */
        boolean mo19257b();

        /* renamed from: c */
        boolean mo19256c();

        /* renamed from: d */
        String mo19255d();

        /* renamed from: e */
        StockProfileImage mo19254e();

        /* renamed from: f */
        boolean mo19253f();

        /* renamed from: g */
        boolean mo19252g();

        /* renamed from: h */
        boolean mo19251h();
    }

    /* renamed from: com.google.android.gms.games.n$c */
    /* loaded from: classes2.dex */
    public interface AbstractC5981c extends AbstractC4500k, AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.n$d */
    /* loaded from: classes2.dex */
    public interface AbstractC5982d extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.n$e */
    /* loaded from: classes2.dex */
    public interface AbstractC5983e extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.n$f */
    /* loaded from: classes2.dex */
    public interface AbstractC5984f extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.n$g */
    /* loaded from: classes2.dex */
    public interface AbstractC5985g extends AbstractC4502m {
    }

    /* renamed from: a */
    Intent mo19266a(AbstractC4489g abstractC4489g, Player player);

    /* renamed from: a */
    AbstractC4494i<AbstractC5979a> mo19268a(AbstractC4489g abstractC4489g, int i);

    /* renamed from: a */
    AbstractC4494i<AbstractC5979a> mo19267a(AbstractC4489g abstractC4489g, int i, boolean z);

    /* renamed from: a */
    AbstractC4494i<AbstractC5979a> mo19265a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: a */
    AbstractC4494i<AbstractC5979a> mo19264a(AbstractC4489g abstractC4489g, String str, boolean z);

    /* renamed from: a */
    AbstractC4494i<AbstractC5979a> mo19263a(AbstractC4489g abstractC4489g, boolean z);

    /* renamed from: a */
    String mo19269a(AbstractC4489g abstractC4489g);

    /* renamed from: b */
    AbstractC4494i<AbstractC5979a> mo19261b(AbstractC4489g abstractC4489g, int i);

    /* renamed from: b */
    AbstractC4494i<AbstractC5979a> mo19260b(AbstractC4489g abstractC4489g, int i, boolean z);

    /* renamed from: b */
    Player mo19262b(AbstractC4489g abstractC4489g);

    /* renamed from: c */
    Intent mo19259c(AbstractC4489g abstractC4489g);
}
