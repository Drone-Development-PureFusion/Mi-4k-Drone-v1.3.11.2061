.class public Lcom/google/android/gms/internal/arm;
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
.method public varargs a_(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
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

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v0, p2, v2

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ek;->a(Lcom/google/android/gms/internal/apr;Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aqf;->a(Lcom/google/android/gms/internal/ea;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_2
    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    aget-object v0, p2, v1

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ek;->a(Lcom/google/android/gms/internal/apr;Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    goto :goto_2
.end method
