.class public final enum Lb/a/a/b/o/l;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lb/a/a/b/o/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lb/a/a/b/o/l;

.field public static final enum b:Lb/a/a/b/o/l;

.field public static final enum c:Lb/a/a/b/o/l;

.field private static final synthetic d:[Lb/a/a/b/o/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lb/a/a/b/o/l;

    const-string v1, "DENY"

    invoke-direct {v0, v1, v2}, Lb/a/a/b/o/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/o/l;->a:Lb/a/a/b/o/l;

    new-instance v0, Lb/a/a/b/o/l;

    const-string v1, "NEUTRAL"

    invoke-direct {v0, v1, v3}, Lb/a/a/b/o/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/o/l;->b:Lb/a/a/b/o/l;

    new-instance v0, Lb/a/a/b/o/l;

    const-string v1, "ACCEPT"

    invoke-direct {v0, v1, v4}, Lb/a/a/b/o/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/b/o/l;->c:Lb/a/a/b/o/l;

    const/4 v0, 0x3

    new-array v0, v0, [Lb/a/a/b/o/l;

    sget-object v1, Lb/a/a/b/o/l;->a:Lb/a/a/b/o/l;

    aput-object v1, v0, v2

    sget-object v1, Lb/a/a/b/o/l;->b:Lb/a/a/b/o/l;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/a/b/o/l;->c:Lb/a/a/b/o/l;

    aput-object v1, v0, v4

    sput-object v0, Lb/a/a/b/o/l;->d:[Lb/a/a/b/o/l;

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

.method public static valueOf(Ljava/lang/String;)Lb/a/a/b/o/l;
    .locals 1

    const-class v0, Lb/a/a/b/o/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/a/b/o/l;

    return-object v0
.end method

.method public static values()[Lb/a/a/b/o/l;
    .locals 1

    sget-object v0, Lb/a/a/b/o/l;->d:[Lb/a/a/b/o/l;

    invoke-virtual {v0}, [Lb/a/a/b/o/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/a/b/o/l;

    return-object v0
.end method
