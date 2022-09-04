.class public Lcom/google/android/gms/cast/framework/k;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private final b:Lcom/google/android/gms/cast/framework/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "SessionManager"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/framework/aa;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/framework/j;
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/aa;->a()Lcom/google/android/gms/c/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Lcom/google/android/gms/c/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/j;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "getWrappedCurrentSession"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/cast/framework/f;)V
    .locals 6

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    new-instance v1, Lcom/google/android/gms/cast/framework/p;

    invoke-direct {v1, p1}, Lcom/google/android/gms/cast/framework/p;-><init>(Lcom/google/android/gms/cast/framework/f;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/framework/aa;->a(Lcom/google/android/gms/cast/framework/v;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "addCastStateListener"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/cast/framework/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/framework/l",
            "<",
            "Lcom/google/android/gms/cast/framework/j;",
            ">;)V"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/framework/k;->a(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/cast/framework/j;",
            ">(",
            "Lcom/google/android/gms/cast/framework/l",
            "<TT;>;",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    new-instance v1, Lcom/google/android/gms/cast/framework/ae;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/cast/framework/ae;-><init>(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/framework/aa;->a(Lcom/google/android/gms/cast/framework/ab;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "addSessionManagerListener"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 7

    const/4 v6, 0x1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/cast/framework/aa;->a(ZZ)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "endCurrentSession"

    aput-object v5, v3, v4

    const-class v4, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/cast/framework/d;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/k;->a()Lcom/google/android/gms/cast/framework/j;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/google/android/gms/cast/framework/d;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/cast/framework/d;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/cast/framework/f;)V
    .locals 6

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    new-instance v1, Lcom/google/android/gms/cast/framework/p;

    invoke-direct {v1, p1}, Lcom/google/android/gms/cast/framework/p;-><init>(Lcom/google/android/gms/cast/framework/f;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/framework/aa;->b(Lcom/google/android/gms/cast/framework/v;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "removeCastStateListener"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/cast/framework/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/framework/l",
            "<",
            "Lcom/google/android/gms/cast/framework/j;",
            ">;)V"
        }
    .end annotation

    const-class v0, Lcom/google/android/gms/cast/framework/j;

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/framework/k;->b(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/cast/framework/j;",
            ">(",
            "Lcom/google/android/gms/cast/framework/l",
            "<TT;>;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    new-instance v1, Lcom/google/android/gms/cast/framework/ae;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/cast/framework/ae;-><init>(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/framework/aa;->b(Lcom/google/android/gms/cast/framework/ab;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "removeSessionManagerListener"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/c/e;
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/k;->b:Lcom/google/android/gms/cast/framework/aa;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/aa;->b()Lcom/google/android/gms/c/e;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/framework/k;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const-string v5, "getWrappedThis"

    aput-object v5, v3, v4

    const/4 v4, 0x1

    const-class v5, Lcom/google/android/gms/cast/framework/aa;

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    goto :goto_0
.end method
