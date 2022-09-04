.class Lcom/google/android/gms/internal/apu;
.super Lcom/google/android/gms/internal/apt;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/apu$b;,
        Lcom/google/android/gms/internal/apu$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static o:Lcom/google/android/gms/internal/apu;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/internal/apc;

.field private volatile d:Lcom/google/android/gms/internal/apa;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Lcom/google/android/gms/internal/apd;

.field private l:Lcom/google/android/gms/internal/apu$a;

.field private m:Lcom/google/android/gms/internal/apj;

.field private n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/apu;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/internal/apt;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcom/google/android/gms/internal/apu;->e:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/apu;->f:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/apu;->g:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/apu;->h:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/apu;->i:Z

    iput-boolean v2, p0, Lcom/google/android/gms/internal/apu;->j:Z

    new-instance v0, Lcom/google/android/gms/internal/apu$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/apu$1;-><init>(Lcom/google/android/gms/internal/apu;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apu;->k:Lcom/google/android/gms/internal/apd;

    iput-boolean v1, p0, Lcom/google/android/gms/internal/apu;->n:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/apu;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/apu;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/apu;->h:Z

    return p1
.end method

.method public static b()Lcom/google/android/gms/internal/apu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/apu;->o:Lcom/google/android/gms/internal/apu;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/apu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/apu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/apu;->o:Lcom/google/android/gms/internal/apu;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/apu;->o:Lcom/google/android/gms/internal/apu;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/apu;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/apu;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/apu;->e:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/apu;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->i:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/apu;)Lcom/google/android/gms/internal/apc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->c:Lcom/google/android/gms/internal/apc;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/apu;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private f()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/apj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/apj;-><init>(Lcom/google/android/gms/internal/apt;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apu;->m:Lcom/google/android/gms/internal/apj;

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->m:Lcom/google/android/gms/internal/apj;

    iget-object v1, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/apj;->a(Landroid/content/Context;)V

    return-void
.end method

.method private g()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/apu$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/apu$b;-><init>(Lcom/google/android/gms/internal/apu;Lcom/google/android/gms/internal/apu$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    iget v0, p0, Lcom/google/android/gms/internal/apu;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    iget v1, p0, Lcom/google/android/gms/internal/apu;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/apu$a;->a(J)V

    :cond_0
    return-void
.end method

.method private h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->i:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/apu;->e:I

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private i()V
    .locals 4

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/apu$a;->b()V

    const-string v0, "PowerSaveMode initiated."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    iget v1, p0, Lcom/google/android/gms/internal/apu;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/internal/apu$a;->a(J)V

    const-string v0, "PowerSaveMode terminated."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    invoke-interface {v0}, Lcom/google/android/gms/internal/apu$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/internal/apa;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->d:Lcom/google/android/gms/internal/apa;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/apu;->d:Lcom/google/android/gms/internal/apa;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->n:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/apu;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(ZZ)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->h()Z

    move-result v0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/apu;->n:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/apu;->i:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->h()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized c()Lcom/google/android/gms/internal/apc;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->c:Lcom/google/android/gms/internal/apc;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cant get a store unless we have a context"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/apk;

    iget-object v1, p0, Lcom/google/android/gms/internal/apu;->k:Lcom/google/android/gms/internal/apd;

    iget-object v2, p0, Lcom/google/android/gms/internal/apu;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/apk;-><init>(Lcom/google/android/gms/internal/apd;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/apu;->c:Lcom/google/android/gms/internal/apc;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->l:Lcom/google/android/gms/internal/apu$a;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->g()V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/apu;->g:Z

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->f:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/apu;->d()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/apu;->f:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->m:Lcom/google/android/gms/internal/apj;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->j:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/internal/apu;->f()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->c:Lcom/google/android/gms/internal/apc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->g:Z

    if-nez v0, :cond_1

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/apu;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/apu;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/apu;->h:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/apu;->d:Lcom/google/android/gms/internal/apa;

    new-instance v1, Lcom/google/android/gms/internal/apu$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/apu$2;-><init>(Lcom/google/android/gms/internal/apu;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/apa;->a(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
