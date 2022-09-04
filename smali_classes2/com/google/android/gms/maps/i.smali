.class public Lcom/google/android/gms/maps/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/i$d;,
        Lcom/google/android/gms/maps/i$c;,
        Lcom/google/android/gms/maps/i$a;,
        Lcom/google/android/gms/maps/i$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/maps/a/g;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/maps/a/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/a/g;

    iput-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Landroid/graphics/Point;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Lcom/google/android/gms/c/e;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Point;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method a()Lcom/google/android/gms/maps/a/g;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    return-object v0
.end method

.method public a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-static {p1}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/c/e;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/i$a;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/o;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    new-instance v1, Lcom/google/android/gms/maps/i$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/i$2;-><init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/o;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/i$b;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/p;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    new-instance v1, Lcom/google/android/gms/maps/i$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/i$1;-><init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/p;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/i$c;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/q;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    new-instance v1, Lcom/google/android/gms/maps/i$3;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/i$3;-><init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$c;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/q;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final a(Lcom/google/android/gms/maps/i$d;)V
    .locals 2

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/r;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    new-instance v1, Lcom/google/android/gms/maps/i$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/maps/i$4;-><init>(Lcom/google/android/gms/maps/i;Lcom/google/android/gms/maps/i$d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/a/r;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/model/LatLng;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;J)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/maps/a/g;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->b(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->a()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->c(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->b()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/g;->d(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->c()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public e()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->d()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public f()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->e()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public g()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/i;->a:Lcom/google/android/gms/maps/a/g;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/g;->f()Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
