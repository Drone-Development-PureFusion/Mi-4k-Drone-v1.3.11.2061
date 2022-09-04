.class public Lcom/fimi/soul/module/droneFragment/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/view/SwitchButtonStoke$a;


# static fields
.field private static final U:I = 0x1

.field private static final Y:I = 0x1

.field private static final Z:I = 0x2

.field private static final aa:I = 0x5dc

.field private static final ac:Ljava/lang/String; = "TakePhotoView"


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:D

.field private I:D

.field private J:D

.field private K:D

.field private L:D

.field private M:Lcom/fimi/soul/biz/camera/d;

.field private N:I

.field private O:Z

.field private P:Z

.field private Q:I

.field private R:Ljava/lang/String;

.field private S:Ljava/lang/String;

.field private T:Ljava/lang/String;

.field private V:Z

.field private W:Ljava/lang/String;

.field private X:Ljava/lang/String;

.field private a:Landroid/widget/Button;

.field private ab:Landroid/os/Handler;

.field private ad:Lcom/fimi/soul/module/droneui/FlightActivity$a;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/Button;

.field private d:Lcom/fimi/soul/view/MyEditView;

.field private e:Lcom/fimi/soul/view/MyEditView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private p:Lcom/fimi/soul/view/SwitchButtonStoke;

.field private q:Lcom/fimi/soul/drone/a;

.field private r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private s:Landroid/widget/ImageView;

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
    .locals 4

    const/16 v3, 0xa

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/k;->t:I

    const/16 v0, 0x1e

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->u:I

    iput v3, p0, Lcom/fimi/soul/module/droneFragment/k;->v:I

    iput v3, p0, Lcom/fimi/soul/module/droneFragment/k;->w:I

    const/16 v0, 0x78

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->x:I

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->y:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->z:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->A:I

    const/16 v0, 0x14

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->F:I

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/k;->G:I

    const/16 v0, 0x12c

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->N:I

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/k;->P:Z

    iput v1, p0, Lcom/fimi/soul/module/droneFragment/k;->Q:I

    const-string v0, "s"

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->S:Ljava/lang/String;

    const-string v0, "m/s"

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->T:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/module/droneFragment/k$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/k$1;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->ab:Landroid/os/Handler;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/view/View;)V

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->M:Lcom/fimi/soul/biz/camera/d;

    return-void
.end method

.method private a(D)I
    .locals 11

    const/4 v1, 0x1

    iput-wide p1, p0, Lcom/fimi/soul/module/droneFragment/k;->H:D

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->z:I

    int-to-double v2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    double-to-int v0, v2

    int-to-double v2, v0

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->A:I

    int-to-double v4, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    div-double/2addr v4, v6

    double-to-int v0, v4

    int-to-double v4, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->A:I

    int-to-double v8, v0

    cmpg-double v0, v6, v8

    if-gtz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v4

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->z:I

    int-to-double v8, v0

    cmpl-double v0, v6, v8

    if-lez v0, :cond_0

    double-to-int v0, v2

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->A:I

    int-to-double v8, v0

    cmpl-double v0, v6, v8

    if-lez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v4

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->z:I

    int-to-double v8, v0

    cmpg-double v0, v6, v8

    if-gtz v0, :cond_1

    double-to-int v0, v4

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double/2addr v6, v4

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->z:I

    int-to-double v8, v0

    cmpg-double v0, v6, v8

    if-gtz v0, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v2

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->A:I

    int-to-double v8, v0

    cmpg-double v0, v6, v8

    if-gtz v0, :cond_2

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_3

    double-to-int v0, v2

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    add-int/lit8 v0, v0, -0x1

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_1
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->m:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v3, 0x7f0b021d

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    double-to-int v5, p1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_5

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_2
    add-int/2addr v0, v2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->l()I

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->y:I

    int-to-double v2, v2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->k()D

    move-result-wide v4

    sub-double/2addr v2, v4

    double-to-int v4, v2

    iget-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v2, :cond_6

    int-to-double v2, v0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v2

    double-to-float v5, v2

    :goto_3
    move-object v0, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/k;->a(IDIF)I

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    return v0

    :cond_3
    double-to-int v0, v4

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    int-to-float v5, v0

    goto :goto_3
.end method

.method private a(IDIF)I
    .locals 14

    int-to-double v2, p1

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    iget v4, p0, Lcom/fimi/soul/module/droneFragment/k;->N:I

    int-to-double v4, v4

    iget v6, p0, Lcom/fimi/soul/module/droneFragment/k;->N:I

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->k()D

    move-result-wide v10

    sub-double/2addr v8, v10

    int-to-double v10, v6

    cmpg-double v7, v8, v10

    if-gtz v7, :cond_0

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    mul-double/2addr v8, v4

    iget-object v7, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v7}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v7

    invoke-virtual {v7}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v10

    const-wide v12, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v10, v12

    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    div-double/2addr v10, v12

    sub-double/2addr v8, v10

    int-to-double v10, p1

    cmpg-double v7, v8, v10

    if-gtz v7, :cond_0

    cmpg-double v7, v2, v4

    if-gtz v7, :cond_3

    move/from16 v0, p5

    float-to-double v8, v0

    div-double v8, v4, v8

    double-to-int v7, v8

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    double-to-int v7, v4

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->C:I

    :cond_0
    :goto_0
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->k()D

    move-result-wide v10

    sub-double/2addr v8, v10

    int-to-double v10, v6

    cmpg-double v7, v8, v10

    if-gtz v7, :cond_1

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    mul-double/2addr v8, v4

    iget-object v7, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v7}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v7

    invoke-virtual {v7}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v10

    const-wide v12, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v10, v12

    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    div-double/2addr v10, v12

    sub-double/2addr v8, v10

    int-to-double v10, p1

    cmpl-double v7, v8, v10

    if-lez v7, :cond_1

    move/from16 v0, p5

    float-to-double v8, v0

    div-double v8, v2, v8

    double-to-int v7, v8

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    double-to-int v7, v2

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->C:I

    :cond_1
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v2, v8

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->k()D

    move-result-wide v8

    sub-double/2addr v2, v8

    int-to-double v6, v6

    cmpl-double v2, v2, v6

    if-lez v2, :cond_2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v4

    iget-object v6, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v6

    const-wide v8, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v6, v8

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    div-double/2addr v6, v8

    sub-double/2addr v2, v6

    int-to-double v6, p1

    cmpg-double v2, v2, v6

    if-gtz v2, :cond_2

    move/from16 v0, p5

    float-to-double v2, v0

    div-double v2, v4, v2

    double-to-int v2, v2

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    double-to-int v2, v4

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/k;->C:I

    :cond_2
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->m()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    invoke-virtual {v2, v3}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    return v2

    :cond_3
    move/from16 v0, p5

    float-to-double v8, v0

    div-double v8, v2, v8

    double-to-int v7, v8

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    double-to-int v7, v2

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/k;->C:I

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/k;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneFragment/k;->Q:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k;->W:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 8

    const/4 v5, 0x3

    const/4 v7, 0x1

    const/4 v6, 0x2

    const/4 v1, 0x0

    const v0, 0x7f1002c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->j:Landroid/widget/TextView;

    const v0, 0x7f1002c5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->k:Landroid/widget/TextView;

    const v0, 0x7f1002c8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->l:Landroid/widget/TextView;

    const v0, 0x7f1002c9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->m:Landroid/widget/TextView;

    const v0, 0x7f1002cd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->s:Landroid/widget/ImageView;

    const v0, 0x7f1002be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f1002b9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->a:Landroid/widget/Button;

    const v0, 0x7f1002ba

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->b:Landroid/widget/Button;

    const v0, 0x7f1002bd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->f:Landroid/widget/TextView;

    const v0, 0x7f1002bf

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->g:Landroid/widget/TextView;

    const v0, 0x7f1002c2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->h:Landroid/widget/TextView;

    const v0, 0x7f1002c0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$2;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f1002c3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$3;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f1002cc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/SwitchButtonStoke;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->p:Lcom/fimi/soul/view/SwitchButtonStoke;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->p:Lcom/fimi/soul/view/SwitchButtonStoke;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$4;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/SwitchButtonStoke;->setOnSwitchListener(Lcom/fimi/soul/view/SwitchButtonStoke$a;)V

    const v0, 0x7f1002cb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->i:Landroid/widget/TextView;

    const v0, 0x7f1002ce

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    const v0, 0x7f1002c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$5;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$6;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const v0, 0x7f1002c4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$7;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$7;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/k$8;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/k$8;-><init>(Lcom/fimi/soul/module/droneFragment/k;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0xb

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->a:Landroid/widget/Button;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->b:Landroid/widget/Button;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->f:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->g:Landroid/widget/TextView;

    aput-object v3, v2, v5

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->h:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->i:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->j:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->k:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->l:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->m:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v2, v6, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v7

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    new-array v3, v5, [Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->a:Landroid/widget/Button;

    aput-object v0, v3, v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->b:Landroid/widget/Button;

    aput-object v0, v3, v7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    aput-object v0, v3, v6

    array-length v4, v3

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_1

    aget-object v0, v3, v2

    instance-of v5, v0, Lcom/fimi/soul/view/SwitchButtonStoke;

    if-eqz v5, :cond_0

    check-cast v0, Lcom/fimi/soul/view/SwitchButtonStoke;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/view/SwitchButtonStoke;->setOnSwitchListener(Lcom/fimi/soul/view/SwitchButtonStoke$a;)V

    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    new-array v2, v6, [Lcom/fimi/soul/view/MyEditView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    aput-object v0, v2, v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    aput-object v0, v2, v7

    array-length v3, v2

    move v0, v1

    :goto_2
    if-ge v0, v3, :cond_2

    aget-object v1, v2, v0

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->clearFocus()V

    invoke-virtual {v1, v6}, Lcom/fimi/soul/view/MyEditView;->setInputType(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method private a(Landroid/widget/EditText;)V
    .locals 2

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    goto :goto_0
.end method

.method private a(Landroid/widget/TextView;ILjava/lang/String;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/k;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 8

    const/4 v3, 0x1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setCursorVisible(Z)V

    invoke-virtual {p1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/k;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/k;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_4

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_3

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_0
    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_9

    int-to-float v0, p2

    cmpl-float v0, v1, v0

    if-lez v0, :cond_5

    int-to-float v1, p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v2, :cond_0

    int-to-double v4, p2

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int p2, v4

    :cond_0
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_2
    invoke-virtual {v2, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_7

    float-to-double v0, v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    move v1, v0

    :goto_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_8

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_4
    sub-int v0, v1, v0

    invoke-virtual {p4, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    :goto_5
    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/widget/EditText;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setCursorVisible(Z)V

    :goto_6
    return-void

    :cond_3
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_0

    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v1, v0

    goto :goto_1

    :cond_5
    int-to-float v0, p3

    cmpg-float v0, v1, v0

    if-gez v0, :cond_1

    int-to-float v1, p3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_6

    int-to-double v4, p3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_7
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/widget/EditText;)V

    invoke-virtual {p1, v3}, Lcom/fimi/soul/view/MyEditView;->setCursorVisible(Z)V

    goto :goto_6

    :cond_6
    move v0, p3

    goto :goto_7

    :cond_7
    :try_start_1
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    move v1, v0

    goto :goto_3

    :cond_8
    move v0, v3

    goto :goto_4

    :cond_9
    int-to-float v0, p2

    cmpl-float v0, v1, v0

    if-lez v0, :cond_c

    int-to-float v1, p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move-object v2, v0

    :cond_a
    :goto_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->S:Ljava/lang/String;

    if-ne p5, v0, :cond_d

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/j/d;->b(I)V

    :goto_9
    invoke-virtual {v2, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_b
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p4, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    goto/16 :goto_5

    :cond_c
    int-to-float v0, p3

    cmpg-float v0, v1, v0

    if-gez v0, :cond_a

    int-to-float v1, p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move-object v2, v0

    goto :goto_8

    :cond_d
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v4

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_e

    float-to-double v6, v1

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v6

    double-to-float v0, v6

    :goto_a
    invoke-virtual {v4, v0}, Lcom/fimi/soul/biz/j/d;->a(F)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_9

    :cond_e
    move v0, v1

    goto :goto_a
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/k;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k;->R:Ljava/lang/String;

    return-object p1
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "[^0-9.]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/k;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k;->X:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->S:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/k;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->B:I

    return v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/k;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->t:I

    return v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/k;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneFragment/k;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method private k()D
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/aq;->f()D

    move-result-wide v2

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/i/aq;->e()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/droneFragment/k;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->m()V

    return-void
.end method

.method private l()I
    .locals 6

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->x:I

    int-to-double v0, v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v2

    const-wide v4, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    sub-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method static synthetic l(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->W:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/fimi/soul/module/droneFragment/k;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->ab:Landroid/os/Handler;

    return-object v0
.end method

.method private m()V
    .locals 10

    const v9, 0x7f0b019f

    const v8, 0x7f0b019e

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_0

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_0
    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    int-to-float v2, v2

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v3, :cond_1

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v4

    double-to-float v0, v4

    :goto_1
    mul-float/2addr v0, v2

    float-to-double v2, v0

    iget-wide v4, p0, Lcom/fimi/soul/module/droneFragment/k;->H:D

    invoke-static {v4, v5}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double/2addr v2, v4

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v4

    const-wide v6, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v4, v6

    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    div-double/2addr v4, v6

    add-double/2addr v2, v4

    invoke-static {v2, v3, v1}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    float-to-double v4, v0

    iget-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->H:D

    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v4, v6

    invoke-static {v4, v5, v1}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->k:Landroid/widget/TextView;

    const v6, 0x7f0b04ae

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-direct {p0, v1, v6, v0}, Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->j:Landroid/widget/TextView;

    const v2, 0x7f0b0273

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v3, v3, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-direct {p0, v1, v2, v0}, Lcom/fimi/soul/module/droneFragment/k;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto/16 :goto_0

    :cond_1
    int-to-float v0, v0

    goto/16 :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v3, v3, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v3, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3
.end method

.method static synthetic n(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->R:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/fimi/soul/module/droneFragment/k;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->X:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    invoke-static {p1, p2, p3, p4, p5}, Lcom/fimi/soul/utils/ae;->a(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 3

    const/16 v2, 0xbb8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0125

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0124

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0409

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->M:Lcom/fimi/soul/biz/camera/d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->M:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->g()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/k;->b()V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bx:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->M:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->x()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/e;->f()V

    goto :goto_1
.end method

.method public a(I)V
    .locals 3

    iput p1, p0, Lcom/fimi/soul/module/droneFragment/k;->D:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->D:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u00b0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-double v0, v0

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/k;->a(D)I

    return-void
.end method

.method public a(Landroid/view/View;Z)V
    .locals 0

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/i/a/a;)V
    .locals 4

    const-wide/16 v2, 0x0

    if-eqz p1, :cond_4

    :try_start_0
    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->d()S

    move-result v0

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    :cond_0
    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->e()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    :cond_1
    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->c()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    :cond_2
    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->f()S

    move-result v0

    div-int/lit8 v0, v0, 0xa

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->g()S

    move-result v1

    div-int/lit8 v1, v1, 0xa

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->h()S

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/a/a;->g()S

    move-result v2

    div-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Lcom/fimi/soul/module/droneui/FlightActivity$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/k;->ad:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    return-void
.end method

.method public b()V
    .locals 8

    const-wide/16 v6, 0x0

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->P:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    cmpl-double v0, v0, v6

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/aq;->g()D

    move-result-wide v0

    const-wide v2, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/aq;->i()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/aq;->j()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-wide v2, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    cmpl-double v0, v0, v6

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->H:D

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/k;->c()V

    :cond_2
    return-void
.end method

.method public c()V
    .locals 12

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    const/high16 v8, 0x41200000    # 10.0f

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v2

    double-to-int v0, v2

    :goto_0
    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v1, :cond_1

    int-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    move v5, v0

    :goto_1
    const-string v0, "TakePhotoView"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateTakePhoto: isReturn\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->Q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v5

    mul-float/2addr v2, v8

    float-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",angle:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    mul-double/2addr v2, v10

    double-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "speek:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    mul-float v2, v5, v8

    float-to-int v2, v2

    int-to-byte v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",cacheDroneHeight:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    double-to-int v2, v2

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",cacheLong:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    double-to-float v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",cacheLat:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    double-to-float v2, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    const/16 v1, 0x12

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->Q:I

    int-to-byte v2, v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v3}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getProgress()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v5

    mul-float/2addr v3, v8

    float-to-int v3, v3

    int-to-short v3, v3

    iget-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    mul-double/2addr v6, v10

    double-to-int v4, v6

    int-to-short v4, v4

    mul-float/2addr v5, v8

    float-to-int v5, v5

    int-to-byte v5, v5

    iget-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    double-to-int v6, v6

    int-to-short v6, v6

    iget-wide v8, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    double-to-float v7, v8

    iget-wide v8, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    double-to-float v8, v8

    invoke-virtual/range {v0 .. v8}, Lcom/fimi/soul/module/c/d;->a(BBSSBSFF)V

    return-void

    :cond_0
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_1
    int-to-float v0, v0

    move v5, v0

    goto/16 :goto_1
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b04b7

    const/16 v2, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    return-void
.end method

.method public e()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public f()V
    .locals 2

    const/16 v1, 0x8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->f:Landroid/widget/TextView;

    const v1, 0x7f0b0355

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public h()V
    .locals 3

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/k;->F:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->F:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_0
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->l()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b04b4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/k;->E:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public i()V
    .locals 9

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const-wide/16 v6, 0x0

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->e()F

    move-result v1

    const-string v0, "TakePhotoView"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reStartDefault: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_0

    sub-float v0, v1, v4

    float-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v0, v4

    :goto_0
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/k;->e:Lcom/fimi/soul/view/MyEditView;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->V:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v1

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v3, 0x7f0b0483

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->d()I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->p:Lcom/fimi/soul/view/SwitchButtonStoke;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/view/SwitchButtonStoke;->setSwitchState(Z)V

    iput v8, p0, Lcom/fimi/soul/module/droneFragment/k;->Q:I

    iput-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->L:D

    iput-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->J:D

    iput-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->K:D

    iput-wide v6, p0, Lcom/fimi/soul/module/droneFragment/k;->I:D

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/k;->O:Z

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/k;->P:Z

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/k;->m()V

    return-void

    :cond_0
    sub-float v0, v1, v4

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v3, 0x7f0b0482

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->ad:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/droneui/FlightActivity$a;->b()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    const/16 v3, 0x8

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/k;->P:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/k;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/j/h;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bi:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->ad:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/droneui/FlightActivity$a;->b()V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v0

    if-eq v0, v2, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ao()Lcom/fimi/soul/drone/i/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/x;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0b042f

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/k;->O:Z

    if-eqz v0, :cond_4

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/k;->P:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/k;->a()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->q:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0b0366

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :sswitch_2
    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/k;->O:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->s:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/k;->c:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f1002b9 -> :sswitch_0
        0x7f1002ba -> :sswitch_1
        0x7f1002ce -> :sswitch_2
    .end sparse-switch
.end method
