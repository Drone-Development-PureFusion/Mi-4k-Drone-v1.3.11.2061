.class public Lcom/google/android/gms/ads/internal/client/ab;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/ads/internal/client/ab$a;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/ads/internal/client/an;

.field private final b:Ljava/lang/Object;

.field private final c:Lcom/google/android/gms/ads/internal/client/v;

.field private final d:Lcom/google/android/gms/ads/internal/client/u;

.field private final e:Lcom/google/android/gms/ads/internal/client/j;

.field private final f:Lcom/google/android/gms/internal/vj;

.field private final g:Lcom/google/android/gms/ads/internal/reward/client/f;

.field private final h:Lcom/google/android/gms/internal/zf;

.field private final i:Lcom/google/android/gms/internal/yp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/v;Lcom/google/android/gms/ads/internal/client/u;Lcom/google/android/gms/ads/internal/client/j;Lcom/google/android/gms/internal/vj;Lcom/google/android/gms/ads/internal/reward/client/f;Lcom/google/android/gms/internal/zf;Lcom/google/android/gms/internal/yp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/ab;->c:Lcom/google/android/gms/ads/internal/client/v;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/ab;->d:Lcom/google/android/gms/ads/internal/client/u;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/ab;->e:Lcom/google/android/gms/ads/internal/client/j;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/ab;->f:Lcom/google/android/gms/internal/vj;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/client/ab;->g:Lcom/google/android/gms/ads/internal/reward/client/f;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/client/ab;->h:Lcom/google/android/gms/internal/zf;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/client/ab;->i:Lcom/google/android/gms/internal/yp;

    return-void
.end method

.method private static a()Lcom/google/android/gms/ads/internal/client/an;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v1, 0x0

    :try_start_0
    const-class v0, Lcom/google/android/gms/ads/internal/client/ab;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v2, "com.google.android.gms.ads.internal.ClientApi"

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/os/IBinder;

    if-nez v2, :cond_0

    const-string v0, "ClientApi class is not an instance of IBinder"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/an$a;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/ads/internal/client/an;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to instantiate ClientApi class."

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/an;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/ab;->b()Lcom/google/android/gms/ads/internal/client/an;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "action"

    const-string v1, "no_ads_fallback"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v0

    const/4 v2, 0x0

    const-string v3, "gmob-apps"

    const/4 v5, 0x1

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/util/client/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Landroid/app/Activity;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v1, "useClientJar flag not found in activity intent extras."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/b;->b(Ljava/lang/String;)V

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0
.end method

.method private b()Lcom/google/android/gms/ads/internal/client/an;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->a:Lcom/google/android/gms/ads/internal/client/an;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ab;->a()Lcom/google/android/gms/ads/internal/client/an;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->a:Lcom/google/android/gms/ads/internal/client/an;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->a:Lcom/google/android/gms/ads/internal/client/an;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/v;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->c:Lcom/google/android/gms/ads/internal/client/v;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/u;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->d:Lcom/google/android/gms/ads/internal/client/u;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/j;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->e:Lcom/google/android/gms/ads/internal/client/j;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/internal/vj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->f:Lcom/google/android/gms/internal/vj;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/reward/client/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->g:Lcom/google/android/gms/ads/internal/reward/client/f;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/internal/zf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->h:Lcom/google/android/gms/internal/zf;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/internal/yp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab;->i:Lcom/google/android/gms/internal/yp;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/client/ai;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$4;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/ads/internal/client/ab$4;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/ai;

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/client/ak;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/ads/internal/client/ab$2;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/ak;

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/client/ak;
    .locals 7

    const/4 v6, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/ab$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/ab$1;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)V

    invoke-virtual {p0, p1, v6, v0}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/ak;

    return-object v0
.end method

.method public a(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/ap;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$5;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$5;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/ap;

    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/reward/client/b;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$7;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/ads/internal/client/ab$7;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Lcom/google/android/gms/internal/xq;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/reward/client/b;

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/uw;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$6;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/google/android/gms/ads/internal/client/ab$6;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/uw;

    return-object v0
.end method

.method public a(Landroid/app/Activity;)Lcom/google/android/gms/internal/yz;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "com.google.android.gms.ads.internal.purchase.useClientJar"

    invoke-static {p1, v0}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$8;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$8;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/yz;

    return-object v0
.end method

.method a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Z",
            "Lcom/google/android/gms/ads/internal/client/ab$a",
            "<TT;>;)TT;"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/ac;->a()Lcom/google/android/gms/ads/internal/util/client/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Google Play Services is not available"

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->a(Ljava/lang/String;)V

    const/4 p2, 0x1

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/client/ab$a;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/client/ab$a;->d()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/client/ab$a;->d()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/client/ab$a;->c()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)Lcom/google/android/gms/ads/internal/client/ak;
    .locals 7

    const/4 v6, 0x0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/ab$3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/client/ab$3;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/xq;)V

    invoke-virtual {p0, p1, v6, v0}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/client/ak;

    return-object v0
.end method

.method public b(Landroid/app/Activity;)Lcom/google/android/gms/internal/yq;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "com.google.android.gms.ads.internal.overlay.useClientJar"

    invoke-static {p1, v0}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/ab$9;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$9;-><init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;ZLcom/google/android/gms/ads/internal/client/ab$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/yq;

    return-object v0
.end method
