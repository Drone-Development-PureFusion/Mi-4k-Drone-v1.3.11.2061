.class public final Lcom/google/android/gms/ads/doubleclick/PublisherAdView;
.super Landroid/view/ViewGroup;


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;Z)V

    iput-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lcom/google/android/gms/ads/internal/client/f;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;Z)V

    iput-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->a()V

    return-void
.end method

.method public a(Lcom/google/android/gms/ads/doubleclick/d;)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/doubleclick/d;->j()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/internal/client/e;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->i()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->j()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->k()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->m()Z

    move-result v0

    return v0
.end method

.method public getAdListener()Lcom/google/android/gms/ads/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->b()Lcom/google/android/gms/ads/a;

    move-result-object v0

    return-object v0
.end method

.method public getAdSize()Lcom/google/android/gms/ads/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->c()Lcom/google/android/gms/ads/d;

    move-result-object v0

    return-object v0
.end method

.method public getAdSizes()[Lcom/google/android/gms/ads/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->d()[Lcom/google/android/gms/ads/d;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppEventListener()Lcom/google/android/gms/ads/doubleclick/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->f()Lcom/google/android/gms/ads/doubleclick/a;

    move-result-object v0

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOnCustomRenderedAdLoadedListener()Lcom/google/android/gms/ads/doubleclick/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/f;->h()Lcom/google/android/gms/ads/doubleclick/c;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    sub-int v3, p4, p2

    sub-int/2addr v3, v1

    div-int/lit8 v3, v3, 0x2

    sub-int v4, p5, p3

    sub-int/2addr v4, v2

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v3

    add-int/2addr v2, v4

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_0

    invoke-virtual {p0, v2, p1, p2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I

    move-result v1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->setMeasuredDimension(II)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getAdSize()Lcom/google/android/gms/ads/d;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/d;->b(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/d;->a(Landroid/content/Context;)I

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Unable to retrieve ad size."

    invoke-static {v3, v2}, Lcom/google/android/gms/ads/internal/util/client/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    goto :goto_1

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/a;)V

    return-void
.end method

.method public varargs setAdSizes([Lcom/google/android/gms/ads/d;)V
    .locals 2

    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The supported ad sizes must contain at least one valid ad size."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->b([Lcom/google/android/gms/ads/d;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Ljava/lang/String;)V

    return-void
.end method

.method public setAppEventListener(Lcom/google/android/gms/ads/doubleclick/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/doubleclick/a;)V

    return-void
.end method

.method public setCorrelator(Lcom/google/android/gms/ads/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/e;)V

    return-void
.end method

.method public setManualImpressionsEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Z)V

    return-void
.end method

.method public setOnCustomRenderedAdLoadedListener(Lcom/google/android/gms/ads/doubleclick/c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->a:Lcom/google/android/gms/ads/internal/client/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/f;->a(Lcom/google/android/gms/ads/doubleclick/c;)V

    return-void
.end method
