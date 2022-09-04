.class Lcom/google/android/gms/internal/wo;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/wo$a;
    }
.end annotation


# instance fields
.field a:Lcom/google/android/gms/ads/internal/client/ag;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field b:Lcom/google/android/gms/ads/internal/client/am;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field c:Lcom/google/android/gms/internal/yy;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field d:Lcom/google/android/gms/internal/ur;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field e:Lcom/google/android/gms/ads/internal/client/af;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field f:Lcom/google/android/gms/ads/internal/reward/client/d;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/google/android/gms/ads/internal/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->a:Lcom/google/android/gms/ads/internal/client/ag;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/wo$a;

    iget-object v1, p0, Lcom/google/android/gms/internal/wo;->a:Lcom/google/android/gms/ads/internal/client/ag;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/wo$a;-><init>(Lcom/google/android/gms/ads/internal/client/ag;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/ag;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->b:Lcom/google/android/gms/ads/internal/client/am;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->b:Lcom/google/android/gms/ads/internal/client/am;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/am;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->c:Lcom/google/android/gms/internal/yy;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->c:Lcom/google/android/gms/internal/yy;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/internal/yy;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->d:Lcom/google/android/gms/internal/ur;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->d:Lcom/google/android/gms/internal/ur;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/internal/ur;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->e:Lcom/google/android/gms/ads/internal/client/af;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->e:Lcom/google/android/gms/ads/internal/client/af;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/client/af;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->f:Lcom/google/android/gms/ads/internal/reward/client/d;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/wo;->f:Lcom/google/android/gms/ads/internal/reward/client/d;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/l;->a(Lcom/google/android/gms/ads/internal/reward/client/d;)V

    :cond_5
    return-void
.end method
