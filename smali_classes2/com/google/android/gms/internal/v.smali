.class public Lcom/google/android/gms/internal/v;
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

    const/4 v2, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-gt v0, v1, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-ge v0, v1, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/ee;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ee;-><init>(Lcom/google/android/gms/internal/ea;)V

    return-object v1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    aget-object v0, p2, v2

    goto :goto_2
.end method
