.class Lcom/fimi/soul/module/droneFragment/f$12;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/f;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->d(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v2

    :goto_1
    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    div-double/2addr v0, v2

    double-to-int v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;I)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->j(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->j(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;I)I

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    int-to-double v2, v2

    goto :goto_1
.end method

.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;IZ)V
    .locals 8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->p(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v4

    if-eqz v4, :cond_1

    int-to-double v2, p2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    :goto_0
    cmpg-double v0, v2, v0

    if-gtz v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_1
    int-to-double v6, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    int-to-double v2, v1

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    :goto_2
    cmpg-double v1, v6, v2

    if-gez v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-int v0, v0

    :cond_0
    :goto_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->o(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f0b019e

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_7

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    int-to-float v0, v0

    :goto_5
    invoke-virtual {v4, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->l(Lcom/fimi/soul/module/droneFragment/f;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->q(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    goto/16 :goto_1

    :cond_4
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    int-to-double v2, v1

    goto/16 :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f0b019f

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_7
    int-to-float v0, v0

    goto :goto_5

    :cond_8
    move v0, p2

    goto/16 :goto_1
.end method

.method public b(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 6

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->d(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    int-to-double v2, v1

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v2

    :goto_1
    mul-double/2addr v2, v4

    mul-float/2addr v0, v0

    float-to-double v0, v0

    cmpg-double v0, v2, v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v0

    :goto_2
    mul-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->s(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->s(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_5

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v1, v4

    :goto_3
    invoke-virtual {v2, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    int-to-double v2, v1

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v2

    :goto_4
    int-to-double v4, v0

    cmpl-double v1, v2, v4

    if-ltz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_7

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v1, v4

    :goto_5
    invoke-virtual {v2, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->k(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v0, v4

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0b0483

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    goto/16 :goto_0

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    int-to-double v2, v1

    goto/16 :goto_1

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    int-to-double v0, v0

    goto/16 :goto_2

    :cond_5
    move v1, v0

    goto/16 :goto_3

    :cond_6
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    int-to-double v2, v1

    goto/16 :goto_4

    :cond_7
    move v1, v0

    goto :goto_5

    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$12;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0b0482

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6
.end method
