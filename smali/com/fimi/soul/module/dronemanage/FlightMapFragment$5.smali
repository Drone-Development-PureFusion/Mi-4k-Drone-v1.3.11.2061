.class Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/dronemanage/FlightMapFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 10

    const/4 v9, 0x0

    const/4 v8, 0x1

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    new-instance v1, Lcom/fimi/soul/drone/d/a/a/l;

    invoke-direct {v1}, Lcom/fimi/soul/drone/d/a/a/l;-><init>()V

    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    :sswitch_0
    return-void

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Z)V

    goto :goto_0

    :sswitch_2
    invoke-virtual {v1, v9}, Lcom/fimi/soul/drone/d/a/a/l;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/d/a/a/l;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    goto :goto_0

    :sswitch_3
    invoke-virtual {v1, v8}, Lcom/fimi/soul/drone/d/a/a/l;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    if-eqz v0, :cond_1

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getLogitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v4, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-static {v4}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->b(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/am;->a()D

    iget-object v3, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v3, v3, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getEncryptKey()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/t;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/d/a/a/l;->b([B)V

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1, v9}, Lcom/fimi/soul/drone/d/a/a/l;->a(Z)V

    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/d/a/a/l;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    sget-object v1, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->c:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    invoke-static {v0, v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;)Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    goto/16 :goto_0

    :cond_3
    const/16 v0, 0x1a

    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/d/a/a/l;->a(B)V

    invoke-virtual {v1, v8}, Lcom/fimi/soul/drone/d/a/a/l;->a(Z)V

    invoke-virtual {v1, v8}, Lcom/fimi/soul/drone/d/a/a/l;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->c(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)I

    move-result v0

    invoke-static {v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(I)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/d/a/a/l;->a([B)V

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x10 -> :sswitch_2
        0x14 -> :sswitch_0
        0x1e -> :sswitch_1
    .end sparse-switch
.end method
