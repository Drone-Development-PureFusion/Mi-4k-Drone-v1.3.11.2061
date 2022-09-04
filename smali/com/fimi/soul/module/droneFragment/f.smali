.class public Lcom/fimi/soul/module/droneFragment/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneFragment/f$a;
    }
.end annotation


# static fields
.field private static final ah:Ljava/lang/String; = "PoiOperaView"


# instance fields
.field private A:Landroid/widget/Button;

.field private B:Landroid/widget/Button;

.field private C:Landroid/widget/PopupWindow;

.field private D:[Ljava/lang/String;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:Z

.field private I:Lcom/fimi/soul/drone/a;

.field private J:I

.field private K:Lcom/google/android/gms/maps/model/c;

.field private L:Lcom/fimi/soul/biz/j/d;

.field private M:Lcom/google/android/gms/maps/model/g;

.field private N:Lcom/google/android/gms/maps/model/g;

.field private O:Lcom/google/android/gms/maps/c;

.field private P:Lcom/google/android/gms/maps/model/i;

.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:I

.field private X:I

.field private Y:I

.field private Z:Ljava/lang/String;

.field a:[Landroid/widget/EditText;

.field private aa:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private ab:I

.field private ac:Z

.field private ad:I

.field private ae:I

.field private af:I

.field private ag:I

.field private ai:F

.field private aj:F

.field b:Landroid/view/inputmethod/InputMethodManager;

.field c:Ljava/lang/String;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Landroid/os/Handler;

.field private h:Lcom/fimi/soul/view/MyEditView;

.field private i:Lcom/fimi/soul/view/MyEditView;

.field private j:Lcom/fimi/soul/view/MyEditView;

.field private k:Lcom/fimi/soul/view/MyEditView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private u:Landroid/widget/RadioGroup;

.field private v:Landroid/content/Context;

.field private w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private x:Landroid/widget/RadioButton;

.field private y:Landroid/widget/RadioButton;

.field private z:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
    .locals 10

    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    const/16 v0, 0x78

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    iput v6, p0, Lcom/fimi/soul/module/droneFragment/f;->U:I

    const/16 v0, 0x1c2

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->W:I

    const/16 v0, 0x168

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->X:I

    iput v1, p0, Lcom/fimi/soul/module/droneFragment/f;->Y:I

    const/16 v0, 0x5dc

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ab:I

    iput v6, p0, Lcom/fimi/soul/module/droneFragment/f;->ad:I

    iput v7, p0, Lcom/fimi/soul/module/droneFragment/f;->ae:I

    iput v8, p0, Lcom/fimi/soul/module/droneFragment/f;->af:I

    iput v9, p0, Lcom/fimi/soul/module/droneFragment/f;->ag:I

    new-instance v0, Lcom/fimi/soul/module/droneFragment/f$6;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/f$6;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/os/Handler;

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->Q:I

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0e000a

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    const v0, 0x7f1000c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Landroid/widget/TextView;

    const v0, 0x7f1000c9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Landroid/widget/TextView;

    const v0, 0x7f100301

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/TextView;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    const v0, 0x7f100306

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f100304

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Landroid/widget/TextView;

    const v0, 0x7f100305

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->X:I

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$1;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f10030f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10030d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Landroid/widget/TextView;

    const v0, 0x7f10030e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->A:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->A:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f100308

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10030a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    const v0, 0x7f10030b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    const v0, 0x7f10030c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->y:Landroid/widget/RadioButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$9;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$9;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    const v2, 0x7f10030b

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->check(I)V

    const v0, 0x7f1002fb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f1002ff

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f100300

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f100303

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f1002fe

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    const v0, 0x7f1002c3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    const v0, 0x7f100302

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_0
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_1
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    int-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v4

    double-to-int v0, v4

    :goto_2
    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$10;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$10;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$11;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$11;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$12;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$12;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v2, v9, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v8

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Landroid/widget/TextView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Landroid/widget/TextView;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    aput-object v3, v2, v8

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->y:Landroid/widget/RadioButton;

    aput-object v3, v2, v9

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    new-array v0, v9, [Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v8

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->a:[Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->a:[Landroid/widget/EditText;

    array-length v3, v2

    move v0, v1

    :goto_3
    if-ge v0, v3, :cond_3

    aget-object v4, v2, v0

    invoke-virtual {v4, v7}, Landroid/widget/EditText;->setInputType(I)V

    invoke-virtual {v4}, Landroid/widget/EditText;->clearFocus()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_0
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    goto/16 :goto_0

    :cond_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    goto/16 :goto_1

    :cond_2
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$13;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$13;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$14;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$14;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$15;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$15;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$16;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$16;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$2;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$3;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$4;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$5;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-array v0, v9, [Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v7

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v8

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->aa:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->aa:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    array-length v3, v2

    move v0, v1

    :goto_4
    if-ge v0, v3, :cond_4

    aget-object v1, v2, v0

    invoke-virtual {v1, p0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    return-void
.end method

.method static synthetic A(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ab:I

    return v0
.end method

.method static synthetic B(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ad:I

    return v0
.end method

.method static synthetic C(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->af:I

    return v0
.end method

.method static synthetic D(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ag:I

    return v0
.end method

.method static synthetic E(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic F(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f;->Z:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/widget/EditText;)V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    if-ne v2, p1, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v3}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v3

    iget-boolean v4, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v4, :cond_1

    :goto_0
    sub-int v0, v3, v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    if-ne v2, p1, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v2}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v2

    const/4 v3, 0x3

    if-le v2, v3, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    if-ne v2, p1, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v3}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v3

    iget-boolean v4, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v4, :cond_4

    :goto_2
    sub-int v0, v3, v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setSelection(I)V

    goto :goto_1
.end method

.method private a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V
    .locals 3

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    if-nez v1, :cond_2

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const v1, 0x7f0202b4

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    const v1, 0x461c4000    # 10000.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v2, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->q()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    :cond_0
    :goto_1
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->l()V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    neg-int v0, v0

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->q()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 8

    const/4 v6, 0x1

    :try_start_0
    invoke-virtual {p1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-float v0, v0

    int-to-float v3, p2

    cmpl-float v3, v0, v3

    if-lez v3, :cond_3

    int-to-float v0, p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    :goto_0
    invoke-virtual {v1, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    float-to-int v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p4, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    float-to-int v0, v0

    int-to-short v0, v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setStart_point_agle(S)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/f;->a(Landroid/widget/EditText;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setCursorVisible(Z)V

    :goto_2
    return-void

    :cond_3
    int-to-float v3, p3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_0

    int-to-float v0, p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->Z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/f;->a(Landroid/widget/EditText;)V

    invoke-virtual {p1, v6}, Lcom/fimi/soul/view/MyEditView;->setCursorVisible(Z)V

    goto :goto_2

    :cond_4
    :try_start_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_c

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_7

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    float-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v4

    double-to-float v0, v4

    :goto_3
    int-to-float v3, p2

    cmpl-float v3, v0, v3

    if-lez v3, :cond_8

    int-to-float v0, p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_5

    int-to-double v4, p2

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int p2, v4

    :cond_5
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move v7, v0

    move-object v0, v1

    move v1, v7

    :goto_4
    invoke-virtual {v0, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_b

    float-to-double v4, v1

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v0, v4

    :goto_5
    invoke-virtual {p4, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(F)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()V

    goto/16 :goto_1

    :cond_7
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_3

    :cond_8
    int-to-float v3, p3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_a

    int-to-float v0, p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_9

    int-to-double v4, p3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int p3, v4

    :cond_9
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    move v7, v0

    move-object v0, v1

    move v1, v7

    goto :goto_4

    :cond_b
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_5

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_15

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_10

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    float-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v4

    double-to-float v0, v4

    :goto_6
    int-to-float v3, p2

    cmpl-float v3, v0, v3

    if-lez v3, :cond_11

    int-to-float v0, p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_d

    int-to-double v4, p2

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int p2, v4

    :cond_d
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move v7, v0

    move-object v0, v1

    move v1, v7

    :goto_7
    invoke-virtual {v0, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_e
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_14

    float-to-double v4, v1

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v0, v4

    :goto_8
    invoke-virtual {p4, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(F)V

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getDrawableRes()I

    move-result v3

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    const/4 v4, 0x1

    invoke-static {v1, v3, v2, v4}, Lcom/fimi/soul/biz/j/j;->a(Landroid/content/Context;IFZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    goto/16 :goto_1

    :cond_10
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto/16 :goto_6

    :cond_11
    int-to-float v3, p3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_13

    int-to-float v0, p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_12

    int-to-double v4, p3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int p3, v4

    :cond_12
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    move v7, v0

    move-object v0, v1

    move v1, v7

    goto/16 :goto_7

    :cond_14
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto :goto_8

    :cond_15
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_2

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_18

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    float-to-double v4, v0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v4

    double-to-float v0, v4

    :goto_9
    int-to-float v3, p2

    cmpl-float v3, v0, v3

    if-lez v3, :cond_19

    int-to-float v0, p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_16

    int-to-double v4, p2

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int p2, v4

    :cond_16
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move v7, v0

    move-object v0, v1

    move v1, v7

    :goto_a
    invoke-virtual {v0, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_17

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_17
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_1c

    float-to-double v4, v1

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v0, v4

    :goto_b
    invoke-virtual {p4, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(F)V

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()V

    goto/16 :goto_1

    :cond_18
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    goto :goto_9

    :cond_19
    int-to-float v3, p3

    cmpg-float v3, v0, v3

    if-gez v3, :cond_1b

    int-to-float v0, p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v3, :cond_1a

    int-to-double v4, p3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int p3, v4

    :cond_1a
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_1b
    move v7, v0

    move-object v0, v1

    move v1, v7

    goto :goto_a

    :cond_1c
    invoke-static {v1}, Ljava/lang/Math;->round(F)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_b
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Z

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/j/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "[^0-9]"

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

.method private b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V
    .locals 4

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    add-int/lit8 v0, v0, 0x5a

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const v1, 0x7f0202ca

    invoke-static {v1}, Lcom/fimi/soul/biz/j/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    const v1, 0x461c4000    # 10000.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    if-eqz p3, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    add-int/lit16 v1, v1, 0xb4

    int-to-float v1, v1

    invoke-virtual {p2}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->d:F

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v3, v3}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    :cond_0
    :goto_2
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    rsub-int v0, v0, 0x10e

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    neg-int v1, v1

    add-int/lit16 v1, v1, -0xb4

    int-to-float v1, v1

    invoke-virtual {p2}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->d:F

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    add-int/lit16 v1, v1, 0xb4

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->q()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    neg-int v1, v1

    add-int/lit16 v1, v1, -0xb4

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->q()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->E:Z

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Z

    return p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->E:Z

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Z

    return p1
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    return v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    return v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Z

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->U:I

    return v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method private l()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    new-instance v2, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v5}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/PolylineOptions;->a([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0f012a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method static synthetic l(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()V

    return-void
.end method

.method private m()D
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->b()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/i/ah;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/i/ah;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/i/aq;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/i/aq;->f()D

    move-result-wide v2

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

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

.method static synthetic m(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic n(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->W:I

    return v0
.end method

.method private n()V
    .locals 8

    const v1, 0x7f02006d

    const/4 v7, 0x0

    const/high16 v6, -0x3f000000    # -8.0f

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0400be

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f100425

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$a;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    invoke-direct {v2, p0, v3, v4}, Lcom/fimi/soul/module/droneFragment/f$a;-><init>(Lcom/fimi/soul/module/droneFragment/f;Landroid/content/Context;[Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setSelection(I)V

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$7;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$7;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v2, Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v3}, Landroid/widget/Button;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/widget/Button;->getHeight()I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    invoke-direct {v2, v0, v3, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/fimi/soul/utils/i;->b(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v7, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/f$8;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/f$8;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    const v1, 0x7f02006c

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/fimi/soul/utils/i;->b(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v7, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    goto :goto_0
.end method

.method static synthetic o(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method private o()V
    .locals 7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->getWidth()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v3

    if-eqz v3, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/h;->a(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v4

    iget v5, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v6, v1, 0x2

    if-le v5, v6, :cond_0

    new-instance v5, Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v6, v1, 0x3

    sub-int/2addr v4, v6

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v4

    div-int/lit8 v2, v2, 0x2

    invoke-direct {v5, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    return-void
.end method

.method private p()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v0

    float-to-double v0, v0

    div-double v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    const v3, 0x7f0b0485

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method static synthetic p(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Z

    return v0
.end method

.method private declared-synchronized q()F
    .locals 2

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v0, v1, Lcom/google/android/gms/maps/model/CameraPosition;->d:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic q(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->J:I

    return v0
.end method

.method static synthetic r(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic s(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    return v0
.end method

.method static synthetic t(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    return v0
.end method

.method static synthetic u(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic v(Lcom/fimi/soul/module/droneFragment/f;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->Z:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic w(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->X:I

    return v0
.end method

.method static synthetic x(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->Y:I

    return v0
.end method

.method static synthetic y(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic z(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ae:I

    return v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    invoke-static {v0, p2, p3, v2, v3}, Lcom/fimi/soul/utils/ae;->a(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    const v1, 0x7f0b0414

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->f()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v5}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v6}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x7f10030b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Z)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    invoke-virtual {v1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    if-nez p1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v3}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v3}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    goto :goto_0

    :pswitch_1
    if-nez p1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f10030b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public b(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->O:Lcom/google/android/gms/maps/c;

    new-instance v3, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    int-to-double v4, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f012a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:Lcom/fimi/soul/biz/j/d;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/d;->a(Lcom/google/android/gms/maps/model/c;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-double v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Landroid/widget/Button;

    const v1, 0x7f02006c

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    :cond_4
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 4

    const v3, 0x7f0f004c

    const v2, 0x7f0f001e

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->y:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->y:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    goto :goto_0
.end method

.method public g()V
    .locals 0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->c()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->o()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->h()V

    return-void
.end method

.method public h()V
    .locals 10

    const v9, 0x7f0b019f

    const v8, 0x7f0b019e

    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->m()D

    move-result-wide v4

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    int-to-double v0, v0

    sub-double/2addr v0, v4

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->W:I

    int-to-double v6, v3

    cmpg-double v0, v0, v6

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    const v1, 0x7f0b0126

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_4

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    float-to-double v6, v0

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v0, v6

    :goto_1
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_5

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->U:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    float-to-double v6, v0

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v0, v6

    :goto_2
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_6

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->W:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    float-to-double v6, v0

    invoke-static {v6, v7}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v0, v6

    :goto_3
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    int-to-double v0, v0

    sub-double/2addr v0, v4

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v0

    :goto_4
    double-to-int v0, v0

    invoke-virtual {v3, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Lcom/fimi/soul/view/MyEditView;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v3

    float-to-double v4, v3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Lcom/fimi/soul/view/MyEditView;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v3

    float-to-double v4, v3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v4

    double-to-int v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    const v4, 0x7f0b0483

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Lcom/fimi/soul/view/MyEditView;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v3

    float-to-double v4, v3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\u00b0"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:Landroid/widget/RadioButton;

    invoke-virtual {v1}, Landroid/widget/RadioButton;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    :cond_3
    :goto_8
    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->l()V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->U:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto/16 :goto_2

    :cond_6
    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v0

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/f;->W:I

    int-to-float v3, v3

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    goto/16 :goto_3

    :cond_7
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    int-to-double v0, v0

    sub-double/2addr v0, v4

    goto/16 :goto_4

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v3, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    const v4, 0x7f0b0482

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_6

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/content/Context;

    invoke-virtual {v3, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_7

    :cond_b
    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/RadioButton;

    invoke-virtual {v1}, Landroid/widget/RadioButton;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->check(I)V

    goto/16 :goto_8
.end method

.method public declared-synchronized i()V
    .locals 6

    const-wide/16 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/fimi/soul/biz/j/d;->p()Lcom/fimi/soul/biz/j/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/j/d;->f()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/ae;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/am;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/am;->a()D

    move-result-wide v4

    double-to-int v3, v4

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(F)V

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v2, v4, v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/RadioGroup;

    invoke-virtual {v4}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :goto_0
    double-to-int v3, v0

    int-to-short v3, v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setStart_point_agle(S)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Lcom/fimi/soul/view/MyEditView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/fimi/soul/utils/ae;->d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->X:I

    int-to-double v0, v0

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/ae;->d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v4

    sub-double/2addr v0, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x7f10030b
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/c;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->M:Lcom/google/android/gms/maps/model/g;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->N:Lcom/google/android/gms/maps/model/g;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->P:Lcom/google/android/gms/maps/model/i;

    :cond_3
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->n()V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bj:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->a()V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bA:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    int-to-double v2, v0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    double-to-int v0, v2

    :goto_1
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    int-to-double v2, v0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v2

    double-to-int v0, v2

    :goto_2
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ac:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    int-to-double v2, v0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    double-to-int v0, v2

    :goto_3
    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:I

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f100308 -> :sswitch_0
        0x7f10030e -> :sswitch_1
        0x7f10030f -> :sswitch_2
    .end sparse-switch
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return v3

    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->ai:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->aj:F

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/f;->ai:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->aj:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
