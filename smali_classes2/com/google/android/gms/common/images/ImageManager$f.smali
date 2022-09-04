.class final Lcom/google/android/gms/common/images/ImageManager$f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/images/ImageManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/images/ImageManager$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/images/ImageManager$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/images/ImageManager$f;->a:Lcom/google/android/gms/common/images/ImageManager$c;

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->a:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/ImageManager$c;->evictAll()V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 2

    const/16 v0, 0x3c

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->a:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/images/ImageManager$c;->evictAll()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/16 v0, 0x14

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/images/ImageManager$f;->a:Lcom/google/android/gms/common/images/ImageManager$c;

    iget-object v1, p0, Lcom/google/android/gms/common/images/ImageManager$f;->a:Lcom/google/android/gms/common/images/ImageManager$c;

    invoke-virtual {v1}, Lcom/google/android/gms/common/images/ImageManager$c;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/images/ImageManager$c;->trimToSize(I)V

    goto :goto_0
.end method
