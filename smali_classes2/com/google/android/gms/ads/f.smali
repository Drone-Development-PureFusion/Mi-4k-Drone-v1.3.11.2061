.class public final Lcom/google/android/gms/ads/f;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/g;

    invoke-direct {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->a()Lcom/google/android/gms/ads/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/a;)V

    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/ads/internal/client/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    check-cast p1, Lcom/google/android/gms/ads/internal/client/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/internal/client/a;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/internal/client/a;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/b/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/b/c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/c;)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/c;->f()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/internal/client/e;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/purchase/b;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Z)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/ads/purchase/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->d()Lcom/google/android/gms/ads/purchase/b;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->f()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->g()Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/f;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->i()V

    return-void
.end method
