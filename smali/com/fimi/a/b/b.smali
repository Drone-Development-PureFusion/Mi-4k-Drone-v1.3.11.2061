.class public final enum Lcom/fimi/a/b/b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fimi/a/b/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/fimi/a/b/b;

.field public static final enum b:Lcom/fimi/a/b/b;

.field private static final synthetic c:[Lcom/fimi/a/b/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/fimi/a/b/b;

    const-string v1, "DRONE"

    invoke-direct {v0, v1, v2}, Lcom/fimi/a/b/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/a/b/b;->a:Lcom/fimi/a/b/b;

    new-instance v0, Lcom/fimi/a/b/b;

    const-string v1, "X1BH"

    invoke-direct {v0, v1, v3}, Lcom/fimi/a/b/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/a/b/b;->b:Lcom/fimi/a/b/b;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/fimi/a/b/b;

    sget-object v1, Lcom/fimi/a/b/b;->a:Lcom/fimi/a/b/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/fimi/a/b/b;->b:Lcom/fimi/a/b/b;

    aput-object v1, v0, v3

    sput-object v0, Lcom/fimi/a/b/b;->c:[Lcom/fimi/a/b/b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/fimi/a/b/b;
    .locals 1

    const-class v0, Lcom/fimi/a/b/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fimi/a/b/b;

    return-object v0
.end method

.method public static values()[Lcom/fimi/a/b/b;
    .locals 1

    sget-object v0, Lcom/fimi/a/b/b;->c:[Lcom/fimi/a/b/b;

    invoke-virtual {v0}, [Lcom/fimi/a/b/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fimi/a/b/b;

    return-object v0
.end method
