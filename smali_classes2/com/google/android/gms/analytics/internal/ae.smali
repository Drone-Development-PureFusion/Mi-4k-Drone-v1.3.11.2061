.class public final enum Lcom/google/android/gms/analytics/internal/ae;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/analytics/internal/ae;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/analytics/internal/ae;

.field public static final enum b:Lcom/google/android/gms/analytics/internal/ae;

.field private static final synthetic c:[Lcom/google/android/gms/analytics/internal/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/analytics/internal/ae;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/ae;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/internal/ae;->a:Lcom/google/android/gms/analytics/internal/ae;

    new-instance v0, Lcom/google/android/gms/analytics/internal/ae;

    const-string v1, "GZIP"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/analytics/internal/ae;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/analytics/internal/ae;->b:Lcom/google/android/gms/analytics/internal/ae;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/analytics/internal/ae;

    sget-object v1, Lcom/google/android/gms/analytics/internal/ae;->a:Lcom/google/android/gms/analytics/internal/ae;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/analytics/internal/ae;->b:Lcom/google/android/gms/analytics/internal/ae;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/analytics/internal/ae;->c:[Lcom/google/android/gms/analytics/internal/ae;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/analytics/internal/ae;
    .locals 1

    const-string v0, "GZIP"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/analytics/internal/ae;->b:Lcom/google/android/gms/analytics/internal/ae;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/android/gms/analytics/internal/ae;->a:Lcom/google/android/gms/analytics/internal/ae;

    goto :goto_0
.end method

.method public static values()[Lcom/google/android/gms/analytics/internal/ae;
    .locals 1

    sget-object v0, Lcom/google/android/gms/analytics/internal/ae;->c:[Lcom/google/android/gms/analytics/internal/ae;

    invoke-virtual {v0}, [Lcom/google/android/gms/analytics/internal/ae;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/analytics/internal/ae;

    return-object v0
.end method
