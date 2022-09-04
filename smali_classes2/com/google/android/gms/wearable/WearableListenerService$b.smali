.class final Lcom/google/android/gms/wearable/WearableListenerService$b;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wearable/WearableListenerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/WearableListenerService;

.field private b:Z

.field private c:Lcom/google/android/gms/wearable/WearableListenerService$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService;Landroid/os/Looper;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/google/android/gms/wearable/WearableListenerService$a;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wearable/WearableListenerService$a;-><init>(Lcom/google/android/gms/wearable/WearableListenerService;Lcom/google/android/gms/wearable/WearableListenerService$1;)V

    iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->c:Lcom/google/android/gms/wearable/WearableListenerService$a;

    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UntrackedBindService"
        }
    .end annotation

    const/4 v4, 0x1

    const/4 v5, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->b:Z

    if-nez v0, :cond_0

    const-string v0, "WearableLS"

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-static {v1}, Lcom/google/android/gms/wearable/WearableListenerService;->a(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/ComponentName;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "bindService: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-static {v1}, Lcom/google/android/gms/wearable/WearableListenerService;->b(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->c:Lcom/google/android/gms/wearable/WearableListenerService$a;

    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/gms/wearable/WearableListenerService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    iput-boolean v4, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->b:Z

    :cond_0
    :try_start_0
    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v5}, Lcom/google/android/gms/wearable/WearableListenerService$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "WearableLS"

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-static {v1}, Lcom/google/android/gms/wearable/WearableListenerService;->a(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/ComponentName;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xf

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "unbindService: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->c:Lcom/google/android/gms/wearable/WearableListenerService$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    iput-boolean v5, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->b:Z

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "WearableLS"

    const-string v2, "Exception when unbinding from local service"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {p0, v5}, Lcom/google/android/gms/wearable/WearableListenerService$b;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "WearableLS"

    iget-object v2, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    invoke-static {v2}, Lcom/google/android/gms/wearable/WearableListenerService;->a(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/ComponentName;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0xf

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "unbindService: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v2, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->c:Lcom/google/android/gms/wearable/WearableListenerService$a;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/wearable/WearableListenerService;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    iput-boolean v5, p0, Lcom/google/android/gms/wearable/WearableListenerService$b;->b:Z

    :cond_2
    throw v1

    :catch_1
    move-exception v0

    const-string v2, "WearableLS"

    const-string v3, "Exception when unbinding from local service"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method
