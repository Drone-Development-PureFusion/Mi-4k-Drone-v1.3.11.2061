.class Lcom/google/android/gms/ads/internal/client/ab$6;
.super Lcom/google/android/gms/ads/internal/client/ab$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/uw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/internal/client/ab$a",
        "<",
        "Lcom/google/android/gms/internal/uw;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/FrameLayout;

.field final synthetic b:Landroid/widget/FrameLayout;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lcom/google/android/gms/ads/internal/client/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->d:Lcom/google/android/gms/ads/internal/client/ab;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->a:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->b:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->c:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$a;-><init>(Lcom/google/android/gms/ads/internal/client/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/uw;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->d:Lcom/google/android/gms/ads/internal/client/ab;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/ab;->e(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/internal/vj;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->a:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/vj;->a(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/google/android/gms/internal/uw;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->d:Lcom/google/android/gms/ads/internal/client/ab;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->c:Landroid/content/Context;

    const-string v2, "native_ad_view_delegate"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ab;->a(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/n;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/n;-><init>()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/internal/uw;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->a:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$6;->b:Landroid/widget/FrameLayout;

    invoke-static {v1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/an;->createNativeAdViewDelegate(Lcom/google/android/gms/c/e;Lcom/google/android/gms/c/e;)Lcom/google/android/gms/internal/uw;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/ab$6;->a()Lcom/google/android/gms/internal/uw;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/ads/internal/client/an;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$6;->a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/internal/uw;

    move-result-object v0

    return-object v0
.end method
