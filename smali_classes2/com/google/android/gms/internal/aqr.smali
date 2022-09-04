.class public Lcom/google/android/gms/internal/aqr;
.super Lcom/google/android/gms/internal/aqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 4
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

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p2

    if-lt v0, v2, :cond_0

    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v1

    instance-of v0, v0, Lcom/google/android/gms/internal/ef;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v1

    check-cast v0, Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ef;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    array-length v3, p2

    add-int/2addr v3, v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ef;->a(I)V

    :goto_1
    array-length v3, p2

    if-ge v2, v3, :cond_1

    aget-object v3, p2, v2

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/ef;->a(ILcom/google/android/gms/internal/ea;)V

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ec;

    int-to-double v2, v1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ec;-><init>(Ljava/lang/Double;)V

    return-object v0
.end method
