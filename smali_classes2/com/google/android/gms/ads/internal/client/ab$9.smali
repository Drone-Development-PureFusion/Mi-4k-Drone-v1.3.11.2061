.class Lcom/google/android/gms/ads/internal/client/ab$9;
.super Lcom/google/android/gms/ads/internal/client/ab$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/client/ab;->b(Landroid/app/Activity;)Lcom/google/android/gms/internal/yq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/internal/client/ab$a",
        "<",
        "Lcom/google/android/gms/internal/yq;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/google/android/gms/ads/internal/client/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->b:Lcom/google/android/gms/ads/internal/client/ab;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->a:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$a;-><init>(Lcom/google/android/gms/ads/internal/client/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/yq;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->b:Lcom/google/android/gms/ads/internal/client/ab;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/ab;->h(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/internal/yp;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/yp;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/yq;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->b:Lcom/google/android/gms/ads/internal/client/ab;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->a:Landroid/app/Activity;

    const-string v2, "ad_overlay"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ab;->a(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/internal/yq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$9;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/internal/client/an;->createAdOverlay(Lcom/google/android/gms/c/e;)Lcom/google/android/gms/internal/yq;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/ab$9;->a()Lcom/google/android/gms/internal/yq;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/ads/internal/client/an;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$9;->a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/internal/yq;

    move-result-object v0

    return-object v0
.end method
