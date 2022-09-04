.class public Lcom/google/android/gms/internal/zg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/purchase/c;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/zc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zc;->b()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward getProductId to InAppPurchaseResult"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Landroid/content/Intent;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zc;->c()Landroid/content/Intent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward getPurchaseData to InAppPurchaseResult"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zc;->d()I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward getPurchaseData to InAppPurchaseResult"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zc;->a()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward isVerified to InAppPurchaseResult"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zg;->a:Lcom/google/android/gms/internal/zc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/zc;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not forward finishPurchase to InAppPurchaseResult"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
