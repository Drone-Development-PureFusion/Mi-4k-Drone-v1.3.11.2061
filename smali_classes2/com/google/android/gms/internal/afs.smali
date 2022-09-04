.class public Lcom/google/android/gms/internal/afs;
.super Lcom/google/android/gms/cast/framework/media/a/a;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    sget v0, Lcom/google/android/gms/R$string;->cast_closed_captions:I

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afs;->c:Ljava/lang/String;

    sget v0, Lcom/google/android/gms/R$string;->cast_closed_captions_unavailable:I

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/afs;->d:Ljava/lang/String;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afs;->b:Ljava/lang/ref/WeakReference;

    new-instance v0, Lcom/google/android/gms/internal/afs$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afs$1;-><init>(Lcom/google/android/gms/internal/afs;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afs;->e:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afs;)Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->b:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method private a(Lcom/google/android/gms/cast/MediaInfo;)Z
    .locals 6

    const/4 v2, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaInfo;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/MediaTrack;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaTrack;->c()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaTrack;->c()I

    move-result v0

    if-ne v0, v2, :cond_3

    :cond_4
    move v0, v2

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/afs;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afs;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afs;->a()Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/afs;->a(Lcom/google/android/gms/cast/MediaInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/afs;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/afs;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/afs;->e:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/afs;->e()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afs;->e()V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afs;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
