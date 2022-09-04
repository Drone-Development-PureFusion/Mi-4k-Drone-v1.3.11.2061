.class public Lcom/google/android/gms/internal/bi;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aqe;


# instance fields
.field private final a:Lcom/google/android/gms/internal/aoo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/aoo;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/aoo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/bi;-><init>(Lcom/google/android/gms/internal/aoo;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/aoo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bi;->a:Lcom/google/android/gms/internal/aoo;

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

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    new-instance v0, Lcom/google/android/gms/internal/eb;

    iget-object v3, p0, Lcom/google/android/gms/internal/bi;->a:Lcom/google/android/gms/internal/aoo;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/aoo;->b()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/eb;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_2
.end method
