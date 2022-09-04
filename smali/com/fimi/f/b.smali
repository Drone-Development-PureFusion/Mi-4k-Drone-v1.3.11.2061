.class public Lcom/fimi/f/b;
.super Ljava/lang/Object;


# static fields
.field private static b:Lcom/fimi/f/b;


# instance fields
.field a:Ljava/util/concurrent/ExecutorService;

.field private c:Lcom/fimi/f/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/f/b;

    invoke-direct {v0}, Lcom/fimi/f/b;-><init>()V

    sput-object v0, Lcom/fimi/f/b;->b:Lcom/fimi/f/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/f/b;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static a()Lcom/fimi/f/b;
    .locals 1

    sget-object v0, Lcom/fimi/f/b;->b:Lcom/fimi/f/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/f/b;

    invoke-direct {v0}, Lcom/fimi/f/b;-><init>()V

    sput-object v0, Lcom/fimi/f/b;->b:Lcom/fimi/f/b;

    :cond_0
    sget-object v0, Lcom/fimi/f/b;->b:Lcom/fimi/f/b;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/c/a;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/f/b;->c:Lcom/fimi/f/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/f/a;

    invoke-direct {v0, p1}, Lcom/fimi/f/a;-><init>(Lcom/fimi/c/a;)V

    iput-object v0, p0, Lcom/fimi/f/b;->c:Lcom/fimi/f/a;

    iget-object v0, p0, Lcom/fimi/f/b;->c:Lcom/fimi/f/a;

    invoke-virtual {p0, v0}, Lcom/fimi/f/b;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/f/b;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/f/b;->c:Lcom/fimi/f/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/f/b;->c:Lcom/fimi/f/a;

    invoke-virtual {v0}, Lcom/fimi/f/a;->a()V

    :cond_0
    return-void
.end method
