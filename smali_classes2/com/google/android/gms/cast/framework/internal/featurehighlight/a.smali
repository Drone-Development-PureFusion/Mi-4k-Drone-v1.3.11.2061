.class public final Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;
.super Landroid/view/ViewGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;
    }
.end annotation


# instance fields
.field private final a:[I

.field private final b:Landroid/graphics/Rect;

.field private final c:Landroid/graphics/Rect;

.field private final d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

.field private final e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

.field private f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private i:Landroid/animation/Animator;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;

.field private final k:Landroid/support/v4/view/GestureDetectorCompat;

.field private l:Landroid/support/v4/view/GestureDetectorCompat;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private m:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

.field private n:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    sget v0, Lcom/google/android/gms/R$id;->cast_featurehighlight_view:I

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setId(I)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setWillNotDraw(Z)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-direct {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-direct {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->j:Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$1;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)V

    new-instance v1, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-direct {v1, p1, v0}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->k:Landroid/support/v4/view/GestureDetectorCompat;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->k:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/GestureDetectorCompat;->setIsLongpressEnabled(Z)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setVisibility(I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    return-object v0
.end method

.method private a(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method

.method private a([ILandroid/view/View;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->getLocationInWindow([I)V

    aget v0, p1, v3

    aget v1, p1, v4

    invoke-virtual {p2, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget v2, p1, v3

    sub-int v0, v2, v0

    aput v0, p1, v3

    aget v0, p1, v4

    sub-int/2addr v0, v1

    aput v0, p1, v4

    return-void
.end method

.method private a(FF)Z
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;FF)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(FF)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->m:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Landroid/animation/Animator;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g()Landroid/animation/Animator;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)Landroid/animation/Animator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->i:Landroid/animation/Animator;

    return-object v0
.end method

.method private d(Ljava/lang/Runnable;)Landroid/animation/Animator;
    .locals 7
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v6, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->asView()Landroid/view/View;

    move-result-object v0

    const-string v1, "alpha"

    new-array v2, v6, [F

    const/4 v3, 0x0

    aput v3, v2, v5

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/fl;->b()Lcom/google/android/gms/internal/fo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->d()Landroid/animation/Animator;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->c()Landroid/animation/Animator;

    move-result-object v2

    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v0, v4, v5

    aput-object v1, v4, v6

    const/4 v0, 0x2

    aput-object v2, v4, v0

    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$5;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$5;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v3
.end method

.method private e(Ljava/lang/Runnable;)Landroid/animation/Animator;
    .locals 7
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v6, 0x1

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->asView()Landroid/view/View;

    move-result-object v0

    const-string v1, "alpha"

    new-array v2, v6, [F

    const/4 v3, 0x0

    aput v3, v2, v5

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/fl;->b()Lcom/google/android/gms/internal/fo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->b()F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v3}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->c()F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->c(FF)Landroid/animation/Animator;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->d()Landroid/animation/Animator;

    move-result-object v2

    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v0, v4, v5

    aput-object v1, v4, v6

    const/4 v0, 0x2

    aput-object v2, v4, v0

    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$6;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$6;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Ljava/lang/Runnable;)V

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v3
.end method

.method private f()Landroid/animation/Animator;
    .locals 7

    const/4 v6, 0x2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->asView()Landroid/view/View;

    move-result-object v0

    const-string v1, "alpha"

    new-array v2, v6, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0x15e

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/fl;->a()Lcom/google/android/gms/internal/fo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->b()F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v3}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->c()F

    move-result v3

    sub-float/2addr v2, v3

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->b(FF)Landroid/animation/Animator;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->a()Landroid/animation/Animator;

    move-result-object v2

    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/animation/Animator;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    aput-object v2, v4, v6

    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$4;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;)V

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-object v3

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private g()Landroid/animation/Animator;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->b()Landroid/animation/Animator;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Target view must be set before animation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setVisibility(I)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f()Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Landroid/animation/Animator;)V

    return-void
.end method

.method public a(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->a(I)V

    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/View;ZLcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;)V
    .locals 3
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    invoke-static {p4}, Lcom/google/android/gms/internal/fq;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->m:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;

    invoke-direct {v0, p0, p1, p3, p4}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$2;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Landroid/view/View;ZLcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;)V

    new-instance v1, Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->l:Landroid/support/v4/view/GestureDetectorCompat;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->l:Landroid/support/v4/view/GestureDetectorCompat;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/GestureDetectorCompat;->setIsLongpressEnabled(Z)V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setVisibility(I)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/fq;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    invoke-interface {p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->asView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a$3;-><init>(Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method b()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e(Ljava/lang/Runnable;)Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Landroid/animation/Animator;)V

    return-void
.end method

.method c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->f:Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->asView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d(Ljava/lang/Runnable;)Landroid/animation/Animator;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Landroid/animation/Animator;)V

    return-void
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    return v0
.end method

.method d()Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    return-object v0
.end method

.method e()Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    return-object v0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    const/4 v1, -0x2

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 9

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->a()I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v6

    move v0, v1

    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-ge v0, v2, :cond_3

    move v2, v1

    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    if-ge v2, v7, :cond_2

    invoke-virtual {v3, v2, v0}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v7

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v8

    if-eqz v8, :cond_1

    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v7

    invoke-static {v7, v4, v5, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    invoke-virtual {v3, v2, v0, v7}, Landroid/graphics/Bitmap;->setPixel(III)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Neither target view nor drawable was set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Target view must be set before layout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a([ILandroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v1, v1, v6

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v2, v2, v7

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v3, v3, v6

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v4, v4, v7

    iget-object v5, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a([ILandroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v1, v1, v6

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v2, v2, v7

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v3, v3, v6

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a:[I

    aget v4, v4, v7

    iget-object v5, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->h:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->j:Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/d;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->c:Landroid/graphics/Rect;

    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {v0, p1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->resolveSize(II)I

    move-result v0

    invoke-static {v1, p2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->resolveSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v4, 0x1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    iput-boolean v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->n:Z

    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->n:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->l:Landroid/support/v4/view/GestureDetectorCompat;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->l:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v1, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    if-ne v0, v4, :cond_1

    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->g:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_2
    :goto_0
    return v4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->k:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_0
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->d:Lcom/google/android/gms/cast/framework/internal/featurehighlight/e;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/c;

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
