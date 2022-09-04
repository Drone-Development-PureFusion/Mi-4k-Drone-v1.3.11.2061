.class Lcom/fimi/soul/module/login/a$3;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/login/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/login/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/login/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    const v2, 0x7f0b04e1

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->o()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->h(Lcom/fimi/soul/module/login/a;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(I)V

    invoke-static {}, Lcom/fimi/soul/biz/g/a;->a()Lcom/fimi/soul/biz/g/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/g/a;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const v1, 0x7f0b03a6

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->a(II)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/a;->a()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$3;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const v1, 0x7f0b03a7

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->a(II)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
