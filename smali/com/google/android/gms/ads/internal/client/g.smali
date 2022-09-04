.class public Lcom/google/android/gms/ads/internal/client/g;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/xp;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/ads/internal/client/y;

.field private d:Lcom/google/android/gms/ads/a;

.field private e:Lcom/google/android/gms/ads/internal/client/a;

.field private f:Lcom/google/android/gms/ads/internal/client/ak;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lcom/google/android/gms/ads/doubleclick/a;

.field private j:Lcom/google/android/gms/ads/purchase/d;

.field private k:Lcom/google/android/gms/ads/purchase/b;

.field private l:Lcom/google/android/gms/ads/doubleclick/e;

.field private m:Lcom/google/android/gms/ads/doubleclick/c;

.field private n:Lcom/google/android/gms/ads/e;

.field private o:Lcom/google/android/gms/ads/b/c;

.field private p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/y;Lcom/google/android/gms/ads/doubleclick/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/doubleclick/e;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/ads/internal/client/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/y;Lcom/google/android/gms/ads/doubleclick/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/y;Lcom/google/android/gms/ads/doubleclick/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/xp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/xp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->a:Lcom/google/android/gms/internal/xp;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/g;->c:Lcom/google/android/gms/ads/internal/client/y;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/g;->l:Lcom/google/android/gms/ads/doubleclick/e;

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/g;->c(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/client/g;->p:Z

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->a()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->b()Lcom/google/android/gms/ads/internal/client/ab;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/g;->g:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/client/g;->a:Lcom/google/android/gms/internal/xp;

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/ads/internal/client/ab;->b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/client/ak;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->d:Lcom/google/android/gms/ads/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/t;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->d:Lcom/google/android/gms/ads/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/t;-><init>(Lcom/google/android/gms/ads/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ag;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->e:Lcom/google/android/gms/ads/internal/client/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/s;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->e:Lcom/google/android/gms/ads/internal/client/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/s;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/af;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->i:Lcom/google/android/gms/ads/doubleclick/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/aa;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->i:Lcom/google/android/gms/ads/doubleclick/a;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/aa;-><init>(Lcom/google/android/gms/ads/doubleclick/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/am;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->k:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/ze;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->k:Lcom/google/android/gms/ads/purchase/b;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ze;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/yy;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->j:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/zi;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->j:Lcom/google/android/gms/ads/purchase/d;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/zi;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->h:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->m:Lcom/google/android/gms/ads/doubleclick/c;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/internal/us;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->m:Lcom/google/android/gms/ads/doubleclick/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/us;-><init>(Lcom/google/android/gms/ads/doubleclick/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/ur;)V

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->n:Lcom/google/android/gms/ads/e;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->n:Lcom/google/android/gms/ads/e;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/e;->b()Lcom/google/android/gms/ads/internal/client/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ao;)V

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->o:Lcom/google/android/gms/ads/b/c;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    new-instance v1, Lcom/google/android/gms/ads/internal/reward/client/g;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->o:Lcom/google/android/gms/ads/b/c;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/reward/client/g;-><init>(Lcom/google/android/gms/ads/b/c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/reward/client/d;)V

    :cond_8
    return-void

    :cond_9
    new-instance v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;-><init>()V

    goto/16 :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x3f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "The ad unit ID must be set on InterstitialAd before "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->d:Lcom/google/android/gms/ads/a;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->d:Lcom/google/android/gms/ads/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/t;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/t;-><init>(Lcom/google/android/gms/ads/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ag;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/b/c;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->o:Lcom/google/android/gms/ads/b/c;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/reward/client/g;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/reward/client/g;-><init>(Lcom/google/android/gms/ads/b/c;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/reward/client/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->i:Lcom/google/android/gms/ads/doubleclick/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/aa;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/aa;-><init>(Lcom/google/android/gms/ads/doubleclick/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/am;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/c;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->m:Lcom/google/android/gms/ads/doubleclick/c;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/us;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/us;-><init>(Lcom/google/android/gms/ads/doubleclick/c;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/ur;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the OnCustomRenderedAdLoadedListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/e;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->n:Lcom/google/android/gms/ads/e;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->n:Lcom/google/android/gms/ads/e;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/ao;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->n:Lcom/google/android/gms/ads/e;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/e;->b()Lcom/google/android/gms/ads/internal/client/ad;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set correlator."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/a;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->e:Lcom/google/android/gms/ads/internal/client/a;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/ads/internal/client/s;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/s;-><init>(Lcom/google/android/gms/ads/internal/client/a;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/af;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdClickListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/e;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v0, :cond_0

    const-string v0, "loadAd"

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/client/g;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->c:Lcom/google/android/gms/ads/internal/client/y;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/g;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/e;)Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->a:Lcom/google/android/gms/internal/xp;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/e;->j()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/xp;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->j:Lcom/google/android/gms/ads/purchase/d;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Play store purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->k:Lcom/google/android/gms/ads/purchase/b;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ze;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ze;-><init>(Lcom/google/android/gms/ads/purchase/b;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/yy;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->k:Lcom/google/android/gms/ads/purchase/b;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "In app purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->j:Lcom/google/android/gms/ads/purchase/d;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/g;->h:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/zi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zi;-><init>(Lcom/google/android/gms/ads/purchase/d;)V

    :goto_0
    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/ads/internal/client/ak;->a(Lcom/google/android/gms/internal/zd;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the play store purchase parameter."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on InterstitialAd."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/g;->g:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/internal/client/g;->p:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->g:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/ads/doubleclick/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->i:Lcom/google/android/gms/ads/doubleclick/a;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/ads/purchase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->k:Lcom/google/android/gms/ads/purchase/b;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/ads/doubleclick/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->m:Lcom/google/android/gms/ads/doubleclick/c;

    return-object v0
.end method

.method public f()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/ak;->c()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is ready."

    invoke-static {v2, v1}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public g()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/ak;->k()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to check if ad is loading."

    invoke-static {v2, v1}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->j()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()V
    .locals 2

    :try_start_0
    const-string v0, "show"

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/client/g;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/g;->f:Lcom/google/android/gms/ads/internal/client/ak;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/ak;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to show interstitial."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
