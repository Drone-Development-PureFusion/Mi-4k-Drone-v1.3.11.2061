.class public Lcom/google/android/gms/internal/agv;
.super Lcom/google/android/gms/common/internal/w;

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/agx;",
        ">;",
        "Landroid/os/IBinder$DeathRecipient;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private e:Lcom/google/android/gms/cast/d$b;

.field private f:Lcom/google/android/gms/cast/CastDevice;

.field private g:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastRemoteDisplayClientImpl"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/cast/CastDevice;Landroid/os/Bundle;Lcom/google/android/gms/cast/d$b;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0x53

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p7

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    sget-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "instance created"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p6, p0, Lcom/google/android/gms/internal/agv;->e:Lcom/google/android/gms/cast/d$b;

    iput-object p4, p0, Lcom/google/android/gms/internal/agv;->f:Lcom/google/android/gms/cast/CastDevice;

    iput-object p5, p0, Lcom/google/android/gms/internal/agv;->g:Landroid/os/Bundle;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agv;)Lcom/google/android/gms/cast/d$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agv;->e:Lcom/google/android/gms/cast/d$b;

    return-object v0
.end method

.method static synthetic h()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/agx;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/agx$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/agx;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.remote_display.service.START"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/agw;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "stopRemoteDisplay"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/agx;->a(Lcom/google/android/gms/internal/agw;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/agw;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agx;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/agx;->a(Lcom/google/android/gms/internal/agw;I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/agw;Lcom/google/android/gms/internal/agy;Ljava/lang/String;)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "startRemoteDisplay"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Lcom/google/android/gms/internal/agv$1;

    invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/agv$1;-><init>(Lcom/google/android/gms/internal/agv;Lcom/google/android/gms/internal/agy;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agx;

    iget-object v1, p0, Lcom/google/android/gms/internal/agv;->f:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/CastDevice;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/google/android/gms/internal/agv;->g:Landroid/os/Bundle;

    move-object v1, p1

    move-object v4, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/agx;->a(Lcom/google/android/gms/internal/agw;Lcom/google/android/gms/internal/agy;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agv;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/agx;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService"

    return-object v0
.end method

.method public binderDied()V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 4

    const/4 v3, 0x0

    sget-object v0, Lcom/google/android/gms/internal/agv;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "disconnect"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/agv;->e:Lcom/google/android/gms/cast/d$b;

    iput-object v3, p0, Lcom/google/android/gms/internal/agv;->f:Lcom/google/android/gms/cast/CastDevice;

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/agv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/agx;

    invoke-interface {v0}, Lcom/google/android/gms/internal/agx;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :goto_1
    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    throw v0

    :catch_1
    move-exception v0

    goto :goto_1
.end method
