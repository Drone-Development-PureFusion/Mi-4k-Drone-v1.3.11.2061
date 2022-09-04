.class public Lcom/google/android/gms/internal/jt;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z

.field private static final b:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kf;",
            "Lcom/google/android/gms/internal/js;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kf;",
            "Lcom/google/android/gms/internal/js;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/android/gms/internal/jv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private f:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kf;",
            "Lcom/google/android/gms/internal/js;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/jq;

.field private final h:Lcom/google/android/gms/internal/ks;

.field private final i:Lcom/google/android/gms/internal/mc;

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/jt;->a:Z

    new-instance v0, Lcom/google/android/gms/internal/jt$1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jt$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jt;->b:Lcom/google/android/gms/internal/jv;

    new-instance v0, Lcom/google/android/gms/internal/jt$2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jt$2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jt;->c:Lcom/google/android/gms/internal/jv;

    new-instance v0, Lcom/google/android/gms/internal/jt$3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jt$3;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jt;->d:Lcom/google/android/gms/internal/jv;

    new-instance v0, Lcom/google/android/gms/internal/jt$4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/jt$4;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/jt;->e:Lcom/google/android/gms/internal/jv;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/jq;Lcom/google/android/gms/internal/ks;Lcom/google/android/gms/internal/mc;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/jt;->j:J

    iput-object p1, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    iput-object p2, p0, Lcom/google/android/gms/internal/jt;->h:Lcom/google/android/gms/internal/ks;

    iput-object p3, p0, Lcom/google/android/gms/internal/jt;->i:Lcom/google/android/gms/internal/mc;

    new-instance v0, Lcom/google/android/gms/internal/ju;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-direct {p0}, Lcom/google/android/gms/internal/jt;->c()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-wide v2, v0, Lcom/google/android/gms/internal/js;->a:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iget-wide v4, p0, Lcom/google/android/gms/internal/jt;->j:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/jt;->j:J

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/js;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/jk;J)J
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p0}, Lcom/google/android/gms/internal/jk;->a()F

    move-result v1

    sub-float/2addr v0, v1

    long-to-float v1, p1

    mul-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-interface {p0}, Lcom/google/android/gms/internal/jk;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    sub-long v0, p1, v0

    return-wide v0
.end method

.method private a(Lcom/google/android/gms/internal/jv;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jv",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/js;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/jv;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private a(Lcom/google/android/gms/internal/js;)V
    .locals 6

    iget-object v0, p1, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-static {v0}, Lcom/google/android/gms/internal/jt;->g(Lcom/google/android/gms/internal/kg;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    iget-object v1, p1, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    iget-object v2, p1, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    move-object v1, v0

    :goto_0
    iget-object v0, p1, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    if-eqz v0, :cond_0

    iget-wide v2, v0, Lcom/google/android/gms/internal/js;->a:J

    iget-wide v4, p1, Lcom/google/android/gms/internal/js;->a:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/mk;->a(Z)V

    iget-object v0, p1, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/jt;Lcom/google/android/gms/internal/js;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/js;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/kg;Z)V
    .locals 8

    invoke-static {p1}, Lcom/google/android/gms/internal/jt;->h(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->i:Lcom/google/android/gms/internal/mc;

    invoke-interface {v1}, Lcom/google/android/gms/internal/mc;->a()J

    move-result-wide v4

    if-eqz v0, :cond_0

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/js;->a(J)Lcom/google/android/gms/internal/js;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/js;->a(Z)Lcom/google/android/gms/internal/js;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/js;)V

    return-void

    :cond_0
    sget-boolean v0, Lcom/google/android/gms/internal/jt;->a:Z

    if-nez v0, :cond_1

    if-nez p2, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "If we\'re setting the query to inactive, we should already be tracking it!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/js;

    iget-wide v1, p0, Lcom/google/android/gms/internal/jt;->j:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v1

    iput-wide v6, p0, Lcom/google/android/gms/internal/jt;->j:J

    const/4 v6, 0x0

    move v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/js;-><init>(JLcom/google/android/gms/internal/kg;JZZ)V

    goto :goto_0
.end method

.method static synthetic b()Lcom/google/android/gms/internal/jv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/jt;->d:Lcom/google/android/gms/internal/jv;

    return-object v0
.end method

.method private b(Lcom/google/android/gms/internal/js;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/js;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/js;)V

    return-void
.end method

.method private c()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->i:Lcom/google/android/gms/internal/mc;

    invoke-interface {v1}, Lcom/google/android/gms/internal/mc;->a()J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/jq;->c(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->f()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/jq;->f()V

    throw v0
.end method

.method private e(Lcom/google/android/gms/internal/ij;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jt;->b:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jv;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f(Lcom/google/android/gms/internal/ij;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-object v3, v0, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v3

    if-nez v3, :cond_0

    iget-wide v4, v0, Lcom/google/android/gms/internal/js;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static g(Lcom/google/android/gms/internal/kg;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kg;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "Can\'t have tracked non-default query that loads all data"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static h(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/jt;->d:Lcom/google/android/gms/internal/jv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jv;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public a(Lcom/google/android/gms/internal/jk;)Lcom/google/android/gms/internal/jr;
    .locals 10

    const/4 v3, 0x0

    sget-object v0, Lcom/google/android/gms/internal/jt;->d:Lcom/google/android/gms/internal/jv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jv;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jk;J)J

    move-result-wide v6

    new-instance v1, Lcom/google/android/gms/internal/jr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/jr;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->h:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->h:Lcom/google/android/gms/internal/ks;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v8, 0x50

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v8, "Pruning old queries.  Prunable: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, " Count to prune: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v5}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/jt$6;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/jt$6;-><init>(Lcom/google/android/gms/internal/jt;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    move v2, v3

    :goto_0
    int-to-long v8, v2

    cmp-long v0, v8, v6

    if-gez v0, :cond_1

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-object v5, v0, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/jr;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jr;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/kg;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    long-to-int v0, v6

    move-object v2, v1

    move v1, v0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-object v0, v0, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/jr;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jr;

    move-result-object v2

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/jt;->e:Lcom/google/android/gms/internal/jv;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jv;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->h:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->h:Lcom/google/android/gms/internal/ks;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x1f

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Unprunable queries: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-object v0, v0, Lcom/google/android/gms/internal/js;->b:Lcom/google/android/gms/internal/kg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/jr;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jr;

    move-result-object v2

    goto :goto_2

    :cond_4
    return-object v2
.end method

.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/internal/jt;->h(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/jt$5;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/jt$5;-><init>(Lcom/google/android/gms/internal/jt;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ju$a;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/ij;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            ")",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            ">;"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/internal/jt;->a:Z

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jt;->f(Lcom/google/android/gms/internal/kg;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Path is fully complete."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/jt;->f(Lcom/google/android/gms/internal/ij;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/jq;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/kv;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v4, Lcom/google/android/gms/internal/jt;->b:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/jv;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public b(Lcom/google/android/gms/internal/kg;)V
    .locals 6

    invoke-static {p1}, Lcom/google/android/gms/internal/jt;->h(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    sget-boolean v2, Lcom/google/android/gms/internal/jt;->a:Z

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Query must exist to be removed."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/jt;->g:Lcom/google/android/gms/internal/jq;

    iget-wide v4, v0, Lcom/google/android/gms/internal/js;->a:J

    invoke-interface {v2, v4, v5}, Lcom/google/android/gms/internal/jq;->b(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    :cond_1
    return-void
.end method

.method public c(Lcom/google/android/gms/internal/ij;)V
    .locals 8

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/jt;->e(Lcom/google/android/gms/internal/ij;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/js;

    iget-wide v1, p0, Lcom/google/android/gms/internal/jt;->j:J

    const-wide/16 v4, 0x1

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/google/android/gms/internal/jt;->j:J

    iget-object v4, p0, Lcom/google/android/gms/internal/jt;->i:Lcom/google/android/gms/internal/mc;

    invoke-interface {v4}, Lcom/google/android/gms/internal/mc;->a()J

    move-result-wide v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/js;-><init>(JLcom/google/android/gms/internal/kg;JZZ)V

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/js;)V

    :cond_0
    return-void

    :cond_1
    sget-boolean v1, Lcom/google/android/gms/internal/jt;->a:Z

    if-nez v1, :cond_2

    iget-boolean v1, v0, Lcom/google/android/gms/internal/js;->d:Z

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "This should have been handled above!"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/js;->a()Lcom/google/android/gms/internal/js;

    move-result-object v0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/internal/kg;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;Z)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/kg;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;Z)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/ij;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    sget-object v1, Lcom/google/android/gms/internal/jt;->c:Lcom/google/android/gms/internal/jv;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jv;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e(Lcom/google/android/gms/internal/kg;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/jt;->h(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/js;->d:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/js;->a()Lcom/google/android/gms/internal/js;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/js;)V

    :cond_0
    return-void
.end method

.method public f(Lcom/google/android/gms/internal/kg;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/jt;->e(Lcom/google/android/gms/internal/ij;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/jt;->f:Lcom/google/android/gms/internal/ju;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/js;->d:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method
