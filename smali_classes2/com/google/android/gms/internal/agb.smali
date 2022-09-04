.class public Lcom/google/android/gms/internal/agb;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/widget/ImageView;

.field private final b:Landroid/view/View;

.field private final c:Z

.field private final d:Landroid/graphics/drawable/Drawable;

.field private final e:Ljava/lang/String;

.field private final f:Landroid/graphics/drawable/Drawable;

.field private final g:Ljava/lang/String;

.field private final h:Landroid/graphics/drawable/Drawable;

.field private final i:Ljava/lang/String;

.field private final j:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/google/android/gms/internal/agb;->d:Landroid/graphics/drawable/Drawable;

    iput-object p4, p0, Lcom/google/android/gms/internal/agb;->f:Landroid/graphics/drawable/Drawable;

    if-eqz p5, :cond_0

    :goto_0
    iput-object p5, p0, Lcom/google/android/gms/internal/agb;->h:Landroid/graphics/drawable/Drawable;

    sget v0, Lcom/google/android/gms/R$string;->cast_play:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agb;->e:Ljava/lang/String;

    sget v0, Lcom/google/android/gms/R$string;->cast_pause:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agb;->g:Ljava/lang/String;

    sget v0, Lcom/google/android/gms/R$string;->cast_stop:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/agb;->i:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/agb;->b:Landroid/view/View;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/agb;->c:Z

    new-instance v0, Lcom/google/android/gms/internal/agb$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/agb$1;-><init>(Lcom/google/android/gms/internal/agb;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agb;->j:Landroid/view/View$OnClickListener;

    return-void

    :cond_0
    move-object p5, p4

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agb;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agb;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 3

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    iget-boolean v0, p0, Lcom/google/android/gms/internal/agb;->c:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setEnabled(Z)V

    return-void

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agb;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->d:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/google/android/gms/internal/agb;->e:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/agb;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->l()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->h:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/google/android/gms/internal/agb;->i:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/agb;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->f:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/google/android/gms/internal/agb;->g:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/agb;->a(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->n()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/agb;->a(Z)V

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/agb;->a(Z)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/google/android/gms/internal/agb;->j:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/agb;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agb;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/agb;->e()V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/agb;->a(Z)V

    return-void
.end method
