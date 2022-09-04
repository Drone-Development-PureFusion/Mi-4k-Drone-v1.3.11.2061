.class public Lcom/google/android/gms/cast/framework/media/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/framework/l;
.implements Lcom/google/android/gms/cast/framework/media/c$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/cast/framework/l",
        "<",
        "Lcom/google/android/gms/cast/framework/d;",
        ">;",
        "Lcom/google/android/gms/cast/framework/media/c$a;"
    }
.end annotation


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lcom/google/android/gms/cast/framework/k;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/view/View;",
            "Lcom/google/android/gms/cast/framework/media/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/agj;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/cast/framework/media/c$a;

.field private f:Lcom/google/android/gms/cast/framework/media/c;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->d:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-static {p1}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->b()Lcom/google/android/gms/cast/framework/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->b:Lcom/google/android/gms/cast/framework/k;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->b:Lcom/google/android/gms/cast/framework/k;

    const-class v1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/cast/framework/k;->a(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->b:Lcom/google/android/gms/cast/framework/k;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Lcom/google/android/gms/cast/framework/j;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/a/b;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->d:Ljava/util/Set;

    return-object v0
.end method

.method private b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->b:Lcom/google/android/gms/cast/framework/k;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/k;->b()Lcom/google/android/gms/cast/framework/d;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    :cond_0
    return-void
.end method

.method private c(Lcom/google/android/gms/cast/framework/j;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/cast/framework/d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/j;->o()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p1}, Lcom/google/android/gms/cast/framework/d;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$a;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/a/a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    goto :goto_0
.end method

.method private i()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/a/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    goto :goto_0
.end method

.method private j()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/a/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a/a;->c()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->a()V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/afx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/afx;-><init>(Landroid/view/View;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/view/View;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/agf;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/agf;-><init>(Landroid/view/View;I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/view/View;J)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/age;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/age;-><init>(Landroid/view/View;J)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aga;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/aga;-><init>(Landroid/widget/ImageView;Landroid/content/Context;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;II)V
    .locals 2
    .param p3    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/afu;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/google/android/gms/internal/afu;-><init>(Landroid/widget/ImageView;Landroid/content/Context;II)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;ILandroid/view/View;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/afu;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/google/android/gms/internal/afu;-><init>(Landroid/widget/ImageView;Landroid/content/Context;ILandroid/view/View;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V
    .locals 8
    .param p1    # Landroid/widget/ImageView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/agb;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/agb;-><init>(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/view/View;Z)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/ProgressBar;)V
    .locals 2

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/ProgressBar;J)V

    return-void
.end method

.method public a(Landroid/widget/ProgressBar;J)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/agc;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/internal/agc;-><init>(Landroid/widget/ProgressBar;J)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/SeekBar;)V
    .locals 2

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/SeekBar;J)V

    return-void
.end method

.method public a(Landroid/widget/SeekBar;J)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/framework/media/a/b$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/media/a/b$1;-><init>(Lcom/google/android/gms/cast/framework/media/a/b;)V

    new-instance v1, Lcom/google/android/gms/internal/agd;

    invoke-direct {v1, p1, p2, p3, v0}, Lcom/google/android/gms/internal/agd;-><init>(Landroid/widget/SeekBar;JLandroid/widget/SeekBar$OnSeekBarChangeListener;)V

    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/TextView;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/agi;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    sget v2, Lcom/google/android/gms/R$string;->cast_invalid_stream_duration_text:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/internal/agi;-><init>(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/TextView;Landroid/view/View;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/agi;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    sget v2, Lcom/google/android/gms/R$string;->cast_invalid_stream_duration_text:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Lcom/google/android/gms/internal/agi;-><init>(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;Ljava/util/List;)V

    return-void
.end method

.method public a(Landroid/widget/TextView;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/afz;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/afz;-><init>(Landroid/widget/TextView;Ljava/util/List;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Landroid/widget/TextView;Z)V
    .locals 2

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/widget/TextView;ZJ)V

    return-void
.end method

.method public a(Landroid/widget/TextView;ZJ)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/agj;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    sget v2, Lcom/google/android/gms/R$string;->cast_invalid_stream_position_text:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, p3, p4, v1}, Lcom/google/android/gms/internal/agj;-><init>(Landroid/widget/TextView;JLjava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->i()V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Lcom/google/android/gms/cast/framework/j;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Lcom/google/android/gms/cast/framework/j;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/cast/framework/j;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/d;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/cast/framework/j;I)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/d;I)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/cast/framework/j;Ljava/lang/String;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/cast/framework/j;Z)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Lcom/google/android/gms/cast/framework/d;Z)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    return-void
.end method

.method public b()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->b()V

    :cond_0
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/afv;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/afv;-><init>(Landroid/view/View;Landroid/app/Activity;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public b(Landroid/view/View;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/agg;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/agg;-><init>(Landroid/view/View;I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public b(Landroid/view/View;J)V
    .locals 2

    neg-long v0, p2

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/cast/framework/media/a/b;->a(Landroid/view/View;J)V

    return-void
.end method

.method public b(Landroid/widget/ImageView;II)V
    .locals 2
    .param p3    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/aft;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1, p2, p3}, Lcom/google/android/gms/internal/aft;-><init>(Landroid/widget/ImageView;Landroid/content/Context;II)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public b(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/widget/TextView;Ljava/util/List;)V

    return-void
.end method

.method public b(Landroid/widget/TextView;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TextView;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/afy;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/afy;-><init>(Landroid/widget/TextView;Ljava/util/List;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/framework/d;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/framework/d;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->i()V

    return-void
.end method

.method public b(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic b(Lcom/google/android/gms/cast/framework/j;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Lcom/google/android/gms/cast/framework/d;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/google/android/gms/cast/framework/j;I)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Lcom/google/android/gms/cast/framework/d;I)V

    return-void
.end method

.method public bridge synthetic b(Lcom/google/android/gms/cast/framework/j;Ljava/lang/String;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Lcom/google/android/gms/cast/framework/d;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->c()V

    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/afs;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/a/b;->a:Landroid/app/Activity;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/afs;-><init>(Landroid/view/View;Landroid/app/Activity;)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/agl;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/agl;-><init>(Landroid/view/View;I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/cast/framework/d;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->i()V

    return-void
.end method

.method public bridge synthetic c(Lcom/google/android/gms/cast/framework/j;I)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->c(Lcom/google/android/gms/cast/framework/d;I)V

    return-void
.end method

.method public d()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->j()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->d()V

    :cond_0
    return-void
.end method

.method public d(Landroid/view/View;I)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/agk;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/agk;-><init>(Landroid/view/View;I)V

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/a/b;->b(Landroid/view/View;Lcom/google/android/gms/cast/framework/media/a/a;)V

    return-void
.end method

.method public d(Lcom/google/android/gms/cast/framework/d;I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic d(Lcom/google/android/gms/cast/framework/j;I)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/cast/framework/media/a/b;->d(Lcom/google/android/gms/cast/framework/d;I)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/a/a;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/a/a;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    invoke-interface {v0}, Lcom/google/android/gms/cast/framework/media/c$a;->e()V

    :cond_1
    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->f:Lcom/google/android/gms/cast/framework/media/c;

    return-object v0
.end method

.method public h()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/b;->i()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->b:Lcom/google/android/gms/cast/framework/k;

    const-class v1, Lcom/google/android/gms/cast/framework/d;

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/cast/framework/k;->b(Lcom/google/android/gms/cast/framework/l;Ljava/lang/Class;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/a/b;->e:Lcom/google/android/gms/cast/framework/media/c$a;

    return-void
.end method
