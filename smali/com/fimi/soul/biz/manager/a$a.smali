.class Lcom/fimi/soul/biz/manager/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/manager/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/manager/a;

.field private b:I

.field private c:Lcom/fimi/soul/entity/AddPlane;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/biz/manager/a;ILcom/fimi/soul/entity/AddPlane;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/a$a;->a:Lcom/fimi/soul/biz/manager/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/fimi/soul/biz/manager/a$a;->b:I

    iput-object p3, p0, Lcom/fimi/soul/biz/manager/a$a;->c:Lcom/fimi/soul/entity/AddPlane;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/a$a;->a:Lcom/fimi/soul/biz/manager/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/a;->a(Lcom/fimi/soul/biz/manager/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    const/4 v0, 0x0

    iget v2, p0, Lcom/fimi/soul/biz/manager/a$a;->b:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/a$a;->a:Lcom/fimi/soul/biz/manager/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/a;->c(Lcom/fimi/soul/biz/manager/a;)Lcom/fimi/soul/biz/m/a;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/biz/manager/a$a;->c:Lcom/fimi/soul/entity/AddPlane;

    iget-object v3, p0, Lcom/fimi/soul/biz/manager/a$a;->a:Lcom/fimi/soul/biz/manager/a;

    invoke-static {v3}, Lcom/fimi/soul/biz/manager/a;->b(Lcom/fimi/soul/biz/manager/a;)Landroid/content/Context;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Lcom/fimi/soul/biz/m/a;->a(Lcom/fimi/soul/entity/AddPlane;Landroid/content/Context;)Lcom/fimi/soul/entity/PlaneMsg;

    move-result-object v0

    :cond_0
    iget v2, p0, Lcom/fimi/soul/biz/manager/a$a;->b:I

    iput v2, v1, Landroid/os/Message;->what:I

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/a$a;->a:Lcom/fimi/soul/biz/manager/a;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/a;->a(Lcom/fimi/soul/biz/manager/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
