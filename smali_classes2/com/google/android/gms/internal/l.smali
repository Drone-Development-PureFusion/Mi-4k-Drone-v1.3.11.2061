.class public Lcom/google/android/gms/internal/l;
.super Lcom/google/android/gms/internal/aqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/apr;",
            "[",
            "Lcom/google/android/gms/internal/ea",
            "<*>;)",
            "Lcom/google/android/gms/internal/ea",
            "<*>;"
        }
    .end annotation

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_1
    array-length v2, p2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    aget-object v2, p2, v1

    invoke-static {v2}, Lcom/google/android/gms/internal/aqf;->d(Lcom/google/android/gms/internal/ea;)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    aget-object v3, p2, v3

    instance-of v4, v3, Lcom/google/android/gms/internal/ee;

    if-eqz v4, :cond_1

    sget-object v4, Lcom/google/android/gms/internal/ee;->d:Lcom/google/android/gms/internal/ee;

    if-eq v3, v4, :cond_1

    sget-object v4, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Illegal InternalType found in CreateObject."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/google/android/gms/internal/eh;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/eh;-><init>(Ljava/util/Map;)V

    return-object v1
.end method
