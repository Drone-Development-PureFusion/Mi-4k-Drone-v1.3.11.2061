.class public final Lcom/google/android/gms/ads/doubleclick/e;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/g;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/ads/internal/client/g;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/doubleclick/e;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->a()Lcom/google/android/gms/ads/a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/ads/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/doubleclick/a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/doubleclick/c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/d;)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/d;->j()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/internal/client/e;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Lcom/google/android/gms/ads/e;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/g;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/ads/doubleclick/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->c()Lcom/google/android/gms/ads/doubleclick/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/ads/doubleclick/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->e()Lcom/google/android/gms/ads/doubleclick/c;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->f()Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->g()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/e;->a:Lcom/google/android/gms/ads/internal/client/g;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/g;->i()V

    return-void
.end method
