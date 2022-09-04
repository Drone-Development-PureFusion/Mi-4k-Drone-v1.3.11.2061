.class public final Lcom/google/android/gms/nearby/internal/connection/dev/k;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/nearby/internal/connection/dev/u;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0x36

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/google/android/gms/nearby/internal/connection/dev/k;->a:J

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/dev/u;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/nearby/internal/connection/dev/u$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/dev/u;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.connection.service.START"

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/nearby/internal/connection/dev/k;->a(Landroid/os/IBinder;)Lcom/google/android/gms/nearby/internal/connection/dev/u;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.internal.connection.dev.INearbyConnectionService"

    return-object v0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "clientId"

    iget-wide v2, p0, Lcom/google/android/gms/nearby/internal/connection/dev/k;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public f()V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/nearby/internal/connection/dev/k;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/nearby/internal/connection/dev/k;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/nearby/internal/connection/dev/u;

    new-instance v1, Lcom/google/android/gms/nearby/internal/connection/dev/ClientDisconnectingParams;

    invoke-direct {v1}, Lcom/google/android/gms/nearby/internal/connection/dev/ClientDisconnectingParams;-><init>()V

    invoke-interface {v0, v1}, Lcom/google/android/gms/nearby/internal/connection/dev/u;->a(Lcom/google/android/gms/nearby/internal/connection/dev/ClientDisconnectingParams;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Failed to notify client disconnect."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
