.class public Lcom/fimi/soul/biz/j/l;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/j/m;


# instance fields
.field private a:Lcom/fimi/soul/drone/a;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/biz/j/l;->a:Lcom/fimi/soul/drone/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 13

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/l;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    const/4 v1, 0x1

    const/16 v7, 0x16

    move-wide v4, v2

    move v8, v6

    move v9, v6

    move v10, v6

    move v11, v6

    move v12, v6

    invoke-virtual/range {v0 .. v12}, Lcom/fimi/soul/module/c/d;->a(IDDIIIIIII)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;)V"
        }
    .end annotation

    const/4 v13, 0x1

    const-wide v2, 0x3ff6978d4fdf3b64L    # 1.412

    const/high16 v9, 0x41200000    # 10.0f

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    if-ne v0, v13, :cond_1

    :cond_0
    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    rsub-int v0, v0, 0x168

    int-to-double v0, v0

    div-double/2addr v0, v2

    double-to-int v0, v0

    int-to-short v10, v0

    :goto_0
    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

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

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/l;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v1

    mul-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getOpration_Code()I

    move-result v7

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v1

    mul-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v1

    mul-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v9

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v11

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getYaw_mode()I

    move-result v12

    move v1, v13

    invoke-virtual/range {v0 .. v12}, Lcom/fimi/soul/module/c/d;->a(IDDIIIIIII)V

    :goto_2
    return-void

    :cond_1
    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v2

    double-to-int v0, v0

    int-to-short v10, v0

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v12}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object v1, v0

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/biz/j/l;->a:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0353

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_2
.end method
