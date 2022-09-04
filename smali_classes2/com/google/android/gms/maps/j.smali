.class public final Lcom/google/android/gms/maps/j;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/maps/a/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/a/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public a()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->a()Z
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

.method public b(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->b(Z)V
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
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->b()Z
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
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->c(Z)V
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
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->c()Z
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
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->i(Z)V
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
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->h()Z
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

.method public e(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->d(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public e()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->d()Z
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

.method public f(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->e(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public f()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->e()Z
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

.method public g(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->f(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public g()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->f()Z
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

.method public h(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->g(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public h()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->g()Z
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

.method public i(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->h(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public i()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0}, Lcom/google/android/gms/maps/a/j;->i()Z
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

.method public j(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/j;->a:Lcom/google/android/gms/maps/a/j;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/j;->j(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
