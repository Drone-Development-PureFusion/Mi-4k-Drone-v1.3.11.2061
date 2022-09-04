.class public Lcom/google/android/gms/internal/afj;
.super Landroid/widget/RelativeLayout;

# interfaces
.implements Lcom/google/android/gms/cast/framework/h;


# instance fields
.field private final a:Z

.field private b:Landroid/app/Activity;

.field private c:Lcom/google/android/gms/cast/framework/h$b;

.field private d:Landroid/view/View;

.field private e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/cast/framework/h$a;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xf
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->b()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/afj;->a:Z

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->d()Lcom/google/android/gms/cast/framework/h$b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->c:Lcom/google/android/gms/cast/framework/h$b;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->c()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->d:Landroid/view/View;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/h$a;->e()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/afj;->h:I

    return-void
.end method

.method static a(Landroid/content/Context;)Z
    .locals 2

    const-string v0, "accessibility"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afj;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afj;->g:Z

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/afj;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/h$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->c:Lcom/google/android/gms/cast/framework/h$b;

    return-object v0
.end method

.method private c()V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afj;->removeAllViews()V

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->c:Lcom/google/android/gms/cast/framework/h$b;

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->d:Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->f:Ljava/lang/String;

    iput v1, p0, Lcom/google/android/gms/internal/afj;->h:I

    iput-boolean v1, p0, Lcom/google/android/gms/internal/afj;->g:Z

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/internal/afj;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afj;->c()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/gms/internal/afj;)Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afj;->g:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/internal/afj;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afj;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/h$c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/internal/afj;->c()V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iget v0, p0, Lcom/google/android/gms/internal/afj;->h:I

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iget v1, p0, Lcom/google/android/gms/internal/afj;->h:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(I)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/afj;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/google/android/gms/R$layout;->cast_help_text:I

    iget-object v2, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/afj;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v4}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;->setText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Lcom/google/android/gms/cast/framework/internal/featurehighlight/b;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    iget-object v1, p0, Lcom/google/android/gms/internal/afj;->d:Landroid/view/View;

    new-instance v2, Lcom/google/android/gms/internal/afj$1;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/afj$1;-><init>(Lcom/google/android/gms/internal/afj;)V

    invoke-virtual {v0, v1, v4, v5, v2}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Landroid/view/View;Landroid/view/View;ZLcom/google/android/gms/cast/framework/internal/featurehighlight/a$a;)V

    iput-boolean v5, p0, Lcom/google/android/gms/internal/afj;->g:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->e:Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/cast/framework/internal/featurehighlight/a;->a(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afj;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afj;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/afj;->c()V

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afj;->c()V

    invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V

    return-void
.end method
