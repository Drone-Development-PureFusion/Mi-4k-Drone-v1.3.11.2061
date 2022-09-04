.class public Lcom/google/android/gms/internal/acn;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/acn$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/google/android/gms/internal/aco;Lcom/google/android/gms/internal/acn$a;)Lcom/google/android/gms/internal/aco;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/aco",
            "<TA;>;",
            "Lcom/google/android/gms/internal/acn$a",
            "<TA;TB;>;)",
            "Lcom/google/android/gms/internal/aco",
            "<TB;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/acl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/acl;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/acn$1;

    invoke-direct {v1, v0, p1, p0}, Lcom/google/android/gms/internal/acn$1;-><init>(Lcom/google/android/gms/internal/acl;Lcom/google/android/gms/internal/acn$a;Lcom/google/android/gms/internal/aco;)V

    invoke-interface {p0, v1}, Lcom/google/android/gms/internal/aco;->a(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static a(Ljava/util/List;)Lcom/google/android/gms/internal/aco;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/aco",
            "<TV;>;>;)",
            "Lcom/google/android/gms/internal/aco",
            "<",
            "Ljava/util/List",
            "<TV;>;>;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/internal/acl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/acl;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aco;

    new-instance v5, Lcom/google/android/gms/internal/acn$2;

    invoke-direct {v5, v3, v2, v1, p0}, Lcom/google/android/gms/internal/acn$2;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/acl;Ljava/util/List;)V

    invoke-interface {v0, v5}, Lcom/google/android/gms/internal/aco;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method static synthetic b(Ljava/util/List;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/acn;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/aco",
            "<TV;>;>;)",
            "Ljava/util/List",
            "<TV;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aco;

    invoke-interface {v0}, Lcom/google/android/gms/internal/aco;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method
