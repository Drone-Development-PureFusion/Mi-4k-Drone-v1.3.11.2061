.class public Lcom/google/android/gms/location/internal/l;
.super Lcom/google/android/gms/location/internal/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/location/internal/l$c;,
        Lcom/google/android/gms/location/internal/l$b;,
        Lcom/google/android/gms/location/internal/l$a;
    }
.end annotation


# instance fields
.field private final e:Lcom/google/android/gms/location/internal/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;)V
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->a(Landroid/content/Context;)Lcom/google/android/gms/common/internal/s;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/location/internal/l;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/common/internal/s;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/common/internal/s;)V
    .locals 2

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/location/internal/b;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/common/internal/s;)V

    new-instance v0, Lcom/google/android/gms/location/internal/k;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/l;->a:Lcom/google/android/gms/location/internal/p;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/location/internal/k;-><init>(Landroid/content/Context;Lcom/google/android/gms/location/internal/p;)V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    return-void
.end method


# virtual methods
.method public a(JLandroid/app/PendingIntent;)V
    .locals 5

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    invoke-static {p3}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "detectionIntervalMillis must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/i;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/location/internal/i;->a(JZLandroid/app/PendingIntent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/app/PendingIntent;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/i;

    invoke-interface {v0, p1}, Lcom/google/android/gms/location/internal/i;->a(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ResultHolder not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/location/internal/l$b;

    invoke-direct {v1, p2}, Lcom/google/android/gms/location/internal/l$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/i;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->B()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/location/internal/i;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/h;Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/internal/k;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/g;)V

    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/k;->a(Landroid/location/Location;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/GeofencingRequest;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    const-string v0, "geofencingRequest can\'t be null."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ResultHolder not provided."

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/location/internal/l$a;

    invoke-direct {v1, p3}, Lcom/google/android/gms/location/internal/l$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/i;

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/location/internal/i;->a(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/h;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/location/internal/g;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/l;Landroid/os/Looper;Lcom/google/android/gms/location/internal/g;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/l;Landroid/os/Looper;Lcom/google/android/gms/location/internal/g;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/location/LocationSettingsRequest;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/location/LocationSettingsRequest;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/location/LocationSettingsResult;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "locationSettingsRequest can\'t be null nor empty."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    if-eqz p2, :cond_1

    :goto_1
    const-string v0, "listener can\'t be null."

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    new-instance v1, Lcom/google/android/gms/location/internal/l$c;

    invoke-direct {v1, p2}, Lcom/google/android/gms/location/internal/l$c;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/internal/i;

    invoke-interface {v0, p1, v1, p3}, Lcom/google/android/gms/location/internal/i;->a(Lcom/google/android/gms/location/LocationSettingsRequest;Lcom/google/android/gms/location/internal/j;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method public a(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/k;Landroid/os/Looper;Lcom/google/android/gms/location/internal/g;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/internal/LocationRequestInternal;Lcom/google/android/gms/location/k;Landroid/os/Looper;Lcom/google/android/gms/location/internal/g;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/location/internal/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/internal/g;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/k;Lcom/google/android/gms/location/internal/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/k;Lcom/google/android/gms/location/internal/g;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/location/l;Lcom/google/android/gms/location/internal/g;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/internal/k;->a(Lcom/google/android/gms/location/l;Lcom/google/android/gms/location/internal/g;)V

    return-void
.end method

.method public a(Ljava/util/List;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->F()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    const-string v0, "ResultHolder not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/location/internal/l$b;

    invoke-direct {v2, p2}, Lcom/google/android/gms/location/internal/l$b;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->G()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/location/internal/i;

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->B()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/location/internal/i;->a([Ljava/lang/String;Lcom/google/android/gms/location/internal/h;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/location/internal/k;->a(Z)V

    return-void
.end method

.method public f()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/l;->t()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/k;->c()V

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/k;->d()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    invoke-super {p0}, Lcom/google/android/gms/location/internal/b;->f()V

    monitor-exit v1

    return-void

    :catch_0
    move-exception v0

    const-string v2, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public h()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/k;->a()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/google/android/gms/location/LocationAvailability;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/l;->e:Lcom/google/android/gms/location/internal/k;

    invoke-virtual {v0}, Lcom/google/android/gms/location/internal/k;->b()Lcom/google/android/gms/location/LocationAvailability;

    move-result-object v0

    return-object v0
.end method
