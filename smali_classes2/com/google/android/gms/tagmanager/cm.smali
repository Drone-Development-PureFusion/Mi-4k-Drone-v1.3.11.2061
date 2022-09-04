.class Lcom/google/android/gms/tagmanager/cm;
.super Lcom/google/android/gms/tagmanager/cl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/tagmanager/cm$b;,
        Lcom/google/android/gms/tagmanager/cm$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static n:Lcom/google/android/gms/tagmanager/cm;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/tagmanager/ad;

.field private volatile d:Lcom/google/android/gms/tagmanager/ab;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcom/google/android/gms/tagmanager/ae;

.field private k:Lcom/google/android/gms/tagmanager/cm$a;

.field private l:Lcom/google/android/gms/tagmanager/bb;

.field private m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/cm;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cl;-><init>()V

    const v0, 0x1b7740

    iput v0, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/cm;->f:Z

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/cm;->g:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/cm;->h:Z

    iput-boolean v1, p0, Lcom/google/android/gms/tagmanager/cm;->i:Z

    new-instance v0, Lcom/google/android/gms/tagmanager/cm$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/cm$1;-><init>(Lcom/google/android/gms/tagmanager/cm;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->j:Lcom/google/android/gms/tagmanager/ae;

    iput-boolean v2, p0, Lcom/google/android/gms/tagmanager/cm;->m:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/tagmanager/cm;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/tagmanager/cm;)Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->h()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/tagmanager/cm;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

    return v0
.end method

.method public static c()Lcom/google/android/gms/tagmanager/cm;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/cm;->n:Lcom/google/android/gms/tagmanager/cm;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/tagmanager/cm;

    invoke-direct {v0}, Lcom/google/android/gms/tagmanager/cm;-><init>()V

    sput-object v0, Lcom/google/android/gms/tagmanager/cm;->n:Lcom/google/android/gms/tagmanager/cm;

    :cond_0
    sget-object v0, Lcom/google/android/gms/tagmanager/cm;->n:Lcom/google/android/gms/tagmanager/cm;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/tagmanager/cm;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->h:Z

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/tagmanager/cm;)Lcom/google/android/gms/tagmanager/ad;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->c:Lcom/google/android/gms/tagmanager/ad;

    return-object v0
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/tagmanager/cm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private f()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/tagmanager/bb;

    invoke-direct {v0, p0}, Lcom/google/android/gms/tagmanager/bb;-><init>(Lcom/google/android/gms/tagmanager/cl;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->l:Lcom/google/android/gms/tagmanager/bb;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->l:Lcom/google/android/gms/tagmanager/bb;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/bb;->a(Landroid/content/Context;)V

    return-void
.end method

.method private g()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/tagmanager/cm$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/tagmanager/cm$b;-><init>(Lcom/google/android/gms/tagmanager/cm;Lcom/google/android/gms/tagmanager/cm$1;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    iget v0, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    iget v1, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/tagmanager/cm$a;->a(J)V

    :cond_0
    return-void
.end method

.method private h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->m:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->h:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

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

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/cm$a;->b()V

    const-string v0, "PowerSaveMode initiated."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    iget v1, p0, Lcom/google/android/gms/tagmanager/cm;->e:I

    int-to-long v2, v1

    invoke-interface {v0, v2, v3}, Lcom/google/android/gms/tagmanager/cm$a;->a(J)V

    const-string v0, "PowerSaveMode terminated."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->g:Z

    if-nez v0, :cond_0

    const-string v0, "Dispatch call queued. Dispatch will run once initialization is complete."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->e(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->d:Lcom/google/android/gms/tagmanager/ab;

    new-instance v1, Lcom/google/android/gms/tagmanager/cm$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/cm$2;-><init>(Lcom/google/android/gms/tagmanager/cm;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/tagmanager/ab;->a(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Landroid/content/Context;Lcom/google/android/gms/tagmanager/ab;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;
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

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->d:Lcom/google/android/gms/tagmanager/ab;

    if-nez v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/cm;->d:Lcom/google/android/gms/tagmanager/ab;
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
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->m:Z

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tagmanager/cm;->a(ZZ)V
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
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->h()Z

    move-result v0

    iput-boolean p1, p0, Lcom/google/android/gms/tagmanager/cm;->m:Z

    iput-boolean p2, p0, Lcom/google/android/gms/tagmanager/cm;->h:Z

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->h()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/cm$a;->a()V
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

.method declared-synchronized d()Lcom/google/android/gms/tagmanager/ad;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->c:Lcom/google/android/gms/tagmanager/ad;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;

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
    new-instance v0, Lcom/google/android/gms/tagmanager/bp;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/cm;->j:Lcom/google/android/gms/tagmanager/ae;

    iget-object v2, p0, Lcom/google/android/gms/tagmanager/cm;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/tagmanager/bp;-><init>(Lcom/google/android/gms/tagmanager/ae;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->c:Lcom/google/android/gms/tagmanager/ad;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->k:Lcom/google/android/gms/tagmanager/cm$a;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->g()V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->g:Z

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->f:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/cm;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->f:Z

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->l:Lcom/google/android/gms/tagmanager/bb;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/cm;->i:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/cm;->f()V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/cm;->c:Lcom/google/android/gms/tagmanager/ad;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0
.end method
