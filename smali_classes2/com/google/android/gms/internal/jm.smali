.class public Lcom/google/android/gms/internal/jm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jp;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Lcom/google/android/gms/internal/jq;

.field private final c:Lcom/google/android/gms/internal/jt;

.field private final d:Lcom/google/android/gms/internal/ks;

.field private final e:Lcom/google/android/gms/internal/jk;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/jm;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/jm;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jq;Lcom/google/android/gms/internal/jk;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/md;

    invoke-direct {v0}, Lcom/google/android/gms/internal/md;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/jm;-><init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jq;Lcom/google/android/gms/internal/jk;Lcom/google/android/gms/internal/mc;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ic;Lcom/google/android/gms/internal/jq;Lcom/google/android/gms/internal/jk;Lcom/google/android/gms/internal/mc;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/jm;->f:J

    iput-object p2, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    const-string v0, "Persistence"

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ic;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    new-instance v0, Lcom/google/android/gms/internal/jt;

    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    invoke-direct {v0, v1, v2, p4}, Lcom/google/android/gms/internal/jt;-><init>(Lcom/google/android/gms/internal/jq;Lcom/google/android/gms/internal/ks;Lcom/google/android/gms/internal/mc;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    iput-object p3, p0, Lcom/google/android/gms/internal/jm;->e:Lcom/google/android/gms/internal/jk;

    return-void
.end method

.method private c()V
    .locals 8

    const/4 v1, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/internal/jm;->f:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/gms/internal/jm;->f:J

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->e:Lcom/google/android/gms/internal/jk;

    iget-wide v2, p0, Lcom/google/android/gms/internal/jm;->f:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/jk;->a(J)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    const-string v2, "Reached prune check threshold."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/google/android/gms/internal/jm;->f:J

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v2}, Lcom/google/android/gms/internal/jq;->b()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x20

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->e:Lcom/google/android/gms/internal/jk;

    iget-object v5, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/jt;->a()J

    move-result-wide v6

    invoke-interface {v4, v2, v3, v6, v7}, Lcom/google/android/gms/internal/jk;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    iget-object v3, p0, Lcom/google/android/gms/internal/jm;->e:Lcom/google/android/gms/internal/jk;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jk;)Lcom/google/android/gms/internal/jr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/jr;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/jr;)V

    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v2}, Lcom/google/android/gms/internal/jq;->b()J

    move-result-wide v2

    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->d:Lcom/google/android/gms/internal/ks;

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x2c

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "Cache size after prune: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/jy;
    .locals 7

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->f(Lcom/google/android/gms/internal/kg;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/google/android/gms/internal/js;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    iget-wide v4, v0, Lcom/google/android/gms/internal/js;->a:J

    invoke-interface {v1, v4, v5}, Lcom/google/android/gms/internal/jq;->d(J)Ljava/util/Set;

    move-result-object v0

    :goto_0
    move v1, v2

    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v4

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kv;

    invoke-interface {v4, v0}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v6

    invoke-interface {v3, v0, v6}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v3, v0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jt;->b(Lcom/google/android/gms/internal/ij;)Ljava/util/Set;

    move-result-object v0

    move v1, v3

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/jy;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    :goto_3
    return-object v0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/jy;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v2

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    goto :goto_3
.end method

.method public a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->e()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/jq;->g()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/jq;->f()V

    return-object v0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/jq;->f()V

    throw v0
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->d()V

    return-void
.end method

.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/jq;->a(J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V
    .locals 3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ia;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ij;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/jm;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->d(Lcom/google/android/gms/internal/ij;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->c(Lcom/google/android/gms/internal/ij;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/lh;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jm;->d(Lcom/google/android/gms/internal/kg;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/jm;->c()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/jq;->b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/internal/jm;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should only track keys for filtered queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/jm;->a:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/js;->e:Z

    if-nez v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We only expect tracked keys for currently-active queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    iget-wide v2, v0, Lcom/google/android/gms/internal/js;->a:J

    invoke-interface {v1, v2, v3, p2}, Lcom/google/android/gms/internal/jq;->a(JLjava/util/Set;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/android/gms/internal/jm;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We should only track keys for filtered queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/js;

    move-result-object v0

    sget-boolean v1, Lcom/google/android/gms/internal/jm;->a:Z

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/google/android/gms/internal/js;->e:Z

    if-nez v1, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "We only expect tracked keys for currently-active queries."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    iget-wide v2, v0, Lcom/google/android/gms/internal/js;->a:J

    invoke-interface {v1, v2, v3, p2, p3}, Lcom/google/android/gms/internal/jq;->a(JLjava/util/Set;Ljava/util/Set;)V

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/iy;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/jq;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->b:Lcom/google/android/gms/internal/jq;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/jq;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/jm;->c()V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/kg;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->c(Lcom/google/android/gms/internal/kg;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/internal/kg;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->d(Lcom/google/android/gms/internal/kg;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/kg;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/ij;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jm;->c:Lcom/google/android/gms/internal/jt;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/jt;->e(Lcom/google/android/gms/internal/kg;)V

    goto :goto_0
.end method
