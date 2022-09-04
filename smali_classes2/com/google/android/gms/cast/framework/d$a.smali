.class Lcom/google/android/gms/cast/framework/d$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/n",
        "<",
        "Lcom/google/android/gms/cast/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/cast/framework/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/d$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/a$a;)V
    .locals 7
    .param p1    # Lcom/google/android/gms/cast/a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v6, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/a$a;)Lcom/google/android/gms/cast/a$a;

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/cast/framework/d;->l()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "%s() -> success result"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/d$a;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c;

    new-instance v2, Lcom/google/android/gms/cast/internal/n;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/cast/internal/n;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v3}, Lcom/google/android/gms/cast/framework/d;->c(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/a$b;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/cast/framework/media/c;-><init>(Lcom/google/android/gms/cast/internal/n;Lcom/google/android/gms/cast/a$b;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->e(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->d(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/common/api/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/common/api/g;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->e(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->d()Lcom/google/android/gms/common/api/i;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->f(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/internal/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/d;->e(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/d;->b()Lcom/google/android/gms/cast/CastDevice;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/cast/CastDevice;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/u;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->b()Lcom/google/android/gms/cast/ApplicationMetadata;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->e()Z

    move-result v4

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/google/android/gms/cast/framework/u;->a(Lcom/google/android/gms/cast/ApplicationMetadata;Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/cast/framework/d;->l()Lcom/google/android/gms/cast/internal/m;

    move-result-object v1

    const-string v2, "Exception when setting GoogleApiClient."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c;
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/cast/framework/d;->l()Lcom/google/android/gms/cast/internal/m;

    move-result-object v1

    const-string v2, "Unable to call %s on %s."

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "methods"

    aput-object v4, v3, v5

    const-class v4, Lcom/google/android/gms/cast/framework/u;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/cast/framework/d;->l()Lcom/google/android/gms/cast/internal/m;

    move-result-object v0

    const-string v1, "%s() -> failure result"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/d$a;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/d$a;->b:Lcom/google/android/gms/cast/framework/d;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/d;->a(Lcom/google/android/gms/cast/framework/d;)Lcom/google/android/gms/cast/framework/u;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/cast/a$a;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->i()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/framework/u;->b(I)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1
.end method

.method public synthetic a(Lcom/google/android/gms/common/api/m;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/api/m;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/cast/a$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/d$a;->a(Lcom/google/android/gms/cast/a$a;)V

    return-void
.end method
