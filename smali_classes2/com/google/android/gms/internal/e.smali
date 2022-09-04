.class public Lcom/google/android/gms/internal/e;
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

    if-eqz p2, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-ne v0, v1, :cond_2

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    instance-of v0, v0, Lcom/google/android/gms/internal/ei;

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Lcom/google/android/gms/internal/ea;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_3
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v1, p2, v2

    const-string v0, "object"

    sget-object v2, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    if-ne v1, v2, :cond_5

    const-string v0, "undefined"

    :cond_0
    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/ej;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ej;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    move v0, v2

    goto :goto_2

    :cond_4
    move v1, v2

    goto :goto_3

    :cond_5
    instance-of v2, v1, Lcom/google/android/gms/internal/eb;

    if-eqz v2, :cond_6

    const-string v0, "boolean"

    goto :goto_4

    :cond_6
    instance-of v2, v1, Lcom/google/android/gms/internal/ec;

    if-eqz v2, :cond_7

    const-string v0, "number"

    goto :goto_4

    :cond_7
    instance-of v2, v1, Lcom/google/android/gms/internal/ej;

    if-eqz v2, :cond_8

    const-string v0, "string"

    goto :goto_4

    :cond_8
    instance-of v1, v1, Lcom/google/android/gms/internal/ed;

    if-eqz v1, :cond_0

    const-string v0, "function"

    goto :goto_4
.end method
