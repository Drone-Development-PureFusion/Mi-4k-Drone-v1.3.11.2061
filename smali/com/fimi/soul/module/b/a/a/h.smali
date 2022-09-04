.class public Lcom/fimi/soul/module/b/a/a/h;
.super Lcom/fimi/soul/module/b/c;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Lcom/mob/tools/gui/ScaledImageView;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/c;-><init>(Lcom/fimi/soul/module/b/e;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/h;)Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/b/a/a/h;)Lcom/mob/tools/gui/ScaledImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/h;->a:Landroid/graphics/Bitmap;

    return-void
.end method

.method public onCreate()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v2, 0x4c000000    # 3.3554432E7f

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lcom/mob/tools/gui/ScaledImageView;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/h;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/mob/tools/gui/ScaledImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Lcom/mob/tools/gui/ScaledImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->activity:Landroid/app/Activity;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    invoke-virtual {v0}, Lcom/mob/tools/gui/ScaledImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    invoke-virtual {v0}, Lcom/mob/tools/gui/ScaledImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/h;->b:Lcom/mob/tools/gui/ScaledImageView;

    new-instance v1, Lcom/fimi/soul/module/b/a/a/h$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/b/a/a/h$1;-><init>(Lcom/fimi/soul/module/b/a/a/h;)V

    invoke-virtual {v0, v1}, Lcom/mob/tools/gui/ScaledImageView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
