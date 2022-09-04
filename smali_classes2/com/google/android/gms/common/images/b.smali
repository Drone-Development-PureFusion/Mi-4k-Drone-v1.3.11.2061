.class public abstract Lcom/google/android/gms/common/images/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/images/b$a;,
        Lcom/google/android/gms/common/images/b$c;,
        Lcom/google/android/gms/common/images/b$b;
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/common/images/b$a;

.field protected b:I

.field protected c:I

.field protected d:Z

.field private e:Z

.field private f:Z

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;I)V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/common/images/b;->b:I

    iput v0, p0, Lcom/google/android/gms/common/images/b;->c:I

    iput-boolean v0, p0, Lcom/google/android/gms/common/images/b;->d:Z

    iput-boolean v1, p0, Lcom/google/android/gms/common/images/b;->e:Z

    iput-boolean v0, p0, Lcom/google/android/gms/common/images/b;->f:Z

    iput-boolean v1, p0, Lcom/google/android/gms/common/images/b;->g:Z

    new-instance v0, Lcom/google/android/gms/common/images/b$a;

    invoke-direct {v0, p1}, Lcom/google/android/gms/common/images/b$a;-><init>(Landroid/net/Uri;)V

    iput-object v0, p0, Lcom/google/android/gms/common/images/b;->a:Lcom/google/android/gms/common/images/b$a;

    iput p2, p0, Lcom/google/android/gms/common/images/b;->c:I

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/google/android/gms/internal/zzrv;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)Lcom/google/android/gms/internal/aja;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/internal/aja;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/aja;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aja;->b()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :cond_0
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/aja;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/aja;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_1
    move-object p1, v0

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/common/images/b;->c:I

    return-void
.end method

.method a(Landroid/content/Context;Landroid/graphics/Bitmap;Z)V
    .locals 3

    invoke-static {p2}, Lcom/google/android/gms/common/internal/n;->a(Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, p3, v1, v2}, Lcom/google/android/gms/common/images/b;->a(Landroid/graphics/drawable/Drawable;ZZZ)V

    return-void
.end method

.method a(Landroid/content/Context;Lcom/google/android/gms/internal/zzrv;)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/b;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v2, v1, v2}, Lcom/google/android/gms/common/images/b;->a(Landroid/graphics/drawable/Drawable;ZZZ)V

    :cond_0
    return-void
.end method

.method a(Landroid/content/Context;Lcom/google/android/gms/internal/zzrv;Z)V
    .locals 3

    const/4 v2, 0x0

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/common/images/b;->c:I

    if-eqz v1, :cond_0

    iget v0, p0, Lcom/google/android/gms/common/images/b;->c:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/common/images/b;->a(Landroid/content/Context;Lcom/google/android/gms/internal/zzrv;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0, p3, v2, v2}, Lcom/google/android/gms/common/images/b;->a(Landroid/graphics/drawable/Drawable;ZZZ)V

    return-void
.end method

.method protected abstract a(Landroid/graphics/drawable/Drawable;ZZZ)V
.end method

.method protected a(ZZ)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/images/b;->e:Z

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
