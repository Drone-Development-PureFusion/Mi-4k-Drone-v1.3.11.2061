.class public Lcom/google/android/gms/internal/afv;
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

.field private final c:Landroid/view/View$OnClickListener;

.field private final d:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/app/Activity;)V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afv;->a:Landroid/view/View;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afv;->b:Ljava/lang/ref/WeakReference;

    invoke-static {p2}, Lcom/google/android/gms/cast/framework/c;->a(Landroid/content/Context;)Lcom/google/android/gms/cast/framework/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/c;->a()Lcom/google/android/gms/cast/framework/CastOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/afv;->d:Landroid/content/ComponentName;

    new-instance v0, Lcom/google/android/gms/internal/afv$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afv$1;-><init>(Lcom/google/android/gms/internal/afv;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afv;->c:Landroid/view/View$OnClickListener;

    :goto_0
    return-void

    :cond_0
    iput-object v2, p0, Lcom/google/android/gms/internal/afv;->d:Landroid/content/ComponentName;

    iput-object v2, p0, Lcom/google/android/gms/internal/afv;->c:Landroid/view/View$OnClickListener;

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afv;)Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afv;->b:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/afv;)Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afv;->d:Landroid/content/ComponentName;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/cast/framework/d;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/google/android/gms/cast/framework/media/a/a;->a(Lcom/google/android/gms/cast/framework/d;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afv;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/google/android/gms/internal/afv;->c:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afv;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-super {p0}, Lcom/google/android/gms/cast/framework/media/a/a;->b()V

    return-void
.end method
