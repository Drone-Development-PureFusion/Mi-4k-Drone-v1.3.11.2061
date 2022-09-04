.class final enum Lcom/google/android/gms/internal/hs$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/internal/hs$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/internal/hs$b;

.field public static final enum b:Lcom/google/android/gms/internal/hs$b;

.field public static final enum c:Lcom/google/android/gms/internal/hs$b;

.field public static final enum d:Lcom/google/android/gms/internal/hs$b;

.field public static final enum e:Lcom/google/android/gms/internal/hs$b;

.field private static final synthetic f:[Lcom/google/android/gms/internal/hs$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/android/gms/internal/hs$b;

    const-string v1, "Disconnected"

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hs$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    new-instance v0, Lcom/google/android/gms/internal/hs$b;

    const-string v1, "GettingToken"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/hs$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->b:Lcom/google/android/gms/internal/hs$b;

    new-instance v0, Lcom/google/android/gms/internal/hs$b;

    const-string v1, "Connecting"

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/hs$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->c:Lcom/google/android/gms/internal/hs$b;

    new-instance v0, Lcom/google/android/gms/internal/hs$b;

    const-string v1, "Authenticating"

    invoke-direct {v0, v1, v5}, Lcom/google/android/gms/internal/hs$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->d:Lcom/google/android/gms/internal/hs$b;

    new-instance v0, Lcom/google/android/gms/internal/hs$b;

    const-string v1, "Connected"

    invoke-direct {v0, v1, v6}, Lcom/google/android/gms/internal/hs$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/android/gms/internal/hs$b;

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->a:Lcom/google/android/gms/internal/hs$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->b:Lcom/google/android/gms/internal/hs$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->c:Lcom/google/android/gms/internal/hs$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->d:Lcom/google/android/gms/internal/hs$b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/android/gms/internal/hs$b;->e:Lcom/google/android/gms/internal/hs$b;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/android/gms/internal/hs$b;->f:[Lcom/google/android/gms/internal/hs$b;

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

.method public static values()[Lcom/google/android/gms/internal/hs$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/hs$b;->f:[Lcom/google/android/gms/internal/hs$b;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/hs$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/hs$b;

    return-object v0
.end method
