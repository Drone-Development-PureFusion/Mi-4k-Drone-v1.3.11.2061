.class public Lcom/google/android/gms/internal/aql;
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

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    if-lez v0, :cond_1

    array-length v0, p2

    if-gt v0, v5, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    instance-of v0, v0, Lcom/google/android/gms/internal/ef;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    check-cast v0, Lcom/google/android/gms/internal/ef;

    array-length v3, p2

    if-ge v3, v4, :cond_2

    sget-object v1, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    move-object v3, v1

    :goto_1
    array-length v1, p2

    if-ge v1, v5, :cond_3

    sget-object v1, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    move-object v4, v1

    :goto_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ef;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    sget-object v5, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    if-eq v4, v5, :cond_0

    invoke-static {v4}, Lcom/google/android/gms/internal/aqf;->c(Lcom/google/android/gms/internal/ea;)D

    move-result-wide v4

    double-to-int v4, v4

    if-gez v4, :cond_6

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v4, v6, v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    :goto_3
    const/4 v5, -0x1

    move v4, v2

    :goto_4
    if-ge v4, v6, :cond_5

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ef;->c(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ea;

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/aqf;->d(Lcom/google/android/gms/internal/ea;Lcom/google/android/gms/internal/ea;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v0, v4

    :goto_5
    new-instance v1, Lcom/google/android/gms/internal/ec;

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ec;-><init>(Ljava/lang/Double;)V

    return-object v1

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    aget-object v1, p2, v1

    move-object v3, v1

    goto :goto_1

    :cond_3
    aget-object v1, p2, v4

    move-object v4, v1

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_5
    move v0, v5

    goto :goto_5

    :cond_6
    move v2, v4

    goto :goto_3
.end method
