.class public Lcom/fimi/soul/module/b/a/a/d;
.super Landroid/widget/LinearLayout;


# static fields
.field private static final a:I = 0x40

.field private static final b:I = 0x18

.field private static final c:I = 0x60

.field private static final d:I = 0x14


# instance fields
.field private e:Landroid/widget/ImageView;

.field private f:Lcom/mob/tools/gui/AsyncImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/graphics/Bitmap;

.field private i:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;F)V
    .locals 5

    const/16 v4, 0x10

    const/4 v2, 0x0

    const/4 v3, -0x2

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    invoke-virtual {p0, v0, v2, v0, v2}, Lcom/fimi/soul/module/b/a/a/d;->setPadding(IIII)V

    const/high16 v0, 0x42c00000    # 96.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/b/a/a/d;->setMinimumHeight(I)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/b/a/a/d;->setBackgroundColor(I)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->e:Landroid/widget/ImageView;

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v4, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/d;->e:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v0}, Lcom/fimi/soul/module/b/a/a/d;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/mob/tools/gui/AsyncImageView;

    invoke-direct {v0, p1}, Lcom/mob/tools/gui/AsyncImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    const/high16 v0, 0x42800000    # 64.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v0, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v4, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v0, 0x41c00000    # 24.0f

    mul-float/2addr v0, p2

    float-to-int v0, v0

    invoke-virtual {v1, v0, v2, v0, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/b/a/a/d;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->setSingleLine()V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput v4, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    invoke-virtual {p0, v1, v0}, Lcom/fimi/soul/module/b/a/a/d;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v0, "ssdk_oks_classic_check_checked"

    invoke-static {p1, v0}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->h:Landroid/graphics/Bitmap;

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/d;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ssdk_oks_classic_check_default"

    invoke-static {v0, v1}, Lcom/mob/tools/utils/R;->getBitmapRes(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->i:Landroid/graphics/Bitmap;

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/module/b/a/a/c$b;Z)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->g:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/fimi/soul/module/b/a/a/c$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/d;->e:Landroid/widget/ImageView;

    iget-boolean v0, p1, Lcom/fimi/soul/module/b/a/a/c$b;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->h:Landroid/graphics/Bitmap;

    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_3

    iget-object v0, p1, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/mob/tools/gui/BitmapProcessor;->getBitmapFromCache(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    invoke-virtual {v1, v0}, Lcom/mob/tools/gui/AsyncImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->i:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/mob/tools/gui/AsyncImageView;->execute(Ljava/lang/String;I)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/d;->f:Lcom/mob/tools/gui/AsyncImageView;

    iget-object v1, p1, Lcom/fimi/soul/module/b/a/a/c$b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mob/tools/gui/AsyncImageView;->execute(Ljava/lang/String;I)V

    goto :goto_1
.end method
