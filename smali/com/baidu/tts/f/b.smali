.class public abstract enum Lcom/baidu/tts/f/b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/baidu/tts/f/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/baidu/tts/f/b;

.field public static final enum b:Lcom/baidu/tts/f/b;

.field public static final enum c:Lcom/baidu/tts/f/b;

.field private static final synthetic e:[Lcom/baidu/tts/f/b;


# instance fields
.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Lcom/baidu/tts/f/b$1;

    const-string v1, "BV"

    const-string v2, "0"

    invoke-direct {v0, v1, v3, v2}, Lcom/baidu/tts/f/b$1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/baidu/tts/f/b;->a:Lcom/baidu/tts/f/b;

    new-instance v0, Lcom/baidu/tts/f/b$2;

    const-string v1, "AMR"

    const-string v2, "1"

    invoke-direct {v0, v1, v4, v2}, Lcom/baidu/tts/f/b$2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/baidu/tts/f/b;->b:Lcom/baidu/tts/f/b;

    new-instance v0, Lcom/baidu/tts/f/b$3;

    const-string v1, "OPUS"

    const-string v2, "2"

    invoke-direct {v0, v1, v5, v2}, Lcom/baidu/tts/f/b$3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/baidu/tts/f/b;->c:Lcom/baidu/tts/f/b;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/baidu/tts/f/b;

    sget-object v1, Lcom/baidu/tts/f/b;->a:Lcom/baidu/tts/f/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/baidu/tts/f/b;->b:Lcom/baidu/tts/f/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/baidu/tts/f/b;->c:Lcom/baidu/tts/f/b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/baidu/tts/f/b;->e:[Lcom/baidu/tts/f/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/baidu/tts/f/b;->d:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/baidu/tts/f/b$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/baidu/tts/f/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/baidu/tts/f/b;
    .locals 5

    invoke-static {}, Lcom/baidu/tts/f/b;->values()[Lcom/baidu/tts/f/b;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    invoke-virtual {v0}, Lcom/baidu/tts/f/b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :goto_1
    return-object v0

    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/baidu/tts/f/b;
    .locals 1

    const-class v0, Lcom/baidu/tts/f/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/f/b;

    return-object v0
.end method

.method public static values()[Lcom/baidu/tts/f/b;
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/b;->e:[Lcom/baidu/tts/f/b;

    invoke-virtual {v0}, [Lcom/baidu/tts/f/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/baidu/tts/f/b;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/f/b;->d:Ljava/lang/String;

    return-object v0
.end method
