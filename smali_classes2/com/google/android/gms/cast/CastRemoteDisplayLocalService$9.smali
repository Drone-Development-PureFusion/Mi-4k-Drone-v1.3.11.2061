.class Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<",
        "Lcom/google/android/gms/cast/d$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/d$c;)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-interface {p1}, Lcom/google/android/gms/cast/d$c;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "Connection was not successful"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "startRemoteDisplay successful"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->i()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v2, "Remote Display started but session already cancelled"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p1}, Lcom/google/android/gms/cast/d$c;->b()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v1, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/view/Display;)V

    :goto_1
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/ServiceConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0, v4}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    invoke-static {v0, v4}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/content/Context;)Landroid/content/Context;

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "Cast Remote Display session created without display"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "No need to unbind service, already unbound"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/d$c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;->a(Lcom/google/android/gms/cast/d$c;)V

    return-void
.end method
