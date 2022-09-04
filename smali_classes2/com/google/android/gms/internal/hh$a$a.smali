.class Lcom/google/android/gms/internal/hh$a$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hh$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lcom/google/android/gms/internal/hh$a$b;",
        ">;"
    }
.end annotation


# instance fields
.field private a:J

.field private final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 8

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v0, p1, 0x1

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v1, v2

    iput v1, p0, Lcom/google/android/gms/internal/hh$a$a;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/hh$a$a;->b:I

    int-to-double v2, v1

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-long v2, v2

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    int-to-long v0, v0

    and-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/hh$a$a;->a:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hh$a$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/hh$a$a;->b:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/hh$a$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/hh$a$a;->a:J

    return-wide v0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/hh$a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/hh$a$a$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hh$a$a$1;-><init>(Lcom/google/android/gms/internal/hh$a$a;)V

    return-object v0
.end method
