.class Lcom/google/android/gms/fitness/data/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/akg;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/akg",
        "<",
        "Lcom/google/android/gms/fitness/data/DataPoint;",
        "Lcom/google/android/gms/fitness/data/DataType;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/fitness/data/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/j;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/j;->a:Lcom/google/android/gms/fitness/data/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;I)D
    .locals 2

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/j;->c(Lcom/google/android/gms/fitness/data/DataPoint;I)D

    move-result-wide v0

    return-wide v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataPoint;Ljava/util/concurrent/TimeUnit;)J
    .locals 4

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataPoint;->c(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataPoint;->b(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/util/concurrent/TimeUnit;)J
    .locals 2

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/j;->a(Lcom/google/android/gms/fitness/data/DataPoint;Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Lcom/google/android/gms/internal/aki;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/aki",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/fitness/data/k;->a:Lcom/google/android/gms/fitness/data/k;

    return-object v0
.end method

.method public synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/j;->b(Lcom/google/android/gms/fitness/data/DataPoint;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataPoint;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->b()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataPoint;I)Z
    .locals 1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataPoint;->a(I)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Value;->a()Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/fitness/data/DataPoint;I)I
    .locals 1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataPoint;->a(I)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Value;->c()I

    move-result v0

    return v0
.end method

.method public synthetic b(Ljava/lang/Object;I)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/j;->b(Lcom/google/android/gms/fitness/data/DataPoint;I)I

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/fitness/data/DataPoint;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->b()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/j;->a(Lcom/google/android/gms/fitness/data/DataPoint;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/fitness/data/DataPoint;I)D
    .locals 2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/fitness/data/DataPoint;->a(I)Lcom/google/android/gms/fitness/data/Value;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Value;->d()F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method public synthetic c(Ljava/lang/Object;I)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/j;->a(Lcom/google/android/gms/fitness/data/DataPoint;I)Z

    move-result v0

    return v0
.end method
