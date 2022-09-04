.class public Lcom/fimi/soul/module/b/a/a/g;
.super Landroid/widget/LinearLayout;


# static fields
.field private static final a:I = 0x2d0

.field private static final b:I = 0x40

.field private static final c:I = 0x18


# instance fields
.field private d:Landroid/widget/TextView;

.field private e:Lcom/fimi/soul/module/b/a/a/k;

.field private f:Landroid/widget/ProgressBar;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const/16 v7, 0x10

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/4 v5, -0x2

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/mob/tools/utils/R;->getScreenSize(Landroid/content/Context;)[I

    move-result-object v0

    aget v1, v0, v6

    aget v2, v0, v3

    if-ge v1, v2, :cond_1

    aget v0, v0, v6

    int-to-float v0, v0

    :goto_0
    const/high16 v1, 0x44340000    # 720.0f

    div-float/2addr v0, v1

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/b/a/a/g;->setOrientation(I)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {p0, v1, v2}, Lcom/fimi/soul/module/b/a/a/g;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lcom/fimi/soul/module/b/a/a/k;

    invoke-direct {v2, p1}, Lcom/fimi/soul/module/b/a/a/k;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    const-string v2, "ssdk_oks_ptr_ptr"

    invoke-static {p1, v2}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    invoke-virtual {v3, v2}, Lcom/fimi/soul/module/b/a/a/k;->setImageResource(I)V

    :cond_0
    const/high16 v2, 0x42800000    # 64.0f

    mul-float/2addr v2, v0

    float-to-int v2, v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v7, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v2, 0x41c00000    # 24.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/widget/ProgressBar;

    invoke-direct {v2, p1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    const-string v2, "ssdk_oks_classic_progressbar"

    invoke-static {p1, v2}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v4, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    new-instance v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/g;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    const/4 v3, 0x2

    const/high16 v4, 0x41900000    # 18.0f

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v6, v0, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    const v2, -0xf644f9

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v7, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_1
    aget v0, v0, v3

    int-to-float v0, v0

    goto/16 :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/k;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/g;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_refreshing"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    const/16 v0, 0xb4

    const/16 v2, 0x64

    if-le p1, v2, :cond_2

    add-int/lit8 v1, p1, -0x64

    mul-int/lit16 v1, v1, 0xb4

    div-int/lit8 v1, v1, 0x14

    if-le v1, v0, :cond_4

    :goto_0
    if-gez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/a/a/k;->setRotation(F)V

    :goto_1
    if-ge p1, v2, :cond_3

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/g;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_pull_to_refresh"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    :goto_2
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/k;->setRotation(F)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/g;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_release_to_refresh"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/g;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public b()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->f:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/k;->setRotation(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/g;->e:Lcom/fimi/soul/module/b/a/a/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/k;->setVisibility(I)V

    return-void
.end method
