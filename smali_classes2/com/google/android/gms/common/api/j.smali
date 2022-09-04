.class public final Lcom/google/android/gms/common/api/j;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/j$a;,
        Lcom/google/android/gms/common/api/j$b;,
        Lcom/google/android/gms/common/api/j$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            ">(TR;)",
            "Lcom/google/android/gms/common/api/h",
            "<TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/common/api/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/j$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/j$c;->b(Lcom/google/android/gms/common/api/m;)V

    new-instance v1, Lcom/google/android/gms/internal/aio;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/aio;-><init>(Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public static a()Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/aiu;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/aiu;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aiu;->a()V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/aiu;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/aiu;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/aiu;->b(Lcom/google/android/gms/common/api/m;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/Status;",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/aiu;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/aiu;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/aiu;->b(Lcom/google/android/gms/common/api/m;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            ">(TR;",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/common/api/j$b;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/common/api/j$b;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/m;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/j$b;->b(Lcom/google/android/gms/common/api/m;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            ">(TR;",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/h",
            "<TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/common/api/j$c;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/j$c;->b(Lcom/google/android/gms/common/api/m;)V

    new-instance v1, Lcom/google/android/gms/internal/aio;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/aio;-><init>(Lcom/google/android/gms/common/api/i;)V

    return-object v1
.end method

.method public static b(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lcom/google/android/gms/common/api/m;",
            ">(TR;)",
            "Lcom/google/android/gms/common/api/i",
            "<TR;>;"
        }
    .end annotation

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Lcom/google/android/gms/common/api/m;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Status code must be CommonStatusCodes.CANCELED"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/common/api/j$a;

    invoke-direct {v0, p0}, Lcom/google/android/gms/common/api/j$a;-><init>(Lcom/google/android/gms/common/api/m;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/j$a;->a()V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
