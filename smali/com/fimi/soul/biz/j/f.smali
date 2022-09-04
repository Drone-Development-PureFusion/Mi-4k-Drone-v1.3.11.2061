.class public Lcom/fimi/soul/biz/j/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/j/m;


# instance fields
.field private a:Lcom/fimi/soul/drone/a;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/biz/j/f;->a:Lcom/fimi/soul/drone/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/f;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    const/16 v7, 0xaa

    move-wide v4, v2

    move v6, v1

    move v8, v1

    invoke-virtual/range {v0 .. v8}, Lcom/fimi/soul/module/c/d;->a(IDDSII)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/fimi/soul/entity/FlyActionBean;

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_0

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

    move-object v4, v0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/f;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    const/4 v1, 0x1

    iget-wide v2, v4, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v6

    float-to-int v6, v6

    int-to-short v6, v6

    const/16 v7, 0x55

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-virtual/range {v0 .. v8}, Lcom/fimi/soul/module/c/d;->a(IDDSII)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    invoke-virtual {v8}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object v4, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/f;->a:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0350

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_1
.end method
