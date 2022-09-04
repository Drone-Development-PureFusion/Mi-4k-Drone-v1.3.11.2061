.class public final enum Lcom/baidu/tts/f/l;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/baidu/tts/f/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/baidu/tts/f/l;

.field public static final enum b:Lcom/baidu/tts/f/l;

.field public static final enum c:Lcom/baidu/tts/f/l;

.field private static final synthetic f:[Lcom/baidu/tts/f/l;


# instance fields
.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const/4 v13, 0x2

    const/4 v12, 0x1

    const/4 v3, 0x0

    new-instance v1, Lcom/baidu/tts/f/l;

    const-string v2, "DEFAULT"

    const-wide/16 v4, 0x6

    const-wide/16 v6, 0x1770

    invoke-direct/range {v1 .. v7}, Lcom/baidu/tts/f/l;-><init>(Ljava/lang/String;IJJ)V

    sput-object v1, Lcom/baidu/tts/f/l;->a:Lcom/baidu/tts/f/l;

    new-instance v5, Lcom/baidu/tts/f/l;

    const-string v6, "FAST_SWITCH"

    const-wide/16 v8, 0x1

    const-wide/16 v10, 0x4b0

    move v7, v12

    invoke-direct/range {v5 .. v11}, Lcom/baidu/tts/f/l;-><init>(Ljava/lang/String;IJJ)V

    sput-object v5, Lcom/baidu/tts/f/l;->b:Lcom/baidu/tts/f/l;

    new-instance v5, Lcom/baidu/tts/f/l;

    const-string v6, "MIX_ONLINE_REQUEST_TIMEOUT"

    const-wide/16 v8, 0x4

    const-wide/16 v10, 0xfa0

    move v7, v13

    invoke-direct/range {v5 .. v11}, Lcom/baidu/tts/f/l;-><init>(Ljava/lang/String;IJJ)V

    sput-object v5, Lcom/baidu/tts/f/l;->c:Lcom/baidu/tts/f/l;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/baidu/tts/f/l;

    sget-object v1, Lcom/baidu/tts/f/l;->a:Lcom/baidu/tts/f/l;

    aput-object v1, v0, v3

    sget-object v1, Lcom/baidu/tts/f/l;->b:Lcom/baidu/tts/f/l;

    aput-object v1, v0, v12

    sget-object v1, Lcom/baidu/tts/f/l;->c:Lcom/baidu/tts/f/l;

    aput-object v1, v0, v13

    sput-object v0, Lcom/baidu/tts/f/l;->f:[Lcom/baidu/tts/f/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/baidu/tts/f/l;->d:J

    iput-wide p5, p0, Lcom/baidu/tts/f/l;->e:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/baidu/tts/f/l;
    .locals 1

    const-class v0, Lcom/baidu/tts/f/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/baidu/tts/f/l;

    return-object v0
.end method

.method public static values()[Lcom/baidu/tts/f/l;
    .locals 1

    sget-object v0, Lcom/baidu/tts/f/l;->f:[Lcom/baidu/tts/f/l;

    invoke-virtual {v0}, [Lcom/baidu/tts/f/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/baidu/tts/f/l;

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/tts/f/l;->e:J

    return-wide v0
.end method

.method public b()I
    .locals 2

    invoke-virtual {p0}, Lcom/baidu/tts/f/l;->a()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method
