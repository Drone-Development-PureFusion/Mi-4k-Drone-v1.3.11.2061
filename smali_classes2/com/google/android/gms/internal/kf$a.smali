.class final enum Lcom/google/android/gms/internal/kf$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/kf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/internal/kf$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/internal/kf$a;

.field public static final enum b:Lcom/google/android/gms/internal/kf$a;

.field private static final synthetic c:[Lcom/google/android/gms/internal/kf$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/kf$a;

    const-string v1, "LEFT"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/kf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    new-instance v0, Lcom/google/android/gms/internal/kf$a;

    const-string v1, "RIGHT"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/kf$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/kf$a;->b:Lcom/google/android/gms/internal/kf$a;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/kf$a;

    sget-object v1, Lcom/google/android/gms/internal/kf$a;->a:Lcom/google/android/gms/internal/kf$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/kf$a;->b:Lcom/google/android/gms/internal/kf$a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/internal/kf$a;->c:[Lcom/google/android/gms/internal/kf$a;

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

.method public static values()[Lcom/google/android/gms/internal/kf$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/kf$a;->c:[Lcom/google/android/gms/internal/kf$a;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/kf$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/kf$a;

    return-object v0
.end method
