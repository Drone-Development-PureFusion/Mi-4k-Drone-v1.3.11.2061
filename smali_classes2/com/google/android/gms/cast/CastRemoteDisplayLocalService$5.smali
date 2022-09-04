.class final Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/cast/CastDevice;

.field final synthetic c:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;

.field final synthetic d:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

.field final synthetic e:Landroid/content/Context;

.field final synthetic f:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->b:Lcom/google/android/gms/cast/CastDevice;

    iput-object p3, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->c:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;

    iput-object p4, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->d:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    iput-object p5, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->e:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->f:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 9

    const/4 v8, 0x0

    check-cast p2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;

    invoke-virtual {p2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;->a()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->b:Lcom/google/android/gms/cast/CastDevice;

    iget-object v3, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->c:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;

    iget-object v4, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->d:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    iget-object v5, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->e:Landroid/content/Context;

    iget-object v7, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->f:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    move-object v6, p0

    invoke-static/range {v0 .. v7}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Landroid/content/ServiceConnection;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "Connected but unable to get the service instance"

    new-array v2, v8, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->f:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x898

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->e:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "No need to unbind service, already unbound"

    new-array v2, v8, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    const/4 v4, 0x0

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "onServiceDisconnected"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->f:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x899

    const-string v3, "Service Disconnected"

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;->a(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;->e:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "No need to unbind service, already unbound"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
