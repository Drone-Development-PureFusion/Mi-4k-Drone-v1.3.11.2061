.class public abstract Lcom/google/android/gms/awareness/fence/FenceQueryRequest;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/android/gms/awareness/fence/FenceQueryRequest;
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>()V

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Lcom/google/android/gms/awareness/fence/FenceQueryRequest;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/awareness/fence/FenceQueryRequest;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static varargs a([Ljava/lang/String;)Lcom/google/android/gms/awareness/fence/FenceQueryRequest;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v1, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p0, v0

    invoke-static {v2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/String;)Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;

    invoke-direct {v0, p0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;-><init>([Ljava/lang/String;)V

    return-object v0
.end method
