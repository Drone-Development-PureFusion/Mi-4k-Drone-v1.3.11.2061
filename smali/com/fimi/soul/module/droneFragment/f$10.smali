.class Lcom/fimi/soul/module/droneFragment/f$10;
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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    return-void
.end method

.method public a(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;IZ)V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->d(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    if-eqz v2, :cond_1

    int-to-double v4, p2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    :goto_0
    cmpg-double v0, v4, v0

    if-gez v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->h(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f0b019e

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->e(Lcom/fimi/soul/module/droneFragment/f;)Z

    move-result v1

    if-eqz v1, :cond_5

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-float v0, v0

    :goto_3
    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(F)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getDrawableRes()I

    move-result v3

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    const/4 v4, 0x1

    invoke-static {v1, v3, v2, v4}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    int-to-double v0, v0

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->f(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v0

    goto/16 :goto_1

    :cond_4
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;

    move-result-object v1

    const v5, 0x7f0b019f

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    int-to-float v0, v0

    goto :goto_3

    :cond_6
    move v0, p2

    goto/16 :goto_1
.end method

.method public b(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$10;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;Z)Z

    return-void
.end method
