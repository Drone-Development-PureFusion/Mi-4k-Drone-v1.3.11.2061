.class public Lcom/fimi/soul/biz/h/h;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/soul/biz/h/h;

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

    sput-object v0, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/h/h;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/h/h;->a:Lcom/fimi/soul/biz/h/h;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/h/h;

    invoke-direct {v0}, Lcom/fimi/soul/biz/h/h;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/h/h;->a:Lcom/fimi/soul/biz/h/h;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/h/h;->a:Lcom/fimi/soul/biz/h/h;

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

    sget-object v0, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

    return-object v0
.end method

.method private d()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/biz/h/g;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/soul/biz/h/g;->c()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v3

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v1}, Lcom/fimi/soul/biz/h/g;->a()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/biz/h/g;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/fimi/soul/biz/h/g;->b(Z)V

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/h/g;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    const-wide/16 v4, 0x7d0

    invoke-static {v0, v4, v5}, Lcom/fimi/soul/utils/av;->a(Landroid/app/Activity;J)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/entity/ErrorMode;
    .locals 11

    const/4 v10, 0x4

    const/4 v9, 0x2

    const/4 v8, 0x6

    const/4 v7, 0x1

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ao()Lcom/fimi/soul/drone/i/x;

    move-result-object v3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v4

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->i()Lcom/fimi/soul/drone/i/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/am;->m()Z

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->i()Lcom/fimi/soul/drone/i/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/am;->n()Z

    move-result v0

    :goto_0
    new-instance v2, Lcom/fimi/soul/entity/ErrorMode;

    invoke-direct {v2}, Lcom/fimi/soul/entity/ErrorMode;-><init>()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v5

    invoke-interface {v5}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a()Z

    move-result v5

    if-nez v5, :cond_1

    move-object v0, v2

    :goto_1
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->Q()Lcom/fimi/soul/drone/i/ay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ay;->g()Z

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->Q()Lcom/fimi/soul/drone/i/ay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ay;->h()Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsMiddleFault(Z)V

    if-eqz v1, :cond_4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v1

    const v5, 0x7f0b047b

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    const v1, 0x7f0b02d7

    invoke-virtual {p0, v4, v6, v1}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_3
    if-eqz v0, :cond_2

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b047c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_4
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_6

    move-object v0, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v1

    const v5, 0x7f0b02d7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-array v1, v7, [I

    const v5, 0x7f0b02d7

    aput v5, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-eq v0, v10, :cond_7

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_8

    :cond_7
    if-nez v4, :cond_8

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->an()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_9

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_a

    :cond_9
    if-nez v4, :cond_a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02be

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-ne v0, v8, :cond_b

    if-nez v4, :cond_b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02bf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_c

    if-nez v4, :cond_c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0x11

    if-eq v0, v1, :cond_d

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    if-ne v0, v10, :cond_e

    :cond_d
    if-nez v4, :cond_e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02bc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->am()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0x15

    if-eq v0, v1, :cond_f

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_10

    :cond_f
    if-nez v4, :cond_10

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_11

    if-nez v4, :cond_11

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02bd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->L()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsCompassFault(Z)V

    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->f()Z

    move-result v0

    if-eqz v0, :cond_4a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_4a

    if-eqz v4, :cond_49

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0449

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0449

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_5
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    :cond_12
    :goto_6
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->h()Z

    move-result v0

    if-nez v0, :cond_13

    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->i()Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    if-eqz v4, :cond_4f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0465

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    :goto_7
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->j()Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz v4, :cond_50

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b046c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_8
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->k()Z

    move-result v0

    if-eqz v0, :cond_16

    if-eqz v4, :cond_51

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b046d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_9
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->l()Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz v4, :cond_52

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0447

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    :goto_a
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->m()Z

    move-result v0

    if-eqz v0, :cond_54

    if-eqz v4, :cond_53

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b043e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b043e

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->n()Z

    move-result v0

    if-eqz v0, :cond_18

    if-nez v4, :cond_18

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->o()Z

    move-result v0

    if-nez v0, :cond_19

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0x16

    if-eq v0, v1, :cond_19

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1a

    :cond_19
    if-nez v4, :cond_1a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1a
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->p()Z

    move-result v0

    if-eqz v0, :cond_56

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_56

    if-eqz v4, :cond_55

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0458

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0458

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_c
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->q()Z

    move-result v0

    if-eqz v0, :cond_58

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_58

    if-eqz v4, :cond_57

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b045b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b045b

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->r()Z

    move-result v0

    if-nez v0, :cond_1b

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1b

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    if-ne v0, v8, :cond_1c

    :cond_1b
    if-nez v4, :cond_1c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02bb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->s()Z

    move-result v0

    if-eqz v0, :cond_1d

    if-nez v4, :cond_1d

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ay()I

    move-result v0

    if-ne v0, v10, :cond_59

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02da

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    :goto_e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->x()Z

    move-result v0

    if-eqz v0, :cond_1e

    if-nez v4, :cond_1e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1f

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    if-ne v0, v7, :cond_5b

    :cond_1f
    if-nez v4, :cond_5a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    :goto_f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->L()Z

    move-result v0

    if-eqz v0, :cond_21

    if-eqz v4, :cond_5d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0448

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    :goto_10
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->M()Z

    move-result v0

    if-eqz v0, :cond_22

    if-nez v4, :cond_22

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->N()Z

    move-result v0

    if-eqz v0, :cond_23

    if-nez v4, :cond_23

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_23
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->O()Z

    move-result v0

    if-eqz v0, :cond_24

    if-nez v4, :cond_24

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->P()Z

    move-result v0

    if-nez v0, :cond_25

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    if-eq v0, v9, :cond_25

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_26

    :cond_25
    if-nez v4, :cond_26

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/16 v1, 0x13

    if-eq v0, v1, :cond_27

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_28

    :cond_27
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b049f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_28
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->S()Z

    move-result v0

    if-nez v0, :cond_29

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->c()B

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_29

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->a()B

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_62

    :cond_29
    if-eqz v4, :cond_61

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_2a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_5e

    :cond_2a
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0471

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0471

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_11
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    :cond_2b
    :goto_12
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->T()Z

    move-result v0

    if-eqz v0, :cond_68

    if-eqz v4, :cond_66

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0456

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_13
    if-eqz v4, :cond_67

    const v0, 0x7f0b0456

    :goto_14
    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_15
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ah()Z

    move-result v0

    if-eqz v0, :cond_6b

    if-nez v4, :cond_6a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0442

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0442

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_16
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ai()Z

    move-result v0

    if-eqz v0, :cond_6c

    if-eqz v4, :cond_2c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0454

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0454

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_2c
    :goto_17
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->aj()Z

    move-result v0

    if-eqz v0, :cond_6d

    if-eqz v4, :cond_2d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0455

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0455

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_2d
    :goto_18
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ak()Z

    move-result v0

    if-eqz v0, :cond_2e

    if-nez v4, :cond_2e

    :cond_2e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->al()Z

    move-result v0

    if-eqz v0, :cond_2f

    if-nez v4, :cond_2f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->v()Z

    move-result v0

    if-eqz v0, :cond_6e

    if-nez v4, :cond_31

    sget-boolean v0, Lcom/fimi/soul/base/DroidPlannerApp;->f:Z

    if-nez v0, :cond_30

    const v0, 0x7f0b02b8

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_30
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_31
    :goto_19
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->U()Z

    move-result v0

    if-eqz v0, :cond_6f

    if-nez v4, :cond_32

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02d9

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_32
    :goto_1a
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->V()Z

    move-result v0

    if-eqz v0, :cond_71

    if-eqz v4, :cond_70

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0463

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0463

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_1b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->z()Z

    move-result v0

    if-eqz v0, :cond_33

    if-eqz v4, :cond_72

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b046a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_33
    :goto_1c
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->w()Z

    move-result v0

    if-eqz v0, :cond_34

    if-eqz v4, :cond_73

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b046b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_34
    :goto_1d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->D()Z

    move-result v0

    if-eqz v0, :cond_35

    if-nez v4, :cond_35

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0406

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_35
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->E()Z

    move-result v0

    if-eqz v0, :cond_75

    if-nez v4, :cond_74

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02ca

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->F()Z

    move-result v0

    if-eqz v0, :cond_77

    if-eqz v4, :cond_76

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0461

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0461

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_1f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->G()Z

    move-result v0

    if-eqz v0, :cond_36

    if-nez v4, :cond_36

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02aa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_36
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->H()Z

    move-result v0

    if-eqz v0, :cond_79

    if-eqz v4, :cond_78

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0460

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0460

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :goto_20
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->I()Z

    move-result v0

    if-eqz v0, :cond_37

    if-eqz v4, :cond_7a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0473

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_37
    :goto_21
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->J()Z

    move-result v0

    if-eqz v0, :cond_38

    if-eqz v4, :cond_7b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b045f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_38
    :goto_22
    if-eqz v4, :cond_39

    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->W()Z

    move-result v0

    if-eqz v0, :cond_7c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0497

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0496

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_39
    :goto_23
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-nez v0, :cond_3a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_3f

    :cond_3a
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->a()Z

    move-result v0

    if-eqz v0, :cond_3f

    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->X()Z

    move-result v0

    if-eqz v0, :cond_3b

    if-eqz v4, :cond_7d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0481

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3b
    :goto_24
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->Y()Z

    move-result v0

    if-eqz v0, :cond_3c

    if-eqz v4, :cond_7e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b00fd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    :goto_25
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->Z()Z

    move-result v0

    if-eqz v0, :cond_3d

    if-eqz v4, :cond_7f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0285

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3d
    :goto_26
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->aa()Z

    move-result v0

    if-eqz v0, :cond_3e

    if-eqz v4, :cond_80

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b01c4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3e
    :goto_27
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ao()Z

    move-result v0

    if-eqz v0, :cond_3f

    if-nez v4, :cond_3f

    :cond_3f
    if-nez v4, :cond_40

    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->y()Z

    move-result v0

    if-eqz v0, :cond_40

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b04a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_40
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ap()Z

    move-result v0

    if-eqz v0, :cond_41

    if-eqz v4, :cond_81

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a1

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    :cond_41
    :goto_28
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->aq()Z

    move-result v0

    if-eqz v0, :cond_42

    if-nez v4, :cond_42

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02cd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_42
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->ar()Z

    move-result v0

    if-eqz v0, :cond_43

    if-nez v4, :cond_43

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02dc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_43
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->as()Z

    move-result v0

    if-eqz v0, :cond_44

    if-eqz v4, :cond_82

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0466

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_44
    :goto_29
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->at()Z

    move-result v0

    if-eqz v0, :cond_45

    if-nez v4, :cond_45

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02cc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_45
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->au()Z

    move-result v0

    if-eqz v0, :cond_46

    if-eqz v4, :cond_46

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b045e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_46
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->av()Z

    move-result v0

    if-eqz v0, :cond_47

    if-nez v4, :cond_47

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02cf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_47
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->aw()Z

    move-result v0

    if-eqz v0, :cond_48

    if-nez v4, :cond_48

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_48
    invoke-direct {p0}, Lcom/fimi/soul/biz/h/h;->d()V

    move-object v0, v2

    goto/16 :goto_1

    :cond_49
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02af

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02af

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_5

    :cond_4a
    new-array v1, v7, [I

    if-eqz v4, :cond_4b

    const v0, 0x7f0b0449

    :goto_2a
    aput v0, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_5

    :cond_4b
    const v0, 0x7f0b02af

    goto :goto_2a

    :pswitch_0
    if-eqz v4, :cond_4c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0475

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0475

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :cond_4c
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0479

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0479

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :pswitch_1
    if-eqz v4, :cond_4d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b03de

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b03de

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :cond_4d
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b047a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b047a

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :pswitch_2
    if-eqz v4, :cond_4e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b046e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b046e

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :cond_4e
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02d6

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :pswitch_3
    if-nez v4, :cond_12

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0469

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0469

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    new-array v0, v8, [I

    fill-array-data v0, :array_8

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_6

    :cond_4f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02ab

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_50
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_51
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_52
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_53
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a4

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_b

    :cond_54
    new-array v0, v9, [I

    fill-array-data v0, :array_9

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_b

    :cond_55
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_c

    :cond_56
    new-array v0, v7, [I

    const v1, 0x7f0b0458

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_c

    :cond_57
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_58
    new-array v0, v7, [I

    const v1, 0x7f0b045b

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_d

    :cond_59
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_5a
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0457

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_5b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->K()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_20

    if-eqz v4, :cond_5c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b044c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_5c
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_5d
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02ac

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_5e
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_5f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0470

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0470

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_11

    :cond_5f
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    if-ne v0, v7, :cond_60

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b044e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b044e

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_11

    :cond_60
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b044d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b044d

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_11

    :cond_61
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02b6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02b6

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_11

    :cond_62
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->Q()Z

    move-result v0

    if-eqz v0, :cond_64

    new-array v0, v10, [I

    fill-array-data v0, :array_a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    if-eqz v4, :cond_63

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0444

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0444

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_12

    :cond_63
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02a7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02a7

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_12

    :cond_64
    invoke-virtual {v3}, Lcom/fimi/soul/drone/i/x;->R()Z

    move-result v0

    if-eqz v0, :cond_65

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    if-eqz v4, :cond_2b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0451

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0451

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_12

    :cond_65
    new-array v0, v8, [I

    fill-array-data v0, :array_c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_12

    :cond_66
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02ba

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_67
    const v0, 0x7f0b02ba

    goto/16 :goto_14

    :cond_68
    new-array v1, v7, [I

    if-eqz v4, :cond_69

    const v0, 0x7f0b0456

    :goto_2b
    aput v0, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_15

    :cond_69
    const v0, 0x7f0b02ba

    goto :goto_2b

    :cond_6a
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0443

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0443

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_16

    :cond_6b
    new-array v0, v9, [I

    fill-array-data v0, :array_d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_16

    :cond_6c
    new-array v0, v7, [I

    const v1, 0x7f0b0454

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_17

    :cond_6d
    new-array v0, v7, [I

    const v1, 0x7f0b0455

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_18

    :cond_6e
    new-array v0, v7, [I

    const v1, 0x7f0b02b8

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_19

    :cond_6f
    new-array v0, v7, [I

    const v1, 0x7f0b02d9

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_1a

    :cond_70
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02cb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b02cb

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_1b

    :cond_71
    new-array v0, v9, [I

    fill-array-data v0, :array_e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_1b

    :cond_72
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1c

    :cond_73
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_74
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0462

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0b0462

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/h/h;->a(ZZI)V

    goto/16 :goto_1e

    :cond_75
    new-array v0, v7, [I

    const v1, 0x7f0b0462

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_1e

    :cond_76
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1f

    :cond_77
    new-array v0, v7, [I

    const v1, 0x7f0b0461

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_1f

    :cond_78
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_20

    :cond_79
    new-array v0, v7, [I

    const v1, 0x7f0b0460

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_20

    :cond_7a
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :cond_7b
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02c7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_22

    :cond_7c
    new-array v0, v7, [I

    const v1, 0x7f0b0496

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_23

    :cond_7d
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0480

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_24

    :cond_7e
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b00fc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_25

    :cond_7f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b0284

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_26

    :cond_80
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b01c3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_27

    :cond_81
    new-array v0, v7, [I

    const v1, 0x7f0b02a1

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    goto/16 :goto_28

    :cond_82
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0b02ce

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_29

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :array_0
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b03de
        0x7f0b047a
        0x7f0b046e
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_1
    .array-data 4
        0x7f0b0444
        0x7f0b02a7
        0x7f0b0451
    .end array-data

    :array_2
    .array-data 4
        0x7f0b0479
        0x7f0b03de
        0x7f0b047a
        0x7f0b046e
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_3
    .array-data 4
        0x7f0b0475
        0x7f0b03de
        0x7f0b047a
        0x7f0b046e
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_4
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b047a
        0x7f0b046e
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_5
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b03de
        0x7f0b046e
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_6
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b03de
        0x7f0b047a
        0x7f0b02d6
        0x7f0b0469
    .end array-data

    :array_7
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b03de
        0x7f0b047a
        0x7f0b046e
        0x7f0b0469
    .end array-data

    :array_8
    .array-data 4
        0x7f0b0475
        0x7f0b0479
        0x7f0b03de
        0x7f0b047a
        0x7f0b046e
        0x7f0b02d6
    .end array-data

    :array_9
    .array-data 4
        0x7f0b043e
        0x7f0b02a4
    .end array-data

    :array_a
    .array-data 4
        0x7f0b044d
        0x7f0b02b6
        0x7f0b0451
        0x7f0b0471
    .end array-data

    :array_b
    .array-data 4
        0x7f0b044d
        0x7f0b02b6
        0x7f0b0444
        0x7f0b02a7
        0x7f0b0471
    .end array-data

    :array_c
    .array-data 4
        0x7f0b0444
        0x7f0b0451
        0x7f0b02a7
        0x7f0b0470
        0x7f0b044d
        0x7f0b0471
    .end array-data

    :array_d
    .array-data 4
        0x7f0b0443
        0x7f0b0442
    .end array-data

    :array_e
    .array-data 4
        0x7f0b0463
        0x7f0b02cb
    .end array-data
.end method

.method public a(ZZI)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

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

    sget-object v3, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/fimi/soul/biz/h/h;->b:Ljava/util/Map;

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

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/h/h;->a([I)V

    return-void

    :array_0
    .array-data 4
        0x7f0b0470
        0x7f0b0451
    .end array-data
.end method
