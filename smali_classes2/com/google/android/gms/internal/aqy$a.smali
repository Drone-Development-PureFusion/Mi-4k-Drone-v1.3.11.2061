.class Lcom/google/android/gms/internal/aqy$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aqy;->a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/ea",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ed;

.field final synthetic b:Lcom/google/android/gms/internal/apr;

.field final synthetic c:Lcom/google/android/gms/internal/aqy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aqy;Lcom/google/android/gms/internal/ed;Lcom/google/android/gms/internal/apr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/aqy$a;->c:Lcom/google/android/gms/internal/aqy;

    iput-object p2, p0, Lcom/google/android/gms/internal/aqy$a;->a:Lcom/google/android/gms/internal/ed;

    iput-object p3, p0, Lcom/google/android/gms/internal/aqy$a;->b:Lcom/google/android/gms/internal/apr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ea;Lcom/google/android/gms/internal/ea;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ea",
            "<*>;",
            "Lcom/google/android/gms/internal/ea",
            "<*>;)I"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    if-nez p2, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, -0x1

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/aqy$a;->a:Lcom/google/android/gms/internal/ed;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ed;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aqe;

    iget-object v3, p0, Lcom/google/android/gms/internal/aqy$a;->b:Lcom/google/android/gms/internal/apr;

    const/4 v4, 0x2

    new-array v4, v4, [Lcom/google/android/gms/internal/ea;

    aput-object p1, v4, v2

    aput-object p2, v4, v1

    invoke-interface {v0, v3, v4}, Lcom/google/android/gms/internal/aqe;->a_(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ec;

    invoke-static {v1}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    check-cast v0, Lcom/google/android/gms/internal/ec;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ec;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-int v0, v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ea;

    check-cast p2, Lcom/google/android/gms/internal/ea;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/aqy$a;->a(Lcom/google/android/gms/internal/ea;Lcom/google/android/gms/internal/ea;)I

    move-result v0

    return v0
.end method
