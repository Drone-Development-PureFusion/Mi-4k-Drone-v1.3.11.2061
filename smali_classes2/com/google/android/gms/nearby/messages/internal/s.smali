.class Lcom/google/android/gms/nearby/messages/internal/s;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/internal/s$h;,
        Lcom/google/android/gms/nearby/messages/internal/s$b;,
        Lcom/google/android/gms/nearby/messages/internal/s$e;,
        Lcom/google/android/gms/nearby/messages/internal/s$g;,
        Lcom/google/android/gms/nearby/messages/internal/s$f;,
        Lcom/google/android/gms/nearby/messages/internal/s$c;,
        Lcom/google/android/gms/nearby/messages/internal/s$d;,
        Lcom/google/android/gms/nearby/messages/internal/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/nearby/messages/internal/l;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

.field private final e:I

.field private final f:Lcom/google/android/gms/nearby/messages/internal/s$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/nearby/messages/internal/s$h",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            "Lcom/google/android/gms/nearby/messages/internal/s$f;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/nearby/messages/internal/s$h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/nearby/messages/internal/s$h",
            "<",
            "Lcom/google/android/gms/nearby/messages/e;",
            "Lcom/google/android/gms/nearby/messages/internal/s$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/nearby/messages/g;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    const/16 v3, 0x3e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p5

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/s$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/nearby/messages/internal/s$1;-><init>(Lcom/google/android/gms/nearby/messages/internal/s;)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/s$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/nearby/messages/internal/s$2;-><init>(Lcom/google/android/gms/nearby/messages/internal/s;)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {p5}, Lcom/google/android/gms/common/internal/s;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Landroid/content/Context;)I

    move-result v5

    if-eqz p6, :cond_1

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    iget-object v2, p6, Lcom/google/android/gms/nearby/messages/g;->a:Ljava/lang/String;

    iget-boolean v3, p6, Lcom/google/android/gms/nearby/messages/g;->b:Z

    iget-object v4, p6, Lcom/google/android/gms/nearby/messages/g;->d:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->a:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    iget v0, p6, Lcom/google/android/gms/nearby/messages/g;->c:I

    iput v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->e:I

    :goto_0
    const/4 v0, 0x1

    if-ne v5, v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/common/util/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/app/Activity;

    const-string v0, "NearbyMessagesClient"

    const-string v1, "Registering ClientLifecycleSafetyNet\'s ActivityLifecycleCallbacks for %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/s$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/google/android/gms/nearby/messages/internal/s$b;-><init>(Landroid/app/Activity;Lcom/google/android/gms/nearby/messages/internal/s;Lcom/google/android/gms/nearby/messages/internal/s$1;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->a:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->e:I

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;)I
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    instance-of v0, p0, Landroid/app/Application;

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    instance-of v0, p0, Landroid/app/Service;

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;Lcom/google/android/gms/nearby/messages/internal/s$h;)Lcom/google/android/gms/internal/ail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/common/api/g;",
            "TC;",
            "Lcom/google/android/gms/nearby/messages/internal/s$h",
            "<TC;+",
            "Lcom/google/android/gms/nearby/messages/internal/s$a",
            "<TC;>;>;)",
            "Lcom/google/android/gms/internal/ail",
            "<TC;>;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/nearby/messages/internal/s$a;->a()Lcom/google/android/gms/internal/ail;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/e;)Lcom/google/android/gms/internal/ail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/e;",
            ")",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;Lcom/google/android/gms/nearby/messages/internal/s$h;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/nearby/messages/l;)Lcom/google/android/gms/internal/ail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/nearby/messages/l;",
            ")",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/Object;Lcom/google/android/gms/nearby/messages/internal/s$h;)Lcom/google/android/gms/internal/ail;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/l;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/l$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/l;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START"

    return-object v0
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/GetPermissionStatusRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Landroid/app/PendingIntent;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Landroid/app/PendingIntent;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;

    const/4 v0, 0x0

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p2, v3}, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;-><init>(Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;I)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Landroid/app/PendingIntent;Lcom/google/android/gms/nearby/messages/n;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/nearby/messages/n;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;

    invoke-virtual {p3}, Lcom/google/android/gms/nearby/messages/n;->a()Lcom/google/android/gms/nearby/messages/Strategy;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v3

    invoke-virtual {p3}, Lcom/google/android/gms/nearby/messages/n;->b()Lcom/google/android/gms/nearby/messages/MessageFilter;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {p3}, Lcom/google/android/gms/nearby/messages/n;->c()Lcom/google/android/gms/nearby/messages/m;

    move-result-object v5

    invoke-static {v5}, Lcom/google/android/gms/nearby/messages/internal/s$g;->a(Lcom/google/android/gms/nearby/messages/m;)Lcom/google/android/gms/nearby/messages/internal/s$g;

    move-result-object v8

    iget-boolean v9, p3, Lcom/google/android/gms/nearby/messages/n;->b:Z

    move-object v5, p2

    move-object v7, v1

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;-><init>(Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;I[BLandroid/os/IBinder;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v1, v0}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/e;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/e;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;-><init>(Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;I)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/UnsubscribeRequest;)V

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->b(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    goto :goto_0
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/e;Lcom/google/android/gms/nearby/messages/n;[B)V
    .locals 10
    .param p5    # [B
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/e;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/e;",
            "Lcom/google/android/gms/nearby/messages/n;",
            "[B)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;

    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/s;->g:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v1

    check-cast v1, Landroid/os/IBinder;

    invoke-virtual {p4}, Lcom/google/android/gms/nearby/messages/n;->a()Lcom/google/android/gms/nearby/messages/Strategy;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v3

    invoke-virtual {p4}, Lcom/google/android/gms/nearby/messages/n;->b()Lcom/google/android/gms/nearby/messages/MessageFilter;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual {p4}, Lcom/google/android/gms/nearby/messages/n;->c()Lcom/google/android/gms/nearby/messages/m;

    move-result-object v7

    invoke-static {v7}, Lcom/google/android/gms/nearby/messages/internal/s$g;->a(Lcom/google/android/gms/nearby/messages/m;)Lcom/google/android/gms/nearby/messages/internal/s$g;

    move-result-object v8

    iget-boolean v9, p4, Lcom/google/android/gms/nearby/messages/n;->b:Z

    move-object v7, p5

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;-><init>(Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/MessageFilter;Landroid/app/PendingIntent;I[BLandroid/os/IBinder;Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v1, v0}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/l;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;-><init>(Landroid/os/IBinder;Landroid/os/IBinder;)V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->d:Z

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/s;->a:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    invoke-direct {v1, p2, v0, v2}, Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;-><init>(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Landroid/os/IBinder;Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/UnpublishRequest;)V

    return-void
.end method

.method a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Lcom/google/android/gms/nearby/messages/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;",
            "Lcom/google/android/gms/nearby/messages/k;",
            ")V"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;

    invoke-virtual {p3}, Lcom/google/android/gms/nearby/messages/k;->a()Lcom/google/android/gms/nearby/messages/Strategy;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v2

    invoke-virtual {p3}, Lcom/google/android/gms/nearby/messages/k;->b()Lcom/google/android/gms/nearby/messages/j;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/nearby/messages/internal/s$e;->a(Lcom/google/android/gms/nearby/messages/j;)Lcom/google/android/gms/nearby/messages/internal/s$e;

    move-result-object v3

    invoke-direct {v1, p2, v0, v2, v3}, Lcom/google/android/gms/nearby/messages/internal/PublishRequest;-><init>(Lcom/google/android/gms/nearby/messages/internal/MessageWrapper;Lcom/google/android/gms/nearby/messages/Strategy;Landroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/PublishRequest;)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/messages/internal/s;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/messages/internal/l;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService"

    return-object v0
.end method

.method b(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/nearby/messages/l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/messages/l;",
            ">;",
            "Lcom/google/android/gms/nearby/messages/l;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;

    invoke-static {p1}, Lcom/google/android/gms/nearby/messages/internal/v;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/nearby/messages/internal/v;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->a(Lcom/google/android/gms/internal/ail;Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;-><init>(Landroid/os/IBinder;Landroid/os/IBinder;)V

    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;->d:Z

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/RegisterStatusCallbackRequest;)V

    iget-object v0, p0, Lcom/google/android/gms/nearby/messages/internal/s;->f:Lcom/google/android/gms/nearby/messages/internal/s$h;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/nearby/messages/internal/s$h;->b(Ljava/lang/Object;)Lcom/google/android/gms/nearby/messages/internal/s$a;

    goto :goto_0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->c()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "NearbyPermissions"

    iget v2, p0, Lcom/google/android/gms/nearby/messages/internal/s;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "ClientAppContext"

    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/s;->a:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object v0
.end method

.method c(I)V
    .locals 6

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch p1, :pswitch_data_0

    const-string v0, "NearbyMessagesClient"

    const-string v1, "Received unknown/unforeseen client lifecycle event %d, can\'t do anything with it."

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    const-string v0, "ACTIVITY_STOPPED"

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;

    invoke-direct {v1, p1}, Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;-><init>(I)V

    const-string v2, "NearbyMessagesClient"

    const-string v3, "Emitting client lifecycle event %s"

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/messages/internal/s;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/messages/internal/l;

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/messages/internal/l;->a(Lcom/google/android/gms/nearby/messages/internal/HandleClientLifecycleEventRequest;)V

    goto :goto_0

    :pswitch_1
    const-string v0, "CLIENT_DISCONNECTED"

    goto :goto_1

    :cond_0
    const-string v1, "NearbyMessagesClient"

    const-string v2, "Failed to emit client lifecycle event %s due to GmsClient being disconnected"

    new-array v3, v4, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public f()V
    .locals 5

    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/google/android/gms/nearby/messages/internal/s;->c(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyMessagesClient"

    const-string v2, "Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
