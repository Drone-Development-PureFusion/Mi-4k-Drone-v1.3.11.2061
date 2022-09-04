.class public Lcom/fimi/soul/biz/j/p;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/j/m;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/fimi/soul/drone/a;

.field private volatile c:I


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    iput-object p1, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->n()Lcom/fimi/soul/drone/i/av;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/av;->a()I

    move-result v1

    iget v2, p0, Lcom/fimi/soul/biz/j/p;->c:I

    if-ge v1, v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v1, p0, Lcom/fimi/soul/biz/j/p;->c:I

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/av;->a()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/av;->g()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double v1, v2, v4

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/fimi/soul/biz/j/p;->c:I

    iget-object v2, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gt v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/av;->a()I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/c/d;->q()V

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    iget v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/p;->a(I)V

    goto :goto_0
.end method

.method public a(I)V
    .locals 9

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/utils/af;->a(DDD)Lcom/fimi/soul/utils/al;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v1

    float-to-int v1, v1

    int-to-short v6, v1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-short v7, v1

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v8

    move v1, p1

    invoke-virtual/range {v0 .. v8}, Lcom/fimi/soul/module/c/d;->a(IDDSSI)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object v1, v0

    goto :goto_0
.end method

.method public a(Lcom/fimi/soul/drone/i/aw;)V
    .locals 9

    const/4 v8, 0x1

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->l()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/d;->j()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->c()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->b()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    if-eqz v0, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->h()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-direct {v3}, Lcom/fimi/soul/entity/FlyActionBean;-><init>()V

    invoke-virtual {v3, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->d()D

    move-result-wide v4

    double-to-int v2, v4

    int-to-float v2, v2

    invoke-virtual {v3, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(F)V

    invoke-virtual {v3, v8}, Lcom/fimi/soul/entity/FlyActionBean;->setType(I)V

    invoke-virtual {v3, v8}, Lcom/fimi/soul/entity/FlyActionBean;->setModelType(I)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->g()D

    move-result-wide v4

    double-to-int v2, v4

    int-to-float v2, v2

    invoke-virtual {v3, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(F)V

    if-eqz v1, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->h()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v1, v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bl:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/aw;->a()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/p;->b(I)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0356

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    iput-object p1, p0, Lcom/fimi/soul/biz/j/p;->a:Ljava/util/List;

    iget v0, p0, Lcom/fimi/soul/biz/j/p;->c:I

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/p;->a(I)V

    goto :goto_0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/p;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/c/d;->a(I)V

    return-void
.end method
