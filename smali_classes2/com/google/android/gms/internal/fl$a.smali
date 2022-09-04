.class Lcom/google/android/gms/internal/fl$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/fl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/fo;

.field private static final b:Lcom/google/android/gms/internal/fo;

.field private static final c:Lcom/google/android/gms/internal/fo;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const v4, 0x3ecccccd    # 0.4f

    const v3, 0x3e4ccccd    # 0.2f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    new-instance v0, Lcom/google/android/gms/internal/fo;

    invoke-direct {v0, v1, v1, v3, v2}, Lcom/google/android/gms/internal/fo;-><init>(FFFF)V

    sput-object v0, Lcom/google/android/gms/internal/fl$a;->a:Lcom/google/android/gms/internal/fo;

    new-instance v0, Lcom/google/android/gms/internal/fo;

    invoke-direct {v0, v4, v1, v2, v2}, Lcom/google/android/gms/internal/fo;-><init>(FFFF)V

    sput-object v0, Lcom/google/android/gms/internal/fl$a;->b:Lcom/google/android/gms/internal/fo;

    new-instance v0, Lcom/google/android/gms/internal/fo;

    invoke-direct {v0, v4, v1, v3, v2}, Lcom/google/android/gms/internal/fo;-><init>(FFFF)V

    sput-object v0, Lcom/google/android/gms/internal/fl$a;->c:Lcom/google/android/gms/internal/fo;

    return-void
.end method

.method static synthetic a()Lcom/google/android/gms/internal/fo;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fl$a;->a:Lcom/google/android/gms/internal/fo;

    return-object v0
.end method

.method static synthetic b()Lcom/google/android/gms/internal/fo;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fl$a;->b:Lcom/google/android/gms/internal/fo;

    return-object v0
.end method

.method static synthetic c()Lcom/google/android/gms/internal/fo;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fl$a;->c:Lcom/google/android/gms/internal/fo;

    return-object v0
.end method
