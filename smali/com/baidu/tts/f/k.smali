.class public final enum Lcom/baidu/tts/f/k;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/baidu/tts/f/k;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/baidu/tts/f/k;

.field public static final enum b:Lcom/baidu/tts/f/k;

.field private static final synthetic e:[Lcom/baidu/tts/f/k;


# instance fields
.field private final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    new-instance v0, Lcom/baidu/tts/f/k;

    const-string v1, "HZ8K"

    const/16 v2, 0x1f40

    const-string v3, "8k"

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/baidu/tts/f/k;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/baidu/tts/f/k;->a:Lcom/baidu/tts/f/k;

    new-instance v0, Lcom/baidu/tts/f/k;

    const-string v1, "HZ16K"

    const/16 v2, 0x3e80

    const-string v3, "16k"

    invoke-direct {v0, v1, v5, v2, v3}, Lcom/baidu/tts/f/k;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/baidu/tts/f/k;->b:Lcom/baidu/tts/f/k;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/baidu/tts/f/k;

    sget-object v1, Lcom/baidu/tts/f/k;->a:Lcom/baidu/tts/f/k;

    aput-object v1, v0, v4

    sget-object v1, Lcom/baidu/tts/f/k;->b:Lcom/baidu/tts/f/k;

    aput-object v1, v0, v5

    sput-object v0, Lcom/baidu/tts/f/k;->e:[Lcom/baidu/tts/f/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/baidu/tts/f/k;->c:I

    iput-object p4, p0, Lcom/baidu/tts/f/k;->d:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/baidu/tts/f/k;
    .locals 1

    const-class v0, Lcom/baidu/tts/f/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/f/k;

    return-object v0
.end method

.method public static values()[Lcom/baidu/tts/f/k;
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/k;->e:[Lcom/baidu/tts/f/k;

    invoke-virtual {v0}, [Lcom/baidu/tts/f/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/baidu/tts/f/k;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/baidu/tts/f/k;->c:I

    return v0
.end method
