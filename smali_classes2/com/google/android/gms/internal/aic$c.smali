.class Lcom/google/android/gms/internal/aic$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/g$b;
.implements Lcom/google/android/gms/common/api/g$c;
.implements Lcom/google/android/gms/internal/ahp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lcom/google/android/gms/common/api/a$a;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/g$b;",
        "Lcom/google/android/gms/common/api/g$c;",
        "Lcom/google/android/gms/internal/ahp;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aic;

.field private final d:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/google/android/gms/internal/ahg;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/common/api/a$f;

.field private final f:Lcom/google/android/gms/common/api/a$c;

.field private final g:Lcom/google/android/gms/internal/ahh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahh",
            "<TO;>;"
        }
    .end annotation
.end field

.field private final h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/internal/aix;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/ahk;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/ail$b",
            "<*>;",
            "Lcom/google/android/gms/internal/aiq;",
            ">;>;"
        }
    .end annotation
.end field

.field private k:Z

.field private l:Lcom/google/android/gms/common/ConnectionResult;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aic;Lcom/google/android/gms/common/api/u;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/u",
            "<TO;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->i:Ljava/util/Set;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    invoke-static {p1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p2, v0, p0, p0}, Lcom/google/android/gms/common/api/u;->a(Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/a$f;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    instance-of v0, v0, Lcom/google/android/gms/common/internal/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    check-cast v0, Lcom/google/android/gms/common/internal/i;

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/i;->h()Lcom/google/android/gms/common/api/a$h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->f:Lcom/google/android/gms/common/api/a$c;

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/u;->e()Lcom/google/android/gms/internal/ahh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->f:Lcom/google/android/gms/common/api/a$c;

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahg;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ahg;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aic$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->j()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aic$c;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method private b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahk;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/ahk;->a(Lcom/google/android/gms/internal/ahh;Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method private b(Lcom/google/android/gms/internal/ahg;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ahg;->a(Landroid/util/SparseArray;)V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->f:Lcom/google/android/gms/common/api/a$c;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ahg;->a(Lcom/google/android/gms/common/api/a$c;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->f()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aic$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->e()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/aic$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->g()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/aic$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->i()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/gms/internal/aic$c;)Ljava/util/Queue;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    return-object v0
.end method

.method private e()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->j()V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    :cond_0
    return-void
.end method

.method private g()V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/16 v2, 0x8

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->f()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->i(Lcom/google/android/gms/internal/aic;)Lcom/google/android/gms/common/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->h(Lcom/google/android/gms/internal/aic;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_1

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "Connection timed out while waiting for Google Play services update to complete."

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->f()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_0
.end method

.method private h()V
    .locals 4

    const/16 v3, 0xb

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v0, v3, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->j(Lcom/google/android/gms/internal/aic;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private i()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aix;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aix;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->h()V

    :cond_0
    :goto_1
    return-void

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->f()V

    goto :goto_1
.end method

.method private j()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->w()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->k(Lcom/google/android/gms/internal/aic;)I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->i(Lcom/google/android/gms/internal/aic;)Lcom/google/android/gms/common/b;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->h(Lcom/google/android/gms/internal/aic;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->k(Lcom/google/android/gms/internal/aic;)I

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->k(Lcom/google/android/gms/internal/aic;)I

    move-result v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    new-instance v1, Lcom/google/android/gms/internal/aic$d;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    iget-object v4, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/internal/aic$d;-><init>(Lcom/google/android/gms/internal/aic;Lcom/google/android/gms/common/api/a$f;Lcom/google/android/gms/internal/ahh;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/a$f;->a(Lcom/google/android/gms/common/internal/p$f;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahg;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aic$c;->b(Lcom/google/android/gms/internal/ahg;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aic$c;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-static {v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->b(Lcom/google/android/gms/internal/aic;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-static {v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->c(Lcom/google/android/gms/internal/aic;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;I)I

    return-void
.end method

.method public a(ILcom/google/android/gms/internal/ail$b;Lcom/google/android/gms/g/g;)V
    .locals 3
    .param p2    # Lcom/google/android/gms/internal/ail$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/g/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/internal/ail$b",
            "<*>;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aiq;

    iget-object v0, v0, Lcom/google/android/gms/internal/aiq;->b:Lcom/google/android/gms/internal/aiy;

    new-instance v1, Lcom/google/android/gms/internal/ahg$e;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-direct {v1, p1, v0, p3, v2}, Lcom/google/android/gms/internal/ahg$e;-><init>(ILcom/google/android/gms/internal/aiy;Lcom/google/android/gms/g/g;Landroid/util/SparseArray;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/internal/ahg;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/r;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->c:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/r;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p3, v0}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    const-string v0, "GoogleApiManager"

    const-string v1, "Received call to unregister a listener without a matching registration call."

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {v0, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public a(ILcom/google/android/gms/internal/aiq;Lcom/google/android/gms/g/g;)V
    .locals 2
    .param p2    # Lcom/google/android/gms/internal/aiq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/g/g;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/internal/aiq;",
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ahg$c;

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ahg$c;-><init>(ILcom/google/android/gms/internal/aiq;Lcom/google/android/gms/g/g;Landroid/util/SparseArray;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/internal/ahg;)V

    return-void
.end method

.method public a(IZ)V
    .locals 4
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ahg;

    iget v2, v0, Lcom/google/android/gms/internal/ahg;->a:I

    if-ne v2, p1, :cond_0

    iget v2, v0, Lcom/google/android/gms/internal/ahg;->b:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahg;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aix;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aix;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->delete(I)V

    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->f(Lcom/google/android/gms/internal/aic;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->f()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->f()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->g(Lcom/google/android/gms/internal/aic;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/aic;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->e(Lcom/google/android/gms/internal/aic;)Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-interface {v0, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aic$c;->b()V

    sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->v:Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aic$c;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->f()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->j:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aiq;

    :try_start_0
    iget-object v0, v0, Lcom/google/android/gms/internal/aiq;->a:Lcom/google/android/gms/internal/aip;

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->f:Lcom/google/android/gms/common/api/a$c;

    new-instance v4, Lcom/google/android/gms/g/g;

    invoke-direct {v4}, Lcom/google/android/gms/g/g;-><init>()V

    invoke-virtual {v0, v3, v4}, Lcom/google/android/gms/internal/aip;->a(Lcom/google/android/gms/common/api/a$c;Lcom/google/android/gms/g/g;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->f()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/aic$c;->a()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->h()V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 5
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/aic$c;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;I)I

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aic$c;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iput-object p1, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/aic;->c()Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->d(Lcom/google/android/gms/internal/aic;)Lcom/google/android/gms/internal/ahr;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->e(Lcom/google/android/gms/internal/aic;)Ljava/util/Set;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->d(Lcom/google/android/gms/internal/aic;)Lcom/google/android/gms/internal/ahr;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Lcom/google/android/gms/internal/ahr;->b(Lcom/google/android/gms/common/ConnectionResult;I)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/common/ConnectionResult;I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    :cond_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/aic$c;->k:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v0}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v1}, Lcom/google/android/gms/internal/aic;->a(Lcom/google/android/gms/internal/aic;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-static {v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->a:Lcom/google/android/gms/internal/aic;

    invoke-static {v2}, Lcom/google/android/gms/internal/aic;->b(Lcom/google/android/gms/internal/aic;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_4
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x11

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->g:Lcom/google/android/gms/internal/ahh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ahh;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x26

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "API: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not available on this device."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_0
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/api/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/ConnectionResult;",
            "Lcom/google/android/gms/common/api/a",
            "<*>;I)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahg;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aic$c;->b(Lcom/google/android/gms/internal/ahg;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->h()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->d:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/aic$c;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/aic$c;->j()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ahk;)V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 1
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method

.method public b(I)V
    .locals 3
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    new-instance v1, Lcom/google/android/gms/internal/aix;

    iget-object v2, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/aix;-><init>(Lcom/google/android/gms/common/api/a$f;)V

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method c()Lcom/google/android/gms/common/ConnectionResult;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->l:Lcom/google/android/gms/common/ConnectionResult;

    return-object v0
.end method

.method public c(I)V
    .locals 2
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aix;

    new-instance v1, Lcom/google/android/gms/internal/aic$c$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/aic$c$1;-><init>(Lcom/google/android/gms/internal/aic$c;I)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aix;->a(Lcom/google/android/gms/internal/aix$c;)V

    return-void
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aic$c;->e:Lcom/google/android/gms/common/api/a$f;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/a$f;->t()Z

    move-result v0

    return v0
.end method
