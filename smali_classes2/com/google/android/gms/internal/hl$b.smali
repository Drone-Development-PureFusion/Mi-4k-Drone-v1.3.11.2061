.class public final enum Lcom/google/android/gms/internal/hl$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/internal/hl$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/internal/hl$b;

.field public static final enum b:Lcom/google/android/gms/internal/hl$b;

.field private static final synthetic c:[Lcom/google/android/gms/internal/hl$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/hl$b;

    const-string v1, "SERVER_RESET"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hl$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hl$b;->a:Lcom/google/android/gms/internal/hl$b;

    new-instance v0, Lcom/google/android/gms/internal/hl$b;

    const-string v1, "OTHER"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/hl$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hl$b;->b:Lcom/google/android/gms/internal/hl$b;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/hl$b;

    sget-object v1, Lcom/google/android/gms/internal/hl$b;->a:Lcom/google/android/gms/internal/hl$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/hl$b;->b:Lcom/google/android/gms/internal/hl$b;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/internal/hl$b;->c:[Lcom/google/android/gms/internal/hl$b;

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

.method public static values()[Lcom/google/android/gms/internal/hl$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hl$b;->c:[Lcom/google/android/gms/internal/hl$b;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/hl$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/hl$b;

    return-object v0
.end method
