.class public final enum Lcom/google/firebase/database/j$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/database/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/firebase/database/j$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/firebase/database/j$a;

.field public static final enum b:Lcom/google/firebase/database/j$a;

.field public static final enum c:Lcom/google/firebase/database/j$a;

.field public static final enum d:Lcom/google/firebase/database/j$a;

.field public static final enum e:Lcom/google/firebase/database/j$a;

.field private static final synthetic f:[Lcom/google/firebase/database/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/google/firebase/database/j$a;

    const-string v1, "DEBUG"

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/database/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/database/j$a;->a:Lcom/google/firebase/database/j$a;

    new-instance v0, Lcom/google/firebase/database/j$a;

    const-string v1, "INFO"

    invoke-direct {v0, v1, v3}, Lcom/google/firebase/database/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/database/j$a;->b:Lcom/google/firebase/database/j$a;

    new-instance v0, Lcom/google/firebase/database/j$a;

    const-string v1, "WARN"

    invoke-direct {v0, v1, v4}, Lcom/google/firebase/database/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/database/j$a;->c:Lcom/google/firebase/database/j$a;

    new-instance v0, Lcom/google/firebase/database/j$a;

    const-string v1, "ERROR"

    invoke-direct {v0, v1, v5}, Lcom/google/firebase/database/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/database/j$a;->d:Lcom/google/firebase/database/j$a;

    new-instance v0, Lcom/google/firebase/database/j$a;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v6}, Lcom/google/firebase/database/j$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/database/j$a;->e:Lcom/google/firebase/database/j$a;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/firebase/database/j$a;

    sget-object v1, Lcom/google/firebase/database/j$a;->a:Lcom/google/firebase/database/j$a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/firebase/database/j$a;->b:Lcom/google/firebase/database/j$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/firebase/database/j$a;->c:Lcom/google/firebase/database/j$a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/firebase/database/j$a;->d:Lcom/google/firebase/database/j$a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/firebase/database/j$a;->e:Lcom/google/firebase/database/j$a;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/firebase/database/j$a;->f:[Lcom/google/firebase/database/j$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/database/j$a;
    .locals 1

    const-class v0, Lcom/google/firebase/database/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/database/j$a;

    return-object v0
.end method

.method public static values()[Lcom/google/firebase/database/j$a;
    .locals 1

    sget-object v0, Lcom/google/firebase/database/j$a;->f:[Lcom/google/firebase/database/j$a;

    invoke-virtual {v0}, [Lcom/google/firebase/database/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/database/j$a;

    return-object v0
.end method
