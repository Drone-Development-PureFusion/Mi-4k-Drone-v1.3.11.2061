.class public final Lcom/google/android/gms/internal/anf;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/anf$c;,
        Lcom/google/android/gms/internal/anf$a;,
        Lcom/google/android/gms/internal/anf$d;,
        Lcom/google/android/gms/internal/anf$b;,
        Lcom/google/android/gms/internal/anf$g;,
        Lcom/google/android/gms/internal/anf$e;,
        Lcom/google/android/gms/internal/anf$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/internal/ani;",
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

    iput-wide v0, p0, Lcom/google/android/gms/internal/anf;->a:J

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ani;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ani$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ani;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.connection.service.START"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    new-instance v1, Lcom/google/android/gms/internal/anf$c;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/anf$c;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/google/android/gms/internal/ani;->a(Lcom/google/android/gms/internal/anh;Ljava/lang/String;J)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;JLcom/google/android/gms/internal/ail;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "J",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$c;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ani;

    new-instance v2, Lcom/google/android/gms/internal/anf$g;

    invoke-direct {v2, p1, p5}, Lcom/google/android/gms/internal/anf$g;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;)V

    iget-wide v6, p0, Lcom/google/android/gms/internal/anf;->a:J

    move-object v3, p2

    move-wide v4, p3

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ani;->a(Lcom/google/android/gms/internal/anh;Ljava/lang/String;JJ)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JLcom/google/android/gms/internal/ail;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$e;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/nearby/connection/AppMetadata;",
            "J",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    new-instance v1, Lcom/google/android/gms/internal/anf$e;

    invoke-direct {v1, p1, p6}, Lcom/google/android/gms/internal/anf$e;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;)V

    iget-wide v6, p0, Lcom/google/android/gms/internal/anf;->a:J

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v7}, Lcom/google/android/gms/internal/ani;->a(Lcom/google/android/gms/internal/anh;Ljava/lang/String;Lcom/google/android/gms/nearby/connection/AppMetadata;JJ)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$b;",
            ">;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ani;

    new-instance v2, Lcom/google/android/gms/internal/anf$d;

    invoke-direct {v2, p1, p5, p6}, Lcom/google/android/gms/internal/anf$d;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V

    iget-wide v6, p0, Lcom/google/android/gms/internal/anf;->a:J

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ani;->a(Lcom/google/android/gms/internal/anh;Ljava/lang/String;Ljava/lang/String;[BJ)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Ljava/lang/String;",
            "[B",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/nearby/connection/a$d;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    new-instance v1, Lcom/google/android/gms/internal/anf$a;

    invoke-direct {v1, p1, p4}, Lcom/google/android/gms/internal/anf$a;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ail;)V

    iget-wide v4, p0, Lcom/google/android/gms/internal/anf;->a:J

    move-object v2, p2

    move-object v3, p3

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ani;->a(Lcom/google/android/gms/internal/anh;Ljava/lang/String;[BJ)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, p1, v2, v3}, Lcom/google/android/gms/internal/ani;->a(Ljava/lang/String;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t stop discovery"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public a([Ljava/lang/String;[B)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, p1, p2, v2, v3}, Lcom/google/android/gms/internal/ani;->a([Ljava/lang/String;[BJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t send reliable message"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anf;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ani;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService"

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, p1, v2, v3}, Lcom/google/android/gms/internal/ani;->b(Ljava/lang/String;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t disconnect from endpoint"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public b([Ljava/lang/String;[B)V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, p1, p2, v2, v3}, Lcom/google/android/gms/internal/ani;->b([Ljava/lang/String;[BJ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t send unreliable message"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "clientId"

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-object v0
.end method

.method public f()V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/ani;->c(J)V
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

.method public h()Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/ani;->d(J)Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public i()Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ani;->a()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public j()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/ani;->a(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t stop advertising"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public k()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/anf;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ani;

    iget-wide v2, p0, Lcom/google/android/gms/internal/anf;->a:J

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/ani;->b(J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "NearbyConnectionsClient"

    const-string v2, "Couldn\'t stop all endpoints"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
