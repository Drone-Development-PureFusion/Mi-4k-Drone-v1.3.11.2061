.class public Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/biz/h/e;
.implements Lcom/fimi/soul/drone/d$b;


# static fields
.field private static final O:Ljava/lang/String; = "ShowDroneStatusLineFrag"

.field public static a:Z


# instance fields
.field private A:Landroid/os/Handler;

.field private B:Lcom/fimi/soul/module/c/d;

.field private C:Z

.field private D:Ljava/util/Timer;

.field private E:Landroid/widget/Button;

.field private F:Landroid/widget/ImageView;

.field private G:Lcom/fimi/soul/biz/h/d;

.field private H:Lcom/fimi/soul/biz/h/h;

.field private I:Lcom/fimi/soul/view/d;

.field private J:Lcom/fimi/soul/biz/h/b;

.field private K:Ljava/lang/String;

.field private L:Ljava/util/Observer;

.field private M:Lcom/fimi/soul/entity/ErrorMode;

.field private N:Z

.field private P:Lcom/fimi/soul/module/droneui/FlightActivity$a;

.field b:Lcom/fimi/kernel/utils/v;

.field c:I

.field d:I

.field e:J

.field f:Z

.field g:I

.field h:I

.field private i:Lcom/fimi/soul/base/DroidPlannerApp;

.field private j:Lcom/fimi/soul/drone/a;

.field private k:Lcom/fimi/soul/module/droneui/a;

.field private l:Landroid/content/Context;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Lcom/fimi/soul/view/AutoScrollTextView;

.field private p:Landroid/widget/LinearLayout;

.field private q:Landroid/widget/Button;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/ImageView;

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->x:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->y:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->z:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->A:Landroid/os/Handler;

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->C:Z

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->L:Ljava/util/Observer;

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->e:J

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->f:Z

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->g:I

    iput v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->E:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;Lcom/fimi/soul/module/droneui/a;)Lcom/fimi/soul/module/droneui/a;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->K:Ljava/lang/String;

    return-object p1
.end method

.method private a(III)V
    .locals 8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    new-instance v7, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$4;

    invoke-direct {v7, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$4;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)V

    move v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/fimi/soul/module/droneui/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIZLcom/fimi/soul/module/droneui/a$a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneui/a;->setCancelable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->show()V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/i/x;)V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const v1, 0x7f0b0477

    const v0, 0x7f0b0186

    const/4 v3, 0x0

    const v5, 0x7f0203b6

    const v4, 0x7f020061

    const v2, 0x7f0b01db

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->S()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_0
    const v1, 0x7f0b0471

    const v0, 0x7f0b0472

    :goto_0
    const v2, 0x7f0b0450

    const v3, 0x7f020354

    move v8, v2

    move v2, v3

    move v3, v1

    move v1, v8

    :goto_1
    iget v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    if-eq v4, v3, :cond_1

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(III)V

    :cond_1
    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    :goto_2
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_3

    const v1, 0x7f0b0470

    goto :goto_0

    :cond_3
    const v1, 0x7f0b044d

    const v0, 0x7f0b044f

    goto :goto_0

    :cond_4
    iget-object v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v6

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v6

    const/4 v7, 0x1

    if-eq v6, v7, :cond_5

    iget-object v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v6

    invoke-virtual {v6}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v6

    const/4 v7, 0x3

    if-ne v6, v7, :cond_6

    :cond_5
    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/i/a/c;->b()B

    move-result v4

    packed-switch v4, :pswitch_data_0

    move v0, v2

    move v1, v3

    :goto_3
    const v2, 0x7f020392

    goto :goto_1

    :pswitch_0
    const v0, 0x7f0b0476

    const v3, 0x7f0b0475

    move v8, v1

    move v1, v0

    move v0, v8

    goto :goto_3

    :pswitch_1
    const v0, 0x7f0b03df

    const v3, 0x7f0b03de

    move v8, v1

    move v1, v0

    move v0, v8

    goto :goto_3

    :pswitch_2
    const v1, 0x7f0b046f

    const v3, 0x7f0b046e

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->m()Z

    move-result v0

    if-eqz v0, :cond_7

    const v3, 0x7f0b043e

    const v1, 0x7f0b0440

    const v0, 0x7f0b043f

    move v2, v4

    goto/16 :goto_1

    :cond_7
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_8

    const v3, 0x7f0b0449

    const v1, 0x7f0b044b

    const v0, 0x7f0b044a

    move v2, v5

    goto/16 :goto_1

    :cond_8
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->F()Z

    move-result v0

    if-eqz v0, :cond_9

    const v3, 0x7f0b0461

    const v1, 0x7f0b04d1

    const v0, 0x7f0b03e0

    move v2, v4

    goto/16 :goto_1

    :cond_9
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->E()Z

    move-result v0

    if-eqz v0, :cond_a

    const v3, 0x7f0b0462

    const v1, 0x7f0b04d2

    const v0, 0x7f0b03e1

    move v2, v4

    goto/16 :goto_1

    :cond_a
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    const v3, 0x7f0b0467

    const v1, 0x7f0b0460

    const v0, 0x7f0b0468

    move v2, v4

    goto/16 :goto_1

    :cond_b
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->ah()Z

    move-result v0

    if-eqz v0, :cond_c

    const v3, 0x7f0b042a

    const v1, 0x7f0b042c

    const v0, 0x7f0b042b

    move v2, v4

    goto/16 :goto_1

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->p()Z

    move-result v0

    if-eqz v0, :cond_d

    const v3, 0x7f0b0458

    const v1, 0x7f0b045a

    const v0, 0x7f0b0459

    move v2, v5

    goto/16 :goto_1

    :cond_d
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->R()Z

    move-result v0

    if-eqz v0, :cond_e

    const v3, 0x7f0b0451

    const v1, 0x7f0b0453

    const v0, 0x7f0b0452

    move v2, v5

    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->Q()Z

    move-result v0

    if-eqz v0, :cond_f

    const v3, 0x7f0b0444

    const v1, 0x7f0b0446

    const v0, 0x7f0b0445

    move v2, v5

    goto/16 :goto_1

    :cond_f
    invoke-virtual {p1}, Lcom/fimi/soul/drone/i/x;->W()Z

    move-result v0

    if-eqz v0, :cond_10

    const v2, 0x7f02031e

    const v1, 0x7f0b0498

    const v0, 0x7f0b0497

    const v3, 0x7f0b0496

    goto/16 :goto_1

    :cond_10
    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;Ljava/lang/String;)F
    .locals 1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;)F
    .locals 5

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    new-instance v1, Landroid/text/TextPaint;

    invoke-direct {v1}, Landroid/text/TextPaint;-><init>()V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    const/high16 v3, 0x41500000    # 13.0f

    invoke-virtual {v1, v3}, Landroid/text/TextPaint;->setTextSize(F)V

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, p1, v3, v4, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    return-object v0
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->v:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private b(II)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setVisibility(I)V

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/biz/h/b;->a(Z)V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->p:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->v:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private c(II)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setVisibility(I)V

    const-string v0, ""

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/biz/h/b;->a(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 3

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->E:Landroid/widget/Button;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/h/b;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->F:Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    const-string v1, ":"

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    return-object v0
.end method

.method private d()V
    .locals 10

    const-wide/16 v8, 0x7d0

    const v6, 0x7f0203b6

    const/4 v5, 0x4

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aE()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/d/b;->b()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->H:Lcom/fimi/soul/biz/h/h;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/h/h;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/entity/ErrorMode;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    const-string v0, "ShowDroneStatusLineFrag"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deelErrorUI: mode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getSeriousErrorList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    if-gt v0, v1, :cond_2

    iput v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ao()Lcom/fimi/soul/drone/i/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/x;->V()Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_3

    const v0, 0x7f0b04d7

    const v1, 0x7f0b0185

    invoke-direct {p0, v0, v1, v6}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(III)V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v1

    const v3, 0x7f0b0463

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lcom/fimi/soul/utils/av;->a(Landroid/app/Activity;J)V

    iput v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    :cond_3
    :goto_1
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_9

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0f017a

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->setTextColor(I)V

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    :goto_2
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->isCompassFault()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->isMiddleFault()Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->E:Landroid/widget/Button;

    const v1, 0x7f0b0399

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ao()Lcom/fimi/soul/drone/i/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/x;->S()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    if-lt v0, v5, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_7

    :cond_6
    const v1, 0x7f0b0471

    const v0, 0x7f0b0472

    :goto_3
    const v3, 0x7f0b04d8

    invoke-direct {p0, v3, v0, v6}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(III)V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lcom/fimi/soul/utils/av;->a(Landroid/app/Activity;J)V

    iput v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->h:I

    goto/16 :goto_1

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_8

    const v1, 0x7f0b0470

    const v0, 0x7f0b0186

    goto :goto_3

    :cond_8
    const v1, 0x7f0b044d

    const v0, 0x7f0b044f

    goto :goto_3

    :cond_9
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c()V

    goto/16 :goto_2

    :cond_a
    invoke-direct {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->getSeriousErrorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method private d(I)V
    .locals 3

    const v2, 0x7f020395

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0b0403

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    const-string v0, "ShowDroneStatusLineFrag"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "changeErrorCode: errorString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v2}, Lcom/fimi/soul/view/AutoScrollTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/AutoScrollTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ShowDroneStatusLineFrag"

    const-string v1, "changeErrorCode: 1"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->setVisibility(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v0, "ShowDroneStatusLineFrag"

    const-string v1, "changeErrorCode: 2"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    sget-object v1, Landroid/widget/TextView$BufferType;->NORMAL:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->l:Landroid/content/Context;

    const v1, 0x7f05000d

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/AutoScrollTextView;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->u:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e(I)V
    .locals 4

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->A:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/AutoScrollTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    iput v2, v0, Landroid/os/Message;->what:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->A:Landroid/os/Handler;

    const-wide/16 v2, 0x9c4

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->K:Ljava/lang/String;

    return-object v0
.end method

.method private f(I)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Lcom/fimi/soul/view/AutoScrollTextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->A:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Lcom/fimi/soul/module/droneui/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->k:Lcom/fimi/soul/module/droneui/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->g:I

    return v0
.end method

.method public a(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->f(I)V

    return-void
.end method

.method public a(II)V
    .locals 0

    if-lez p1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b(II)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(II)V

    goto :goto_0
.end method

.method public a(Lcom/fimi/soul/module/droneui/FlightActivity$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->P:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41840000    # 16.5f

    invoke-virtual {v0, v4, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-virtual {v0, v4, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x320

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->e:J

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->f:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->f:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->invalidate()V

    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020205

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->f:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203fc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(I)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->N:Z

    return-void
.end method

.method public c(I)V
    .locals 1

    if-gtz p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iput p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->g:I

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d()V

    goto :goto_0

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const v0, 0x7f020394

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    const v1, 0x7f0b0405

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->i:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->i:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->l:Landroid/content/Context;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->isMiddleFault()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/remote/RemoteCalibration;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->isCompassFault()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "isdirectcalicompass"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->B:Lcom/fimi/soul/module/c/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/c/d;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bo:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_2
    const-string v0, "is_setting_enter"

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "select_corresponding_view"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "login"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->H:Lcom/fimi/soul/biz/h/h;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/h/h;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/entity/ErrorMode;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->I:Lcom/fimi/soul/view/d;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getSeriousErrorList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900ff

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090100

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/fimi/soul/view/d;->a(Ljava/util/List;Landroid/view/View;II)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f1004d2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/fimi/soul/biz/h/h;->a()Lcom/fimi/soul/biz/h/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->H:Lcom/fimi/soul/biz/h/h;

    new-instance v0, Lcom/fimi/soul/biz/h/b;

    invoke-direct {v0}, Lcom/fimi/soul/biz/h/b;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->L:Ljava/util/Observer;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/h/b;->addObserver(Ljava/util/Observer;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const/4 v5, 0x0

    const/4 v4, 0x1

    const v0, 0x7f0400f3

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    const v0, 0x7f10028b

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f1002f7

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->v:Landroid/widget/ImageView;

    const v0, 0x7f100294

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/AutoScrollTextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const v0, 0x7f1004d0

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->p:Landroid/widget/LinearLayout;

    const v0, 0x7f1004d7

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1004d5

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f1004d6

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->E:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->E:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100289

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->r:Landroid/widget/ImageView;

    const v0, 0x7f1004d8

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->s:Landroid/widget/ImageView;

    const v0, 0x7f1004d3

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->t:Landroid/widget/ImageView;

    const v0, 0x7f1004d1

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->u:Landroid/widget/ImageView;

    const v0, 0x7f1004d4

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->F:Landroid/widget/ImageView;

    const v0, 0x7f1004d2

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    aput-object v2, v1, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    aput-object v2, v1, v4

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->n:Landroid/widget/TextView;

    aput-object v2, v1, v5

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/c/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/c/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->B:Lcom/fimi/soul/module/c/d;

    const v0, 0x7f0b01df

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(I)V

    new-instance v0, Lcom/fimi/soul/view/d;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900fe

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    const/16 v3, 0x190

    invoke-direct {v0, v1, v2, v3}, Lcom/fimi/soul/view/d;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->I:Lcom/fimi/soul/view/d;

    sput-boolean v4, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v0, v5}, Lcom/fimi/soul/view/AutoScrollTextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->D:Ljava/util/Timer;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->D:Ljava/util/Timer;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$3;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xfa0

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-object v6
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->J:Lcom/fimi/soul/biz/h/b;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->L:Ljava/util/Observer;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/h/b;->deleteObserver(Ljava/util/Observer;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 6

    const v5, 0x7f0b0194

    const v2, 0x7f0f017c

    const/4 v4, 0x4

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->C:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$5;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ao()Lcom/fimi/soul/drone/i/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/x;->a()I

    move-result v1

    if-gez v1, :cond_1

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/i/a/c;

    move-result-object v1

    if-eqz v1, :cond_3

    :cond_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(Lcom/fimi/soul/drone/i/x;)V

    goto :goto_0

    :cond_2
    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    goto :goto_0

    :cond_3
    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$5;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    :cond_5
    :goto_1
    :pswitch_2
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->v:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_6

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/AutoScrollTextView;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->o:Lcom/fimi/soul/view/AutoScrollTextView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/AutoScrollTextView;->b()V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->g:I

    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d:I

    goto :goto_0

    :pswitch_3
    invoke-static {}, Lcom/fimi/soul/utils/ad;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(Ljava/lang/String;)V

    const v0, 0x7f020396

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0f0087

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(Z)V

    const v0, 0x7f0b016a

    invoke-direct {p0, v0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->C:Z

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_5

    iput-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->C:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-virtual {p0, v5}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {}, Lcom/fimi/soul/utils/ad;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f020395

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->d(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    const v1, 0x7f0b04df

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->q:Landroid/widget/Button;

    invoke-virtual {v0, v4}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->M:Lcom/fimi/soul/entity/ErrorMode;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->isMiddleFault()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(Z)V

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b:Lcom/fimi/kernel/utils/v;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->G:Lcom/fimi/soul/biz/h/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/h/d;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/fimi/soul/biz/h/d;-><init>(Lcom/fimi/soul/biz/h/e;Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->G:Lcom/fimi/soul/biz/h/d;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->G:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->G:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->j:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ab()Lcom/fimi/soul/drone/droneconnection/connection/g$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/g$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f0b0169

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->m:Landroid/widget/TextView;

    const v1, 0x7f0b016b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->G:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->d()V

    return-void
.end method
