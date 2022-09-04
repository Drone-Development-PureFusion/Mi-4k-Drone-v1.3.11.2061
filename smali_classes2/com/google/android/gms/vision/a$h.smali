.class Lcom/google/android/gms/vision/a$h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/images/a;

.field private b:Lcom/google/android/gms/common/images/a;


# direct methods
.method public constructor <init>(Landroid/hardware/Camera$Size;Landroid/hardware/Camera$Size;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/common/images/a;

    iget v1, p1, Landroid/hardware/Camera$Size;->width:I

    iget v2, p1, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/images/a;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a$h;->a:Lcom/google/android/gms/common/images/a;

    if-eqz p2, :cond_0

    new-instance v0, Lcom/google/android/gms/common/images/a;

    iget v1, p2, Landroid/hardware/Camera$Size;->width:I

    iget v2, p2, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/images/a;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/gms/vision/a$h;->b:Lcom/google/android/gms/common/images/a;

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/images/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$h;->a:Lcom/google/android/gms/common/images/a;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/common/images/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/a$h;->b:Lcom/google/android/gms/common/images/a;

    return-object v0
.end method
