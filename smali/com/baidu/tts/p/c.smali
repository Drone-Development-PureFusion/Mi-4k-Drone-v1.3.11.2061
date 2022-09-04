.class public Lcom/baidu/tts/p/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/p/c$a;
    }
.end annotation


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;

.field private b:Landroid/content/Context;

.field private c:Lcom/baidu/tts/l/a;

.field private d:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/baidu/tts/p/c;->e:I

    iput v0, p0, Lcom/baidu/tts/p/c;->f:I

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/p/c;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lcom/baidu/tts/p/c;->b:Landroid/content/Context;

    new-instance v0, Lcom/baidu/tts/l/a;

    invoke-direct {v0, p1}, Lcom/baidu/tts/l/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/baidu/tts/p/c;->c:Lcom/baidu/tts/l/a;

    return-void
.end method

.method static synthetic a(Lcom/baidu/tts/p/c;)I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/p/c;->e:I

    return v0
.end method

.method static synthetic a(Lcom/baidu/tts/p/c;I)I
    .locals 0

    iput p1, p0, Lcom/baidu/tts/p/c;->e:I

    return p1
.end method

.method static synthetic b(Lcom/baidu/tts/p/c;)I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/p/c;->f:I

    return v0
.end method

.method static synthetic b(Lcom/baidu/tts/p/c;I)I
    .locals 0

    iput p1, p0, Lcom/baidu/tts/p/c;->f:I

    return p1
.end method

.method static synthetic c(Lcom/baidu/tts/p/c;)Lcom/baidu/tts/l/a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/p/c;->c:Lcom/baidu/tts/l/a;

    return-object v0
.end method

.method static synthetic d(Lcom/baidu/tts/p/c;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/p/c;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/concurrent/FutureTask;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/FutureTask",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/FutureTask;

    new-instance v1, Lcom/baidu/tts/p/c$a;

    invoke-direct {v1, p0}, Lcom/baidu/tts/p/c$a;-><init>(Lcom/baidu/tts/p/c;)V

    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v0, p0, Lcom/baidu/tts/p/c;->d:Ljava/util/concurrent/FutureTask;

    iget-object v0, p0, Lcom/baidu/tts/p/c;->a:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/baidu/tts/p/c;->d:Ljava/util/concurrent/FutureTask;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    iget-object v0, p0, Lcom/baidu/tts/p/c;->d:Ljava/util/concurrent/FutureTask;

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/p/c;->d:Ljava/util/concurrent/FutureTask;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    return-void
.end method
