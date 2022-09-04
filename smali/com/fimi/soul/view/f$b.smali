.class public Lcom/fimi/soul/view/f$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/view/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field private static final q:I = 0x0

.field private static final r:I = 0x73


# instance fields
.field a:Z

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Z

.field private n:Landroid/content/DialogInterface$OnClickListener;

.field private o:Landroid/content/DialogInterface$OnClickListener;

.field private p:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/fimi/soul/view/f$b;->g:I

    iput v1, p0, Lcom/fimi/soul/view/f$b;->h:I

    iput v1, p0, Lcom/fimi/soul/view/f$b;->i:I

    iput-boolean v1, p0, Lcom/fimi/soul/view/f$b;->a:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/view/f$b;->l:Z

    iput-boolean v1, p0, Lcom/fimi/soul/view/f$b;->m:Z

    iput-boolean v1, p0, Lcom/fimi/soul/view/f$b;->s:Z

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->p()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/view/f$b;->a:Z

    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 2

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/view/f$b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/view/f$b;->m:Z

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/view/f$b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/view/f$b;->l:Z

    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/view/f$b;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/view/f$b;->i:I

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/view/f$b;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/view/f$b;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/view/f$b;)Landroid/widget/SeekBar$OnSeekBarChangeListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b;->p:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/view/f$b;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b;->n:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/view/f$b;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$b;->o:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/f$b;->i:I

    return-object p0
.end method

.method public a(Landroid/widget/SeekBar$OnSeekBarChangeListener;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->p:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p2, p0, Lcom/fimi/soul/view/f$b;->o:Landroid/content/DialogInterface$OnClickListener;

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/view/f$b;->m:Z

    return-object p0
.end method

.method public a()Lcom/fimi/soul/view/f;
    .locals 18

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const-string v3, "layout_inflater"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/LayoutInflater;

    new-instance v11, Lcom/fimi/soul/view/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v4, 0x7f0c0050

    invoke-direct {v11, v3, v4}, Lcom/fimi/soul/view/f;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f0400ff

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    const v2, 0x7f100257

    invoke-virtual {v12, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f100278

    invoke-virtual {v12, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const v4, 0x7f100277

    invoke-virtual {v12, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const v5, 0x7f1003b8

    invoke-virtual {v12, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/SeekBar;

    const v6, 0x7f1003b6

    invoke-virtual {v12, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v7, 0x7f1003b7

    invoke-virtual {v12, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    const v8, 0x7f1004f1

    invoke-virtual {v12, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    const v9, 0x7f1004f0

    invoke-virtual {v12, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/fimi/soul/view/f$b;->k:Ljava/lang/String;

    if-eqz v10, :cond_0

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/fimi/soul/view/f$b;->k:Ljava/lang/String;

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const v10, 0x7f1003b5

    invoke-virtual {v12, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/RelativeLayout;

    new-instance v13, Lcom/fimi/soul/view/f$b$1;

    move-object/from16 v0, p0

    invoke-direct {v13, v0, v5}, Lcom/fimi/soul/view/f$b$1;-><init>(Lcom/fimi/soul/view/f$b;Landroid/widget/SeekBar;)V

    invoke-virtual {v10, v13}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->h:I

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    sub-int/2addr v10, v13

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setMax(I)V

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->l:Z

    if-eqz v10, :cond_7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->h:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    sub-int/2addr v10, v13

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    :goto_0
    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->m:Z

    if-eqz v10, :cond_15

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->l:Z

    if-eqz v10, :cond_f

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->a:Z

    if-eqz v10, :cond_c

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-gt v10, v13, :cond_a

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0420

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    new-instance v10, Lcom/fimi/soul/view/f$b$2;

    move-object/from16 v0, p0

    invoke-direct {v10, v0, v8}, Lcom/fimi/soul/view/f$b$2;-><init>(Lcom/fimi/soul/view/f$b;Landroid/widget/TextView;)V

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    if-eqz v5, :cond_1

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->n:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v5, :cond_2

    new-instance v5, Lcom/fimi/soul/view/f$b$3;

    move-object/from16 v0, p0

    invoke-direct {v5, v0, v11}, Lcom/fimi/soul/view/f$b$3;-><init>(Lcom/fimi/soul/view/f$b;Lcom/fimi/soul/view/f;)V

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    move-object/from16 v0, p0

    iget v5, v0, Lcom/fimi/soul/view/f$b;->e:I

    const/4 v10, -0x1

    if-eq v5, v10, :cond_3

    move-object/from16 v0, p0

    iget v5, v0, Lcom/fimi/soul/view/f$b;->e:I

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setTextColor(I)V

    :cond_3
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->f:Ljava/lang/String;

    if-eqz v5, :cond_4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->o:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v5, :cond_5

    new-instance v5, Lcom/fimi/soul/view/f$b$4;

    move-object/from16 v0, p0

    invoke-direct {v5, v0, v11}, Lcom/fimi/soul/view/f$b$4;-><init>(Lcom/fimi/soul/view/f$b;Lcom/fimi/soul/view/f;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->c:Ljava/lang/String;

    if-eqz v5, :cond_6

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->c:Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    const/4 v10, 0x4

    new-array v10, v10, [Landroid/view/View;

    const/4 v13, 0x0

    aput-object v2, v10, v13

    const/4 v13, 0x1

    aput-object v3, v10, v13

    const/4 v3, 0x2

    aput-object v4, v10, v3

    const/4 v3, 0x3

    aput-object v9, v10, v3

    invoke-static {v5, v10}, Lcom/fimi/soul/utils/au;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/view/View;

    const/4 v5, 0x0

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v7, v4, v5

    const/4 v5, 0x2

    aput-object v8, v4, v5

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/au;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v9}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/TextView;)V

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/fimi/soul/view/f$b;->s:Z

    invoke-virtual {v11, v2}, Lcom/fimi/soul/view/f;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v11, v12}, Lcom/fimi/soul/view/f;->setContentView(Landroid/view/View;)V

    invoke-virtual {v11}, Lcom/fimi/soul/view/f;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v2

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-static {v5}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v5

    int-to-float v5, v5

    cmpl-float v2, v2, v5

    if-lez v2, :cond_17

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v2

    :goto_2
    const/high16 v5, 0x44830000    # 1048.0f

    mul-float/2addr v2, v5

    const/high16 v5, 0x44f00000    # 1920.0f

    div-float/2addr v2, v5

    float-to-int v2, v2

    iput v2, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {v3, v4}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    invoke-virtual {v11}, Lcom/fimi/soul/view/f;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    return-object v11

    :cond_7
    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->a:Z

    if-eqz v10, :cond_9

    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->m:Z

    if-eqz v10, :cond_8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    int-to-double v14, v13

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->h:I

    int-to-double v14, v13

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    int-to-double v14, v10

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-int v10, v14

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    sub-int/2addr v10, v13

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0

    :cond_8
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    int-to-double v14, v13

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->h:I

    int-to-double v14, v13

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    int-to-double v14, v10

    invoke-static {v14, v15}, Lcom/fimi/kernel/utils/t;->e(D)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-int v10, v14

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    sub-int/2addr v10, v13

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0

    :cond_9
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->h:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->i:I

    sub-int/2addr v10, v13

    invoke-virtual {v5, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    goto/16 :goto_0

    :cond_a
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-le v10, v13, :cond_b

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/16 v13, 0xa

    if-gt v10, v13, :cond_b

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0421

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_b
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b041f

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_c
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-gt v10, v13, :cond_d

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0420

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_d
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-le v10, v13, :cond_e

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/16 v13, 0xa

    if-gt v10, v13, :cond_e

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0421

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_e
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b041f

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_f
    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->a:Z

    if-eqz v10, :cond_12

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    int-to-double v14, v10

    const-wide/high16 v16, 0x4018000000000000L    # 6.0

    invoke-static/range {v16 .. v17}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v16

    cmpg-double v10, v14, v16

    if-gtz v10, :cond_10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0420

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_10
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    int-to-double v14, v10

    const-wide/high16 v16, 0x4018000000000000L    # 6.0

    invoke-static/range {v16 .. v17}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v16

    cmpl-double v10, v14, v16

    if-lez v10, :cond_11

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    int-to-double v14, v10

    const-wide/high16 v16, 0x4024000000000000L    # 10.0

    invoke-static/range {v16 .. v17}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v16

    cmpg-double v10, v14, v16

    if-gtz v10, :cond_11

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0421

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_11
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0483

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b041f

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_12
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-gt v10, v13, :cond_13

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0420

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_13
    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/4 v13, 0x6

    if-le v10, v13, :cond_14

    move-object/from16 v0, p0

    iget v10, v0, Lcom/fimi/soul/view/f$b;->g:I

    const/16 v13, 0xa

    if-gt v10, v13, :cond_14

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0421

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_14
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b0482

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    const v14, 0x7f0b041f

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_15
    move-object/from16 v0, p0

    iget-boolean v10, v0, Lcom/fimi/soul/view/f$b;->l:Z

    if-eqz v10, :cond_16

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_16
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget v13, v0, Lcom/fimi/soul/view/f$b;->g:I

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/fimi/soul/view/f$b;->j:Ljava/lang/String;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_17
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/view/f$b;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v2

    int-to-float v2, v2

    goto/16 :goto_2
.end method

.method public b(I)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/f$b;->h:I

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p2, p0, Lcom/fimi/soul/view/f$b;->n:Landroid/content/DialogInterface$OnClickListener;

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public b(Z)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/view/f$b;->s:Z

    return-object p0
.end method

.method public c(I)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/f$b;->g:I

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(Z)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/view/f$b;->l:Z

    return-object p0
.end method

.method public d(I)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/f$b;->e:I

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$b;->f:Ljava/lang/String;

    return-object p0
.end method
