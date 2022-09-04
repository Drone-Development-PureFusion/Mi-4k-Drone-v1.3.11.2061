.class public Lcom/google/android/gms/cast/framework/h$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/app/Activity;

.field private b:Landroid/view/View;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/cast/framework/h$b;

.field private f:Z

.field private g:F

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/support/v7/app/MediaRouteButton;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->b:Landroid/view/View;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Landroid/view/MenuItem;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/google/android/gms/common/util/s;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->b:Landroid/view/View;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/cast/framework/h$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/cast/framework/h$a;->f:Z

    return-object p0
.end method

.method public a(F)Lcom/google/android/gms/cast/framework/h$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/cast/framework/h$a;->g:F

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/cast/framework/h$a;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorRes;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/framework/h$a;->c:I

    return-object p0
.end method

.method public a(Lcom/google/android/gms/cast/framework/h$b;)Lcom/google/android/gms/cast/framework/h$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/h$a;->e:Lcom/google/android/gms/cast/framework/h$b;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/h$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/h$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public b()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/cast/framework/h$a;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/cast/framework/h$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/h$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->b:Landroid/view/View;

    return-object v0
.end method

.method public c(I)Lcom/google/android/gms/cast/framework/h$a;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/google/android/gms/cast/framework/h$a;->g:F

    return-object p0
.end method

.method public d(I)Lcom/google/android/gms/cast/framework/h$a;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->h:Ljava/lang/String;

    return-object p0
.end method

.method public d()Lcom/google/android/gms/cast/framework/h$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->e:Lcom/google/android/gms/cast/framework/h$b;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/h$a;->c:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/framework/h$a;->f:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/h$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/framework/h$a;->g:F

    return v0
.end method

.method public j()Lcom/google/android/gms/cast/framework/h;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/s;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/afj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afj;-><init>(Lcom/google/android/gms/cast/framework/h$a;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/afk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afk;-><init>(Lcom/google/android/gms/cast/framework/h$a;)V

    goto :goto_0
.end method
