.class Lcom/fimi/soul/biz/manager/t$1;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/manager/t;->a(Lcom/fimi/soul/biz/manager/t$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/manager/t;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/manager/t;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/t$1;->a:Lcom/fimi/soul/biz/manager/t;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/t$1;->a:Lcom/fimi/soul/biz/manager/t;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/t;->a(Lcom/fimi/soul/biz/manager/t;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    const/4 v2, 0x1

    iput v2, v1, Landroid/os/Message;->what:I

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/t$1;->a:Lcom/fimi/soul/biz/manager/t;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/t;->b(Lcom/fimi/soul/biz/manager/t;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
