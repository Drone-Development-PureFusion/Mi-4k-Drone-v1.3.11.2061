.class public final Lcom/google/android/gms/ads/NativeExpressAdView;
.super Lcom/google/android/gms/ads/BaseAdView;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/ads/BaseAdView;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/ads/BaseAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/ads/BaseAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/ads/c;)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/BaseAdView;->a(Lcom/google/android/gms/ads/c;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/BaseAdView;->a(Lcom/google/android/gms/ads/purchase/d;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic a()Z
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->a()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->b()V

    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->c()V

    return-void
.end method

.method public bridge synthetic d()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->d()V

    return-void
.end method

.method public bridge synthetic getAdListener()Lcom/google/android/gms/ads/a;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->getAdListener()Lcom/google/android/gms/ads/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getAdSize()Lcom/google/android/gms/ads/d;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->getAdSize()Lcom/google/android/gms/ads/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getAdUnitId()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/b;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/BaseAdView;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVideoController()Lcom/google/android/gms/ads/h;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/NativeExpressAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->n()Lcom/google/android/gms/ads/h;

    move-result-object v0

    return-object v0
.end method

.method public getVideoOptions()Lcom/google/android/gms/ads/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/NativeExpressAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->p()Lcom/google/android/gms/ads/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setAdListener(Lcom/google/android/gms/ads/a;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/BaseAdView;->setAdListener(Lcom/google/android/gms/ads/a;)V

    return-void
.end method

.method public bridge synthetic setAdSize(Lcom/google/android/gms/ads/d;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/BaseAdView;->setAdSize(Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method public bridge synthetic setAdUnitId(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/BaseAdView;->setAdUnitId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/b;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/BaseAdView;->setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/b;)V

    return-void
.end method

.method public setVideoOptions(Lcom/google/android/gms/ads/i;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/NativeExpressAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/i;)V

    return-void
.end method
