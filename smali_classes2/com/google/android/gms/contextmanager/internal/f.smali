.class public Lcom/google/android/gms/contextmanager/internal/f;
.super Lcom/google/android/gms/contextmanager/internal/h$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/contextmanager/internal/f$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/contextmanager/internal/f$a;

.field private b:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/e;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/t;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/d;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/m;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/fence/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/e;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/t;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/contextmanager/d;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/m;",
            ">;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/fence/c;",
            ">;",
            "Lcom/google/android/gms/contextmanager/internal/f$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/contextmanager/internal/h$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/internal/f;->b:Lcom/google/android/gms/internal/ahl$b;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/f;->c:Lcom/google/android/gms/internal/ahl$b;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/f;->d:Lcom/google/android/gms/internal/ahl$b;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/f;->e:Lcom/google/android/gms/internal/ahl$b;

    iput-object p5, p0, Lcom/google/android/gms/contextmanager/internal/f;->f:Lcom/google/android/gms/internal/ahl$b;

    iput-object p6, p0, Lcom/google/android/gms/contextmanager/internal/f;->g:Lcom/google/android/gms/internal/ahl$b;

    iput-object p7, p0, Lcom/google/android/gms/contextmanager/internal/f;->a:Lcom/google/android/gms/contextmanager/internal/f$a;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/contextmanager/internal/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/snapshot/internal/m;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/internal/f;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/f;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, p0

    move-object v6, v1

    move-object v7, v1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/contextmanager/internal/f;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)Lcom/google/android/gms/contextmanager/internal/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/contextmanager/internal/f$a;",
            ")",
            "Lcom/google/android/gms/contextmanager/internal/f;"
        }
    .end annotation

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/f;

    move-object v1, p0

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/contextmanager/internal/f;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/contextmanager/internal/f;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/awareness/fence/c;",
            ">;)",
            "Lcom/google/android/gms/contextmanager/internal/f;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/contextmanager/internal/f;

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move-object v6, p0

    move-object v7, v1

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/contextmanager/internal/f;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/contextmanager/internal/f$a;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->b:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_1

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onStatusResult."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->b:Lcom/google/android/gms/internal/ahl$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->b:Lcom/google/android/gms/internal/ahl$b;

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->a:Lcom/google/android/gms/contextmanager/internal/f$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->a:Lcom/google/android/gms/contextmanager/internal/f$a;

    invoke-interface {v0, p1}, Lcom/google/android/gms/contextmanager/internal/f$a;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->f:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_0

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onSnapshotResult"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->f:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/contextmanager/internal/f$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/f$4;-><init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/awareness/snapshot/internal/Snapshot;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->f:Lcom/google/android/gms/internal/ahl$b;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->e:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_0

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onStateResult"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->e:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/contextmanager/internal/f$3;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/contextmanager/internal/f$3;-><init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->e:Lcom/google/android/gms/internal/ahl$b;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->c:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_0

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onReadResult."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->c:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/contextmanager/internal/f$1;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/google/android/gms/contextmanager/internal/f$1;-><init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->c:Lcom/google/android/gms/internal/ahl$b;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->g:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_0

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onFenceQueryResult"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->g:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/contextmanager/internal/f$5;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/android/gms/contextmanager/internal/f$5;-><init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/contextmanager/fence/internal/FenceStateMapImpl;Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->d:Lcom/google/android/gms/internal/ahl$b;

    if-nez v0, :cond_0

    const-string v0, "ContextManagerPendingResult"

    const-string v1, "Unexpected callback to onWriteBatchResult"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/sw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->d:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/contextmanager/internal/f$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/contextmanager/internal/f$2;-><init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f;->d:Lcom/google/android/gms/internal/ahl$b;

    goto :goto_0
.end method
