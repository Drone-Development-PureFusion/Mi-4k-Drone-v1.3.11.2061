.class Lcom/fimi/soul/biz/k/c$2;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/k/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/k/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLimitRadius()D

    move-result-wide v2

    mul-double/2addr v2, v6

    double-to-int v1, v2

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getRadius()I

    move-result v2

    mul-int/lit8 v2, v2, 0xa

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getWarinRadius()D

    move-result-wide v4

    mul-double/2addr v4, v6

    double-to-int v3, v4

    add-int/2addr v3, v2

    iget-object v4, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLogitude()D

    move-result-wide v8

    invoke-static {v4, v6, v7, v8, v9}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    if-ge v2, v1, :cond_0

    iget-object v5, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v6, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v6}, Lcom/fimi/soul/biz/k/c;->d(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v6

    invoke-static {v5, v4, v1, v6}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v5, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v5}, Lcom/fimi/soul/biz/k/c;->e(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v5

    invoke-static {v1, v4, v3, v5}, Lcom/fimi/soul/biz/k/c;->b(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getPushType()D

    move-result-wide v6

    cmpl-double v1, v6, v10

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getNoFlyType()D

    move-result-wide v0

    cmpl-double v0, v0, v10

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->f(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v0, v4, v2, v1, v3}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;Z)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->g(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v0, v4, v2, v1, v3}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;Z)V

    goto :goto_0

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->h(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/k/c;->b(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->i(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/k/c;->b(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->j(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/k/c;->b(Lcom/fimi/soul/biz/k/c;Ljava/util/List;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->h(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->k(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->i(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->l(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->j(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/k/c;->m(Lcom/fimi/soul/biz/k/c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-static {}, Lcom/fimi/soul/biz/k/a;->a()Lcom/fimi/soul/biz/k/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/a;->b()V

    goto :goto_0

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1e

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/k/c$2;->a:Lcom/fimi/soul/biz/k/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/k/c;->n(Lcom/fimi/soul/biz/k/c;)Lcom/google/android/gms/maps/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/maps/model/CameraPosition;->a:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/k/c;->a(Lcom/fimi/soul/biz/k/c;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;

    goto/16 :goto_0
.end method
