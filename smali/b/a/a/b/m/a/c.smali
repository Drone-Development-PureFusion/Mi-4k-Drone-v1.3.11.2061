.class public final enum Lb/a/a/b/m/a/c;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lb/a/a/b/m/a/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lb/a/a/b/m/a/c;

.field public static final enum b:Lb/a/a/b/m/a/c;

.field public static final enum c:Lb/a/a/b/m/a/c;

.field private static final synthetic d:[Lb/a/a/b/m/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lb/a/a/b/m/a/c;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lb/a/a/b/m/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/m/a/c;->a:Lb/a/a/b/m/a/c;

    new-instance v0, Lb/a/a/b/m/a/c;

    const-string v1, "GZ"

    invoke-direct {v0, v1, v3}, Lb/a/a/b/m/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/m/a/c;->b:Lb/a/a/b/m/a/c;

    new-instance v0, Lb/a/a/b/m/a/c;

    const-string v1, "ZIP"

    invoke-direct {v0, v1, v4}, Lb/a/a/b/m/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/m/a/c;->c:Lb/a/a/b/m/a/c;

    const/4 v0, 0x3

    new-array v0, v0, [Lb/a/a/b/m/a/c;

    sget-object v1, Lb/a/a/b/m/a/c;->a:Lb/a/a/b/m/a/c;

    aput-object v1, v0, v2

    sget-object v1, Lb/a/a/b/m/a/c;->b:Lb/a/a/b/m/a/c;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/a/b/m/a/c;->c:Lb/a/a/b/m/a/c;

    aput-object v1, v0, v4

    sput-object v0, Lb/a/a/b/m/a/c;->d:[Lb/a/a/b/m/a/c;

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

.method public static valueOf(Ljava/lang/String;)Lb/a/a/b/m/a/c;
    .locals 1

    const-class v0, Lb/a/a/b/m/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/a/b/m/a/c;

    return-object v0
.end method

.method public static values()[Lb/a/a/b/m/a/c;
    .locals 1

    sget-object v0, Lb/a/a/b/m/a/c;->d:[Lb/a/a/b/m/a/c;

    invoke-virtual {v0}, [Lb/a/a/b/m/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/a/b/m/a/c;

    return-object v0
.end method
