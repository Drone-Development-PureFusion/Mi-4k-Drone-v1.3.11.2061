.class Lcom/google/android/gms/analytics/internal/ab;
.super Lcom/google/android/gms/analytics/internal/t;


# instance fields
.field private a:Z

.field private final b:Lcom/google/android/gms/analytics/internal/z;

.field private final c:Lcom/google/android/gms/analytics/internal/i;

.field private final d:Lcom/google/android/gms/analytics/internal/h;

.field private final e:Lcom/google/android/gms/analytics/internal/y;

.field private f:J

.field private final g:Lcom/google/android/gms/analytics/internal/aj;

.field private final h:Lcom/google/android/gms/analytics/internal/aj;

.field private final i:Lcom/google/android/gms/analytics/internal/m;

.field private j:J

.field private k:Z


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/analytics/internal/v;Lcom/google/android/gms/analytics/internal/w;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/internal/t;-><init>(Lcom/google/android/gms/analytics/internal/v;)V

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->f:J

    invoke-virtual {p2, p1}, Lcom/google/android/gms/analytics/internal/w;->k(Lcom/google/android/gms/analytics/internal/v;)Lcom/google/android/gms/analytics/internal/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/analytics/internal/w;->m(Lcom/google/android/gms/analytics/internal/v;)Lcom/google/android/gms/analytics/internal/z;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/analytics/internal/w;->n(Lcom/google/android/gms/analytics/internal/v;)Lcom/google/android/gms/analytics/internal/i;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->c:Lcom/google/android/gms/analytics/internal/i;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/analytics/internal/w;->o(Lcom/google/android/gms/analytics/internal/v;)Lcom/google/android/gms/analytics/internal/y;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    new-instance v0, Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->n()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/analytics/internal/m;-><init>(Lcom/google/android/gms/common/util/e;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->i:Lcom/google/android/gms/analytics/internal/m;

    new-instance v0, Lcom/google/android/gms/analytics/internal/ab$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/internal/ab$1;-><init>(Lcom/google/android/gms/analytics/internal/ab;Lcom/google/android/gms/analytics/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    new-instance v0, Lcom/google/android/gms/analytics/internal/ab$2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/internal/ab$2;-><init>(Lcom/google/android/gms/analytics/internal/ab;Lcom/google/android/gms/analytics/internal/v;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->h:Lcom/google/android/gms/analytics/internal/aj;

    return-void
.end method

.method private K()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/k;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/analytics/CampaignTrackingReceiver;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v0, "CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/l;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v1}, Lcom/google/android/gms/analytics/internal/ab;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lcom/google/android/gms/analytics/CampaignTrackingService;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    goto :goto_1
.end method

.method private L()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/ab$4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/ab$4;-><init>(Lcom/google/android/gms/analytics/internal/ab;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->a(Lcom/google/android/gms/analytics/internal/am;)V

    return-void
.end method

.method private M()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->i()I

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->h:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->C()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/aj;->a(J)V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to delete stale hits"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private N()Z
    .locals 6

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/google/android/gms/analytics/internal/ab;->k:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->I()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private O()V
    .locals 6

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->u()Lcom/google/android/gms/analytics/internal/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->b()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->G()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->n()Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    sub-long v2, v4, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->k()J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-gtz v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->j()J

    move-result-wide v2

    const-string v1, "Dispatch alarm scheduled (ms)"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/google/android/gms/analytics/internal/ab;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->d()V

    goto :goto_0
.end method

.method private P()V
    .locals 8

    const-wide/16 v6, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->O()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->I()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->d()J

    move-result-wide v0

    cmp-long v4, v0, v6

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->n()Lcom/google/android/gms/common/util/e;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v4

    sub-long v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    sub-long v0, v2, v0

    cmp-long v4, v0, v6

    if-lez v4, :cond_0

    :goto_0
    const-string v2, "Dispatch scheduled (ms)"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/analytics/internal/ab;->a(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/aj;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    const-wide/16 v2, 0x1

    iget-object v4, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/aj;->b()J

    move-result-wide v4

    add-long/2addr v0, v4

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/analytics/internal/aj;->b(J)V

    :goto_1
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->h()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->h()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/analytics/internal/aj;->a(J)V

    goto :goto_1
.end method

.method private Q()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->R()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->S()V

    return-void
.end method

.method private R()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aj;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "All hits dispatched or no network/service. Going to power save mode"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->g:Lcom/google/android/gms/analytics/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/aj;->d()V

    return-void
.end method

.method private S()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->u()Lcom/google/android/gms/analytics/internal/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/al;->e()V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/ab;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->L()V

    return-void
.end method

.method private a(Lcom/google/android/gms/analytics/internal/x;Lcom/google/android/gms/internal/adp;)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/analytics/h;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/analytics/h;-><init>(Lcom/google/android/gms/analytics/internal/v;)V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/h;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/h;->c(Z)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/h;->l()Lcom/google/android/gms/analytics/l;

    move-result-object v5

    const-class v0, Lcom/google/android/gms/internal/adx;

    invoke-virtual {v5, v0}, Lcom/google/android/gms/analytics/l;->b(Ljava/lang/Class;)Lcom/google/android/gms/analytics/n;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/adx;

    const-string v1, "data"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/adx;->a(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/adx;->b(Z)V

    invoke-virtual {v5, p2}, Lcom/google/android/gms/analytics/l;->a(Lcom/google/android/gms/analytics/n;)V

    const-class v1, Lcom/google/android/gms/internal/ads;

    invoke-virtual {v5, v1}, Lcom/google/android/gms/analytics/l;->b(Ljava/lang/Class;)Lcom/google/android/gms/analytics/n;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads;

    const-class v2, Lcom/google/android/gms/internal/ado;

    invoke-virtual {v5, v2}, Lcom/google/android/gms/analytics/l;->b(Ljava/lang/Class;)Lcom/google/android/gms/analytics/n;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ado;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->f()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v7, "an"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ado;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v7, "av"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ado;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v7, "aid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ado;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v7, "aiid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ado;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string v7, "uid"

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/adx;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/ads;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string v0, "Sending installation campaign to"

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p2}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->b()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/google/android/gms/analytics/l;->a(J)V

    invoke-virtual {v5}, Lcom/google/android/gms/analytics/l;->e()V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/analytics/internal/ab;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->M()V

    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->o()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public F()V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    const-string v0, "Sync dispatching local hits"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->r(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->j:J

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->g()V

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->j()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/j;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    iget-wide v2, p0, Lcom/google/android/gms/analytics/internal/ab;->j:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->c()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Sync local dispatch failed"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    goto :goto_0
.end method

.method public G()J
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->j()J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    :goto_0
    return-wide v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get min/max hit times from local store"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public H()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->k()Lcom/google/android/gms/analytics/internal/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->s()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->N()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->b()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->b()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/analytics/internal/ao;->J:Lcom/google/android/gms/analytics/internal/ao$a;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ao$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->a()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->e()Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->P()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->O()V

    goto :goto_0
.end method

.method public I()J
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->f:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->f:J

    :cond_0
    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->v()Lcom/google/android/gms/analytics/internal/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/q;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->v()Lcom/google/android/gms/analytics/internal/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/q;->g()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    goto :goto_0
.end method

.method public J()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/analytics/internal/ab;->k:Z

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    return-void
.end method

.method public a(Lcom/google/android/gms/analytics/internal/x;Z)J
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->b()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->a()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/analytics/internal/z;->a(JLjava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->a()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v1, v4}, Lcom/google/android/gms/analytics/internal/z;->a(JLjava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    if-nez p2, :cond_0

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/analytics/internal/x;->a(J)V

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/analytics/internal/z;->a(Lcom/google/android/gms/analytics/internal/x;)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/z;->c()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    return-wide v0

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    :try_start_2
    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/analytics/internal/x;->a(J)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v1, "Failed to update Analytics property"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2

    :goto_2
    const-wide/16 v0, -0x1

    goto :goto_1

    :catch_1
    move-exception v2

    const-string v3, "Failed to end transaction"

    invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :catch_2
    move-exception v0

    const-string v1, "Failed to end transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3

    :goto_3
    throw v0

    :catch_3
    move-exception v1

    const-string v2, "Failed to end transaction"

    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3
.end method

.method protected a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->E()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->c:Lcom/google/android/gms/analytics/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/i;->E()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->E()V

    return-void
.end method

.method public a(J)V
    .locals 3

    const-wide/16 v0, 0x0

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide p1, v0

    :cond_0
    iput-wide p1, p0, Lcom/google/android/gms/analytics/internal/ab;->f:J

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    return-void
.end method

.method public a(Lcom/google/android/gms/analytics/internal/am;)V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->j:J

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->a(Lcom/google/android/gms/analytics/internal/am;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/analytics/internal/am;J)V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    const-wide/16 v0, -0x1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/j;->d()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->n()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    :cond_0
    const-string v2, "Dispatching local hits. Elapsed time since last dispatch (ms)"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->g()V

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->j()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->r()Lcom/google/android/gms/analytics/p;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/internal/ab$5;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/analytics/internal/ab$5;-><init>(Lcom/google/android/gms/analytics/internal/ab;Lcom/google/android/gms/analytics/internal/am;J)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/p;->a(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/analytics/internal/am;->a(Ljava/lang/Throwable;)V

    :cond_4
    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->j:J

    cmp-long v0, v0, p2

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->d:Lcom/google/android/gms/analytics/internal/h;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/h;->c()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Local dispatch failed"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/j;->e()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/google/android/gms/analytics/internal/am;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/analytics/internal/c;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/ab;->k:Z

    if-eqz v0, :cond_0

    const-string v0, "Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->r(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/internal/ab;->b(Lcom/google/android/gms/analytics/internal/c;)Lcom/google/android/gms/analytics/internal/c;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->g()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/y;->a(Lcom/google/android/gms/analytics/internal/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Hit sent to the device AnalyticsService for delivery"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->r(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    const-string v0, "Delivering hit"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/internal/ab;->a(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->p()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v0

    const-string v2, "Service unavailable on package side"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/g;->a(Lcom/google/android/gms/analytics/internal/c;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/internal/z;->a(Lcom/google/android/gms/analytics/internal/c;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "Delivery failed to save hit to a database"

    invoke-virtual {p0, v2, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->p()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v0

    const-string v2, "deliver: failed to insert hit to database"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/g;->a(Lcom/google/android/gms/analytics/internal/c;Ljava/lang/String;)V

    goto :goto_1
.end method

.method protected a(Lcom/google/android/gms/analytics/internal/x;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    const-string v0, "Sending first hit to property"

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/x;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->c()Lcom/google/android/gms/analytics/internal/m;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->F()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/m;->a(J)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->p()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/analytics/internal/p;->a(Lcom/google/android/gms/analytics/internal/g;Ljava/lang/String;)Lcom/google/android/gms/internal/adp;

    move-result-object v0

    const-string v1, "Found relevant installation campaign"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/analytics/internal/ab;->a(Lcom/google/android/gms/analytics/internal/x;Lcom/google/android/gms/internal/adp;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->l()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->p()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/analytics/internal/p;->a(Lcom/google/android/gms/analytics/internal/g;Ljava/lang/String;)Lcom/google/android/gms/internal/adp;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v0, "Parsing failed. Ignoring invalid campaign data"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v0, "Ignoring duplicate install campaign"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v1, "Ignoring multiple install campaigns. original, new"

    invoke-virtual {p0, v1, v0, p1}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/internal/j;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->c()Lcom/google/android/gms/analytics/internal/m;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/ah;->F()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/m;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Campaign received too late, ignoring"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    const-string v0, "Received installation campaign"

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/z;->d(J)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/x;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->a(Lcom/google/android/gms/analytics/internal/x;Lcom/google/android/gms/internal/adp;)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    return-void
.end method

.method b(Lcom/google/android/gms/analytics/internal/c;)Lcom/google/android/gms/analytics/internal/c;
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/c;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-object p1

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->g()Lcom/google/android/gms/analytics/internal/j$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j$a;->a()Landroid/util/Pair;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/google/android/gms/analytics/internal/c;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v2, "_m"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/analytics/internal/c;->a(Lcom/google/android/gms/analytics/internal/s;Lcom/google/android/gms/analytics/internal/c;Ljava/util/Map;)Lcom/google/android/gms/analytics/internal/c;

    move-result-object p1

    goto :goto_0
.end method

.method b()V
    .locals 3

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/ab;->a:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "Analytics backend already started"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/internal/ab;->a:Z

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->r()Lcom/google/android/gms/analytics/p;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/analytics/internal/ab$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/analytics/internal/ab$3;-><init>(Lcom/google/android/gms/analytics/internal/ab;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/p;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected c()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->K()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->w()Lcom/google/android/gms/analytics/internal/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/j;->b()J

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->u(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->J()V

    :cond_1
    const-string v0, "android.permission.INTERNET"

    invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->u(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->J()V

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->o()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/analytics/internal/l;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "AnalyticsService registered in the app manifest and enabled"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/ab;->k:Z

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->h()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->g()V

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "Device AnalyticsService not registered! Hits will not be delivered reliably."

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string v0, "AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions."

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    goto :goto_0
.end method

.method d()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->n()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/internal/ab;->j:J

    return-void
.end method

.method protected e()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->i()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    const-string v0, "Service disconnected"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    return-void
.end method

.method protected g()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/internal/ab;->k:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->x()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->i:Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/analytics/internal/m;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->i:Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/m;->a()V

    const-string v0, "Connecting to service"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Connected to service"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->i:Lcom/google/android/gms/analytics/internal/m;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/m;->b()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->e()V

    goto :goto_0
.end method

.method public h()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Delete all hits from local store"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->e()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->f()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->g()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Device service unavailable. Can\'t clear hits stored on the device service."

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to delete hits from store"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public i()V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->l()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Service client disabled. Can\'t dispatch local hits to device AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->t(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->b()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Service not connected"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->h()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Dispatching local hits to device AnalyticsService"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :cond_3
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->l()I

    move-result v1

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/internal/z;->b(J)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to read hits from store"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto :goto_0

    :cond_4
    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/c;->c()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/analytics/internal/z;->c(J)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/c;

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/analytics/internal/y;->a(Lcom/google/android/gms/analytics/internal/c;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->H()V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Failed to remove hit that was send for delivery"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto :goto_0
.end method

.method protected j()Z
    .locals 12

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/android/gms/analytics/p;->d()V

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->D()V

    const-string v0, "Dispatching a batch of local hits"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/analytics/internal/ab;->c:Lcom/google/android/gms/analytics/internal/i;

    invoke-virtual {v3}, Lcom/google/android/gms/analytics/internal/i;->b()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    const-string v0, "No network or service available. Will retry later"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :goto_2
    return v2

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->l()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/ah;->m()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    int-to-long v6, v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v4, 0x0

    :goto_3
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->b()V

    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/analytics/internal/z;->b(J)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Store is empty, nothing to dispatch"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto :goto_2

    :cond_3
    :try_start_3
    const-string v0, "Hits loaded from store. count"

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/internal/ab;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/c;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/c;->c()J

    move-result-wide v10

    cmp-long v0, v10, v4

    if-nez v0, :cond_4

    const-string v0, "Database contains successfully uploaded hit"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v3}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :catch_2
    move-exception v0

    :try_start_6
    const-string v1, "Failed to read hits from persisted store"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->d(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :cond_5
    :try_start_8
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/y;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/ab;->q()Lcom/google/android/gms/analytics/internal/ah;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/ah;->a()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "Service connected, sending hits to the service"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/internal/ab;->q(Ljava/lang/String;)V

    :goto_4
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/analytics/internal/c;

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ab;->e:Lcom/google/android/gms/analytics/internal/y;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/internal/y;->a(Lcom/google/android/gms/analytics/internal/c;)Z

    move-result v1

    if-nez v1, :cond_6

    move-wide v0, v4

    :goto_5
    iget-object v4, p0, Lcom/google/android/gms/analytics/internal/ab;->c:Lcom/google/android/gms/analytics/internal/i;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/i;->b()Z

    move-result v4

    if-eqz v4, :cond_8

    iget-object v4, p0, Lcom/google/android/gms/analytics/internal/ab;->c:Lcom/google/android/gms/analytics/internal/i;

    invoke-virtual {v4, v8}, Lcom/google/android/gms/analytics/internal/i;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-wide v4, v0

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/c;->c()J

    move-result-wide v10

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-interface {v8, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const-string v1, "Hit sent do device AnalyticsService for delivery"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/c;->c()J

    move-result-wide v10

    invoke-virtual {v1, v10, v11}, Lcom/google/android/gms/analytics/internal/z;->c(J)V

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/c;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :catch_4
    move-exception v0

    :try_start_a
    const-string v1, "Failed to remove hit that was send for delivery"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_5

    goto/16 :goto_2

    :catch_5
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :cond_7
    :try_start_c
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/analytics/internal/z;->a(Ljava/util/List;)V

    invoke-interface {v3, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-wide v0, v4

    :cond_8
    :try_start_d
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result v4

    if-eqz v4, :cond_9

    :try_start_e
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_6

    goto/16 :goto_2

    :catch_6
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :catch_7
    move-exception v0

    :try_start_f
    const-string v1, "Failed to remove successfully uploaded hits"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :try_start_10
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_8

    goto/16 :goto_2

    :catch_8
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :cond_9
    :try_start_11
    iget-object v4, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v4, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v4}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_9

    move-wide v4, v0

    goto/16 :goto_3

    :catch_9
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    :try_start_12
    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/z;->c()V

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/ab;->b:Lcom/google/android/gms/analytics/internal/z;

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/internal/z;->d()V
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_a

    throw v0

    :catch_a
    move-exception v0

    const-string v1, "Failed to commit local dispatch transaction"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/internal/ab;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/ab;->Q()V

    goto/16 :goto_2

    :cond_a
    move-wide v0, v4

    goto/16 :goto_5
.end method
