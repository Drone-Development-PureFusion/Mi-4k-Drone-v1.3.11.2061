.class Lcom/baidu/tts/b/a/b/f$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/tts/b/a/b/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field final synthetic c:Lcom/baidu/tts/b/a/b/f;


# direct methods
.method public constructor <init>(Lcom/baidu/tts/b/a/b/f;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/tts/b/a/b/f$c;->c:Lcom/baidu/tts/b/a/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/baidu/tts/tools/CommonUtility;->generateSerialNumber()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/baidu/tts/b/a/b/f$c;->a:Ljava/lang/String;

    return-void
.end method
