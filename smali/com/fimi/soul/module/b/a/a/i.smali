.class public abstract Lcom/fimi/soul/module/b/a/a/i;
.super Lcom/fimi/soul/module/b/c;


# instance fields
.field private a:Lcom/fimi/soul/module/b/a/a/a;

.field private b:Ljava/lang/Runnable;

.field private c:Landroid/view/animation/Animation;

.field private d:Landroid/view/animation/Animation;

.field private e:Landroid/widget/LinearLayout;

.field private f:Z


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/b/e;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/b/c;-><init>(Lcom/fimi/soul/module/b/e;)V

    invoke-static {p1}, Lcom/mob/tools/utils/R;->forceCast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/b/a/a/a;

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->a:Lcom/fimi/soul/module/b/a/a/a;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/i;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/b/a/a/i;->b:Ljava/lang/Runnable;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/i;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->c()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/a/a/i;->c(Lcn/sharesdk/framework/Platform;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/b/a/a/i;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/b/a/a/i;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/f;
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->g()Lcom/fimi/soul/module/b/f;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/a/a/i;->a(Lcn/sharesdk/framework/Platform;)V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/b/a/a/i;->b(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/f;
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->g()Lcom/fimi/soul/module/b/f;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/b/a/a/i;)Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/b/a/a/i;)Lcom/fimi/soul/module/b/a/a/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->a:Lcom/fimi/soul/module/b/a/a/a;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/b/a/a/i;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->b:Ljava/lang/Runnable;

    return-object v0
.end method

.method private j()V
    .locals 9

    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->c:Landroid/view/animation/Animation;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->c:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->d:Landroid/view/animation/Animation;

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->d:Landroid/view/animation/Animation;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    return-void
.end method


# virtual methods
.method protected abstract a(Ljava/util/ArrayList;)Lcom/fimi/soul/module/b/a/a/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/fimi/soul/module/b/a/a/j;"
        }
    .end annotation
.end method

.method public final a(Landroid/view/View;Lcom/fimi/soul/module/b/a;)V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/b/a/a/i$3;

    invoke-direct {v0, p0, p2, p1}, Lcom/fimi/soul/module/b/a/a/i$3;-><init>(Lcom/fimi/soul/module/b/a/a/i;Lcom/fimi/soul/module/b/a;Landroid/view/View;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->b:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->finish()V

    return-void
.end method

.method public final d(Lcn/sharesdk/framework/Platform;)V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/b/a/a/i$2;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/module/b/a/a/i$2;-><init>(Lcom/fimi/soul/module/b/a/a/i;Lcn/sharesdk/framework/Platform;)V

    iput-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->b:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->finish()V

    return-void
.end method

.method protected i()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v2, 0x0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->getPlatformList()[Lcn/sharesdk/framework/Platform;

    move-result-object v0

    if-nez v0, :cond_0

    new-array v0, v2, [Lcn/sharesdk/framework/Platform;

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->e()Ljava/util/HashMap;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_1
    array-length v4, v0

    :goto_0
    if-ge v2, v4, :cond_3

    aget-object v5, v0, v2

    invoke-virtual {v5}, Lcn/sharesdk/framework/Platform;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->d()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_4
    return-object v3
.end method

.method public onCreate()V
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/4 v4, -0x2

    const/4 v5, -0x1

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v2, 0x4c000000    # 3.3554432E7f

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/b/a/a/i;->j()V

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    new-instance v3, Lcom/fimi/soul/module/b/a/a/i$1;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/b/a/a/i$1;-><init>(Lcom/fimi/soul/module/b/a/a/i;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/i;->c:Landroid/view/animation/Animation;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    iget-object v2, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/mob/tools/gui/MobViewPager;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/mob/tools/gui/MobViewPager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/b/a/a/i;->i()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/b/a/a/i;->a(Ljava/util/ArrayList;)Lcom/fimi/soul/module/b/a/a/j;

    move-result-object v1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1}, Lcom/fimi/soul/module/b/a/a/j;->b()I

    move-result v3

    invoke-direct {v2, v5, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Lcom/fimi/soul/module/b/a/a/f;

    iget-object v3, p0, Lcom/fimi/soul/module/b/a/a/i;->activity:Landroid/app/Activity;

    invoke-direct {v2, v3}, Lcom/fimi/soul/module/b/a/a/f;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v1}, Lcom/fimi/soul/module/b/a/a/j;->a()I

    move-result v4

    invoke-direct {v3, v5, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v4, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1}, Lcom/fimi/soul/module/b/a/a/j;->getCount()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/a/a/f;->setScreenCount(I)V

    invoke-virtual {v2, v6, v6}, Lcom/fimi/soul/module/b/a/a/f;->a(II)V

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/b/a/a/j;->a(Lcom/fimi/soul/module/b/a/a/f;)V

    invoke-virtual {v0, v1}, Lcom/mob/tools/gui/MobViewPager;->setAdapter(Lcom/mob/tools/gui/ViewPagerAdapter;)V

    return-void
.end method

.method public onFinish()Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/fimi/soul/module/b/a/a/i;->f:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/fimi/soul/module/b/a/a/i;->f:Z

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->d:Landroid/view/animation/Animation;

    new-instance v1, Lcom/fimi/soul/module/b/a/a/i$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/b/a/a/i$4;-><init>(Lcom/fimi/soul/module/b/a/a/i;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/fimi/soul/module/b/a/a/i;->d:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p0, Lcom/fimi/soul/module/b/a/a/i;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    const/4 v0, 0x1

    goto :goto_0
.end method
