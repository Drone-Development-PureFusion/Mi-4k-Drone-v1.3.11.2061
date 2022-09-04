.class public abstract Lcom/google/android/gms/awareness/fence/AwarenessFence;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/awareness/fence/AwarenessFence;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-static {p0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->a(Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;->c(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs a([Lcom/google/android/gms/awareness/fence/AwarenessFence;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1

    if-eqz p0, :cond_0

    array-length v0, p0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;->c([Lcom/google/android/gms/awareness/fence/AwarenessFence;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->c(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;->c(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->d(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static varargs b([Lcom/google/android/gms/awareness/fence/AwarenessFence;)Lcom/google/android/gms/awareness/fence/AwarenessFence;
    .locals 1

    if-eqz p0, :cond_0

    array-length v0, p0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {p0}, Lcom/google/android/gms/awareness/fence/AwarenessFence;->c([Lcom/google/android/gms/awareness/fence/AwarenessFence;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;->d(Ljava/util/Collection;)Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;",
            ">;)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/awareness/fence/AwarenessFence;

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static c([Lcom/google/android/gms/awareness/fence/AwarenessFence;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/awareness/fence/AwarenessFence;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    array-length v0, p0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v0, p0, v1

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/ContextFenceStub;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-object v2
.end method
