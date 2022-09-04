.class public Lcom/google/android/gms/internal/jo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jp;


# instance fields
.field private a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/jo;->a:Z

    return-void
.end method

.method private c()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jo;->a:Z

    const-string v1, "Transaction expected to already be in progress."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/jy;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/internal/jy;

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-direct {v0, v1, v3, v3}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    return-object v0
.end method

.method public a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable",
            "<TT;>;)TT;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jo;->a:Z

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "runInTransaction called when an existing transaction is already in progress."

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lcom/google/android/gms/internal/jo;->a:Z

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iput-boolean v2, p0, Lcom/google/android/gms/internal/jo;->a:Z

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

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

    iput-boolean v2, p0, Lcom/google/android/gms/internal/jo;->a:Z

    throw v0
.end method

.method public a()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;J)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;)V
    .locals 0
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

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;Ljava/util/Set;)V
    .locals 0
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

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

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

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public b(Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public c(Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method

.method public d(Lcom/google/android/gms/internal/kg;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jo;->c()V

    return-void
.end method
