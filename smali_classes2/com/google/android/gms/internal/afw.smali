.class public Lcom/google/android/gms/internal/afw;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/widget/SeekBar;

.field private final b:Landroid/widget/SeekBar;


# direct methods
.method public constructor <init>(Landroid/widget/SeekBar;Landroid/widget/SeekBar;)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    iput-object p2, p0, Lcom/google/android/gms/internal/afw;->b:Landroid/widget/SeekBar;

    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setClickable(Z)V

    invoke-static {}, Lcom/google/android/gms/common/util/s;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    invoke-virtual {v0, v3}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    new-instance v1, Lcom/google/android/gms/internal/afw$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/afw$1;-><init>(Lcom/google/android/gms/internal/afw;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private e()V
    .locals 5

    const/4 v2, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afw;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/internal/afw;->a:Landroid/widget/SeekBar;

    if-eqz v3, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v4, v0}, Landroid/widget/SeekBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afw;->b:Landroid/widget/SeekBar;

    if-eqz v3, :cond_2

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setVisibility(I)V

    :cond_0
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v2, v1

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/afw;->e()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afw;->e()V

    return-void
.end method
