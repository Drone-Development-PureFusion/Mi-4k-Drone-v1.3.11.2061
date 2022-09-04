.class Lcom/fimi/soul/module/droneFragment/a$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/a;->a(Landroid/view/View;)V
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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;IZ)V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/module/droneFragment/a;Z)Z

    int-to-double v2, p2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    :goto_0
    cmpg-double v0, v2, v0

    if-gez v0, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_1
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->n()Lcom/fimi/soul/entity/FlyActionBean;

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->a()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->o()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v1

    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v1

    if-eqz v1, :cond_4

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v4

    double-to-float v1, v4

    :goto_3
    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(F)V

    :cond_0
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v1

    if-eqz v1, :cond_5

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v4

    double-to-float v1, v4

    :goto_4
    invoke-virtual {v2, v1}, Lcom/fimi/soul/biz/j/d;->d(F)V

    :goto_5
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->g(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v3, 0x7f0b0483

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v0

    int-to-double v0, v0

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->i(Lcom/fimi/soul/module/droneFragment/a;)I

    move-result v0

    goto/16 :goto_1

    :cond_3
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->n()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v1

    move-object v2, v1

    goto :goto_2

    :cond_4
    int-to-float v1, v0

    goto :goto_3

    :cond_5
    int-to-float v1, v0

    goto :goto_4

    :cond_6
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/a;->e(Lcom/fimi/soul/module/droneFragment/a;)Z

    move-result v1

    if-eqz v1, :cond_7

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v4

    double-to-float v1, v4

    :goto_7
    invoke-virtual {v2, v1}, Lcom/fimi/soul/biz/j/d;->c(F)V

    goto :goto_5

    :cond_7
    int-to-float v1, v0

    goto :goto_7

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a$3;->a:Lcom/fimi/soul/module/droneFragment/a;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v3, 0x7f0b0482

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_9
    move v0, p2

    goto/16 :goto_1
.end method

.method public b(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 0

    return-void
.end method
