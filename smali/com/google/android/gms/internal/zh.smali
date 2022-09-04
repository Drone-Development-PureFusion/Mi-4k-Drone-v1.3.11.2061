.class public Lcom/google/android/gms/internal/zh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/purchase/a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final e:Lcom/google/android/gms/internal/yx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/yx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/zh;->e:Lcom/google/android/gms/internal/yx;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zh;->e:Lcom/google/android/gms/internal/yx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/yx;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not forward getProductId to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zh;->e:Lcom/google/android/gms/internal/yx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/yx;->b(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not forward recordResolution to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public b(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/zh;->e:Lcom/google/android/gms/internal/yx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/yx;->c(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not forward recordPlayBillingResolution to InAppPurchase"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
