.class public abstract Lcom/google/android/gms/internal/aqg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aqe;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs abstract a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
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
.end method

.method public varargs a_(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 6
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

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    if-eqz p2, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    new-array v4, v0, [Lcom/google/android/gms/internal/ea;

    move v0, v2

    :goto_2
    array-length v3, p2

    if-ge v0, v3, :cond_8

    aget-object v3, p2, v0

    if-eqz v3, :cond_2

    move v3, v1

    :goto_3
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v3, p2, v0

    sget-object v5, Lcom/google/android/gms/internal/ee;->b:Lcom/google/android/gms/internal/ee;

    if-eq v3, v5, :cond_3

    move v3, v1

    :goto_4
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v3, p2, v0

    sget-object v5, Lcom/google/android/gms/internal/ee;->c:Lcom/google/android/gms/internal/ee;

    if-eq v3, v5, :cond_4

    move v3, v1

    :goto_5
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v3, p2, v0

    invoke-static {p1, v3}, Lcom/google/android/gms/internal/ek;->a(Lcom/google/android/gms/internal/apr;Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v3

    aput-object v3, v4, v0

    aget-object v3, v4, v0

    if-eqz v3, :cond_5

    move v3, v1

    :goto_6
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v3, v4, v0

    sget-object v5, Lcom/google/android/gms/internal/ee;->b:Lcom/google/android/gms/internal/ee;

    if-eq v3, v5, :cond_6

    move v3, v1

    :goto_7
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v3, v4, v0

    sget-object v5, Lcom/google/android/gms/internal/ee;->c:Lcom/google/android/gms/internal/ee;

    if-eq v3, v5, :cond_7

    move v3, v1

    :goto_8
    invoke-static {v3}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v3, v2

    goto :goto_3

    :cond_3
    move v3, v2

    goto :goto_4

    :cond_4
    move v3, v2

    goto :goto_5

    :cond_5
    move v3, v2

    goto :goto_6

    :cond_6
    move v3, v2

    goto :goto_7

    :cond_7
    move v3, v2

    goto :goto_8

    :cond_8
    invoke-virtual {p0, p1, v4}, Lcom/google/android/gms/internal/aqg;->a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    if-eqz v0, :cond_9

    :goto_9
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    return-object v0

    :cond_9
    move v1, v2

    goto :goto_9
.end method
