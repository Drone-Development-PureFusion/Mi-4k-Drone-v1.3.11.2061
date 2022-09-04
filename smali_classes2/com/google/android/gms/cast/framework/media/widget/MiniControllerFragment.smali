.class public Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/widget/a;


# static fields
.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private b:Z

.field private c:I

.field private d:I

.field private e:[I

.field private f:[Landroid/widget/ImageView;

.field private g:I

.field private h:Lcom/google/android/gms/cast/framework/media/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "MiniControllerFragment"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a:Lcom/google/android/gms/cast/internal/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->f:[Landroid/widget/ImageView;

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const/4 v6, 0x3

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    if-eqz v2, :cond_0

    :goto_0
    return-void

    :cond_0
    sget-object v2, Lcom/google/android/gms/R$styleable;->CastMiniController:[I

    sget v3, Lcom/google/android/gms/R$attr;->castMiniControllerStyle:I

    sget v4, Lcom/google/android/gms/R$style;->CastMiniController:I

    invoke-virtual {p1, p2, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    sget v3, Lcom/google/android/gms/R$styleable;->CastMiniController_castShowImageThumbnail:I

    invoke-virtual {v2, v3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->b:Z

    sget v3, Lcom/google/android/gms/R$styleable;->CastMiniController_castTitleTextAppearance:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->c:I

    sget v3, Lcom/google/android/gms/R$styleable;->CastMiniController_castSubtitleTextAppearance:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d:I

    sget v3, Lcom/google/android/gms/R$styleable;->CastMiniController_castControlButtons:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v4

    if-ne v4, v6, :cond_1

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    move v0, v1

    :goto_2
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    aput v5, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    move v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->b:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    sget v3, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v3, v0, v1

    :cond_3
    iput v1, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->g:I

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    array-length v3, v0

    :goto_3
    if-ge v1, v3, :cond_6

    aget v4, v0, v1

    sget v5, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    if-eq v4, v5, :cond_4

    iget v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->g:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->g:I

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    sget-object v3, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "Unable to read attribute castControlButtons."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array v3, v6, [I

    sget v4, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v4, v3, v1

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v1, v3, v0

    const/4 v0, 0x2

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v1, v3, v0

    iput-object v3, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    :cond_6
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_0
.end method

.method private a(Landroid/widget/RelativeLayout;II)V
    .locals 8

    const-wide/16 v4, 0x7530

    const/4 v6, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    aget v0, v0, p3

    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    if-ne v0, v2, :cond_1

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_custom:I

    if-eq v0, v2, :cond_0

    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_play_pause_toggle:I

    if-ne v0, v2, :cond_2

    sget v3, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_play:I

    sget v2, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_pause:I

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_stop:I

    iget v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->g:I

    if-ne v4, v6, :cond_8

    sget v3, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_play_large:I

    sget v2, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_pause_large:I

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_stop_large:I

    move v7, v2

    move v2, v3

    move v3, v7

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->c(I)Landroid/widget/ProgressBar;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_skip_previous:I

    if-ne v0, v2, :cond_3

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_skip_prev:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/google/android/gms/R$string;->cast_skip_prev:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;I)V

    goto :goto_0

    :cond_3
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_skip_next:I

    if-ne v0, v2, :cond_4

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_skip_next:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/google/android/gms/R$string;->cast_skip_next:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;I)V

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_rewind_30_seconds:I

    if-ne v0, v2, :cond_5

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_rewind30:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/google/android/gms/R$string;->cast_rewind_30:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;J)V

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_forward_30_seconds:I

    if-ne v0, v2, :cond_6

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_forward30:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/google/android/gms/R$string;->cast_forward_30:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;J)V

    goto/16 :goto_0

    :cond_6
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_mute_toggle:I

    if-ne v0, v2, :cond_7

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_mute:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;)V

    goto/16 :goto_0

    :cond_7
    sget v2, Lcom/google/android/gms/R$id;->cast_button_type_closed_caption:I

    if-ne v0, v2, :cond_0

    sget v0, Lcom/google/android/gms/R$drawable;->cast_ic_mini_controller_closed_caption:I

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Landroid/view/View;)V

    goto/16 :goto_0

    :cond_8
    move v7, v2

    move v2, v3

    move v3, v7

    goto/16 :goto_1
.end method

.method private c(I)Landroid/widget/ProgressBar;
    .locals 4

    const/16 v3, 0x8

    const/4 v2, -0x2

    new-instance v0, Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x6

    invoke-virtual {v1, v2, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x5

    invoke-virtual {v1, v2, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x7

    invoke-virtual {v1, v2, p1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-object v0
.end method

.method private d(I)Landroid/graphics/drawable/Drawable;
    .locals 7
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    const/4 v6, 0x1

    const/4 v5, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v1, v2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTintMode(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/google/android/gms/R$color;->cast_mini_controller_disabled_button_drawable_tint_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    new-array v3, v6, [I

    const v4, 0x101009e

    aput v4, v3, v5

    invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array v0, v6, [I

    const v3, -0x101009e

    aput v3, v0, v5

    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v2
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->e:[I

    aget v0, v0, p1

    return v0
.end method

.method public a(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public final b(I)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->f:[Landroid/widget/ImageView;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public b()Lcom/google/android/gms/cast/framework/media/a/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v9, 0x0

    const/16 v8, 0x8

    new-instance v0, Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    sget v0, Lcom/google/android/gms/R$layout;->cast_mini_controller:I

    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0, v5, v8}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Landroid/view/View;I)V

    sget v0, Lcom/google/android/gms/R$id;->container_current:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    sget v1, Lcom/google/android/gms/R$id;->icon_view:I

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    sget v2, Lcom/google/android/gms/R$id;->title_view:I

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget v3, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->c:I

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    iget v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->c:I

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_0
    sget v3, Lcom/google/android/gms/R$id;->subtitle_view:I

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iget v4, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d:I

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget v6, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->d:I

    invoke-virtual {v3, v4, v6}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    :cond_1
    sget v4, Lcom/google/android/gms/R$id;->progressBar:I

    invoke-virtual {v5, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ProgressBar;

    iget-object v6, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v6, v0, v8}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Landroid/view/View;I)V

    iget-object v6, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    const-string v7, "com.google.android.gms.cast.metadata.TITLE"

    invoke-virtual {v6, v2, v7}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    const-string v6, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ProgressBar;)V

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;)V

    iget-boolean v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->b:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    const/4 v3, -0x1

    sget v4, Lcom/google/android/gms/R$drawable;->cast_album_art_placeholder:I

    invoke-virtual {v2, v1, v3, v4}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;II)V

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->f:[Landroid/widget/ImageView;

    sget v1, Lcom/google/android/gms/R$id;->button_0:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    aput-object v1, v2, v9

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->f:[Landroid/widget/ImageView;

    sget v1, Lcom/google/android/gms/R$id;->button_1:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    aput-object v1, v2, v10

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->f:[Landroid/widget/ImageView;

    sget v1, Lcom/google/android/gms/R$id;->button_2:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    aput-object v1, v2, v11

    sget v1, Lcom/google/android/gms/R$id;->button_0:I

    invoke-direct {p0, v0, v1, v9}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a(Landroid/widget/RelativeLayout;II)V

    sget v1, Lcom/google/android/gms/R$id;->button_1:I

    invoke-direct {p0, v0, v1, v10}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a(Landroid/widget/RelativeLayout;II)V

    sget v1, Lcom/google/android/gms/R$id;->button_2:I

    invoke-direct {p0, v0, v1, v11}, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->a(Landroid/widget/RelativeLayout;II)V

    return-object v5

    :cond_2
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a/b;->h()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/MiniControllerFragment;->h:Lcom/google/android/gms/cast/framework/media/a/b;

    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    return-void
.end method
