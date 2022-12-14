.class Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/graphics/Rect;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a:Landroid/graphics/Rect;

    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$dimen;->cast_libraries_material_featurehighlight_inner_radius:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->b:I

    sget v1, Lcom/google/android/gms/R$dimen;->cast_libraries_material_featurehighlight_inner_margin:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->c:I

    sget v1, Lcom/google/android/gms/R$dimen;->cast_libraries_material_featurehighlight_text_max_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->d:I

    sget v1, Lcom/google/android/gms/R$dimen;->cast_libraries_material_featurehighlight_text_horizontal_offset:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->e:I

    return-void
.end method

.method private a(Landroid/graphics/Rect;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    :goto_0
    iget v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->b:I

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v0

    goto :goto_0
.end method

.method private a(Landroid/view/View;IIII)I
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    div-int/lit8 v2, p4, 0x2

    sub-int v1, p5, p2

    sub-int v3, p3, p5

    if-gt v1, v3, :cond_1

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_2

    sub-int v1, p5, v2

    iget v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->e:I

    add-int/2addr v1, v2

    :goto_1
    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v2, v1, v2

    if-ge v2, p2, :cond_3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int v1, p2, v0

    :cond_0
    :goto_2
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :cond_2
    sub-int v1, p5, v2

    iget v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->e:I

    sub-int/2addr v1, v2

    goto :goto_1

    :cond_3
    add-int v2, v1, p4

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    if-le v2, p3, :cond_0

    sub-int v1, p3, p4

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v1, v0

    goto :goto_2
.end method

.method private a(Landroid/view/View;II)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v1, p2, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int v0, v1, v0

    iget v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->d:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/high16 v1, -0x80000000

    invoke-static {p3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method private a(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private b(Landroid/view/View;II)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr v0, p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v1, p3

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private c(Landroid/view/View;II)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    sub-int v0, p3, v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p1, p2, v0, v1, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method


# virtual methods
.method a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 7

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/View;->layout(IIII)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a:Landroid/graphics/Rect;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d()Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e()Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->a(Landroid/graphics/Rect;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result v5

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    move-result v3

    if-ge v2, v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/graphics/Rect;)I

    move-result v3

    div-int/lit8 v4, v3, 0x2

    add-int/2addr v4, v2

    iget v6, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->c:I

    add-int/2addr v6, v4

    if-eqz v0, :cond_3

    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v6

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/view/View;II)V

    iget v2, p2, Landroid/graphics/Rect;->left:I

    iget v3, p2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/view/View;IIII)I

    move-result v0

    invoke-direct {p0, v1, v0, v6}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->b(Landroid/view/View;II)V

    goto :goto_0

    :cond_3
    div-int/lit8 v0, v3, 0x2

    sub-int v0, v2, v0

    iget v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->c:I

    sub-int v6, v0, v2

    iget v0, p2, Landroid/graphics/Rect;->top:I

    sub-int v0, v6, v0

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/view/View;II)V

    iget v2, p2, Landroid/graphics/Rect;->left:I

    iget v3, p2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/view/View;IIII)I

    move-result v0

    invoke-direct {p0, v1, v0, v6}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->c(Landroid/view/View;II)V

    goto :goto_0
.end method
