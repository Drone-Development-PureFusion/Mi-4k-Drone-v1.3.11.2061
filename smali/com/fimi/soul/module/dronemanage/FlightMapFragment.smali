.class public Lcom/fimi/soul/module/dronemanage/FlightMapFragment;
.super Lcom/fimi/soul/module/droneui/DroneMap;

# interfaces
.implements Lcom/fimi/soul/view/titlebar/TouchableMap$a;
.implements Lcom/google/android/gms/maps/c$b;
.implements Lcom/google/android/gms/maps/c$c;
.implements Lcom/google/android/gms/maps/c$k;
.implements Lcom/google/android/gms/maps/c$n;
.implements Lcom/google/android/gms/maps/c$o;
.implements Lcom/google/android/gms/maps/c$p;
.implements Lcom/google/android/gms/maps/c$q;
.implements Lcom/google/android/gms/maps/c$r;
.implements Lcom/google/android/gms/maps/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;,
        Lcom/fimi/soul/module/dronemanage/FlightMapFragment$a;
    }
.end annotation


# static fields
.field private static final K:I = 0x14

.field private static final L:I = 0x1e


# instance fields
.field private A:Lcom/fimi/soul/module/droneFragment/e;

.field private B:Lcom/fimi/soul/module/droneFragment/e;

.field private C:Lcom/fimi/soul/module/droneFragment/e;

.field private D:Z

.field private E:Landroid/view/View;

.field private F:Landroid/widget/Button;

.field private G:Landroid/widget/Button;

.field private H:Landroid/view/View;

.field private I:Lcom/fimi/soul/biz/k/i;

.field private J:Lcom/fimi/soul/biz/k/c;

.field private M:Lcom/google/android/gms/maps/model/LatLng;

.field private N:Lcom/google/android/gms/maps/model/LatLng;

.field private O:F

.field private P:F

.field private Q:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$a;

.field private R:Landroid/content/SharedPreferences;

.field private S:Lcom/fimi/soul/biz/j/h;

.field private T:Lcom/fimi/soul/biz/j/c;

.field private U:Lcom/fimi/soul/view/titlebar/TouchableMap;

.field private V:D

.field private W:Lcom/fimi/soul/module/droneFragment/d;

.field private X:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private Y:Z

.field private final Z:I

.field a:Z

.field private aa:Lcom/google/android/gms/maps/model/LatLng;

.field private final ab:I

.field private ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

.field private ad:I

.field b:Landroid/content/SharedPreferences$Editor;

.field c:Landroid/graphics/Point;

.field d:Z

.field e:Lcom/google/android/gms/maps/model/c;

.field f:Lcom/google/android/gms/maps/model/c;

.field g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;"
        }
    .end annotation
.end field

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;"
        }
    .end annotation
.end field

.field protected i:Landroid/os/Handler;

.field private s:Lcom/fimi/soul/biz/k/d;

.field private t:Lcom/fimi/soul/biz/j/n;

.field private u:Lcom/google/android/gms/maps/model/LatLng;

.field private v:Lcom/google/android/gms/maps/model/c;

.field private w:Z

.field private x:Landroid/support/v4/app/FragmentManager;

.field private y:Landroid/view/View;

.field private z:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/DroneMap;-><init>()V

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->D:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->d:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    const/16 v0, 0x10

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Z:I

    iput v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ab:I

    sget-object v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    iput v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    new-instance v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$5;-><init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->i:Landroid/os/Handler;

    return-void
.end method

.method public static a([B)I
    .locals 2

    const/4 v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->z:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;)Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    return-object p1
.end method

.method private a(Lcom/fimi/soul/drone/i/bk;)V
    .locals 0

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;IILcom/fimi/soul/drone/i/a/c;)V
    .locals 11

    const/16 v10, 0x24

    const/16 v9, 0x1a

    const/high16 v8, 0x40000000    # 2.0f

    const/16 v7, 0xff

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->R:Landroid/content/SharedPreferences;

    const-string v1, "Amptype"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v1

    const/4 v0, 0x3

    if-eq p3, v0, :cond_1

    if-eqz v1, :cond_9

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    int-to-double v2, p2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v4

    cmpl-double v0, v2, v4

    if-eqz v0, :cond_2

    if-eqz v1, :cond_6

    invoke-virtual {p4}, Lcom/fimi/soul/drone/i/a/c;->l()S

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    int-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Lcom/google/android/gms/maps/model/c;->a(D)V

    :cond_2
    :goto_1
    if-eqz v1, :cond_10

    invoke-virtual {p4}, Lcom/fimi/soul/drone/i/a/c;->j()B

    move-result v0

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Y:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    const/16 v1, 0x63

    const/16 v2, 0x4f

    invoke-static {v1, v7, v2, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {p2, v1, v2, v8, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Y:Z

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->X:Ljava/util/List;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->X:Ljava/util/List;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/k/b;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    add-int/lit8 v2, p2, 0x64

    int-to-double v2, v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto :goto_1

    :cond_7
    if-eqz v1, :cond_8

    invoke-virtual {p4}, Lcom/fimi/soul/drone/i/a/c;->l()S

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    :goto_3
    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    new-instance v3, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v3, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v3

    int-to-double v4, v0

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/16 v3, 0x63

    const/16 v4, 0x4f

    invoke-static {v3, v7, v4, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->b(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    goto/16 :goto_1

    :cond_8
    add-int/lit8 v0, p2, 0x64

    goto :goto_3

    :cond_9
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->f:Lcom/google/android/gms/maps/model/c;

    goto/16 :goto_1

    :cond_a
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    const/16 v1, 0x63

    const/16 v2, 0x4f

    invoke-static {v1, v7, v2, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {p2, v1, v2, v8, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    goto/16 :goto_2

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    int-to-double v0, p2

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    int-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto/16 :goto_2

    :cond_c
    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Y:Z

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    :cond_d
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    const/16 v1, 0x63

    const/16 v2, 0x4f

    invoke-static {v1, v7, v2, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {p2, v1, v2, v8, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    iput-boolean v6, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Y:Z

    goto/16 :goto_2

    :cond_e
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    const/16 v1, 0x63

    const/16 v2, 0x4f

    invoke-static {v1, v7, v2, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/16 v3, 0x64

    invoke-static {p2, v1, v2, v8, v3}, Lcom/fimi/soul/biz/k/f;->a(IIIFI)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    goto/16 :goto_2

    :cond_f
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    int-to-double v0, p2

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    int-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto/16 :goto_2

    :cond_10
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    int-to-double v0, p2

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v2}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    int-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto/16 :goto_2

    :cond_11
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    int-to-double v2, p2

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/16 v2, 0x63

    const/16 v3, 0x4f

    invoke-static {v2, v7, v3, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-static {v9, v7, v10, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->b(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->b(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->e:Lcom/google/android/gms/maps/model/c;

    goto/16 :goto_2
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/fimi/kernel/utils/t;->a(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a([B)V

    :cond_0
    return-void
.end method

.method public static a(I)[B
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [B

    const/4 v1, 0x0

    shr-int/lit8 v2, p0, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x1

    shr-int/lit8 v2, p0, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x2

    shr-int/lit8 v2, p0, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/4 v1, 0x3

    and-int/lit16 v2, p0, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->aa:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method private b([B)Ljava/lang/String;
    .locals 5

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    array-length v0, p1

    if-lez v0, :cond_1

    array-length v3, p1

    move v0, v1

    move v2, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    add-int/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(IZ)[B

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/t;->a([B)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_1
    const-string v0, ""

    goto :goto_1
.end method

.method static synthetic c(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    return v0
.end method

.method private c(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const-wide v2, 0x407f400000000000L    # 500.0

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f0087

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/c;->a(Z)V

    goto :goto_0
.end method

.method private g()V
    .locals 0

    return-void
.end method

.method private h()V
    .locals 6

    const v5, 0x7f0200a9

    const v4, 0x7f0200a8

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0400bf

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->E:Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->E:Landroid/view/View;

    const v1, 0x7f100426

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->F:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->E:Landroid/view/View;

    const v1, 0x7f100427

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->G:Landroid/widget/Button;

    new-instance v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$1;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->F:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$1;-><init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->C:Lcom/fimi/soul/module/droneFragment/e;

    new-instance v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->F:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;-><init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->B:Lcom/fimi/soul/module/droneFragment/e;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->F:Landroid/widget/Button;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->C:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->G:Landroid/widget/Button;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->B:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private i()V
    .locals 5

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0400c0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->y:Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->y:Landroid/view/View;

    const v1, 0x7f100429

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->z:Landroid/widget/Button;

    new-instance v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$3;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->z:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0200aa

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0200ab

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$3;-><init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->A:Lcom/fimi/soul/module/droneFragment/e;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->z:Landroid/widget/Button;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->A:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private j()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$n;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$q;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$r;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->R:Landroid/content/SharedPreferences;

    const-string v2, "Amptype"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/c;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$o;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/c;->m()Lcom/google/android/gms/maps/j;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/google/android/gms/maps/j;->a(Z)V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->v:Lcom/google/android/gms/maps/model/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/c;->a(Z)V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/y;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/y;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$4;-><init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/manager/y;->b(Lcom/fimi/soul/biz/m/k;)V

    return-void
.end method

.method private m()V
    .locals 6

    const/4 v5, 0x6

    const/4 v4, 0x1

    const/4 v3, 0x0

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    if-gez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    iget v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/DynamicDYZ_Entity;

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Lcom/fimi/soul/drone/d/a/a/m;

    invoke-direct {v1}, Lcom/fimi/soul/drone/d/a/a/m;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getEncryptValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/t;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/d/a/a/m;->b([B)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/d/a/a/m;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    :goto_1
    sget-object v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->d:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/fimi/soul/drone/d/a/a/l;

    invoke-direct {v1}, Lcom/fimi/soul/drone/d/a/a/l;-><init>()V

    const/16 v2, 0x24

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/d/a/a/l;->a(B)V

    invoke-virtual {v1, v4}, Lcom/fimi/soul/drone/d/a/a/l;->c(Z)V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DynamicDYZ_Entity;->getEncryptValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/t;->a(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/d/a/a/l;->a(Z)V

    :goto_2
    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/d/a/a/l;->b([B)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/d/a/a/l;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1, v4}, Lcom/fimi/soul/drone/d/a/a/l;->a(Z)V

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/d/a/a/l;->b(Z)V

    iget v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    invoke-static {v2}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(I)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/d/a/a/l;->a([B)V

    goto :goto_2
.end method

.method private n()V
    .locals 3

    const/4 v2, 0x1

    new-instance v0, Lcom/fimi/soul/drone/d/a/a/l;

    invoke-direct {v0}, Lcom/fimi/soul/drone/d/a/a/l;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/d/a/a/l;->c(Z)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/drone/d/a/a/l;->g(B)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/drone/d/a/a/l;->e(B)V

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/d/a/a/l;->b()Lcom/fimi/soul/drone/d/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a(Lcom/fimi/soul/drone/d/a/c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/k/d;->a(Ljava/util/List;)V

    sget-object v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->e:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/g;)Landroid/view/View;
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getStyleInfo()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->isCanExcute()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->G:Landroid/widget/Button;

    const/16 v1, 0x4b

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Landroid/widget/Button;I)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->B:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/droneFragment/e;->a(Lcom/google/android/gms/maps/model/g;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->C:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/droneFragment/e;->a(Lcom/google/android/gms/maps/model/g;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aB()Lcom/fimi/soul/view/MapWrapperLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->E:Landroid/view/View;

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/view/MapWrapperLayout;->a(Lcom/google/android/gms/maps/model/g;Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->E:Landroid/view/View;

    :goto_1
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->G:Landroid/widget/Button;

    const/16 v1, 0xff

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Landroid/widget/Button;I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->z:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->A:Lcom/fimi/soul/module/droneFragment/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/droneFragment/e;->a(Lcom/google/android/gms/maps/model/g;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aB()Lcom/fimi/soul/view/MapWrapperLayout;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->y:Landroid/view/View;

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/view/MapWrapperLayout;->a(Lcom/google/android/gms/maps/model/g;Landroid/view/View;)V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->y:Landroid/view/View;

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public a()V
    .locals 5

    const/16 v4, 0x1e

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->J:Lcom/fimi/soul/biz/k/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/k/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/biz/k/c;-><init>(Lcom/google/android/gms/maps/c;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->J:Lcom/fimi/soul/biz/k/c;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    if-nez v0, :cond_2

    new-instance v0, Lcom/fimi/soul/biz/k/i;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/k/i;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    :goto_0
    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->i:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->i:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->i:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/k/i;->a(Z)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->J:Lcom/fimi/soul/biz/k/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/c;->b()V

    goto :goto_1
.end method

.method public varargs a(FZ[Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p3

    if-ge v0, v1, :cond_2

    aget-object v1, p3, v0

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, p1

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eq v1, p2, :cond_1

    aget-object v1, p3, v0

    invoke-virtual {v1, p2}, Landroid/view/View;->setEnabled(Z)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/high16 v3, 0x41f00000    # 30.0f

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/n/a;->c()Lcom/fimi/soul/biz/n/a$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/biz/n/a$a;->c:Lcom/fimi/soul/biz/n/a$a;

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->O:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->P:F

    iput-boolean v5, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a:Z

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto :goto_0

    :pswitch_2
    iput-boolean v4, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a:Z

    goto :goto_0

    :pswitch_3
    invoke-virtual {v0, v5}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    iget-boolean v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->O:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v3

    if-gtz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->P:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v3

    if-lez v1, :cond_0

    :cond_1
    sget-object v1, Lcom/fimi/soul/biz/n/a$a;->b:Lcom/fimi/soul/biz/n/a$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/n/a;->a(Lcom/fimi/soul/biz/n/a$a;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public a(Landroid/widget/Button;I)V
    .locals 1

    invoke-virtual {p1}, Landroid/widget/Button;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    const/16 v0, 0xff

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0
.end method

.method public a(Lcom/fimi/soul/drone/i/a/c;)V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->g()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->c()S

    move-result v1

    mul-int/lit8 v1, v1, 0xa

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->e()B

    move-result v2

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Lcom/google/android/gms/maps/model/LatLng;IILcom/fimi/soul/drone/i/a/c;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->f()F

    move-result v1

    float-to-double v2, v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/c;->g()F

    move-result v1

    float-to-double v4, v1

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_0
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/c;->b()V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bB:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    if-eqz p1, :cond_1

    iget v0, p1, Lcom/google/android/gms/maps/model/CameraPosition;->b:F

    const/high16 v1, 0x40e00000    # 7.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/d;->a()V

    :cond_1
    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 3

    const v2, 0x7f0202fe

    sget v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->l:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    sget v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->l:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    sget v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->l:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bp:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->x:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f100189

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    const v1, 0x7f0202d4

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/biz/j/c;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0, p1, v2}, Lcom/fimi/soul/biz/j/c;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0, p1, v2}, Lcom/fimi/soul/biz/j/c;->a(Lcom/google/android/gms/maps/model/LatLng;I)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/drone/i/bk;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/k/i;->b(Z)V

    :cond_0
    return-void
.end method

.method public a(IZ)[B
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [B

    if-eqz p2, :cond_0

    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    shr-int/lit8 p1, p1, 0x8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    array-length v2, v1

    if-ge v0, v2, :cond_1

    and-int/lit16 v2, p1, 0xff

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    shr-int/lit8 p1, p1, 0x8

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public b(Lcom/google/android/gms/maps/model/g;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->b:F

    const/high16 v1, 0x40e00000    # 7.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/d;->a()V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/maps/c;)V
    .locals 6

    if-eqz p1, :cond_4

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/google/android/gms/maps/c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/k/d;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/biz/k/d;-><init>(Landroid/content/Context;Lcom/google/android/gms/maps/c;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    if-nez v0, :cond_5

    new-instance v0, Lcom/fimi/soul/biz/j/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->x:Landroid/support/v4/app/FragmentManager;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/fimi/soul/biz/j/c;-><init>(Lcom/fimi/soul/drone/a;Lcom/google/android/gms/maps/c;Landroid/content/Context;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->t:Lcom/fimi/soul/biz/j/n;

    if-nez v0, :cond_1

    new-instance v0, Lcom/fimi/soul/biz/j/n;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/j/n;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->t:Lcom/fimi/soul/biz/j/n;

    :cond_1
    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->W:Lcom/fimi/soul/module/droneFragment/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->W:Lcom/fimi/soul/module/droneFragment/d;

    invoke-interface {v0, p1}, Lcom/fimi/soul/module/droneFragment/d;->a(Lcom/google/android/gms/maps/c;)V

    :cond_2
    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->i()V

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h()V

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/MyLocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->c()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->g(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    const-wide v2, 0x40406209fe86833cL    # 32.76593

    const-wide v4, 0x4059a188f42fe825L    # 102.523984

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    :cond_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a()V

    :cond_4
    return-void

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/c;->d()V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->R:Landroid/content/SharedPreferences;

    const-string v2, "Amptype"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(I)V

    :cond_0
    return-void
.end method

.method public c(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    return-void
.end method

.method public d(Lcom/google/android/gms/maps/model/g;)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->judgeNoAction()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->T:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/j/c;->a(Lcom/google/android/gms/maps/model/g;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h(Lcom/google/android/gms/maps/model/g;)V

    return-void
.end method

.method public f(Lcom/google/android/gms/maps/model/g;)V
    .locals 4

    iget-wide v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->V:D

    const-wide v2, 0x407f400000000000L    # 500.0

    cmpl-double v0, v0, v2

    if-gez v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->w:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->u:Lcom/google/android/gms/maps/model/LatLng;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->u:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->i()V

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bC:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public g(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    return-void
.end method

.method public h(Lcom/google/android/gms/maps/model/g;)V
    .locals 10

    const v9, 0x7f0b01a0

    const/4 v8, 0x1

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v4

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v6

    cmpg-double v0, v4, v6

    if-gez v0, :cond_0

    iput-boolean v8, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->w:Z

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b022f

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->w:Z

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    iget-object v4, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v1, v0}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->V:D

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq v0, v8, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    :cond_3
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->V:D

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f0b0234

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_4
    iget-wide v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->V:D

    const-wide v4, 0x407f400000000000L    # 500.0

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_6

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0b0519

    const/16 v2, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v9}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->V:D

    invoke-static {v2, v3, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f0b0316

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    iput-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->u:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v2, :cond_7

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    :cond_7
    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setLatLng(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    goto/16 :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/fimi/soul/module/droneui/DroneMap;->onAttach(Landroid/app/Activity;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->Q:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/d;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->W:Lcom/fimi/soul/module/droneFragment/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/fimi/soul/module/droneui/DroneMap;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->t:Lcom/fimi/soul/biz/j/n;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    :cond_0
    new-instance v0, Lcom/fimi/soul/biz/j/n;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/j/n;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->t:Lcom/fimi/soul/biz/j/n;

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/j/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/j/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->S:Lcom/fimi/soul/biz/j/h;

    invoke-static {}, Lcom/fimi/soul/biz/k/g;->c()Lcom/fimi/soul/biz/k/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/g;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->X:Ljava/util/List;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->x:Landroid/support/v4/app/FragmentManager;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    invoke-super {p0, p1, p2, p3}, Lcom/fimi/soul/module/droneui/DroneMap;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/view/titlebar/TouchableMap;

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/fimi/soul/view/titlebar/TouchableMap;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->U:Lcom/fimi/soul/view/titlebar/TouchableMap;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->U:Lcom/fimi/soul/view/titlebar/TouchableMap;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/titlebar/TouchableMap;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->U:Lcom/fimi/soul/view/titlebar/TouchableMap;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/view/titlebar/TouchableMap;->setNonConsumingTouchListener(Lcom/fimi/soul/view/titlebar/TouchableMap$a;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->R:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->R:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->b:Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->U:Lcom/fimi/soul/view/titlebar/TouchableMap;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/d;->b()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->t:Lcom/fimi/soul/biz/j/n;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/n;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->W:Lcom/fimi/soul/module/droneFragment/d;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->W:Lcom/fimi/soul/module/droneFragment/d;

    :cond_3
    return-void
.end method

.method public onDetach()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onDetach()V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v7, 0x1

    invoke-super {p0, p1, p2}, Lcom/fimi/soul/module/droneui/DroneMap;->onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V

    sget-object v1, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$6;->b:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->s:Lcom/fimi/soul/biz/k/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/d;->c()V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->J:Lcom/fimi/soul/biz/k/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->J:Lcom/fimi/soul/biz/k/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/c;->a()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->D:Z

    if-nez v1, :cond_2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ad()V

    iput-boolean v7, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->D:Z

    :cond_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->D:Z

    goto :goto_0

    :pswitch_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a(Lcom/fimi/soul/drone/i/a/c;)V

    goto :goto_0

    :pswitch_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->c(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0

    :pswitch_5
    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k()V

    goto :goto_0

    :pswitch_6
    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    sget-object v2, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->e:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    if-eq v1, v2, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->d()Lcom/fimi/soul/drone/i/r;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/r;->e()B

    move-result v2

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/r;->f()B

    move-result v3

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/r;->g()B

    move-result v4

    if-eq v3, v7, :cond_0

    sget-object v5, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$6;->a:[I

    iget-object v6, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ac:Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;

    invoke-virtual {v6}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$b;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-ne v2, v7, :cond_0

    if-nez v3, :cond_0

    if-nez v4, :cond_0

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/aq;->f()D

    move-result-wide v2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/aq;->e()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->aa:Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->l()V

    goto/16 :goto_0

    :pswitch_8
    if-nez v4, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->m()V

    goto/16 :goto_0

    :pswitch_9
    if-nez v4, :cond_0

    if-eq v3, v7, :cond_0

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/r;->d()[B

    move-result-object v1

    if-eqz v1, :cond_3

    array-length v2, v1

    if-lez v2, :cond_3

    invoke-static {v1}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a([B)I

    move-result v0

    :cond_3
    iget v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    iget-object v2, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_4

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->n()V

    goto/16 :goto_0

    :cond_4
    iget v1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    if-ne v1, v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->m()V

    iget v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->ad:I

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_0
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onPause()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->I:Lcom/fimi/soul/biz/k/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/k/i;->a(Z)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onResume()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->a()V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->onStop()V

    return-void
.end method
