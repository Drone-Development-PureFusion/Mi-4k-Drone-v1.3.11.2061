.class public final enum Lcom/baidu/tts/f/i;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/baidu/tts/f/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/baidu/tts/f/i;

.field public static final enum b:Lcom/baidu/tts/f/i;

.field private static final synthetic c:[Lcom/baidu/tts/f/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/baidu/tts/f/i;

    const-string v1, "SYNTHESIZE"

    invoke-direct {v0, v1, v2}, Lcom/baidu/tts/f/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/baidu/tts/f/i;->a:Lcom/baidu/tts/f/i;

    new-instance v0, Lcom/baidu/tts/f/i;

    const-string v1, "SPEAK"

    invoke-direct {v0, v1, v3}, Lcom/baidu/tts/f/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/baidu/tts/f/i;->b:Lcom/baidu/tts/f/i;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/baidu/tts/f/i;

    sget-object v1, Lcom/baidu/tts/f/i;->a:Lcom/baidu/tts/f/i;

    aput-object v1, v0, v2

    sget-object v1, Lcom/baidu/tts/f/i;->b:Lcom/baidu/tts/f/i;

    aput-object v1, v0, v3

    sput-object v0, Lcom/baidu/tts/f/i;->c:[Lcom/baidu/tts/f/i;

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

.method public static a(Lcom/baidu/tts/f/i;)Z
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/i;->b:Lcom/baidu/tts/f/i;

    invoke-virtual {v0, p0}, Lcom/baidu/tts/f/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/baidu/tts/f/i;
    .locals 1

    const-class v0, Lcom/baidu/tts/f/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/f/i;

    return-object v0
.end method

.method public static values()[Lcom/baidu/tts/f/i;
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/i;->c:[Lcom/baidu/tts/f/i;

    invoke-virtual {v0}, [Lcom/baidu/tts/f/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/baidu/tts/f/i;

    return-object v0
.end method
