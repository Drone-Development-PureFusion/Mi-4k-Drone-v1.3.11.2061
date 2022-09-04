.class Lcom/fimi/soul/module/droneFragment/a$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/droneFragment/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/a;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/a;->b(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/a;->c(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/a;->d(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b019e

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b019f

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->g(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/a;->h(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/a;->j(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b0483

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/a$1;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b0482

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
