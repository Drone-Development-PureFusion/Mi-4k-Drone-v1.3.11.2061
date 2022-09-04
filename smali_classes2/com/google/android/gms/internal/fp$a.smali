.class Lcom/google/android/gms/internal/fp$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:Lcom/google/android/gms/internal/fp$a;

.field b:F

.field c:Landroid/graphics/PointF;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fp$a;FLandroid/graphics/PointF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/fp$a;->a:Lcom/google/android/gms/internal/fp$a;

    iput p2, p0, Lcom/google/android/gms/internal/fp$a;->b:F

    iput-object p3, p0, Lcom/google/android/gms/internal/fp$a;->c:Landroid/graphics/PointF;

    return-void
.end method
