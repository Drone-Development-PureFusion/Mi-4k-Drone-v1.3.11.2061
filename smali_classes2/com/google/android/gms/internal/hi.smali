.class public Lcom/google/android/gms/internal/hi;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Ljava/lang/Comparable",
        "<TA;>;>",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<TA;>;"
    }
.end annotation


# static fields
.field private static a:Lcom/google/android/gms/internal/hi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/hi;->a:Lcom/google/android/gms/internal/hi;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/google/android/gms/internal/hi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable",
            "<TT;>;>(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/hi",
            "<TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/hi;->a:Lcom/google/android/gms/internal/hi;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;TA;)I"
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/hi;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    return v0
.end method
