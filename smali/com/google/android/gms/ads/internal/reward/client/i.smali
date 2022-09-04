.class public Lcom/google/android/gms/ads/internal/reward/client/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/b/b;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/reward/client/b;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/Object;

.field private d:Lcom/google/android/gms/ads/b/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/reward/client/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/reward/client/b;->a()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Could not forward show to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public a(Landroid/content/Context;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/reward/client/b;->a(Lcom/google/android/gms/c/e;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Could not forward pause to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/ads/b/c;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->d:Lcom/google/android/gms/ads/b/c;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    new-instance v2, Lcom/google/android/gms/ads/internal/reward/client/g;

    invoke-direct {v2, p1}, Lcom/google/android/gms/ads/internal/reward/client/g;-><init>(Lcom/google/android/gms/ads/b/c;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/reward/client/b;->a(Lcom/google/android/gms/ads/internal/reward/client/d;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "Could not forward setRewardedVideoAdListener to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "RewardedVideoAd.setUserId() is deprecated. Please do not call this method."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/ads/c;)V
    .locals 5

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/y;->a()Lcom/google/android/gms/ads/internal/client/y;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->b:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/c;->f()Lcom/google/android/gms/ads/internal/client/e;

    move-result-object v4

    invoke-virtual {v2, v3, v4, p1}, Lcom/google/android/gms/ads/internal/client/y;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/e;Ljava/lang/String;)Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/reward/client/b;->a(Lcom/google/android/gms/ads/internal/reward/client/RewardedVideoAdRequestParcel;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Could not forward loadAd to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public b(Landroid/content/Context;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/reward/client/b;->b(Lcom/google/android/gms/c/e;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Could not forward resume to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public b()Z
    .locals 4

    const/4 v0, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v1, :cond_0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return v0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/reward/client/b;->b()Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    :try_start_2
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v1

    :try_start_3
    const-string v3, "Could not forward isLoaded to RewardedVideoAd"

    invoke-static {v3, v1}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/reward/client/i;->a(Landroid/content/Context;)V

    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    if-nez v0, :cond_0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->a:Lcom/google/android/gms/ads/internal/reward/client/b;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/ads/internal/reward/client/b;->c(Lcom/google/android/gms/c/e;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    :try_start_3
    const-string v2, "Could not forward destroy to RewardedVideoAd"

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/reward/client/i;->b(Landroid/content/Context;)V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/reward/client/i;->c(Landroid/content/Context;)V

    return-void
.end method

.method public f()Lcom/google/android/gms/ads/b/c;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/reward/client/i;->d:Lcom/google/android/gms/ads/b/c;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    const-string v0, "RewardedVideoAd.getUserId() is deprecated. Please do not call this method."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/b;->d(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
