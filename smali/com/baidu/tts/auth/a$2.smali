.class Lcom/baidu/tts/auth/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/m/b;)Lcom/baidu/tts/auth/AuthInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/baidu/tts/auth/b$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/tts/m/b;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/baidu/tts/auth/a;


# direct methods
.method constructor <init>(Lcom/baidu/tts/auth/a;Lcom/baidu/tts/m/b;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/auth/a$2;->c:Lcom/baidu/tts/auth/a;

    iput-object p2, p0, Lcom/baidu/tts/auth/a$2;->a:Lcom/baidu/tts/m/b;

    iput-object p3, p0, Lcom/baidu/tts/auth/a$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/baidu/tts/auth/b$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/auth/a$2;->a:Lcom/baidu/tts/m/b;

    invoke-virtual {v0}, Lcom/baidu/tts/m/b;->b()Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/auth/a$2;->c:Lcom/baidu/tts/auth/a;

    invoke-virtual {v1, v0}, Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/b/a/b/e$b;)Lcom/baidu/tts/auth/b$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/auth/a$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/baidu/tts/auth/a$2;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/baidu/tts/auth/a$2;->a()Lcom/baidu/tts/auth/b$a;

    move-result-object v0

    return-object v0
.end method
