.class public abstract Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
.super Landroid/app/Service;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;,
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;,
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;,
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;,
        Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;

.field private static final b:I

.field private static final c:Ljava/lang/Object;

.field private static d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;


# instance fields
.field private e:Lcom/google/android/gms/common/api/g;

.field private f:Lcom/google/android/gms/cast/d$b;

.field private g:Ljava/lang/String;

.field private h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

.field private i:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

.field private j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

.field private k:Landroid/app/Notification;

.field private l:Z

.field private m:Landroid/app/PendingIntent;

.field private n:Lcom/google/android/gms/cast/CastDevice;

.field private o:Landroid/view/Display;

.field private p:Landroid/content/Context;

.field private q:Landroid/content/ServiceConnection;

.field private r:Landroid/os/Handler;

.field private s:Landroid/support/v7/media/MediaRouter;

.field private t:Z

.field private final u:Landroid/support/v7/media/MediaRouter$Callback;

.field private final w:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastRemoteDisplayLocalService"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j()I

    move-result v0

    sput v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->t:Z

    new-instance v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->u:Landroid/support/v7/media/MediaRouter$Callback;

    new-instance v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$d;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->w:Landroid/os/IBinder;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->n:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;)Lcom/google/android/gms/common/api/g;
    .locals 4

    new-instance v0, Lcom/google/android/gms/cast/d$a$a;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f:Lcom/google/android/gms/cast/d$b;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/cast/d$a$a;-><init>(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/d$b;)V

    if-eqz p2, :cond_0

    iget v1, p2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/d$a$a;->a(I)Lcom/google/android/gms/cast/d$a$a;

    :cond_0
    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$2;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    new-instance v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$3;

    invoke-direct {v2, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$3;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    new-instance v3, Lcom/google/android/gms/common/api/g$a;

    invoke-direct {v3, p0, v1, v2}, Lcom/google/android/gms/common/api/g$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    sget-object v1, Lcom/google/android/gms/cast/d;->d:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/d$a$a;->a()Lcom/google/android/gms/cast/d$a;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/a$a$a;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g$a;->c()Lcom/google/android/gms/common/api/g;

    move-result-object v0

    return-object v0
.end method

.method protected static a()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/m;->a(Z)V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    new-instance v0, Landroid/content/ComponentName;

    invoke-direct {v0, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v2, 0x80

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Landroid/content/pm/ServiceInfo;->exported:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The service must not be exported, verify the manifest configuration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Service not found, did you forget to configure it in the manifest?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/CastDevice;",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;",
            ")V"
        }
    .end annotation

    new-instance v4, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;

    invoke-direct {v4}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/cast/CastDevice;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/CastDevice;",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;",
            "Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;",
            ")V"
        }
    .end annotation

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Starting Service"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "An existing service had not been stopped before starting one"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d(Z)V

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "activityContext is required."

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "serviceClass is required."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "applicationId is required."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "device is required."

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "options is required."

    invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "notificationSettings is required."

    invoke-static {p5, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "callbacks is required."

    invoke-static {p6, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p5}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "notificationSettings: Either the notification or the notificationPendingIntent must be provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Service is already being started, startService has been called twice"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_2
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7, p0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    new-instance v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p0

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$5;-><init>(Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)V

    const/16 v1, 0x40

    invoke-virtual {p0, v7, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/view/Display;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b(Landroid/view/Display;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "[Instance: %s] %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Z)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d(Z)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Landroid/content/ServiceConnection;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)Z
    .locals 1

    invoke-direct/range {p0 .. p7}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Landroid/content/ServiceConnection;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/content/Context;Landroid/content/ServiceConnection;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;)Z
    .locals 7

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v0, 0x0

    const-string v2, "startRemoteDisplaySession"

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    const-string v2, "Starting the Cast Remote Display must be done on the main thread"

    invoke-static {v2}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    sget-object v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    if-eqz v3, :cond_0

    sget-object v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v3, "An existing service had not been stopped before starting one"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v4}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v2

    :goto_0
    return v0

    :cond_0
    sput-object p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p7, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->n:Lcom/google/android/gms/cast/CastDevice;

    iput-object p5, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    iput-object p6, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v7/media/MediaRouter;->getInstance(Landroid/content/Context;)Landroid/support/v7/media/MediaRouter;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    new-instance v2, Landroid/support/v7/media/MediaRouteSelector$Builder;

    invoke-direct {v2}, Landroid/support/v7/media/MediaRouteSelector$Builder;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/cast/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/media/MediaRouteSelector$Builder;->addControlCategory(Ljava/lang/String;)Landroid/support/v7/media/MediaRouteSelector$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v7/media/MediaRouteSelector$Builder;->build()Landroid/support/v7/media/MediaRouteSelector;

    move-result-object v2

    const-string v3, "addMediaRouterCallback"

    invoke-direct {p0, v3}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    iget-object v4, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->u:Landroid/support/v7/media/MediaRouter$Callback;

    const/4 v5, 0x4

    invoke-virtual {v3, v2, v4, v5}, Landroid/support/v7/media/MediaRouter;->addCallback(Landroid/support/v7/media/MediaRouteSelector;Landroid/support/v7/media/MediaRouter$Callback;I)V

    new-instance v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$8;

    invoke-direct {v2, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$8;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->f:Lcom/google/android/gms/cast/d$b;

    invoke-static {p4}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    new-instance v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

    invoke-direct {v2, v6}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->i:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->i:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v2, v3}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-direct {v2, p4, v6}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$1;)V

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v2

    if-nez v2, :cond_2

    iput-boolean v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l:Z

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e(Z)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    :goto_1
    sget v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b:I

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->startForeground(ILandroid/app/Notification;)V

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;)Lcom/google/android/gms/common/api/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->e()V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    invoke-interface {v0, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    :cond_1
    move v0, v1

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2
    iput-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l:Z

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    goto :goto_1
.end method

.method static synthetic b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Landroid/view/Display;)Landroid/view/Display;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o:Landroid/view/Display;

    return-object p1
.end method

.method private b(Landroid/view/Display;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o:Landroid/view/Display;

    iget-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e(Z)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    sget v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b:I

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->startForeground(ILandroid/app/Notification;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    invoke-interface {v0, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o:Landroid/view/Display;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Landroid/view/Display;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
    .locals 2

    const-string v0, "updateNotificationSettingsInternal must be called on the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No current notification settings to update"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l:Z

    if-eqz v0, :cond_5

    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Current mode is default notification, notification attribute must not be provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/PendingIntent;)Landroid/app/PendingIntent;

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e(Z)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    :goto_0
    sget v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b:I

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->startForeground(ILandroid/app/Notification;)V

    return-void

    :cond_5
    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    const-string v1, "notification is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/Notification;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;Landroid/app/Notification;)Landroid/app/Notification;

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "[Instance: %s] %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$6;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$6;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c(Z)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->t:Z

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->n()V

    return-void
.end method

.method private c(Z)V
    .locals 3

    const/4 v2, 0x0

    const-string v0, "Stopping Service"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    const-string v0, "stopServiceInstanceInternal must be called on the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    if-eqz v0, :cond_0

    const-string v0, "Setting default route"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    invoke-virtual {v1}, Landroid/support/v7/media/MediaRouter;->getDefaultRoute()Landroid/support/v7/media/MediaRouter$RouteInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->selectRoute(Landroid/support/v7/media/MediaRouter$RouteInfo;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->i:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

    if-eqz v0, :cond_1

    const-string v0, "Unregistering notification receiver"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->i:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$e;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o()V

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p()V

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k()V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->g()V

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    :cond_3
    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g:Ljava/lang/String;

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->k:Landroid/app/Notification;

    iput-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o:Landroid/view/Display;

    return-void

    :catch_0
    move-exception v0

    const-string v0, "No need to unbind service, already unbound"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    return-object v0
.end method

.method public static d()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
    .locals 2

    sget-object v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static d(Z)V
    .locals 4

    const/4 v3, 0x0

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Stopping Service"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Service is already being stopped"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    const/4 v2, 0x0

    sput-object v2, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->b(Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private e(Z)Landroid/app/Notification;
    .locals 7

    const/4 v6, 0x1

    const-string v0, "createDefaultNotification"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v4, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->b(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->c(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_1

    sget v1, Lcom/google/android/gms/R$string;->cast_notification_connected_message:I

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_notification_on:I

    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p0, v4}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->n:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v5}, Lcom/google/android/gms/cast/CastDevice;->e()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v1, v3}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_1
    new-instance v3, Landroid/support/v4/app/NotificationCompat$Builder;

    invoke-direct {v3, p0}, Landroid/support/v4/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->j:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;

    invoke-static {v2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;->d(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/NotificationCompat$Builder;->setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/NotificationCompat$Builder;->setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    const v1, 0x1080038

    sget v2, Lcom/google/android/gms/R$string;->cast_notification_disconnect:I

    invoke-virtual {p0, v2}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompat$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0

    :cond_1
    sget v1, Lcom/google/android/gms/R$string;->cast_notification_connecting_message:I

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_notification_connecting:I

    goto :goto_0

    :cond_2
    move-object v1, v3

    goto :goto_1
.end method

.method static synthetic e(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)Landroid/content/ServiceConnection;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->q:Landroid/content/ServiceConnection;

    return-object v0
.end method

.method public static e()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d(Z)V

    return-void
.end method

.method static synthetic f()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->l()V

    return-void
.end method

.method static synthetic g()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic h()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic i()Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->v:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;

    return-object v0
.end method

.method private static j()I
    .locals 1

    sget v0, Lcom/google/android/gms/R$id;->cast_notification_id:I

    return v0
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    if-eqz v0, :cond_0

    const-string v0, "CastRemoteDisplayLocalService calls must be done on the main thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Ljava/lang/String;)V

    const-string v0, "removeMediaRouterCallback"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->s:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->u:Landroid/support/v7/media/MediaRouter$Callback;

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->removeCallback(Landroid/support/v7/media/MediaRouter$Callback;)V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 3

    const-string v0, "startRemoteDisplay"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Unable to start the remote display as the API client is not ready"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/cast/d;->e:Lcom/google/android/gms/cast/e;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    iget-object v2, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->g:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/cast/e;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$9;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    goto :goto_0
.end method

.method private m()V
    .locals 3

    const-string v0, "stopRemoteDisplay"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "Unable to stop the remote display as the API client is not ready"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/google/android/gms/cast/d;->e:Lcom/google/android/gms/cast/e;

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e:Lcom/google/android/gms/common/api/g;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/e;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$10;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$10;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/i;->a(Lcom/google/android/gms/common/api/n;)V

    goto :goto_0
.end method

.method private n()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x898

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;->a(Lcom/google/android/gms/common/api/Status;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->h:Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$a;

    :cond_0
    invoke-static {}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->e()V

    return-void
.end method

.method private o()V
    .locals 1

    const-string v0, "stopRemoteDisplaySession"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->m()V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->c()V

    return-void
.end method

.method private p()V
    .locals 1

    const-string v0, "Stopping the remote display Service"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->stopForeground(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->stopSelf()V

    return-void
.end method

.method private q()Landroid/app/PendingIntent;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->m:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->p:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v1, 0x0

    const/high16 v2, 0x10000000

    invoke-static {p0, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->m:Landroid/app/PendingIntent;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->m:Landroid/app/PendingIntent;

    return-object v0
.end method


# virtual methods
.method public abstract a(Landroid/view/Display;)V
.end method

.method public a(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V
    .locals 2

    const-string v0, "notificationSettings is required."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    const-string v1, "Service is not ready yet."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$7;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected b()Landroid/view/Display;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->o:Landroid/view/Display;

    return-object v0
.end method

.method public abstract c()V
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "onBind"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->w:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    const-string v0, "onCreate"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    iget-object v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->r:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$4;-><init>(Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const-string v0, "onStartCommand"

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;->t:Z

    const/4 v0, 0x2

    return v0
.end method
