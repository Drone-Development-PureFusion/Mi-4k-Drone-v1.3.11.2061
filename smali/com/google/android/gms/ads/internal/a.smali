.class public abstract Lcom/google/android/gms/ads/internal/a;
.super Lcom/google/android/gms/ads/internal/client/ak$a;

# interfaces
.implements Lcom/google/android/gms/ads/internal/client/a;
.implements Lcom/google/android/gms/ads/internal/overlay/p;
.implements Lcom/google/android/gms/ads/internal/request/a$a;
.implements Lcom/google/android/gms/internal/abn;
.implements Lcom/google/android/gms/internal/vp;
.implements Lcom/google/android/gms/internal/zn$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field protected a:Lcom/google/android/gms/internal/un;

.field protected b:Lcom/google/android/gms/internal/ul;

.field protected c:Lcom/google/android/gms/internal/ul;

.field protected d:Z

.field protected final e:Lcom/google/android/gms/ads/internal/r;

.field protected final f:Lcom/google/android/gms/ads/internal/v;

.field protected transient g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected final h:Lcom/google/android/gms/internal/ti;

.field protected final i:Lcom/google/android/gms/ads/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/v;Lcom/google/android/gms/ads/internal/r;Lcom/google/android/gms/ads/internal/d;)V
    .locals 3
    .param p2    # Lcom/google/android/gms/ads/internal/r;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/ak$a;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    if-eqz p2, :cond_0

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/a;->e:Lcom/google/android/gms/ads/internal/r;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/a;->i:Lcom/google/android/gms/ads/internal/d;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abv;->b(Landroid/content/Context;)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/abl;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->j()Lcom/google/android/gms/ads/internal/cache/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/cache/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->p()Lcom/google/android/gms/internal/ti;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/a;->h:Lcom/google/android/gms/internal/ti;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->h()Lcom/google/android/gms/internal/tp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/tp;->a(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/a;->u()V

    return-void

    :cond_0
    new-instance p2, Lcom/google/android/gms/ads/internal/r;

    invoke-direct {p2, p0}, Lcom/google/android/gms/ads/internal/r;-><init>(Lcom/google/android/gms/ads/internal/a;)V

    goto :goto_0
.end method

.method private a(Ljava/util/Timer;Ljava/util/concurrent/CountDownLatch;)Ljava/util/TimerTask;
    .locals 1

    new-instance v0, Lcom/google/android/gms/ads/internal/a$1;

    invoke-direct {v0, p0, p2, p1}, Lcom/google/android/gms/ads/internal/a$1;-><init>(Lcom/google/android/gms/ads/internal/a;Ljava/util/concurrent/CountDownLatch;Ljava/util/Timer;)V

    return-object v0
.end method

.method private d(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/common/util/i;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->k:Landroid/location/Location;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/w;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/w;-><init>(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/w;->a(Landroid/location/Location;)Lcom/google/android/gms/ads/internal/client/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/w;->a()Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private d(Lcom/google/android/gms/internal/abi;)V
    .locals 5

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->m()Lcom/google/android/gms/internal/abz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abz;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/abi;->H:Z

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Sending troubleshooting signals to the server."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->m()Lcom/google/android/gms/internal/abz;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->D:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/abz;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/gms/internal/abi;->H:Z

    goto :goto_0
.end method

.method private u()V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/uf;->bT:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    sget-object v1, Lcom/google/android/gms/internal/uf;->bV:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-direct {p0, v0, v2}, Lcom/google/android/gms/ads/internal/a;->a(Ljava/util/Timer;Ljava/util/concurrent/CountDownLatch;)Ljava/util/TimerTask;

    move-result-object v1

    const-wide/16 v2, 0x0

    sget-object v4, Lcom/google/android/gms/internal/uf;->bU:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/internal/tq;)Landroid/os/Bundle;
    .locals 6
    .param p1    # Lcom/google/android/gms/internal/tq;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v1, 0x0

    if-nez p1, :cond_1

    move-object v0, v1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/tq;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/tq;->d()V

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/tq;->c()Lcom/google/android/gms/internal/tn;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tn;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tn;->c()Ljava/lang/String;

    move-result-object v2

    const-string v4, "In AdManager: loadAd, "

    invoke-virtual {v0}, Lcom/google/android/gms/internal/tn;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    if-eqz v3, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/abl;->a(Ljava/lang/String;)Ljava/util/concurrent/Future;

    :cond_3
    :goto_2
    if-eqz v3, :cond_6

    new-instance v0, Landroid/os/Bundle;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    const-string v1, "fingerprint"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "v_fp"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->i()Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v3, v0

    goto :goto_2

    :cond_6
    move-object v0, v1

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/c/e;
    .locals 1

    const-string v0, "getAdFrame must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method protected a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Failed to load ad: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/ag;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/reward/client/d;->a(I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected a(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->g()Lcom/google/android/gms/internal/abw;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/abw;->d()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/ads/internal/v$a;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V
    .locals 2

    const-string v0, "setAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget v0, v0, Lcom/google/android/gms/ads/internal/v;->E:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/acy;->a(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/v$a;->getNextView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->removeView(Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->g:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->setMinimumWidth(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    iget v1, p1, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->d:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v$a;->setMinimumHeight(I)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->requestLayout()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "setVideoOptions must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->x:Lcom/google/android/gms/ads/internal/client/VideoOptionsParcel;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/af;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->m:Lcom/google/android/gms/ads/internal/client/af;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/ag;)V
    .locals 1

    const-string v0, "setAdListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/am;)V
    .locals 1

    const-string v0, "setAppEventListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->o:Lcom/google/android/gms/ads/internal/client/am;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/ao;)V
    .locals 1

    const-string v0, "setCorrelationIdProvider must be called on the main UI thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->p:Lcom/google/android/gms/ads/internal/client/ao;

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/internal/reward/client/d;)V
    .locals 1

    const-string v0, "setRewardedVideoAdListener can only be called from the UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    return-void
.end method

.method protected a(Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    const-string v1, ""

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;->b:Ljava/lang/String;

    iget v0, p1, Lcom/google/android/gms/ads/internal/reward/mediation/client/RewardItemParcel;->c:I

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    new-instance v3, Lcom/google/android/gms/internal/aas;

    invoke-direct {v3, v1, v0}, Lcom/google/android/gms/internal/aas;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/ads/internal/reward/client/d;->a(Lcom/google/android/gms/ads/internal/reward/client/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onRewarded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/abi$a;)V
    .locals 8

    const-wide/16 v2, -0x1

    const/4 v7, 0x1

    const/4 v6, 0x0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->n:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->y:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->y:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/a;->b(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v4, v3, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->n:J

    add-long/2addr v0, v4

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/un;->a(J)Lcom/google/android/gms/internal/ul;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "stc"

    aput-object v3, v2, v6

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    iget-object v1, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->b:Lcom/google/android/gms/internal/ul;

    new-array v2, v7, [Ljava/lang/String;

    const-string v3, "arf"

    aput-object v3, v2, v6

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/un;->a()Lcom/google/android/gms/internal/ul;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/a;->c:Lcom/google/android/gms/internal/ul;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    const-string v1, "gqi"

    iget-object v2, p1, Lcom/google/android/gms/internal/abi$a;->b:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->k:Lcom/google/android/gms/internal/abi$a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/a;->a(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/un;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/un;)V
.end method

.method public a(Lcom/google/android/gms/internal/ur;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setOnCustomRenderedAdLoadedListener is not supported for current ad type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/yy;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setInAppPurchaseListener is not supported for current ad type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setPlayStorePurchaseParams is not supported for current ad type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "RewardedVideoAd.setUserId() is deprecated. Please do not call this method."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->o:Lcom/google/android/gms/ads/internal/client/am;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->o:Lcom/google/android/gms/ads/internal/client/am;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/am;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Ljava/util/HashSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet",
            "<",
            "Lcom/google/android/gms/internal/abj;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/v;->a(Ljava/util/HashSet;)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Attempt to call setManualImpressionsEnabled for an unsupported ad type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 4

    const-string v0, "loadAd must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->j()Lcom/google/android/gms/ads/internal/cache/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/cache/a;->a()V

    sget-object v0, Lcom/google/android/gms/internal/uf;->at:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/a;->d(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    if-eqz v1, :cond_3

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    if-eqz v1, :cond_2

    const-string v1, "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes."

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/ads/internal/a;->g:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    const/4 v0, 0x0

    :goto_1
    return v0

    :cond_2
    const-string v1, "Loading already in progress, saving this object for future refreshes."

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v1, "Starting ad request."

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/a;->o()V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/un;->a()Lcom/google/android/gms/internal/ul;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/a;->b:Lcom/google/android/gms/internal/ul;

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/client/AdRequestParcel;->f:Z

    if-nez v1, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/util/client/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x47

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Use AdRequest.Builder.addTestDevice(\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\") to get test ads on this device."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/r;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/ads/internal/a;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/un;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    goto :goto_1
.end method

.method protected abstract a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/un;)Z
.end method

.method a(Lcom/google/android/gms/internal/abi;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected abstract a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z
    .param p1    # Lcom/google/android/gms/internal/abi;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method

.method b(Ljava/lang/String;)J
    .locals 3

    const-string v0, "ufe"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const/16 v0, 0x2c

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_0
    add-int/lit8 v1, v1, 0x4

    :try_start_0
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-string v0, "Invalid index for Url fetch time in CSI latency info."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :goto_1
    const-wide/16 v0, -0x1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v0, "Cannot find valid format of Url fetch time in CSI latency info."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b()V
    .locals 2

    const-string v0, "destroy must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/r;->a()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->c(Lcom/google/android/gms/internal/abi;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v;->j()V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/abi;)V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, -0x2

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->c:Lcom/google/android/gms/internal/ul;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "awr"

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    if-eq v0, v5, :cond_0

    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/v;->a()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/abl;->a(Ljava/util/HashSet;)V

    :cond_0
    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iput-boolean v4, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/a;->a(Lcom/google/android/gms/internal/abi;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Ad refresh scheduled."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    :cond_3
    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    if-eq v0, v5, :cond_4

    iget v0, p1, Lcom/google/android/gms/internal/abi;->d:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/a;->a(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->C:Lcom/google/android/gms/internal/abo;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    new-instance v1, Lcom/google/android/gms/internal/abo;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/abo;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lcom/google/android/gms/ads/internal/v;->C:Lcom/google/android/gms/internal/abo;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->h:Lcom/google/android/gms/internal/ti;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ti;->b(Lcom/google/android/gms/internal/abi;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/ads/internal/a;->a(Lcom/google/android/gms/internal/abi;Lcom/google/android/gms/internal/abi;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v;->i()V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    const-string v2, "is_mraid"

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abi;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "1"

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    const-string v2, "is_mediation"

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/abi;->n:Z

    if-eqz v0, :cond_a

    const-string v0, "1"

    :goto_2
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    const-string v2, "is_delay_pl"

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->b:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/acz;->f()Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "1"

    :goto_3
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/un;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->b:Lcom/google/android/gms/internal/ul;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "ttc"

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->e()Lcom/google/android/gms/internal/uh;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->i()Lcom/google/android/gms/internal/abl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abl;->e()Lcom/google/android/gms/internal/uh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/uh;->a(Lcom/google/android/gms/internal/un;)Z

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/a;->s()V

    :cond_8
    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->I:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p1, Lcom/google/android/gms/internal/abi;->I:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/util/List;)V

    goto/16 :goto_0

    :cond_9
    const-string v0, "0"

    goto/16 :goto_1

    :cond_a
    const-string v0, "0"

    goto :goto_2

    :cond_b
    const-string v0, "0"

    goto :goto_3
.end method

.method protected b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->f:Lcom/google/android/gms/ads/internal/v$a;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/v$a;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/abv;->a(Landroid/view/View;Landroid/content/Context;)Z

    move-result v0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/a;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/a;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    :goto_0
    return-void

    :cond_0
    const-string v0, "Ad is not visible. Not refreshing ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->e:Lcom/google/android/gms/ads/internal/r;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/r;->b(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    goto :goto_0
.end method

.method protected c(Lcom/google/android/gms/internal/abi;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/internal/abi;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_1

    const-string v0, "Ad state was null when trying to ping impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging Impression URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abj;->a()V

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/internal/abi;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/abi;->F:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/internal/abi;->e:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/gms/internal/abi;->F:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/a;->d(Lcom/google/android/gms/internal/abi;)V

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    const-string v0, "isLoaded must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->g:Lcom/google/android/gms/internal/abq;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->h:Lcom/google/android/gms/internal/abx;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 1

    const-string v0, "pause must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method public e()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging click URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->l:Lcom/google/android/gms/internal/abj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/abj;->b()V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->c:Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v3, v3, Lcom/google/android/gms/internal/abi;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->m:Lcom/google/android/gms/ads/internal/client/af;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->m:Lcom/google/android/gms/ads/internal/client/af;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/af;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onAdClicked event."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public h()V
    .locals 4

    const-string v0, "recordManualImpression must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    if-nez v0, :cond_1

    const-string v0, "Ad state was null when trying to ping manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "Pinging manual tracking URLs."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v0, v0, Lcom/google/android/gms/internal/abi;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/abi;->G:Z

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/v;->e:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    iget-object v3, v3, Lcom/google/android/gms/internal/abi;->f:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/abv;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/abi;->G:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->j:Lcom/google/android/gms/internal/abi;

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/a;->d(Lcom/google/android/gms/internal/abi;)V

    goto :goto_0
.end method

.method public h_()V
    .locals 1

    const-string v0, "resume must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method public i()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "getAdSize must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/ads/internal/client/ThinAdSizeParcel;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/client/ThinAdSizeParcel;-><init>(Lcom/google/android/gms/ads/internal/client/AdSizeParcel;)V

    goto :goto_0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    return v0
.end method

.method public l()Lcom/google/android/gms/ads/internal/client/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l_()V
    .locals 2

    const-string v0, "stopLoading must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/v;->a(Z)V

    return-void
.end method

.method public m()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/a;->q()V

    return-void
.end method

.method public n()Lcom/google/android/gms/ads/internal/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->i:Lcom/google/android/gms/ads/internal/d;

    return-object v0
.end method

.method public o()V
    .locals 8

    const-wide/16 v6, -0x1

    const/4 v4, 0x0

    new-instance v1, Lcom/google/android/gms/internal/un;

    sget-object v0, Lcom/google/android/gms/internal/uf;->N:Lcom/google/android/gms/internal/ub;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ub;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v2, "load_ad"

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/v;->i:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->b:Ljava/lang/String;

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/internal/un;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/un;

    new-instance v0, Lcom/google/android/gms/internal/ul;

    invoke-direct {v0, v6, v7, v4, v4}, Lcom/google/android/gms/internal/ul;-><init>(JLjava/lang/String;Lcom/google/android/gms/internal/ul;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/a;->b:Lcom/google/android/gms/internal/ul;

    new-instance v0, Lcom/google/android/gms/internal/ul;

    invoke-direct {v0, v6, v7, v4, v4}, Lcom/google/android/gms/internal/ul;-><init>(JLjava/lang/String;Lcom/google/android/gms/internal/ul;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/a;->c:Lcom/google/android/gms/internal/ul;

    return-void
.end method

.method protected p()V
    .locals 2

    const-string v0, "Ad closing."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/d;->d()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onRewardedVideoAdClosed()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected q()V
    .locals 2

    const-string v0, "Ad leaving application."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/d;->e()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected r()V
    .locals 2

    const-string v0, "Ad opening."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/d;->b()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onRewardedVideoAdOpened()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected s()V
    .locals 2

    const-string v0, "Ad finished loading."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->c(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/a;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->n:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ag;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/d;->a()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not call AdListener.onAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method protected t()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/a;->f:Lcom/google/android/gms/ads/internal/v;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/v;->z:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/d;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Could not call RewardedVideoAdListener.onVideoStarted()."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
