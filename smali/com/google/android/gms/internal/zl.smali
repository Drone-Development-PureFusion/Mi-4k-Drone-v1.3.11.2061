.class public Lcom/google/android/gms/internal/zl;
.super Lcom/google/android/gms/internal/zj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private g:Lcom/google/android/gms/internal/zk;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/zn$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/zn$a;)V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->c:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->k()Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v0

    iget-boolean v1, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->e:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    :goto_0
    new-instance v2, Lcom/google/android/gms/internal/zk;

    iget-object v3, p0, Lcom/google/android/gms/internal/zl;->c:Lcom/google/android/gms/internal/acy;

    invoke-direct {v2, p0, v3, v1, v0}, Lcom/google/android/gms/internal/zk;-><init>(Lcom/google/android/gms/internal/acz$a;Lcom/google/android/gms/internal/acy;II)V

    iput-object v2, p0, Lcom/google/android/gms/internal/zl;->g:Lcom/google/android/gms/internal/zk;

    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->c:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz$a;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->g:Lcom/google/android/gms/internal/zk;

    iget-object v1, p0, Lcom/google/android/gms/internal/zl;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zk;->a(Lcom/google/android/gms/ads/internal/request/AdResponseParcel;)V

    return-void

    :cond_0
    iget v1, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->g:I

    iget v0, v0, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->d:I

    goto :goto_0
.end method

.method protected c()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->g:Lcom/google/android/gms/internal/zk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zk;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ad-Network indicated no fill with passback URL."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zl;->g:Lcom/google/android/gms/internal/zk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zk;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, -0x2

    goto :goto_0
.end method
