.class public Lcom/google/android/gms/analytics/internal/y;
.super Lcom/google/android/gms/analytics/internal/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/analytics/internal/y$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/analytics/internal/y$a;

.field private b:Lcom/google/android/gms/analytics/internal/d;

.field private final c:Lcom/google/android/gms/analytics/internal/aj;

.field private d:Lcom/google/android/gms/analytics/internal/m;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/analytics/internal/v;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/t;-><init>(Lcom/google/android/gms/analytics/internal/v;)V

    new-instance v0, Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/v;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/analytics/internal/m;-><init>(Lcom/google/android/gms/common/util/e;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->d:Lcom/google/android/gms/analytics/internal/m;

    new-instance v0, Lcom/google/android/gms/analytics/internal/y$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/y$a;-><init>(Lcom/google/android/gms/analytics/internal/y;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->a:Lcom/google/android/gms/analytics/internal/y$a;

    new-instance v0, Lcom/google/android/gms/analytics/internal/y$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/internal/y$1;-><init>(Lcom/google/android/gms/analytics/internal/y;Lcom/google/android/gms/analytics/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->c:Lcom/google/android/gms/analytics/internal/aj;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/y;)Lcom/google/android/gms/analytics/internal/y$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->a:Lcom/google/android/gms/analytics/internal/y$a;

    return-object v0
.end method

.method private a(Landroid/content/ComponentName;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    const-string v0, "Disconnected from device AnalyticsService"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/internal/y;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->h()V

    :cond_0
    return-void
.end method

.method private a(Lcom/google/android/gms/analytics/internal/d;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->f()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->t()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->h()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/y;Landroid/content/ComponentName;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/y;->a(Landroid/content/ComponentName;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/y;Lcom/google/android/gms/analytics/internal/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/y;->a(Lcom/google/android/gms/analytics/internal/d;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/analytics/internal/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->g()V

    return-void
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->d:Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/m;->a()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->c:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/aj;->a(J)V

    return-void
.end method

.method private g()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const-string v0, "Inactivity, disconnecting from device AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/y;->q(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->e()V

    goto :goto_0
.end method

.method private h()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->t()Lcom/google/android/gms/analytics/internal/r;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/r;->f()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/analytics/internal/c;)Z
    .locals 7

    const/4 v6, 0x0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->D()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-nez v0, :cond_0

    move v0, v6

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/c;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->o()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/c;->b()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/c;->d()J

    move-result-wide v2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/analytics/internal/d;->a(Ljava/util/Map;JLjava/lang/String;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->p()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v0, "Failed to send hits to AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/y;->q(Ljava/lang/String;)V

    move v0, v6

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->D()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->D()V

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    invoke-interface {v1}, Lcom/google/android/gms/analytics/internal/d;->a()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->f()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v1, "Failed to clear hits from AnalyticsService"

    invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/internal/y;->q(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public d()Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->D()V

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/y;->a:Lcom/google/android/gms/analytics/internal/y$a;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/y$a;->a()Lcom/google/android/gms/analytics/internal/d;

    move-result-object v1

    if-eqz v1, :cond_1

    iput-object v1, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->f()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->D()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/stats/b;->a()Lcom/google/android/gms/common/stats/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/y;->o()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/y;->a:Lcom/google/android/gms/analytics/internal/y$a;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/stats/b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/y;->b:Lcom/google/android/gms/analytics/internal/d;

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/y;->h()V

    :cond_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method
