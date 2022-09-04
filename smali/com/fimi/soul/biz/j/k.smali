.class public Lcom/fimi/soul/biz/j/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/j/a;


# instance fields
.field private a:Lcom/google/android/gms/maps/c;

.field private b:Landroid/content/Context;

.field private c:Lcom/fimi/soul/drone/a;

.field private d:Lcom/fimi/soul/biz/j/d;

.field private e:Lcom/google/android/gms/maps/model/g;

.field private f:Lcom/google/android/gms/maps/model/i;

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/c;Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/biz/j/k;->a:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/biz/j/k;->b:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->f()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->e()D

    move-result-wide v0

    invoke-virtual {p0, v2, v3, v0, v1}, Lcom/fimi/soul/biz/j/k;->a(DD)V

    return-void
.end method

.method public a(DD)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/biz/j/k;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 7

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->a:Lcom/google/android/gms/maps/c;

    iget-object v3, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v3, v3, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iget-object v4, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v4}, Lcom/fimi/soul/biz/j/d;->k()F

    move-result v4

    const/4 v5, 0x1

    const v6, 0x7f0202fe

    invoke-static {v1, v3, v4, v5, v6}, Lcom/fimi/soul/biz/j/i;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/content/Context;FZI)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const/high16 v2, 0x447a0000    # 1000.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/g;->a(F)V

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const v2, 0x3e4ccccd    # 0.2f

    const v3, 0x3f4ccccd    # 0.8f

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    iget-boolean v1, p0, Lcom/fimi/soul/biz/j/k;->h:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/a/f;->d()B

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/fimi/soul/biz/j/k;->e()V

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v1, p1}, Lcom/fimi/soul/biz/j/d;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bz:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_3
    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/fimi/soul/biz/j/k;->d()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->a:Lcom/google/android/gms/maps/c;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/biz/j/k;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0082

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/fimi/soul/biz/j/i;->a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v2, 0x42480000    # 50.0f

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->b(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;I)V
    .locals 10

    const v7, 0x7f0202fe

    const-wide v8, 0x407f400000000000L    # 500.0

    const/4 v6, 0x1

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/k/a;->a()Lcom/fimi/soul/biz/k/a;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/fimi/soul/biz/k/a;->a(Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v4

    cmpg-double v0, v2, v4

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b022f

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {p1, v0}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v0

    cmpl-double v2, v0, v8

    if-lez v2, :cond_3

    cmpl-double v0, v0, v8

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->b:Landroid/content/Context;

    const v1, 0x7f0b037e

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-nez v0, :cond_7

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-direct {v0}, Lcom/fimi/soul/entity/FlyActionBean;-><init>()V

    :cond_4
    invoke-virtual {v0, p1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {v0, v7}, Lcom/fimi/soul/entity/FlyActionBean;->setDrawableRes(I)V

    invoke-virtual {v0, v6}, Lcom/fimi/soul/entity/FlyActionBean;->setCanclick(Z)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setType(I)V

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setModelType(I)V

    invoke-virtual {v0, v6}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/j/d;->k()F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(F)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->a:Lcom/google/android/gms/maps/c;

    iget-object v3, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v3, v3, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iget-object v4, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v4}, Lcom/fimi/soul/biz/j/d;->k()F

    move-result v4

    invoke-static {p1, v3, v4, v6, v7}, Lcom/fimi/soul/biz/j/i;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/content/Context;FZI)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v2

    iput-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const/high16 v3, 0x447a0000    # 1000.0f

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/g;->a(F)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const v3, 0x3e4ccccd    # 0.2f

    const v4, 0x3f4ccccd    # 0.8f

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    iget-object v2, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/j/d;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bz:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    goto/16 :goto_0
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 6

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v1
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const v1, 0x7f0202ff

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/j/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/h;->a(I)V

    return-void
.end method

.method public c(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 6

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/utils/af;->a(DDD)Lcom/fimi/soul/utils/al;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    return-object v1
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b0182

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_1
    return-void
.end method

.method public d()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getType()I

    move-result v1

    if-ne v3, v1, :cond_1

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setCanExcute(Z)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const v1, 0x7f0202fe

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b0182

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    iput-boolean v3, p0, Lcom/fimi/soul/biz/j/k;->h:Z

    :cond_1
    return-void
.end method

.method public e()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getType()I

    move-result v1

    if-ne v3, v1, :cond_1

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setStyleInfo(I)V

    invoke-virtual {v0, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setCanExcute(Z)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const v1, 0x7f0202fe

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b0182

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    iput-boolean v3, p0, Lcom/fimi/soul/biz/j/k;->h:Z

    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setType(I)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/d;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_1
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    :cond_1
    return-void
.end method

.method public h()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v1, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bh:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public i()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v1

    if-nez v1, :cond_3

    iget-boolean v1, p0, Lcom/fimi/soul/biz/j/k;->g:Z

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/k;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/fimi/soul/biz/j/k;->g:Z

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/biz/j/k;->f:Lcom/google/android/gms/maps/model/i;

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/biz/j/k;->d:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/k;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/k;->c(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/fimi/soul/biz/j/k;->g:Z

    goto :goto_0
.end method

.method public j()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/k;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/k;->g:Z

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/k;->h:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/k;->h:Z

    return-void
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/k;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
