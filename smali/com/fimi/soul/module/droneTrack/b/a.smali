.class public Lcom/fimi/soul/module/droneTrack/b/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/soul/module/droneTrack/b/a;

.field private static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fimi/soul/biz/h/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/droneTrack/b/a;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/droneTrack/b/a;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/b/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    return-object v0
.end method

.method public static b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fimi/soul/biz/h/g;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/module/droneTrack/a/a;)Lcom/fimi/soul/entity/ErrorMode;
    .locals 11

    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->b()Lcom/fimi/soul/drone/i/x;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v3

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->m()Z

    move-result v0

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->n()Z

    move-result v4

    new-instance v1, Lcom/fimi/soul/entity/ErrorMode;

    invoke-direct {v1}, Lcom/fimi/soul/entity/ErrorMode;-><init>()V

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/ErrorMode;->setIsMiddleFault(Z)V

    if-eqz v0, :cond_3e

    if-eqz v3, :cond_3d

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v5, 0x7f0b047b

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    const v0, 0x7f0b02d7

    invoke-virtual {p0, v3, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_2
    if-eqz v4, :cond_1

    if-eqz v3, :cond_3f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b047c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_3
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-eq v0, v10, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v4, 0xc

    if-ne v0, v4, :cond_3

    :cond_2
    if-nez v3, :cond_3

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->an()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/4 v4, 0x5

    if-eq v0, v4, :cond_4

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v4, 0x8

    if-ne v0, v4, :cond_5

    :cond_4
    if-nez v3, :cond_5

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02be

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/4 v4, 0x6

    if-ne v0, v4, :cond_6

    if-nez v3, :cond_6

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02bf

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0x9

    if-ne v0, v4, :cond_7

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0x11

    if-eq v0, v4, :cond_8

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    if-ne v0, v10, :cond_9

    :cond_8
    if-nez v3, :cond_9

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02bc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->am()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0x15

    if-eq v0, v4, :cond_a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v4, 0xe

    if-ne v0, v4, :cond_b

    :cond_a
    if-nez v3, :cond_b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0xb

    if-ne v0, v4, :cond_c

    if-nez v3, :cond_c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02bd

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->L()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsCompassFault(Z)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->f()Z

    move-result v0

    if-eqz v0, :cond_41

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_41

    if-eqz v3, :cond_40

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0449

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0449

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_4
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->g()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    if-eqz v0, :cond_44

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v0

    if-ne v0, v9, :cond_44

    :cond_d
    if-eqz v3, :cond_43

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0475

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0475

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_5
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v0

    if-ne v0, v7, :cond_e

    if-eqz v3, :cond_45

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0474

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_6
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->h()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->i()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    if-eqz v3, :cond_46

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0465

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    :goto_7
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->j()Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz v3, :cond_47

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b046c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    :goto_8
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->k()Z

    move-result v0

    if-eqz v0, :cond_12

    if-eqz v3, :cond_48

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b046d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_9
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->l()Z

    move-result v0

    if-eqz v0, :cond_13

    if-eqz v3, :cond_49

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0447

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_a
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->m()Z

    move-result v0

    if-eqz v0, :cond_4b

    if-eqz v3, :cond_4a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b043e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b043e

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_b
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->n()Z

    move-result v0

    if-eqz v0, :cond_14

    if-nez v3, :cond_14

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->o()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0x16

    if-eq v0, v4, :cond_15

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v4, 0xf

    if-ne v0, v4, :cond_16

    :cond_15
    if-nez v3, :cond_16

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->p()Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_4d

    if-eqz v3, :cond_4c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0458

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0458

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_c
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->q()Z

    move-result v0

    if-eqz v0, :cond_4f

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_4f

    if-eqz v3, :cond_4e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b045b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b045b

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_d
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->r()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0xc

    if-eq v0, v4, :cond_17

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/4 v4, 0x6

    if-ne v0, v4, :cond_18

    :cond_17
    if-nez v3, :cond_18

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02bb

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->x()Z

    move-result v0

    if-eqz v0, :cond_19

    if-nez v3, :cond_19

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0xd

    if-eq v0, v4, :cond_1a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    if-ne v0, v7, :cond_51

    :cond_1a
    if-nez v3, :cond_50

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    :goto_e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->L()Z

    move-result v0

    if-eqz v0, :cond_1c

    if-eqz v3, :cond_53

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0448

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    :goto_f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->M()Z

    move-result v0

    if-eqz v0, :cond_1d

    if-nez v3, :cond_1d

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->N()Z

    move-result v0

    if-eqz v0, :cond_1e

    if-nez v3, :cond_1e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->O()Z

    move-result v0

    if-eqz v0, :cond_1f

    if-nez v3, :cond_1f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->P()Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-eq v0, v8, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/4 v4, 0x7

    if-ne v0, v4, :cond_21

    :cond_20
    if-nez v3, :cond_21

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v4, 0x13

    if-eq v0, v4, :cond_22

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v4, 0xa

    if-ne v0, v4, :cond_23

    :cond_22
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b049f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_23
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->S()Z

    move-result v0

    if-nez v0, :cond_24

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-eq v0, v9, :cond_24

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/4 v4, 0x5

    if-ne v0, v4, :cond_56

    :cond_24
    if-eqz v3, :cond_55

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v4, 0x9

    if-ne v0, v4, :cond_54

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0470

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_10
    const v0, 0x7f0b044d

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_11
    new-array v0, v9, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    :cond_25
    :goto_12
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->T()Z

    move-result v0

    if-eqz v0, :cond_5c

    if-eqz v3, :cond_5a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0456

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_13
    if-eqz v3, :cond_5b

    const v0, 0x7f0b0456

    :goto_14
    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_15
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ah()Z

    move-result v0

    if-eqz v0, :cond_5f

    if-nez v3, :cond_5e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0442

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0442

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_16
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ai()Z

    move-result v0

    if-eqz v0, :cond_60

    if-eqz v3, :cond_26

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0454

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0454

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_26
    :goto_17
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->aj()Z

    move-result v0

    if-eqz v0, :cond_61

    if-eqz v3, :cond_27

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0455

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0455

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_27
    :goto_18
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ak()Z

    move-result v0

    if-eqz v0, :cond_28

    if-nez v3, :cond_28

    :cond_28
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->al()Z

    move-result v0

    if-eqz v0, :cond_29

    if-nez v3, :cond_29

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->v()Z

    move-result v0

    if-eqz v0, :cond_62

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02b8

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_19
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->U()Z

    move-result v0

    if-eqz v0, :cond_63

    if-nez v3, :cond_2a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02d9

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_2a
    :goto_1a
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->z()Z

    move-result v0

    if-eqz v0, :cond_2b

    if-eqz v3, :cond_64

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b046a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    :goto_1b
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->w()Z

    move-result v0

    if-eqz v0, :cond_2c

    if-eqz v3, :cond_65

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b046b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    :goto_1c
    if-eqz v3, :cond_2d

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->W()Z

    move-result v0

    if-eqz v0, :cond_66

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0497

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0496

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_2d
    :goto_1d
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-nez v0, :cond_2e

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_33

    :cond_2e
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->o()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->a()Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->X()Z

    move-result v0

    if-eqz v0, :cond_2f

    if-eqz v3, :cond_67

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0481

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    :goto_1e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->Y()Z

    move-result v0

    if-eqz v0, :cond_30

    if-eqz v3, :cond_68

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b00fd

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    :goto_1f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->Z()Z

    move-result v0

    if-eqz v0, :cond_31

    if-eqz v3, :cond_69

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0285

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_31
    :goto_20
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ao()Z

    move-result v0

    if-eqz v0, :cond_32

    if-nez v3, :cond_32

    :cond_32
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->aa()Z

    move-result v0

    if-eqz v0, :cond_33

    if-eqz v3, :cond_6a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b01c4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_33
    :goto_21
    if-nez v3, :cond_34

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->y()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b04a0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_34
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ap()Z

    move-result v0

    if-eqz v0, :cond_35

    if-eqz v3, :cond_6b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a1

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_35
    :goto_22
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->aq()Z

    move-result v0

    if-eqz v0, :cond_36

    if-nez v3, :cond_36

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02cd

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->ar()Z

    move-result v0

    if-eqz v0, :cond_37

    if-nez v3, :cond_37

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02dc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_37
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->as()Z

    move-result v0

    if-eqz v0, :cond_38

    if-eqz v3, :cond_6c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0466

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_38
    :goto_23
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->at()Z

    move-result v0

    if-eqz v0, :cond_39

    if-nez v3, :cond_39

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02cc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_39
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->au()Z

    move-result v0

    if-eqz v0, :cond_3a

    if-eqz v3, :cond_3a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b045e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3a
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->av()Z

    move-result v0

    if-eqz v0, :cond_3b

    if-nez v3, :cond_3b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02cf

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3b
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->aw()Z

    move-result v0

    if-eqz v0, :cond_3c

    if-nez v3, :cond_3c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v2, 0x7f0b02c6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    move-object v0, v1

    goto/16 :goto_0

    :cond_3d
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v5, 0x7f0b02d7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_3e
    new-array v0, v7, [I

    const v5, 0x7f0b02d7

    aput v5, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_2

    :cond_3f
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_40
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02af

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02af

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_4

    :cond_41
    new-array v4, v7, [I

    if-eqz v3, :cond_42

    const v0, 0x7f0b0449

    :goto_24
    aput v0, v4, v6

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_4

    :cond_42
    const v0, 0x7f0b02af

    goto :goto_24

    :cond_43
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02d5

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_5

    :cond_44
    new-array v0, v8, [I

    fill-array-data v0, :array_1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_5

    :cond_45
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_46
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02ab

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_47
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_48
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_49
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_4a
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a4

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_b

    :cond_4b
    new-array v0, v8, [I

    fill-array-data v0, :array_2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_b

    :cond_4c
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_c

    :cond_4d
    new-array v0, v7, [I

    const v4, 0x7f0b0458

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_c

    :cond_4e
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02c5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_4f
    new-array v0, v7, [I

    const v4, 0x7f0b045b

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_d

    :cond_50
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0457

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_51
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->K()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_1b

    if-eqz v3, :cond_52

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b044c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_52
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_53
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02ac

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_54
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b044d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_55
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02b6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02b6

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_11

    :cond_56
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->Q()Z

    move-result v0

    if-eqz v0, :cond_58

    new-array v0, v9, [I

    fill-array-data v0, :array_3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    if-eqz v3, :cond_57

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0444

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0444

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_57
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02a7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a7

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_58
    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/x;->R()Z

    move-result v0

    if-eqz v0, :cond_59

    new-array v0, v10, [I

    fill-array-data v0, :array_4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    if-eqz v3, :cond_25

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0451

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0451

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_59
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_12

    :cond_5a
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02ba

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_5b
    const v0, 0x7f0b02ba

    goto/16 :goto_14

    :cond_5c
    new-array v4, v7, [I

    if-eqz v3, :cond_5d

    const v0, 0x7f0b0456

    :goto_25
    aput v0, v4, v6

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_15

    :cond_5d
    const v0, 0x7f0b02ba

    goto :goto_25

    :cond_5e
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0443

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0443

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_16

    :cond_5f
    new-array v0, v8, [I

    fill-array-data v0, :array_6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_16

    :cond_60
    new-array v0, v7, [I

    const v4, 0x7f0b0454

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_17

    :cond_61
    new-array v0, v7, [I

    const v4, 0x7f0b0455

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_18

    :cond_62
    new-array v0, v7, [I

    const v4, 0x7f0b02b8

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_19

    :cond_63
    new-array v0, v7, [I

    const v4, 0x7f0b02d9

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_1a

    :cond_64
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1b

    :cond_65
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02d1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1c

    :cond_66
    new-array v0, v7, [I

    const v4, 0x7f0b0496

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_1d

    :cond_67
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0480

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1e

    :cond_68
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b00fc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1f

    :cond_69
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b0284

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_20

    :cond_6a
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b01c3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :cond_6b
    new-array v0, v7, [I

    const v4, 0x7f0b02a1

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_22

    :cond_6c
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0b02ce

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_23

    :array_0
    .array-data 4
        0x7f0b0444
        0x7f0b02a7
        0x7f0b0451
    .end array-data

    :array_1
    .array-data 4
        0x7f0b0475
        0x7f0b02d5
    .end array-data

    :array_2
    .array-data 4
        0x7f0b043e
        0x7f0b02a4
    .end array-data

    :array_3
    .array-data 4
        0x7f0b044d
        0x7f0b02b6
        0x7f0b0451
    .end array-data

    :array_4
    .array-data 4
        0x7f0b044d
        0x7f0b02b6
        0x7f0b0444
        0x7f0b02a7
    .end array-data

    :array_5
    .array-data 4
        0x7f0b0444
        0x7f0b0451
        0x7f0b02a7
        0x7f0b0470
        0x7f0b044d
    .end array-data

    :array_6
    .array-data 4
        0x7f0b0443
        0x7f0b0442
    .end array-data
.end method

.method public a(ZZI)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/h/g;

    invoke-direct {v2, p1, p2, p3}, Lcom/fimi/soul/biz/h/g;-><init>(ZZI)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public varargs a([I)V
    .locals 5

    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    aget v2, p1, v0

    sget-object v3, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    return-void

    :array_0
    .array-data 4
        0x7f0b0470
        0x7f0b0451
    .end array-data
.end method
