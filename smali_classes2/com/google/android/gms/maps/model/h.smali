.class public final Lcom/google/android/gms/maps/model/h;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/maps/model/a/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/a/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/a/h;

    iput-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(F)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->a(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->a(Ljava/util/List;)V
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
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->b()Ljava/lang/String;
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

.method public b(F)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->b(F)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->b(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<+",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->b(Ljava/util/List;)V
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
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->b(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public c()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->c()Ljava/util/List;
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

.method public c(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/model/a/h;->c(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->d()Ljava/util/List;
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

.method public e()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->e()F
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

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/maps/model/h;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    check-cast p1, Lcom/google/android/gms/maps/model/h;

    iget-object v1, p1, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/model/a/h;->a(Lcom/google/android/gms/maps/model/a/h;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public f()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->f()I
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

.method public g()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->g()I
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

.method public h()F
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->h()F
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

.method public hashCode()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->k()I
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

.method public i()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->i()Z
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

.method public j()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->j()Z
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

.method public k()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/model/h;->a:Lcom/google/android/gms/maps/model/a/h;

    invoke-interface {v0}, Lcom/google/android/gms/maps/model/a/h;->l()Z
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
