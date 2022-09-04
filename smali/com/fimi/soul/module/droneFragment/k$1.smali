.class Lcom/fimi/soul/module/droneFragment/k$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/droneFragment/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/k;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/k;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

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
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/k;->b(Lcom/fimi/soul/module/droneFragment/k;)I

    move-result v2

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/k;->c(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/k;->d(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/module/droneFragment/k;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/k;->e(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/k;->f(Lcom/fimi/soul/module/droneFragment/k;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/k;->g(Lcom/fimi/soul/module/droneFragment/k;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/k;->h(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/k;->i(Lcom/fimi/soul/module/droneFragment/k;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/k;->j(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b0483

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/module/droneFragment/k;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/k$1;->a:Lcom/fimi/soul/module/droneFragment/k;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/k;->j(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/drone/a;

    move-result-object v5

    iget-object v5, v5, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v6, 0x7f0b0482

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
