.class final enum Lcom/google/android/gms/internal/im$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/im;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/android/gms/internal/im$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/android/gms/internal/im$b;

.field public static final enum b:Lcom/google/android/gms/internal/im$b;

.field public static final enum c:Lcom/google/android/gms/internal/im$b;

.field public static final enum d:Lcom/google/android/gms/internal/im$b;

.field public static final enum e:Lcom/google/android/gms/internal/im$b;

.field public static final enum f:Lcom/google/android/gms/internal/im$b;

.field private static final synthetic g:[Lcom/google/android/gms/internal/im$b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "INITIALIZING"

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->a:Lcom/google/android/gms/internal/im$b;

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "RUN"

    invoke-direct {v0, v1, v4}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "SENT"

    invoke-direct {v0, v1, v5}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->c:Lcom/google/android/gms/internal/im$b;

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "COMPLETED"

    invoke-direct {v0, v1, v6}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->d:Lcom/google/android/gms/internal/im$b;

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "SENT_NEEDS_ABORT"

    invoke-direct {v0, v1, v7}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->e:Lcom/google/android/gms/internal/im$b;

    new-instance v0, Lcom/google/android/gms/internal/im$b;

    const-string v1, "NEEDS_ABORT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/im$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/im$b;->f:Lcom/google/android/gms/internal/im$b;

    const/4 v0, 0x6

    new-array v0, v0, [Lcom/google/android/gms/internal/im$b;

    sget-object v1, Lcom/google/android/gms/internal/im$b;->a:Lcom/google/android/gms/internal/im$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/android/gms/internal/im$b;->b:Lcom/google/android/gms/internal/im$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/android/gms/internal/im$b;->c:Lcom/google/android/gms/internal/im$b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/android/gms/internal/im$b;->d:Lcom/google/android/gms/internal/im$b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/android/gms/internal/im$b;->e:Lcom/google/android/gms/internal/im$b;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/google/android/gms/internal/im$b;->f:Lcom/google/android/gms/internal/im$b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/android/gms/internal/im$b;->g:[Lcom/google/android/gms/internal/im$b;

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

.method public static values()[Lcom/google/android/gms/internal/im$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/im$b;->g:[Lcom/google/android/gms/internal/im$b;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/im$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/im$b;

    return-object v0
.end method
