.class public Lcom/fimi/e/c;
.super Lcom/fimi/e/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/e/c$c;,
        Lcom/fimi/e/c$a;,
        Lcom/fimi/e/c$b;
    }
.end annotation


# instance fields
.field b:[I

.field c:Z

.field private d:Ljava/net/Socket;

.field private e:Lcom/fimi/e/c$a;

.field private f:Lcom/fimi/e/c$b;

.field private g:J

.field private h:J

.field private i:Z

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private k:Z

.field private l:[B

.field private m:Lcom/fimi/e/c$c;


# direct methods
.method public constructor <init>(Ljava/net/Socket;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Lcom/fimi/e/a;-><init>(Ljava/net/Socket;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/e/c;->g:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/e/c;->h:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    iput-boolean v2, p0, Lcom/fimi/e/c;->k:Z

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/fimi/e/c;->b:[I

    iput-boolean v2, p0, Lcom/fimi/e/c;->c:Z

    invoke-virtual {p0}, Lcom/fimi/e/c;->c()V

    iput-object p1, p0, Lcom/fimi/e/c;->d:Ljava/net/Socket;

    const-string v0, "create a session"

    invoke-virtual {p0, v0}, Lcom/fimi/e/c;->a(Ljava/lang/String;)V

    return-void

    :array_0
    .array-data 4
        0xc1
        0xc7
        0xc9
        0xca
        0xcb
        0xcc
    .end array-data
.end method

.method static synthetic a(Lcom/fimi/e/c;)Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lcom/fimi/e/c;->d:Ljava/net/Socket;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/e/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    new-instance v0, Lcom/fimi/e/c$a;

    invoke-direct {v0, p0}, Lcom/fimi/e/c$a;-><init>(Lcom/fimi/e/c;)V

    iput-object v0, p0, Lcom/fimi/e/c;->e:Lcom/fimi/e/c$a;

    iget-object v0, p0, Lcom/fimi/e/c;->e:Lcom/fimi/e/c$a;

    invoke-virtual {v0}, Lcom/fimi/e/c$a;->start()V

    new-instance v0, Lcom/fimi/e/c$b;

    invoke-direct {v0, p0}, Lcom/fimi/e/c$b;-><init>(Lcom/fimi/e/c;)V

    iput-object v0, p0, Lcom/fimi/e/c;->f:Lcom/fimi/e/c$b;

    iget-object v0, p0, Lcom/fimi/e/c;->f:Lcom/fimi/e/c$b;

    invoke-virtual {v0}, Lcom/fimi/e/c$b;->start()V

    new-instance v0, Lcom/fimi/e/c$c;

    invoke-direct {v0, p0}, Lcom/fimi/e/c$c;-><init>(Lcom/fimi/e/c;)V

    iput-object v0, p0, Lcom/fimi/e/c;->m:Lcom/fimi/e/c$c;

    iget-object v0, p0, Lcom/fimi/e/c;->m:Lcom/fimi/e/c$c;

    invoke-virtual {v0}, Lcom/fimi/e/c$c;->start()V

    return-void
.end method

.method public a([BI)V
    .locals 4

    iget-object v1, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/fimi/a/a/a;

    invoke-direct {v0}, Lcom/fimi/a/a/a;-><init>()V

    iput-object p1, v0, Lcom/fimi/a/a/a;->a:[B

    iput p2, v0, Lcom/fimi/a/a/a;->b:I

    iget-object v2, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/e/c;->h:J

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/fimi/e/c;->e()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(I)Z
    .locals 3

    const/4 v1, 0x0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/fimi/e/c;->b:[I

    array-length v2, v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/fimi/e/c;->b:[I

    aget v2, v2, v0

    if-ne p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/e/c;->e:Lcom/fimi/e/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/e/c;->e:Lcom/fimi/e/c$a;

    invoke-virtual {v0}, Lcom/fimi/e/c$a;->a()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/e/c;->f:Lcom/fimi/e/c$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/e/c;->f:Lcom/fimi/e/c$b;

    invoke-virtual {v0}, Lcom/fimi/e/c$b;->a()V

    :cond_1
    iget-object v0, p0, Lcom/fimi/e/c;->m:Lcom/fimi/e/c$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/e/c;->m:Lcom/fimi/e/c$c;

    invoke-virtual {v0}, Lcom/fimi/e/c$c;->a()V

    :cond_2
    iget-object v0, p0, Lcom/fimi/e/c;->d:Ljava/net/Socket;

    if-eqz v0, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/fimi/e/c;->d:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :goto_0
    invoke-static {}, Lcom/fimi/e/d;->b()Lcom/fimi/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/e/d;->c()V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public c()V
    .locals 6

    const/4 v1, 0x0

    new-instance v0, Lcom/fimi/a/e/c;

    invoke-direct {v0}, Lcom/fimi/a/e/c;-><init>()V

    const/4 v2, 0x4

    const/4 v3, 0x1

    const/16 v5, 0x30

    move v4, v1

    invoke-virtual/range {v0 .. v5}, Lcom/fimi/a/e/c;->a(IIIII)V

    invoke-virtual {v0}, Lcom/fimi/a/e/c;->f()[B

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/e/c;->l:[B

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/e/c;->l:[B

    iget-object v1, p0, Lcom/fimi/e/c;->l:[B

    array-length v1, v1

    invoke-virtual {p0, v0, v1}, Lcom/fimi/e/c;->a([BI)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v1, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/fimi/e/c;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/e/c;->c:Z

    iget-object v0, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/e/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/fimi/e/c;->j:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
