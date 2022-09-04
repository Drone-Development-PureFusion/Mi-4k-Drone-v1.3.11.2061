.class public Lcom/google/android/gms/internal/bg;
.super Lcom/google/android/gms/internal/aqg;


# instance fields
.field private final a:Lcom/google/android/gms/internal/app$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/app$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/bg;->a:Lcom/google/android/gms/internal/app$c;

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

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    if-nez v0, :cond_1

    :goto_1
    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/bg;->a:Lcom/google/android/gms/internal/app$c;

    invoke-interface {v0}, Lcom/google/android/gms/internal/app$c;->a()Lcom/google/android/gms/internal/aow;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/aow;->a(Z)V

    sget-object v0, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method
