.class public Lcom/baidu/tts/e/b;
.super Ljava/lang/Thread;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p1, p0, Lcom/baidu/tts/e/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/baidu/tts/e/b;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/e/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/baidu/tts/e/b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/baidu/tts/e/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/baidu/tts/e/b;->a:Landroid/content/Context;

    return-void
.end method
