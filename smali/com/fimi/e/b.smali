.class public Lcom/fimi/e/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/c/b;


# static fields
.field private static a:Lcom/fimi/e/b;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/e/b;

    invoke-direct {v0}, Lcom/fimi/e/b;-><init>()V

    sput-object v0, Lcom/fimi/e/b;->a:Lcom/fimi/e/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/e/b;->b:Ljava/util/List;

    new-instance v0, Lcom/fimi/e/b$1;

    invoke-direct {v0, p0}, Lcom/fimi/e/b$1;-><init>(Lcom/fimi/e/b;)V

    iput-object v0, p0, Lcom/fimi/e/b;->c:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/e/b;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/e/b;->b:Ljava/util/List;

    return-object v0
.end method

.method public static a()V
    .locals 0

    invoke-static {}, Lcom/fimi/e/b;->b()Lcom/fimi/e/b;

    return-void
.end method

.method public static b()Lcom/fimi/e/b;
    .locals 1

    sget-object v0, Lcom/fimi/e/b;->a:Lcom/fimi/e/b;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(ILcom/fimi/a/e/c;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/e/b;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/fimi/c/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/e/b;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Lcom/fimi/c/b;)V
    .locals 3

    monitor-enter p0

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/e/b;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/c/b;

    if-eqz v0, :cond_0

    if-ne v0, p1, :cond_0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/fimi/e/b;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method
