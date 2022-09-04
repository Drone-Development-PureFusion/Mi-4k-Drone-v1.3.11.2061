.class Lcom/fimi/soul/module/droneFragment/f$6;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/droneFragment/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/f;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    const v7, 0x7f0b019f

    const v6, 0x7f0b019e

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->z(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ne v0, v1, :cond_5

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->o(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v2, v0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->s(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    if-lt v2, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->s(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v2

    :cond_0
    if-nez v2, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->k(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getMax()I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->j(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b0483

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b0482

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->k(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->j(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b0483

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f0b0482

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    goto :goto_2

    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->B(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->h(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->t(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->u(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_3
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_6
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_7
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->C(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->o(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getMax()I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_4
    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v5}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_9
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->D(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->c(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->w(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->x(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->y(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    const-string v5, "\u00b0"

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    goto/16 :goto_1
.end method
