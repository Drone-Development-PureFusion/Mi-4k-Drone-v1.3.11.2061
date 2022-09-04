.class Lcom/fimi/soul/biz/j/c$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/j/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/j/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/j/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/c$1;->a:Lcom/fimi/soul/biz/j/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    const/4 v2, 0x0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c$1;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/c;->a(Lcom/fimi/soul/biz/j/c;)I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$1;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0, v2}, Lcom/fimi/soul/biz/j/c;->a(Lcom/fimi/soul/biz/j/c;Z)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$1;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0, v2}, Lcom/fimi/soul/biz/j/c;->b(Lcom/fimi/soul/biz/j/c;Z)Z

    goto :goto_0
.end method
