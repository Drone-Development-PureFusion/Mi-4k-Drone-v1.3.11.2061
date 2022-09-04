.class public Lcom/google/android/gms/internal/aoq;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/aoq$a;,
        Lcom/google/android/gms/internal/aoq$e;,
        Lcom/google/android/gms/internal/aoq$b;,
        Lcom/google/android/gms/internal/aoq$c;,
        Lcom/google/android/gms/internal/aoq$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/internal/apq;

.field private final e:Lcom/google/android/gms/internal/di;

.field private final f:Ljava/util/concurrent/ExecutorService;

.field private final g:Ljava/util/concurrent/ScheduledExecutorService;

.field private final h:Lcom/google/android/gms/tagmanager/aj;

.field private final i:Lcom/google/android/gms/common/util/e;

.field private final j:Lcom/google/android/gms/internal/aos;

.field private k:Lcom/google/android/gms/internal/app;

.field private volatile l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/aow;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private o:Z


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/apq;Lcom/google/android/gms/internal/di;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/tagmanager/aj;Lcom/google/android/gms/common/util/e;Lcom/google/android/gms/internal/aos;)V
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/aoq;->l:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->m:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->n:Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/aoq;->o:Z

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->a:Ljava/lang/String;

    invoke-static {p4}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/apq;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->d:Lcom/google/android/gms/internal/apq;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/di;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->e:Lcom/google/android/gms/internal/di;

    invoke-static {p6}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->f:Ljava/util/concurrent/ExecutorService;

    invoke-static {p7}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p8}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/tagmanager/aj;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->h:Lcom/google/android/gms/tagmanager/aj;

    invoke-static/range {p9 .. p9}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/util/e;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->i:Lcom/google/android/gms/common/util/e;

    invoke-static/range {p10 .. p10}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aos;

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->j:Lcom/google/android/gms/internal/aos;

    iput-object p3, p0, Lcom/google/android/gms/internal/aoq;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/aoq;->c:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/aow;

    const-string v1, "gtm.load"

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "gtm"

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/google/android/gms/internal/aoq;->h:Lcom/google/android/gms/tagmanager/aj;

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/aow;-><init>(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;ZLcom/google/android/gms/tagmanager/aj;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq;->m:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x23

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "is scheduled for loading."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/aoq$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/aoq$b;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/aoq;->l:I

    return v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/aoq;->l:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/app;)Lcom/google/android/gms/internal/app;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq;->k:Lcom/google/android/gms/internal/app;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq;->m:Ljava/util/List;

    return-object p1
.end method

.method private a(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->n:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->n:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2d

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Refresh container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ms."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->g:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/aoq$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aoq$2;-><init>(Lcom/google/android/gms/internal/aoq;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/aoq;->n:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;J)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/aoq;->a(J)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/aoq;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/aoq;->o:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/app;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->k:Lcom/google/android/gms/internal/app;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/aoq;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->f:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->j:Lcom/google/android/gms/internal/aos;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/di;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->e:Lcom/google/android/gms/internal/di;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/aoq;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/tagmanager/aj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->h:Lcom/google/android/gms/tagmanager/aj;

    return-object v0
.end method

.method static synthetic k(Lcom/google/android/gms/internal/aoq;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/aoq;->o:Z

    return v0
.end method

.method static synthetic l(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/apq;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->d:Lcom/google/android/gms/internal/apq;

    return-object v0
.end method

.method static synthetic m(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/common/util/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->i:Lcom/google/android/gms/common/util/e;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/aoq$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aoq$1;-><init>(Lcom/google/android/gms/internal/aoq;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/aow;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/aoq$c;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/aoq$c;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aow;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
