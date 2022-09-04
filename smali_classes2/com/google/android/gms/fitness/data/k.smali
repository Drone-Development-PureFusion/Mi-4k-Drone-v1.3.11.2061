.class Lcom/google/android/gms/fitness/data/k;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aki;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/aki",
        "<",
        "Lcom/google/android/gms/fitness/data/DataType;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/fitness/data/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/data/k;

    invoke-direct {v0}, Lcom/google/android/gms/fitness/data/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/fitness/data/k;->a:Lcom/google/android/gms/fitness/data/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/data/Field;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataType;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/fitness/data/Field;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/k;->b(Lcom/google/android/gms/fitness/data/DataType;)I

    move-result v0

    return v0
.end method

.method public synthetic a(Ljava/lang/Object;I)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->c(Lcom/google/android/gms/fitness/data/DataType;I)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataType;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;I)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->d(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Field;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/p;->a(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/fitness/data/DataType;)I
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataType;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/k;->a(Lcom/google/android/gms/fitness/data/DataType;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/fitness/data/DataType;I)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->d(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/fitness/data/Field;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic b(Ljava/lang/Object;I)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->b(Lcom/google/android/gms/fitness/data/DataType;I)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/google/android/gms/fitness/data/DataType;I)I
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->d(Lcom/google/android/gms/fitness/data/DataType;I)Lcom/google/android/gms/fitness/data/Field;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Field;->b()I

    move-result v0

    return v0
.end method

.method public synthetic c(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 1

    check-cast p1, Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/fitness/data/k;->a(Lcom/google/android/gms/fitness/data/DataType;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
