.class public Lcom/google/android/gms/contextmanager/internal/d;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/contextmanager/internal/i;",
        ">;"
    }
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/st$a;


# instance fields
.field private final e:Landroid/os/Looper;

.field private final f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

.field private g:Lcom/google/android/gms/internal/sx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/sx",
            "<",
            "Lcom/google/android/gms/awareness/fence/i;",
            "Lcom/google/android/gms/contextmanager/fence/internal/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/st$a;->a:Lcom/google/android/gms/internal/st$a;

    sput-object v0, Lcom/google/android/gms/contextmanager/internal/d;->a:Lcom/google/android/gms/internal/st$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/awareness/b;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0x2f

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/d;->e:Landroid/os/Looper;

    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "@@ContextManagerNullAccount@@"

    :goto_0
    if-nez p4, :cond_1

    invoke-static {p1, v0}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    return-void

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/common/internal/s;->b()Landroid/accounts/Account;

    move-result-object v0

    iget-object v0, v0, Landroid/accounts/Account;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-static {p1, v0, p4}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/awareness/b;)Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    move-result-object v0

    goto :goto_1
.end method

.method public static a(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 1

    sget-object v0, Lcom/google/android/gms/contextmanager/internal/d;->a:Lcom/google/android/gms/internal/st$a;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/st$a;->a:Lcom/google/android/gms/internal/st$a;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/st$a;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/contextmanager/internal/d;->a:Lcom/google/android/gms/internal/st$a;

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/st$a;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_0
.end method

.method private h()Lcom/google/android/gms/internal/sx;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/sx",
            "<",
            "Lcom/google/android/gms/awareness/fence/i;",
            "Lcom/google/android/gms/contextmanager/fence/internal/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/d;->g:Lcom/google/android/gms/internal/sx;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/sx;

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/internal/d;->e:Landroid/os/Looper;

    sget-object v2, Lcom/google/android/gms/contextmanager/fence/internal/e;->a:Lcom/google/android/gms/internal/sx$a;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/sx;-><init>(Landroid/os/Looper;Lcom/google/android/gms/internal/sx$a;)V

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/d;->g:Lcom/google/android/gms/internal/sx;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/d;->g:Lcom/google/android/gms/internal/sx;

    return-object v0
.end method


# virtual methods
.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/i;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/contextmanager/internal/i$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/i;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.contextmanager.service.ContextManagerService.START"

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/m;",
            ">;",
            "Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->F()V

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/i;

    invoke-static {p1}, Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/contextmanager/internal/f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v2}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v3}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v4}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f()Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/awareness/snapshot/internal/SnapshotRequest;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/fence/c;",
            ">;",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->F()V

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/i;

    invoke-static {p1}, Lcom/google/android/gms/contextmanager/internal/f;->b(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/contextmanager/internal/f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v2}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v3}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v4}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f()Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/FenceQueryRequestImpl;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->F()V

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/internal/d;->h()Lcom/google/android/gms/internal/sx;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->a(Lcom/google/android/gms/internal/sx;)V

    invoke-virtual {p0}, Lcom/google/android/gms/contextmanager/internal/d;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/internal/i;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)Lcom/google/android/gms/contextmanager/internal/f;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v2}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v3}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v4}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->f()Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/contextmanager/internal/i;->a(Lcom/google/android/gms/contextmanager/internal/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/contextmanager/internal/d;->a(Landroid/os/IBinder;)Lcom/google/android/gms/contextmanager/internal/i;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.contextmanager.internal.IContextManagerService"

    return-object v0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "com.google.android.contextmanager.service.args"

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/d;->f:Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;

    invoke-virtual {v2}, Lcom/google/android/gms/contextmanager/internal/ContextManagerClientInfo;->m()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    return-object v0
.end method
