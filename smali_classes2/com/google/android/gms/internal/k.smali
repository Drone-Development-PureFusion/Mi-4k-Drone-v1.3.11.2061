.class public Lcom/google/android/gms/internal/k;
.super Lcom/google/android/gms/internal/aqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 7
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

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    array-length v5, p2

    move v3, v2

    :goto_1
    if-ge v3, v5, :cond_3

    aget-object v6, p2, v3

    instance-of v0, v6, Lcom/google/android/gms/internal/ee;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    if-eq v6, v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ee;->d:Lcom/google/android/gms/internal/ee;

    if-ne v6, v0, :cond_2

    :cond_0
    move v0, v1

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ef;

    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ef;-><init>(Ljava/util/List;)V

    return-object v0
.end method
