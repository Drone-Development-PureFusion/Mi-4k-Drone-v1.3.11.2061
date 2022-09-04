.class public Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/kernel/view/button/SwitchButton$a;
.implements Lcom/fimi/soul/drone/d$b;


# static fields
.field private static final H:I = 0x1

.field private static final I:I = 0x6

.field private static final J:I = 0x2

.field private static final K:I = 0x3

.field private static final L:I = 0x5

.field private static final M:I = 0x4

.field private static final N:I = 0x3e8

.field private static final O:F = 0.3f

.field private static final P:F = 1.0f

.field private static final Q:I = 0x12c

.field private static final R:I = 0xbb8

.field public static final b:Ljava/lang/String; = "newhand_mode"

.field public static final c:Ljava/lang/String; = "optical_flow_mode"

.field public static final d:Ljava/lang/String; = "force_attitude_mode"


# instance fields
.field private A:I

.field private B:F

.field private C:F

.field private D:F

.field private E:F

.field private F:Z

.field private G:Z

.field private S:Z

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Z

.field private X:Landroid/os/Handler;

.field a:Landroid/widget/TextView;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/widget/ImageView;

.field private t:Lcom/fimi/kernel/view/button/SwitchButton;

.field private u:Landroid/content/Context;

.field private v:Lcom/fimi/soul/module/setting/newhand/d;

.field private w:Lcom/fimi/soul/module/update/a/b;

.field private x:Z

.field private y:Lcom/fimi/soul/drone/a;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->F:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->S:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->T:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->U:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->V:Z

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->W:Z

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$1;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method private a()V
    .locals 8

    const v7, 0x7f0b026a

    const/4 v5, 0x1

    const/4 v6, 0x0

    const v0, 0x7f10012e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->e:Landroid/widget/RelativeLayout;

    const v0, 0x7f100136

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->h:Landroid/widget/RelativeLayout;

    const v0, 0x7f100132

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->f:Landroid/widget/RelativeLayout;

    const v0, 0x7f10013a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->g:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10012f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f100137

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f100133

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f100134

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f10013b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f100131

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f100139

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f10013d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f1003bf

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0b041d

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f10013e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const/16 v2, 0xa

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->i:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->j:Landroid/widget/TextView;

    aput-object v3, v2, v5

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->k:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->l:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    aput-object v0, v2, v3

    const/16 v0, 0x9

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f100130

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->q:Landroid/widget/ImageView;

    const v0, 0x7f100138

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->r:Landroid/widget/ImageView;

    const v0, 0x7f10013c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->s:Landroid/widget/ImageView;

    const v0, 0x7f100135

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mph"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const v0, 0x7f100493

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$3;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v6

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const v3, 0x7f0f00d3

    const v2, 0x7f020343

    if-eqz p1, :cond_0

    const v0, 0x3e99999a    # 0.3f

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->q:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->r:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v1, v0}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->s:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    :goto_1
    return-void

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Lcom/fimi/soul/module/setting/newhand/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    return p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->S:Z

    return v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->V:Z

    return v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Lcom/fimi/kernel/view/button/SwitchButton;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->T:Z

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->U:Z

    return v0
.end method

.method static synthetic l(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic m(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    return v0
.end method

.method static synthetic n(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    return v0
.end method


# virtual methods
.method public a(FZ)V
    .locals 9

    const v8, 0x7f0b041f

    const/high16 v5, 0x40c00000    # 6.0f

    const-wide/high16 v6, 0x4018000000000000L    # 6.0

    const v4, 0x7f0b0483

    const v3, 0x7f0b0482

    if-nez p2, :cond_0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/utils/v;->c(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    float-to-double v0, p1

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b0420

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_1
    float-to-double v0, p1

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    float-to-double v0, p1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b0421

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    cmpg-float v0, p1, v5

    if-gtz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b0420

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_4
    cmpl-float v0, p1, v5

    if-lez v0, :cond_5

    const/high16 v0, 0x41200000    # 10.0f

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b0421

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    float-to-int v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method public a(Landroid/view/View;Z)V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f100135

    if-ne v0, v1, :cond_0

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    if-eqz v0, :cond_2

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$10;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$10;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->a(ILcom/fimi/soul/module/setting/newhand/e;)V

    goto :goto_1
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    const-wide/high16 v6, 0x405e000000000000L    # 120.0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$4;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->b(ILcom/fimi/soul/module/setting/newhand/e;)V

    goto :goto_0

    :sswitch_1
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$5;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->c(ILcom/fimi/soul/module/setting/newhand/e;)V

    goto :goto_0

    :sswitch_2
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$6;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->a(ILcom/fimi/soul/module/setting/newhand/e;)V

    goto :goto_0

    :sswitch_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->x:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->A:I

    sget v1, Lcom/fimi/soul/module/setting/d;->g:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v2, 0x7f0b039e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v1, 0x7f0b0410

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->au()Lcom/fimi/soul/drone/i/a/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/a/f;->e()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v2, 0x7f0b035a

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_4
    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->am()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v2, 0x7f0b035b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_5
    new-instance v4, Lcom/fimi/soul/view/f$b;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/fimi/soul/view/f$b;-><init>(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_6

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_1
    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v1, :cond_8

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-float v1, v2

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_7

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    :goto_2
    iget-boolean v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v2, :cond_a

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    double-to-int v2, v2

    :goto_3
    iget-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v5, 0x7f0b019e

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_4
    iget-object v5, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v6, 0x7f0b03e4

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/fimi/soul/view/f$b;->c(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/fimi/soul/view/f$b;->b(I)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$b;->a(I)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v4, 0x7f0b0192

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f0076

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/fimi/soul/view/f$b;->d(I)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/f$b;->c(I)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b011d

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$9;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$9;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b01b9

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$8;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;

    invoke-direct {v1, p0, v2}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$7;-><init>(Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;I)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/SeekBar$OnSeekBarChangeListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$b;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0

    :cond_6
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v0, v0

    goto/16 :goto_1

    :cond_7
    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v1, v2

    goto/16 :goto_2

    :cond_8
    const/high16 v1, 0x42f00000    # 120.0f

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    cmpl-float v1, v1, v2

    if-lez v1, :cond_9

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    goto/16 :goto_2

    :cond_9
    const/16 v1, 0x78

    goto/16 :goto_2

    :cond_a
    const/16 v2, 0x1e

    goto/16 :goto_3

    :cond_b
    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v5, 0x7f0b019f

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_4

    :sswitch_data_0
    .sparse-switch
        0x7f10012e -> :sswitch_0
        0x7f100132 -> :sswitch_2
        0x7f100136 -> :sswitch_1
        0x7f10013a -> :sswitch_3
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/16 v1, 0x80

    const/4 v4, 0x0

    const/4 v3, 0x1

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04002f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->setContentView(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a()V

    iput-object p0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "newhand_mode"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_3

    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_0
    int-to-float v0, v0

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(FZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f0b019f

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "newhand_mode"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "force_attitude_mode"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-direct {p0, v3}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Z)V

    iput-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    :cond_2
    :goto_1
    return-void

    :cond_3
    const/4 v0, 0x6

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Z)V

    iput-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    iput-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->F:Z

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 9

    const/4 v5, 0x3

    const/4 v4, 0x2

    const v8, 0x7f0b019e

    const/4 v7, 0x0

    const/4 v6, 0x1

    sget-object v0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->d()B

    move-result v0

    const/16 v1, 0x33

    if-ne v0, v1, :cond_9

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->f()B

    move-result v0

    if-ne v0, v4, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->i()B

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v1, 0x7f0b040f

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    float-to-int v0, v0

    const/16 v1, 0x2710

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v6, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x461c4000    # 10000.0f

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v7, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0, v8}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    const/high16 v0, 0x43fa0000    # 500.0f

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    if-ne v0, v5, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_2
    invoke-virtual {p0, v0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(FZ)V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    goto :goto_2

    :cond_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-float v0, v0

    :goto_3
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/utils/v;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_4
    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_6
    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b019f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v1, 0x7f0b040e

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->d()B

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->f()B

    move-result v0

    if-eq v0, v4, :cond_a

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->f()B

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    :cond_a
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_e

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->V:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_b

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/utils/v;->a(Ljava/lang/String;)V

    :cond_b
    float-to-int v0, v0

    const/16 v1, 0x2710

    if-ne v0, v1, :cond_c

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v6, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x461c4000    # 10000.0f

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v7, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p0, v8}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_5
    const/high16 v0, 0x43fa0000    # 500.0f

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    goto/16 :goto_0

    :cond_d
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_e
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    if-ne v0, v5, :cond_12

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->T:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_f

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_6
    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_10

    invoke-virtual {p0, v0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(FZ)V

    goto/16 :goto_0

    :cond_f
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    goto :goto_6

    :cond_10
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_11

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    :goto_7
    int-to-float v0, v0

    invoke-virtual {p0, v0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(FZ)V

    goto/16 :goto_0

    :cond_11
    const/16 v0, 0xa

    goto :goto_7

    :cond_12
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->g()B

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->U:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_15

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_13

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-float v0, v0

    :goto_8
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aw()Lcom/fimi/soul/drone/i/al;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/al;->h()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/utils/v;->d(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_13
    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    goto :goto_8

    :cond_14
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b019f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_15
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_16

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-float v0, v0

    :goto_9
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    const-string v1, "10"

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/utils/v;->d(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_17

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_16
    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    goto :goto_9

    :cond_17
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b019f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->b()B

    move-result v0

    sget v1, Lcom/fimi/soul/module/setting/d;->d:I

    if-ne v0, v1, :cond_1b

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->d()B

    move-result v0

    sget v1, Lcom/fimi/soul/module/setting/d;->f:I

    if-ne v0, v1, :cond_1a

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v1, 0x7f0b040f

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->c()F

    move-result v0

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/utils/v;->b(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v1, :cond_18

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    :cond_18
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_a
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_19
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b019f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    :cond_1a
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v1, 0x7f0b040e

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_a

    :cond_1b
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->b()B

    move-result v0

    sget v1, Lcom/fimi/soul/module/setting/d;->e:I

    if-ne v0, v1, :cond_0

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->S:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->d()B

    move-result v0

    sget v1, Lcom/fimi/soul/module/setting/d;->f:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/i/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/i/o;->c()F

    move-result v1

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/utils/v;->b(Ljava/lang/String;)V

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    if-ge v0, v2, :cond_1c

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b00a8

    new-array v4, v4, [Ljava/lang/Object;

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v7

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_b
    aput-object v0, v4, v6

    invoke-virtual {p0, v3, v4}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v2, v0, v3}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_1c
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_1e

    float-to-double v0, v1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_c
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :cond_1d
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v5, 0x7f0b019f

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_b

    :cond_1e
    move v0, v1

    goto :goto_c

    :cond_1f
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    const v3, 0x7f0b019f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "newhand_mode"

    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "force_attitude_mode"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_22

    :cond_20
    invoke-direct {p0, v6}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Z)V

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    :goto_d
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->F:Z

    if-eqz v0, :cond_0

    iput-boolean v7, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->F:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->x:Z

    if-nez v0, :cond_21

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->A:I

    sget v1, Lcom/fimi/soul/module/setting/d;->g:I

    if-lt v0, v1, :cond_0

    :cond_21
    invoke-static {p2}, Lcom/fimi/soul/module/setting/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/setting/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/d;->a()V

    goto/16 :goto_0

    :cond_22
    invoke-direct {p0, v7}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Z)V

    iput-boolean v7, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    goto :goto_d

    :cond_23
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v7, v7}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "ft"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_e
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-direct {p0, v6}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(Z)V

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->z:Z

    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->F:Z

    goto/16 :goto_0

    :cond_24
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_e

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public onStart()V
    .locals 9

    const/4 v8, 0x5

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v7, 0x0

    const/4 v6, 0x1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_firmware_cache"

    const-class v2, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->w:Lcom/fimi/soul/module/update/a/b;

    invoke-static {}, Lcom/fimi/soul/biz/b/d;->a()Lcom/fimi/soul/biz/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/b/d;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->x:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/c;-><init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->w:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->w:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->a()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->A:I

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->v:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x4b0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x4b0

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x4b0

    invoke-virtual {v0, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->x:Z

    if-nez v0, :cond_2

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->A:I

    sget v1, Lcom/fimi/soul/module/setting/d;->g:I

    if-lt v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/setting/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/d;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x384

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const-wide/16 v2, 0x4b0

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iput-boolean v7, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->S:Z

    :goto_0
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int v0, v0

    int-to-float v0, v0

    :goto_1
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    invoke-virtual {p0, v0, v6}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->a(FZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_2
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f0b019e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_7

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    double-to-float v0, v0

    :goto_4
    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f0b019e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->E:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v1, 0x2710

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v6, v7}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_6
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->y:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->X:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_7
    return-void

    :cond_3
    iput-boolean v6, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->S:Z

    goto/16 :goto_0

    :cond_4
    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->C:F

    goto/16 :goto_1

    :cond_5
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto/16 :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->D:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f0b019f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_3

    :cond_7
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto/16 :goto_4

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->B:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f0b019f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_9
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v7, v7}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0b019e

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_a
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->o:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->m:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->n:Landroid/widget/TextView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->t:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v7, v7}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->G:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const v4, 0x7f0b019e

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_7

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->p:Landroid/widget/TextView;

    const v1, 0x7f0b026a

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "500m"

    aput-object v3, v2, v7

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_7
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStop()V

    return-void
.end method
