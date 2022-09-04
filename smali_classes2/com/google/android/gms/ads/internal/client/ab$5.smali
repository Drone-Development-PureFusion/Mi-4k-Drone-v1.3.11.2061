.class Lcom/google/android/gms/ads/internal/client/ab$5;
.super Lcom/google/android/gms/ads/internal/client/ab$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/client/ab;->a(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/ads/internal/client/ab$a",
        "<",
        "Lcom/google/android/gms/ads/internal/client/ap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/ads/internal/client/ab;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->b:Lcom/google/android/gms/ads/internal/client/ab;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->a:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$a;-><init>(Lcom/google/android/gms/ads/internal/client/ab;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/ads/internal/client/ap;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->b:Lcom/google/android/gms/ads/internal/client/ab;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/ab;->d(Lcom/google/android/gms/ads/internal/client/ab;)Lcom/google/android/gms/ads/internal/client/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/j;->a(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/ap;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->b:Lcom/google/android/gms/ads/internal/client/ab;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->a:Landroid/content/Context;

    const-string v2, "mobile_ads_settings"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/internal/client/ab;->a(Lcom/google/android/gms/ads/internal/client/ab;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/m;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/m;-><init>()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/ads/internal/client/ap;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/ab$5;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    const v1, 0x93c038

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/an;->getMobileAdsSettingsManagerWithClientJarVersion(Lcom/google/android/gms/c/e;I)Lcom/google/android/gms/ads/internal/client/ap;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/client/ab$5;->a()Lcom/google/android/gms/ads/internal/client/ap;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/ads/internal/client/an;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/ads/internal/client/ab$5;->a(Lcom/google/android/gms/ads/internal/client/an;)Lcom/google/android/gms/ads/internal/client/ap;

    move-result-object v0

    return-object v0
.end method
