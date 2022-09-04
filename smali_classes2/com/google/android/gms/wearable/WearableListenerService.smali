.class public abstract Lcom/google/android/gms/wearable/WearableListenerService;
.super Landroid/app/Service;

# interfaces
.implements Lcom/google/android/gms/wearable/a$c;
.implements Lcom/google/android/gms/wearable/c$a;
.implements Lcom/google/android/gms/wearable/e$b;
.implements Lcom/google/android/gms/wearable/m$b;
.implements Lcom/google/android/gms/wearable/p$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wearable/WearableListenerService$c;,
        Lcom/google/android/gms/wearable/WearableListenerService$b;,
        Lcom/google/android/gms/wearable/WearableListenerService$a;
    }
.end annotation


# static fields
.field public static final e:Ljava/lang/String; = "com.google.android.gms.wearable.BIND_LISTENER"


# instance fields
.field private f:Landroid/content/ComponentName;

.field private g:Lcom/google/android/gms/wearable/WearableListenerService$b;

.field private h:Landroid/os/IBinder;

.field private i:Landroid/content/Intent;

.field private final j:Ljava/lang/Object;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->j:Ljava/lang/Object;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/content/Intent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->i:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/wearable/WearableListenerService;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->j:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/wearable/WearableListenerService;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->k:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/wearable/WearableListenerService;)Lcom/google/android/gms/wearable/WearableListenerService$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->g:Lcom/google/android/gms/wearable/WearableListenerService$b;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/Channel;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/b;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/g;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/n;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/o;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/u;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/w;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/o;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/gms/wearable/o;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/gms/wearable/Channel;II)V
    .locals 0

    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    const-string v0, "com.google.android.gms.wearable.BIND_LISTENER"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->h:Landroid/os/IBinder;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Landroid/content/ComponentName;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    const-string v0, "WearableLS"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WearableLS"

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xa

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "onCreate: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "WearableListenerService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Lcom/google/android/gms/wearable/WearableListenerService$b;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/wearable/WearableListenerService$b;-><init>(Lcom/google/android/gms/wearable/WearableListenerService;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->g:Lcom/google/android/gms/wearable/WearableListenerService$b;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.wearable.BIND_LISTENER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->i:Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->i:Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    new-instance v0, Lcom/google/android/gms/wearable/WearableListenerService$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wearable/WearableListenerService$c;-><init>(Lcom/google/android/gms/wearable/WearableListenerService;Lcom/google/android/gms/wearable/WearableListenerService$1;)V

    iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->h:Landroid/os/IBinder;

    return-void
.end method

.method public onDestroy()V
    .locals 5

    const-string v0, "WearableLS"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WearableLS"

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xb

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "onDestroy: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->j:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->k:Z

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->g:Lcom/google/android/gms/wearable/WearableListenerService$b;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v2, p0, Lcom/google/android/gms/wearable/WearableListenerService;->f:Landroid/content/ComponentName;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x6f

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->g:Lcom/google/android/gms/wearable/WearableListenerService$b;

    invoke-virtual {v0}, Lcom/google/android/gms/wearable/WearableListenerService$b;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method
