.class public abstract Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;
.super Landroid/support/v7/app/AppCompatActivity;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/widget/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;,
        Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/cast/framework/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/cast/framework/l",
            "<",
            "Lcom/google/android/gms/cast/framework/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/cast/framework/media/c$a;

.field private c:I

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/SeekBar;

.field private f:Lcom/google/android/gms/internal/afr;

.field private g:[I

.field private h:[Landroid/widget/ImageView;

.field private i:Landroid/view/View;

.field private j:Lcom/google/android/gms/cast/framework/media/a/b;

.field private k:Lcom/google/android/gms/cast/framework/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$b;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$b;-><init>(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a:Lcom/google/android/gms/cast/framework/l;

    new-instance v0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;-><init>(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$1;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->b:Lcom/google/android/gms/cast/framework/media/c$a;

    const/4 v0, 0x4

    new-array v0, v0, [Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/widget/RelativeLayout;)Lcom/google/android/gms/internal/afr;
    .locals 6

    const/4 v5, 0x0

    new-instance v0, Lcom/google/android/gms/internal/afr;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afr;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    sget v2, Lcom/google/android/gms/R$id;->end_text:I

    invoke-virtual {v1, v5, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x1

    sget v3, Lcom/google/android/gms/R$id;->start_text:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x6

    sget v3, Lcom/google/android/gms/R$id;->seek_bar:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x7

    sget v3, Lcom/google/android/gms/R$id;->seek_bar:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/4 v2, 0x5

    sget v3, Lcom/google/android/gms/R$id;->seek_bar:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    const/16 v2, 0x8

    sget v3, Lcom/google/android/gms/R$id;->seek_bar:I

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afr;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getPaddingRight()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v4}, Landroid/widget/SeekBar;->getPaddingBottom()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/afr;->setPadding(IIII)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/google/android/gms/R$string;->cast_seek_bar:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afr;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/afr;->setBackgroundColor(I)V

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    return-object v0
.end method

.method private a(Landroid/support/v7/widget/Toolbar;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->quantum_ic_keyboard_arrow_down_white_36:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setHomeAsUpIndicator(I)V

    :cond_0
    return-void
.end method

.method private a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    if-ne p3, v1, :cond_1

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_custom:I

    if-eq p3, v1, :cond_0

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_play_pause_toggle:I

    if-ne p3, v1, :cond_2

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_2
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_skip_previous:I

    if-ne p3, v1, :cond_3

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->b(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_skip_next:I

    if-ne p3, v1, :cond_4

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_4
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_rewind_30_seconds:I

    if-ne p3, v1, :cond_5

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_5
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_forward_30_seconds:I

    if-ne p3, v1, :cond_6

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_6
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_mute_toggle:I

    if-ne p3, v1, :cond_7

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->f(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0

    :cond_7
    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_closed_caption:I

    if-ne p3, v1, :cond_0

    invoke-direct {p0, v0, p4}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V

    goto :goto_0
.end method

.method private a(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 8

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    sget v0, Lcom/google/android/gms/R$id;->background_image_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/google/android/gms/R$id;->background_place_holder_image_view:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {p2, v0, v2, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;ILandroid/view/View;)V

    sget v0, Lcom/google/android/gms/R$id;->status_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d:Landroid/widget/TextView;

    sget v0, Lcom/google/android/gms/R$id;->loading_indicator:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;)V

    sget v0, Lcom/google/android/gms/R$id;->start_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget v1, Lcom/google/android/gms/R$id;->end_text:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    sget v2, Lcom/google/android/gms/R$id;->live_stream_indicator:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget v3, Lcom/google/android/gms/R$id;->seek_bar:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    iput-object v3, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g()V

    sget v3, Lcom/google/android/gms/R$id;->live_stream_seek_bar:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/SeekBar;

    invoke-virtual {p2, v0, v4}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;Z)V

    invoke-virtual {p2, v1, v2}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/SeekBar;)V

    new-instance v0, Lcom/google/android/gms/internal/afw;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/internal/afw;-><init>(Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V

    invoke-virtual {p2, v3, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    sget v0, Lcom/google/android/gms/R$id;->button_0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v1, v5

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    sget v0, Lcom/google/android/gms/R$id;->button_1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v1, v4

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    sget v0, Lcom/google/android/gms/R$id;->button_2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v1, v6

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    sget v0, Lcom/google/android/gms/R$id;->button_3:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aput-object v0, v1, v7

    sget v0, Lcom/google/android/gms/R$id;->button_0:I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    aget v1, v1, v5

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->button_1:I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    aget v1, v1, v4

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->button_play_pause_toggle:I

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_play_pause_toggle:I

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->button_2:I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    aget v1, v1, v6

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->button_3:I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    aget v1, v1, v7

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;IILcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->ad_container:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i:Landroid/view/View;

    sget v0, Lcom/google/android/gms/R$id;->seek_bar_controls:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/widget/RelativeLayout;)Lcom/google/android/gms/internal/afr;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->f:Lcom/google/android/gms/internal/afr;

    return-void
.end method

.method private a(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 7

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_pause:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_play:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_stop:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    move-object v1, p1

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V

    return-void
.end method

.method private b(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_skip_previous:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$string;->cast_skip_prev:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;I)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k()V

    return-void
.end method

.method private c(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_skip_next:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$string;->cast_skip_next:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;I)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->l()V

    return-void
.end method

.method private d(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_rewind30:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$string;->cast_rewind_30:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    const-wide/16 v0, 0x7530

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;J)V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j()V

    return-void
.end method

.method private e()I
    .locals 3

    const/4 v2, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Landroid/support/v7/appcompat/R$attr;->selectableItemBackgroundBorderless:I

    aput v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return v1
.end method

.method static synthetic e(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method private e(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_forward30:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$string;->cast_forward_30:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    const-wide/16 v0, 0x7530

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;J)V

    return-void
.end method

.method private f(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_mute:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ImageView;)V

    return-void
.end method

.method private f()[I
    .locals 7

    const/4 v6, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-object v3, Lcom/google/android/gms/R$styleable;->CastExpandedController:[I

    sget v4, Lcom/google/android/gms/R$attr;->castExpandedControllerStyle:I

    sget v5, Lcom/google/android/gms/R$style;->CastExpandedController:I

    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    sget v3, Lcom/google/android/gms/R$styleable;->CastExpandedController_castControlButtons:I

    invoke-virtual {v2, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v2

    if-ne v2, v6, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v0

    new-array v2, v0, [I

    move v0, v1

    :goto_1
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_1

    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    aput v4, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    move-object v0, v2

    :goto_2
    return-object v0

    :cond_2
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-array v2, v6, [I

    sget v3, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v3, v2, v1

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v1, v2, v0

    const/4 v0, 0x2

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v1, v2, v0

    const/4 v0, 0x3

    sget v1, Lcom/google/android/gms/R$id;->cast_button_type_empty:I

    aput v1, v2, v0

    move-object v0, v2

    goto :goto_2
.end method

.method private g()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/util/s;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgressBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/google/android/gms/R$color;->cast_expanded_controller_seek_bar_progress_background_tint_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setSplitTrack(Z)V

    :cond_0
    return-void
.end method

.method private g(Landroid/widget/ImageView;Lcom/google/android/gms/cast/framework/media/a/b;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$drawable;->cast_ic_expanded_controller_closed_caption:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Landroid/view/View;)V

    return-void
.end method

.method private h()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x13
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/util/s;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    invoke-static {}, Lcom/google/android/gms/common/util/s;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    xor-int/lit8 v0, v0, 0x2

    :cond_2
    invoke-static {}, Lcom/google/android/gms/common/util/s;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    xor-int/lit8 v0, v0, 0x4

    :cond_3
    invoke-static {}, Lcom/google/android/gms/common/util/s;->h()Z

    move-result v1

    if-eqz v1, :cond_4

    xor-int/lit16 v0, v0, 0x1000

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-static {}, Lcom/google/android/gms/common/util/s;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->setImmersive(Z)V

    goto :goto_0
.end method

.method private i()Lcom/google/android/gms/cast/framework/media/c;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k:Lcom/google/android/gms/cast/framework/k;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->e()Lcom/google/android/gms/cast/MediaMetadata;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "com.google.android.gms.cast.metadata.TITLE"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/MediaMetadata;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v7/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k:Lcom/google/android/gms/cast/framework/k;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->b()Lcom/google/android/gms/cast/CastDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/CastDevice;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/google/android/gms/R$string;->cast_casting_to_device:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private l()V
    .locals 5

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v4

    if-nez v4, :cond_1

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaStatus;->r()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    :goto_1
    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setEnabled(Z)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    if-nez v4, :cond_4

    :goto_3
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->f:Lcom/google/android/gms/internal/afr;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getMax()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/afr;->a(I)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->f:Lcom/google/android/gms/internal/afr;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->j()Ljava/util/List;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/afr;->a(Ljava/util/List;I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v1

    goto :goto_0

    :cond_2
    move v1, v3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setEnabled(Z)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->i:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    goto :goto_3
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final a(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    aget v0, v0, p1

    return v0
.end method

.method public final b(I)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h:[Landroid/widget/ImageView;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public b()Lcom/google/android/gms/cast/framework/media/a/b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    return-object v0
.end method

.method public c()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method public d()Landroid/widget/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e:Landroid/widget/SeekBar;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/support/v4/app/FragmentActivity;Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k:Lcom/google/android/gms/cast/framework/k;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k:Lcom/google/android/gms/cast/framework/k;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->finish()V

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/media/a/b;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->b:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/media/c$a;)V

    sget v0, Lcom/google/android/gms/R$layout;->cast_expanded_controller_activity:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->setContentView(I)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c:I

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->f()[I

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->g:[I

    sget v0, Lcom/google/android/gms/R$id;->expanded_controller_layout:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/b;)V

    sget v0, Lcom/google/android/gms/R$id;->toolbar:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->k()V

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/media/c$a;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->j:Lcom/google/android/gms/cast/framework/media/a/b;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a/b;->h()V

    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->finish()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method protected onPause()V
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a:Lcom/google/android/gms/cast/framework/l;

    const-class v2, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/framework/k;->b(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a:Lcom/google/android/gms/cast/framework/l;

    const-class v2, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/framework/k;->a(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    invoke-static {p0}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->o()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/d;->p()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->finish()V

    :cond_1
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->h()V

    :cond_0
    return-void
.end method
