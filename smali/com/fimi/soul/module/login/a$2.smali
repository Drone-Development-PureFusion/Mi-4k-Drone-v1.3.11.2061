.class Lcom/fimi/soul/module/login/a$2;
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

    iput-object p1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    const v4, 0x7f0b04e1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v0, 0x0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/login/LoginActivity;->o()I

    move-result v1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->b(Lcom/fimi/soul/module/login/a;)I

    move-result v1

    if-gtz v1, :cond_0

    :goto_1
    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->c(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/drone/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    const/16 v2, 0x32

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/login/a;->a(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->c(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const v1, 0x7f0b01f5

    const v2, 0x7f0b04e0

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->a(II)V

    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->e(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/biz/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/f/a;->d()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->d(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/setting/GimalCalibration/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->c(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->an()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->m()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->l()V

    :goto_3
    invoke-static {v3}, Lcom/fimi/soul/drone/droneconnection/connection/b;->a(Z)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->k()V

    goto :goto_3

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->o()I

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->f(Lcom/fimi/soul/module/login/a;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(I)V

    invoke-static {}, Lcom/fimi/soul/biz/g/a;->a()Lcom/fimi/soul/biz/g/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/g/a;->b()I

    move-result v0

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const v1, 0x7f0b03a6

    invoke-virtual {v0, v1, v4}, Lcom/fimi/soul/module/login/LoginActivity;->a(II)V

    :goto_4
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/a;->a()V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v0}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v0

    const v1, 0x7f0b03a7

    invoke-virtual {v0, v1, v4}, Lcom/fimi/soul/module/login/LoginActivity;->a(II)V

    goto :goto_4

    :pswitch_3
    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->a(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/module/login/LoginActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/login/LoginActivity;->o()I

    move-result v1

    if-eq v1, v3, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->e(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/biz/f/a;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v1}, Lcom/fimi/soul/module/login/a;->e(Lcom/fimi/soul/module/login/a;)Lcom/fimi/soul/biz/f/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/f/a;->a(Z)V

    :cond_5
    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-virtual {v1}, Lcom/fimi/soul/module/login/a;->a()V

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    iget-object v2, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    invoke-static {v2}, Lcom/fimi/soul/module/login/a;->g(Lcom/fimi/soul/module/login/a;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/login/a;->a(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/a$2;->a:Lcom/fimi/soul/module/login/a;

    iget-object v1, v1, Lcom/fimi/soul/module/login/a;->p:Landroid/os/Handler;

    const-wide/32 v2, 0x88b8

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/b;->a(Z)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method
