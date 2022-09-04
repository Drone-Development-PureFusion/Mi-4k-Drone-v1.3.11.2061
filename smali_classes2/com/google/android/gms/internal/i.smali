.class public Lcom/google/android/gms/internal/i;
.super Lcom/google/android/gms/internal/aqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 3
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

    if-eqz p2, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-ne v0, v1, :cond_3

    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    instance-of v0, v0, Lcom/google/android/gms/internal/ef;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    check-cast v0, Lcom/google/android/gms/internal/ef;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ef;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ea;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ek;->a(Lcom/google/android/gms/internal/apr;Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v1

    instance-of v0, v1, Lcom/google/android/gms/internal/ee;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ee;->b:Lcom/google/android/gms/internal/ee;

    if-eq v1, v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ee;->c:Lcom/google/android/gms/internal/ee;

    if-eq v1, v0, :cond_1

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/ee;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ee;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    :goto_2
    return-object v1

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    move v1, v2

    goto :goto_1

    :cond_4
    sget-object v1, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    goto :goto_2
.end method
