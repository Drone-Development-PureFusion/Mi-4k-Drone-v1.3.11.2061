.class public Lcom/fimi/a/d/a;
.super Ljava/lang/Object;


# static fields
.field private static c:Lcom/fimi/a/d/a;


# instance fields
.field a:Lorg/d/c;

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/a/d/a;

    invoke-direct {v0}, Lcom/fimi/a/d/a;-><init>()V

    sput-object v0, Lcom/fimi/a/d/a;->c:Lcom/fimi/a/d/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/a/d/a;->b:Z

    const-string v0, "log_CameraCmdLog"

    invoke-static {v0}, Lorg/d/d;->a(Ljava/lang/String;)Lorg/d/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/a/d/a;->a:Lorg/d/c;

    return-void
.end method

.method public static a()Lcom/fimi/a/d/a;
    .locals 1

    sget-object v0, Lcom/fimi/a/d/a;->c:Lcom/fimi/a/d/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/a/d/a;

    invoke-direct {v0}, Lcom/fimi/a/d/a;-><init>()V

    sput-object v0, Lcom/fimi/a/d/a;->c:Lcom/fimi/a/d/a;

    :cond_0
    sget-object v0, Lcom/fimi/a/d/a;->c:Lcom/fimi/a/d/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/a/d/a;->a:Lorg/d/c;

    invoke-interface {v0, p1}, Lorg/d/c;->i(Ljava/lang/String;)V

    return-void
.end method
