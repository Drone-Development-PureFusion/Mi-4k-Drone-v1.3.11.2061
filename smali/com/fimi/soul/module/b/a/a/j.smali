.class public abstract Lcom/fimi/soul/module/b/a/a/j;
.super Lcom/mob/tools/gui/ViewPagerAdapter;

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field protected static final a:I = 0x3e8

.field public static final b:I = 0x34


# instance fields
.field protected c:[[Ljava/lang/Object;

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:I

.field protected j:I

.field private k:Lcom/fimi/soul/module/b/a/a/i;

.field private l:Lcom/fimi/soul/module/b/a/a/f;

.field private m:J


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/a/a/i;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fimi/soul/module/b/a/a/i;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/mob/tools/gui/ViewPagerAdapter;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/j;->k:Lcom/fimi/soul/module/b/a/a/i;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/module/b/a/a/i;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/fimi/soul/module/b/a/a/j;->a(Landroid/content/Context;Ljava/util/ArrayList;)V

    invoke-virtual {p0, p2}, Lcom/fimi/soul/module/b/a/a/j;->a(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/view/View;
    .locals 14

    const/4 v13, 0x1

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v11, -0x1

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const v0, -0xd0d0e

    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/j;->e:I

    iget v2, p0, Lcom/fimi/soul/module/b/a/a/j;->f:I

    div-int v4, v0, v2

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    mul-int/2addr v0, v4

    new-array v5, v0, [Landroid/widget/LinearLayout;

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const-string v0, "ssdk_oks_classic_platform_cell_back"

    invoke-static {p1, v0}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_2

    new-instance v7, Landroid/widget/LinearLayout;

    invoke-direct {v7, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->f:I

    invoke-direct {v0, v11, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move v0, v1

    :goto_1
    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    if-ge v0, v8, :cond_1

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    mul-int/2addr v8, v2

    add-int/2addr v8, v0

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-direct {v9, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    aput-object v9, v5, v8

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    mul-int/2addr v8, v2

    add-int/2addr v8, v0

    aget-object v8, v5, v8

    invoke-virtual {v8, v6}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    mul-int/2addr v8, v2

    add-int/2addr v8, v0

    aget-object v8, v5, v8

    invoke-virtual {v8, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget v9, p0, Lcom/fimi/soul/module/b/a/a/j;->f:I

    invoke-direct {v8, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v12, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget v9, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    mul-int/2addr v9, v2

    add-int/2addr v9, v0

    aget-object v9, v5, v9

    invoke-virtual {v7, v9, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->g:I

    add-int/lit8 v8, v8, -0x1

    if-ge v0, v8, :cond_0

    new-instance v8, Landroid/view/View;

    invoke-direct {v8, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    iget v10, p0, Lcom/fimi/soul/module/b/a/a/j;->h:I

    invoke-direct {v9, v10, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget v8, p0, Lcom/fimi/soul/module/b/a/a/j;->h:I

    invoke-direct {v7, v11, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_2
    array-length v0, v5

    :goto_2
    if-ge v1, v0, :cond_3

    aget-object v2, v5, v1

    new-instance v4, Landroid/widget/ImageView;

    invoke-direct {v4, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    iget v7, p0, Lcom/fimi/soul/module/b/a/a/j;->j:I

    invoke-direct {v6, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget v7, p0, Lcom/fimi/soul/module/b/a/a/j;->i:I

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v6, -0x9b9b9c

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v6, 0x2

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v4, v6, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v6, 0x11

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v6, v11, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v12, v6, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v2, v4, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    return-object v3
.end method

.method private a([Landroid/widget/LinearLayout;[Ljava/lang/Object;)V
    .locals 12

    const/4 v11, 0x4

    const/4 v10, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->k:Lcom/fimi/soul/module/b/a/a/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/i;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_classic_platform_cell_back"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->k:Lcom/fimi/soul/module/b/a/a/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a/a/i;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_classic_platfrom_cell_back_nor"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    move v3, v4

    :goto_0
    array-length v0, p2

    if-ge v3, v0, :cond_6

    aget-object v0, p1, v3

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aget-object v1, p1, v3

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    aget-object v2, p2, v3

    if-nez v2, :cond_0

    invoke-virtual {v0, v11}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setVisibility(I)V

    aget-object v0, p1, v3

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    aget-object v0, p1, v3

    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    aget-object v2, p1, v3

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    aget-object v2, p1, v3

    invoke-virtual {v2, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget-object v2, p1, v3

    aget-object v7, p2, v3

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    aget-object v2, p2, v3

    instance-of v2, v2, Lcom/fimi/soul/module/b/a;

    if-eqz v2, :cond_3

    aget-object v2, p2, v3

    invoke-static {v2}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/fimi/soul/module/b/a;

    iget-object v7, v2, Lcom/fimi/soul/module/b/a;->b:Landroid/graphics/Bitmap;

    if-eqz v7, :cond_1

    iget-object v7, v2, Lcom/fimi/soul/module/b/a;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_2
    iget-object v0, v2, Lcom/fimi/soul/module/b/a;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, v2, Lcom/fimi/soul/module/b/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_2

    :cond_2
    const-string v0, ""

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    aget-object v2, p2, v3

    invoke-static {v2}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcn/sharesdk/framework/Platform;

    invoke-virtual {v2}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "ssdk_oks_classic_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-lez v7, :cond_4

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_3
    invoke-virtual {v1}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ssdk_"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/mob/tools/utils/R;->getStringRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_1

    :cond_4
    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_6
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/j;->d:I

    return v0
.end method

.method protected abstract a(Landroid/content/Context;Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public a(Lcom/fimi/soul/module/b/a/a/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/j;->l:Lcom/fimi/soul/module/b/a/a/f;

    return-void
.end method

.method protected abstract a(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/b/a/a/j;->e:I

    return v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->c:[[Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->c:[[Ljava/lang/Object;

    array-length v0, v0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/b/a/a/j;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object p2

    :cond_0
    invoke-static {p2}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/j;->c:[[Ljava/lang/Object;

    aget-object v1, v1, p1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/b/a/a/j;->a([Landroid/widget/LinearLayout;[Ljava/lang/Object;)V

    return-object p2
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/module/b/a/a/j;->m:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-wide v0, p0, Lcom/fimi/soul/module/b/a/a/j;->m:J

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/fimi/soul/module/b/a;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/b/a;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/j;->k:Lcom/fimi/soul/module/b/a/a/i;

    invoke-virtual {v1, p1, v0}, Lcom/fimi/soul/module/b/a/a/i;->a(Landroid/view/View;Lcom/fimi/soul/module/b/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcn/sharesdk/framework/Platform;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/j;->k:Lcom/fimi/soul/module/b/a/a/i;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/b/a/a/i;->d(Lcn/sharesdk/framework/Platform;)V

    goto :goto_0
.end method

.method public onScreenChange(II)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->l:Lcom/fimi/soul/module/b/a/a/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->l:Lcom/fimi/soul/module/b/a/a/f;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/j;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/a/a/f;->setScreenCount(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/j;->l:Lcom/fimi/soul/module/b/a/a/f;

    invoke-virtual {v0, p1, p2}, Lcom/fimi/soul/module/b/a/a/f;->a(II)V

    :cond_0
    return-void
.end method
