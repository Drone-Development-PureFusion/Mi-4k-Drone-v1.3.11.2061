.class Lcom/google/android/gms/ads/internal/client/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/ads/internal/client/o;->a(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/client/o;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/client/o;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/o$1;->a:Lcom/google/android/gms/ads/internal/client/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/o$1;->a:Lcom/google/android/gms/ads/internal/client/o;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/o;->a(Lcom/google/android/gms/ads/internal/client/o;)Lcom/google/android/gms/ads/internal/reward/client/d;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/o$1;->a:Lcom/google/android/gms/ads/internal/client/o;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/o;->a(Lcom/google/android/gms/ads/internal/client/o;)Lcom/google/android/gms/ads/internal/reward/client/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/reward/client/d;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onRewardedVideoAdFailedToLoad event."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
