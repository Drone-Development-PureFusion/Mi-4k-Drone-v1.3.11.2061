.class public Lcom/google/android/gms/internal/zo;
.super Lcom/google/android/gms/internal/zj;

# interfaces
.implements Lcom/google/android/gms/internal/acz$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/zn$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/abi$a;Lcom/google/android/gms/internal/acy;Lcom/google/android/gms/internal/zn$a;)V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zo;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->e:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zo;->c:Lcom/google/android/gms/internal/acy;

    invoke-interface {v0}, Lcom/google/android/gms/internal/acy;->l()Lcom/google/android/gms/internal/acz;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/acz;->a(Lcom/google/android/gms/internal/acz$a;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/zo;->f()V

    const-string v0, "Loading HTML in WebView."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/zo;->c:Lcom/google/android/gms/internal/acy;

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zo;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/abv;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zo;->e:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->c:Ljava/lang/String;

    const-string v3, "text/html"

    const-string v4, "UTF-8"

    const/4 v5, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/acy;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected f()V
    .locals 0

    return-void
.end method
