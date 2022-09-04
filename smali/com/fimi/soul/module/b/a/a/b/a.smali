.class public Lcom/fimi/soul/module/b/a/a/b/a;
.super Lcom/fimi/soul/module/b/a/a/b;


# static fields
.field private static final q:I = 0x500

.field private static final r:I = 0x60

.field private static final s:I = 0x4b

.field private static final t:I = 0x28

.field private static final u:I = 0x12c

.field private static final v:I = 0x46


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/a/a/b;-><init>(Lcom/fimi/soul/module/b/e;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/b/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->o:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method private a(Landroid/widget/LinearLayout;F)V
    .locals 8

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v6, -0x1

    const/4 v5, 0x0

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x5

    invoke-virtual {v0, v5, v5, v5, v1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    const/high16 v1, 0x42960000    # 75.0f

    mul-float/2addr v1, p2

    float-to-int v1, v1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v6, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v1, 0x42200000    # 40.0f

    mul-float/2addr v1, p2

    float-to-int v1, v1

    new-instance v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    const v3, -0xc4c4c5

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    const/4 v3, 0x2

    const/high16 v4, 0x41a80000    # 21.0f

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    const/16 v3, 0x55

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {p0, v2, v5, v5, v5}, Lcom/fimi/soul/module/b/a/a/b/a;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    invoke-virtual {v2, v1, v5, v1, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v7, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v0, -0x333334

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    cmpl-float v0, p2, v7

    if-lez v0, :cond_0

    float-to-int v0, p2

    :goto_0
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v6, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a(Landroid/widget/RelativeLayout;F)V
    .locals 9

    const/16 v8, 0x11

    const/4 v7, 0x2

    const/4 v6, -0x1

    const/4 v5, -0x2

    const/4 v4, 0x0

    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    const v1, -0xc4c4c5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v7, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    const-string v1, "ssdk_oks_cancel"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const/high16 v0, 0x42200000    # 40.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    invoke-virtual {v1, v0, v4, v0, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v2, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->g:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v2, -0xc4c4c5

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x41b00000    # 22.0f

    invoke-virtual {v1, v7, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    const-string v3, "ssdk_oks_multi_share"

    invoke-static {v2, v3}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p1, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    const v2, -0x92ef

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v1, v7, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    const-string v2, "ssdk_oks_share"

    invoke-static {v1, v2}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v0, v4, v0, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private a(Lcom/mob/tools/gui/AsyncImageView;)V
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform$ShareParams;->getImagePath()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v0}, Lcn/sharesdk/framework/Platform$ShareParams;->getImageArray()[Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    iget-object v4, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-static {v2}, Lcom/mob/tools/utils/BitmapHelper;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    :goto_0
    if-eqz v0, :cond_2

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->o:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Lcom/mob/tools/gui/AsyncImageView;->setBitmap(Landroid/graphics/Bitmap;)V

    :cond_1
    :goto_1
    if-eqz v0, :cond_3

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->o:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Lcom/mob/tools/gui/AsyncImageView;->setBitmap(Landroid/graphics/Bitmap;)V

    :goto_2
    return-void

    :catch_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_1

    array-length v4, v3

    if-lez v4, :cond_1

    aget-object v4, v3, v5

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Ljava/io/File;

    aget-object v3, v3, v5

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    :try_start_1
    invoke-static {v2}, Lcom/mob/tools/utils/BitmapHelper;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    goto :goto_1

    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1, v1, v5}, Lcom/mob/tools/gui/AsyncImageView;->execute(Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2
.end method

.method private b(Landroid/widget/LinearLayout;F)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    float-to-int v0, p2

    :goto_0
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v0, Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x29000000

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x14000000

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x7000000

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b(Landroid/widget/RelativeLayout;F)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, -0x1

    const/4 v5, -0x2

    new-instance v0, Landroid/widget/ScrollView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->e:Landroid/widget/ScrollView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->e:Landroid/widget/ScrollView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v6, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->e:Landroid/widget/ScrollView;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v6, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    const/high16 v1, 0x42200000    # 40.0f

    mul-float/2addr v1, p2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/widget/EditText;->setPadding(IIII)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    const v3, -0xc4c4c5

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    const/4 v3, 0x2

    const/high16 v4, 0x41a80000    # 21.0f

    invoke-virtual {v2, v3, v4}, Landroid/widget/EditText;->setTextSize(IF)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->b:Lcn/sharesdk/framework/Platform$ShareParams;

    invoke-virtual {v3}, Lcn/sharesdk/framework/Platform$ShareParams;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    invoke-virtual {v0, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->f:Landroid/widget/EditText;

    invoke-virtual {v2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance v2, Landroid/widget/RelativeLayout;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    const v3, -0xcececf

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    const/high16 v2, 0x43960000    # 300.0f

    mul-float/2addr v2, p2

    float-to-int v2, v2

    const/high16 v3, 0x428c0000    # 70.0f

    mul-float/2addr v3, p2

    float-to-int v3, v3

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    iput v1, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/fimi/soul/module/b/a/a/b/a$1;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/module/b/a/a/b/a$1;-><init>(Lcom/fimi/soul/module/b/a/a/b/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->j:Lcom/mob/tools/gui/AsyncImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->j:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {v0, v7}, Lcom/mob/tools/gui/AsyncImageView;->setScaleToCropCenter(Z)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->j:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->j:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {v0, p0}, Lcom/mob/tools/gui/AsyncImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->j:Lcom/mob/tools/gui/AsyncImageView;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/a/a/b/a;->a(Lcom/mob/tools/gui/AsyncImageView;)V

    new-instance v0, Lcom/fimi/soul/module/b/a/a/l;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/fimi/soul/module/b/a/a/l;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->k:Lcom/fimi/soul/module/b/a/a/l;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->k:Lcom/fimi/soul/module/b/a/a/l;

    invoke-virtual {v0, p2}, Lcom/fimi/soul/module/b/a/a/l;->setRatio(F)V

    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->i:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->k:Lcom/fimi/soul/module/b/a/a/l;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->k:Lcom/fimi/soul/module/b/a/a/l;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/b/a/a/l;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 7

    const/4 v6, 0x1

    const/4 v5, -0x2

    const/4 v4, -0x1

    invoke-super {p0}, Lcom/fimi/soul/module/b/a/a/b;->onCreate()V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/mob/tools/utils/R;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44a00000    # 1280.0f

    div-float/2addr v0, v1

    const/4 v1, 0x0

    iput v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->p:I

    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->d:Landroid/widget/RelativeLayout;

    const v2, -0x191614

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    const/high16 v1, 0x42c00000    # 96.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->d:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v1, v0}, Lcom/fimi/soul/module/b/a/a/b/a;->a(Landroid/widget/RelativeLayout;F)V

    new-instance v1, Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0, v1, v0}, Lcom/fimi/soul/module/b/a/a/b/a;->b(Landroid/widget/RelativeLayout;F)V

    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0, v2, v0}, Lcom/fimi/soul/module/b/a/a/b/a;->b(Landroid/widget/LinearLayout;F)V

    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->l:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/b/a;->c:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/b/a;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/b/a;->l:Landroid/widget/LinearLayout;

    invoke-direct {p0, v1, v0}, Lcom/fimi/soul/module/b/a/a/b/a;->a(Landroid/widget/LinearLayout;F)V

    return-void
.end method
